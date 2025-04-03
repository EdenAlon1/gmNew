package defpackage;

import android.database.Observable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vl extends Observable {
    public final void a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((vm) this.mObservers.get(size)).a();
            }
        }
    }

    public final void b(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((vm) this.mObservers.get(size)).g(i, i2);
            }
        }
    }

    public final void c(int i, int i2) {
        d(i, i2, null);
    }

    public final void d(int i, int i2, Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((vm) this.mObservers.get(size)).c(i, i2, obj);
            }
        }
    }

    public final void e(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((vm) this.mObservers.get(size)).d(i, i2);
            }
        }
    }

    public final void f(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((vm) this.mObservers.get(size)).e(i, i2);
            }
        }
    }

    public final void g() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((vm) this.mObservers.get(size)).f();
            }
        }
    }

    public final boolean h() {
        return !this.mObservers.isEmpty();
    }
}
