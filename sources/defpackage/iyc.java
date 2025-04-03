package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyc extends iyb {
    public static iyc b;
    public final BreakIterator c;

    public iyc(Locale locale) {
        this.c = BreakIterator.getCharacterInstance(locale);
    }

    @Override // defpackage.iyg
    public final int[] c(int i) {
        int length = a().length();
        if (length > 0 && i < length) {
            if (i < 0) {
                i = 0;
            }
            while (true) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    ffkj.c("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.c;
                    if (breakIterator2 == null) {
                        ffkj.c("impl");
                        breakIterator2 = null;
                    }
                    int following = breakIterator2.following(i);
                    if (following != -1) {
                        return b(i, following);
                    }
                } else {
                    BreakIterator breakIterator3 = this.c;
                    if (breakIterator3 == null) {
                        ffkj.c("impl");
                        breakIterator3 = null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.iyg
    public final int[] d(int i) {
        int length = a().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (true) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    ffkj.c("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.c;
                    if (breakIterator2 == null) {
                        ffkj.c("impl");
                        breakIterator2 = null;
                    }
                    int preceding = breakIterator2.preceding(i);
                    if (preceding != -1) {
                        return b(preceding, i);
                    }
                } else {
                    BreakIterator breakIterator3 = this.c;
                    if (breakIterator3 == null) {
                        ffkj.c("impl");
                        breakIterator3 = null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        break;
                    }
                }
            }
        }
        return null;
    }
}
