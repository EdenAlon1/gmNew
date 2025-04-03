package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegw extends eeha {
    public final int a;
    public eehh b;
    public eegt c;
    public eegs d;
    public final List e = new ArrayList();
    private final eegv f;
    private final int g;
    private final String h;
    private final int i;
    private final String j;

    public eegw(eegv eegvVar, int i, int i2, String str, String str2) {
        if (eegvVar == null) {
            throw new IllegalArgumentException("MediaType must not be null");
        }
        this.f = eegvVar;
        this.a = i;
        this.g = i2;
        this.h = str;
        this.j = str2;
        int i3 = -1;
        if (!Objects.isNull(str2) && !TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str2)) {
            i3 = Integer.parseInt(str2);
        }
        this.i = i3;
    }

    public static eegw c(String str) {
        eegv eegvVar;
        int i;
        String c = eehd.c(str, "m=");
        int indexOf = c.indexOf(32);
        String substring = c.substring(0, indexOf);
        eegv eegvVar2 = eegv.AUDIO;
        if (!TextUtils.isEmpty(substring)) {
            for (eegv eegvVar3 : eegv.values()) {
                if (eegvVar3.f.equals(substring)) {
                    eegvVar = eegvVar3;
                    break;
                }
            }
        }
        eegvVar = null;
        if (eegvVar == null) {
            throw new eehb("Unknown media type: ".concat(String.valueOf(substring)));
        }
        int i2 = indexOf + 1;
        int indexOf2 = c.indexOf(32, i2);
        String substring2 = c.substring(i2, indexOf2);
        int indexOf3 = substring2.indexOf(47);
        if (indexOf3 > 0) {
            String substring3 = substring2.substring(indexOf3 + 1);
            substring2 = substring2.substring(0, indexOf3);
            i = eehd.a(substring3);
        } else {
            i = 1;
        }
        int i3 = indexOf2 + 1;
        int a = eehd.a(substring2);
        int indexOf4 = c.indexOf(32, i3);
        return new eegw(eegvVar, a, i, c.substring(i3, indexOf4), c.substring(indexOf4 + 1));
    }

    public static String d(String str) {
        try {
            int indexOf = str.indexOf("://") + 3;
            return str.substring(indexOf, str.indexOf(":", indexOf));
        } catch (StringIndexOutOfBoundsException e) {
            throw new Exception("MSRP Path is not a valid MSRP URI", e);
        }
    }

    public final eegu a(String str) {
        for (eegu eeguVar : this.e) {
            if (eeguVar.a.equals(str)) {
                return eeguVar;
            }
        }
        return null;
    }

    @Override // defpackage.eeha
    public final void b(StringBuilder sb) {
        sb.append("m=");
        sb.append(this.f.f);
        sb.append(" ");
        sb.append(this.a);
        sb.append(" ");
        sb.append(this.h);
        sb.append(" ");
        sb.append(this.j);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        eehh eehhVar = this.b;
        if (eehhVar != null) {
            eehhVar.b(sb);
        }
        eegt eegtVar = this.c;
        if (eegtVar != null) {
            eegtVar.b(sb);
        }
        eegs eegsVar = this.d;
        if (eegsVar != null) {
            eegsVar.b(sb);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((eegu) it.next()).b(sb);
        }
    }

    public final void e(eegu eeguVar) {
        this.e.add(eeguVar);
    }

    public final boolean equals(Object obj) {
        if (Objects.isNull(obj) || !(obj instanceof eegw)) {
            return false;
        }
        eegw eegwVar = (eegw) obj;
        if (this.f != eegwVar.f || this.i != eegwVar.i || this.a != eegwVar.a || this.g != eegwVar.g || !TextUtils.equals(this.j, eegwVar.j) || !TextUtils.equals(this.h, eegwVar.h)) {
            return false;
        }
        if (this.e.size() != eegwVar.e.size()) {
            return false;
        }
        eegs eegsVar = this.d;
        if (eegsVar == null && eegwVar.d != null) {
            return false;
        }
        if (eegsVar != null && !eegsVar.equals(eegwVar.d)) {
            return false;
        }
        eegt eegtVar = this.c;
        if (eegtVar == null && eegwVar.c != null) {
            return false;
        }
        if (eegtVar != null && !eegtVar.equals(eegwVar.c)) {
            return false;
        }
        eehh eehhVar = this.b;
        if (eehhVar != null || eegwVar.b == null) {
            return (eehhVar == null || eehhVar.equals(eegwVar.b)) && this.e.equals(eegwVar.e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.i * 37) + this.a) * 37) + this.g) * 37) + this.e.hashCode();
        if (!TextUtils.isEmpty(this.j)) {
            hashCode = (hashCode * 37) + this.j.hashCode();
        }
        if (!TextUtils.isEmpty(this.h)) {
            hashCode = (hashCode * 37) + this.h.hashCode();
        }
        int hashCode2 = (hashCode * 37) + this.f.hashCode();
        eegs eegsVar = this.d;
        if (eegsVar != null) {
            hashCode2 = (hashCode2 * 37) + eegsVar.hashCode();
        }
        eegt eegtVar = this.c;
        if (eegtVar != null) {
            hashCode2 = (hashCode2 * 37) + eegtVar.hashCode();
        }
        eehh eehhVar = this.b;
        return eehhVar != null ? (hashCode2 * 37) + eehhVar.hashCode() : hashCode2;
    }
}
