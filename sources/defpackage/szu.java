package defpackage;

import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import j$.util.Optional;
import java.util.Collection;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class szu implements ejlr<szw, eyjv<crsn>> {
    final /* synthetic */ BlockAndReportSpamCallbacks a;

    public szu(BlockAndReportSpamCallbacks blockAndReportSpamCallbacks) {
        this.a = blockAndReportSpamCallbacks;
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void c(Object obj, Object obj2) {
        Object obj3;
        engw n;
        final szw szwVar = (szw) obj;
        final crsn crsnVar = (crsn) ((eyjv) obj2).a(crsn.a, eyfc.a());
        int i = crsnVar.b;
        boolean z = true;
        if ((i & 16) == 0 && (i & 2) == 0 && (i & 1) == 0) {
            return;
        }
        boolean i2 = szwVar.i();
        boolean j = szwVar.j();
        if (!i2 && !j) {
            z = false;
        }
        emxf.m(z, "The dialog must result in at least the block or spam status being updated, if not both.");
        sxp sxpVar = (sxp) this.a.c.b();
        sxn g = sxo.g();
        sxj sxjVar = (sxj) g;
        sxjVar.a = szwVar.g();
        g.g(i2, i2);
        g.h(j, j);
        Supplier supplier = this.a.k;
        if (supplier == null) {
            int i3 = engw.d;
            n = enou.a;
        } else {
            obj3 = supplier.get();
            n = engw.n((Collection) obj3);
        }
        g.e(n);
        sxjVar.b = Optional.of(new Runnable() { // from class: szt
            @Override // java.lang.Runnable
            public final void run() {
                final BlockAndReportSpamCallbacks blockAndReportSpamCallbacks = szu.this.a;
                final szw szwVar2 = szwVar;
                final crsn crsnVar2 = crsnVar;
                ((ejlq) blockAndReportSpamCallbacks.f.b()).i(ejlp.b(elfo.f(new Runnable() { // from class: szr
                    @Override // java.lang.Runnable
                    public final void run() {
                        axnw.h(((crrt) BlockAndReportSpamCallbacks.this.b.b()).a(crsc.c(crsnVar2, szwVar2.i() ? eoko.CONVERSATION_FROM_UNBLOCK_ACTION : eoko.CONVERSATION_FROM_UNSPAM_ACTION, 2)));
                    }
                }, blockAndReportSpamCallbacks.h)), new ejlm(szwVar2), blockAndReportSpamCallbacks.j);
            }
        });
        g.b(szwVar.a());
        sxpVar.b(g.f());
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
