package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctot {
    private final ffbr a;
    private final cskc b;

    public ctot(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        this.b = cskc.g("Bugle", "SuggestedStickerProvider");
    }

    public final ewnk a(String str, String str2) {
        emmp emmpVar = ((ctos) this.a.b()).b;
        if (emmpVar == null) {
            return null;
        }
        String str3 = (String) ctjd.B.e();
        int i = engw.d;
        ewnk b = emmpVar.b(str, str2, str3, enou.a);
        if (!ffkj.e(b, ewnk.a)) {
            return b;
        }
        csjb e = this.b.e();
        e.I("No sticker found for emotion suggestion");
        e.A("emotion", str);
        e.r();
        return null;
    }
}
