import { contextBridge, ipcRenderer } from 'electron';

contextBridge.exposeInMainWorld('api', {

  parseMarkdown: (text) => ipcRenderer.invoke('parse-markdown', text)
});