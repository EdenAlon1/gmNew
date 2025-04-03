package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwt extends csgp {
    public ccwt(String str, String str2) {
        super(26, csgx.NO_RETRY, str + " row " + str2 + " already exists in CMS, but its CMS ID could not be found");
    }

    public final boolean equals(Object obj) {
        ccwt ccwtVar = obj instanceof ccwt ? (ccwt) obj : null;
        return ccwtVar != null && ffkj.e(getMessage(), ccwtVar.getMessage()) && ffkj.e(getCause(), ccwtVar.getCause());
    }
}
