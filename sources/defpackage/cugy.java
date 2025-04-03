package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cugy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuha b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cugy(cuha cuhaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cuhaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cugy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cuha cuhaVar = this.b;
        this.a = 1;
        Object f = cuhaVar.f(this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cugy(this.b, ffguVar);
    }
}
