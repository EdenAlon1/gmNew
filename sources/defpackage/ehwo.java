package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehwo extends ehwh {
    final /* synthetic */ IBinder a;
    final /* synthetic */ ehwq b;

    public ehwo(ehwq ehwqVar, IBinder iBinder) {
        this.a = iBinder;
        this.b = ehwqVar;
    }

    @Override // defpackage.ehwh
    public final void a() {
        ehwr ehwrVar = this.b.a;
        ehwrVar.n = (IInterface) ehwrVar.i.a(this.a);
        ehwr ehwrVar2 = this.b.a;
        ehwrVar2.b.d("linkToDeath", new Object[0]);
        try {
            ehwrVar2.n.asBinder().linkToDeath(ehwrVar2.k, 0);
        } catch (RemoteException e) {
            ehwrVar2.b.c(e, "linkToDeath failed", new Object[0]);
        }
        this.b.a.g = false;
        Iterator it = this.b.a.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.b.a.d.clear();
    }
}
