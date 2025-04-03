package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehrf {
    private static ehrf e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new ehrd(this));
    public ehre c;
    public ehre d;

    private ehrf() {
    }

    public static ehrf a() {
        if (e == null) {
            e = new ehrf();
        }
        return e;
    }

    public final void b(ehre ehreVar) {
        int i = ehreVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(ehreVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, ehreVar), i);
    }

    public final void c() {
        ehre ehreVar = this.d;
        if (ehreVar != null) {
            this.c = ehreVar;
            this.d = null;
            ehqq ehqqVar = (ehqq) ehreVar.a.get();
            if (ehqqVar == null) {
                this.c = null;
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar = ehqqVar.a;
            Handler handler = BaseTransientBottomBar.a;
            handler.sendMessage(handler.obtainMessage(0, baseTransientBottomBar));
        }
    }

    public final boolean d(ehre ehreVar, int i) {
        ehqq ehqqVar = (ehqq) ehreVar.a.get();
        if (ehqqVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(ehreVar);
        BaseTransientBottomBar baseTransientBottomBar = ehqqVar.a;
        Handler handler = BaseTransientBottomBar.a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, baseTransientBottomBar));
        return true;
    }

    public final void e(ehqq ehqqVar) {
        synchronized (this.a) {
            if (g(ehqqVar)) {
                ehre ehreVar = this.c;
                if (!ehreVar.c) {
                    ehreVar.c = true;
                    this.b.removeCallbacksAndMessages(ehreVar);
                }
            }
        }
    }

    public final void f(ehqq ehqqVar) {
        synchronized (this.a) {
            if (g(ehqqVar)) {
                ehre ehreVar = this.c;
                if (ehreVar.c) {
                    ehreVar.c = false;
                    b(ehreVar);
                }
            }
        }
    }

    public final boolean g(ehqq ehqqVar) {
        ehre ehreVar = this.c;
        return ehreVar != null && ehreVar.a(ehqqVar);
    }

    public final boolean h(ehqq ehqqVar) {
        ehre ehreVar = this.d;
        return ehreVar != null && ehreVar.a(ehqqVar);
    }
}
