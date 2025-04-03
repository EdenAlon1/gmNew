package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clkk {
    public static awud a(clqc clqcVar) {
        awuc awucVar;
        awua awuaVar;
        awty awtyVar = (awty) awud.a.createBuilder();
        clog b = clog.b(clqcVar.c);
        if (b == null) {
            b = clog.ERROR_CODE_UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            awucVar = awuc.OK;
        } else if (ordinal != 2) {
            awucVar = awuc.UNKNOWN_STATUS;
        } else {
            clrl clrlVar = clqcVar.e;
            if (clrlVar == null) {
                clrlVar = clrl.a;
            }
            int a = clrk.a(clrlVar.c);
            awucVar = (a != 0 && a == 2) ? awuc.FAILED_TRANSIENTLY : awuc.FAILED_PERMANENTLY;
        }
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        cloe b2 = cloe.b(clqcVar.d);
        if (b2 == null) {
            b2 = cloe.ERROR_CAUSE_UNKNOWN;
        }
        switch (b2) {
            case ERROR_CAUSE_UNKNOWN:
                awuaVar = awua.UNKNOWN_CAUSE;
                break;
            case ERROR_CAUSE_GROUP_TOO_FEW_PARTICIPANTS:
                awuaVar = awua.GROUP_TOO_FEW_PARTICIPANTS;
                break;
            case ERROR_CAUSE_GROUP_TOO_MANY_PARTICIPANTS:
                awuaVar = awua.GROUP_TOO_MANY_PARTICIPANTS;
                break;
            case ERROR_CAUSE_USER_NOT_A_GROUP_PARTICIPANT:
            case ERROR_CAUSE_NOT_AUTHORIZED_TO_RESTART_GROUP:
                awuaVar = awua.USER_NOT_A_GROUP_PARTICIPANT;
                break;
            case ERROR_CAUSE_GROUP_SESSION_NOT_FOUND:
                awuaVar = awua.GROUP_NOT_FOUND;
                break;
            case ERROR_CAUSE_LOW_PRIORITY_MESSAGE_REJECTED:
                awuaVar = awua.LOW_PRIORITY_MESSAGE_REJECTED;
                break;
            case ERROR_CAUSE_TRANSPORT_INTERNAL_ERROR:
                awuaVar = awua.TRANSPORT_INTERNAL_ERROR;
                break;
            default:
                awuaVar = awua.UNKNOWN_CAUSE;
                break;
        }
        awtyVar.copyOnWrite();
        awud awudVar2 = (awud) awtyVar.instance;
        awudVar2.d = awuaVar.v;
        awudVar2.b |= 2;
        return (awud) awtyVar.build();
    }
}
