package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evxt implements eyge {
    TEXT_SIZE_UNKNOWN(0),
    MATERIAL_SUBHEAD_1(1),
    MATERIAL_HEADLINE_5(2);

    public final int d;

    evxt(int i) {
        this.d = i;
    }

    public static evxt b(int i) {
        if (i == 0) {
            return TEXT_SIZE_UNKNOWN;
        }
        if (i == 1) {
            return MATERIAL_SUBHEAD_1;
        }
        if (i != 2) {
            return null;
        }
        return MATERIAL_HEADLINE_5;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
