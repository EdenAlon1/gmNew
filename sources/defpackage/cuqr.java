package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuqr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuqs b;
    final /* synthetic */ cujo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuqr(ffgu ffguVar, cuqs cuqsVar, cujo cujoVar) {
        super(2, ffguVar);
        this.b = cuqsVar;
        this.c = cujoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuqr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cuqs cuqsVar = this.b;
        cujo cujoVar = this.c;
        this.a = 1;
        Object a = cuqsVar.a(cujoVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuqr cuqrVar = new cuqr(ffguVar, this.b, this.c);
        cuqrVar.d = obj;
        return cuqrVar;
    }
}
