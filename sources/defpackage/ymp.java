package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ymp extends ffhv implements ffjm {
    final /* synthetic */ ymy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymp(ymy ymyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ymyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ymp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk f = ymy.a.f();
        f.Y(ente.a, "BugleComposeRow2");
        ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl$onDismiss$1", "invokeSuspend", 189, "SubjectUrgentUiAdapterImpl.kt")).q("Dismissing subject/urgent row");
        this.a.c.c(new ffji() { // from class: ymo
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                return xhu.c((xhu) obj2, null, null, null, false, null, null, false, 0, 1011);
            }
        });
        this.a.d.f(false);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ymp(this.a, ffguVar);
    }
}
