package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emmx {
    private static final engw d = engw.C("USD", "INR", "SGD", "GBP", "AED", "EUR", "CAD", "HKD", "JPY", "AUD", "CHF", "KRW", "ZAR", "THB");
    public static final Pattern a = Pattern.compile("([0-9]{1,3}[,\\s]?)*[0-9]{1,3}(\\.[0-9]+)?");
    public static final Pattern b = Pattern.compile("(?i)\\(?(\\$|usd|inr|sgd|gbp|aed|eur|cad|hkd|jpy|aud|chf|krw|jye|zar|thb|rs|cr)[\\.:]?\\)?\\s*[\\{\\(]?(<MONEY_[0-9]+>)[\\}\\)]?");
    public static final Pattern c = Pattern.compile("(?i)[\\{\\(]?(<MONEY_[0-9]+>)[\\}\\)]?\\s*(\\$|usd|inr|sgd|gbp|aed|eur|cad|hkd|jpy|aud|chf|krw|jye|zar|thb|rs|cr)");
    private static final Pattern e = Pattern.compile("\\s|,");

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(engr engrVar, Matcher matcher, HashMap hashMap, int i, int i2) {
        emmw emmwVar;
        while (matcher.find()) {
            if (matcher.groupCount() >= 2 && (emmwVar = (emmw) hashMap.get(matcher.group(i))) != null) {
                try {
                    double parseDouble = Double.parseDouble(e.matcher(emmwVar.c).replaceAll("")) * 1000000.0d;
                    fbuj fbujVar = (fbuj) fbuk.a.createBuilder();
                    int start = matcher.start() - emmwVar.a;
                    fbujVar.copyOnWrite();
                    ((fbuk) fbujVar.instance).h = start;
                    int end = matcher.end() - emmwVar.a;
                    int i3 = emmwVar.b;
                    fbujVar.copyOnWrite();
                    ((fbuk) fbujVar.instance).i = end - i3;
                    fbujVar.copyOnWrite();
                    ((fbuk) fbujVar.instance).f = "MONEY";
                    fbut fbutVar = (fbut) fbuu.a.createBuilder();
                    fcep fcepVar = (fcep) fceq.a.createBuilder();
                    fcepVar.copyOnWrite();
                    ((fceq) fcepVar.instance).b = (long) parseDouble;
                    String upperCase = matcher.group(i2).toUpperCase(Locale.US);
                    String str = "USD";
                    if (!upperCase.startsWith("USD") && !upperCase.startsWith("$")) {
                        String str2 = "INR";
                        if (!upperCase.startsWith("CR") && !upperCase.startsWith("RS") && !upperCase.startsWith("INR")) {
                            str2 = "JPY";
                            if (!upperCase.startsWith("JYE") && !upperCase.startsWith("JPY")) {
                                engw engwVar = d;
                                int i4 = ((enou) engwVar).c;
                                int i5 = 0;
                                while (i5 < i4) {
                                    String str3 = (String) engwVar.get(i5);
                                    i5++;
                                    if (upperCase.startsWith(str3)) {
                                        str = str3;
                                    }
                                }
                                throw new IllegalStateException("Money regex matches unknown currency");
                            }
                        }
                        str = str2;
                    }
                    fcepVar.copyOnWrite();
                    fceq fceqVar = (fceq) fcepVar.instance;
                    str.getClass();
                    fceqVar.c = str;
                    fbutVar.copyOnWrite();
                    fbuu fbuuVar = (fbuu) fbutVar.instance;
                    fceq fceqVar2 = (fceq) fcepVar.build();
                    fceqVar2.getClass();
                    fbuuVar.c = fceqVar2;
                    fbuuVar.b |= 1;
                    fbujVar.copyOnWrite();
                    fbuk fbukVar = (fbuk) fbujVar.instance;
                    fbuu fbuuVar2 = (fbuu) fbutVar.build();
                    fbuuVar2.getClass();
                    fbukVar.d = fbuuVar2;
                    fbukVar.c = 11;
                    engrVar.h((fbuk) fbujVar.build());
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
    }
}
