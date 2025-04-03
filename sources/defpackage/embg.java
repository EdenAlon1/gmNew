package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class embg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public embg(ffjm ffjmVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjmVar;
        this.c = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((embg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffjm ffjmVar = this.b;
        Object obj2 = this.c;
        this.a = 1;
        Object a = ffjmVar.a(obj2, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new embg(this.b, this.c, ffguVar);
    }
}
