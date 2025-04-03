package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbue extends ceuj {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleSearch");
    private final fazb c;
    private final ffbr d;
    private final errl e;

    public cbue(fazb fazbVar, ffbr ffbrVar, errl errlVar) {
        this.c = fazbVar;
        this.d = ffbrVar;
        this.e = errlVar;
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.d(10);
        ((ceti) l).d = Duration.ofMillis(50L);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("IcingIndexUpdateHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cbuh.a.getParserForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ceuj
    public final elfl j(ceuw ceuwVar, engw engwVar) {
        elfl h;
        ekzz f = eleg.f("IcingIndexUpdateHandler::processPendingWorkItemAsync");
        try {
            ensk o = b.o();
            o.Y(cbrm.g, "IcingIndexUpdateHandler");
            o.Y(cbrm.l, Integer.valueOf(((enou) engwVar).c));
            ((ensz) o.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexUpdateHandler", "processPendingWorkItemAsync", 95, "IcingIndexUpdateHandler.java")).q("Processing icing index update work item.");
            if (engwVar.isEmpty()) {
                h = elfo.e(ceyt.i());
            } else {
                enqv it = engwVar.iterator();
                cbuh cbuhVar = (cbuh) it.next();
                h = k(it, cbuhVar.c.iterator(), cbuhVar.b).h(new emwl() { // from class: cbuc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        int i = cbue.a;
                        return ((Boolean) obj).booleanValue() ? ceyt.i() : ceyt.m();
                    }
                }, this.e);
                f.b(h);
            }
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final elfl k(final Iterator it, final Iterator it2, final int i) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if ((it.hasNext() || it2.hasNext()) && arrayList.size() < ((Integer) cful.K.e()).intValue()) {
                if (it2.hasNext()) {
                    cbsb cbsbVar = (cbsb) cbsc.a.createBuilder();
                    cbsbVar.copyOnWrite();
                    ((cbsc) cbsbVar.instance).b = i;
                    String str = (String) it2.next();
                    cbsbVar.copyOnWrite();
                    cbsc cbscVar = (cbsc) cbsbVar.instance;
                    str.getClass();
                    cbscVar.c = str;
                    arrayList.add((cbsc) cbsbVar.build());
                } else if (it.hasNext()) {
                    cbuh cbuhVar = (cbuh) it.next();
                    i = cbuhVar.b;
                    it2 = cbuhVar.c.iterator();
                }
            }
        }
        if (arrayList.isEmpty()) {
            return elfo.e(true);
        }
        return ((cbrn) this.c.b()).a(engw.n(arrayList)).i(new eroh() { // from class: cbud
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(false);
                }
                int i2 = i;
                Iterator it3 = it2;
                return cbue.this.k(it, it3, i2);
            }
        }, this.e);
    }
}
