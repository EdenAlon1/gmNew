package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dayt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dayk(dayt daytVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = daytVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dayk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dayt daytVar = this.b;
            this.a = 1;
            obj = daytVar.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        eisx eisxVar = (eisx) obj;
        if (eisxVar != null) {
            ((cdgx) this.b.q.b()).b(eisxVar.a());
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dayk(this.b, ffguVar);
    }
}
