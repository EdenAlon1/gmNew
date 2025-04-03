package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alen extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aleo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alen(aleo aleoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aleoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alen) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aleo aleoVar = this.b;
        this.a = 1;
        Object b = aleoVar.b(this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alen(this.b, ffguVar);
    }
}
