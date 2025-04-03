package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes9.dex */
final class w {
    private DateTimeFormatter a;
    private boolean b = true;
    private boolean c = true;
    private final ArrayList d;
    private ArrayList e;

    w(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.a = dateTimeFormatter;
        arrayList.add(new C());
    }

    static boolean c(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    private C e() {
        return (C) this.d.get(r0.size() - 1);
    }

    final void a(p pVar) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(pVar);
    }

    final boolean b(char c, char c2) {
        return this.b ? c == c2 : c(c, c2);
    }

    final w d() {
        w wVar = new w(this.a);
        wVar.b = this.b;
        wVar.c = this.c;
        return wVar;
    }

    final void f(boolean z) {
        ArrayList arrayList = this.d;
        if (z) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    final DecimalStyle g() {
        return this.a.b();
    }

    final Chronology h() {
        Chronology chronology = e().c;
        if (chronology != null) {
            return chronology;
        }
        Chronology a = this.a.a();
        return a == null ? j$.time.chrono.r.e : a;
    }

    final Locale i() {
        return this.a.c();
    }

    final Long j(ChronoField chronoField) {
        return (Long) e().a.get(chronoField);
    }

    final boolean k() {
        return this.b;
    }

    final boolean l() {
        return this.c;
    }

    final void m(boolean z) {
        this.b = z;
    }

    final void n(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        e().b = zoneId;
    }

    final int o(TemporalField temporalField, long j, int i, int i2) {
        Objects.a(temporalField, "field");
        Long l = (Long) e().a.put(temporalField, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    final void p() {
        e().d = true;
    }

    final void q(boolean z) {
        this.c = z;
    }

    final void r() {
        ArrayList arrayList = this.d;
        C e = e();
        e.getClass();
        C c = new C();
        c.a.putAll(e.a);
        c.b = e.b;
        c.c = e.c;
        c.d = e.d;
        arrayList.add(c);
    }

    final boolean s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 <= charSequence.length() && i2 + i3 <= charSequence2.length()) {
            if (this.b) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (charSequence.charAt(i + i4) == charSequence2.charAt(i2 + i4)) {
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                char charAt = charSequence.charAt(i + i5);
                char charAt2 = charSequence2.charAt(i2 + i5);
                if (charAt == charAt2 || Character.toUpperCase(charAt) == Character.toUpperCase(charAt2) || Character.toLowerCase(charAt) == Character.toLowerCase(charAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    final TemporalAccessor t(D d) {
        C e = e();
        e.c = h();
        ZoneId zoneId = e.b;
        if (zoneId == null) {
            zoneId = this.a.d();
        }
        e.b = zoneId;
        e.h(d);
        return e;
    }

    public final String toString() {
        return e().toString();
    }
}
