#!/bin/sh

# ======================================================================================
GITHUB=chupachuck
WS_DIR=Test_QA
REPO=HW_28
VERSION=1.0
MAIN_CLASS=core.Input_From_Internal_CSV_File
# ======================================================================================

if ! which java >/dev/null 2>&1; then echo Java not installed; return; fi
if ! which mvn >/dev/null 2>&1; then echo Maven not installed; return; fi
if ! which git >/dev/null 2>&1; then echo Git not installed; return; fi

if [ -d "$HOME/$WS_DIR" ]; then cd ~/$WS_DIR; else echo $WS_DIR is not exist; return; fi
if [ -d "$HOME/$WS_DIR/$REPO" ]; then rm -rf $HOME/$WS_DIR/$REPO; fi

git clone https://github.com/$GITHUB/$REPO.git
cd ./$REPO

mvn package
echo "Executing Java program ....................................."
java -cp $HOME/$WS_DIR/$REPO/target/$REPO-$VERSION.jar $MAIN_CLASS
