import React from 'react';
import ListItem from '@material-ui/core/ListItem';
import ListItemText from '@material-ui/core/ListItemText';


const ContactListItem = (props) => {
    return (
        <ListItem button>
            <ListItemText primary={props.contact.nombre}/>
        </ListItem>
    )
};

export default ContactListItem;