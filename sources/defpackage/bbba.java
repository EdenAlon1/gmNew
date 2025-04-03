package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbba extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bbbd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbba(bbbd bbbdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bbbdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bbba) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bbbd bbbdVar = this.b;
        this.a = 1;
        Object a = bbbdVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bbba(this.b, ffguVar);
    }
}
