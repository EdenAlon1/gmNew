package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwo extends csgp {
    public ccwo() {
        super(9, csgx.NO_RETRY, "Row intentionally skipped during CMS backup due to CmsLifeCycle.EXCLUDED");
    }

    public final boolean equals(Object obj) {
        ccwo ccwoVar = obj instanceof ccwo ? (ccwo) obj : null;
        if (ccwoVar == null) {
            return false;
        }
        return ffkj.e(getMessage(), ccwoVar.getMessage());
    }
}
