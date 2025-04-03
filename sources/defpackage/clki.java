package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class clki extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        awwp awwpVar = (awwp) obj;
        int ordinal = awwpVar.ordinal();
        if (ordinal == 0) {
            return cloy.UNKNOWN_TYPE;
        }
        if (ordinal == 1) {
            return cloy.PRESENT;
        }
        if (ordinal == 2) {
            return cloy.ABSENT;
        }
        if (ordinal == 3) {
            return cloy.PENDING;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(awwpVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cloy cloyVar = (cloy) obj;
        int ordinal = cloyVar.ordinal();
        if (ordinal == 0) {
            return awwp.UNKNOWN_STATE;
        }
        if (ordinal == 1) {
            return awwp.JOINED;
        }
        if (ordinal == 2) {
            return awwp.DEPARTED;
        }
        if (ordinal == 3) {
            return awwp.PENDING;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cloyVar.toString()));
    }
}
