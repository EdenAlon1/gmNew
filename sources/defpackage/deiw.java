package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deiw implements ejwd<List<? extends eixn>> {
    final /* synthetic */ deji a;
    final /* synthetic */ eisx b;

    public deiw(deji dejiVar, eisx eisxVar) {
        this.a = dejiVar;
        this.b = eisxVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ensk i = deji.a.i();
        i.Y(ente.a, "BugleWelcome");
        ((enrr) ((enrr) i).g(th).h("com/google/android/apps/messaging/welcome/v1/SignedInWelcomeFragmentPeer$onAccountChangedCallback$1", "onError", 98, "SignedInWelcomeFragmentPeer.kt")).q("Error fetching accounts info");
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Object obj2;
        List list = (List) obj;
        list.getClass();
        deki dekiVar = (deki) this.a.e.b();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            eisx eisxVar = this.b;
            obj2 = it.next();
            if (ffkj.e(((eixn) obj2).a(), eisxVar)) {
                break;
            }
        }
        dekiVar.b((eixn) obj2);
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
