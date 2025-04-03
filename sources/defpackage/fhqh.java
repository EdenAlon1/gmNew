package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhqh extends fhqf {
    public fhqh() {
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
        i();
        return 48;
    }

    @Override // defpackage.fhqa
    public final int b() {
        return 48;
    }

    @Override // defpackage.fhqa
    public final String c() {
        return "SHA-384";
    }

    @Override // defpackage.fhqf
    public final void i() {
        super.i();
        this.b = -3766243637369397544L;
        this.c = 7105036623409894663L;
        this.d = -7973340178411365097L;
        this.e = 1526699215303891257L;
        this.f = 7436329637833083697L;
        this.g = -8163818279084223215L;
        this.h = -2662702644619276377L;
        this.i = 5167115440072839076L;
    }
}
