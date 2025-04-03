package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eekz extends eeku {
    public eejd e;

    protected eekz() {
        this.e = new eejd();
    }

    @Override // defpackage.eeku
    public eejd d() {
        return this.e;
    }

    @Override // defpackage.eeku
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof eekz) && this.e.equals(((eekz) obj).e)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.eeku
    public int hashCode() {
        return (super.hashCode() * 37) + 187654;
    }

    public final String i(String str) {
        return this.e.d(str);
    }

    public final void j(eejc eejcVar) {
        this.e.g(eejcVar);
    }

    public final void k(String str, String str2) {
        eejc a = this.e.a(str);
        if (a != null) {
            a.e = str2;
        } else {
            this.e.g(new eejc(str, str2));
        }
    }

    public final boolean l(String str) {
        return this.e.a(str) != null;
    }

    public final boolean m() {
        eejd eejdVar = this.e;
        return (eejdVar == null || eejdVar.h()) ? false : true;
    }

    public final void n(String str) {
        eejc a = this.e.a("boundary");
        if (a != null) {
            a.e = str;
            a.b();
        } else {
            eejc eejcVar = new eejc("boundary", str);
            eejcVar.b();
            this.e.g(eejcVar);
        }
    }

    protected eekz(String str) {
        super(str);
        this.e = new eejd();
    }
}
