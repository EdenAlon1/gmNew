package defpackage;

import defpackage.eiwl;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiwp {
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(fr frVar) {
        try {
            frVar.as(null);
            List<ea> p = frVar.p();
            p.getClass();
            if (p.isEmpty()) {
                return;
            }
            cg cgVar = new cg(frVar);
            for (ea eaVar : p) {
                if (eaVar instanceof fbas) {
                    Object aX = ((fbas) eaVar).aX();
                    aX.getClass();
                    if (aX instanceof eiwl.a) {
                        cgVar.n(eaVar);
                    }
                }
                fr I = eaVar.I();
                I.getClass();
                I.an();
                a(I);
            }
            if (cgVar.i()) {
                return;
            }
            cgVar.B();
            cgVar.c();
        } catch (IllegalStateException e) {
            StringWriter stringWriter = new StringWriter();
            frVar.L("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            ((enrr) ((enrr) eiwq.b.i()).g(e).h("com/google/apps/tiktok/account/api/controller/ActivityAccountStateViewModelBacked$Companion", "clearFragments", 327, "ActivityAccountStateViewModelBacked.kt")).t("popBackStackImmediate failure, fragment state %s", new evhq(evhp.NO_USER_DATA, stringWriter.toString()));
            throw e;
        }
    }
}
