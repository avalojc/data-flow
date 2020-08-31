import React, { Component } from 'react';
import ItemDataService from '../service/ItemDataService'
import './item.css'

class AllItems extends Component {
    constructor(props) {
        super(props)
            this.state = {
                AllItems: [],
                trueFalse: false,
                number: 500,
                url: ""
            }
        this.refreshItems = this.refreshItems.bind(this)
    }
    componentDidMount(){
        this.refreshItems();
    }
    refreshItems(){
        ItemDataService.retrieveAllItems()
        .then(
            response => {
                this.setState({
                    AllItems: response.data,
                    trueFalse: response.data[3].data,
                    number: response.data[2].data,
                    url: response.data[1].data
                })
            }
        )
        // ItemDataService.retrieveItemById(3)
        // .then(
        //     response => {
        //         this.setState({
        //             number: response.data
        //         })
        //     }
        // )
    }
    render(){
        const allItems = this.state.AllItems.map((item)=>
            <div key={item.id}>
                {item.data}
            </div>
        )
        return(
            <div>
                <h1>Hello World</h1>
                {allItems}
                <img src={this.state.url} alt="linked image" className="unsplashimage"/>
            </div>
        )
    }

}

export default AllItems