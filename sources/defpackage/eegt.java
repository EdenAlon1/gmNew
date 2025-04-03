package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eegt extends eeha {
    public final String a;
    private final eegy b;
    private final eegr c;

    public eegt(eegy eegyVar, eegr eegrVar, String str) {
        if (eegyVar == null) {
            throw new IllegalArgumentException("Network type must not be null");
        }
        if (eegrVar == null) {
            throw new IllegalArgumentException("Address type must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("Address must not be null");
        }
        this.b = eegyVar;
        this.c = eegrVar;
        this.a = str;
    }

    public static eegt a(String str) {
        String c = eehd.c(str, "c=");
        String[] split = c.split(" ");
        if (split.length != 3) {
            throw new eehb("Illegal format for connection info: ".concat(String.valueOf(c)));
        }
        String str2 = split[0];
        return new eegt(eegy.a, eegr.b(split[1]), split[2]);
    }

    @Override // defpackage.eeha
    public void b(StringBuilder sb) {
        sb.append("c=");
        d(sb);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    protected final boolean c(eegt eegtVar) {
        return this.c == eegtVar.c && this.b == eegtVar.b && TextUtils.equals(this.a, eegtVar.a);
    }

    protected final void d(StringBuilder sb) {
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.c);
        sb.append(" ");
        sb.append(this.a);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == eegt.class) {
            return c((eegt) obj);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() * 37) + this.c.hashCode();
        return !TextUtils.isEmpty(this.a) ? (hashCode * 37) + this.a.hashCode() : hashCode;
    }
}
