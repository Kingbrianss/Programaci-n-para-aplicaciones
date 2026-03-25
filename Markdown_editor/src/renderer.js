
import './index.css';

const textarea = document.getElementById('editor');
const preview = document.getElementById('preview');


textarea.addEventListener('input', async (e) => {
  const markdownText = e.target.value;

  try {
   
    const html = await window.api.parseMarkdown(markdownText);
    
  
    preview.innerHTML = html;
  } catch (error) {
    console.error("Error al convertir Markdown:", error);
    preview.innerHTML = "<p style='color:red'>Error al procesar el Markdown.</p>";
  }
});