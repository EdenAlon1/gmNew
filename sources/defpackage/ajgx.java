package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajgx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajhb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajgx(ffgu ffguVar, ajhb ajhbVar) {
        super(2, ffguVar);
        this.b = ajhbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajgx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cppg cppgVar = (cppg) this.b.a.b();
        this.a = 1;
        Object a = cppgVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajgx ajgxVar = new ajgx(ffguVar, this.b);
        ajgxVar.c = obj;
        return ajgxVar;
    }
}
