package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkz extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ewal ewalVar = (ewal) obj;
        int ordinal = ewalVar.ordinal();
        if (ordinal == 0) {
            return exzh.ACTION_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return exzh.DISPLAYED;
        }
        if (ordinal == 2) {
            return exzh.TAPPED;
        }
        if (ordinal == 3) {
            return exzh.AUTOMATED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(ewalVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        exzh exzhVar = (exzh) obj;
        int ordinal = exzhVar.ordinal();
        if (ordinal == 0) {
            return ewal.UNKNOWN;
        }
        if (ordinal == 1) {
            return ewal.DISPLAYED;
        }
        if (ordinal == 2) {
            return ewal.TAPPED;
        }
        if (ordinal == 3) {
            return ewal.AUTOMATED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(exzhVar.toString()));
    }
}
