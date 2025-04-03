package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dgh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgf(dgh dghVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dghVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dgh dghVar = this.b;
            this.a = 1;
            if (jhy.a(dghVar, null, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dgf(this.b, ffguVar);
    }
}
