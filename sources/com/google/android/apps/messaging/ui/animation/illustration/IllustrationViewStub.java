package com.google.android.apps.messaging.ui.animation.illustration;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;
import defpackage.csix;
import defpackage.csmg;
import defpackage.cwqk;
import defpackage.cwql;
import defpackage.cwqp;
import defpackage.cwqq;
import j$.util.OptionalInt;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class IllustrationViewStub extends cwqk {
    public String a;
    public int b;
    public float c;
    public ImageView.ScaleType d;
    public View e;
    private int f;
    private int g;
    private OptionalInt h;
    private boolean i;

    public IllustrationViewStub(Context context) {
        super(context);
        this.f = -1;
        this.b = -1;
        this.d = ImageView.ScaleType.MATRIX;
        this.g = -1;
        this.h = OptionalInt.empty();
    }

    private final void g(View view, ViewGroup viewGroup) {
        view.setId(getId());
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    public final View c() {
        if (this.e == null) {
            csix.k(getParent() != null);
            if (this.i) {
                cwqp cwqpVar = new cwqp(getContext());
                if (this.g != -1) {
                    cwqpVar.setBackground(getResources().getDrawable(this.g, getContext().getTheme()));
                }
                int i = this.f;
                if (i != -1) {
                    cwqpVar.f(i);
                } else {
                    String str = this.a;
                    if (str != null) {
                        cwqpVar.g(str);
                    }
                }
                g(cwqpVar, (ViewGroup) getParent());
                this.e = cwqpVar;
            } else {
                final cwql cwqlVar = new cwql(getContext());
                g(cwqlVar, (ViewGroup) getParent());
                int i2 = this.b;
                if (i2 != -1) {
                    cwqlVar.setImageResource(i2);
                }
                this.h.ifPresent(new IntConsumer() { // from class: cwqm
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i3) {
                        cwql.this.setColorFilter(i3);
                    }

                    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                        return IntConsumer$CC.$default$andThen(this, intConsumer);
                    }
                });
                cwqlVar.addOnLayoutChangeListener(new csmg(cwqlVar, new Runnable() { // from class: cwqn
                    @Override // java.lang.Runnable
                    public final void run() {
                        IllustrationViewStub illustrationViewStub = IllustrationViewStub.this;
                        cwql cwqlVar2 = cwqlVar;
                        Matrix imageMatrix = cwqlVar2.getImageMatrix();
                        cwqlVar2.setScaleType(illustrationViewStub.d);
                        float f = illustrationViewStub.c;
                        imageMatrix.setScale(f, f);
                        imageMatrix.postTranslate((cwqlVar2.getMeasuredWidth() / 2.0f) - ((cwqlVar2.getDrawable().getIntrinsicWidth() * illustrationViewStub.c) / 2.0f), (cwqlVar2.getMeasuredHeight() / 2.0f) - ((cwqlVar2.getDrawable().getIntrinsicHeight() * illustrationViewStub.c) / 2.0f));
                        cwqlVar2.setImageMatrix(imageMatrix);
                    }
                }));
                this.e = cwqlVar;
            }
        }
        View view = this.e;
        view.getClass();
        return view;
    }

    public final void d(int i) {
        this.h = OptionalInt.of(i);
    }

    public final void e() {
        if (this.e != null) {
            throw new IllegalStateException("Can't change inflation mode after inflation");
        }
        this.i = true;
    }

    public final void f() {
        this.c = 1.0f;
    }

    public IllustrationViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IllustrationViewStub(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public IllustrationViewStub(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f = -1;
        this.b = -1;
        this.d = ImageView.ScaleType.MATRIX;
        this.g = -1;
        this.h = OptionalInt.empty();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cwqq.a);
        this.a = obtainStyledAttributes.getString(0);
        this.f = obtainStyledAttributes.getResourceId(1, -1);
        this.b = obtainStyledAttributes.getResourceId(3, -1);
        this.c = obtainStyledAttributes.getFloat(2, 1.0f);
        obtainStyledAttributes.recycle();
    }
}
