package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegz extends eegt {
    private final String b;
    private final BigInteger c;
    private final long d;

    public eegz(String str, eegy eegyVar, eegr eegrVar, String str2) {
        super(eegyVar, eegrVar, str2);
        this.b = str;
        long currentTimeMillis = (System.currentTimeMillis() / 1000) + 2208988800L;
        this.c = BigInteger.valueOf(currentTimeMillis);
        this.d = currentTimeMillis;
    }

    public static eegz e(String str) {
        String c = eehd.c(str, "o=");
        String[] split = c.split(" ");
        if (split.length != 6) {
            throw new eehb("Illegal format for origin: ".concat(String.valueOf(c)));
        }
        String str2 = split[0];
        String replace = split[1].replace(".", "");
        try {
            BigInteger bigInteger = new BigInteger(replace);
            String replace2 = split[2].replace(".", "");
            try {
                long parseLong = Long.parseLong(replace2);
                String str3 = split[3];
                return new eegz(str2, bigInteger, parseLong, eegy.a, eegr.b(split[4]), split[5]);
            } catch (NumberFormatException e) {
                throw new eehb("Invalid SDP format, numerical expected: ".concat(String.valueOf(replace2)), e);
            }
        } catch (NumberFormatException e2) {
            throw new eehb("Invalid SDP format, numerical expected: ".concat(String.valueOf(replace)), e2);
        }
    }

    @Override // defpackage.eegt, defpackage.eeha
    public final void b(StringBuilder sb) {
        sb.append("o=");
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.c.toString());
        sb.append(" ");
        sb.append(this.d);
        sb.append(" ");
        d(sb);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    @Override // defpackage.eegt
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eegz)) {
            return false;
        }
        eegz eegzVar = (eegz) obj;
        return this.c.equals(eegzVar.c) && TextUtils.equals(this.b, eegzVar.b) && super.c(eegzVar) && this.d == eegzVar.d;
    }

    @Override // defpackage.eegt
    public final int hashCode() {
        int hashCode = (((super.hashCode() * 37) + this.c.intValue()) * 37) + ((int) this.d);
        return !TextUtils.isEmpty(this.b) ? (hashCode * 37) + this.b.hashCode() : hashCode;
    }

    protected eegz(String str, BigInteger bigInteger, long j, eegy eegyVar, eegr eegrVar, String str2) {
        super(eegyVar, eegrVar, str2);
        this.b = str;
        this.c = bigInteger;
        this.d = j;
    }
}
