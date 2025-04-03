package defpackage;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxq {
    public static final float a(long j, float f, jzn jznVar) {
        float a;
        long c = kak.c(j);
        if (kam.b(c, 4294967296L)) {
            if (jznVar.ed() <= 1.05d) {
                return jznVar.el(j);
            }
            a = kak.a(j) / kak.a(jznVar.es(f));
        } else {
            if (!kam.b(c, 8589934592L)) {
                return Float.NaN;
            }
            a = kak.a(j);
        }
        return a * f;
    }

    public static final jou b(jou jouVar, jou jouVar2) {
        return jouVar == null ? jouVar2 : jouVar.d(jouVar2);
    }

    public static final void c(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            g(spannable, new BackgroundColorSpan(iby.b(j)), i, i2);
        }
    }

    public static final void d(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            g(spannable, new ForegroundColorSpan(iby.b(j)), i, i2);
        }
    }

    public static final void e(Spannable spannable, long j, jzn jznVar, int i, int i2) {
        long c = kak.c(j);
        if (kam.b(c, 4294967296L)) {
            g(spannable, new AbsoluteSizeSpan(ffln.b(jznVar.el(j)), false), i, i2);
        } else if (kam.b(c, 8589934592L)) {
            g(spannable, new RelativeSizeSpan(kak.a(j)), i, i2);
        }
    }

    public static final void f(Spannable spannable, jws jwsVar, int i, int i2) {
        if (jwsVar != null) {
            ArrayList arrayList = new ArrayList(ffdx.n(jwsVar, 10));
            Iterator<E> it = jwsVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((jwq) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            g(spannable, new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2);
        }
    }

    public static final void g(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }
}
