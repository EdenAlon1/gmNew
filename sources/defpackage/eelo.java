package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eelo extends eekz implements Cloneable {
    public eela a;
    public eeiz b;
    public String f;
    public boolean g;

    public eelo() {
        super("Via");
        this.g = true;
        this.b = new eeiz();
        this.a = new eela();
    }

    @Override // defpackage.eeku
    public final String a() {
        String str = "" + this.a.c() + " " + this.b.a();
        if (this.g && this.b.b <= 0) {
            str = str.concat(":5060");
        }
        String str2 = this.f;
        if (str2 != null) {
            str = str + "(" + str2 + ")";
        }
        if (this.e.h()) {
            return str;
        }
        return str + ";" + this.e.c();
    }

    public final String b() {
        return super.i("branch");
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final Object clone() {
        eelo eeloVar = new eelo();
        String str = this.f;
        if (str != null) {
            eeloVar.f = str;
        }
        eejd eejdVar = this.e;
        if (eejdVar != null) {
            eeloVar.e = (eejd) eejdVar.clone();
        }
        eeiz eeizVar = this.b;
        if (eeizVar != null) {
            eeloVar.b = new eeiz(eeizVar);
        }
        eela eelaVar = this.a;
        if (eelaVar != null) {
            eeloVar.a = (eela) eelaVar.clone();
        }
        return eeloVar;
    }

    public final void e(String str) {
        super.k("branch", str);
    }

    @Override // defpackage.eekz, defpackage.eeku
    public final boolean equals(Object obj) {
        if (!(obj instanceof eelo)) {
            return false;
        }
        eelo eeloVar = (eelo) obj;
        return this.a.equals(eeloVar.a) && this.e.equals(eeloVar.e) && this.b.equals(eeloVar.b);
    }

    public final void f() {
        super.k("keep", null);
    }

    public final void g() {
        super.k("rport", null);
    }

    @Override // defpackage.eekz, defpackage.eeku
    public final int hashCode() {
        return 123987;
    }

    public final void o() {
        super.k("server-keep", null);
    }

    public final void p(String str) {
        if (this.a == null) {
            this.a = new eela();
        }
        this.a.c = str;
    }
}
