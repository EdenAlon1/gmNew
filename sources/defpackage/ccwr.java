package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwr extends csgp {
    public ccwr(String str) {
        super(27, csgx.NO_RETRY, a.a(str, "Conversation row ", " already exists in CMS, but its CMS ID could not be found"));
    }

    public final boolean equals(Object obj) {
        ccwr ccwrVar = obj instanceof ccwr ? (ccwr) obj : null;
        return ccwrVar != null && ffkj.e(getMessage(), ccwrVar.getMessage()) && ffkj.e(getCause(), ccwrVar.getCause());
    }
}
