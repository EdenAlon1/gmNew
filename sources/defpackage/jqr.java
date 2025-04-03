package defpackage;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqr {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final BreakIterator d;

    public jqr(CharSequence charSequence, int i, Locale locale) {
        this.a = charSequence;
        if (charSequence.length() < 0) {
            jwo.b("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            jwo.b("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new jpu(charSequence, i));
    }

    private final boolean i(int i) {
        int i2 = i - 1;
        if (ffkj.e(Character.UnicodeBlock.of(this.a.charAt(i2)), Character.UnicodeBlock.HIRAGANA) && ffkj.e(Character.UnicodeBlock.of(this.a.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return ffkj.e(Character.UnicodeBlock.of(this.a.charAt(i)), Character.UnicodeBlock.HIRAGANA) && ffkj.e(Character.UnicodeBlock.of(this.a.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public final int a(int i) {
        c(i);
        int following = this.d.following(i);
        return (g(following + (-1)) && g(following) && !i(following)) ? a(following) : following;
    }

    public final int b(int i) {
        c(i);
        int preceding = this.d.preceding(i);
        return (g(preceding) && d(preceding) && !i(preceding)) ? b(preceding) : preceding;
    }

    public final void c(int i) {
        if (i > this.c || this.b > i) {
            jwo.b("Invalid offset: " + i + ". Valid range is [" + this.b + " , " + this.c + ']');
        }
    }

    public final boolean d(int i) {
        if (i > this.c || this.b + 1 > i) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.a, i))) {
            return true;
        }
        int i2 = i - 1;
        if (Character.isSurrogate(this.a.charAt(i2))) {
            return true;
        }
        if (!lgl.h()) {
            return false;
        }
        lgl c = lgl.c();
        return c.b() == 1 && c.a(this.a, i2) != -1;
    }

    public final boolean e(int i) {
        if (i > this.c || this.b + 1 > i) {
            return false;
        }
        return jqq.a(Character.codePointBefore(this.a, i));
    }

    public final boolean f(int i) {
        c(i);
        if (!this.d.isBoundary(i)) {
            return false;
        }
        if (g(i) && g(i - 1) && g(i + 1)) {
            return false;
        }
        if (i <= 0 || i >= this.a.length() - 1) {
            return true;
        }
        return (i(i) || i(i + 1)) ? false : true;
    }

    public final boolean g(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.a, i)) || Character.isSurrogate(this.a.charAt(i))) {
            return true;
        }
        if (!lgl.h()) {
            return false;
        }
        lgl c = lgl.c();
        return c.b() == 1 && c.a(this.a, i) != -1;
    }

    public final boolean h(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        return jqq.a(Character.codePointAt(this.a, i));
    }
}
