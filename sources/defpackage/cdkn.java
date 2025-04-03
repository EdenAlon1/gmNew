package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdkn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdkp b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdkn(cdkp cdkpVar, String str, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cdkpVar;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdkn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cdkp cdkpVar = this.b;
            String str = this.c;
            int i2 = this.d;
            this.a = 1;
            cejc cejcVar = (cejc) cejh.a.createBuilder();
            cejcVar.getClass();
            cefd.b(i2, cejcVar);
            cefd.c(str, cejcVar);
            cejh a = cefd.a(cejcVar);
            cetp cetpVar = new cetp();
            cetpVar.a = "priority";
            ((cevh) cdkpVar.b.a.b()).a(ceyr.h("cms_local_media_restore", a, cetpVar.a()));
            ensk h = cdkp.a.h();
            h.Y(ente.a, "BugleCmsMediaRestore");
            ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreDelegateImpl", "enqueuePartForPriorityMediaRestore", 77, "CmsLocalMediaRestoreDelegateImpl.kt")).t("Enqueued priority media restore for part %s", str);
            if (ffcu.a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdkn(this.b, this.c, this.d, ffguVar);
    }
}
