package defpackage;

import android.text.TextUtils;
import android.util.Patterns;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoqw {
    private final fazb k;
    private final fazb l;
    private static final emyl b = emys.a(new emyl() { // from class: aoqp
        @Override // defpackage.emyl
        public final Object get() {
            emyl emylVar = aoqw.a;
            return Pattern.compile("[;,N].*|^\\*67|[^\\d*#+a-zA-Z]+");
        }
    });
    public static final emyl a = emys.a(new emyl() { // from class: aoqq
        @Override // defpackage.emyl
        public final Object get() {
            emyl emylVar = aoqw.a;
            return Pattern.compile("\\p{C}");
        }
    });
    private static final csjp c = new csjp(TimeUnit.SECONDS.toMillis(10));
    private static final emyl d = emys.a(new emyl() { // from class: aoqr
        @Override // defpackage.emyl
        public final Object get() {
            emyl emylVar = aoqw.a;
            return Pattern.compile("[\\d*#+]+");
        }
    });
    private static final cskc e = cskc.g("Bugle", "MessagingIdentitySanitizer");
    private static final Pattern f = Pattern.compile("\\A[ -~[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd\u30000-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]+?@([0-9a-zA-Z:\\-\\(\\)\\[\\]]+\\.)*[0-9a-zA-Z:\\-\\(\\)\\[\\]]*?[a-zA-Z:\\-\\(\\)\\[\\]][0-9a-zA-Z:\\-\\(\\)\\[\\]]*\\z");
    private static final emyl g = emys.a(new emyl() { // from class: aoqs
        @Override // defpackage.emyl
        public final Object get() {
            emyl emylVar = aoqw.a;
            return Pattern.compile("@([0-9a-zA-Z:\\-\\(\\)\\[\\]]+\\.)*[0-9a-zA-Z:\\-\\(\\)\\[\\]]*?[a-zA-Z:\\-\\(\\)\\[\\]][0-9a-zA-Z:\\-\\(\\)\\[\\]]*\\z");
        }
    });
    private static final emyl h = emys.a(new emyl() { // from class: aoqt
        @Override // defpackage.emyl
        public final Object get() {
            emyl emylVar = aoqw.a;
            return Pattern.compile("^\\+\\d{1,3}\\s");
        }
    });
    private static final emyl i = emys.a(new emyl() { // from class: aoqu
        @Override // defpackage.emyl
        public final Object get() {
            emyl emylVar = aoqw.a;
            return Pattern.compile("^\\+(\\d{1,3})\\s.*");
        }
    });
    private static final emyl j = emys.a(new emyl() { // from class: aoqv
        @Override // defpackage.emyl
        public final Object get() {
            emyl emylVar = aoqw.a;
            return Pattern.compile("^\\+(\\d{1,3})\\s(.*)");
        }
    });

    public aoqw(fazb fazbVar, fazb fazbVar2) {
        this.k = fazbVar;
        this.l = fazbVar2;
    }

    public static String c(String str) {
        if (!h(str)) {
            return "";
        }
        Matcher matcher = ((Pattern) g.get()).matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String group = matcher.group();
        return group.length() > 1 ? group.substring(1) : "";
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char c2 : str.toCharArray()) {
            int digit = Character.digit(c2, 10);
            if (digit != -1) {
                sb.append(digit);
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    static String f(String str) {
        return ((Pattern) h.get()).matcher(str).replaceFirst("");
    }

    public static boolean g(String str) {
        String f2 = f(str);
        boolean z = !TextUtils.isEmpty(f2) && Character.isAlphabetic(Character.codePointAt(f2, 0));
        int i2 = 0;
        int i3 = 0;
        for (char c2 : f2.toCharArray()) {
            if (Character.isDigit(c2)) {
                i2++;
            } else if (!Character.isWhitespace(c2) && Character.getType(c2) != 20) {
                i3++;
            }
        }
        if (i2 < 3 || i3 >= i2) {
            return true;
        }
        return z && i2 <= 6;
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str) || str.length() > 254) {
            return false;
        }
        return f.matcher(str).find();
    }

    @Deprecated
    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String replace = f(str).replace("-", "");
        if (g(replace) || replace.length() <= 6) {
            return true;
        }
        if (replace.length() <= 8) {
            return replace.startsWith("19") || replace.startsWith("9");
        }
        return false;
    }

    public final Optional a(String str) {
        Matcher matcher = ((Pattern) i.get()).matcher(str);
        return matcher.find() ? Optional.ofNullable(matcher.group(1)).map(new Function() { // from class: aoqo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                emyl emylVar = aoqw.a;
                return new ctvf(Integer.parseInt((String) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }) : Optional.empty();
    }

    public final Optional b(String str) {
        Matcher matcher = ((Pattern) j.get()).matcher(str);
        return matcher.find() ? Optional.ofNullable(matcher.group(2)) : Optional.empty();
    }

    public final String e(String str) {
        if (TextUtils.isEmpty(str) || str.trim().length() == 0) {
            return "";
        }
        String d2 = d(str);
        if (h(d2)) {
            return str;
        }
        if (j(d2)) {
            emxf.a(j(d2));
            if (TextUtils.isEmpty(d2)) {
                return "";
            }
            String replace = !g(d2) ? d2.replace("-", "") : d2;
            if (!TextUtils.isEmpty(replace)) {
                return replace;
            }
            csjb b2 = e.b();
            b2.I("short code could not be sanitized.");
            b2.k(d2);
            b2.r();
            return d2;
        }
        String B = ((ctvb) this.k.b()).B(((Pattern) b.get()).matcher(d2).replaceAll(""), esfi.E164);
        if (!B.equals(str)) {
            csjb a2 = e.a();
            a2.K(c, str);
            a2.I("sanitize");
            a2.k(str);
            a2.I("to");
            a2.k(B);
            a2.r();
        }
        if (!TextUtils.isEmpty(B)) {
            return B;
        }
        csjb b3 = e.b();
        b3.I("could not sanitize");
        b3.k(str);
        b3.r();
        return str;
    }

    public final boolean i(final String str) {
        return ((Boolean) ((Optional) this.l.b()).map(new Function() { // from class: aoqn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                emyl emylVar = aoqw.a;
                return Boolean.valueOf(((cjdk) obj).r().equals(str));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    public final boolean k(String str) {
        String e2 = e(str);
        if (TextUtils.isEmpty(e2)) {
            return false;
        }
        return Patterns.PHONE.matcher(e2).matches() || ((Pattern) d.get()).matcher(e2).matches();
    }

    public final boolean l(String str) {
        return ((Pattern) i.get()).matcher(str).matches();
    }
}
