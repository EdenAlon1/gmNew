package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhqk extends fhqe implements fhqa {
    public fhqk() {
        super(128);
    }

    @Override // defpackage.fhqe, defpackage.fhqa
    public final int a(byte[] bArr, int i) {
        int b = b();
        l(bArr, i, b);
        return b;
    }

    @Override // defpackage.fhqe, defpackage.fhqa
    public final int b() {
        return this.e >> 2;
    }

    @Override // defpackage.fhqe, defpackage.fhqa
    public final String c() {
        return "SHAKE" + this.e;
    }

    @Override // defpackage.fhqe
    protected final void k() {
        c();
    }

    public final void l(byte[] bArr, int i, int i2) {
        if (!this.f) {
            h(15, 4);
        }
        j(bArr, i, i2 * 8);
        i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhqk(int i) {
        super(i);
        if (i != 128 && i != 256) {
            throw new IllegalArgumentException(a.f(i, "'bitStrength' ", " not supported for SHAKE"));
        }
    }
}
