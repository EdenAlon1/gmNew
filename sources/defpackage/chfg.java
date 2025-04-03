package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chfg implements febh {
    @Override // defpackage.febh
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        if (bArr == null) {
            return fcge.a;
        }
        try {
            eyfc eyfcVar = eyfc.a;
            eyib eyibVar = eyib.a;
            return (fcge) eyfy.parseFrom(fcge.a, bArr, eyfc.a);
        } catch (eygu unused) {
            return fcge.a;
        }
    }

    @Override // defpackage.febh
    public final /* synthetic */ byte[] b(Object obj) {
        return ((fcge) obj).toByteArray();
    }
}
