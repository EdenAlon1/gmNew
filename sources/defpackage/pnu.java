package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnu {
    public static final pnv a() {
        return Build.VERSION.SDK_INT >= 34 ? pnx.a : Build.VERSION.SDK_INT >= 30 ? pnw.a : pny.a;
    }
}
