// const fs = require('fs').promises;
const fs = require('fs/promises');

// fs.readdir('./')
//   .then((files) => {
//     console.log(files);
//   })
//   .catch((err) => {
//     console.error(err);
//   });

async function readDir() {
  try {
    const filse = await fs.readdir('./');
    console.log(filse);
  } catch (err) {
    console.error(err);
  }
}

readDir();
