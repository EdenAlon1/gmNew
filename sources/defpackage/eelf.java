package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eelf {
    public final eeit a;
    public final String b;
    private final String c = "SIP/2.0";

    public eelf(String str, eeit eeitVar) {
        this.b = str;
        this.a = eeitVar;
    }

    public final void a(StringBuffer stringBuffer) {
        String str = this.b;
        if (str != null) {
            stringBuffer.append(str);
            stringBuffer.append(" ");
        }
        stringBuffer.append(this.a.c());
        stringBuffer.append(" ");
        stringBuffer.append(this.c.concat(VCardBuilder.VCARD_END_OF_LINE));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eelf)) {
            return false;
        }
        eelf eelfVar = (eelf) obj;
        return TextUtils.equals(this.c, eelfVar.c) && TextUtils.equals(this.b, eelfVar.b) && this.a.equals(eelfVar.a);
    }

    public final int hashCode() {
        int hashCode = !TextUtils.isEmpty(this.b) ? this.b.hashCode() : 0;
        if (!TextUtils.isEmpty(this.c)) {
            hashCode = (hashCode * 37) + this.c.hashCode();
        }
        return (hashCode * 37) + this.a.hashCode();
    }
}
