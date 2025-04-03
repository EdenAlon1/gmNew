package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum clog implements eyge {
    ERROR_CODE_UNKNOWN(0),
    ERROR_CODE_OK(1),
    ERROR_CODE_ERROR(2);

    public final int d;

    clog(int i) {
        this.d = i;
    }

    public static clog b(int i) {
        if (i == 0) {
            return ERROR_CODE_UNKNOWN;
        }
        if (i == 1) {
            return ERROR_CODE_OK;
        }
        if (i != 2) {
            return null;
        }
        return ERROR_CODE_ERROR;
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
