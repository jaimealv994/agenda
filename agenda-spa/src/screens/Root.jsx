import React from 'react';
import {Route, Switch, BrowserRouter} from 'react-router-dom';
import HomeScreen from './Home';
import  CreateContactScreen from './contacto/crear'

const RootScreen = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route exact path="/" component={HomeScreen}/>
                <Route path="/contacto/crear" component={CreateContactScreen}/>
            </Switch>
        </BrowserRouter>
    )
};


export default RootScreen;
