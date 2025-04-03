package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgum implements Serializable {
    private static final long serialVersionUID = -1654118204678581940L;
    public final fgyw a;
    public final fguv b;

    public fgum() {
        fgyw fgywVar = new fgyw();
        fguv fguvVar = new fguv();
        this.a = fgywVar;
        this.b = fguvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fgut a() {
        fguv fguvVar = this.b;
        int size = fguvVar.size();
        int i = 0;
        while (i < size) {
            fgut fgutVar = (fgut) fguvVar.get(i);
            i++;
            if (fgutVar.a.equals("VTIMEZONE")) {
                return fgutVar;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fgum)) {
            return super.equals(obj);
        }
        fgum fgumVar = (fgum) obj;
        fhoz fhozVar = new fhoz();
        fhozVar.c(this.a, fgumVar.a);
        fhozVar.c(this.b, fgumVar.b);
        return fhozVar.a;
    }

    public final int hashCode() {
        fhpa fhpaVar = new fhpa();
        fhpaVar.c(this.a);
        fhpaVar.c(this.b);
        return fhpaVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("BEGIN:VCALENDAR\r\n");
        stringBuffer.append(this.a);
        stringBuffer.append(this.b);
        stringBuffer.append("END:VCALENDAR\r\n");
        return stringBuffer.toString();
    }
}
