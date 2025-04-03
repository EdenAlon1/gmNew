package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqg implements dvpl {
    public static final entd a = entd.c("GnpSdk");
    public final eafv b;
    public final Context c;
    public final errl d;
    public final eafv e;
    public final dvjd f;
    public final dvbu g;
    public final String h;
    public final dlpw i;
    public final Map j;
    public final Set k;
    public final fazb l;
    private final ListenableFuture m;
    private final emxc n;
    private final emxc o;
    private final emxc p;
    private final ffbr q;
    private final easq r;

    public dvqg(Context context, ListenableFuture listenableFuture, errl errlVar, eafv eafvVar, eafv eafvVar2, dvjd dvjdVar, dvbu dvbuVar, String str, emxc emxcVar, emxc emxcVar2, easq easqVar, dlpw dlpwVar, Map map, Set set, emxc emxcVar3, ffbr ffbrVar, fazb fazbVar) {
        this.c = context;
        this.m = listenableFuture;
        this.d = errlVar;
        this.e = eafvVar2;
        this.f = dvjdVar;
        this.g = dvbuVar;
        this.b = eafvVar;
        this.h = str;
        this.n = emxcVar;
        this.o = emxcVar2;
        this.r = easqVar;
        this.i = dlpwVar;
        this.j = map;
        this.k = set;
        this.p = emxcVar3;
        this.q = ffbrVar;
        this.l = fazbVar;
    }

    private final ListenableFuture f() {
        return erny.f(this.m, new emwl() { // from class: dvpz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                SharedPreferences.Editor edit = ((SharedPreferences) obj).edit();
                dvqg dvqgVar = dvqg.this;
                edit.putString("SYNC_LANGUAGE", dvdl.a(dvqgVar.c)).putLong("LAST_SYNC_TIME", dvqgVar.i.f().toEpochMilli()).apply();
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.dvpl
    public final ListenableFuture a(final int i) {
        ListenableFuture i2;
        emxf.a(true);
        final ArrayList arrayList = new ArrayList();
        arrayList.add(f());
        if (((Boolean) this.q.b()).booleanValue()) {
            i2 = erqt.i(new eafo(ffcu.a));
        } else {
            i2 = ((eamf) ((emxn) this.p).a).a(exyd.GROWTHKIT_PERIODIC_REGISTRATION, eagp.c);
        }
        arrayList.add(erny.g(i2, eldl.d(new eroh() { // from class: dvpv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eafl eaflVar = (eafl) obj;
                if (eaflVar.e()) {
                    return erqt.h(new Exception("Registration to GNP failed, aborting sync.", eaflVar.d()));
                }
                int i3 = i;
                dvqg dvqgVar = dvqg.this;
                ArrayList arrayList2 = new ArrayList();
                if (fdoq.b()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (String str : dvqgVar.g.a()) {
                        Boolean bool = true;
                        bool.getClass();
                        arrayList3.add(dvqgVar.d(((dvmt) dvqgVar.b.a(str)).c(), dvqgVar.c(), str, false, i3));
                    }
                    arrayList2.addAll(arrayList3);
                }
                arrayList2.add(dvqgVar.e(i3));
                return erqt.e(arrayList2);
            }
        }), erpp.a));
        return erqt.a(arrayList).b(new erog() { // from class: dvpw
            @Override // defpackage.erog
            public final ListenableFuture a() {
                entd entdVar = dvqg.a;
                return erqt.e(arrayList);
            }
        }, erpp.a);
    }

    @Override // defpackage.dvpl
    public final ListenableFuture b(String str) {
        emxf.a(true);
        final ArrayList arrayList = new ArrayList();
        arrayList.add(f());
        if (str == null) {
            arrayList.add(e(15));
        } else if (fdoq.b()) {
            arrayList.add(d(((dvmt) this.b.a(str)).c(), c(), str, false, 15));
        }
        return erqt.a(arrayList).b(new erog() { // from class: dvpu
            @Override // defpackage.erog
            public final ListenableFuture a() {
                entd entdVar = dvqg.a;
                return erqt.e(arrayList);
            }
        }, erpp.a);
    }

    public final evtg c() {
        evso evsoVar = (evso) evsp.a.createBuilder();
        evsoVar.copyOnWrite();
        evsp evspVar = (evsp) evsoVar.instance;
        String str = this.h;
        str.getClass();
        evspVar.c = 4;
        evspVar.d = str;
        if (this.n.g()) {
            String obj = this.n.c().toString();
            evsoVar.copyOnWrite();
            evsp evspVar2 = (evsp) evsoVar.instance;
            evspVar2.b |= 1;
            evspVar2.e = obj;
        }
        if (this.o.g()) {
            String str2 = (String) this.o.c();
            evsoVar.copyOnWrite();
            evsp evspVar3 = (evsp) evsoVar.instance;
            evspVar3.b |= 2;
            evspVar3.f = str2;
        }
        evtg evtgVar = (evtg) evth.a.createBuilder();
        evsu evsuVar = (evsu) evsw.a.createBuilder();
        evsuVar.copyOnWrite();
        evsw evswVar = (evsw) evsuVar.instance;
        evswVar.c = 6;
        evswVar.b |= 1;
        evsuVar.copyOnWrite();
        evsw evswVar2 = (evsw) evsuVar.instance;
        evswVar2.b |= 2;
        evswVar2.d = 728121172;
        evsuVar.copyOnWrite();
        evsw evswVar3 = (evsw) evsuVar.instance;
        evsp evspVar4 = (evsp) evsoVar.build();
        evspVar4.getClass();
        evswVar3.e = evspVar4;
        evswVar3.b |= 4;
        evtgVar.copyOnWrite();
        evth evthVar = (evth) evtgVar.instance;
        evsw evswVar4 = (evsw) evsuVar.build();
        evswVar4.getClass();
        evthVar.d = evswVar4;
        evthVar.b |= 1;
        evtb evtbVar = (evtb) evte.a.createBuilder();
        String a2 = dvdl.a(this.c);
        evtbVar.copyOnWrite();
        evte evteVar = (evte) evtbVar.instance;
        a2.getClass();
        evteVar.b |= 4;
        evteVar.f = a2;
        evtbVar.copyOnWrite();
        evte evteVar2 = (evte) evtbVar.instance;
        evteVar2.g = 1;
        evteVar2.b |= 8;
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        evtbVar.copyOnWrite();
        evte evteVar3 = (evte) evtbVar.instance;
        valueOf.getClass();
        evteVar3.b |= 16;
        evteVar3.h = valueOf;
        evsz evszVar = (evsz) evta.a.createBuilder();
        String str3 = Build.BRAND;
        evszVar.copyOnWrite();
        evta evtaVar = (evta) evszVar.instance;
        str3.getClass();
        evtaVar.b = 1 | evtaVar.b;
        evtaVar.c = str3;
        String str4 = Build.DISPLAY;
        evszVar.copyOnWrite();
        evta evtaVar2 = (evta) evszVar.instance;
        str4.getClass();
        evtaVar2.b |= 2;
        evtaVar2.d = str4;
        String str5 = Build.MODEL;
        evszVar.copyOnWrite();
        evta evtaVar3 = (evta) evszVar.instance;
        str5.getClass();
        evtaVar3.b = 4 | evtaVar3.b;
        evtaVar3.e = str5;
        evta evtaVar4 = (evta) evszVar.build();
        evtbVar.copyOnWrite();
        evte evteVar4 = (evte) evtbVar.instance;
        evtaVar4.getClass();
        evteVar4.d = evtaVar4;
        evteVar4.c = 7;
        String e = fdoq.a.get().e();
        if (!TextUtils.isEmpty(e)) {
            evtbVar.copyOnWrite();
            evte evteVar5 = (evte) evtbVar.instance;
            e.getClass();
            evteVar5.b |= 2;
            evteVar5.e = e;
        }
        evte evteVar6 = (evte) evtbVar.build();
        evtgVar.copyOnWrite();
        evth evthVar2 = (evth) evtgVar.instance;
        evteVar6.getClass();
        evthVar2.e = evteVar6;
        evthVar2.b |= 2;
        return evtgVar;
    }

    public final ListenableFuture d(ListenableFuture listenableFuture, final evtg evtgVar, final String str, boolean z, final int i) {
        ListenableFuture g = erny.g(erny.g(erqc.o(listenableFuture), eldl.d(new eroh() { // from class: dvqc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = dvqg.a;
                evtk evtkVar = (evtk) evtp.a.createBuilder();
                evtkVar.copyOnWrite();
                evtp evtpVar = (evtp) evtkVar.instance;
                evth evthVar = (evth) evtg.this.build();
                evthVar.getClass();
                evtpVar.c = evthVar;
                evtpVar.b |= 1;
                Collection values = ((Map) obj).values();
                evtkVar.copyOnWrite();
                evtp evtpVar2 = (evtp) evtkVar.instance;
                eygr eygrVar = evtpVar2.d;
                if (!eygrVar.c()) {
                    evtpVar2.d = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(values, evtpVar2.d);
                return erqt.i((evtp) evtkVar.build());
            }
        }), erpp.a), eldl.d(new eroh() { // from class: dvqd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return dvqg.this.f.a((evtp) obj, str, i);
            }
        }), erpp.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(erny.g(g, eldl.d(new eroh() { // from class: dvqe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((dvmt) dvqg.this.b.a(str)).a();
            }
        }), erpp.a));
        arrayList.add(erny.g(g, eldl.d(new eroh() { // from class: dvqf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                evtv evtvVar = (evtv) obj;
                ArrayList arrayList2 = new ArrayList(1);
                dvqg dvqgVar = dvqg.this;
                enqu listIterator = ((enpx) dvqgVar.k).listIterator();
                while (listIterator.hasNext()) {
                    arrayList2.add(((dvvh) listIterator.next()).b(str, evtvVar));
                }
                return erqt.a(arrayList2).a(new Callable() { // from class: dvpx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        entd entdVar = dvqg.a;
                        return null;
                    }
                }, dvqgVar.d);
            }
        }), erpp.a));
        arrayList.add(erny.g(g, eldl.d(new eroh() { // from class: dvps
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                evtv evtvVar = (evtv) obj;
                ArrayList arrayList2 = new ArrayList(evtvVar.b.size());
                Iterator<E> it = evtvVar.b.iterator();
                while (true) {
                    final dvqg dvqgVar = dvqg.this;
                    if (!it.hasNext()) {
                        final String str2 = str;
                        return erny.g(erqt.o(arrayList2), eldl.d(new eroh() { // from class: dvpy
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final List list = (List) obj2;
                                HashMap h = ennc.h(list.size());
                                final String str3 = str2;
                                String a2 = easp.a(str3);
                                Iterator it2 = list.iterator();
                                while (true) {
                                    dvqg dvqgVar2 = dvqg.this;
                                    if (!it2.hasNext()) {
                                        return erny.g(((dvmt) dvqgVar2.e.a(str3)).b(h), eldl.d(new eroh() { // from class: dvqa
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj3) {
                                                ((ensz) dvqg.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/sync/impl/PromotionSyncImpl", "storePromotions", 453, "PromotionSyncImpl.java")).J("%s promos replaced with %s promos for account: %s", (Integer) obj3, Integer.valueOf(list.size()), str3);
                                                return erre.a;
                                            }
                                        }), erpp.a);
                                    }
                                    evts evtsVar = (evts) it2.next();
                                    if (evtsVar != null) {
                                        ((efkw) ((ears) dvqgVar2.l.b()).q.get()).a(dvqgVar2.h, a2);
                                        h.put(dvmu.a(evtsVar), evtsVar);
                                    }
                                }
                            }
                        }), erpp.a);
                    }
                    final evts evtsVar = (evts) it.next();
                    evzd evzdVar = evtsVar.f;
                    if (evzdVar == null) {
                        evzdVar = evzd.a;
                    }
                    evzc b = evzc.b(evzdVar.e);
                    if (b == null) {
                        b = evzc.UITYPE_NONE;
                    }
                    if (b != evzc.UITYPE_GNP_CUSTOM_UI) {
                        ArrayList arrayList3 = new ArrayList();
                        Map map = dvqgVar.j;
                        evzd evzdVar2 = evtsVar.f;
                        if (evzdVar2 == null) {
                            evzdVar2 = evzd.a;
                        }
                        evzc b2 = evzc.b(evzdVar2.e);
                        if (b2 == null) {
                            b2 = evzc.UITYPE_NONE;
                        }
                        ffbr ffbrVar = (ffbr) map.get(b2);
                        if (ffbrVar != null) {
                            dvsf dvsfVar = (dvsf) ffbrVar.b();
                            evzd evzdVar3 = evtsVar.f;
                            if (evzdVar3 == null) {
                                evzdVar3 = evzd.a;
                            }
                            arrayList3.addAll(dvsfVar.a(evzdVar3.c == 2 ? (evxu) evzdVar3.d : evxu.a));
                            dvsf dvsfVar2 = (dvsf) ffbrVar.b();
                            evzd evzdVar4 = evtsVar.f;
                            if (evzdVar4 == null) {
                                evzdVar4 = evzd.a;
                            }
                            evxu evxuVar = (evzdVar4.c == 6 ? (evyu) evzdVar4.d : evyu.a).d;
                            if (evxuVar == null) {
                                evxuVar = evxu.a;
                            }
                            arrayList3.addAll(dvsfVar2.a(evxuVar));
                        }
                        arrayList2.add(erqt.c(arrayList3).a(new Callable() { // from class: dvpr
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                entd entdVar = dvqg.a;
                                return evts.this;
                            }
                        }, erpp.a));
                    }
                }
            }
        }), erpp.a));
        return erqt.c(arrayList).a(new Callable() { // from class: dvpt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = dvqg.a;
                return null;
            }
        }, erpp.a);
    }

    public final ListenableFuture e(final int i) {
        return fdoq.c() ? erny.g(this.r.a(), eldl.d(new eroh() { // from class: dvqb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) obj;
                if (pseudonymousIdToken.a == null) {
                    return erqt.i(null);
                }
                int i2 = i;
                dvqg dvqgVar = dvqg.this;
                evtg c = dvqgVar.c();
                String str = pseudonymousIdToken.a;
                c.copyOnWrite();
                evth evthVar = (evth) c.instance;
                evth evthVar2 = evth.a;
                str.getClass();
                evthVar.c = str;
                Boolean bool = true;
                bool.getClass();
                return dvqgVar.d(((dvmt) dvqgVar.b.a(null)).c(), c, null, false, i2);
            }
        }), this.d) : erqt.i(null);
    }
}
