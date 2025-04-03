package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwq extends csgp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccwq(String str, String str2, int i) {
        super(i, csgx.SKIP, str + " row " + str2 + " intentionally skipped during CMS backup");
        str2.getClass();
    }

    public final boolean equals(Object obj) {
        ccwq ccwqVar = obj instanceof ccwq ? (ccwq) obj : null;
        if (ccwqVar == null) {
            return false;
        }
        return ffkj.e(getMessage(), ccwqVar.getMessage());
    }

    public /* synthetic */ ccwq(String str) {
        this("Participant", str, 7);
    }
}
