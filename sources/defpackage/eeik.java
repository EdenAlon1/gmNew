package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeik extends TimerTask {
    final /* synthetic */ eeim a;
    private final String b;
    private final dktn c;

    public eeik(eeim eeimVar, String str, dktn dktnVar) {
        this.a = eeimVar;
        this.b = str;
        this.c = dktnVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        synchronized (this.a.e) {
            dkty.d(this.c, "Removed context id: %s", this.b);
            this.a.e.remove(this.b);
        }
    }
}
