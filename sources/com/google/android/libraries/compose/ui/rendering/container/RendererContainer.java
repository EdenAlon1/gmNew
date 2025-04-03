package com.google.android.libraries.compose.ui.rendering.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;
import defpackage.ffbz;
import defpackage.ffca;
import defpackage.ffix;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class RendererContainer extends FrameLayout {
    public View.OnTouchListener a;
    public Integer b;
    private final ffbz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RendererContainer(Context context) {
        super(context);
        context.getClass();
        this.c = ffca.a(new ffix() { // from class: dsxz
            @Override // defpackage.ffix
            public final Object invoke() {
                return RendererContainer.this.getChildAt(0);
            }
        });
    }

    private final void c(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        setLayoutParams(layoutParams);
    }

    public final View a() {
        Object a = this.c.a();
        a.getClass();
        return (View) a;
    }

    public final void b(int i, boolean z) {
        if (!z) {
            if (this.b == null) {
                c(i);
            }
        } else {
            setTranslationY(getMeasuredHeight() - i);
            c(i);
            this.b = Integer.valueOf(i);
            animate().translationY(0.0f).withEndAction(new Runnable() { // from class: dsya
                @Override // java.lang.Runnable
                public final void run() {
                    RendererContainer.this.b = null;
                }
            }).start();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.a;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RendererContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.c = ffca.a(new ffix() { // from class: dsxz
            @Override // defpackage.ffix
            public final Object invoke() {
                return RendererContainer.this.getChildAt(0);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RendererContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.c = ffca.a(new ffix() { // from class: dsxz
            @Override // defpackage.ffix
            public final Object invoke() {
                return RendererContainer.this.getChildAt(0);
            }
        });
    }
}
