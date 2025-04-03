package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkr extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evyl evylVar = (evyl) obj;
        int ordinal = evylVar.ordinal();
        if (ordinal == 0) {
            return eycj.CLIENT_VALUE_UNKNOWN;
        }
        if (ordinal == 1) {
            return eycj.CLIENT_VALUE_ACCOUNT_NAME;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evylVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eycj eycjVar = (eycj) obj;
        int ordinal = eycjVar.ordinal();
        if (ordinal == 0) {
            return evyl.CLIENT_VALUE_UNKNOWN;
        }
        if (ordinal == 1) {
            return evyl.CLIENT_VALUE_ACCOUNT_NAME;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eycjVar.toString()));
    }
}
