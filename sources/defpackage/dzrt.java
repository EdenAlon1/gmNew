package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dzrt {
    UNKNOWN(0),
    BOLD(1),
    ITALIC(2),
    UNDERLINE(3),
    STRIKETHROUGH(4),
    SUPERSCRIPT(5),
    SUBSCRIPT(6),
    COLOR(7),
    BACKGROUND_COLOR(8),
    SIZE(9),
    TYPEFACE_LIST(10),
    HORIZONTAL_ALIGNMENT(11),
    HYPER_LINK(12);

    public final int n;

    dzrt(int i) {
        this.n = i;
    }

    public static dzrt a(final int i) {
        return (dzrt) enfc.e(values()).a(new emxg() { // from class: dzrs
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((dzrt) obj).n == i;
            }
        }).e(UNKNOWN);
    }
}
