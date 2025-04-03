package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebjx extends orr {
    @Override // defpackage.orr
    protected final String a() {
        return "UPDATE OR ABORT `EducationState` SET `name` = ?,`enabled` = ?,`numEducationImpressions` = ?,`numEducationInteractions` = ?,`activatedTimestampMs` = ?,`lastImpressionTimestampMs` = ?,`lastInteractionTimestampMs` = ?,`educationCompleted` = ? WHERE `name` = ?";
    }

    @Override // defpackage.orr
    protected final /* bridge */ /* synthetic */ void b(oxf oxfVar, Object obj) {
        ebjj ebjjVar = (ebjj) obj;
        String str = ebjjVar.a;
        if (str == null) {
            oxfVar.f(1);
        } else {
            oxfVar.g(1, str);
        }
        oxfVar.e(2, ebjjVar.b ? 1L : 0L);
        oxfVar.e(3, ebjjVar.c);
        oxfVar.e(4, ebjjVar.d);
        oxfVar.e(5, ebjjVar.e);
        oxfVar.e(6, ebjjVar.f);
        oxfVar.e(7, ebjjVar.g);
        oxfVar.e(8, ebjjVar.h ? 1L : 0L);
        String str2 = ebjjVar.a;
        if (str2 == null) {
            oxfVar.f(9);
        } else {
            oxfVar.g(9, str2);
        }
    }
}
