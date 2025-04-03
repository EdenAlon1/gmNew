package j$.time.format;

import j$.time.temporal.TemporalField;
import j$.time.temporal.WeekFields;
import java.util.Locale;

/* loaded from: classes9.dex */
final class t extends k {
    private char g;
    private int h;

    t(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, E.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    private k g(Locale locale) {
        TemporalField h;
        WeekFields of = WeekFields.of(locale);
        char c = this.g;
        if (c == 'W') {
            h = of.h();
        } else {
            if (c == 'Y') {
                TemporalField g = of.g();
                int i = this.h;
                if (i == 2) {
                    return new q(g, q.h, this.e);
                }
                return new k(g, i, 19, i < 4 ? E.NORMAL : E.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                h = of.d();
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                h = of.i();
            }
        }
        return new k(h, this.b, this.c, E.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.k
    final k e() {
        if (this.e == -1) {
            return this;
        }
        return new t(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.k
    final k f(int i) {
        int i2 = this.e + i;
        return new t(this.g, this.h, this.b, this.c, i2);
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC0036f
    public final boolean o(y yVar, StringBuilder sb) {
        return g(yVar.c()).o(yVar, sb);
    }

    @Override // j$.time.format.k
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? E.NORMAL : E.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC0036f
    public final int u(w wVar, CharSequence charSequence, int i) {
        return g(wVar.i()).u(wVar, charSequence, i);
    }
}
