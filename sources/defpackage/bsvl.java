package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsvl extends dtrr {
    public String a;
    public String b;

    public bsvl() {
        super(bswf.a().P());
    }

    public final bsvj a() {
        bsvk bsvkVar = new bsvk();
        bsvkVar.aC(aB());
        bsvkVar.a = this.a;
        bsvkVar.b = this.b;
        bsvkVar.cK = aC();
        return bsvkVar;
    }

    public final void b(String str) {
        aE(0);
        this.a = str;
    }

    public final void c(String str) {
        aE(1);
        this.b = str;
    }
}
