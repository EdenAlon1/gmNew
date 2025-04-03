package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgax extends ffhv implements ffjm {
    int a;
    final /* synthetic */ elfl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgax(elfl elflVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = elflVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgax) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl elflVar = this.b;
        this.a = 1;
        Object c = fgfz.c(elflVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgax(this.b, ffguVar);
    }
}
