package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum alxo {
    SENDING,
    SENT,
    DELIVERED,
    SEEN,
    ERROR,
    RETRYING;

    public final boolean a(alxo alxoVar) {
        if (this == alxoVar) {
            return false;
        }
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return alxoVar == ERROR || alxoVar == SEEN;
                }
                if (ordinal != 4 && ordinal != 5) {
                    return false;
                }
            } else if (alxoVar != ERROR && alxoVar != DELIVERED && alxoVar != RETRYING && alxoVar != SEEN) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        return this == SEEN;
    }
}
