package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fgmz implements eyge {
    UNKNOWN(0),
    CRONET(1);

    public final int c;

    fgmz(int i) {
        this.c = i;
    }

    public static fgmz b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return CRONET;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
