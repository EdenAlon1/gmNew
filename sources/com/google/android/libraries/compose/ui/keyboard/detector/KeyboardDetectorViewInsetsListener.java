package com.google.android.libraries.compose.ui.keyboard.detector;

import android.graphics.Insets;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;
import defpackage.dqkk;
import defpackage.dsnh;
import defpackage.dsni;
import defpackage.dsnj;
import defpackage.dsnk;
import defpackage.dsnl;
import defpackage.dsnm;
import defpackage.dsnn;
import defpackage.dsnp;
import defpackage.dsoc;
import defpackage.dsod;
import defpackage.ffix;
import defpackage.ffji;
import defpackage.ffko;
import defpackage.fflc;
import defpackage.ffln;
import defpackage.ffls;
import defpackage.ffmx;
import defpackage.lki;
import defpackage.lkq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class KeyboardDetectorViewInsetsListener extends WindowInsetsAnimation$Callback implements View.OnApplyWindowInsetsListener, lkq, dsoc {
    static final /* synthetic */ ffmx[] a;
    public static final /* synthetic */ int e = 0;
    public final dsod b;
    public dsnk c;
    public boolean d;
    private final dqkk f;
    private final ffls g;

    static {
        ffko ffkoVar = new ffko(KeyboardDetectorViewInsetsListener.class, "state", "getState()Lcom/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorViewInsetsListener$KeyboardListeningState;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    public KeyboardDetectorViewInsetsListener(dqkk dqkkVar, dsod dsodVar) {
        super(0);
        this.f = dqkkVar;
        this.b = dsodVar;
        this.g = new dsnp(dsnm.a, this);
    }

    private final void e(String str, final ffji ffjiVar) {
        final dsnn dsnnVar = (dsnn) this.g.c(a[0]);
        if (dsnnVar instanceof dsnl) {
            if (str != null) {
                this.f.g(str, new ffix() { // from class: dsnb
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        int i = KeyboardDetectorViewInsetsListener.e;
                        ffji.this.invoke(((dsnl) dsnnVar).b);
                        return ffcu.a;
                    }
                });
            } else {
                ffjiVar.invoke(((dsnl) dsnnVar).b);
            }
        }
    }

    public final int a(WindowInsets windowInsets) {
        int ime;
        boolean isVisible;
        int navigationBars;
        Insets insets;
        int i;
        int ime2;
        Insets insets2;
        int i2;
        ime = WindowInsets.Type.ime();
        isVisible = windowInsets.isVisible(ime);
        if (!isVisible) {
            return 0;
        }
        navigationBars = WindowInsets.Type.navigationBars();
        insets = windowInsets.getInsets(navigationBars);
        i = insets.bottom;
        dsnk dsnkVar = this.c;
        Float valueOf = dsnkVar != null ? Float.valueOf(dsnkVar.a()) : null;
        if (valueOf != null) {
            i = ffln.b(i * valueOf.floatValue());
        }
        ime2 = WindowInsets.Type.ime();
        insets2 = windowInsets.getInsets(ime2);
        i2 = insets2.bottom;
        return i2 - i;
    }

    public final dsnk b(WindowInsetsAnimation windowInsetsAnimation) {
        int ime;
        boolean isVisible;
        WindowInsets rootWindowInsets = this.b.getRootWindowInsets();
        ime = WindowInsets.Type.ime();
        isVisible = rootWindowInsets.isVisible(ime);
        return isVisible ? new dsni(windowInsetsAnimation) : new dsnj(windowInsetsAnimation);
    }

    @Override // defpackage.dsoc
    public final void c(boolean z) {
        if (z) {
            this.c = null;
            e("KeyboardDetectorViewInsetsListener#onWindowFocusChanged", new ffji() { // from class: dsnc
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((dsmn) obj).getClass();
                    KeyboardDetectorViewInsetsListener.this.b.requestApplyInsets();
                    return ffcu.a;
                }
            });
        }
    }

    public final void d(dsnn dsnnVar) {
        this.g.d(a[0], dsnnVar);
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, final WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        if (this.c == null) {
            e("KeyboardDetectorViewInsetsListener#onApplyWindowInsets", new ffji() { // from class: dsmy
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    int ime;
                    boolean isVisible;
                    dsmn dsmnVar = (dsmn) obj;
                    dsmnVar.getClass();
                    WindowInsets windowInsets2 = windowInsets;
                    ime = WindowInsets.Type.ime();
                    isVisible = windowInsets2.isVisible(ime);
                    dsmm dsmmVar = isVisible ? dsmm.a : dsmm.d;
                    KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this;
                    dsmnVar.m(dsmmVar);
                    dsmnVar.l(keyboardDetectorViewInsetsListener.a(windowInsets2));
                    return ffcu.a;
                }
            });
        }
        return windowInsets;
    }

    public final void onEnd(final WindowInsetsAnimation windowInsetsAnimation) {
        windowInsetsAnimation.getClass();
        super.onEnd(windowInsetsAnimation);
        this.c = null;
        e("KeyboardDetectorViewInsetsListener#onEnd", new ffji() { // from class: dsnf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                int ime;
                boolean isVisible;
                dsmn dsmnVar = (dsmn) obj;
                dsmnVar.getClass();
                KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this;
                if (dsnh.a(windowInsetsAnimation)) {
                    WindowInsets rootWindowInsets = keyboardDetectorViewInsetsListener.b.getRootWindowInsets();
                    ime = WindowInsets.Type.ime();
                    isVisible = rootWindowInsets.isVisible(ime);
                    dsmnVar.m(isVisible ? dsmm.a : dsmm.d);
                }
                WindowInsets rootWindowInsets2 = keyboardDetectorViewInsetsListener.b.getRootWindowInsets();
                rootWindowInsets2.getClass();
                dsmnVar.l(keyboardDetectorViewInsetsListener.a(rootWindowInsets2));
                keyboardDetectorViewInsetsListener.b.requestApplyInsets();
                return ffcu.a;
            }
        });
    }

    public final void onPrepare(final WindowInsetsAnimation windowInsetsAnimation) {
        windowInsetsAnimation.getClass();
        super.onPrepare(windowInsetsAnimation);
        if (dsnh.a(windowInsetsAnimation)) {
            final dsnk b = b(windowInsetsAnimation);
            this.c = b;
            this.d = false;
            dsod dsodVar = this.b;
            final ffix ffixVar = new ffix() { // from class: dsnd
                @Override // defpackage.ffix
                public final Object invoke() {
                    KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = KeyboardDetectorViewInsetsListener.this;
                    kug.b(keyboardDetectorViewInsetsListener.b, new dsno(keyboardDetectorViewInsetsListener, b, windowInsetsAnimation));
                    return ffcu.a;
                }
            };
            Handler handler = dsodVar.getHandler();
            if (handler != null) {
                Message obtain = Message.obtain(dsodVar.getHandler(), new Runnable() { // from class: dsmz
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = KeyboardDetectorViewInsetsListener.e;
                        ffix.this.invoke();
                    }
                });
                obtain.setAsynchronous(true);
                handler.sendMessageAtFrontOfQueue(obtain);
            }
        }
    }

    public final WindowInsets onProgress(final WindowInsets windowInsets, List list) {
        windowInsets.getClass();
        list.getClass();
        if (this.c != null) {
            e("KeyboardDetectorViewInsetsListener#onProgress", new ffji() { // from class: dsng
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    dsmn dsmnVar = (dsmn) obj;
                    dsmnVar.getClass();
                    dsmnVar.l(KeyboardDetectorViewInsetsListener.this.a(windowInsets));
                    return ffcu.a;
                }
            });
        }
        return windowInsets;
    }

    @OnLifecycleEvent(a = lki.ON_RESUME)
    public final void onResume() {
        this.c = null;
        e(null, new ffji() { // from class: dsne
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((dsmn) obj).getClass();
                KeyboardDetectorViewInsetsListener.this.b.requestApplyInsets();
                return ffcu.a;
            }
        });
    }

    public final WindowInsetsAnimation.Bounds onStart(final WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        windowInsetsAnimation.getClass();
        bounds.getClass();
        if (dsnh.a(windowInsetsAnimation)) {
            this.d = true;
            e("KeyboardDetectorViewInsetsListener#onStart", new ffji() { // from class: dsna
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    dsmm dsmmVar;
                    dsmn dsmnVar = (dsmn) obj;
                    dsmnVar.getClass();
                    KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = KeyboardDetectorViewInsetsListener.this;
                    dsnk dsnkVar = keyboardDetectorViewInsetsListener.c;
                    if (dsnkVar == null) {
                        dsnkVar = keyboardDetectorViewInsetsListener.b(windowInsetsAnimation);
                    }
                    if (dsnkVar instanceof dsnj) {
                        dsmmVar = dsmm.b;
                    } else {
                        if (!(dsnkVar instanceof dsni)) {
                            throw new ffcd();
                        }
                        dsmmVar = dsmm.c;
                    }
                    dsmnVar.m(dsmmVar);
                    return ffcu.a;
                }
            });
        }
        WindowInsetsAnimation.Bounds onStart = super.onStart(windowInsetsAnimation, bounds);
        onStart.getClass();
        return onStart;
    }
}
