package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feyo implements fevx {
    public final fhmt a;
    private int b;
    private int c;

    public feyo(fhmt fhmtVar, int i) {
        this.a = fhmtVar;
        this.b = i;
    }

    @Override // defpackage.fevx
    public final int a() {
        return this.c;
    }

    @Override // defpackage.fevx
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fevx
    public final void c(byte b) {
        this.a.O(b);
        this.b--;
        this.c++;
    }

    @Override // defpackage.fevx
    public final void d(byte[] bArr, int i, int i2) {
        this.a.M(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}
