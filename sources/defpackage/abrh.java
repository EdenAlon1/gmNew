package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrh {
    private final ffbr d;
    private static final entd c = entd.c("ConvMatchingAlgoUtils");
    public static final Pattern a = Pattern.compile("\\D");
    public static final int b = ayvs.a();

    public abrh(ffbr ffbrVar) {
        this.d = ffbrVar;
    }

    public static boolean d(char c2) {
        return (c2 >= '0' && c2 <= '9') || c2 == '*' || c2 == '#' || c2 == '+';
    }

    public final String a(String str, ayvm ayvmVar) {
        try {
            str = String.valueOf(((esfl) this.d.b()).n(str, "").b());
        } catch (esfg unused) {
            ensk n = c.n();
            n.W(1, TimeUnit.MINUTES);
            ((ensz) n.h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/ConversationMatchingAlgorithmsUtils", "getPossibleShortCode", 124, "ConversationMatchingAlgorithmsUtils.java")).t("The given destination to determine if shortcode %s cant be parsed", new ayvh(ayvmVar, str));
        }
        if (aoqw.j(str)) {
            return str;
        }
        return null;
    }

    public final HashMap b(final bseh bsehVar, List list, final ayvm ayvmVar) {
        return (HashMap) Collection.EL.stream(list).map(new Function() { // from class: abrd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                abrh abrhVar = abrh.this;
                String str = (String) obj;
                if (abrhVar.c(str, bsehVar)) {
                    return "";
                }
                String a2 = abrhVar.a(str, ayvmVar);
                if (a2 != null) {
                    return a2;
                }
                String trim = abrh.a.matcher(str).replaceAll("").trim();
                return trim.length() >= abrh.b ? trim.substring(Math.max(0, trim.length() - abrh.b)) : trim;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: abre
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Pattern pattern = abrh.a;
                return !TextUtils.isEmpty((String) obj);
            }
        }).collect(Collectors.groupingBy(Function$CC.identity(), new Supplier() { // from class: abrf
            @Override // java.util.function.Supplier
            public final Object get() {
                return new HashMap();
            }
        }, Collectors.summingInt(new ToIntFunction() { // from class: abrg
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                Pattern pattern = abrh.a;
                return 1;
            }
        })));
    }

    public final boolean c(String str, bseh bsehVar) {
        return TextUtils.equals(str, "ʼUNKNOWN_SENDER!ʼ") || TextUtils.equals(str, "ʼWAP_PUSH_SI!ʼ") || aoqw.h(str) || bsehVar.am() || aojl.a(str) || aojl.b(str);
    }
}
