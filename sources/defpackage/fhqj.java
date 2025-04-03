package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhqj extends fhqf {
    public fhqj() {
        fhqm.a(this);
        fhpy.a();
        i();
    }

    @Override // defpackage.fhqa
    public final int a(byte[] bArr, int i) {
        f();
        ficw.g(this.b, bArr, i);
        ficw.g(this.c, bArr, i + 8);
        ficw.g(this.d, bArr, i + 16);
        ficw.g(this.e, bArr, i + 24);
        ficw.g(this.f, bArr, i + 32);
        ficw.g(this.g, bArr, i + 40);
        ficw.g(this.h, bArr, i + 48);
        ficw.g(this.i, bArr, i + 56);
        i();
        return 64;
    }

    @Override // defpackage.fhqa
    public final int b() {
        return 64;
    }

    @Override // defpackage.fhqa
    public final String c() {
        return "SHA-512";
    }

    @Override // defpackage.fhqf
    public final void i() {
        super.i();
        this.b = 7640891576956012808L;
        this.c = -4942790177534073029L;
        this.d = 4354685564936845355L;
        this.e = -6534734903238641935L;
        this.f = 5840696475078001361L;
        this.g = -7276294671716946913L;
        this.h = 2270897969802886507L;
        this.i = 6620516959819538809L;
    }
}
