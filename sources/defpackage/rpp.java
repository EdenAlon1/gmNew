package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpp extends Thread {
    final /* synthetic */ rpj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpp(String str, rpj rpjVar) {
        super(str);
        this.a = rpjVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            rpj rpjVar = this.a;
            synchronized (rpjVar) {
                Thread.currentThread();
            }
            rpjVar.a(rpjVar.b);
        } catch (IOException e) {
            roi.b(e, roi.a("Could not start Stetho server: %s", this.a.a));
        }
    }
}
