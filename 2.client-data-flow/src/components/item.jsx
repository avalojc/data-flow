import React, { Component } from 'react';
import ItemDataService from '../service/ItemDataService'

class AllItems extends Component {
    constructor(props) {
        super(props)
            this.state = {
                AllItems: []
            }
        this.refreshItems = this.refreshItems.bind(this)
    }
    componentDidMount(){
        this.refreshItems();
    }
    refreshItems(){
        ItemDataService.retrieveAllitems()
        .then(
            response => {
                this.setState({AllItems: response.data})
            }
        )
    }
    render(){
        const allItems = this.state.AllItems.map((item)=>
            <div key={item.id}>
                {item.data}
            </div>
        )
        return(
            <div>
                Hello World
                {allItems}
            </div>
        )
    }

}

export default AllItems