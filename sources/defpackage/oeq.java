package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oeq {
    public oln c;
    public final oep a = new oep();
    public final oep b = new oep();
    private final ReentrantLock d = new ReentrantLock();

    public final void a(oln olnVar, ffjm ffjmVar) {
        ReentrantLock reentrantLock = this.d;
        try {
            reentrantLock.lock();
            if (olnVar != null) {
                this.c = olnVar;
            }
            ffjmVar.a(this.a, this.b);
        } finally {
            reentrantLock.unlock();
        }
    }
}
