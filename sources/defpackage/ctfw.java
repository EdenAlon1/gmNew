package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctfw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctgf b;
    final /* synthetic */ cter c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctfw(ffgu ffguVar, ctgf ctgfVar, cter cterVar) {
        super(2, ffguVar);
        this.b = ctgfVar;
        this.c = cterVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctfw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ctgf ctgfVar = this.b;
        cter cterVar = this.c;
        this.a = 1;
        Object c = ctgfVar.c(cterVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctfw ctfwVar = new ctfw(ffguVar, this.b, this.c);
        ctfwVar.d = obj;
        return ctfwVar;
    }
}
