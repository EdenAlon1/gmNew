package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvd {
    public final int a;
    public final int b;
    public final int c;

    public dnvd(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnvd)) {
            return false;
        }
        dnvd dnvdVar = (dnvd) obj;
        return this.a == dnvdVar.a && this.b == dnvdVar.b && this.c == dnvdVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionsBarPopupPositioningData(yOffsetPx=");
        sb.append(this.a);
        sb.append(", minYPx=");
        sb.append(this.b);
        sb.append(", horizontalAttachmentPoint=");
        int i = this.c;
        sb.append((Object) (i != 1 ? i != 2 ? "CENTER" : VCardConstants.PROPERTY_END : "START"));
        sb.append(")");
        return sb.toString();
    }

    public dnvd() {
        this(0, 0, 1);
    }
}
