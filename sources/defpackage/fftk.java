package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fftk extends fftl {
    private final Runnable a;

    public fftk(long j, Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.fftl
    public final String toString() {
        String fftlVar = super.toString();
        Runnable runnable = this.a;
        Objects.toString(runnable);
        return fftlVar.concat(runnable.toString());
    }
}
