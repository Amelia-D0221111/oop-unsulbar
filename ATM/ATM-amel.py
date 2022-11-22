# Nama: Amelia
# NIM: D0221111
# Kelas: Informatika H
pin = 2805
saldo = 1000000

input_pin = int(input("Masukkan Pin: "))

while input_pin == pin :
    print('''1. Cek saldo
2. Tarik tunai
3. Setor tunai
4. Transfer
5. Berhenti''')

    input_perintah = int(input("Masukkan Perintah: "))

    if input_perintah == 1:
        print("Saldo: Rp"+str(saldo))
    elif input_perintah == 2:
        tarik = int(input("Masukkan Jumlah yang ditarik: Rp"))

        if tarik > saldo:
            print("Saldo tidak cukup")
        else:
            print("Rp"+str(tarik)+" ditarik")
            saldo -= tarik
    elif input_perintah == 3:
        setor = int(input("Masukkan Jumlah yang disetor: Rp"))

        print("Rp"+str(setor)+" disetor")
        saldo += setor
    elif input_perintah == 4:
        rek_tujuan = int(input("Masukkan no rekening tujuan: "))
        jumlah_transfer = int(input("Masukkan Jumlah transfer: Rp"))

        if jumlah_transfer > saldo:
            print("Saldo tidak cukup")
        else:
            print("Rp"+str(jumlah_transfer)+" ditransfer ke "+str(rek_tujuan))
            saldo -= jumlah_transfer
    elif input_perintah == 5:
        break
else:
    print("Pin salah, program berhenti")

    
