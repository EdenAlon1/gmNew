package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxvt implements Runnable {
    final /* synthetic */ cxvv a;

    public cxvt(cxvv cxvvVar) {
        this.a = cxvvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.n.sendAccessibilityEvent(8);
        } catch (Exception unused) {
        }
    }
}
