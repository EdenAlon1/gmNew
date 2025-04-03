package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmw extends kzw {
    public final dwna f;
    private final View g;
    private final Rect h;
    private final String i;

    public dwmw(dwna dwnaVar, View view) {
        super(dwnaVar);
        this.h = new Rect();
        this.f = dwnaVar;
        this.g = view;
        this.i = dwnaVar.getResources().getString(R.string.libraries_material_featurehighlight_dismiss);
    }

    @Override // defpackage.kzw
    protected final void k(List list) {
        int i = dwna.J;
        if (this.f.g.A()) {
            list.add(1);
        }
        if (this.f.g.y()) {
            list.add(2);
        }
        if (this.f.g.z()) {
            list.add(3);
        }
        list.add(4);
        list.add(5);
    }

    @Override // defpackage.kzw
    protected final void l(int i, AccessibilityEvent accessibilityEvent) {
        if (i == 1) {
            dwna dwnaVar = this.f;
            int i2 = dwna.J;
            accessibilityEvent.setContentDescription(dwnaVar.g.g());
            return;
        }
        if (i == 2) {
            dwna dwnaVar2 = this.f;
            int i3 = dwna.J;
            accessibilityEvent.setContentDescription(dwnaVar2.g.e());
        } else if (i == 3) {
            dwna dwnaVar3 = this.f;
            int i4 = dwna.J;
            accessibilityEvent.setContentDescription(dwnaVar3.g.f());
        } else if (i == 4) {
            accessibilityEvent.setContentDescription(this.g.getContentDescription());
            accessibilityEvent.setClassName(this.g.getAccessibilityClassName());
        } else if (i == 5) {
            accessibilityEvent.setContentDescription(this.i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5.length() != 0) goto L26;
     */
    @Override // defpackage.kzw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void n(int r5, defpackage.kxu r6) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r1 = "android.widget.TextView"
            if (r5 == r0) goto Lb8
            r0 = 2
            if (r5 == r0) goto L9e
            r0 = 3
            r1 = 16
            if (r5 == r0) goto L7f
            r0 = 4
            java.lang.String r2 = ""
            if (r5 == r0) goto L39
            r0 = 5
            if (r5 == r0) goto L1f
            android.graphics.Rect r5 = r4.h
            r5.setEmpty()
            r6.v(r2)
            goto Ld1
        L1f:
            android.graphics.Rect r5 = r4.h
            dwna r0 = r4.f
            int r2 = r0.getWidth()
            int r0 = r0.getHeight()
            r3 = 0
            r5.set(r3, r3, r2, r0)
            java.lang.String r5 = r4.i
            r6.v(r5)
            r6.h(r1)
            goto Ld1
        L39:
            android.graphics.Rect r5 = r4.h
            dwna r0 = r4.f
            int r3 = defpackage.dwna.J
            android.graphics.Rect r0 = r0.a
            r5.set(r0)
            android.view.View r5 = r4.g
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 == 0) goto L5c
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.CharSequence r5 = r5.getText()
            r6.R(r5)
            if (r5 == 0) goto L5c
            int r5 = r5.length()
            if (r5 == 0) goto L5c
            goto L69
        L5c:
            android.view.View r5 = r4.g
            java.lang.CharSequence r5 = r5.getContentDescription()
            if (r5 != 0) goto L65
            goto L66
        L65:
            r2 = r5
        L66:
            r6.v(r2)
        L69:
            android.view.View r5 = r4.g
            java.lang.CharSequence r5 = r5.getAccessibilityClassName()
            r6.r(r5)
            android.view.View r5 = r4.g
            boolean r5 = r5.isClickable()
            r6.s(r5)
            r6.h(r1)
            goto Ld1
        L7f:
            android.graphics.Rect r5 = r4.h
            dwna r0 = r4.f
            int r2 = defpackage.dwna.J
            android.graphics.Rect r0 = r0.d
            r5.set(r0)
            dwna r5 = r4.f
            dwmb r5 = r5.g
            java.lang.CharSequence r5 = r5.f()
            r6.R(r5)
            java.lang.String r5 = "android.widget.Button"
            r6.r(r5)
            r6.h(r1)
            goto Ld1
        L9e:
            android.graphics.Rect r5 = r4.h
            dwna r0 = r4.f
            int r2 = defpackage.dwna.J
            android.graphics.Rect r0 = r0.c
            r5.set(r0)
            dwna r5 = r4.f
            dwmb r5 = r5.g
            java.lang.CharSequence r5 = r5.e()
            r6.R(r5)
            r6.r(r1)
            goto Ld1
        Lb8:
            android.graphics.Rect r5 = r4.h
            dwna r0 = r4.f
            int r2 = defpackage.dwna.J
            android.graphics.Rect r0 = r0.b
            r5.set(r0)
            dwna r5 = r4.f
            dwmb r5 = r5.g
            java.lang.CharSequence r5 = r5.g()
            r6.R(r5)
            r6.r(r1)
        Ld1:
            android.graphics.Rect r5 = r4.h
            r6.n(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwmw.n(int, kxu):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r4 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
    
        if (r4 == 5) goto L15;
     */
    @Override // defpackage.kzw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(int r4, int r5) {
        /*
            r3 = this;
            r0 = 16
            r1 = 0
            if (r5 != r0) goto L24
            r5 = 4
            r0 = 1
            if (r4 != r5) goto L11
            dwna r4 = r3.f
            int r5 = defpackage.dwna.J
            r4.e()
            return r0
        L11:
            r5 = 5
            r2 = 3
            if (r4 == r5) goto L18
            if (r4 != r2) goto L24
            goto L1b
        L18:
            if (r4 != r5) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            dwna r4 = r3.f
            int r5 = defpackage.dwna.J
            r4.d(r1)
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwmw.s(int, int):boolean");
    }
}
