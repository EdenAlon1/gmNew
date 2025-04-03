package defpackage;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbcc {
    public final String e;
    public int f;
    public long g;
    public final ReentrantLock h;
    public final cqoh i;

    public cbcc(String str, cqoh cqohVar) {
        new ArrayList();
        this.f = 0;
        this.h = new ReentrantLock();
        this.e = str;
        this.i = cqohVar;
    }

    public abstract int a();

    protected abstract void b();

    public cbbn g(cbbn cbbnVar) {
        return null;
    }

    public boolean h() {
        return true;
    }

    public boolean k() {
        return false;
    }

    public cbbn l() {
        return null;
    }

    public final int n() {
        o();
        try {
            return this.f;
        } finally {
            r();
        }
    }

    public final void o() {
        this.h.lock();
    }

    public final void p() {
        o();
        try {
            this.f++;
            this.g = this.i.a();
        } finally {
            r();
        }
    }

    public final void q() {
        o();
        try {
            int i = this.f - 1;
            this.f = i;
            if (i == 0) {
                b();
            } else if (i < 0) {
                csix.c(a.h(i, "RefCountedMediaResource has unbalanced ref. Refcount="));
            }
        } finally {
            r();
        }
    }

    public final void r() {
        this.h.unlock();
    }
}
