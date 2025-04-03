package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufn {
    public static final ereb a(int i) {
        return i != 0 ? i != 1 ? i != 3 ? ereb.UNKNOWN_CONVERSATION_PROTOCOL : ereb.RCS : ereb.MMS : ereb.SMS;
    }

    public static final erew b(eooc eoocVar) {
        int ordinal = eoocVar.ordinal();
        if (ordinal != 16) {
            switch (ordinal) {
                case 2:
                case 6:
                case 9:
                case 10:
                    return erew.SHORT_CODE;
                case 3:
                    return erew.EMAIL;
                case 4:
                case 11:
                case 12:
                case 13:
                    return erew.LONG_CODE;
                case 5:
                    break;
                case 7:
                case 8:
                    return erew.ALPHA_CODE;
                default:
                    return erew.UNKNOWN_DESTINATION_TYPE;
            }
        }
        return erew.BOT;
    }
}
