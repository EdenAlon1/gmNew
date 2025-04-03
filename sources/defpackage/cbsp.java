package defpackage;

import android.os.CancellationSignal;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class cbsp implements dhqs {
    private final List a;
    private final QuerySpecification b;
    private final Executor c;
    private final elbx d;
    public final kfb g;
    public final CancellationSignal i;
    final /* synthetic */ cbsq m;
    public final Object h = new Object();
    public int j = 0;
    public boolean k = false;
    public boolean l = false;

    public cbsp(cbsq cbsqVar, List list, QuerySpecification querySpecification, Executor executor, kfb kfbVar, elbx elbxVar, CancellationSignal cancellationSignal) {
        this.m = cbsqVar;
        this.a = list;
        this.b = querySpecification;
        this.c = executor;
        this.g = kfbVar;
        this.d = elbxVar;
        this.i = cancellationSignal;
    }

    @Override // defpackage.dhqs
    public final void a(final dhre dhreVar) {
        ekzm b = this.d.b("SearchQuery.OnCompleteListener#onComplete");
        try {
            axnw.h(elfo.f(new Runnable() { // from class: cbso
                @Override // java.lang.Runnable
                public final void run() {
                    dhre dhreVar2 = dhreVar;
                    cbsp cbspVar = cbsp.this;
                    synchronized (cbspVar.h) {
                        CancellationSignal cancellationSignal = cbspVar.i;
                        if (cancellationSignal != null && cancellationSignal.isCanceled()) {
                            cbspVar.c("Search query was canceled.", cbspVar.g);
                            return;
                        }
                        boolean z = true;
                        if (dhreVar2.m() && dhreVar2.i() != null) {
                            cbspVar.j += 1000;
                            SearchResults searchResults = (SearchResults) dhreVar2.i();
                            if (searchResults.g >= 1000) {
                                z = false;
                            }
                            cbspVar.k = z;
                            dewr dewrVar = new dewr(searchResults);
                            while (dewrVar.hasNext()) {
                                cbspVar.b(dewrVar.next());
                            }
                            cbspVar.f(2, Status.a.f, "Success");
                            cbspVar.e();
                        }
                        ((ensz) ((ensz) ((ensz) cbsq.a.j()).g(dhreVar2.h())).h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl$SearchQuery", "onCompleteOnBackgroundExecutor", (char) 522, "IcingSearchApiImpl.java")).q("Cannot get search results from icing.");
                        cbspVar.l = true;
                        cbspVar.k = true;
                        Exception h = dhreVar2.h();
                        if (h != null) {
                            if (h instanceof dfqu) {
                                cbspVar.f(3, ((dfqu) h).a(), emxe.b(h.getMessage()));
                            } else {
                                cbspVar.f(3, 13, emxe.b(h.getMessage()));
                            }
                        }
                        cbspVar.e();
                    }
                }
            }, this.c));
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract void b(dewq dewqVar);

    public abstract void c(String str, kfb kfbVar);

    public abstract void d(kfb kfbVar);

    final void e() {
        if (this.k && Math.max(0, this.a.size() - 1) == 0) {
            if (this.l) {
                c("Could not fetch data from icing.", this.g);
                return;
            } else {
                d(this.g);
                return;
            }
        }
        if (this.k) {
            this.a.remove(0);
            this.k = false;
            this.j = 0;
        }
        emxf.m(!this.a.isEmpty(), "expecting request queue to be non-empty");
        cbsq cbsqVar = this.m;
        cbsqVar.j.a(((cbsn) this.a.get(0)).b, this.m.f, (String[]) ((cbsn) this.a.get(0)).a.toArray(new String[0]), this.j, 1000, this.b).s(this);
    }

    public final void f(int i, int i2, String str) {
        if (((Boolean) cbsq.b.e()).booleanValue()) {
            return;
        }
        eomp eompVar = (eomp) eoms.a.createBuilder();
        eompVar.copyOnWrite();
        eoms eomsVar = (eoms) eompVar.instance;
        eomsVar.c = i - 1;
        eomsVar.b |= 1;
        eompVar.copyOnWrite();
        eoms eomsVar2 = (eoms) eompVar.instance;
        int i3 = 2;
        eomsVar2.b |= 2;
        eomsVar2.d = i2;
        cbst.a.intValue();
        if (i2 != 8) {
            i3 = 1;
        } else if (!str.contains("TransactionTooLargeException")) {
            i3 = str.contains("Connection timed out") ? 3 : str.contains("API failed to connect while resuming") ? 4 : str.contains("Not authorized to read requested corpora") ? 5 : str.contains("Found no matching corpora for package") ? 9 : str.contains("DeadObjectException") ? 6 : str.contains("RemoteException") ? 7 : 8;
        }
        eompVar.copyOnWrite();
        eoms eomsVar3 = (eoms) eompVar.instance;
        eomsVar3.e = i3 - 1;
        eomsVar3.b = 8 | eomsVar3.b;
        eompVar.copyOnWrite();
        eoms eomsVar4 = (eoms) eompVar.instance;
        eomsVar4.f = 1;
        eomsVar4.b |= 16;
        akxl akxlVar = (akxl) this.m.i.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoms eomsVar5 = (eoms) eompVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eomsVar5.getClass();
        eolvVar.M = eomsVar5;
        eolvVar.c |= 128;
        eolt eoltVar = eolt.BUGLE_ICING_SEARCH;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.j = eoltVar.dk;
        eolvVar2.b |= 1;
        akxlVar.k(eoluVar, epyw.BUGLE_ICING_SEARCH);
    }
}
