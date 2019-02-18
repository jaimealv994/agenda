import React, {Component} from 'react';
import Grid from '@material-ui/core/Grid';
import TextField from '@material-ui/core/TextField'

class ContactForm extends Component {
    render() {
        return (
            <Grid container>
                <Grid item>
                    <TextField label="Nombre"/>
                </Grid>
                <Grid item>
                    <TextField label="Apellido"/>
                </Grid>
                <Grid item>
                    <TextField label="Teléfono"/>
                </Grid>
            </Grid>
        )
    }
}


export default ContactForm;