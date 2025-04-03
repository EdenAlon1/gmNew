package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eejd extends eeiw implements Cloneable, Iterable {
    public final Vector a = new Vector();
    public String b = ";";

    public eejd() {
    }

    public final eejc a(String str) {
        if (str == null) {
            throw new NullPointerException("null arg!");
        }
        String lowerCase = str.toLowerCase(Locale.US);
        for (int i = 0; i < this.a.size(); i++) {
            eejc eejcVar = (eejc) this.a.elementAt(i);
            eejcVar.a();
            if (eejcVar.a().toLowerCase(Locale.US).equals(lowerCase)) {
                return eejcVar;
            }
        }
        return null;
    }

    public final Object b(String str) {
        eejc a = a(str);
        if (a != null) {
            return a.e;
        }
        return null;
    }

    @Override // defpackage.eeiw
    public final String c() {
        if (this.a.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.size(); i++) {
            Object elementAt = this.a.elementAt(i);
            if (elementAt instanceof eeiw) {
                sb.append(((eeiw) elementAt).c());
            } else {
                sb.append(elementAt.toString());
            }
            if (i >= this.a.size() - 1) {
                break;
            }
            sb.append(this.b);
        }
        return sb.toString();
    }

    @Override // defpackage.eeiw
    public final Object clone() {
        eejd eejdVar = new eejd();
        eejdVar.b = this.b;
        for (int i = 0; i < this.a.size(); i++) {
            eejdVar.e((eejc) ((eejc) this.a.elementAt(i)).clone());
        }
        return eejdVar;
    }

    public final String d(String str) {
        Object b = b(str);
        if (b == null) {
            return null;
        }
        return b instanceof eeiw ? ((eeiw) b).c() : b.toString();
    }

    public final void e(eejc eejcVar) {
        this.a.addElement(eejcVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eejd)) {
            return false;
        }
        eejd eejdVar = (eejd) obj;
        if (this.a.size() != eejdVar.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            eejc eejcVar = (eejc) this.a.elementAt(i);
            String str = eejcVar.d;
            eejc a = str == null ? null : eejdVar.a(str);
            if (a == null || !a.equals(eejcVar)) {
                return false;
            }
        }
        return true;
    }

    public final void f(String str, Object obj) {
        e(new eejc(str, obj));
    }

    public final void g(eejc eejcVar) {
        String str = eejcVar.d;
        if (str != null) {
            i(str);
        }
        e(eejcVar);
    }

    public final boolean h() {
        return this.a.size() == 0;
    }

    public final int hashCode() {
        return 187654;
    }

    public final void i(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        int i = 0;
        while (i < this.a.size()) {
            eejc eejcVar = (eejc) this.a.elementAt(i);
            eejcVar.a();
            if (eejcVar.a().toLowerCase(Locale.US).equals(lowerCase)) {
                break;
            } else {
                i++;
            }
        }
        if (i < this.a.size()) {
            this.a.removeElementAt(i);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<eejc> iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        return c();
    }

    public eejd(byte[] bArr) {
    }
}
