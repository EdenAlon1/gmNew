package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbq extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ hho c;
    final /* synthetic */ dbbt d;
    final /* synthetic */ hho e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbbq(hho hhoVar, dbbt dbbtVar, hho hhoVar2, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = hhoVar;
        this.d = dbbtVar;
        this.e = hhoVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbbq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            String c = dbbt.c(this.e);
            this.a = hhoVar2;
            this.b = 1;
            dbcd dbcdVar = dbbtVar.b;
            Object a = ffra.a(ekxi.a(dbcdVar.d), new dbcu(null, dbcdVar, c), this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            hhoVar = hhoVar2;
            obj = a;
        }
        hhoVar.b(obj);
        ensk h = dbbt.a.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) h.h("com/google/android/apps/messaging/ui/debug/cloudstore/analysisui/RpcPlaygroundPage$ButtonsColumn$1$2$2$1$1", "invokeSuspend", 99, "RpcPlaygroundPage.kt")).D("getConversationByCorrelationId with correlationId %s result: %s", dbbt.c(this.e), this.c.a());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbbq(this.c, this.d, this.e, ffguVar);
    }
}
