package defpackage;

import android.content.Context;
import com.google.android.gms.phenotype.internal.IPhenotypeService;
import com.google.android.ims.util.common.RcsIntents;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfud {
    public static final entd a = entd.c("BuglePhenotype");
    public final Context b;
    public final ffbr c;
    private final emyl e;
    private final ffbr g;
    private final List f = new CopyOnWriteArrayList();
    public volatile boolean d = false;

    public cfud(Context context, final fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = context;
        this.e = emys.a(new emyl() { // from class: cfub
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = cfud.a;
                return new CopyOnWriteArraySet((Collection) fazb.this.b());
            }
        });
        this.c = ffbrVar;
        this.g = ffbrVar2;
    }

    public final void a() {
        ekzz f = eleg.f("PhenotypeHelper#onCsLibPhenotypeChanged");
        try {
            dkvx.a();
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((diyo) it.next()).onCsLibPhenotypeUpdated();
            }
            Iterator it2 = ((Set) this.e.get()).iterator();
            while (it2.hasNext()) {
                ((diyo) it2.next()).onCsLibPhenotypeUpdated();
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(final Context context, final cuae cuaeVar) {
        ekzz f = eleg.f("PhenotypeHelper#registerCsLibPhenotype");
        try {
            emwl a2 = eldl.a(new emwl() { // from class: cfuc
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cfud cfudVar = cfud.this;
                    cfudVar.d = true;
                    Context context2 = context;
                    context2.sendBroadcast(akuv.c(context2, diyp.class, RcsIntents.ACTION_CSLIB_FLAGS_UPDATED).a());
                    cfudVar.a();
                    return null;
                }
            });
            final cuaa cuaaVar = (cuaa) ((csjk) this.c.b()).a();
            final cfua cfuaVar = new cfua(a2);
            cuaa.d.m("Unregistering legacy CSLib packages");
            engw engwVar = cuaa.e;
            final dhlk dhlkVar = new dhlk() { // from class: ctzx
                @Override // defpackage.dhlk
                public final void a(boolean z) {
                    cuaa.this.b(context, cfuaVar, cuaeVar);
                }
            };
            csjb a3 = ctzr.a.a();
            a3.A("Unregistering packages", engwVar);
            a3.r();
            ArrayList arrayList = new ArrayList();
            enqv it = engwVar.iterator();
            while (it.hasNext()) {
                final String str = (String) it.next();
                dhlf dhlfVar = (dhlf) cuaaVar.c.a();
                dfun dfunVar = new dfun();
                dfunVar.a = new dfuf() { // from class: dhks
                    @Override // defpackage.dfuf
                    public final void a(Object obj, Object obj2) {
                        int i = dhlf.a;
                        ((IPhenotypeService) ((dhlo) obj).w()).unRegister(new dhle((dhri) obj2), str);
                    }
                };
                dhre i = dhlfVar.i(dfunVar.a());
                i.s(new dhqs() { // from class: ctzn
                    @Override // defpackage.dhqs
                    public final void a(dhre dhreVar) {
                        csjb a4 = ctzr.a.a();
                        a4.A("Unregister package", str);
                        a4.B("success", dhreVar.m());
                        a4.r();
                    }
                });
                arrayList.add(i);
            }
            dhrt.d(arrayList).s(new dhqs() { // from class: ctzo
                @Override // defpackage.dhqs
                public final void a(dhre dhreVar) {
                    cskc cskcVar = ctzr.a;
                    dhlk.this.a(dhreVar.m());
                }
            });
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(diyo diyoVar) {
        this.f.add(diyoVar);
    }

    public final void d(Context context) {
        final cftw cftwVar = (cftw) this.g.b();
        ekzz f = eleg.f("PhenotypeHelper#registerPhenotype");
        try {
            final emwl a2 = eldl.a(new emwl() { // from class: cftu
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    if (((dhre) obj).m()) {
                        cftw.this.b();
                        return null;
                    }
                    ((ensz) ((ensz) cftw.a.j()).h("com/google/android/apps/messaging/shared/experiments/BuglePhenotypeHelper", "registerPhenotype", 127, "BuglePhenotypeHelper.java")).q("Failure registering Phenotype client.");
                    return null;
                }
            });
            context.getClass();
            cvdd a3 = cvdd.a(context);
            a3.getClass();
            int i = a3.b;
            dfqt dfqtVar = dhkk.a;
            new dhlf(context).c(cfuf.a(context), i, cftw.c, cftw.a().toByteArray()).s(new dhqs() { // from class: cftv
                @Override // defpackage.dhqs
                public final void a(dhre dhreVar) {
                    emwl.this.apply(dhreVar);
                }
            });
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        ((cftw) this.g.b()).b();
    }
}
