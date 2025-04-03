package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqvl extends dtrr {
    public int a;
    public byte[] b;
    public int c;
    public String d;
    public String e;

    public bqvl() {
        super(bqws.e());
        this.a = 0;
        this.c = 0;
    }

    public final bqvj a() {
        bqvk bqvkVar = new bqvk();
        bqvkVar.aC(aB());
        bqvkVar.a = this.a;
        bqvkVar.b = this.b;
        bqvkVar.c = this.c;
        bqvkVar.d = this.d;
        bqvkVar.e = this.e;
        bqvkVar.cK = aC();
        return bqvkVar;
    }

    public final void b(String str) {
        int i = this.aB;
        if (i < 42060) {
            dtub.w("cms_correlation_id", i);
        }
        aE(3);
        this.d = str;
    }

    public final void c(String str) {
        int i = this.aB;
        if (i < 35020) {
            dtub.w("cms_id", i);
        }
        aE(4);
        this.e = str;
    }

    public final void d(byte[] bArr) {
        aE(1);
        this.b = bArr;
    }

    public final void e(int i) {
        aE(0);
        this.a = i;
    }

    public final void f(int i) {
        aE(2);
        this.c = i;
    }
}
