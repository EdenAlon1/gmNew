package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ptv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ pua b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptv(pua puaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = puaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ptv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        pua puaVar = this.b;
        this.a = 1;
        Object b = puaVar.b(this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ptv(this.b, ffguVar);
    }
}
