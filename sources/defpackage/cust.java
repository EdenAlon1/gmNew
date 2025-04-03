package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cust {
    public static final Integer a(erer ererVar, int i, Integer num) {
        int intValue = num != null ? num.intValue() + 1 : 0;
        if ((!((Boolean) cutc.c.e()).booleanValue() && ererVar == erer.SPAM) || ((ezgu) cutc.a.e()).b.size() <= intValue) {
            return null;
        }
        if (((Boolean) ((cfup) cutc.d.get()).e()).booleanValue() && i == 14) {
            return null;
        }
        return Integer.valueOf(((ezgu) cutc.a.e()).b.d(intValue));
    }

    public static final cula b(int i) {
        int a = fgto.a(i);
        return a != 2 ? a != 8 ? a != 4 ? a != 5 ? cula.a : cula.b : cula.c : cula.b : cula.c;
    }

    static /* synthetic */ Integer c(erer ererVar, Integer num, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        return a(ererVar, 0, num);
    }
}
