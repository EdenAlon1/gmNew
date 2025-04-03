package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebjv extends orr {
    @Override // defpackage.orr
    protected final String a() {
        return "DELETE FROM `EducationState` WHERE `name` = ?";
    }

    @Override // defpackage.orr
    protected final /* bridge */ /* synthetic */ void b(oxf oxfVar, Object obj) {
        String str = ((ebjj) obj).a;
        if (str == null) {
            oxfVar.f(1);
        } else {
            oxfVar.g(1, str);
        }
    }
}
