package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuke b;
    final /* synthetic */ ffss c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cujx(ffgu ffguVar, cuke cukeVar, ffss ffssVar) {
        super(2, ffguVar);
        this.b = cukeVar;
        this.c = ffssVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cujx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cuke cukeVar = this.b;
        ffss ffssVar = this.c;
        this.a = 1;
        Object d = cukeVar.d(ffssVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cujx cujxVar = new cujx(ffguVar, this.b, this.c);
        cujxVar.d = obj;
        return cujxVar;
    }
}
