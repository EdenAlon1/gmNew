package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehj extends eeha {
    public static final eehj a = new eehj(0, 0);
    private final long b;
    private final long c;

    public eehj(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.eeha
    public final void b(StringBuilder sb) {
        sb.append("t=");
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.c);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eehj)) {
            return false;
        }
        eehj eehjVar = (eehj) obj;
        return this.b == eehjVar.b && this.c == eehjVar.c;
    }

    public final int hashCode() {
        return (((int) this.b) * 37) + ((int) this.c);
    }
}
