import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import AppBar from 'material-ui/AppBar';
import RaisedButton from 'material-ui/RaisedButton';
import TextField from 'material-ui/TextField';
import {Component} from "react/cjs/react.production.min";
import axios from "axios";
import UploadScreen from "./UploadScreen";


class Login extends Component {
    constructor(props) {
        super(props);
        this.state = {
            username: '',
            email: ''
        }
    }

    render() {
        return (
            <div>
                <MuiThemeProvider>
                    <div>
                        <AppBar
                            title="Login"
                        />
                        <TextField
                            hintText="Enter your Username"
                            floatingLabelText="Username"
                            onChange={(event, newValue) => this.setState({username: newValue})}
                        />
                        <br/>
                        <TextField
                            type="e-mail"
                            hintText="Enter your E-mail"
                            floatingLabelText="E-mail"
                            onChange={(event, newValue) => this.setState({email: newValue})}
                        />
                        <br/>
                        <RaisedButton label="Submit" primary={true} style={style}
                                      onClick={(event) => handleClick()}/>
                    </div>
                </MuiThemeProvider>
            </div>
        );
    }
}

function handleClick(event) {
    let apiBaseUrl = "http://localhost:4000/api/";
    let self = this;
    let payload={
        "username":this.state.username,
        "email":this.state.email
    }
    axios.post(apiBaseUrl+'login', payload)
        .then(function (response) {
            console.log(response);
            if(response.data.code === 200){
                console.log("Login successful");
                let uploadScreen=[];
                uploadScreen.push(<UploadScreen appContext={self.props.appContext}/>)
                self.props.appContext.setState({loginPage:[],uploadScreen:uploadScreen})
            }
            else if(response.data.code === 204){
                console.log("Username or email do not match");
                alert("username or email do not match")
            }
            else{
                console.log("Username does not exists");
                alert("Username does not exist");
            }
        })
        .catch(function (error) {
            console.log(error);
        });
}

const style = {
    margin: 15,
};
export default Login;