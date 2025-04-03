package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhxx extends fhxr {
    private final fhxo c;

    public fhxx(fhxv fhxvVar, byte[] bArr) {
        super(false, fhxvVar);
        int a = fhxvVar.a();
        int i = a + a;
        if (bArr.length != i) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.c = new fhxo(fics.g(bArr, 0, a), fics.g(bArr, a, i));
    }

    public final byte[] a() {
        fhxo fhxoVar = this.c;
        return fics.e(fhxoVar.a, fhxoVar.b);
    }
}
