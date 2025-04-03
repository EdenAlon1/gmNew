package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhcj extends fgwo {
    private static final long serialVersionUID = 5233773091972759919L;
    public fguy c;
    private fgza d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhcj(String str) {
        super(str, new fgwl());
        fguy fguyVar = new fguy(fhbs.f);
        this.c = fguyVar;
        if (fhbs.f.equals(fguyVar.a)) {
            return;
        }
        this.b.b(fguyVar.a);
    }

    @Override // defpackage.fguw
    public String a() {
        return fhev.f(this.c);
    }

    @Override // defpackage.fgwo
    public void c(String str) {
        this.c = new fguy(str, (fhbs) b(VCardConstants.PARAM_VALUE), this.d);
    }

    public void d(fgza fgzaVar) {
        if (this.c == null) {
            throw new UnsupportedOperationException("TimeZone is not applicable to current value");
        }
        this.d = fgzaVar;
        if (!fhbs.f.equals(this.c.a)) {
            throw new UnsupportedOperationException("TimeZone is not applicable to current value");
        }
        this.c.a(fgzaVar);
        this.b.a(b("TZID"));
        this.b.b(new fhbr(fgzaVar.getID()));
    }
}
