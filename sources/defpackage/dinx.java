package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dinx extends TimerTask {
    protected final String a;

    public dinx(String str) {
        this.a = str;
    }

    protected abstract void a();

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        a();
    }
}
