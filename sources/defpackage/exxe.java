package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum exxe implements eyge {
    CUSTOM_UI_TYPE_UNKNOWN(0),
    CUSTOM_UI_TYPE_GROWTH_CATALOG_DIALOG(1),
    GROWTH_CATALOG_IOS_CUSTOM_UI_ID(2),
    CUSTOM_UI_TYPE_UI_TESTING_ID(3);

    public final int e;

    exxe(int i) {
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
