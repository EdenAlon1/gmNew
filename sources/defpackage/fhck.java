package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhck extends fgwo {
    private static final long serialVersionUID = 3160883132732961321L;
    public fgux c;
    private fgza d;

    public fhck(String str) {
        super(str);
    }

    private final void h(fgza fgzaVar) {
        this.d = fgzaVar;
        if (fgzaVar == null) {
            f(g());
            return;
        }
        fgux fguxVar = this.c;
        if (fguxVar != null && !(fguxVar instanceof fgvb)) {
            throw new UnsupportedOperationException("TimeZone is not applicable to current value");
        }
        if (fguxVar != null) {
            ((fgvb) fguxVar).a(fgzaVar);
        }
        this.b.b(new fhbr(fgzaVar.getID()));
    }

    @Override // defpackage.fguw
    public String a() {
        return fhev.f(this.c);
    }

    @Override // defpackage.fgwo
    public void c(String str) {
        String trim = str.trim();
        if (trim.length() != 8 && !fhbs.e.equals(b(VCardConstants.PARAM_VALUE))) {
            this.c = new fgvb(trim, this.d);
        } else {
            h(null);
            this.c = new fgux(trim);
        }
    }

    public final void d(fgux fguxVar) {
        this.c = fguxVar;
        if (fguxVar instanceof fgvb) {
            if (fhbs.e.equals(b(VCardConstants.PARAM_VALUE))) {
                this.b.b(fhbs.f);
            }
            h(((fgvb) fguxVar).a);
        } else {
            if (fguxVar != null) {
                this.b.b(fhbs.e);
            }
            h(null);
        }
    }

    public void e(fgza fgzaVar) {
        h(fgzaVar);
    }

    public final void f(boolean z) {
        fgux fguxVar = this.c;
        if (fguxVar != null && (fguxVar instanceof fgvb)) {
            ((fgvb) fguxVar).b(z);
        }
        this.b.a(b("TZID"));
    }

    public final boolean g() {
        fgux fguxVar = this.c;
        if (fguxVar instanceof fgvb) {
            return ((fgvb) fguxVar).c();
        }
        return false;
    }

    @Override // defpackage.fgwo
    public final int hashCode() {
        return this.c.hashCode();
    }
}
