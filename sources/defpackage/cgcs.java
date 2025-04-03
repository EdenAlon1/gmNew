package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgcs {
    private static final cskc a = cskc.g("BugleNetwork", "ForegroundServiceStarter");

    public static void a(cgcr cgcrVar) {
        if (!ctid.e) {
            cgcrVar.a();
            return;
        }
        try {
            cgcrVar.a();
        } catch (ForegroundServiceStartNotAllowedException e) {
            a.s("Failed to call foreground service starter", e);
        }
    }
}
