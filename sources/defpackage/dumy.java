package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dumy implements dunu {
    private final AtomicInteger a = new AtomicInteger();
    private final dunt[] b = new dunt[30];
    private final Object c = new Object();
    private int d = 0;

    @Override // defpackage.dunu
    public final dunt a(Runnable runnable) {
        String name;
        dunt duntVar = new dunt();
        if (runnable instanceof duns) {
            name = runnable.toString();
        } else {
            Class<?> cls = runnable.getClass();
            String simpleName = cls.getSimpleName();
            name = TextUtils.isEmpty(simpleName) ? cls.getName() : simpleName;
        }
        duntVar.a = name;
        synchronized (this.c) {
            dunt[] duntVarArr = this.b;
            int i = this.d;
            duntVarArr[i] = duntVar;
            this.d = (i + 1) % 30;
        }
        return duntVar;
    }

    @Override // defpackage.dunu
    public final void b() {
        this.a.incrementAndGet();
    }

    @Override // defpackage.dunu
    public final void c() {
        this.a.decrementAndGet();
    }
}
