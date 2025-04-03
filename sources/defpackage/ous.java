package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ous extends osb {
    private final osg b;
    private final WeakReference c;

    public ous(osg osgVar, osb osbVar) {
        super(osbVar.a);
        this.b = osgVar;
        this.c = new WeakReference(osbVar);
    }

    @Override // defpackage.osb
    public final void a(Set set) {
        set.getClass();
        osb osbVar = (osb) this.c.get();
        if (osbVar != null) {
            osbVar.a(set);
            return;
        }
        osg osgVar = this.b;
        ReentrantLock reentrantLock = osgVar.d;
        reentrantLock.lock();
        try {
            oso osoVar = (oso) osgVar.c.remove(this);
            if (osoVar != null) {
                our ourVar = osgVar.b;
                if (ourVar.c.b(osoVar.b)) {
                    ffqz.a(ffhe.a, new ose(osgVar, null));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
