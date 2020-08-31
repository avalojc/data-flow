import axios from 'axios'

const ITEM_API_URL = 'http://localhost:8080/item'


class ItemDataService {

    retrieveAllItems() {
        return axios.get(`${ITEM_API_URL}/`);
    }

    retrieveItemById(id) {
        return axios.get(`${ITEM_API_URL}/${id}`);
    }

}

export default new ItemDataService()