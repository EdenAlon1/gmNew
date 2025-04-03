package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxyb extends dtrr {
    public String a;
    public String b;
    public String c;

    public bxyb() {
        super(bxyw.a().P());
    }

    public final bxxz a() {
        bxya bxyaVar = new bxya();
        bxyaVar.aC(aB());
        bxyaVar.a = this.a;
        bxyaVar.b = this.b;
        bxyaVar.c = this.c;
        bxyaVar.cK = aC();
        return bxyaVar;
    }

    public final void b(String str) {
        aE(1);
        this.b = str;
    }

    public final void c(String str) {
        aE(2);
        this.c = str;
    }

    public final void d(String str) {
        aE(0);
        this.a = str;
    }
}
