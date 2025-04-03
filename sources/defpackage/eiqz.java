package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqz {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if ((r2 instanceof com.google.android.setupdesign.GlifLayout ? ((com.google.android.setupdesign.GlifLayout) r2).d() : defpackage.eios.u(r0)) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.widget.TextView r6, defpackage.eiqy r7) {
        /*
            eioq r0 = r7.a
            android.content.Context r1 = r6.getContext()
            if (r0 == 0) goto L23
            eios r0 = defpackage.eios.h(r1)
            eioq r2 = r7.a
            boolean r0 = r0.s(r2)
            if (r0 == 0) goto L23
            eios r0 = defpackage.eios.h(r1)
            eioq r2 = r7.a
            int r0 = r0.c(r1, r2)
            if (r0 == 0) goto L23
            r6.setTextColor(r0)
        L23:
            eioq r0 = r7.b
            if (r0 == 0) goto L61
            eios r0 = defpackage.eios.h(r1)
            eioq r2 = r7.b
            boolean r0 = r0.s(r2)
            if (r0 == 0) goto L61
            android.content.Context r0 = r6.getContext()
            int r2 = defpackage.einu.c     // Catch: java.lang.Throwable -> L52
            android.app.Activity r0 = defpackage.eios.e(r0)     // Catch: java.lang.Throwable -> L52
            com.google.android.setupcompat.internal.TemplateLayout r2 = defpackage.eiqx.b(r0)     // Catch: java.lang.Throwable -> L52
            boolean r3 = r2 instanceof com.google.android.setupdesign.GlifLayout     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L4c
            com.google.android.setupdesign.GlifLayout r2 = (com.google.android.setupdesign.GlifLayout) r2     // Catch: java.lang.Throwable -> L52
            boolean r0 = r2.d()     // Catch: java.lang.Throwable -> L52
            goto L50
        L4c:
            boolean r0 = defpackage.eios.u(r0)     // Catch: java.lang.Throwable -> L52
        L50:
            if (r0 != 0) goto L61
        L52:
            eios r0 = defpackage.eios.h(r1)
            eioq r2 = r7.b
            int r0 = r0.c(r1, r2)
            if (r0 == 0) goto L61
            r6.setLinkTextColor(r0)
        L61:
            eioq r0 = r7.c
            r2 = 0
            if (r0 == 0) goto L84
            eios r0 = defpackage.eios.h(r1)
            eioq r3 = r7.c
            boolean r0 = r0.s(r3)
            if (r0 == 0) goto L84
            eios r0 = defpackage.eios.h(r1)
            eioq r3 = r7.c
            r4 = 0
            float r0 = r0.b(r1, r3, r4)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L84
            r6.setTextSize(r2, r0)
        L84:
            eioq r0 = r7.d
            r3 = 0
            if (r0 == 0) goto La3
            eios r0 = defpackage.eios.h(r1)
            eioq r4 = r7.d
            boolean r0 = r0.s(r4)
            if (r0 == 0) goto La3
            eios r0 = defpackage.eios.h(r1)
            eioq r3 = r7.d
            java.lang.String r0 = r0.j(r1, r3)
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r0, r2)
        La3:
            boolean r0 = defpackage.eios.o(r1)
            if (r0 == 0) goto Lcf
            eioq r0 = r7.e
            if (r0 == 0) goto Lcf
            eios r0 = defpackage.eios.h(r1)
            eioq r4 = r7.e
            boolean r0 = r0.s(r4)
            if (r0 == 0) goto Lcf
            eios r0 = defpackage.eios.h(r1)
            eioq r4 = r7.e
            r5 = 400(0x190, float:5.6E-43)
            int r0 = r0.d(r1, r4, r5)
            if (r3 != 0) goto Lcb
            android.graphics.Typeface r3 = r6.getTypeface()
        Lcb:
            android.graphics.Typeface r3 = defpackage.abj$$ExternalSyntheticApiModelOutline0.m(r3, r0, r2)
        Lcf:
            if (r3 == 0) goto Ld4
            r6.setTypeface(r3)
        Ld4:
            boolean r0 = r6 instanceof com.google.android.setupdesign.view.RichTextView
            if (r0 == 0) goto Lfd
            eioq r0 = r7.f
            if (r0 == 0) goto Lfd
            eios r0 = defpackage.eios.h(r1)
            eioq r3 = r7.f
            boolean r0 = r0.s(r3)
            if (r0 == 0) goto Lfd
            eios r0 = defpackage.eios.h(r1)
            eioq r3 = r7.f
            java.lang.String r0 = r0.j(r1, r3)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r2)
            if (r0 == 0) goto Lfd
            r1 = r6
            com.google.android.setupdesign.view.RichTextView r1 = (com.google.android.setupdesign.view.RichTextView) r1
            com.google.android.setupdesign.view.RichTextView.a = r0
        Lfd:
            b(r6, r7)
            int r7 = r7.i
            r6.setGravity(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiqz.a(android.widget.TextView, eiqy):void");
    }

    public static void b(TextView textView, eiqy eiqyVar) {
        if (eiqyVar.g == null && eiqyVar.h == null) {
            return;
        }
        Context context = textView.getContext();
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, (eiqyVar.g == null || !eios.h(context).s(eiqyVar.g)) ? layoutParams2.topMargin : (int) eios.h(context).a(context, eiqyVar.g), layoutParams2.rightMargin, (eiqyVar.h == null || !eios.h(context).s(eiqyVar.h)) ? layoutParams2.bottomMargin : (int) eios.h(context).a(context, eiqyVar.h));
            textView.setLayoutParams(layoutParams);
        }
    }
}
