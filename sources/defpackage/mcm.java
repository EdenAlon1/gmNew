package defpackage;

import android.content.Context;
import android.util.Pair;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcm extends mdc implements lsk {
    public mcm(Context context, lsg lsgVar, lpo lpoVar, lpr lprVar, lsj lsjVar, Executor executor) {
        super(context, lsgVar, lpoVar, lsjVar, lprVar, executor, lse.a, false);
    }

    public final void a(final long j) {
        final mac macVar = (mac) b(this.d);
        lti.d(!macVar.g, "Calling this method is not allowed when renderFramesAutomatically is enabled");
        macVar.e.f(new mds() { // from class: lzv
            @Override // defpackage.mds
            public final void a() {
                mac macVar2 = mac.this;
                max maxVar = macVar2.h;
                maxVar.f.g();
                if (maxVar.m != null) {
                    return;
                }
                long j2 = j;
                lqg lqgVar = macVar2.a;
                lti.c(!maxVar.n);
                Pair pair = (Pair) maxVar.i.remove();
                maxVar.a(lqgVar, (lqh) pair.first, ((Long) pair.second).longValue(), j2);
                if (maxVar.i.isEmpty() && maxVar.o) {
                    lzp lzpVar = maxVar.u;
                    lti.f(lzpVar);
                    lzpVar.a();
                    maxVar.o = false;
                }
            }
        });
    }
}
