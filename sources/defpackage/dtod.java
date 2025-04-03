package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtod implements ThreadFactory {
    public final Object a = new Object();
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final Set c = new cmj();
    private int d;

    public dtod(int i) {
        this.d = i;
    }

    public final void a(int i) {
        synchronized (this.a) {
            if (this.d == i) {
                return;
            }
            this.d = i;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((dtoa) it.next()).a(i);
            }
            cmi cmiVar = new cmi((cmj) this.c);
            while (cmiVar.hasNext()) {
                ((dtoa) cmiVar.next()).a(i);
            }
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        final dtoa dtoaVar;
        synchronized (this.a) {
            dtoaVar = new dtoa(this.d, runnable);
            this.b.add(dtoaVar);
            dtoaVar.a = new Runnable() { // from class: dtob
                @Override // java.lang.Runnable
                public final void run() {
                    dtod dtodVar = dtod.this;
                    Object obj = dtodVar.a;
                    dtoa dtoaVar2 = dtoaVar;
                    synchronized (obj) {
                        dtodVar.b.remove(dtoaVar2);
                        dtodVar.c.add(dtoaVar2);
                    }
                }
            };
            dtoaVar.b = new Runnable() { // from class: dtoc
                @Override // java.lang.Runnable
                public final void run() {
                    dtod dtodVar = dtod.this;
                    Object obj = dtodVar.a;
                    dtoa dtoaVar2 = dtoaVar;
                    synchronized (obj) {
                        dtodVar.c.remove(dtoaVar2);
                    }
                }
            };
        }
        return dtoaVar;
    }
}
