package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class estp extends esrv {
    private final esrd a;

    public estp(esrd esrdVar) {
        this.a = esrdVar;
    }

    @Override // defpackage.esrv
    public final esqx e() {
        if (esrd.b == this.a) {
            return esqx.b;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // defpackage.esrv
    public final esqx f() {
        if (esrd.c == this.a) {
            return esqx.b;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // defpackage.esrv
    public final fgtf g() {
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            return fgtf.UNRECOGNIZED;
        }
        if (ordinal == 1) {
            return fgtf.DEFAULT_ROLE;
        }
        if (ordinal == 2) {
            return fgtf.REGULAR;
        }
        throw new ffcd();
    }
}
