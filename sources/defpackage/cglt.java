package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.util.Linkify;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cglt {
    public static final /* synthetic */ int a = 0;
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/linkify/LinkifyTextUtil");
    private static final String[] c = {"http://", "https://", "rtsp://"};

    public static Optional a(CharSequence charSequence) {
        if (charSequence == null) {
            return Optional.empty();
        }
        List c2 = c(charSequence);
        return c2.size() != 1 ? Optional.empty() : Optional.of((String) c2.get(0));
    }

    public static String b(String str) {
        boolean z;
        String[] strArr = c;
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            String str3 = str;
            if (str3.regionMatches(true, 0, str2, 0, str2.length())) {
                z = true;
                str = !str3.regionMatches(false, 0, str2, 0, str2.length()) ? String.valueOf(str2).concat(String.valueOf(str3.substring(str2.length()))) : str3;
            } else {
                i++;
                str = str3;
            }
        }
        return !z ? String.valueOf(c[0]).concat(String.valueOf(str)) : str;
    }

    public static List c(CharSequence charSequence) {
        return (List) Collection.EL.stream(d(charSequence)).map(new Function() { // from class: cglq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = cglt.a;
                return ((cgls) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: cglr
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
    }

    public static List d(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            Linkify.addLinks(valueOf, 1);
            for (ClickableSpan clickableSpan : (ClickableSpan[]) valueOf.getSpans(0, valueOf.length(), ClickableSpan.class)) {
                try {
                    cgls cglsVar = new cgls();
                    cglsVar.a = valueOf.subSequence(valueOf.getSpanStart(clickableSpan), valueOf.getSpanEnd(clickableSpan)).toString();
                    cglsVar.b = valueOf.getSpanStart(clickableSpan);
                    cglsVar.c = valueOf.getSpanEnd(clickableSpan);
                    arrayList.add(cglsVar);
                } catch (IndexOutOfBoundsException e) {
                    ensk j = b.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/linkify/LinkifyTextUtil", "extractWebUrlsWithPosition", 75, "LinkifyTextUtil.java")).t("TextUtil: Failed to extract url: %s", e);
                }
            }
        }
        return arrayList;
    }
}
