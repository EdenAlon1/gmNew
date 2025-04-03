package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anzl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ anzu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anzl(ffgu ffguVar, anzu anzuVar) {
        super(2, ffguVar);
        this.b = anzuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anzl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl b = this.b.g.b();
        this.a = 1;
        Object c = fgfz.c(b, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        anzl anzlVar = new anzl(ffguVar, this.b);
        anzlVar.c = obj;
        return anzlVar;
    }
}
