package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzcv implements febh {
    @Override // defpackage.febh
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        try {
            return (fcge) eyfy.parseFrom(fcge.a, bArr, eyfc.a());
        } catch (eygu e) {
            dyhr.d("RpcErrorUtils", "Error parsing TachyonError", e);
            return fcge.a;
        }
    }

    @Override // defpackage.febh
    public final /* synthetic */ byte[] b(Object obj) {
        return ((fcge) obj).toByteArray();
    }
}
