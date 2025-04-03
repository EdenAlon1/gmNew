package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fenf implements fdzw {
    @Override // defpackage.febn
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        if (bArr.length < 3) {
            throw new NumberFormatException("Malformed status code ".concat(new String(bArr, fdzx.a)));
        }
        return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
    }

    @Override // defpackage.febn
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        throw new UnsupportedOperationException();
    }
}
