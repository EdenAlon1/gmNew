package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebjw extends orr {
    @Override // defpackage.orr
    protected final String a() {
        return "UPDATE OR ABORT `HighlightState` SET `educationName` = ?,`highlightId` = ?,`numHighlightImpressions` = ?,`numHighlightInteractions` = ?,`highlightCompleted` = ? WHERE `educationName` = ? AND `highlightId` = ?";
    }

    @Override // defpackage.orr
    protected final /* bridge */ /* synthetic */ void b(oxf oxfVar, Object obj) {
        ebjk ebjkVar = (ebjk) obj;
        String str = ebjkVar.a;
        if (str == null) {
            oxfVar.f(1);
        } else {
            oxfVar.g(1, str);
        }
        String str2 = ebjkVar.b;
        if (str2 == null) {
            oxfVar.f(2);
        } else {
            oxfVar.g(2, str2);
        }
        oxfVar.e(3, ebjkVar.c);
        oxfVar.e(4, ebjkVar.d);
        oxfVar.e(5, ebjkVar.e ? 1L : 0L);
        String str3 = ebjkVar.a;
        if (str3 == null) {
            oxfVar.f(6);
        } else {
            oxfVar.g(6, str3);
        }
        String str4 = ebjkVar.b;
        if (str4 == null) {
            oxfVar.f(7);
        } else {
            oxfVar.g(7, str4);
        }
    }
}
