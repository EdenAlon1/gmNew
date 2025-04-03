package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnep {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public dnep(int i, int i2, int i3, int i4) {
        this.c = i;
        this.d = i2;
        this.a = i3;
        this.b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnep)) {
            return false;
        }
        dnep dnepVar = (dnep) obj;
        return this.c == dnepVar.c && this.d == dnepVar.d && this.a == dnepVar.a && this.b == dnepVar.b;
    }

    public final int hashCode() {
        return (((((this.c * 31) + this.d) * 31) + this.a) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactListItemAnnotation(type=");
        sb.append((Object) (this.c != 1 ? "TTS" : "HIGHLIGHT"));
        sb.append(", target=");
        sb.append((Object) (this.d != 1 ? "SUBTITLE" : VCardConstants.PROPERTY_TITLE));
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
