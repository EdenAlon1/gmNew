package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ymr extends ffhv implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ ymy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymr(String str, ymy ymyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = str;
        this.b = ymyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ymr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a.length() == 0;
        if (z) {
            ensk f = ymy.a.f();
            f.Y(ente.a, "BugleComposeRow2");
            ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl$onSubjectChange$1", "invokeSuspend", 168, "SubjectUrgentUiAdapterImpl.kt")).q("Subject set to empty");
        } else {
            ensk f2 = ymy.a.f();
            f2.Y(ente.a, "BugleComposeRow2");
            enrr enrrVar = (enrr) f2;
            enrrVar.W(5, TimeUnit.SECONDS);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl$onSubjectChange$1", "invokeSuspend", 173, "SubjectUrgentUiAdapterImpl.kt")).t("Subject changed to %s", cskw.b(this.a));
        }
        final String str = this.a;
        if (true == z) {
            str = null;
        }
        this.b.c.c(new ffji() { // from class: ymq
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                return xhu.c((xhu) obj2, null, null, str, false, null, null, false, 0, 1019);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ymr(this.a, this.b, ffguVar);
    }
}
