from flask import Flask, render_template, request
app = Flask(__name__)

@app.route("/")
def index():
   return render_template("index.html")

@app.route("/contacts")
def contacts_pg():
   return render_template("contacts.html")

@app.route("/settings")
def settings_pg():
   return render_template("settings.html")

@app.route('/contacts',methods = ['POST'])
def display_contacts():
   if request.method == 'POST':
      result = request.form
      c1l = result["c1l"]
      c1n = result["c1n"]
      c2l = result ["c2l"]
      c2n = result["c2n"]
      c3l = result["c3l"]
      c3n = result["c3n"]
      return(result)
   return render_template("contacts.html", name1 =c1l, num1 =c1n, name2=c2l, num2=c2n, name3=c3l, num3=c3n)
