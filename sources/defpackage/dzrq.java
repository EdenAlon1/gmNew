package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dzrq {
    UNKNOWN(0),
    TITLE(1),
    SUBTITLE(2),
    BODY_TEXT(3),
    CAPTION_TEXT(4),
    LABEL_TEXT(5);

    public final int g;

    dzrq(int i) {
        this.g = i;
    }

    public static dzrq a(final int i) {
        return (dzrq) enfc.e(values()).a(new emxg() { // from class: dzrp
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((dzrq) obj).g == i;
            }
        }).e(UNKNOWN);
    }
}
