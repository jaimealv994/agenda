import React from 'react'
import List from '@material-ui/core/List';
import Paper from '@material-ui/core/Paper'
import ContactListItem from './Item'

const contacts = [
    {id: 1, nombre: "Zoyla", apellido: "Collado"},
    {id: 2, nombre: "Pepito", apellido: "Collado"},
    {id: 3, nombre: "Noneco", apellido: "Collado"},
];


const ContactList = () => {
    return (
        <Paper>
            <List>
                {
                    contacts.map(contact => (
                        <ContactListItem contact={contact} />
                    ))
                }
            </List>
        </Paper>

    )
};

export default ContactList;