package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvf {
    private final ffbr a;

    public dkvf(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final String a(String str, String str2) {
        try {
            esfh n = ((esfl) this.a.b()).n(str, str2);
            if (((esfl) this.a.b()).j(n)) {
                return ((esfl) this.a.b()).b(n, esfi.E164);
            }
            return null;
        } catch (esfg unused) {
            dkty.q("Phone number formatting to E164 failed", new Object[0]);
            return null;
        }
    }
}
