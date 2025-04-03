package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djkz extends djla {
    public final dkqc a = new dkqc();
    public boolean b = true;

    @Override // defpackage.djla
    public final void a() {
        dkqc dkqcVar = this.a;
        dkqcVar.d = null;
        dkqcVar.b = null;
        dkqcVar.c = null;
    }

    @Override // defpackage.djla
    public final void b(eenl eenlVar) {
        String str;
        String j = eenlVar.j("WWW-Authenticate");
        String j2 = eenlVar.j("Authentication-Info");
        if (j != null) {
            try {
                this.a.b = eenlVar.k("WWW-Authenticate", "realm");
                this.a.e = eenlVar.k("WWW-Authenticate", "qop");
                this.a.d = eenlVar.k("WWW-Authenticate", "nonce");
                return;
            } catch (Exception e) {
                dkty.i(e, "Can't read the WWW-Authenticate header", new Object[0]);
                throw new djkg("Can't read the security header: ".concat(String.valueOf(e.getMessage())), e);
            }
        }
        if (j2 == null) {
            if (this.b) {
                a();
                return;
            }
            return;
        }
        try {
            dkqc dkqcVar = this.a;
            eehk eehkVar = dkut.a;
            int indexOf = j2.indexOf("nextnonce=");
            if (indexOf != -1) {
                int indexOf2 = j2.indexOf(",", indexOf);
                if (indexOf2 == -1) {
                    indexOf2 = j2.length();
                }
                str = j2.substring(indexOf + 11, indexOf2 - 1);
            } else {
                str = null;
            }
            dkqcVar.d = str;
        } catch (Exception e2) {
            dkty.i(e2, "Can't read the authentication-info header", new Object[0]);
            throw new djkg("Can't read the security header".concat(String.valueOf(e2.getMessage())), e2);
        }
    }
}
