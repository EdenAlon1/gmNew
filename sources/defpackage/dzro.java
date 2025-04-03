package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dzro {
    UNKNOWN(0),
    INDENTATION(1),
    BULLET(2);

    public final int d;

    dzro(int i) {
        this.d = i;
    }

    public static dzro a(final int i) {
        return (dzro) enfc.e(values()).a(new emxg() { // from class: dzrn
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((dzro) obj).d == i;
            }
        }).e(UNKNOWN);
    }
}
