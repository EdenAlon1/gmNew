package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum csgm implements eyge {
    CMS_FEATURE_UNDEFINED(0),
    CMS_FEATURE_MULTI_DEVICE(1),
    CMS_FEATURE_BACKUP_AND_RESTORE(2);

    public final int d;

    csgm(int i) {
        this.d = i;
    }

    public static csgm b(int i) {
        if (i == 0) {
            return CMS_FEATURE_UNDEFINED;
        }
        if (i == 1) {
            return CMS_FEATURE_MULTI_DEVICE;
        }
        if (i != 2) {
            return null;
        }
        return CMS_FEATURE_BACKUP_AND_RESTORE;
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
