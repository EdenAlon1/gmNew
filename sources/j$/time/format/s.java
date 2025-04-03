package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class s implements InterfaceC0036f {
    private final TemporalField a;
    private final TextStyle b;
    private final B c;
    private volatile k d;

    s(TemporalField temporalField, TextStyle textStyle, B b) {
        this.a = temporalField;
        this.b = textStyle;
        this.c = b;
    }

    @Override // j$.time.format.InterfaceC0036f
    public final boolean o(y yVar, StringBuilder sb) {
        String e;
        Long e2 = yVar.e(this.a);
        if (e2 == null) {
            return false;
        }
        Chronology chronology = (Chronology) yVar.d().D(j$.time.temporal.j.e());
        if (chronology == null || chronology == j$.time.chrono.r.e) {
            e = this.c.e(this.a, e2.longValue(), this.b, yVar.c());
        } else {
            e = this.c.d(chronology, this.a, e2.longValue(), this.b, yVar.c());
        }
        if (e != null) {
            sb.append(e);
            return true;
        }
        if (this.d == null) {
            this.d = new k(this.a, 1, 19, E.NORMAL);
        }
        return this.d.o(yVar, sb);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TemporalField temporalField = this.a;
        TextStyle textStyle2 = this.b;
        if (textStyle2 == textStyle) {
            return "Text(" + String.valueOf(temporalField) + ")";
        }
        return "Text(" + String.valueOf(temporalField) + "," + String.valueOf(textStyle2) + ")";
    }

    @Override // j$.time.format.InterfaceC0036f
    public final int u(w wVar, CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        TextStyle textStyle = wVar.l() ? this.b : null;
        Chronology h = wVar.h();
        B b = this.c;
        TemporalField temporalField = this.a;
        Iterator g = (h == null || h == j$.time.chrono.r.e) ? b.g(temporalField, textStyle, wVar.i()) : b.f(h, temporalField, textStyle, wVar.i());
        if (g != null) {
            while (g.hasNext()) {
                Map.Entry entry = (Map.Entry) g.next();
                String str = (String) entry.getKey();
                if (wVar.s(str, 0, charSequence, i, str.length())) {
                    return wVar.o(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (temporalField == ChronoField.ERA && !wVar.l()) {
                Iterator it = h.T().iterator();
                while (it.hasNext()) {
                    String obj = ((j$.time.chrono.l) it.next()).toString();
                    if (wVar.s(obj, 0, charSequence, i, obj.length())) {
                        return wVar.o(this.a, r7.getValue(), i, obj.length() + i);
                    }
                }
            }
            if (wVar.l()) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new k(this.a, 1, 19, E.NORMAL);
        }
        return this.d.u(wVar, charSequence, i);
    }
}
