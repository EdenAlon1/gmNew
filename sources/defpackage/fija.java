package defpackage;

import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fija implements Runnable {
    final /* synthetic */ fils a;
    final /* synthetic */ RequestFinishedInfo b;

    public fija(fils filsVar, RequestFinishedInfo requestFinishedInfo) {
        this.a = filsVar;
        this.b = requestFinishedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onRequestFinished(this.b);
    }
}
