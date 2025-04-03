package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhqi extends fhqe {
    public fhqi() {
        super(256);
    }

    @Override // defpackage.fhqe, defpackage.fhqa
    public final int a(byte[] bArr, int i) {
        h(2, 2);
        return super.a(bArr, i);
    }

    @Override // defpackage.fhqe, defpackage.fhqa
    public final String c() {
        return "SHA3-" + this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhqi(int i) {
        super(i);
        if (i != 256 && i != 384 && i != 512) {
            throw new IllegalArgumentException(a.f(i, "'bitLength' ", " not supported for SHA-3"));
        }
    }
}
