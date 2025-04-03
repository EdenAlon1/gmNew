package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqn implements eiph {
    public final TemplateLayout a;
    private final int b;
    private final ImageView.ScaleType c;
    private final Context d;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public eiqn(com.google.android.setupcompat.internal.TemplateLayout r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.a = r4
            android.content.Context r4 = r4.getContext()
            r3.d = r4
            android.widget.ImageView r0 = r3.b()
            r1 = 0
            if (r0 == 0) goto L21
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            int r2 = r2.height
            r3.b = r2
            android.widget.ImageView$ScaleType r0 = r0.getScaleType()
            r3.c = r0
            goto L26
        L21:
            r3.b = r1
            r0 = 0
            r3.c = r0
        L26:
            int[] r0 = defpackage.eipy.j
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r0, r6, r1)
            int r6 = r5.getResourceId(r1, r1)
            if (r6 != 0) goto L39
            boolean r6 = defpackage.eios.q(r4)
            if (r6 == 0) goto L6b
            r6 = r1
        L39:
            android.widget.ImageView r0 = r3.b()
            if (r0 == 0) goto L6b
            r0.setImageResource(r6)
            boolean r4 = defpackage.eios.q(r4)
            if (r4 == 0) goto L51
            if (r6 == 0) goto L4c
            r4 = r1
            goto L4d
        L4c:
            r4 = 4
        L4d:
            r0.setVisibility(r4)
            goto L5a
        L51:
            if (r6 == 0) goto L55
            r4 = r1
            goto L57
        L55:
            r4 = 8
        L57:
            r0.setVisibility(r4)
        L5a:
            int r4 = r0.getVisibility()
            android.widget.FrameLayout r6 = r3.a()
            if (r6 == 0) goto L6b
            android.widget.FrameLayout r6 = r3.a()
            r6.setVisibility(r4)
        L6b:
            r4 = 2
            boolean r4 = r5.getBoolean(r4, r1)
            android.widget.ImageView r6 = r3.b()
            if (r6 == 0) goto L91
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            int r2 = r6.getMaxHeight()
            if (r4 != 0) goto L82
            int r2 = r3.b
        L82:
            r0.height = r2
            r6.setLayoutParams(r0)
            if (r4 == 0) goto L8c
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER
            goto L8e
        L8c:
            android.widget.ImageView$ScaleType r4 = r3.c
        L8e:
            r6.setScaleType(r4)
        L91:
            r4 = 1
            int r4 = r5.getColor(r4, r1)
            if (r4 == 0) goto La1
            android.widget.ImageView r6 = r3.b()
            if (r6 == 0) goto La1
            r6.setColorFilter(r4)
        La1:
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiqn.<init>(com.google.android.setupcompat.internal.TemplateLayout, android.util.AttributeSet, int):void");
    }

    public final FrameLayout a() {
        return (FrameLayout) this.a.g(R.id.sud_layout_icon_container);
    }

    public final ImageView b() {
        return (ImageView) this.a.g(R.id.sud_layout_icon);
    }
}
