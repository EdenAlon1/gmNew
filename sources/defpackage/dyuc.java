package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dyuc {
    UNKNOWN(0),
    PHONE_NUMBER(1),
    EMAIL(2),
    HANDLER(3),
    GROUP(4),
    DEVICE_ID(5);

    public final int g;

    dyuc(int i) {
        this.g = i;
    }

    public static dyuc a(final int i) {
        return (dyuc) enfc.e(values()).a(new emxg() { // from class: dyub
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((dyuc) obj).g == i;
            }
        }).e(UNKNOWN);
    }
}
