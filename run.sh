#!/bin/bash

docker start automark-1.0.0

python3 browser.py || python browser.py
