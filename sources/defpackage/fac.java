package defpackage;

import android.view.inputmethod.HandwritingGesture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fac {
    public static final int a(HandwritingGesture handwritingGesture, ffji ffjiVar) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        ffjiVar.invoke(new juc(fallbackText, 1));
        return 5;
    }

    public static final void b(long j, jlm jlmVar, boolean z, ffji ffjiVar) {
        if (z) {
            int e = jpm.e(j);
            int a = jpm.a(j);
            int codePointBefore = e > 0 ? Character.codePointBefore(jlmVar, e) : 10;
            int codePointAt = a < jlmVar.a() ? Character.codePointAt(jlmVar, a) : 10;
            if (fae.i(codePointBefore) && (fae.h(codePointAt) || fae.g(codePointAt))) {
                do {
                    e -= Character.charCount(codePointBefore);
                    if (e == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(jlmVar, e);
                    }
                } while (fae.i(codePointBefore));
                j = jpn.a(e, a);
            } else if (fae.i(codePointAt) && (fae.h(codePointBefore) || fae.g(codePointBefore))) {
                do {
                    a += Character.charCount(codePointAt);
                    if (a == jlmVar.a()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(jlmVar, a);
                    }
                } while (fae.i(codePointAt));
                j = jpn.a(e, a);
            }
        }
        ffjiVar.invoke(new fad(new juk[]{new jvr(jpm.a(j), jpm.a(j)), new jui(jpm.b(j), 0)}));
    }

    public static final void c(int i, String str, ffji ffjiVar) {
        ffjiVar.invoke(new fad(new juk[]{new jvr(i, i), new juc(str, 1)}));
    }

    public static final void d(long j, fhi fhiVar, ffji ffjiVar) {
        ffjiVar.invoke(new jvr(jpm.e(j), jpm.a(j)));
        if (fhiVar != null) {
            fhiVar.i(true);
        }
    }

    public static final int e(int i) {
        return i != 1 ? 0 : 1;
    }
}
