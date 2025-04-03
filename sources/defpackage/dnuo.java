package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnuo {
    public final dnux a;
    public final dnun b;
    public final int c;

    public dnuo(int i, dnux dnuxVar, dnun dnunVar) {
        this.c = i;
        this.a = dnuxVar;
        this.b = dnunVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnuo)) {
            return false;
        }
        dnuo dnuoVar = (dnuo) obj;
        return this.c == dnuoVar.c && ffkj.e(this.a, dnuoVar.a) && ffkj.e(this.b, dnuoVar.b);
    }

    public final int hashCode() {
        return (((this.c * 31) + this.a.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarOverlayUiData(progressBarPosition=");
        int i = this.c;
        sb.append((Object) (i != 1 ? i != 2 ? "CENTER" : VCardConstants.PROPERTY_END : "START"));
        sb.append(", progressBarUiData=");
        sb.append(this.a);
        sb.append(", flags=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dnuo(int i, dnux dnuxVar) {
        this(i, dnuxVar, new dnun(null));
    }
}
