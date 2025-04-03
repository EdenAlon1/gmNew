package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cibv extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ cibw e;
    final /* synthetic */ eslc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cibv(cibw cibwVar, eslc eslcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = cibwVar;
        this.f = eslcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cibv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        fgjb fgjbVar;
        ?? r0;
        fgjb fgjbVar2;
        ffhh ffhhVar = ffhh.a;
        int i = this.d;
        try {
            if (i == 0) {
                ffci.b(obj);
                fgjb fgjbVar3 = cgvq.a;
                cibw cibwVar = this.e;
                obj2 = this.f;
                fgjb fgjbVar4 = cgvq.a;
                this.a = fgjbVar4;
                this.b = cibwVar;
                this.c = obj2;
                this.d = 1;
                if (fgjbVar4.a(null, this) != ffhhVar) {
                    obj3 = cibwVar;
                    fgjbVar = fgjbVar4;
                }
                return ffhhVar;
            }
            if (i != 1) {
                r0 = this.a;
                try {
                    ffci.b(obj);
                    fgjbVar2 = r0;
                    fgjbVar2.b(null);
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    r0.b(null);
                    throw th;
                }
            }
            obj2 = this.c;
            obj3 = this.b;
            ?? r4 = this.a;
            ffci.b(obj);
            fgjbVar = r4;
            this.a = fgjbVar;
            this.b = null;
            this.c = null;
            this.d = 2;
            obj = ((cibw) obj3).d((eslc) obj2, this);
            if (obj != ffhhVar) {
                fgjbVar2 = fgjbVar;
                fgjbVar2.b(null);
                return obj;
            }
            return ffhhVar;
        } catch (Throwable th2) {
            th = th2;
            r0 = fgjbVar;
            r0.b(null);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cibv(this.e, this.f, ffguVar);
    }
}
