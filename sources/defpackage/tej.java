package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class tej implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqmn apply(cgrr cgrrVar) {
        switch (cgrrVar) {
            case UNSPECIFIED_DELETION:
                return bqmn.a;
            case TOOLSTONE_DELETION:
                return bqmn.b;
            case MESSAGE_NOT_DELIVERED_WEAR_DELETION:
                return bqmn.c;
            case MESSAGE_NOT_DELIVERED_PHONE_DELETION:
                return bqmn.e;
            case RICH_CARD_DELETION:
                return bqmn.d;
            case EXTERNAL_API_DELETION:
                return bqmn.g;
            case MESSAGE_LIST_MANUAL_DELETION:
                return bqmn.f;
            case MESSAGE_LIST_CONVO_V2_MANUAL_DELETION:
                return bqmn.h;
            case METATEXT_MESSAGE_MANUAL_DELETION:
                return bqmn.j;
            case EMERGENCY_MESSAGE_MANUAL_DELETION:
                return bqmn.i;
            case OTP_DELETION:
                return bqmn.k;
            case OBJECT_EVENT_TACHYON_DELETION:
                return bqmn.l;
            case DUPLICATE_MESSAGE_RESTORE_DELETION:
                return bqmn.m;
            case DITTO_DELETION:
                return bqmn.n;
            case ATT_CLOUD_SYNC_DELETION:
                return bqmn.o;
            case SET_PROTOCOL_CHANGE_TOMBSTONE_DELETION:
                return bqmn.p;
            case AFTER_MESSAGE_MOVE_TOMBSTONE_DELETION:
                return bqmn.q;
            case PREVIOUS_TOMBSTONE_DELETION:
                return bqmn.r;
            case UPDATE_CONVERSATION_CREATION_TOMBSTONE_DELETION:
                return bqmn.s;
            case INSERT_OR_UPDATE_AT_BOTTOM_TOMBSTONE_DELETION:
                return bqmn.t;
            case UNRECOGNIZED:
                return b();
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(cgrrVar))));
        }
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract bqmn b();

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
