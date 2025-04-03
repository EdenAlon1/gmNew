package defpackage;

import androidx.car.app.AppManager;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfn implements cgf {
    public final Deque a = new ArrayDeque();
    public final cex b;
    public final lkk c;

    protected cfn(cex cexVar, lkk lkkVar) {
        this.b = cexVar;
        this.c = lkkVar;
        lkkVar.c(new cfm(this));
    }

    public static final void c(cfl cflVar, boolean z) {
        lkj lkjVar = cflVar.a.c;
        if (lkjVar.a(lkj.RESUMED)) {
            cflVar.b(lki.ON_PAUSE);
        }
        if (lkjVar.a(lkj.STARTED)) {
            cflVar.b(lki.ON_STOP);
        }
        if (z) {
            cflVar.b(lki.ON_DESTROY);
        }
    }

    public final cfl a() {
        cls.a();
        cfl cflVar = (cfl) this.a.peek();
        cflVar.getClass();
        return cflVar;
    }

    public final void b(cfl cflVar, boolean z) {
        this.a.push(cflVar);
        if (z && ((lkv) this.c).c.a(lkj.CREATED)) {
            cflVar.b(lki.ON_CREATE);
        }
        if (cflVar.a.c.a(lkj.CREATED) && ((lkv) this.c).c.a(lkj.STARTED)) {
            ((AppManager) this.b.a(AppManager.class)).a();
            cflVar.b(lki.ON_START);
        }
    }
}
