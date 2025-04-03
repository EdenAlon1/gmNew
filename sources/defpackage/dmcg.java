package defpackage;

import com.android.vcard.VCardConstants;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmcg {
    public final List a;
    public final int b;

    public dmcg(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmcg)) {
            return false;
        }
        dmcg dmcgVar = (dmcg) obj;
        return ffkj.e(this.a, dmcgVar.a) && this.b == dmcgVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgeRowUiData(groups=");
        sb.append(this.a);
        sb.append(", badgePadding=");
        int i = this.b;
        sb.append((Object) (i != 1 ? i != 2 ? "START" : VCardConstants.PROPERTY_END : "NONE"));
        sb.append(")");
        return sb.toString();
    }

    public dmcg() {
        this(ffel.a, 1);
    }
}
