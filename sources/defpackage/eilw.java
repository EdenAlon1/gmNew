package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eilw extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eigz eigzVar = (eigz) obj;
        int ordinal = eigzVar.ordinal();
        if (ordinal == 0) {
            return clpy.MESSAGING_METHOD_UNKNOWN;
        }
        if (ordinal == 1) {
            return clpy.MESSAGING_METHOD_CHAT;
        }
        if (ordinal == 2) {
            return clpy.MESSAGING_METHOD_SLM;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eigzVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        clpy clpyVar = (clpy) obj;
        int ordinal = clpyVar.ordinal();
        if (ordinal == 0) {
            return eigz.MESSAGING_METHOD_UNKNOWN;
        }
        if (ordinal == 1) {
            return eigz.MESSAGING_METHOD_CHAT;
        }
        if (ordinal == 2) {
            return eigz.MESSAGING_METHOD_SLM;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(clpyVar.toString()));
    }
}
