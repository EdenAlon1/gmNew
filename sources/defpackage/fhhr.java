package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhr {
    public final fhhu a;
    public final String b;
    public boolean c;
    public fhho d;
    public final List e = new ArrayList();
    public boolean f;

    public fhhr(fhhu fhhuVar, String str) {
        this.a = fhhuVar;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = fhhl.a;
        synchronized (this.a) {
            if (c()) {
                this.a.c(this);
            }
        }
    }

    public final void b() {
        byte[] bArr = fhhl.a;
        synchronized (this.a) {
            this.c = true;
            if (c()) {
                this.a.c(this);
            }
        }
    }

    public final boolean c() {
        if (this.d != null) {
            this.f = true;
        }
        int size = this.e.size() - 1;
        boolean z = false;
        while (size >= 0) {
            fhho fhhoVar = (fhho) this.e.get(size);
            if (fhhu.b.isLoggable(Level.FINE)) {
                fhhp.b(fhhoVar, this, "canceled");
            }
            this.e.remove(size);
            size--;
            z = true;
        }
        return z;
    }

    public final boolean d(fhho fhhoVar, long j, boolean z) {
        fhhr fhhrVar = fhhoVar.b;
        if (fhhrVar != this) {
            if (fhhrVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            fhhoVar.b = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        int indexOf = this.e.indexOf(fhhoVar);
        if (indexOf != -1) {
            if (fhhoVar.c <= j2) {
                if (fhhu.b.isLoggable(Level.FINE)) {
                    fhhp.b(fhhoVar, this, "already scheduled");
                }
                return false;
            }
            this.e.remove(indexOf);
        }
        fhhoVar.c = j2;
        if (fhhu.b.isLoggable(Level.FINE)) {
            long j3 = j2 - nanoTime;
            fhhp.b(fhhoVar, this, z ? "run again after ".concat(fhhp.a(j3)) : "scheduled after ".concat(fhhp.a(j3)));
        }
        Iterator it = this.e.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((fhho) it.next()).c - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.e.size();
        }
        this.e.add(i, fhhoVar);
        return i == 0;
    }

    public final void f(fhho fhhoVar) {
        fhhoVar.getClass();
        synchronized (this.a) {
            if (this.c) {
                if (fhhu.b.isLoggable(Level.FINE)) {
                    fhhp.b(fhhoVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d(fhhoVar, 0L, false)) {
                    this.a.c(this);
                }
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
