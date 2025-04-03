package defpackage;

import com.google.android.ims.provisioning.config.ImsConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkqu {
    private final dkqc a = new dkqc();
    private final ImsConfiguration b;

    public dkqu(ImsConfiguration imsConfiguration) {
        this.b = imsConfiguration;
    }

    public final void a(eenl eenlVar) {
        if (eenlVar == null) {
            throw new IllegalArgumentException("SIP response must not be null");
        }
        if (eenlVar.j("Proxy-Authenticate") != null) {
            this.a.b = eenlVar.k("Proxy-Authenticate", "realm");
            this.a.e = eenlVar.k("Proxy-Authenticate", "qop");
            this.a.d = eenlVar.k("Proxy-Authenticate", "nonce");
        }
    }

    public final void b(eenk eenkVar) {
        dkqc dkqcVar = this.a;
        if (dkqcVar.b == null || dkqcVar.d == null) {
            return;
        }
        try {
            dkqcVar.c();
            ImsConfiguration imsConfiguration = this.b;
            String b = this.a.b(imsConfiguration.mAuthDigestUsername, imsConfiguration.mAuthDigestPassword, eenkVar.z(), eenkVar.A(), this.a.a(), eenkVar.g());
            String str = this.b.mAuthDigestUsername;
            String A = eenkVar.A();
            dkqc dkqcVar2 = this.a;
            String str2 = dkqcVar2.b;
            String a = dkqcVar2.a();
            dkqc dkqcVar3 = this.a;
            String str3 = "Proxy-Authorization: Digest username=\"" + str + "\",uri=\"" + A + "\",algorithm=MD5,realm=\"" + str2 + "\",nc=" + a + ",nonce=\"" + dkqcVar3.c + "\",response=\"" + b + "\",cnonce=\"" + dkqcVar3.a + "\"";
            String str4 = this.a.e;
            if (str4 != null) {
                str3 = a.w(str4, str3, ",qop=");
            }
            eenkVar.r(str3);
        } catch (Exception e) {
            dkty.i(e, "Can't create the proxy authorization header", new Object[0]);
            throw new IllegalArgumentException("Can't create the proxy authorization header");
        }
    }
}
