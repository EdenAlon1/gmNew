package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xop {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter");
    public final ffbr b;
    public final dqls c;
    public final ffji d = new ffji() { // from class: xon
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            ((Context) obj).getClass();
            return Integer.valueOf((int) (dskj.c(r5).y * 0.75d));
        }
    };

    public xop(ffbr ffbrVar, dqls dqlsVar) {
        this.b = ffbrVar;
        this.c = dqlsVar;
    }

    public static final dmne a(dtbu dtbuVar) {
        if (dtbuVar instanceof dtbp) {
            return dmnd.a;
        }
        if (dtbuVar instanceof dtbn) {
            return dmnc.e;
        }
        if (dtbuVar instanceof dtbr) {
            return b(((dtbr) dtbuVar).a.a);
        }
        if (dtbuVar instanceof dtbt) {
            return b(((dtbt) dtbuVar).b);
        }
        throw new ffcd();
    }

    private static final dmnc b(dszr dszrVar) {
        int ordinal = dszrVar.ordinal();
        if (ordinal == 0) {
            return dmnc.c;
        }
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal == 4) {
                return dmnc.e;
            }
            if (ordinal != 5) {
                if (ordinal == 6) {
                    return dmnc.f;
                }
                if (ordinal != 8) {
                    return null;
                }
            }
        }
        return dmnc.d;
    }
}
