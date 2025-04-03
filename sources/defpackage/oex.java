package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oex {
    public boolean a;
    private final ffji b;
    private final ffix c;
    private final ReentrantLock d = new ReentrantLock();
    private final List e = new ArrayList();

    public oex(ffji ffjiVar, ffix ffixVar) {
        this.b = ffjiVar;
        this.c = ffixVar;
    }

    public final void a(Object obj) {
        ffix ffixVar = this.c;
        boolean z = true;
        if (ffixVar != null && ((Boolean) ffixVar.invoke()).booleanValue()) {
            c();
        }
        if (this.a) {
            this.b.invoke(obj);
            return;
        }
        ReentrantLock reentrantLock = this.d;
        try {
            reentrantLock.lock();
            if (!this.a) {
                this.e.add(obj);
                z = false;
            }
            if (z) {
                this.b.invoke(obj);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(Object obj) {
        ReentrantLock reentrantLock = this.d;
        try {
            reentrantLock.lock();
            this.e.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c() {
        if (this.a) {
            return false;
        }
        ReentrantLock reentrantLock = this.d;
        try {
            reentrantLock.lock();
            if (this.a) {
                return false;
            }
            this.a = true;
            List ak = ffdx.ak(this.e);
            this.e.clear();
            reentrantLock.unlock();
            ffji ffjiVar = this.b;
            Iterator it = ak.iterator();
            while (it.hasNext()) {
                ffjiVar.invoke(it.next());
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }
}
