package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uqa implements Runnable {
    final /* synthetic */ uqc a;

    public uqa(uqc uqcVar) {
        this.a = uqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(true);
        this.a.d = false;
    }
}
