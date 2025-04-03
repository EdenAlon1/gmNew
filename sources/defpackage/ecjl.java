package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ecjl {
    public static ecjl c(dlpw dlpwVar) {
        return new ecio(SystemClock.elapsedRealtime(), dlpwVar.e().toMillis());
    }

    public static ecjl d() {
        return new ecio(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long a();

    public abstract long b();
}
