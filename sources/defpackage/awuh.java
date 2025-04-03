package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awuh implements eyge {
    UNKNOWN_TYPE(0),
    PHONE(1),
    GROUP(2),
    BOT(3),
    EMERGENCY(4);

    public final int f;

    awuh(int i) {
        this.f = i;
    }

    public static awuh b(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return PHONE;
        }
        if (i == 2) {
            return GROUP;
        }
        if (i == 3) {
            return BOT;
        }
        if (i != 4) {
            return null;
        }
        return EMERGENCY;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
