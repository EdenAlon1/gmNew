package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmr implements Consumer2, ksp {
    private final Context a;
    private final ReentrantLock b;
    private pmd c;
    private final Set d;

    public pmr(Context context) {
        context.getClass();
        this.a = context;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            pmd b = pmq.b(this.a, windowLayoutInfo);
            this.c = b;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((ksp) it.next()).accept(b);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addListener(ksp<pmd> kspVar) {
        kspVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            pmd pmdVar = this.c;
            if (pmdVar != null) {
                kspVar.accept(pmdVar);
            }
            this.d.add(kspVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    public final void removeListener(ksp<pmd> kspVar) {
        kspVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(kspVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
