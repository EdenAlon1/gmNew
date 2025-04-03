package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvsd {
    public ffud a;
    private final ffsk b;

    public cvsd(ffsk ffskVar) {
        ffskVar.getClass();
        this.b = ffskVar;
    }

    public final synchronized boolean a(long j) {
        if (this.a != null) {
            return true;
        }
        this.a = axol.l(this.b, new cvsc(j, this, null));
        return false;
    }
}
