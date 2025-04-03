package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eela extends eeiw implements Cloneable {
    public String a = "SIP";
    public String b = "2.0";
    public String c = "UDP";

    @Override // defpackage.eeiw
    public final String c() {
        return this.a.toUpperCase(Locale.US) + "/" + this.b + "/" + this.c.toUpperCase(Locale.US);
    }

    @Override // defpackage.eeiw
    public final Object clone() {
        eela eelaVar = new eela();
        String str = this.a;
        if (str != null) {
            eelaVar.a = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            eelaVar.b = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            eelaVar.c = str3;
        }
        return eelaVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                eela eelaVar = (eela) obj;
                return this.a.compareToIgnoreCase(eelaVar.a) == 0 && this.b.compareToIgnoreCase(eelaVar.b) == 0 && this.c.compareToIgnoreCase(eelaVar.c) == 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 999998888;
    }
}
