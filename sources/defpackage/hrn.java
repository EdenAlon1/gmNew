package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrn extends ffkk implements ffji {
    final /* synthetic */ ffji a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrn(ffji ffjiVar, ffji ffjiVar2) {
        super(1);
        this.a = ffjiVar;
        this.b = ffjiVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        hsd hsdVar = (hsd) obj;
        synchronized (hsj.c) {
            j = hsj.e;
            hsj.e = 1 + j;
        }
        return new hrq(j, hsdVar, this.a, this.b);
    }
}
