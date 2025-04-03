package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzyi {
    static ParcelableSpan a(Context context, int i, String str) {
        try {
            return new dzyc(kpp.b(context, i));
        } catch (Resources.NotFoundException | IllegalArgumentException e) {
            dyhr.g("RichTextConvUtil", "Failed to load font", e);
            return new TypefaceSpan(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static emxc b(Context context, dzrr dzrrVar) {
        switch (dzrrVar.b().ordinal()) {
            case 1:
                return emxc.j(new StyleSpan(1));
            case 2:
                return emxc.j(new StyleSpan(2));
            case 3:
                return emxc.j(new UnderlineSpan());
            case 4:
                return emxc.j(new StrikethroughSpan());
            case 5:
                return emxc.j(new SuperscriptSpan());
            case 6:
                return emxc.j(new SubscriptSpan());
            case 7:
                if (!fdql.i()) {
                    return emxc.j(new ForegroundColorSpan(dzrrVar.d()));
                }
                break;
            case 8:
                return fdql.i() ? emux.a : emxc.j(new BackgroundColorSpan(dzrrVar.a()));
            case 9:
                return emxc.j(new AbsoluteSizeSpan((int) (dzrrVar.h() * context.getResources().getDisplayMetrics().scaledDensity)));
            case 10:
                engw l = dzrrVar.l();
                int i = ((enou) l).c;
                int i2 = 0;
                while (i2 < i) {
                    int ordinal = ((dzrv) l.get(i2)).ordinal();
                    i2++;
                    switch (ordinal) {
                        case 1:
                            return emxc.j(new TypefaceSpan("sans-serif-light"));
                        case 2:
                        case 8:
                            return emxc.j(new TypefaceSpan("sans-serif"));
                        case 3:
                            return emxc.j(new TypefaceSpan("sans-serif-medium"));
                        case 4:
                            return emxc.j(new TypefaceSpan("sans-serif-black"));
                        case 5:
                            return emxc.j(a(context, R.font.google_sans, "sans-serif"));
                        case 6:
                            return emxc.j(a(context, R.font.google_sans_medium, "sans-serif-medium"));
                    }
                }
                return emux.a;
            case 11:
                int e = dzrrVar.e();
                return emxc.j(new AlignmentSpan.Standard(e != 1 ? e != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER));
            case 12:
                return emxc.j(new URLSpan(((dzof) dzrrVar.f()).a));
        }
        return emux.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.text.SpannableString r2, defpackage.dzrj r3, int r4, defpackage.emxc r5) {
        /*
            boolean r0 = r5.g()
            if (r0 == 0) goto L30
            int r0 = r3.b()
            int r1 = r3.a()
            if (r0 != 0) goto L13
            if (r1 == 0) goto L19
            r0 = 0
        L13:
            if (r0 < 0) goto L30
            if (r0 > r1) goto L30
            if (r1 > r4) goto L30
        L19:
            java.lang.Object r5 = r5.c()
            int r0 = r3.b()
            int r1 = r3.a()
            if (r1 == 0) goto L2b
            int r4 = r3.a()
        L2b:
            r3 = 33
            r2.setSpan(r5, r0, r4, r3)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzyi.c(android.text.SpannableString, dzrj, int, emxc):void");
    }
}
