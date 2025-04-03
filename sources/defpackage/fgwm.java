package defpackage;

import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwm extends fguz implements Comparable {
    private static final long serialVersionUID = 7321090422911676490L;
    private fgvd c;

    public fgwm(String str) {
        super(c(str), b(str, true));
        try {
            b(str, false);
        } catch (ParseException unused) {
            this.c = d(str);
        }
        if (((fgvb) this.a).c()) {
            ((fgvb) this.b).b(true);
            return;
        }
        ((fgvb) this.b).a(((fgvb) this.a).a);
    }

    private static fgvb b(String str, boolean z) {
        try {
            return new fgvb(str.substring(str.indexOf(47) + 1));
        } catch (ParseException e) {
            if (z) {
                return new fgvb(d(str).b(c(str)));
            }
            throw e;
        }
    }

    private static fgvb c(String str) {
        return new fgvb(str.substring(0, str.indexOf(47)));
    }

    private static fgvd d(String str) {
        return new fgvd(str.substring(str.indexOf(47) + 1));
    }

    public final fgvd a() {
        fgvd fgvdVar = this.c;
        return fgvdVar == null ? new fgvd(this.a, this.b) : fgvdVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fgwm fgwmVar = (fgwm) obj;
        if (fgwmVar == null) {
            throw new ClassCastException("Cannot compare this object to null");
        }
        int compareTo = ((fgvb) this.a).compareTo(fgwmVar.a);
        if (compareTo != 0) {
            return compareTo;
        }
        if (this.c == null) {
            int compareTo2 = ((fgvb) this.b).compareTo(fgwmVar.b);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return a().a(fgwmVar.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgwm)) {
            return false;
        }
        fgwm fgwmVar = (fgwm) obj;
        fhoz fhozVar = new fhoz();
        fhozVar.c(this.a, fgwmVar.a);
        fhozVar.c(this.b, fgwmVar.b);
        return fhozVar.a;
    }

    public final int hashCode() {
        fhpa fhpaVar = new fhpa();
        fhpaVar.c(this.a);
        Object obj = this.c;
        if (obj == null) {
            obj = this.b;
        }
        fhpaVar.c(obj);
        return fhpaVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append('/');
        fgvd fgvdVar = this.c;
        if (fgvdVar == null) {
            stringBuffer.append(this.b);
        } else {
            stringBuffer.append(fgvdVar);
        }
        return stringBuffer.toString();
    }
}
