package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgd {
    public final ffbr a;
    public boolean b;
    public Boolean c;
    public Boolean d;
    private final wpk e;
    private boolean f;
    private boolean g;

    public wgd(ffbr ffbrVar, wpk wpkVar) {
        ffbrVar.getClass();
        wpkVar.getClass();
        this.a = ffbrVar;
        this.e = wpkVar;
    }

    public final void a(eisx eisxVar, Activity activity) {
        if (!this.g && this.b && this.f) {
            this.g = true;
            ekzz f = eleg.f("ConversationFragmentStartupTracker#onReady");
            try {
                ((alrv) this.a.b()).f(alrv.v);
                wge wgeVar = (wge) this.e.a(wge.class);
                Boolean bool = this.c;
                Boolean bool2 = this.d;
                wgeVar.a = true;
                wgeVar.d = bool;
                wgeVar.e = bool2;
                wgeVar.a(eisxVar, activity);
                ffig.a(f, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(f, th);
                    throw th2;
                }
            }
        }
    }

    public final void b(eisx eisxVar, Activity activity) {
        eisxVar.getClass();
        this.f = true;
        a(eisxVar, activity);
    }
}
