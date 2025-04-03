package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbp extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ hho c;
    final /* synthetic */ dbbt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbbp(hho hhoVar, dbbt dbbtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = hhoVar;
        this.d = dbbtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbbp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        hho hhoVar;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            hhoVar = obj2;
        } else {
            ffci.b(obj);
            hho hhoVar2 = this.c;
            dbbt dbbtVar = this.d;
            this.a = hhoVar2;
            this.b = 1;
            dbcd dbcdVar = dbbtVar.b;
            Object a = ffra.a(ekxi.a(dbcdVar.d), new dbcr(null, dbcdVar), this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            hhoVar = hhoVar2;
            obj = a;
        }
        hhoVar.b(obj);
        ensk h = dbbt.a.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) h.h("com/google/android/apps/messaging/ui/debug/cloudstore/analysisui/RpcPlaygroundPage$ButtonsColumn$1$1$1$1", "invokeSuspend", 71, "RpcPlaygroundPage.kt")).t("exportUserDataReference result %s", this.c.a());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbbp(this.c, this.d, ffguVar);
    }
}
