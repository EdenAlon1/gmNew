package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ferp {
    public final fean a;
    public fdyc b;
    public boolean c = false;
    public fdyd d = fdyd.a(fdyc.IDLE);

    public ferp(fean feanVar, fdyc fdycVar) {
        this.a = feanVar;
        this.b = fdycVar;
    }

    public final fdyc a() {
        return this.d.a;
    }

    public final void b(fdyc fdycVar) {
        boolean z;
        this.b = fdycVar;
        if (fdycVar == fdyc.READY || fdycVar == fdyc.TRANSIENT_FAILURE) {
            z = true;
        } else if (fdycVar != fdyc.IDLE) {
            return;
        } else {
            z = false;
        }
        this.c = z;
    }
}
