package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcu {
    public final int a;
    public final long b;
    public final Throwable c;

    public bcu(long j, Throwable th) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (th instanceof bdf) {
            this.a = 2;
            this.c = th;
            return;
        }
        if (!(th instanceof avv)) {
            this.a = 0;
            this.c = th;
            return;
        }
        Throwable cause = th.getCause();
        th = cause != null ? cause : th;
        this.c = th;
        if (th instanceof ato) {
            this.a = 2;
        } else if (th instanceof IllegalArgumentException) {
            this.a = 1;
        } else {
            this.a = 0;
        }
    }
}
