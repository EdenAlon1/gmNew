package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fftj extends fftl {
    final /* synthetic */ fftn a;
    private final ffrf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fftj(fftn fftnVar, long j, ffrf ffrfVar) {
        super(j);
        this.a = fftnVar;
        this.c = ffrfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.g(this.a, ffcu.a);
    }

    @Override // defpackage.fftl
    public final String toString() {
        String fftlVar = super.toString();
        ffrf ffrfVar = this.c;
        Objects.toString(ffrfVar);
        return fftlVar.concat(ffrfVar.toString());
    }
}
