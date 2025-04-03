package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eilt extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eifw eifwVar = (eifw) obj;
        int ordinal = eifwVar.ordinal();
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
        throw new IllegalArgumentException("unknown enum value: ".concat(eifwVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cloy cloyVar = (cloy) obj;
        int ordinal = cloyVar.ordinal();
        if (ordinal == 0) {
            return eifw.UNKNOWN;
        }
        if (ordinal == 1) {
            return eifw.PRESENT;
        }
        if (ordinal == 2) {
            return eifw.ABSENT;
        }
        if (ordinal == 3) {
            return eifw.PENDING;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cloyVar.toString()));
    }
}
