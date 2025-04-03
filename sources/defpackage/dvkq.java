package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkq extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evxm evxmVar = (evxm) obj;
        int ordinal = evxmVar.ordinal();
        if (ordinal == 0) {
            return exzv.BUTTONS_LAYOUT_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return exzv.STACKED;
        }
        if (ordinal == 2) {
            return exzv.SIDE_BY_SIDE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evxmVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        exzv exzvVar = (exzv) obj;
        int ordinal = exzvVar.ordinal();
        if (ordinal == 0) {
            return evxm.UNKNOWN_LAYOUT;
        }
        if (ordinal == 1) {
            return evxm.VERTICAL;
        }
        if (ordinal == 2) {
            return evxm.HORIZONTAL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(exzvVar.toString()));
    }
}
