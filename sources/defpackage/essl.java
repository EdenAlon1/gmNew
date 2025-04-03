package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class essl implements febh {
    @Override // defpackage.febh
    public final /* synthetic */ Object a(byte[] bArr) {
        bArr.getClass();
        try {
            eyfc eyfcVar = eyfc.a;
            eyib eyibVar = eyib.a;
            fcge fcgeVar = (fcge) eyfy.parseFrom(fcge.a, bArr, eyfc.a);
            fcgeVar.getClass();
            return fcgeVar;
        } catch (eygu e) {
            esrh d = new esre().d();
            esre esreVar = (esre) d;
            esreVar.c = Optional.of(e);
            esreVar.a = "Failed to parse TachyonError from bytes.";
            cpgj.a(d.a());
            fcge fcgeVar2 = fcge.a;
            fcgeVar2.getClass();
            return fcgeVar2;
        }
    }

    @Override // defpackage.febh
    public final /* synthetic */ byte[] b(Object obj) {
        return ((fcge) obj).toByteArray();
    }
}
