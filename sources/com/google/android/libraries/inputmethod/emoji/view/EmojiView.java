package com.google.android.libraries.inputmethod.emoji.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.duma;
import defpackage.dumg;
import defpackage.duoc;
import defpackage.duvg;
import defpackage.duvi;
import defpackage.duvj;
import defpackage.duvk;
import defpackage.duvm;
import defpackage.duvo;
import defpackage.duvq;
import defpackage.duvx;
import defpackage.duwm;
import defpackage.duwn;
import defpackage.duwo;
import defpackage.duzy;
import defpackage.engw;
import defpackage.enrr;
import defpackage.enru;
import defpackage.erqt;
import defpackage.qpt;
import defpackage.qqd;
import defpackage.qxf;
import defpackage.rkh;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class EmojiView extends View {
    private static final enru f = enru.c("com/google/android/libraries/inputmethod/emoji/view/EmojiView");
    public duvj a;
    public engw b;
    public duvq c;
    public Drawable d;
    public Typeface e;
    private final qxf g;
    private final duvo h;
    private final float i;
    private float j;
    private duvk k;
    private Paint l;
    private duvm m;

    public EmojiView(Context context) {
        this(context, null);
    }

    private final Paint d() {
        if (this.l == null) {
            this.l = new Paint(3);
        }
        return this.l;
    }

    private final void e() {
        a();
        duvj duvjVar = this.a;
        final Paint d = d();
        final duvj duvjVar2 = this.a;
        final duvo duvoVar = this.h;
        ListenableFuture m = erqt.m(new Callable() { // from class: duvn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                duvo duvoVar2 = duvo.this;
                duvoVar2.b.set(d);
                duut duutVar = duut.instance;
                lew a = duutVar.a();
                duur duurVar = duutVar.j;
                duvj duvjVar3 = duvjVar2;
                CharSequence charSequence = duvjVar3.b;
                if (a != null && duurVar.a()) {
                    int length = charSequence.length();
                    charSequence = lew.b().d(charSequence, 0, length, length, true != duurVar.d ? 2 : 1);
                }
                if (charSequence instanceof Spanned) {
                    StaticLayout c = duvo.c(charSequence, duvoVar2.b);
                    int width = c.getWidth();
                    int height = c.getHeight();
                    int b = duvo.b(duvjVar3.c, width);
                    int b2 = duvo.b(duvjVar3.d, height);
                    float textSize = duvoVar2.b.getTextSize();
                    while (textSize > duvoVar2.e && (width > b || height > b2)) {
                        textSize = duvoVar2.a(textSize, Math.min(b / width, b2 / height));
                        duvoVar2.b.setTextSize(textSize);
                        c = duvo.c(charSequence, duvoVar2.b);
                        width = c.getWidth();
                        height = c.getHeight();
                        b = duvo.b(duvjVar3.c, width);
                        b2 = duvo.b(duvjVar3.d, height);
                    }
                    Bitmap a2 = duvoVar2.d.a(b, b2, Bitmap.Config.ARGB_8888);
                    duvoVar2.a.setBitmap(a2);
                    c.draw(duvoVar2.a);
                    duvoVar2.a.setBitmap(null);
                    duvoVar2.g = b;
                    return new duvm(duvjVar3, a2);
                }
                duvoVar2.b.setTextAlign(Paint.Align.CENTER);
                String charSequence2 = charSequence.toString();
                duvoVar2.b.getTextBounds(charSequence2, 0, charSequence2.length(), duvoVar2.f);
                Rect rect = duvoVar2.f;
                int i = duvjVar3.c;
                int width2 = rect.width();
                int height2 = rect.height();
                int b3 = duvo.b(i, width2);
                int b4 = duvo.b(duvjVar3.d, height2);
                float textSize2 = duvoVar2.b.getTextSize();
                while (textSize2 > duvoVar2.e && (width2 > b3 || height2 > b4)) {
                    duvo.d();
                    textSize2 = duvoVar2.a(textSize2, Math.min(b3 / width2, b4 / height2));
                    duvoVar2.b.setTextSize(textSize2);
                    duvoVar2.b.getTextBounds(charSequence2, 0, charSequence2.length(), duvoVar2.f);
                    Rect rect2 = duvoVar2.f;
                    int i2 = duvjVar3.c;
                    width2 = rect2.width();
                    height2 = rect2.height();
                    b3 = duvo.b(i2, width2);
                    b4 = duvo.b(duvjVar3.d, height2);
                }
                float exactCenterY = (b4 / 2.0f) - duvoVar2.f.exactCenterY();
                duvo.d();
                Bitmap a3 = duvoVar2.d.a(b3, b4, Bitmap.Config.ARGB_8888);
                duvoVar2.a.setBitmap(a3);
                duvoVar2.a.drawText(charSequence2, b3 / 2, (int) exactCenterY, duvoVar2.b);
                duvoVar2.a.setBitmap(null);
                duvoVar2.g = b3;
                return new duvm(duvjVar3, a3);
            }
        }, duvoVar.c);
        duwm duwmVar = new duwm();
        duwmVar.b.h(new Consumer() { // from class: duvl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                EmojiView.this.b((duvm) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        duwmVar.a = duoc.b;
        this.k = duvk.e(duvjVar, m, duwmVar.a());
    }

    public final void a() {
        this.k.close();
        this.k = duvk.b;
    }

    public final void b(duvm duvmVar) {
        duvm duvmVar2 = this.m;
        if (duvmVar2 != null) {
            this.g.d(duvmVar2.b);
        }
        this.m = duvmVar;
        invalidate();
    }

    public final void c(duvq duvqVar) {
        this.c = duvqVar;
        duvi duviVar = (duvi) duvqVar;
        setSelected(duviVar.g);
        String str = duviVar.a;
        String charSequence = str == null ? "" : str.toString();
        if (!TextUtils.equals(this.a.b, charSequence)) {
            this.a = this.a.a(charSequence);
            a();
            b(null);
            if (!TextUtils.isEmpty(charSequence)) {
                e();
            }
        }
        duma.e(this, duviVar.a);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        duvm duvmVar = this.m;
        if (duvmVar == null) {
            return;
        }
        if (!this.k.d() || ((duvg) this.k).a.b.equals(duvmVar.a.b)) {
            Bitmap bitmap = duvmVar.b;
            Paint d = d();
            int width = bitmap.getWidth();
            float height = bitmap.getHeight();
            float f2 = width;
            float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (f2 < width2 && height < height2) {
                canvas.drawBitmap(bitmap, Math.round((width2 - f2) / 2.0f) + getPaddingLeft(), Math.round((height2 - height) / 2.0f) + getPaddingTop(), d);
                return;
            }
            float max = Math.max(this.i / this.j, Math.min(width2 / f2, height2 / height));
            canvas.save();
            canvas.translate((width2 / 2.0f) + getPaddingLeft(), (height2 / 2.0f) + getPaddingTop());
            canvas.scale(max, max);
            canvas.translate((-width) / 2.0f, (-r3) / 2.0f);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, d);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a.b.isEmpty()) {
            return;
        }
        if (this.k.d() && !((duvg) this.k).a.b(this.a)) {
            e();
            return;
        }
        duvm duvmVar = this.m;
        if (duvmVar != null) {
            if (!duvmVar.a.b(this.a)) {
                e();
                return;
            }
        }
        if (this.m != null || this.k.d()) {
            return;
        }
        e();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE && size != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(size, this.h.g), 1073741824), i2);
            return;
        }
        if (duzy.a) {
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 0 || mode2 == 0) {
                ((enrr) ((enrr) f.i()).h("com/google/android/libraries/inputmethod/emoji/view/EmojiView", "onMeasure", 126, "EmojiView.java")).q("MeasureSpec.UNSPECIFIED is not supported yet");
            }
        }
        setMeasuredDimension(size, size2);
        duvj duvjVar = this.a;
        int max = Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int i3 = duvjVar.c;
        int max2 = Math.max(0, measuredHeight);
        if (max != i3 || max2 != duvjVar.d) {
            duvjVar = new duvj(duvjVar.b, max, max2);
        }
        this.a = duvjVar;
    }

    public EmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = duvj.a;
        this.k = duvk.b;
        this.m = null;
        this.c = duvq.h;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, duvx.a);
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.i = dimensionPixelSize;
        float applyDimension = TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics());
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, ((int) (applyDimension + (applyDimension >= 0.0f ? 0.5f : -0.5f))) == 0 ? (int) Math.signum(30.0f) : r3);
        Paint d = d();
        d.setTextSize(this.j);
        d.setColor(obtainStyledAttributes.getColor(1, -16777216));
        obtainStyledAttributes.recycle();
        AtomicBoolean atomicBoolean = duwn.a;
        if (dumg.b() && !duwn.a.get()) {
            dumg.a();
            duwn.a.set(true);
            qpt b = qpt.b(context);
            qxf qxfVar = b.a;
            if (qxfVar instanceof duwo) {
                throw null;
            }
            qqd qqdVar = qqd.NORMAL;
            rkh.j();
            b.b.f(qqdVar.d);
            b.a.e(qqdVar.d);
            qqd qqdVar2 = b.f;
            b.f = qqdVar;
        }
        qxf qxfVar2 = qpt.b(context).a;
        this.g = qxfVar2;
        this.h = new duvo(qxfVar2, dimensionPixelSize);
    }
}
