package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* loaded from: classes9.dex */
class u implements InterfaceC0036f {
    private static volatile AbstractMap.SimpleImmutableEntry c;
    private static volatile AbstractMap.SimpleImmutableEntry d;
    private final j$.time.temporal.m a;
    private final String b;

    u(j$.time.temporal.m mVar, String str) {
        this.a = mVar;
        this.b = str;
    }

    private static int b(w wVar, CharSequence charSequence, int i, int i2, l lVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            wVar.n(ZoneId.of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || wVar.b(charSequence.charAt(i2), 'Z')) {
            wVar.n(ZoneId.of(upperCase));
            return i2;
        }
        w d2 = wVar.d();
        int u = lVar.u(d2, charSequence, i2);
        try {
            if (u >= 0) {
                wVar.n(ZoneId.ofOffset(upperCase, ZoneOffset.ofTotalSeconds((int) d2.j(ChronoField.OFFSET_SECONDS).longValue())));
                return u;
            }
            if (lVar == l.e) {
                return ~i;
            }
            wVar.n(ZoneId.of(upperCase));
            return i2;
        } catch (DateTimeException unused) {
            return ~i;
        }
    }

    protected o a(w wVar) {
        Set a = j$.time.zone.h.a();
        int size = a.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = wVar.k() ? c : d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = wVar.k() ? c : d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), o.g(a, wVar));
                        if (wVar.k()) {
                            c = simpleImmutableEntry;
                        } else {
                            d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (o) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.InterfaceC0036f
    public boolean o(y yVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) yVar.f(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.n());
        return true;
    }

    public final String toString() {
        return this.b;
    }

    @Override // j$.time.format.InterfaceC0036f
    public final int u(w wVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == '+' || charAt == '-') {
            return b(wVar, charSequence, i, i, l.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char charAt2 = charSequence.charAt(i + 1);
            if (wVar.b(charAt, 'U') && wVar.b(charAt2, 'T')) {
                int i4 = i + 3;
                return (length < i4 || !wVar.b(charSequence.charAt(i3), 'C')) ? b(wVar, charSequence, i, i3, l.f) : b(wVar, charSequence, i, i4, l.f);
            }
            if (wVar.b(charAt, 'G') && length >= (i2 = i + 3) && wVar.b(charAt2, 'M') && wVar.b(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length < i5 || !wVar.b(charSequence.charAt(i2), '0')) {
                    return b(wVar, charSequence, i, i2, l.f);
                }
                wVar.n(ZoneId.of("GMT0"));
                return i5;
            }
        }
        o a = a(wVar);
        ParsePosition parsePosition = new ParsePosition(i);
        String d2 = a.d(charSequence, parsePosition);
        if (d2 != null) {
            wVar.n(ZoneId.of(d2));
            return parsePosition.getIndex();
        }
        if (!wVar.b(charAt, 'Z')) {
            return ~i;
        }
        wVar.n(ZoneOffset.UTC);
        return i + 1;
    }
}
