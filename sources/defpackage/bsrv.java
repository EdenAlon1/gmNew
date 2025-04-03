package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsrv extends dtrr {
    public long a;
    public String b;
    public long c;
    public long d;
    public long e;
    public String f;
    public boolean g;
    public byte[] h;
    public String i;
    public String j;
    public int k;
    public byte[] l;
    public byte[] m;
    public byzk n;
    public boolean o;
    public String p;
    public boolean q;
    public byyv r;
    public byzd s;
    public byte[] t;
    public String u;
    public long v;
    public long w;

    public bsrv() {
        super(bsve.e());
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = "";
        this.g = false;
        this.i = "";
        this.j = "";
        this.k = 0;
        this.o = false;
        this.p = "";
        this.q = false;
        this.r = byyv.WEB;
        this.s = byzd.ANONYMOUS;
        this.v = 0L;
        this.w = 0L;
    }

    public final bsrt a() {
        bsru bsruVar = new bsru();
        bsruVar.aC(aB());
        bsruVar.a = this.a;
        bsruVar.b = this.b;
        bsruVar.c = this.c;
        bsruVar.d = this.d;
        bsruVar.e = this.e;
        bsruVar.f = this.f;
        bsruVar.g = this.g;
        bsruVar.h = this.h;
        bsruVar.i = this.i;
        bsruVar.j = this.j;
        bsruVar.k = this.k;
        bsruVar.l = this.l;
        bsruVar.m = this.m;
        bsruVar.n = this.n;
        bsruVar.o = this.o;
        bsruVar.p = this.p;
        bsruVar.q = this.q;
        bsruVar.r = this.r;
        bsruVar.s = this.s;
        bsruVar.t = this.t;
        bsruVar.u = this.u;
        bsruVar.v = this.v;
        bsruVar.w = this.w;
        bsruVar.cK = aC();
        return bsruVar;
    }

    public final void b(int i) {
        int i2 = this.aB;
        if (i2 < 18020) {
            dtub.w("browser_type", i2);
        }
        aE(10);
        this.k = i;
    }

    public final void c(byte[] bArr) {
        aE(7);
        this.h = bArr;
    }

    public final void d(long j) {
        int i = this.aB;
        if (i < 59870) {
            dtub.w("creation_time", i);
        }
        aE(21);
        this.v = j;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(byyv byyvVar) {
        int i = this.aB;
        if (i < 58010) {
            dtub.w("desktop_type", i);
        }
        aE(17);
        this.r = byyvVar;
    }

    public final void g(byte[] bArr) {
        int i = this.aB;
        if (i < 59290) {
            dtub.w("destination_registration_id", i);
        }
        aE(19);
        this.t = bArr;
    }

    public final void h(byte[] bArr) {
        int i = this.aB;
        if (i < 21030) {
            dtub.w("encryption_key", i);
        }
        aE(11);
        this.l = bArr;
    }

    public final void i(String str) {
        int i = this.aB;
        if (i < 59560) {
            dtub.w("gaia_email", i);
        }
        aE(20);
        this.u = str;
    }

    public final void j(byte[] bArr) {
        int i = this.aB;
        if (i < 21030) {
            dtub.w("hmac_key", i);
        }
        aE(12);
        this.m = bArr;
    }

    public final void k(boolean z) {
        int i = this.aB;
        if (i < 58010) {
            dtub.w("is_persistent", i);
        }
        aE(16);
        this.q = z;
    }

    public final void l(String str) {
        int i = this.aB;
        if (i < 22040) {
            dtub.w("operating_system", i);
        }
        aE(8);
        this.i = str;
    }

    public final void m(String str) {
        int i = this.aB;
        if (i < 22040) {
            dtub.w("operating_system_version", i);
        }
        aE(9);
        this.j = str;
    }

    public final void n(byzd byzdVar) {
        int i = this.aB;
        if (i < 58960) {
            dtub.w("pairing_type", i);
        }
        aE(18);
        this.s = byzdVar;
    }
}
