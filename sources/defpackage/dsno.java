package defpackage;

import android.view.WindowInsetsAnimation;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsno implements Runnable {
    final /* synthetic */ KeyboardDetectorViewInsetsListener a;
    final /* synthetic */ dsnk b;
    final /* synthetic */ WindowInsetsAnimation c;

    public dsno(KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener, dsnk dsnkVar, WindowInsetsAnimation windowInsetsAnimation) {
        this.a = keyboardDetectorViewInsetsListener;
        this.b = dsnkVar;
        this.c = windowInsetsAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this.a;
        if (keyboardDetectorViewInsetsListener.d) {
            return;
        }
        if (keyboardDetectorViewInsetsListener.c == this.b) {
            keyboardDetectorViewInsetsListener.onEnd(this.c);
        }
    }
}
