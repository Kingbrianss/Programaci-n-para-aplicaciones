const { app, BrowserWindow } = require('electron');
const path = require('path');

function createWindow() {
  const win = new BrowserWindow({
    width: 800,
    height: 700,
    backgroundColor: '#f0f2f5', 
    webPreferences: {
      nodeIntegration: true,
      contextIsolation: false
    }
  });


  win.loadFile(path.join(__dirname, 'index.html'));

 
  win.webContents.on('did-fail-load', () => {
    win.loadFile(path.join(__dirname, 'index.html'));
  });
}

app.whenReady().then(createWindow);

app.on('window-all-closed', () => {
  if (process.platform !== 'darwin') app.quit();
});