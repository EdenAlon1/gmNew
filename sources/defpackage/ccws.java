package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccws extends csgp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccws(String str, String str2) {
        super(15, csgx.NO_RETRY, str + " row " + str2 + " could not be saved to CMS because it already exists");
        str2.getClass();
    }

    public final boolean equals(Object obj) {
        ccws ccwsVar = obj instanceof ccws ? (ccws) obj : null;
        if (ccwsVar == null) {
            return false;
        }
        return ffkj.e(getMessage(), ccwsVar.getMessage());
    }
}
