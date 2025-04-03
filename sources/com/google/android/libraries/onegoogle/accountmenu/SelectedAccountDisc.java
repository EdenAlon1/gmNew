package com.google.android.libraries.onegoogle.accountmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import defpackage.eaxl;
import defpackage.eazu;
import defpackage.ebbb;
import defpackage.ebor;
import defpackage.ecay;
import defpackage.ecba;
import defpackage.emxf;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SelectedAccountDisc<T> extends FrameLayout implements ecba, ecay {
    public final Rect a;
    public final ImageView b;
    public final AccountParticleDisc c;
    public View.OnClickListener d;
    public View.OnTouchListener e;
    public View.OnTouchListener f;
    public ebbb g;
    public eaxl h;
    public WeakReference i;
    private final Rect j;
    private final int[] k;

    public SelectedAccountDisc(Context context) {
        this(context, null);
    }

    public final int a() {
        if (this.b.getVisibility() == 0) {
            ImageView imageView = this.b;
            return (imageView.getHeight() - imageView.getPaddingTop()) - this.b.getPaddingBottom();
        }
        AccountParticleDisc accountParticleDisc = this.c;
        return accountParticleDisc.o.g() ? accountParticleDisc.e.b(accountParticleDisc.a()) : accountParticleDisc.a();
    }

    @Override // defpackage.ecba
    public final Rect b() {
        this.c.getLocationInWindow(this.k);
        float width = this.c.getWidth();
        float f = this.k[0];
        float height = (this.c.getHeight() * 0.5f) + this.k[1];
        float f2 = (width * 0.5f) + f;
        float a = a() * 0.5f;
        float f3 = f2 + a;
        float f4 = f2 - a;
        this.j.set(Math.round(f4), Math.round(height - a), Math.round(f3), Math.round(height + a));
        return this.j;
    }

    public final void c(int i) {
        emxf.m(!this.c.s(), "setMaxDiscContentSize is only allowed before calling initialize.");
        this.c.o(i);
    }

    @Override // android.view.View
    public final void setOnClickListener(final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: eazz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedAccountDisc selectedAccountDisc = SelectedAccountDisc.this;
                View.OnClickListener onClickListener2 = selectedAccountDisc.d;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
                ebbb ebbbVar = selectedAccountDisc.g;
                if (ebbbVar != null) {
                    ((ebbg) ebbbVar).k.f(new dvxf(5), view);
                }
                eaxl eaxlVar = selectedAccountDisc.h;
                if (eaxlVar != null) {
                    engw engwVar = eaxlVar.a;
                    int i = ((enou) engwVar).c;
                    for (int i2 = 0; i2 < i; i2++) {
                    }
                }
                View.OnClickListener onClickListener3 = onClickListener;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(view);
                }
            }
        });
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.e = onTouchListener;
    }

    public void setScale(float f) {
        AvatarView avatarView = this.c.a;
        AvatarView.b(f, avatarView.e);
        avatarView.f = f;
        avatarView.j();
        avatarView.invalidate();
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new Rect();
        this.k = new int[2];
        this.a = new Rect();
        this.i = new WeakReference(null);
        LayoutInflater.from(context).inflate(R.layout.selected_account_disc, (ViewGroup) this, true);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.og_selected_account_disc_apd);
        this.c = accountParticleDisc;
        ImageView imageView = (ImageView) findViewById(R.id.incognito_on_image_view);
        this.b = imageView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eazu.a, i, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            if (dimensionPixelSize != -1) {
                c(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            int b = ebor.b(context);
            if (b != 0) {
                accountParticleDisc.setBackgroundResource(b);
                imageView.setBackgroundResource(b);
            }
            super.setOnTouchListener(new View.OnTouchListener() { // from class: eazv
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    SelectedAccountDisc selectedAccountDisc = SelectedAccountDisc.this;
                    View.OnTouchListener onTouchListener = selectedAccountDisc.e;
                    boolean z = onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
                    View.OnTouchListener onTouchListener2 = selectedAccountDisc.f;
                    boolean z2 = onTouchListener2 != null && onTouchListener2.onTouch(view, motionEvent);
                    if (selectedAccountDisc.f == null || !z) {
                        return z2 || z;
                    }
                    throw new RuntimeException("customOnTouchListener may not consume the event");
                }
            });
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
