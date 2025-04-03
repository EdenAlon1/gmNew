package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffpa implements Serializable {
    private final Pattern a;

    public ffpa(Pattern pattern) {
        this.a = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.a.pattern();
        pattern.getClass();
        return new ffox(pattern, this.a.flags());
    }

    public final String a(CharSequence charSequence, String str) {
        charSequence.getClass();
        String replaceAll = this.a.matcher(charSequence).replaceAll(str);
        replaceAll.getClass();
        return replaceAll;
    }

    public final ffos b(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new ffov(matcher, charSequence);
        }
        return null;
    }

    public final boolean c(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).find();
    }

    public final boolean d(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).matches();
    }

    public final ffos e(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        return ffpb.a(matcher, 0, charSequence);
    }

    public final List f(CharSequence charSequence) {
        Matcher matcher = this.a.matcher(charSequence);
        if (!matcher.find()) {
            return ffdx.b(charSequence);
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(charSequence.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String pattern = this.a.toString();
        pattern.getClass();
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ffpa(java.lang.String r1) {
        /*
            r0 = this;
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffpa.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ffpa(java.lang.String r1, byte[] r2) {
        /*
            r0 = this;
            r2 = 66
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
            r1.getClass()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffpa.<init>(java.lang.String, byte[]):void");
    }
}
