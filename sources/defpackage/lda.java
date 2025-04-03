package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lda extends ffkk implements ffji {
    final /* synthetic */ ffji a;
    final /* synthetic */ ldc b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lda(ffji ffjiVar, ldc ldcVar, ffjm ffjmVar) {
        super(1);
        this.a = ffjiVar;
        this.b = ldcVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ffcu ffcuVar;
        Throwable th = (Throwable) obj;
        this.a.invoke(th);
        this.b.c.e(th);
        do {
            Object a = ffws.a(this.b.c.m());
            if (a != null) {
                this.c.a(a, th);
                ffcuVar = ffcu.a;
            } else {
                ffcuVar = null;
            }
        } while (ffcuVar != null);
        return ffcu.a;
    }
}
