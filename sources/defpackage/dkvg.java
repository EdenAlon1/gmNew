package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dkvg {
    UNKNOWN("UNKNOWN"),
    SINGLE_REG("SINGLE_REG"),
    DUAL_REG("DUAL_REG");

    public final String d;

    dkvg(String str) {
        this.d = str;
    }

    public static dkvg a(int i) {
        return i == 2 ? SINGLE_REG : i == 1 ? DUAL_REG : UNKNOWN;
    }
}
