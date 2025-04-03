package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eehc extends eeha {
    public final String a;
    public final String b;

    public eehc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    protected static Pair e(String str) {
        eehd.c(str, null);
        int indexOf = str.indexOf(":");
        if (indexOf < 0) {
            return new Pair(str, null);
        }
        return new Pair(str.substring(0, indexOf), indexOf < str.length() ? str.substring(indexOf + 1) : null);
    }

    protected String c() {
        return this.a;
    }

    protected String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eehc)) {
            return false;
        }
        eehc eehcVar = (eehc) obj;
        return TextUtils.equals(this.a, eehcVar.c()) && TextUtils.equals(this.b, eehcVar.d());
    }

    protected final void g(StringBuilder sb) {
        sb.append(this.a);
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(":");
            sb.append(this.b);
        }
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final int hashCode() {
        int hashCode = !TextUtils.isEmpty(this.a) ? this.a.hashCode() : 0;
        return !TextUtils.isEmpty(this.b) ? (hashCode * 37) + this.b.hashCode() : hashCode;
    }
}
