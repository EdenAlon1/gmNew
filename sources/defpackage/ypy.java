package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yqb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypy(ffgu ffguVar, yqb yqbVar) {
        super(2, ffguVar);
        this.b = yqbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ypy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        yqb yqbVar = this.b;
        this.a = 1;
        Object f = yqbVar.f(this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ypy ypyVar = new ypy(ffguVar, this.b);
        ypyVar.c = obj;
        return ypyVar;
    }
}
