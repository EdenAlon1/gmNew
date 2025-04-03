package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pni {
    static final /* synthetic */ pni a = new pni();
    public static final String b = "pnj";

    private pni() {
    }

    public final pnj a() {
        return Build.VERSION.SDK_INT >= 30 ? pnn.b : Build.VERSION.SDK_INT >= 29 ? pnm.b : Build.VERSION.SDK_INT >= 28 ? pnl.b : pnk.b;
    }
}
