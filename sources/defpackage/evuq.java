package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evuq {
    private static final List a;

    static {
        Arrays.asList(".dc", ".dev", ".devel", ".dogfood", ".earlgrey", ".earlgreytestrig", ".enterprise", ".fishfood", ".ios.beta", ".ios.canary", ".ios.dev", ".ios.herebedragons", ".kif", ".nightly", ".prodalpha", ".prodbeta", ".qa", ".rc", ".scary.enterprise", ".scubatestrig", ".weekly");
        a = Arrays.asList(".alpha", ".beta", ".dev", ".devel", ".next", ".nightly", ".qa", ".teamfood", ".teamfood2", ".test", ".staging");
    }

    public static String a(String str) {
        List<String> list = a;
        String str2 = "";
        if (str == null) {
            return "";
        }
        for (String str3 : list) {
            if (str.endsWith(str3) && str3.length() > str2.length()) {
                str2 = str3;
            }
        }
        return str.substring(0, str.length() - str2.length());
    }
}
