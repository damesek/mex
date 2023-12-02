## MEX 
#### RUN EMACS on MAC OSX  
A wrapper for OSX/Emacs that operates smoothly with the selected version and provides fixed access to the keyboard. (Main goal: use like on linux distros.)


This solution use Brew and Babashka library. 


#### Todo: 
- add your: init.el to ~/.emacs.d folder
- add an example init.el for this project


---

#### Install packages:

```bash 
brew install borkdude/brew/babashka
# brew upgrade babashka
brew install babashka/brew/bbin 
```

Install emacs:
```bash
brew tap d12frosted/emacs-plus
brew install emacs-plus@29
```
You are done.

---

Clone this repository:

```bash 
git clone github.com/damasek/mex
bbin install emacsx.clj --as mex  
```

add bbin path to shell configuration file (bash or zsh):

#### add to bash configuration
(open, add-save and source)

```bash
open -e ~/.bash_profile
export PATH="$HOME/.local/bin:$PATH"
# save and source
source ~/.bash_profile
```


#### add to zsh configuration
(open, add-save and source)

```bash
open -e ~/.zshrc 
export PATH="$HOME/.local/bin:$PATH"
# save and source
source ~/.zshrc

```

### RUN MEX

```bash
mex
```

When you run the command, the terminal will display the message ********** Starting Emacs on OSX ************ and then it will launch the Emacs.app











