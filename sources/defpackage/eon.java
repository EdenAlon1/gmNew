package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eon extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eot b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eon(eot eotVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eotVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eon) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eot eotVar = this.b;
            this.a = 1;
            Object e = eotVar.e(dhy.a, new drb(null), this);
            if (e != ffhh.a) {
                e = ffcu.a;
            }
            if (e == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eon(this.b, ffguVar);
    }
}
