package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amrk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amrp b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrk(amrp amrpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amrpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amrk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffss c = ffqy.c((ffsk) this.c, null, new amrj(this.b, null), 3);
            this.a = 1;
            obj = c.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        return new amqn((amfx) obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        amrk amrkVar = new amrk(this.b, ffguVar);
        amrkVar.c = obj;
        return amrkVar;
    }
}
