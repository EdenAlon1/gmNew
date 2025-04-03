package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwoz extends dtrr {
    public String a;
    public String b;
    public axuf c;
    public String d;
    public String e;
    public String f;

    public bwoz() {
        super(bwqg.e());
    }

    public final bwox a() {
        bwoy bwoyVar = new bwoy();
        bwoyVar.aC(aB());
        bwoyVar.a = this.a;
        bwoyVar.b = this.b;
        bwoyVar.c = this.c;
        bwoyVar.d = this.d;
        bwoyVar.e = this.e;
        bwoyVar.f = this.f;
        bwoyVar.cK = aC();
        return bwoyVar;
    }

    public final void b(String str) {
        aE(3);
        this.d = str;
    }

    public final void c(String str) {
        aE(5);
        this.f = str;
    }

    public final void d(String str) {
        int i = this.aB;
        if (i < 51020) {
            dtub.w("rbm_bot_id", i);
        }
        aE(1);
        this.b = str;
    }

    public final void e(String str) {
        aE(4);
        this.e = str;
    }

    public final void f(axuf axufVar) {
        aE(2);
        this.c = axufVar;
    }
}
