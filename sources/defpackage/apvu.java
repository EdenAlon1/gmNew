package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apvu {
    public static alxo a(int i) {
        if (i != 1) {
            if (i == 2) {
                return alxo.DELIVERED;
            }
            if (i != 4 && i != 5 && i != 6 && i != 7 && i != 10) {
                if (i == 11) {
                    return alxo.SEEN;
                }
                if (i != 14 && i != 15) {
                    if (i != 20) {
                        return alxo.ERROR;
                    }
                }
            }
            return alxo.SENDING;
        }
        return alxo.SENT;
    }
}
