package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cibc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cibd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cibc(cibd cibdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cibdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cibc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cibd cibdVar = this.b;
        this.a = 1;
        Object c = cibdVar.c(this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cibc(this.b, ffguVar);
    }
}
