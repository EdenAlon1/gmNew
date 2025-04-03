package defpackage;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emmu {
    public static final Pattern a = Pattern.compile("(?i)(account|acct|ac|A/C)\\s*((number|no|n)\\.?\\s+)?([\\*X0-9]+[0-9]{4,})");
    public static final Pattern b = Pattern.compile("(?i)([0-9]{4,}[*X]{4,}[0-9]{4,})");

    public static List a(Pattern pattern, String str, int i) {
        Matcher matcher = pattern.matcher(str);
        int i2 = engw.d;
        engr engrVar = new engr();
        while (matcher.find()) {
            if (matcher.groupCount() >= i) {
                fbuj fbujVar = (fbuj) fbuk.a.createBuilder();
                int start = matcher.start(i);
                fbujVar.copyOnWrite();
                ((fbuk) fbujVar.instance).h = start;
                int end = matcher.end(i);
                fbujVar.copyOnWrite();
                ((fbuk) fbujVar.instance).i = end;
                fbqt fbqtVar = fbqt.SIMPLE_ANNOTATION;
                fbujVar.copyOnWrite();
                ((fbuk) fbujVar.instance).e = fbqtVar.a();
                fbujVar.copyOnWrite();
                ((fbuk) fbujVar.instance).f = "ACCOUNT_NUMBER";
                fbws fbwsVar = (fbws) fbwt.a.createBuilder();
                String group = matcher.group(i);
                fbwsVar.copyOnWrite();
                fbwt fbwtVar = (fbwt) fbwsVar.instance;
                group.getClass();
                fbwtVar.b = group;
                fbwt fbwtVar2 = (fbwt) fbwsVar.build();
                fbujVar.copyOnWrite();
                fbuk fbukVar = (fbuk) fbujVar.instance;
                fbwtVar2.getClass();
                fbukVar.d = fbwtVar2;
                fbukVar.c = 13;
                engrVar.h((fbuk) fbujVar.build());
            }
        }
        return engrVar.g();
    }
}
