package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxvu implements Runnable {
    final /* synthetic */ cxvv a;

    public cxvu(cxvv cxvvVar) {
        this.a = cxvvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ekzm b = ((elbx) this.a.Y.b()).b("ComposeMessageViewPeer stoppedTypingTimeoutTask");
        try {
            cylx cylxVar = this.a.j;
            if (cylxVar != null) {
                cylxVar.ao();
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
