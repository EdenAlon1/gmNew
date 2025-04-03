package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ymt extends ffhv implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ ymy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymt(boolean z, ymy ymyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = z;
        this.b = ymyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ymt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk f = ymy.a.f();
        f.Y(ente.a, "BugleComposeRow2");
        ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl$onUrgentChange$1", "invokeSuspend", 182, "SubjectUrgentUiAdapterImpl.kt")).t("Urgent changed %b", Boolean.valueOf(this.a));
        final boolean z = this.a;
        this.b.c.c(new ffji() { // from class: yms
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                return xhu.c((xhu) obj2, null, null, null, z, null, null, false, 0, 1015);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ymt(this.a, this.b, ffguVar);
    }
}
