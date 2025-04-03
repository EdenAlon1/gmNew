package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class ease extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        exqn exqnVar = (exqn) obj;
        int ordinal = exqnVar.ordinal();
        if (ordinal == 0) {
            return exvj.CHANNEL_GROUP_UNKNOWN;
        }
        if (ordinal == 1) {
            return exvj.ALLOWED;
        }
        if (ordinal == 2) {
            return exvj.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(exqnVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        exvj exvjVar = (exvj) obj;
        int ordinal = exvjVar.ordinal();
        if (ordinal == 0) {
            return exqn.CHANNEL_GROUP_STATE_UNKNOWN;
        }
        if (ordinal == 1) {
            return exqn.ALLOWED;
        }
        if (ordinal == 2) {
            return exqn.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(exvjVar.toString()));
    }
}
