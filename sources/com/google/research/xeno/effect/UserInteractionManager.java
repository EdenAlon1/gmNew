package com.google.research.xeno.effect;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.google.research.xeno.effect.UserInteractionManager;
import defpackage.facv;
import defpackage.facw;
import defpackage.faeb;
import defpackage.faec;
import defpackage.faed;
import defpackage.faff;
import defpackage.fafp;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UserInteractionManager {
    public static final String a = "UserInteractionManager";
    public long b;
    public faeb c;
    public View d;

    public UserInteractionManager() {
        new faff(this);
        new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
    }

    public static final facw d(PointF pointF) {
        facv facvVar = (facv) facw.a.createBuilder();
        double d = pointF.x;
        facvVar.copyOnWrite();
        ((facw) facvVar.instance).b = d;
        double d2 = pointF.y;
        facvVar.copyOnWrite();
        ((facw) facvVar.instance).c = d2;
        return (facw) facvVar.build();
    }

    public static native void nativeSendGestureEvent(long j, byte[] bArr);

    public static native void nativeSendTouchEvent(long j, byte[] bArr);

    public final facw a(float f, float f2) {
        PointF pointF = new PointF(f, f2);
        c(pointF);
        return d(pointF);
    }

    public final void b(final fafp fafpVar) {
        faed.a(this.c, new faec() { // from class: fafb
            @Override // defpackage.faec
            public final void a(long j) {
                if (j == 0) {
                    Log.w(UserInteractionManager.a, "Sending gesture event to user interaction manager which is released");
                } else {
                    UserInteractionManager.nativeSendGestureEvent(UserInteractionManager.this.b, fafpVar.toByteArray());
                }
            }
        });
    }

    public final void c(PointF pointF) {
        pointF.x /= this.d.getWidth();
        pointF.y /= this.d.getHeight();
    }
}
