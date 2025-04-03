package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnm {
    public final fhmt a = new fhmt();
    public boolean b;
    public boolean c;
    public final ReentrantLock d;
    public final Condition e;
    public final fhnt f;
    public final fhnv g;

    public fhnm() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.d = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        this.e = newCondition;
        this.f = new fhnk(this);
        this.g = new fhnl(this);
    }
}
