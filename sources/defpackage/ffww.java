package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class ffww {
    public static final void a(ffxg ffxgVar, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = fftq.a("Channel was consumed, consumer had failed", th);
            }
        }
        ffxgVar.t(r0);
    }
}
