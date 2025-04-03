package com.google.android.libraries.smartmessaging.expressivetext.impl.opengl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import defpackage.eeqc;
import defpackage.eeqf;
import defpackage.eeqg;
import defpackage.eeqi;
import defpackage.eeqj;
import defpackage.eeql;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public static final eeqj a = new eeqj();
    public final WeakReference b;
    public eeqi c;
    public eeql d;
    public eeqc e;
    public int f;
    public boolean g;
    public eeqf h;
    public eeqg i;
    private boolean j;
    private boolean k;

    public GLTextureView(Context context) {
        super(context);
        this.b = new WeakReference(this);
        this.k = false;
        setSurfaceTextureListener(this);
    }

    public final void a() {
        if (this.c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public final void b(boolean z) {
        eeqi eeqiVar;
        this.k = z;
        if (z || !this.j || (eeqiVar = this.c) == null || eeqiVar.d()) {
            return;
        }
        this.c.b();
    }

    protected final void finalize() {
        try {
            eeqi eeqiVar = this.c;
            if (eeqiVar != null) {
                eeqiVar.b();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        eeqi eeqiVar;
        int i;
        super.onAttachedToWindow();
        if (this.j && this.d != null && (eeqiVar = this.c) != null && eeqiVar.d()) {
            eeqi eeqiVar2 = this.c;
            if (eeqiVar2 != null) {
                synchronized (a) {
                    i = eeqiVar2.g;
                }
            } else {
                i = 1;
            }
            eeqi eeqiVar3 = new eeqi(this.b);
            this.c = eeqiVar3;
            if (i != 1) {
                eeqiVar3.c(0);
            }
            this.c.start();
        }
        this.j = false;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        eeqi eeqiVar;
        if (!this.k && (eeqiVar = this.c) != null) {
            eeqiVar.b();
        }
        this.j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        eeqi eeqiVar = this.c;
        eeqj eeqjVar = a;
        synchronized (eeqjVar) {
            eeqiVar.d = true;
            eeqiVar.f = false;
            eeqjVar.notifyAll();
            while (eeqiVar.e && !eeqiVar.f && !eeqiVar.a) {
                try {
                    a.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.c.a(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        eeqi eeqiVar = this.c;
        eeqj eeqjVar = a;
        synchronized (eeqjVar) {
            eeqiVar.d = false;
            eeqjVar.notifyAll();
            while (!eeqiVar.e && !eeqiVar.a) {
                try {
                    a.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.c.a(i, i2);
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new WeakReference(this);
        this.k = false;
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
