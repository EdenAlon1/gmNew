package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hro extends ffkk implements ffji {
    final /* synthetic */ ffji a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hro(ffji ffjiVar) {
        super(1);
        this.a = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        hsd hsdVar = (hsd) obj;
        synchronized (hsj.c) {
            j = hsj.e;
            hsj.e = 1 + j;
        }
        return new hrt(j, hsdVar, this.a);
    }
}
