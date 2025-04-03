package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.ksp;
import defpackage.pmd;
import defpackage.pmq;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MulticastConsumer implements ksp<WindowLayoutInfo> {
    public final ReentrantLock a = new ReentrantLock();
    public final Set b = new LinkedHashSet();
    private final Context c;
    private pmd d;

    public MulticastConsumer(Context context) {
        this.c = context;
    }

    public final void a(ksp kspVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            pmd pmdVar = this.d;
            if (pmdVar != null) {
                kspVar.accept(pmdVar);
            }
            this.b.add(kspVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.ksp
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            pmd b = pmq.b(this.c, windowLayoutInfo);
            this.d = b;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((ksp) it.next()).accept(b);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
