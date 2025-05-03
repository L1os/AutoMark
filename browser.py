import webbrowser, time, http.client

def is_server_ready():
    try:
        conn = http.client.HTTPConnection("localhost", 5000, timeout=2)
        conn.request("HEAD", "/")
        response = conn.getresponse()
        conn.close()
        return response.status == 200
    except Exception as e:
        return False

while not is_server_ready():
    print("Waiting for server to start...")
    time.sleep(1)

webbrowser.open("http://localhost:5000")
