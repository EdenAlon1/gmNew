package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuup {
    public static final Integer a(int i, Integer num) {
        int intValue = num != null ? num.intValue() + 1 : 0;
        if ((i == 0 || !(i == 4 || i == 13)) && ((ezgu) cuuw.b.e()).b.size() > intValue) {
            return Integer.valueOf(((ezgu) cuuw.b.e()).b.d(intValue));
        }
        return null;
    }

    static /* synthetic */ Integer b(Integer num, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        return a(0, num);
    }
}
