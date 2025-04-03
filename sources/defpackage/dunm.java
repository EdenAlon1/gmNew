package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dunm extends Thread {
    final /* synthetic */ dunn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dunm(dunn dunnVar, Runnable runnable, String str) {
        super(runnable, str);
        this.a = dunnVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.a.c.b();
        Process.setThreadPriority(this.a.b);
        try {
            super.run();
        } finally {
            try {
            } finally {
            }
        }
    }
}
