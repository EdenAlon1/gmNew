package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxf extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cvxj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvxf(ffgu ffguVar, cvxj cvxjVar) {
        super(3, ffguVar);
        this.c = cvxjVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvxf cvxfVar = new cvxf((ffgu) obj3, this.c);
        cvxfVar.d = (ffxy) obj;
        cvxfVar.b = obj2;
        return cvxfVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx cvxbVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r5 = this.d;
            if (((cwir) this.b).d != cwjb.a) {
                cvxbVar = new ffyg(null);
            } else {
                cvxj cvxjVar = this.c;
                cvxbVar = new cvxb(cvxjVar.b.b(), cvxjVar);
            }
            this.a = 1;
            if (ffyk.c(r5, cvxbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
