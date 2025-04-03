package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aauu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aauv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aauu(aauv aauvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aauvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aauu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.c;
            aauv aauvVar = this.b;
            aaut aautVar = new aaut(aauvVar, ffskVar, null);
            this.a = 1;
            if (ffyk.b(aauvVar.a, aautVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aauu aauuVar = new aauu(this.b, ffguVar);
        aauuVar.c = obj;
        return aauuVar;
    }
}
