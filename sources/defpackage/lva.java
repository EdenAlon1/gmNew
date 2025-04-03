package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lva implements lua {
    public static final List a = new ArrayList(50);
    public final Handler b;

    public lva(Handler handler) {
        this.b = handler;
    }

    private static luz k() {
        luz luzVar;
        List list = a;
        synchronized (list) {
            luzVar = list.isEmpty() ? new luz() : (luz) list.remove(list.size() - 1);
        }
        return luzVar;
    }

    @Override // defpackage.lua
    public final void a(int i) {
        lti.a(true);
        this.b.removeMessages(i);
    }

    @Override // defpackage.lua
    public final boolean b(Runnable runnable) {
        return this.b.post(runnable);
    }

    @Override // defpackage.lua
    public final luz c(int i) {
        luz k = k();
        k.a = this.b.obtainMessage(i);
        return k;
    }

    @Override // defpackage.lua
    public final luz d(int i, Object obj) {
        luz k = k();
        k.a = this.b.obtainMessage(i, obj);
        return k;
    }

    @Override // defpackage.lua
    public final luz e(int i, int i2, int i3) {
        luz k = k();
        k.a = this.b.obtainMessage(i, i2, i3);
        return k;
    }

    @Override // defpackage.lua
    public final boolean f() {
        lti.a(true);
        return this.b.hasMessages(1);
    }

    @Override // defpackage.lua
    public final luz g(int i, Object obj) {
        Handler handler = this.b;
        luz k = k();
        k.a = handler.obtainMessage(4, i, 0, obj);
        return k;
    }

    @Override // defpackage.lua
    public final void h() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.lua
    public final void i(int i) {
        this.b.sendEmptyMessage(i);
    }

    @Override // defpackage.lua
    public final void j(luz luzVar) {
        Message message = luzVar.a;
        lti.f(message);
        this.b.sendMessageAtFrontOfQueue(message);
        luzVar.a();
    }
}
