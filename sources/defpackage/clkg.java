package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class clkg extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        clpf clpfVar = (clpf) obj;
        int ordinal = clpfVar.ordinal();
        if (ordinal == 0) {
            return awxx.UNKNOWN_MESSAGE_PRIORITY;
        }
        if (ordinal == 1) {
            return awxx.HIGH;
        }
        if (ordinal == 2) {
            return awxx.NORMAL;
        }
        if (ordinal == 3) {
            return awxx.LOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(clpfVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awxx awxxVar = (awxx) obj;
        int ordinal = awxxVar.ordinal();
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
        throw new IllegalArgumentException("unknown enum value: ".concat(awxxVar.toString()));
    }
}
