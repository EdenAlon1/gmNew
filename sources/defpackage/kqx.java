package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqx {
    public static final kqx a = b(new Locale[0]);
    public final kqy b;

    private kqx(kqy kqyVar) {
        this.b = kqyVar;
    }

    public static kqx b(Locale... localeArr) {
        return d(new LocaleList(localeArr));
    }

    public static kqx c(String str) {
        if (str == null || str.isEmpty()) {
            return a;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i2 = kqw.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return b(localeArr);
    }

    public static kqx d(LocaleList localeList) {
        return new kqx(new kqy(localeList));
    }

    public final int a() {
        int size;
        size = this.b.a.size();
        return size;
    }

    public final String e() {
        String languageTags;
        languageTags = this.b.a.toLanguageTags();
        return languageTags;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kqx) && this.b.equals(((kqx) obj).b);
    }

    public final Locale f(int i) {
        Locale locale;
        locale = this.b.a.get(i);
        return locale;
    }

    public final boolean g() {
        boolean isEmpty;
        isEmpty = this.b.a.isEmpty();
        return isEmpty;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
