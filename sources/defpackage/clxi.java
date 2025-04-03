package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clxi extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ clxk c;
    final /* synthetic */ ceuw d;
    final /* synthetic */ clwz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clxi(clxk clxkVar, ceuw ceuwVar, clwz clwzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = clxkVar;
        this.d = ceuwVar;
        this.e = clwzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clxi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ?? r0;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                ffci.b(obj);
                r0 = r0;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(r0, th);
                    throw th2;
                }
            }
        } else {
            ffci.b(obj);
            clxk clxkVar = this.c;
            clwz clwzVar = this.e;
            ekzz f = eleg.f("MarkRcsMessagesInTelephonyWorkerHandler#processPendingWorkItemAsync");
            try {
                this.a = f;
                this.b = 1;
                obj = clxkVar.l(clwzVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                r0 = f;
            } catch (Throwable th3) {
                th = th3;
                r0 = f;
                throw th;
            }
        }
        ceyt ceytVar = (ceyt) obj;
        ffig.a(r0, null);
        return ceytVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new clxi(this.c, this.d, this.e, ffguVar);
    }
}
