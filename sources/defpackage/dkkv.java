package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkkv extends TimerTask {
    public final dkkj a;
    final /* synthetic */ dkkw b;
    private final String c;

    public dkkv(dkkw dkkwVar, dkkj dkkjVar, String str) {
        this.b = dkkwVar;
        this.a = dkkjVar;
        this.c = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        dkty.c("Timer has expired: %s is now considered idle", this.c);
        dkkx dkkxVar = this.b.b;
        dkkxVar.getClass();
        dkkxVar.a(this.a, this.c, false);
        dkkw.a.remove(dkkw.c(this.a, this.c));
    }
}
