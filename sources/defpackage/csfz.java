package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum csfz {
    UNDEFINED(0),
    MULTI_DEVICE(1),
    BACKUP_AND_RESTORE(2);

    public final int d;

    csfz(int i) {
        this.d = i;
    }

    public static csfz a(int i) {
        if (i == 0 || i == 1) {
            return MULTI_DEVICE;
        }
        if (i == 2) {
            return BACKUP_AND_RESTORE;
        }
        throw new IllegalArgumentException(a.h(i, "Unrecognized feature Id value: "));
    }
}
