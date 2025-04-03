package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekk extends eekd {
    public boolean b;

    public eekk() {
        super("Contact");
        this.b = false;
    }

    private static eeio f(eeiq eeiqVar, String str, int i) {
        eeiqVar.j(str);
        eeiqVar.i(i);
        eeio eeioVar = new eeio();
        eeioVar.b = eeiqVar;
        return eeioVar;
    }

    @Override // defpackage.eekd, defpackage.eeku
    public final String a() {
        if (this.b) {
            return "*";
        }
        eeio eeioVar = this.a;
        String str = "";
        if (eeioVar != null) {
            if (eeioVar.c == 1) {
                str = "".concat(eeioVar.c());
            } else {
                str = "<" + eeioVar.c() + ">";
            }
        }
        eejd eejdVar = this.e;
        if (eejdVar == null || eejdVar.h()) {
            return str;
        }
        return str + ";" + this.e.c();
    }

    @Override // defpackage.eekd
    public final void b(eeio eeioVar) {
        this.a = eeioVar;
    }

    @Override // defpackage.eekd, defpackage.eeku, defpackage.eeiw
    public final /* bridge */ /* synthetic */ Object clone() {
        eekk eekkVar = new eekk();
        eekkVar.b = this.b;
        eejd eejdVar = this.e;
        if (eejdVar != null) {
            eekkVar.e = (eejd) eejdVar.clone();
        }
        eeio eeioVar = this.a;
        if (eeioVar != null) {
            eekkVar.a = eeioVar.clone();
        }
        return eekkVar;
    }

    public final String e() {
        return i("expires");
    }

    public eekk(eeiq eeiqVar, String str, int i, Optional optional, eejd eejdVar) {
        super("Contact");
        this.b = false;
        this.a = f(eeiqVar, str, i);
        optional.isPresent();
        eejc a = eejdVar.a("+sip.instance");
        if (a != null) {
            a.e = "<" + ((String) optional.get()) + ">";
            a.b();
        } else {
            eejc eejcVar = new eejc("+sip.instance", "<" + ((String) optional.get()) + ">");
            eejcVar.b();
            eejdVar.g(eejcVar);
        }
        this.e = eejdVar;
    }

    public eekk(eeiq eeiqVar, String str, int i, Optional optional, String[] strArr) {
        super("Contact");
        this.b = false;
        this.a = f(eeiqVar, str, i);
        if (optional.isPresent()) {
            eejc eejcVar = new eejc("+sip.instance", "<" + ((String) optional.get()) + ">");
            eejcVar.b();
            j(eejcVar);
        }
        for (String str2 : strArr) {
            j(new eejc(str2, null));
        }
    }
}
