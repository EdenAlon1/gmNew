package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eejc extends eeiw implements Cloneable {
    protected boolean a;
    protected String b;
    protected String c;
    public String d;
    public Object e;

    public eejc() {
        this.d = null;
        this.e = null;
        this.b = "=";
        this.c = "";
    }

    public final String a() {
        return emxe.b(this.d);
    }

    public final void b() {
        this.a = true;
        this.c = "\"";
    }

    @Override // defpackage.eeiw
    public final String c() {
        Object obj = this.e;
        if (obj != null && obj.toString().isEmpty() && !this.a) {
            obj = null;
        }
        String str = this.d;
        if (str == null || obj == null) {
            if (str != null || obj == null) {
                return str != null ? str : "";
            }
            return this.c + obj.toString() + this.c;
        }
        return str + this.b + this.c + obj.toString() + this.c;
    }

    @Override // defpackage.eeiw
    public final Object clone() {
        eejc eejcVar = new eejc();
        eejcVar.b = this.b;
        eejcVar.a = this.a;
        eejcVar.c = this.c;
        eejcVar.d = this.d;
        Object obj = this.e;
        if (obj == null || !(obj instanceof eeiw)) {
            eejcVar.e = obj;
            return eejcVar;
        }
        eejcVar.e = ((eeiw) obj).clone();
        return eejcVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                eejc eejcVar = (eejc) obj;
                if (this == eejcVar) {
                    return true;
                }
                String str = this.d;
                if ((str == null && eejcVar.d != null) || (str != null && eejcVar.d == null)) {
                    return false;
                }
                if (str != null && eejcVar.d != null && str.toLowerCase(Locale.US).compareTo(eejcVar.d.toLowerCase(Locale.US)) != 0) {
                    return false;
                }
                Object obj2 = this.e;
                if ((obj2 != null && eejcVar.e == null) || (obj2 == null && eejcVar.e != null)) {
                    return false;
                }
                Object obj3 = eejcVar.e;
                if (obj2 == obj3) {
                    return true;
                }
                if (!(obj2 instanceof String)) {
                    obj2.getClass();
                    return obj2.equals(obj3);
                }
                if (this.a) {
                    return obj2.equals(obj3);
                }
                String str2 = (String) obj3;
                String lowerCase = ((String) obj2).toLowerCase(Locale.US);
                str2.getClass();
                return lowerCase.equals(str2.toLowerCase(Locale.US));
            }
        }
        return false;
    }

    public final int hashCode() {
        return 9876587;
    }

    public final String toString() {
        return c();
    }

    public eejc(String str, Object obj) {
        this.d = str;
        this.e = obj;
        this.b = "=";
        this.c = "";
    }
}
