package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eilu extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eigo eigoVar = (eigo) obj;
        int ordinal = eigoVar.ordinal();
        if (ordinal == 0) {
            return clpf.UNKNOWN_MESSAGE_PRIORITY;
        }
        if (ordinal == 1) {
            return clpf.HIGH;
        }
        if (ordinal == 2) {
            return clpf.NORMAL;
        }
        if (ordinal == 3) {
            return clpf.LOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eigoVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        clpf clpfVar = (clpf) obj;
        int ordinal = clpfVar.ordinal();
        if (ordinal == 0) {
            return eigo.UNKNOWN_MESSAGE_PRIORITY;
        }
        if (ordinal == 1) {
            return eigo.HIGH;
        }
        if (ordinal == 2) {
            return eigo.NORMAL;
        }
        if (ordinal == 3) {
            return eigo.LOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(clpfVar.toString()));
    }
}
