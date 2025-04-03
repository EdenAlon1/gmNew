package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehf extends eeha {
    public static final eehf a = new eehf(0);
    public final int b;

    public eehf(int i) {
        this.b = i;
    }

    @Override // defpackage.eeha
    public final void b(StringBuilder sb) {
        sb.append("v=");
        sb.append(this.b);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof eehf) && this.b == ((eehf) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }
}
