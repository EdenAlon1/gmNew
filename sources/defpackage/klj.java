package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klj implements Runnable {
    final /* synthetic */ klm a;
    final /* synthetic */ Object b;

    public klj(klm klmVar, Object obj) {
        this.a = klmVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a = this.b;
    }
}
