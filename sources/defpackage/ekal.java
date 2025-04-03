package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekal implements ekaw {
    private final fazb a;
    private final ekem b;
    private final Context c;

    /* compiled from: PG */
    public interface a {
        ekhk fJ();
    }

    public ekal(fazb fazbVar, ekem ekemVar, Context context) {
        fazbVar.getClass();
        context.getClass();
        this.a = fazbVar;
        this.b = ekemVar;
        this.c = context;
    }

    public final ListenableFuture a(final String str, eisx eisxVar, eixz eixzVar, boolean z) {
        final ekhk fJ = ((a) ekhv.a(this.c, a.class, eisxVar)).fJ();
        String a2 = this.b.a(eixzVar);
        ekzz g = eleg.g("Fetching experiments for account", elad.a);
        try {
            g = eleg.g("PhenotypeApi.getConfigurationSnapshot", elad.a);
            try {
                ListenableFuture c = fJ.c.c(str, a2);
                if (z) {
                    c = eldx.a(c, 25L, TimeUnit.SECONDS, fJ.a);
                }
                g.b(c);
                ffig.a(g, null);
                final ListenableFuture k = elfr.k(c, eldl.d(new eroh() { // from class: ekhc
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        ListenableFuture f;
                        ecww ecwwVar = (ecww) obj;
                        ekzz g2 = eleg.g("ConsistencyTierState.setNewValues", elad.a);
                        final ekhk ekhkVar = ekhk.this;
                        String str2 = str;
                        try {
                            ejzu ejzuVar = (ejzu) ekhkVar.b.get(str2);
                            if (ejzuVar != null) {
                                int ordinal = ejzuVar.ordinal();
                                if (ordinal == 1) {
                                    ekbo ekboVar = ekhkVar.f;
                                    ecwwVar.getClass();
                                    f = erny.f(ekboVar.b(str2, ecwwVar), eldl.a(new emwl() { // from class: ekhe
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            ekau ekauVar = (ekau) obj2;
                                            ekauVar.getClass();
                                            if (!ekauVar.a) {
                                                ekhk ekhkVar2 = ekhk.this;
                                                if (ekhkVar2.d.g()) {
                                                    ekhkVar2.g.a();
                                                    ((edav) ekhkVar2.d.c()).a();
                                                }
                                            }
                                            return ekauVar;
                                        }
                                    }), erpp.a);
                                } else if (ordinal == 3) {
                                    ekbo ekboVar2 = ekhkVar.e;
                                    ecwwVar.getClass();
                                    f = ekboVar2.b(str2, ecwwVar);
                                }
                                g2.b(f);
                                ffig.a(g2, null);
                                return f;
                            }
                            throw new UnsupportedOperationException();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ffig.a(g2, th);
                                throw th2;
                            }
                        }
                    }
                }), erpp.a);
                ffig.a(g, null);
                ListenableFuture b = fJ.h.f.b();
                final ffji ffjiVar = new ffji() { // from class: ekha
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dfrq dfrqVar = (dfrq) obj;
                        dfrqVar.getClass();
                        return Integer.valueOf(Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot", dfrqVar));
                    }
                };
                return erny.f(ekcu.a(ffdx.g(elfr.e(b, dfrq.class, new emwl() { // from class: ekhb
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ffji.this.invoke(obj);
                    }
                }, erpp.a), k)), eldl.a(new emwl() { // from class: ekhd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ((List) obj).getClass();
                        return (ekau) erqt.q(ListenableFuture.this);
                    }
                }), erpp.a);
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.ekaw
    public final ListenableFuture b(final String str, final boolean z) {
        str.getClass();
        return erny.g(((eixo) this.a.b()).f(), eldl.d(new eroh() { // from class: ekak
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                List<eixn> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
                for (eixn eixnVar : list) {
                    boolean z2 = z;
                    String str2 = str;
                    ekal ekalVar = ekal.this;
                    arrayList.add(ekalVar.a(str2, eixnVar.a(), eixnVar.b(), z2));
                }
                return ekcu.a(arrayList);
            }
        }), erpp.a);
    }

    @Override // defpackage.ekaw
    public final ListenableFuture c(final String str, final eisx eisxVar) {
        return erny.g(((eixo) this.a.b()).c(eisxVar), eldl.d(new eroh() { // from class: ekaj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eixn eixnVar = (eixn) obj;
                eixnVar.getClass();
                return ekal.this.a(str, eisxVar, eixnVar.b(), true);
            }
        }), erpp.a);
    }
}
