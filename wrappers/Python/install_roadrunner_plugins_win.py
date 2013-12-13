""" 
Usage:
   python install_roadrunner.py

   This file will install all the relevant roadRunner files 
   so that roadrunner can be used from Python
"""

import site
import shutil
import os.path
import os
import sys

def rmroadrunner(path):
	print('deleting roadrunner from ' + path)
	
	try:
		os.remove(os.path.join(path, 'roadrunner.py'))
	except:
		pass
	
	try:
		os.remove(os.path.join(path, 'roadrunner.pyc'))
	except:
		pass
	
	try:
		os.remove(os.path.join(path, '_roadrunner.pyd'))
	except:
		pass
	
	try:
		os.remove(os.path.join(path, '_roadrunner.so'))
	except:
		pass
	
	shutil.rmtree(os.path.join(path, 'roadrunner'), ignore_errors=True)

splist = site.getsitepackages()
sp = ''
	
	
for s in splist:
	rmroadrunner(s)
	if s.find('site-packages') > 0:
		sp = s
		
print('installing roadrunner to site packages dir: ' + sp)

dst = os.path.join(sp, 'roadrunner')

src = os.path.abspath(os.path.join('site-packages', 'roadrunner'))

print('src directory is :' + src)

print("destination directory is: " + dst)

shutil.copytree(src, dst)

# Find the src root path
pluginsrc = os.path.split(src)[0]
pluginsrc = os.path.split(pluginsrc)[0]

# Find the dest root path
plugindst = os.path.split(dst)[0]
plugindst = os.path.split(plugindst)[0]

sys.path.append (plugindst + '\\roadrunner\\python')

# Copy rrPlugins.py and rrPython.py
shutil.copyfile (pluginsrc + '\\plugins\\python\\rrPlugins.py', plugindst + '\\roadrunner\\python\\rrPlugins.py')
shutil.copyfile (pluginsrc + '\\c_api_python\\rrPython.py', plugindst + '\\roadrunner\\python\\rrPython.py')





