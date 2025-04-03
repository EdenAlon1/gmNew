package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvvn implements dflb, dvvh {
    public static final entd a = entd.c("GnpSdk");
    private static final ListenableFuture d = erqt.i(null);
    public final dvow b;
    public final dlpw c;
    private final errl e;
    private final String f;
    private final eafz g;

    public dvvn(dvmw dvmwVar, errl errlVar, dlpw dlpwVar, eafz eafzVar) {
        dvow dvowVar = new dvow(dvmwVar, errlVar, eafzVar);
        this.b = dvowVar;
        this.e = errlVar;
        this.f = "ANDROID_MESSAGING";
        this.c = dlpwVar;
        this.g = eafzVar;
        dfld.m(this);
        eakf.a(dvowVar.e(), new emxs() { // from class: dvvl
            @Override // defpackage.emxs
            public final void a(Object obj) {
                ((ensz) dvvn.a.o().h("com/google/android/libraries/internal/growth/growthkit/plugins/rasta/RastaPlugin", "preloadExperimentStoreCache", 70, "RastaPlugin.java")).q("RastaPlugin cache warmed up");
            }
        }, new emxs() { // from class: dvvm
            @Override // defpackage.emxs
            public final void a(Object obj) {
                ((ensz) ((ensz) ((ensz) dvvn.a.j()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/plugins/rasta/RastaPlugin", "preloadExperimentStoreCache", 71, "RastaPlugin.java")).q("Failed to warm up RastaPlugin cache");
            }
        });
    }

    @Override // defpackage.dflb
    public final void a(dflc dflcVar) {
        if (fdoa.b() && !((dfld) dflcVar.a).e() && this.f.equals(dflcVar.k)) {
            elav a2 = this.g.a("GrowthKitRastaPlugin_apply");
            try {
                this.g.b();
                String str = dflcVar.j;
                try {
                    ListenableFuture d2 = this.b.d(str, this.c.f().toEpochMilli());
                    if (d2.isDone()) {
                        Collection collection = (Collection) d2.get();
                        int[] iArr = new int[collection.size()];
                        Iterator it = collection.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            iArr[i] = ((evtu) ((dvpk) it.next()).a).c;
                            i++;
                        }
                        dflcVar.f(iArr);
                        ((ensz) a.o().h("com/google/android/libraries/internal/growth/growthkit/plugins/rasta/RastaPlugin", "apply", 106, "RastaPlugin.java")).t("RastaPlugin added %s to log event", Arrays.toString(iArr));
                    }
                } catch (InterruptedException | ExecutionException e) {
                    ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/plugins/rasta/RastaPlugin", "apply", 110, "RastaPlugin.java")).t("Could not retrieve experiments for account %s, continuing without adding experiments to log", str);
                }
                a2.close();
            } catch (Throwable th) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.dvvh
    public final ListenableFuture b(final String str, final evtv evtvVar) {
        if (!fdoa.b()) {
            return erqt.i(null);
        }
        this.g.b();
        return erny.g(erqc.o(d), eldl.d(new eroh() { // from class: dvvi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                evtv evtvVar2 = evtvVar;
                ArrayList arrayList = new ArrayList(evtvVar2.c.size());
                dvvn dvvnVar = dvvn.this;
                long epochMilli = dvvnVar.c.f().plusMillis(fdnr.a.get().a()).toEpochMilli();
                Iterator<E> it = evtvVar2.b.iterator();
                while (it.hasNext()) {
                    evub evubVar = ((evts) it.next()).c;
                    if (evubVar == null) {
                        evubVar = evub.a;
                    }
                    for (Integer num : evubVar.c) {
                        String str2 = str;
                        String valueOf = String.valueOf(num);
                        evtt evttVar = (evtt) evtu.a.createBuilder();
                        int intValue = num.intValue();
                        evttVar.copyOnWrite();
                        ((evtu) evttVar.instance).c = intValue;
                        eyiz eyizVar = (eyiz) eyja.a.createBuilder();
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(epochMilli);
                        eyizVar.copyOnWrite();
                        ((eyja) eyizVar.instance).b = seconds;
                        evttVar.copyOnWrite();
                        evtu evtuVar = (evtu) evttVar.instance;
                        eyja eyjaVar = (eyja) eyizVar.build();
                        eyjaVar.getClass();
                        evtuVar.d = eyjaVar;
                        evtuVar.b |= 1;
                        arrayList.add(dvpk.c(str2, valueOf, (evtu) evttVar.build(), 0L, epochMilli));
                    }
                }
                return dvvnVar.b.c(arrayList);
            }
        }), this.e);
    }

    @Override // defpackage.dvvh
    public final ListenableFuture c() {
        this.g.b();
        return erny.f(erny.g(erqc.o(d), eldl.d(new eroh() { // from class: dvvj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dvvn dvvnVar = dvvn.this;
                return dvvnVar.b.a(dvvnVar.c.f().toEpochMilli());
            }
        }), this.e), eldl.a(new emwl() { // from class: dvvk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = dvvn.a;
                return null;
            }
        }), this.e);
    }
}
