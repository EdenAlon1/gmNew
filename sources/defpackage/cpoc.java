package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpoc {
    public static final boolean a(esro esroVar) {
        fcek fcekVar = esroVar.e;
        if (fcekVar == null) {
            return false;
        }
        if (((Boolean) ((cfup) ctjd.ax.get()).e()).booleanValue()) {
            fgtg b = fgtg.b(fcekVar.b);
            if (b == null) {
                b = fgtg.UNRECOGNIZED;
            }
            if (b == fgtg.PENPAL_CONVERSATION_ID) {
                return false;
            }
        }
        return true;
    }
}
