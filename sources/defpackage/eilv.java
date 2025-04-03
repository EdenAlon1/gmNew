package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eilv extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eigp eigpVar = (eigp) obj;
        int ordinal = eigpVar.ordinal();
        if (ordinal == 0) {
            return clph.UNKNOWN_MESSAGE_SOURCE;
        }
        if (ordinal == 1) {
            return clph.USER;
        }
        if (ordinal == 2) {
            return clph.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eigpVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        clph clphVar = (clph) obj;
        int ordinal = clphVar.ordinal();
        if (ordinal == 0) {
            return eigp.UNKNOWN_MESSAGE_SOURCE;
        }
        if (ordinal == 1) {
            return eigp.USER;
        }
        if (ordinal == 2) {
            return eigp.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(clphVar.toString()));
    }
}
