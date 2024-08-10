const mongoose = require('mongoose');

const stationSchema = new mongoose.Schema({
  station_id: String,
  station_name: String,
  department: String,
  details: String
}, { collection: 'station' });

module.exports = mongoose.model('Station', stationSchema);