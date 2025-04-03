package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azhx extends dtrr {
    public azcr a;
    public azhr b;
    public String c;
    public String d;
    public String e;
    public azfm f;
    public byte[] g;
    public cknh h;
    public Instant i;

    public azhx() {
        super(azjm.a().P());
        this.a = null;
        this.f = azfm.a;
        this.h = new cknh(0L);
        this.i = bdgw.b(0L);
    }

    public final azhv a() {
        azhw azhwVar = new azhw();
        azhwVar.aC(aB());
        azhwVar.a = this.a;
        azhwVar.b = this.b;
        azhwVar.c = this.c;
        azhwVar.d = this.d;
        azhwVar.e = this.e;
        azhwVar.f = this.f;
        azhwVar.g = this.g;
        azhwVar.h = this.h;
        azhwVar.i = this.i;
        azhwVar.cK = aC();
        return azhwVar;
    }

    public final void b(azhr azhrVar) {
        aE(1);
        this.b = azhrVar;
    }

    public final void c(String str) {
        aE(3);
        this.d = str;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }

    public final void e(cknh cknhVar) {
        aE(7);
        this.h = cknhVar;
    }

    public final void f(Instant instant) {
        aE(8);
        this.i = instant;
    }

    public final void g(azfm azfmVar) {
        aE(5);
        this.f = azfmVar;
    }

    public final void h(String str) {
        aE(4);
        this.e = str;
    }

    public final void i(byte[] bArr) {
        aE(6);
        this.g = bArr;
    }

    public final void j(azcr azcrVar) {
        aE(0);
        this.a = azcrVar;
    }
}
