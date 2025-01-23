from addition import add

def test_add():
    assert add(1, 2) == 3
    assert add(-1, 1) == 0
    assert add(0, 0) == 0
    assert add(100, 200) == 300
def test_add_floats():
    assert add(1.5, 2.5) == 4.0
    assert add(-1.5, 1.5) == 0.0
    assert add(0.1, 0.2) == 0.3
def test_add_large_numbers():
    assert add(1000000000, 2000000000) == 3000000000
