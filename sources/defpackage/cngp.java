package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cngp implements cnjw {
    static final cfva a = cfvl.i(cfvl.b, "run_reverse_sync_after_heuristics_in_oobe_permissions_handler", false);
    private static final cskc b = cskc.g("Bugle", "BootAndPackageReplacedReceiver");
    private final Context c;
    private final ctyx d;
    private final ctud e;
    private final cerb f;
    private final ffbr g;
    private final ffbr h;
    private final bazb i;

    public cngp(Context context, ctyx ctyxVar, ctud ctudVar, bazb bazbVar, cerb cerbVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = context;
        this.d = ctyxVar;
        this.e = ctudVar;
        this.i = bazbVar;
        this.f = cerbVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
    }

    private final void d(boolean z) {
        this.i.a(z).k();
        if (ctid.i(this.c)) {
            this.f.a();
        }
        e(false);
    }

    private final void e(boolean z) {
        this.d.g("pending_tasks_after_reboot", z);
    }

    @Override // defpackage.cnjw
    public final void a() {
        if (this.d.q("pending_tasks_after_reboot", false)) {
            b.p("after SMS permission granted, run pending tasks");
            d(true);
        }
    }

    @Override // defpackage.cnjw
    public final void b() {
        if (this.d.q("pending_tasks_after_reboot", false)) {
            d(false);
        }
    }

    @Override // defpackage.cnjw
    public final void c() {
        if (!this.e.r()) {
            b.p("not running oobe tasks, no sms permission");
            e(true);
            return;
        }
        Optional a2 = ((cpwl) this.h.b()).a(eplb.OOBE_PERMISSIONS_HANDLER);
        if (((Boolean) a.e()).booleanValue()) {
            if (a2.isPresent() && ((Boolean) a2.get()).booleanValue()) {
                b.p("Not starting oobe tasks immediately. Postponing it after reverse sync and starting the reverse sync immediately. Has permissions, but wipeout was detected");
                ((cpvq) this.g.b()).a();
                e(true);
                return;
            }
            b.m("Wipeout was not detected in OobePermisionsHandler");
        }
        if (((cpvq) this.g.b()).d()) {
            b.p("Not running oobe tasks, has permissions, but reverse sync is in progress. Oobe task will run after reverse sync completes.");
            e(true);
        } else {
            b.p("run post-reboot oobe tasks");
            d(false);
        }
    }
}
