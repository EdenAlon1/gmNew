package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeiq extends eeit {
    public eeip a;
    public eejd b;
    public eejd c;
    private eeis f;

    public eeiq() {
        this.e = "sip";
        this.b = new eejd(null);
        eejd eejdVar = new eejd(null);
        this.c = eejdVar;
        eejdVar.b = "&";
    }

    public final eeiz a() {
        eeip eeipVar = this.a;
        if (eeipVar == null) {
            return null;
        }
        return eeipVar.a;
    }

    public final String b() {
        eeiz eeizVar = this.a.a;
        eeix eeixVar = eeizVar == null ? null : eeizVar.a;
        if (eeixVar == null) {
            return null;
        }
        return eeixVar.a;
    }

    @Override // defpackage.eeit, defpackage.eeiw
    public final String c() {
        StringBuffer stringBuffer = new StringBuffer(this.e);
        stringBuffer.append(":");
        eeip eeipVar = this.a;
        if (eeipVar != null) {
            stringBuffer.append(eeipVar.c());
        }
        if (!this.b.h()) {
            stringBuffer.append(";");
            stringBuffer.append(this.b.c());
        }
        if (!this.c.h()) {
            stringBuffer.append("?");
            stringBuffer.append(this.c.c());
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.eeit, defpackage.eeiw
    public final Object clone() {
        eeiq eeiqVar = new eeiq();
        eeiqVar.e = this.e;
        eeiqVar.a = (eeip) this.a.clone();
        eeiqVar.b = (eejd) this.b.clone();
        eejd eejdVar = this.c;
        if (eejdVar != null) {
            eeiqVar.c = (eejd) eejdVar.clone();
        }
        eeis eeisVar = this.f;
        if (eeisVar != null) {
            eeiqVar.f = (eeis) eeisVar.clone();
        }
        return eeiqVar;
    }

    @Override // defpackage.eeit
    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.a.b();
    }

    @Override // defpackage.eeit
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eeiq)) {
            return false;
        }
        eeiq eeiqVar = (eeiq) obj;
        eeip eeipVar = this.a;
        if (eeipVar == null && eeiqVar.a != null) {
            return false;
        }
        if (eeipVar != null && !eeipVar.equals(eeiqVar.a)) {
            return false;
        }
        eejd eejdVar = this.c;
        if (eejdVar == null && eeiqVar.c != null) {
            return false;
        }
        if (eejdVar != null && !eejdVar.equals(eeiqVar.c)) {
            return false;
        }
        eeis eeisVar = this.f;
        if (eeisVar == null && eeiqVar.f != null) {
            return false;
        }
        if (eeisVar != null && !eeisVar.equals(eeiqVar.f)) {
            return false;
        }
        eejd eejdVar2 = this.b;
        if (eejdVar2 == null && eeiqVar.b != null) {
            return false;
        }
        if (eejdVar2 == null || eejdVar2.equals(eeiqVar.b)) {
            return super.equals(obj);
        }
        return false;
    }

    public final void f() {
        this.b = new eejd();
    }

    public final void g(eeiz eeizVar) {
        if (this.a == null) {
            this.a = new eeip();
        }
        this.a.a = eeizVar;
    }

    @Override // defpackage.eeit
    public final void h(String str) {
        this.b.f("method", str);
    }

    @Override // defpackage.eeit
    public final int hashCode() {
        int hashCode = super.hashCode();
        eeip eeipVar = this.a;
        if (eeipVar != null) {
            hashCode = (hashCode * 37) + eeipVar.hashCode();
        }
        if (this.c != null) {
            hashCode = (hashCode * 37) + 187654;
        }
        eeis eeisVar = this.f;
        if (eeisVar != null) {
            hashCode = (hashCode * 37) + eeisVar.hashCode();
        }
        return this.b != null ? (hashCode * 37) + 187654 : hashCode;
    }

    public final void i(int i) {
        if (this.a == null) {
            this.a = new eeip();
        }
        eeip eeipVar = this.a;
        if (eeipVar.a == null) {
            eeipVar.a = new eeiz();
        }
        eeipVar.a.b = i;
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("null arg");
        }
        if (!str.equalsIgnoreCase("UDP") && !str.equalsIgnoreCase("TCP") && !str.equalsIgnoreCase("TLS")) {
            throw new eeje("bad transport ".concat(str));
        }
        eejc eejcVar = new eejc("transport", str.toLowerCase(Locale.US));
        this.b.i("transport");
        this.b.e(eejcVar);
    }

    public final void k(String str) {
        if (this.a == null) {
            this.a = new eeip();
        }
        this.a.d(str);
    }

    @Override // defpackage.eeit
    public final boolean l() {
        return true;
    }

    public final String m() {
        Object b = this.b.b("user");
        if (b == null) {
            return null;
        }
        return b instanceof eeiw ? ((eeiw) b).c() : b.toString();
    }

    @Override // defpackage.eeit
    public final String toString() {
        return c();
    }
}
