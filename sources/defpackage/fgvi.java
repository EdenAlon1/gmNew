package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgvi extends fguw {
    private static final long serialVersionUID = -2058497904769713528L;
    public final String a;

    public fgvi(String str) {
        this.a = str;
    }

    protected boolean b() {
        return fhev.a.matcher(fhev.f(a())).find();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fgvi)) {
            return super.equals(obj);
        }
        fgvi fgviVar = (fgvi) obj;
        fhoz fhozVar = new fhoz();
        fhozVar.c(this.a, fgviVar.a);
        fhozVar.c(a(), fgviVar.a());
        return fhozVar.a;
    }

    public final int hashCode() {
        fhpa fhpaVar = new fhpa();
        fhpaVar.c(this.a.toUpperCase());
        fhpaVar.c(a());
        return fhpaVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append('=');
        if (b()) {
            stringBuffer.append(fhev.c(fhev.f(a())));
        } else {
            stringBuffer.append(fhev.f(a()));
        }
        return stringBuffer.toString();
    }
}
