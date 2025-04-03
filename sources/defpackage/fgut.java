package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgut implements Serializable {
    private static final long serialVersionUID = 4943193483665822201L;
    public String a;
    public fgyw b;

    protected fgut(String str, fgyw fgywVar) {
        this.a = str;
        this.b = fgywVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fgwo a(String str) {
        fgyw fgywVar = this.b;
        int size = fgywVar.size();
        int i = 0;
        while (i < size) {
            fgwo fgwoVar = (fgwo) fgywVar.get(i);
            i++;
            if (fgwoVar.a.equalsIgnoreCase(str)) {
                return fgwoVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fgyw b(String str) {
        fgyw fgywVar = this.b;
        fgyw fgywVar2 = new fgyw();
        int size = fgywVar.size();
        for (int i = 0; i < size; i++) {
            fgwo fgwoVar = (fgwo) fgywVar.get(i);
            if (fgwoVar.a.equalsIgnoreCase(str)) {
                fgywVar2.add(fgwoVar);
            }
        }
        return fgywVar2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fgut)) {
            return super.equals(obj);
        }
        fgut fgutVar = (fgut) obj;
        fhoz fhozVar = new fhoz();
        fhozVar.c(this.a, fgutVar.a);
        fhozVar.c(this.b, fgutVar.b);
        return fhozVar.a;
    }

    public int hashCode() {
        fhpa fhpaVar = new fhpa();
        fhpaVar.c(this.a);
        fhpaVar.c(this.b);
        return fhpaVar.a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("BEGIN:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        stringBuffer.append(this.b);
        stringBuffer.append("END:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        return stringBuffer.toString();
    }

    protected fgut(String str) {
        this(str, new fgyw());
    }
}
