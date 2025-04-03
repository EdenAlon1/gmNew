package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eavz extends eawt {
    private final Drawable a;
    private final String b;
    private final eawu c;

    public eavz(Drawable drawable, String str, eawu eawuVar) {
        if (drawable == null) {
            throw new NullPointerException("Null data");
        }
        this.a = drawable;
        this.b = str;
        if (eawuVar == null) {
            throw new NullPointerException("Null badgeType");
        }
        this.c = eawuVar;
    }

    @Override // defpackage.eawt
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.eawt
    public final eawu b() {
        return this.c;
    }

    @Override // defpackage.eawt
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eawt) {
            eawt eawtVar = (eawt) obj;
            if (this.a.equals(eawtVar.a()) && ((str = this.b) != null ? str.equals(eawtVar.c()) : eawtVar.c() == null) && this.c.equals(eawtVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        eawu eawuVar = this.c;
        return "BadgeContent{data=" + this.a.toString() + ", contentDescription=" + this.b + ", badgeType=" + eawuVar.toString() + "}";
    }
}
