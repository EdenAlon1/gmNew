package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgc {
    private final ffbr a;
    private final wpk b;
    private boolean c;

    public wgc(ffbr ffbrVar, wpk wpkVar) {
        ffbrVar.getClass();
        wpkVar.getClass();
        this.a = ffbrVar;
        this.b = wpkVar;
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            ((alrv) this.a.b()).e(alrv.x);
        }
    }

    public final void b(eisx eisxVar, Activity activity) {
        eisxVar.getClass();
        if (this.c) {
            return;
        }
        this.c = true;
        ekzz f = eleg.f("ComposeRowStartupTracker#onReady");
        try {
            ((alrv) this.a.b()).f(alrv.x);
            wge wgeVar = (wge) this.b.a(wge.class);
            wgeVar.c = true;
            wgeVar.a(eisxVar, activity);
            ffig.a(f, null);
        } finally {
        }
    }
}
