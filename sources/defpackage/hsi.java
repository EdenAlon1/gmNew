package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsi extends ffkk implements ffji {
    final /* synthetic */ ffji a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsi(ffji ffjiVar) {
        super(1);
        this.a = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hrw hrwVar = (hrw) this.a.invoke((hsd) obj);
        synchronized (hsj.c) {
            hsj.d = hsj.d.d(hrwVar.v());
        }
        return hrwVar;
    }
}
