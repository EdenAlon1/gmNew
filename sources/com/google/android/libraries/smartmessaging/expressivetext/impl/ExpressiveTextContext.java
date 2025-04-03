package com.google.android.libraries.smartmessaging.expressivetext.impl;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.MotionEvent;
import defpackage.eepv;
import defpackage.eepw;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ExpressiveTextContext {
    private Long a;

    private final native long nativeCreateExpressiveTextContext();

    private final native boolean nativeEndAllTouches(long j);

    private final native boolean nativeExport(long j, Bitmap bitmap);

    private final native int nativeGetMaxTextureSize(long j);

    private final native boolean nativeGlRender(long j, long j2);

    private final native boolean nativeOnTouchEnd(long j, int i, long j2, float f, float f2, boolean z);

    private final native boolean nativeOnTouchStart(long j, int i, long j2, float f, float f2, boolean z);

    private final native boolean nativeOnTouchUpdate(long j, int i, long j2, float f, float f2, boolean z);

    private final native void nativeReleaseExpressiveTextContext(long j);

    private final native void nativeSetBrushColor(long j, float f, float f2, float f3);

    private final native int nativeSetBrushType(long j, int i);

    private final native void nativeSetDeleteZoneBounds(long j, float f, float f2, float f3, float f4);

    private final native void nativeSetExpressiveTextCallbackReceiver(long j, ExpressiveTextCallbackReceiver expressiveTextCallbackReceiver);

    private final native int nativeSetMode(long j, int i);

    private final native void nativeSetPixelDensity(long j, float f);

    private final native void nativeUndo(long j);

    private final native void nativeUpdateRenderRect(long j, float f, float f2, float f3, float f4);

    private final native void nativeUpdateScreenDimensions(long j, int i, int i2);

    private final native void nativeUpdateTextElement(long j, long j2, String str, float f, float f2, float f3, float f4, Bitmap bitmap);

    public final synchronized int a() {
        Long l;
        l = this.a;
        if (l == null) {
            throw new IllegalStateException("Invalid context, tearDown() might have been called.");
        }
        return nativeGetMaxTextureSize(l.longValue());
    }

    public final synchronized eepv b(eepv eepvVar) {
        Long l;
        eepvVar.getClass();
        l = this.a;
        if (l == null) {
            throw new IllegalStateException("Invalid context, tearDown() might have been called.");
        }
        return eepv.values()[nativeSetBrushType(l.longValue(), eepvVar.ordinal())];
    }

    public final synchronized eepw c(eepw eepwVar) {
        Long l;
        eepwVar.getClass();
        l = this.a;
        if (l == null) {
            throw new IllegalStateException("Invalid context, tearDown() might have been called.");
        }
        return eepw.values()[nativeSetMode(l.longValue(), eepwVar.ordinal())];
    }

    public final synchronized void d() {
        Long l = this.a;
        if (l == null) {
            l = Long.valueOf(nativeCreateExpressiveTextContext());
        }
        this.a = l;
    }

    public final synchronized void e() {
        Long l = this.a;
        if (l != null) {
            nativeReleaseExpressiveTextContext(l.longValue());
        }
        this.a = null;
    }

    public final synchronized void f(int i) {
        try {
            try {
                Long l = this.a;
                if (l == null) {
                    throw new IllegalStateException("Invalid context, tearDown() might have been called.");
                }
                nativeSetBrushColor(l.longValue(), Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void g(ExpressiveTextCallbackReceiver expressiveTextCallbackReceiver) {
        Long l = this.a;
        if (l == null) {
            throw new IllegalStateException("Invalid context, tearDown() might have been called.");
        }
        nativeSetExpressiveTextCallbackReceiver(l.longValue(), expressiveTextCallbackReceiver);
    }

    public final synchronized void h(float f, float f2, float f3, float f4) {
        try {
            try {
                Long l = this.a;
                if (l == null) {
                    throw new IllegalStateException("Invalid context, tearDown() might have been called.");
                }
                nativeSetDeleteZoneBounds(l.longValue(), f, f2, f3, f4);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void i(float f) {
        Long l = this.a;
        if (l == null) {
            throw new IllegalStateException("Invalid context, tearDown() might have been called.");
        }
        nativeSetPixelDensity(l.longValue(), f);
    }

    public final synchronized void j() {
        Long l = this.a;
        if (l == null) {
            throw new IllegalStateException("Invalid context, tearDown() might have been called.");
        }
        nativeUndo(l.longValue());
    }

    public final synchronized void k(float f, float f2, float f3, float f4) {
        try {
            try {
                Long l = this.a;
                if (l == null) {
                    throw new IllegalStateException("Invalid context, tearDown() might have been called.");
                }
                nativeUpdateRenderRect(l.longValue(), f, f2, f3, f4);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void l(int i, int i2) {
        Long l = this.a;
        if (l == null) {
            throw new IllegalStateException("Invalid context, tearDown() might have been called.");
        }
        nativeUpdateScreenDimensions(l.longValue(), i, i2);
    }

    public final synchronized void m(long j, String str, int i, Bitmap bitmap) {
        Long l = this.a;
        if (l == null) {
            throw new IllegalStateException("Invalid context, tearDown() might have been called.");
        }
        nativeUpdateTextElement(l.longValue(), j, str, Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, Color.alpha(i) / 255.0f, bitmap);
    }

    public final synchronized boolean n() {
        Long l;
        l = this.a;
        if (l == null) {
            throw new IllegalStateException("Invalid context, tearDown() might have been called.");
        }
        return nativeEndAllTouches(l.longValue());
    }

    public final synchronized boolean o(long j) {
        Long l;
        l = this.a;
        if (l == null) {
            throw new IllegalStateException("Invalid context, tearDown() might have been called.");
        }
        return nativeGlRender(l.longValue(), j);
    }

    public final synchronized boolean p() {
        return this.a != null;
    }

    public final synchronized boolean q(MotionEvent motionEvent, int i) {
        try {
            try {
                Long l = this.a;
                if (l == null) {
                    throw new IllegalStateException("Invalid context, tearDown() might have been called.");
                }
                return nativeOnTouchEnd(l.longValue(), motionEvent.getPointerId(i), motionEvent.getEventTime(), motionEvent.getX(i), motionEvent.getY(i), false);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized boolean r(MotionEvent motionEvent, int i) {
        try {
            try {
                Long l = this.a;
                if (l == null) {
                    throw new IllegalStateException("Invalid context, tearDown() might have been called.");
                }
                return nativeOnTouchStart(l.longValue(), motionEvent.getPointerId(i), motionEvent.getEventTime(), motionEvent.getX(i), motionEvent.getY(i), false);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized boolean s(MotionEvent motionEvent, int i) {
        try {
            try {
                Long l = this.a;
                if (l == null) {
                    throw new IllegalStateException("Invalid context, tearDown() might have been called.");
                }
                return nativeOnTouchUpdate(l.longValue(), motionEvent.getPointerId(i), motionEvent.getEventTime(), motionEvent.getX(i), motionEvent.getY(i), false);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized boolean t(MotionEvent motionEvent, int i, int i2) {
        try {
            try {
                Long l = this.a;
                if (l == null) {
                    throw new IllegalStateException("Invalid context, tearDown() might have been called.");
                }
                return nativeOnTouchUpdate(l.longValue(), motionEvent.getPointerId(i), motionEvent.getHistoricalEventTime(i2), motionEvent.getHistoricalX(i, i2), motionEvent.getHistoricalY(i, i2), false);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void u(Bitmap bitmap) {
        Long l = this.a;
        if (l == null) {
            throw new IllegalStateException("Invalid context, tearDown() might have been called.");
        }
        nativeExport(l.longValue(), bitmap);
    }
}
