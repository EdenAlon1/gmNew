package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qs {
    public PorterDuff.Mode a = null;
    public boolean b = false;
    public boolean c = false;
    private final CompoundButton d;
    private boolean e;

    public qs(CompoundButton compoundButton) {
        this.d = compoundButton;
    }

    public final void a() {
        Drawable buttonDrawable = this.d.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.b || this.c) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.b) {
                    mutate.setTintList(null);
                }
                if (this.c) {
                    mutate.setTintMode(this.a);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.d.getDrawableState());
                }
                this.d.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001e, B:5:0x0024, B:8:0x002a, B:9:0x0051, B:11:0x0058, B:12:0x0061, B:14:0x0068, B:21:0x0038, B:23:0x003e, B:25:0x0044), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001e, B:5:0x0024, B:8:0x002a, B:9:0x0051, B:11:0x0058, B:12:0x0061, B:14:0x0068, B:21:0x0038, B:23:0x003e, B:25:0x0044), top: B:2:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.d
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.kt.n
            r2 = 0
            yt r1 = defpackage.yt.l(r0, r11, r1, r12, r2)
            android.content.res.TypedArray r7 = r1.b
            android.widget.CompoundButton r3 = r10.d
            android.content.Context r4 = r3.getContext()
            int[] r5 = defpackage.kt.n
            r9 = 0
            r6 = r11
            r8 = r12
            defpackage.kvo.o(r3, r4, r5, r6, r7, r8, r9)
            r11 = 1
            boolean r12 = r1.q(r11)     // Catch: java.lang.Throwable -> L7b
            if (r12 == 0) goto L38
            int r11 = r1.f(r11, r2)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L38
            android.widget.CompoundButton r12 = r10.d     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            android.content.Context r0 = r12.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            android.graphics.drawable.Drawable r11 = defpackage.ku.a(r0, r11)     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            r12.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            goto L51
        L38:
            boolean r11 = r1.q(r2)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L51
            int r11 = r1.f(r2, r2)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L51
            android.widget.CompoundButton r12 = r10.d     // Catch: java.lang.Throwable -> L7b
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L7b
            android.graphics.drawable.Drawable r11 = defpackage.ku.a(r0, r11)     // Catch: java.lang.Throwable -> L7b
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L7b
        L51:
            r11 = 2
            boolean r12 = r1.q(r11)     // Catch: java.lang.Throwable -> L7b
            if (r12 == 0) goto L61
            android.widget.CompoundButton r12 = r10.d     // Catch: java.lang.Throwable -> L7b
            android.content.res.ColorStateList r11 = r1.g(r11)     // Catch: java.lang.Throwable -> L7b
            r12.setButtonTintList(r11)     // Catch: java.lang.Throwable -> L7b
        L61:
            r11 = 3
            boolean r12 = r1.q(r11)     // Catch: java.lang.Throwable -> L7b
            if (r12 == 0) goto L77
            android.widget.CompoundButton r12 = r10.d     // Catch: java.lang.Throwable -> L7b
            r0 = -1
            int r11 = r1.c(r11, r0)     // Catch: java.lang.Throwable -> L7b
            r0 = 0
            android.graphics.PorterDuff$Mode r11 = defpackage.td.a(r11, r0)     // Catch: java.lang.Throwable -> L7b
            r12.setButtonTintMode(r11)     // Catch: java.lang.Throwable -> L7b
        L77:
            r1.o()
            return
        L7b:
            r0 = move-exception
            r11 = r0
            r1.o()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs.b(android.util.AttributeSet, int):void");
    }

    public final void c() {
        if (this.e) {
            this.e = false;
        } else {
            this.e = true;
            a();
        }
    }
}
