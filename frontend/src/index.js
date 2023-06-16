import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import { HashRouter } from 'react-router-dom';
import * as serviceWorker from './serviceWorker';
import App from './containers/App';
import { Provider } from 'react-redux';
import { createStore } from 'redux';
import authReducer from './redux/authReducer';

const store = createStore(authReducer);

ReactDOM.render(
  <Provider store={store}>
    <HashRouter>
      <App />
    </HashRouter>
  </Provider>,
  document.getElementById('root')
);


serviceWorker.unregister();