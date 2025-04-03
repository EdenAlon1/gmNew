package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdhl extends bdhi {
    public static final bdhl a = new bdhl(null);

    private bdhl(String str) {
        super(str);
    }

    public static bdhl a(String str) {
        return str == null ? a : new bdhl(str);
    }

    public final String toString() {
        return "FeatureNameType: ".concat(String.valueOf(this.b));
    }
}
