package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqd implements etfr {
    private final etfr a;
    private final byte[] b;

    public etqd(etfr etfrVar, byte[] bArr) {
        this.a = etfrVar;
        this.b = bArr;
    }

    @Override // defpackage.etfr
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? this.a.a(bArr, bArr2) : euhs.b(bArr3, this.a.a(bArr, bArr2));
    }
}
