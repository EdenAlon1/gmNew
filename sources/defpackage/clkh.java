package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class clkh extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        clph clphVar = (clph) obj;
        int ordinal = clphVar.ordinal();
        if (ordinal == 0) {
            return awxz.UNKNOWN_MESSAGE_SOURCE;
        }
        if (ordinal == 1) {
            return awxz.USER;
        }
        if (ordinal == 2) {
            return awxz.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(clphVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awxz awxzVar = (awxz) obj;
        int ordinal = awxzVar.ordinal();
        if (ordinal == 0) {
            return clph.UNKNOWN_MESSAGE_SOURCE;
        }
        if (ordinal == 1) {
            return clph.USER;
        }
        if (ordinal == 2) {
            return clph.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(awxzVar.toString()));
    }
}
