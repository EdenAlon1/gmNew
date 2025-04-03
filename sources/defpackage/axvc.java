package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axvc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axvh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axvc(axvh axvhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axvhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axvc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            axvh axvhVar = this.b;
            this.a = 1;
            ((ensz) axvh.a.h()).q("Stopping contacts sync");
            ((aybz) axvhVar.c.b()).c();
            Object c = fgfz.c(((ejoc) axvhVar.e.b()).a("ContactsSyncPeriodicImportScheduler"), this);
            if (c != ffhh.a) {
                c = ffcu.a;
            }
            if (c == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axvc(this.b, ffguVar);
    }
}
