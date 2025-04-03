package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class clkj extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cotf cotfVar = (cotf) obj;
        int ordinal = cotfVar.ordinal();
        if (ordinal == 0) {
            return clqb.FALLBACK_UNKNOWN;
        }
        if (ordinal == 1) {
            return clqb.FALLBACK_DEFAULT;
        }
        if (ordinal == 2) {
            return clqb.FALLBACK_REQUIRED;
        }
        if (ordinal == 3) {
            return clqb.FALLBACK_NOT_ALLOWED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cotfVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        clqb clqbVar = (clqb) obj;
        int ordinal = clqbVar.ordinal();
        if (ordinal == 0) {
            return cotf.FALLBACK_UNKNOWN;
        }
        if (ordinal == 1) {
            return cotf.FALLBACK_DEFAULT;
        }
        if (ordinal == 2) {
            return cotf.FALLBACK_REQUIRED;
        }
        if (ordinal == 3) {
            return cotf.FALLBACK_NOT_ALLOWED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(clqbVar.toString()));
    }
}
