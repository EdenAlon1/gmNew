package com.google.android.apps.messaging.ui.mediapicker.camera;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import com.google.mediapipe.framework.TextureFrame;
import defpackage.csix;
import defpackage.cskc;
import defpackage.csvw;
import defpackage.ctud;
import defpackage.dcmr;
import defpackage.dcoz;
import defpackage.dcpe;
import defpackage.dcpi;
import defpackage.dcpu;
import defpackage.dcrb;
import defpackage.dube;
import defpackage.dubi;
import defpackage.elfr;
import defpackage.emxf;
import defpackage.exky;
import defpackage.exmf;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CameraTextureView extends dcpu implements dcpe {
    public static final cskc a = cskc.g("Bugle", "CameraTextureView");
    public final boolean b;
    public dcoz c;
    public Optional d;
    public Optional e;
    public ctud f;
    public dube g;
    public float h;
    public dcmr i;
    private final WindowManager j;
    private boolean k;

    public CameraTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = false;
        this.h = 1.7777778f;
        this.j = (WindowManager) context.getSystemService("window");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dcrb.a);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.dcpe
    public final void a(int i, int i2) {
        if (i < i2 || i2 == 0) {
            return;
        }
        this.h = i / i2;
    }

    @Override // defpackage.dcpe
    public final void b(exky exkyVar) {
        csix.f(this.b);
        this.g.f = exkyVar;
    }

    @Override // defpackage.dcpe
    public final boolean c() {
        return (this.g == null && getSurfaceTexture() == null) ? false : true;
    }

    final int d(boolean z, int i, int i2) {
        if (z) {
            i = (int) (i2 * this.h);
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public final void e() {
        this.k = true;
        this.c.k(this, isShown());
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.s(this);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (this.b) {
            setSurfaceTextureListener(new dcpi(this));
            return;
        }
        this.g = new dube();
        emxf.l(true);
        if (this.e.isEmpty()) {
            this.c.k(this, isShown());
            return;
        }
        final dube dubeVar = this.g;
        dubeVar.b = new exmf(this.e.get());
        dubeVar.c = new dubi(dubeVar.b.c, this);
        dubi dubiVar = dubeVar.c;
        dubiVar.i = new exky() { // from class: dubd
            @Override // defpackage.exky
            public final void hI(TextureFrame textureFrame) {
                exky exkyVar = dube.this.f;
                if (exkyVar != null) {
                    exkyVar.hI(textureFrame);
                } else {
                    textureFrame.release();
                }
            }
        };
        dubeVar.a.a = dubiVar;
        dubeVar.b.c();
        elfr.l(dubeVar.c.d, new csvw(new Consumer() { // from class: dcpg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CameraTextureView cameraTextureView = CameraTextureView.this;
                cameraTextureView.c.k(cameraTextureView, cameraTextureView.isShown());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: dcph
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CameraTextureView.a.o("Failed waiting on preview manager", (Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.d.get());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.h >= 1.0f) {
            WindowManager windowManager = this.j;
            boolean z = false;
            if (windowManager != null && windowManager.getDefaultDisplay().getRotation() % 180 != 0) {
                z = true;
            }
            i = d(z, size, size2);
            i2 = d(true ^ z, size2, size);
        }
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        this.c.k(this, isShown());
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.k && this.f.e()) {
            this.c.k(this, isShown());
        }
    }
}
