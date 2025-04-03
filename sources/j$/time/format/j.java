package j$.time.format;

import j$.time.chrono.Chronology;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* loaded from: classes9.dex */
final class j implements InterfaceC0036f {
    private static final ConcurrentHashMap c = new ConcurrentHashMap(16, 0.75f, 2);
    private final FormatStyle a;
    private final FormatStyle b;

    j(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.a = formatStyle;
        this.b = formatStyle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DateTimeFormatter a(Locale locale, Chronology chronology) {
        String n = chronology.n();
        String locale2 = locale.toString();
        FormatStyle formatStyle = this.a;
        String valueOf = String.valueOf(formatStyle);
        FormatStyle formatStyle2 = this.b;
        String str = n + "|" + locale2 + "|" + valueOf + String.valueOf(formatStyle2);
        ConcurrentHashMap concurrentHashMap = c;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(str);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(formatStyle, formatStyle2, chronology, locale);
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.k(localizedDateTimePattern);
        DateTimeFormatter A = dateTimeFormatterBuilder.A(locale);
        DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(str, A);
        return dateTimeFormatter2 != null ? dateTimeFormatter2 : A;
    }

    @Override // j$.time.format.InterfaceC0036f
    public final boolean o(y yVar, StringBuilder sb) {
        a(yVar.c(), Chronology.CC.a(yVar.d())).g().o(yVar, sb);
        return true;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            obj = "";
        }
        String valueOf = String.valueOf(obj);
        Object obj2 = this.b;
        return "Localized(" + valueOf + "," + String.valueOf(obj2 != null ? obj2 : "") + ")";
    }

    @Override // j$.time.format.InterfaceC0036f
    public final int u(w wVar, CharSequence charSequence, int i) {
        return a(wVar.i(), wVar.h()).g().u(wVar, charSequence, i);
    }
}
