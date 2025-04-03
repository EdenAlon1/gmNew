package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwsw extends dtrr {
    public String a;
    public String b;
    public String c;
    public String d;

    public bwsw() {
        super(bwty.a().P());
    }

    public final bwsu a() {
        bwsv bwsvVar = new bwsv();
        bwsvVar.aC(aB());
        bwsvVar.a = this.a;
        bwsvVar.b = this.b;
        bwsvVar.c = this.c;
        bwsvVar.d = this.d;
        bwsvVar.cK = aC();
        return bwsvVar;
    }

    public final void b(String str) {
        aE(0);
        this.a = str;
    }

    public final void c(String str) {
        aE(3);
        this.d = str;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }
}
