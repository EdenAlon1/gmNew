package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class clii extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eigp eigpVar = (eigp) obj;
        int ordinal = eigpVar.ordinal();
        if (ordinal == 0) {
            return awxz.UNKNOWN_MESSAGE_SOURCE;
        }
        if (ordinal == 1) {
            return awxz.USER;
        }
        if (ordinal == 2) {
            return awxz.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eigpVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awxz awxzVar = (awxz) obj;
        int ordinal = awxzVar.ordinal();
        if (ordinal == 0) {
            return eigp.UNKNOWN_MESSAGE_SOURCE;
        }
        if (ordinal == 1) {
            return eigp.USER;
        }
        if (ordinal == 2) {
            return eigp.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(awxzVar.toString()));
    }
}
