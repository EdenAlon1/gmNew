package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eopk implements eyge {
    UNKNOWN_SATELLITE_TYPE(0),
    QUESTIONNAIRE(1),
    SOS_MESSAGE(2),
    END_OF_EMERGENCY(3);

    public final int e;

    eopk(int i) {
        this.e = i;
    }

    public static eopk b(int i) {
        if (i == 0) {
            return UNKNOWN_SATELLITE_TYPE;
        }
        if (i == 1) {
            return QUESTIONNAIRE;
        }
        if (i == 2) {
            return SOS_MESSAGE;
        }
        if (i != 3) {
            return null;
        }
        return END_OF_EMERGENCY;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
