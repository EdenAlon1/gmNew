package defpackage;

import com.android.vcard.VCardBuilder;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgwo extends fguw {
    private static final long serialVersionUID = 7048785558435608687L;
    public String a;
    public fgwl b;

    protected fgwo(String str, fgwl fgwlVar) {
        this.a = str;
        this.b = fgwlVar;
    }

    public final fgvi b(String str) {
        for (fgvi fgviVar : this.b.a) {
            if (str.equalsIgnoreCase(fgviVar.a)) {
                return fgviVar;
            }
        }
        return null;
    }

    public abstract void c(String str);

    public final boolean equals(Object obj) {
        if (!(obj instanceof fgwo)) {
            return super.equals(obj);
        }
        fgwo fgwoVar = (fgwo) obj;
        if (!this.a.equals(fgwoVar.a)) {
            return false;
        }
        fhoz fhozVar = new fhoz();
        fhozVar.c(a(), fgwoVar.a());
        fhozVar.c(this.b, fgwoVar.b);
        return fhozVar.a;
    }

    public int hashCode() {
        fhpa fhpaVar = new fhpa();
        fhpaVar.c(this.a.toUpperCase());
        fhpaVar.c(a());
        fhpaVar.c(this.b);
        return fhpaVar.a;
    }

    public final String toString() {
        fhbs fhbsVar;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        fgwl fgwlVar = this.b;
        if (fgwlVar != null) {
            stringBuffer.append(fgwlVar);
        }
        stringBuffer.append(':');
        if (!(this instanceof fhek) ? (this instanceof fgve) : (fhbsVar = (fhbs) b(VCardConstants.PARAM_VALUE)) == null || fhbsVar.equals(fhbs.l)) {
            stringBuffer.append(fhev.f(a()));
        } else {
            stringBuffer.append(fhev.a(fhev.f(a())));
        }
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        return stringBuffer.toString();
    }

    protected fgwo(String str) {
        this(str, new fgwl());
    }
}
