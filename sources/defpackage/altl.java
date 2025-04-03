package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class altl {
    public static ecda a(int i) {
        return i != 0 ? i != 1 ? i != 3 ? alrv.a : alrv.j : alrv.i : alrv.h;
    }

    public static eoks b(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return eoks.CONVERSATION_TYPE_ONE_ON_ONE;
            }
            if (num.intValue() == 1) {
                return eoks.CONVERSATION_TYPE_GROUP_MMS;
            }
            if (num.intValue() == 2) {
                return eoks.CONVERSATION_TYPE_GROUP_RCS;
            }
        }
        return eoks.UNKNOWN_BUGLE_CONVERSATION_TYPE;
    }

    public static eoqf c(int i) {
        return i == -2 ? eoqf.UNKNOWN_BUGLE_MMS_FAILURE_CODE : (eoqf) Optional.ofNullable(eoqf.b(i)).orElse(eoqf.UNKNOWN_BUGLE_MMS_FAILURE_CODE);
    }

    public static int d(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1 || i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 7 ? 1 : 15;
        }
        return 5;
    }
}
