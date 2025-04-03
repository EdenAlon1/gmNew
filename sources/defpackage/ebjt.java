package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebjt extends ort {
    @Override // defpackage.ort
    public final String a() {
        return "INSERT OR IGNORE INTO `HighlightState` (`educationName`,`highlightId`,`numHighlightImpressions`,`numHighlightInteractions`,`highlightCompleted`) VALUES (?,?,?,?,?)";
    }

    @Override // defpackage.ort
    public final /* bridge */ /* synthetic */ void b(oxf oxfVar, Object obj) {
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
    }
}
