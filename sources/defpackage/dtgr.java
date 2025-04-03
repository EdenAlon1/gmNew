package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgr extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dthi e;
    final /* synthetic */ ffjm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtgr(dthi dthiVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = dthiVar;
        this.f = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtgr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffjm ffjmVar;
        fgjb fgjbVar;
        dthi dthiVar;
        ?? r0;
        fgjb fgjbVar2;
        ffhh ffhhVar = ffhh.a;
        int i = this.d;
        try {
            if (i == 0) {
                ffci.b(obj);
                dthi dthiVar2 = this.e;
                ffjm ffjmVar2 = this.f;
                fgjb fgjbVar3 = dthiVar2.c;
                this.a = fgjbVar3;
                this.b = ffjmVar2;
                this.c = dthiVar2;
                this.d = 1;
                if (fgjbVar3.a(null, this) != ffhhVar) {
                    ffjmVar = ffjmVar2;
                    dthiVar = dthiVar2;
                    fgjbVar = fgjbVar3;
                }
                return ffhhVar;
            }
            if (i != 1) {
                r0 = this.a;
                try {
                    ffci.b(obj);
                    fgjbVar2 = r0;
                    fgjbVar2.b(null);
                    return ffcu.a;
                } catch (Throwable th) {
                    th = th;
                    r0.b(null);
                    throw th;
                }
            }
            ?? r1 = this.c;
            ?? r2 = this.b;
            ?? r4 = this.a;
            ffci.b(obj);
            dthiVar = r1;
            ffjmVar = r2;
            fgjbVar = r4;
            dtgp dtgpVar = dthiVar.b;
            this.a = fgjbVar;
            this.b = null;
            this.c = null;
            this.d = 2;
            if (ffjmVar.a(dtgpVar, this) != ffhhVar) {
                fgjbVar2 = fgjbVar;
                fgjbVar2.b(null);
                return ffcu.a;
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
        return new dtgr(this.e, this.f, ffguVar);
    }
}
