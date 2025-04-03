package defpackage;

import com.google.android.ims.message.rbm.RbmSpecificMessage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apod implements apot {
    public final engw a;
    public final int b;

    public apod(engw engwVar, int i) {
        engwVar.getClass();
        this.a = engwVar;
        this.b = i;
    }

    @Override // defpackage.appj
    public final String b() {
        return RbmSpecificMessage.CONTENT_TYPE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apod)) {
            return false;
        }
        apod apodVar = (apod) obj;
        return ffkj.e(this.a, apodVar.a) && this.b == apodVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BugleRichCardCarouselContent(cards=");
        sb.append(this.a);
        sb.append(", cardWidth=");
        sb.append((Object) (this.b != 1 ? "MEDIUM" : "SMALL"));
        sb.append(")");
        return sb.toString();
    }
}
