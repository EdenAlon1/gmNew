package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetm implements Runnable {
    final /* synthetic */ fete a;
    final /* synthetic */ fets b;
    final /* synthetic */ fetr c;

    public fetm(fetr fetrVar, fete feteVar, fets fetsVar) {
        this.a = feteVar;
        this.b = fetsVar;
        this.c = fetrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            fete feteVar = this.a;
            if (feteVar.c) {
                return;
            }
            feteVar.a();
            fetr fetrVar = this.c;
            fetrVar.b.k.execute(new fetl(this, this.b));
        }
    }
}
