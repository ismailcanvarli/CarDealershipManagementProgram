package mesmotors;

/**
 * CustormerQueue sinifi kuyruk yapisina örnektir.
 * Node´lar ile olusturulmustur.Node´larin datasi obje tutacak sekilde dizayn
 * edilmistir.
 * Bu kisimda Customer nesnesi tutmasi icin typecast yapilmistir.Bu sayede
 * Node´larin datasi Customer nesnesidir.
 */
class CustomerQueue {
    Node front, rear;

    public CustomerQueue() {
        this.front = this.rear = null;
    }

    /**
     * @param key
     *            Kuyruga eklenecek Customer nesnesini parametre alir.
     */

    void addCustomer(Customer key) {

        // Kontrol node´u olusturulur.
        Node temp = new Node();
        temp.data = key;

        // Eger kuyruk bos ise Node hem rear hem front olur.
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Yeni node kuyrugun sonune eklenir ve rear degistirilir.
        this.rear.next = temp;
        this.rear = temp;
    }

    // Kuyruktan müsteri silmek icindir.Kuyruk mantigina göre de en öndeki müsteri
    // silinir.
    void removeCustomer() {
        // Kuyruk bos ise null döndürülür cünkü silme islemi yapilamaz.
        if (this.front == null)
            return;

        // Front fronttan bir sonrakine tasinir.
        Node temp = this.front;
        this.front = this.front.next;

        // Front null olursa rear da null yapilir .Cünkü kuyrukta eleman kalmamistir.
        if (this.front == null)
            this.rear = null;
    }
}