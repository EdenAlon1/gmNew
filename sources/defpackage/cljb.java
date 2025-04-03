package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cljb {
    public static final awud a(MessagingResult messagingResult) {
        int b;
        awua awuaVar;
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = messagingResult.equals(MessagingResult.d) ? awuc.OK : messagingResult.equals(MessagingResult.e) ? awuc.PENDING : (messagingResult.equals(MessagingResult.f) || (b = messagingResult.b()) == 14 || b == 15) ? awuc.FAILED_PERMANENTLY : awuc.FAILED_TRANSIENTLY;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        switch (messagingResult.a()) {
            case 1:
                awuaVar = awua.GROUP_TOO_FEW_PARTICIPANTS;
                break;
            case 2:
                awuaVar = awua.GROUP_TOO_MANY_PARTICIPANTS;
                break;
            case 3:
            case 5:
                awuaVar = awua.USER_NOT_A_GROUP_PARTICIPANT;
                break;
            case 4:
                awuaVar = awua.GROUP_NOT_FOUND;
                break;
            case 6:
                awuaVar = awua.LOW_PRIORITY_MESSAGE_REJECTED;
                break;
            case 7:
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
