<!DOCTYPE html>
<html>

<head>
    <title>Tambah Pesan</title>
</head>

<body>
    <h1>Tambah Pesan</h1>
    <form action="simpanPesan.php" method="POST">
        <label for="idPenerima">ID Penerima:</label><br>
        <input type="text" id="idPenerima" name="idPenerima" placeholder="Masukkan ID Penerima" required><br><br>

        <label for="judul">Judul:</label><br>
        <input type="text" id="judul" name="judul" placeholder="Masukkan Judul Pesan" required><br><br>

        <label for="TextPesan">Isi Pesan:</label><br>
        <textarea id="TextPesan" name="TextPesan" placeholder="Tulis pesan Anda di sini..." rows="5" required></textarea><br><br>

        <input type="submit" value="Kirim Pesan">
    </form>
</body>

</html>