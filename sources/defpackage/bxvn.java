package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxvn extends dtrr {
    public long a;
    public String b;
    public String c;
    public byte[] d;
    public long e;

    public bxvn() {
        super(bxws.b());
        this.e = 0L;
    }

    public final bxvl a() {
        bxvm bxvmVar = new bxvm();
        bxvmVar.aC(aB());
        bxvmVar.a = this.a;
        bxvmVar.b = this.b;
        bxvmVar.c = this.c;
        bxvmVar.d = this.d;
        bxvmVar.e = this.e;
        bxvmVar.cK = aC();
        return bxvmVar;
    }

    public final void b(byte[] bArr) {
        aE(3);
        this.d = bArr;
    }

    public final void c(String str) {
        aE(1);
        this.b = str;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }
}
