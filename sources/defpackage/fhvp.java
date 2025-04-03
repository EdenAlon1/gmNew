package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhvp implements fhqa {
    private final fhqa a;
    private final int b;

    public fhvp(fhqa fhqaVar, int i) {
        this.a = fhqaVar;
        this.b = i;
    }

    @Override // defpackage.fhqa
    public final int a(byte[] bArr, int i) {
        fhqa fhqaVar = this.a;
        byte[] bArr2 = new byte[fhqaVar.b()];
        fhqaVar.a(bArr2, 0);
        System.arraycopy(bArr2, 0, bArr, i, this.b);
        return this.b;
    }

    @Override // defpackage.fhqa
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fhqa
    public final String c() {
        return this.a.c() + "/" + (this.b * 8);
    }

    @Override // defpackage.fhqa
    public final void d(byte b) {
        this.a.d(b);
    }

    @Override // defpackage.fhqa
    public final void e(byte[] bArr, int i, int i2) {
        this.a.e(bArr, i, i2);
    }
}
