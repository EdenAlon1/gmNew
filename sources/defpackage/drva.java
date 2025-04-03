package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum drva implements eyge {
    MEDIA_TYPE_UNKNOWN(0),
    MEDIA_TYPE_VIDEO(1),
    MEDIA_TYPE_IMAGE(2);

    private final int e;

    drva(int i) {
        this.e = i;
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
