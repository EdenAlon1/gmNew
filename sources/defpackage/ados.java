package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ados implements ejwd<List<? extends eixn>> {
    final /* synthetic */ adpj a;
    final /* synthetic */ eisx b;

    public ados(adpj adpjVar, eisx eisxVar) {
        this.a = adpjVar;
        this.b = eisxVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ensk i = adpj.a.i();
        i.Y(ente.a, "BugleWelcome");
        ((enrr) ((enrr) i).g(th).h("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountFragmentPeer$onAccountChangedCallback$1", "onError", 149, "SignOutAccountFragmentPeer.kt")).q("Error fetching accounts info");
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Object obj2;
        List list = (List) obj;
        list.getClass();
        deki dekiVar = (deki) this.a.g.b();
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
