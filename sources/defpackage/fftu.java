package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fftu {
    public static final Executor a(ffsd ffsdVar) {
        Executor g;
        ffts fftsVar = ffsdVar instanceof ffts ? (ffts) ffsdVar : null;
        return (fftsVar == null || (g = fftsVar.g()) == null) ? new fftb(ffsdVar) : g;
    }

    public static final ffsd b(Executor executor) {
        fftb fftbVar = executor instanceof fftb ? (fftb) executor : null;
        return fftbVar != null ? fftbVar.a : new fftt(executor);
    }
}
