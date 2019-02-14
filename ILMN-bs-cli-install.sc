## BaseSpace Sequence Hub CLI
#cd $HOME/source
### backup 
#wget "https://api.bintray.com/content/basespace/BaseSpaceCLI-EarlyAccess-BIN/latest/\$latest/amd64-linux/bs?bt_package=latest" -O $HOME/source/bs
### General installation
#mkdir -p $HOME/bin
#wget "https://api.bintray.com/content/basespace/BaseSpaceCLI-EarlyAccess-BIN/latest/\$latest/amd64-linux/bs?bt_package=latest" -O $HOME/bin/bs
#chmod u+x $HOME/bin/bs
#
## bscp
### backup
#wget https://api.bintray.com/content/basespace/BaseSpace-Copy-BIN/\$latest/linux/bscp?bt_package=develop -O $HOME/source/bs-cp 
### General installation
#wget https://api.bintray.com/content/basespace/BaseSpace-Copy-BIN/\$latest/linux/bscp?bt_package=develop -O $HOME/bin/bs-cp 
#chmod u+x $HOME/bin/bs-cp

# basemount
sudo apt install -y curl
sudo bash -c "$(curl -L https://basemount.basespace.illumina.com/install)"
