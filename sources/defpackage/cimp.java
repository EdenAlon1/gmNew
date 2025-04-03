package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cimp extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        fgka fgkaVar = (fgka) obj;
        int ordinal = fgkaVar.ordinal();
        if (ordinal == 0) {
            return fcbb.UNKNOWN_MESSAGE_ORIGIN;
        }
        if (ordinal == 1) {
            return fcbb.COLLIDER_FIRST_FANOUT_ATTEMPT;
        }
        if (ordinal == 2) {
            return fcbb.COLLIDER_SECOND_FANOUT_ATTEMPT;
        }
        if (ordinal == 3) {
            return fcbb.INITIAL_PULL_MESSAGES;
        }
        if (ordinal == 4) {
            return fcbb.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(fgkaVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        fcbb fcbbVar = (fcbb) obj;
        int ordinal = fcbbVar.ordinal();
        if (ordinal == 0) {
            return fgka.UNKNOWN_MESSAGE_ORIGIN;
        }
        if (ordinal == 1) {
            return fgka.COLLIDER_FIRST_FANOUT_ATTEMPT;
        }
        if (ordinal == 2) {
            return fgka.COLLIDER_SECOND_FANOUT_ATTEMPT;
        }
        if (ordinal == 3) {
            return fgka.INITIAL_PULL_MESSAGES;
        }
        if (ordinal == 4) {
            return fgka.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(fcbbVar.toString()));
    }
}
