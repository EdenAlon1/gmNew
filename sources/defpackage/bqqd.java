package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqqd extends dtrr {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;

    public bqqd() {
        super(bqrp.e());
        this.g = 0L;
        this.h = 0L;
    }

    public final bqqb a() {
        bqqc bqqcVar = new bqqc();
        bqqcVar.aC(aB());
        bqqcVar.a = this.a;
        bqqcVar.b = this.b;
        bqqcVar.c = this.c;
        bqqcVar.d = this.d;
        bqqcVar.e = this.e;
        bqqcVar.f = this.f;
        bqqcVar.g = this.g;
        bqqcVar.h = this.h;
        bqqcVar.cK = aC();
        return bqqcVar;
    }

    public final void b(String str) {
        aE(2);
        this.c = str;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }

    public final void d(long j) {
        aE(1);
        this.b = j;
    }

    public final void e(String str) {
        aE(5);
        this.f = str;
    }

    public final void f(String str) {
        aE(3);
        this.d = str;
    }

    public final void g(long j) {
        int i = this.aB;
        if (i < 46040) {
            dtub.w("message_received_timestamp", i);
        }
        aE(7);
        this.h = j;
    }

    public final void h(long j) {
        aE(6);
        this.g = j;
    }

    public final void i(String str) {
        aE(4);
        this.e = str;
    }
}
