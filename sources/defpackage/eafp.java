package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eafp {
    public static eafp c(long j) {
        emxf.a(j >= 0);
        eaff eaffVar = new eaff();
        eaffVar.a = Long.valueOf(j);
        eaffVar.b(SystemClock.uptimeMillis());
        return eaffVar.a();
    }

    public static eafp d() {
        eaff eaffVar = new eaff();
        eaffVar.a = null;
        eaffVar.b(SystemClock.uptimeMillis());
        return eaffVar.a();
    }

    public abstract long a();

    public abstract Long b();

    public final boolean e() {
        return b() == null;
    }
}
