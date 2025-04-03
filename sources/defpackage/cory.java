package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cory extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cosd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cory(cosd cosdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cosdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cory) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cosd cosdVar = this.b;
        this.a = 1;
        Object k = cosdVar.k(this);
        return k == ffhhVar ? ffhhVar : k;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cory(this.b, ffguVar);
    }
}
