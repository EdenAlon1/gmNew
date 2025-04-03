package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjfw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfq(cjfw cjfwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjfwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjfw cjfwVar = this.b;
            cjfp cjfpVar = new cjfp(null);
            this.a = 1;
            if (cjfwVar.d.a(cjfpVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        ensk h = cjfw.a.h();
        h.Y(ente.a, "BugleGemini");
        ((enrr) h.h("com/google/android/apps/messaging/shared/penpal/settings/PenpalSettingsDataServiceImpl$setHasCreatedPenpalChat$1", "invokeSuspend", 74, "PenpalSettingsDataServiceImpl.kt")).q("User created Penpal chat");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjfq(this.b, ffguVar);
    }
}
