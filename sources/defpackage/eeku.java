package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eeku extends eeiw {
    public String c;
    public String d;

    public eeku() {
    }

    public abstract String a();

    @Override // defpackage.eeiw
    public String c() {
        return this.c + ": " + a() + VCardBuilder.VCARD_END_OF_LINE;
    }

    public abstract eejd d();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eeku)) {
            return false;
        }
        eeku eekuVar = (eeku) obj;
        if (emxb.a(this.c, eekuVar.c)) {
            return emxb.a(this.d, eekuVar.d);
        }
        return false;
    }

    public final int h(int i) {
        try {
            return Integer.parseInt(a());
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public int hashCode() {
        String str = this.c;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.d;
        return str2 != null ? (hashCode * 37) + str2.hashCode() : hashCode;
    }

    public final String toString() {
        return c();
    }

    public eeku(String str) {
        this.c = str;
    }

    @Override // defpackage.eeiw
    public Object clone() {
        return this;
    }
}
