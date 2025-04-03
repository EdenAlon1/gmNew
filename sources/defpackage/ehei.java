package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehei implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ehes b;

    public ehei(ehes ehesVar, int i) {
        this.a = i;
        this.b = ehesVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.ag.au(this.a);
    }
}
