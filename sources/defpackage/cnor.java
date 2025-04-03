package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnor extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnov b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnor(ffgu ffguVar, cnov cnovVar) {
        super(2, ffguVar);
        this.b = cnovVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnor) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cnov cnovVar = this.b;
        this.a = 1;
        Object c = cnovVar.c(this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnor cnorVar = new cnor(ffguVar, this.b);
        cnorVar.c = obj;
        return cnorVar;
    }
}
