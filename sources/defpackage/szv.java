package defpackage;

import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class szv implements ejlr<szw, Void> {
    final /* synthetic */ BlockAndReportSpamCallbacks a;

    public szv(BlockAndReportSpamCallbacks blockAndReportSpamCallbacks) {
        this.a = blockAndReportSpamCallbacks;
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void c(Object obj, Object obj2) {
        szw szwVar = (szw) obj;
        sxn g = sxo.g();
        ((sxj) g).a = szwVar.g();
        BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus b = szwVar.b();
        b.getClass();
        boolean c = b.c();
        BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus b2 = szwVar.b();
        b2.getClass();
        boolean d = b2.d();
        g.g(szwVar.i(), c);
        g.h(szwVar.j(), d);
        g.b(szwVar.a());
        ((sxp) this.a.c.b()).c(g.f(), true);
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
