package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekbo {
    public final emxc a;
    public final Map b;
    public final ekbv c;

    public ekbo(final Context context, ekel ekelVar, Map map, ekbv ekbvVar, errl errlVar, final efbm efbmVar, emxc emxcVar, Map map2, ejzu ejzuVar, final ffji ffjiVar, Executor executor, Map map3, ffjm ffjmVar, final ffji ffjiVar2, final eroh erohVar, ffix ffixVar) {
        context.getClass();
        ekelVar.getClass();
        map.getClass();
        ekbvVar.getClass();
        errlVar.getClass();
        efbmVar.getClass();
        emxcVar.getClass();
        map2.getClass();
        ejzuVar.getClass();
        this.c = ekbvVar;
        this.a = emxcVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((ejzu) entry.getValue()) == ejzuVar) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(keySet, 10)), 16));
        for (Object obj : keySet) {
            final String str = (String) obj;
            final dtoq dtoqVar = new dtoq(errlVar);
            ffbr ffbrVar = (ffbr) map3.get(ecvd.b(str));
            if (ffbrVar == null) {
                ffbrVar = new ffbr() { // from class: ekbj
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return ekai.a;
                    }
                };
            }
            ffbr ffbrVar2 = ffbrVar;
            emyl a = emys.a(new emyl() { // from class: ekbk
                @Override // defpackage.emyl
                public final Object get() {
                    return ekbo.e(str, dtoqVar, efbmVar, ffjiVar, ekbn.a);
                }
            });
            a.getClass();
            linkedHashMap2.put(obj, ekelVar.a(str, dtoqVar, ffjmVar, ffbrVar2, executor, a, e(str, dtoqVar, efbmVar, ffjiVar, new ffji() { // from class: ekaz
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    String str2 = (String) obj2;
                    str2.getClass();
                    return str2;
                }
            }), new ffbr() { // from class: ekba
                @Override // defpackage.ffbr, defpackage.ffbq
                public final Object b() {
                    return (ekap) ffji.this.invoke(str);
                }
            }, new erog() { // from class: ekbb
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return eroh.this.a(str);
                }
            }, ffixVar));
        }
        this.b = linkedHashMap2;
    }

    public static final effy e(final String str, final dtoq dtoqVar, efbm efbmVar, final ffji ffjiVar, final ffji ffjiVar2) {
        errj errjVar = new errj(new Callable() { // from class: ekbh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Uri) ffji.this.invoke(ffjiVar2.invoke(str));
            }
        });
        dtoqVar.a.add(errjVar);
        ejzw ejzwVar = (ejzw) ejzx.a.createBuilder();
        ejzwVar.getClass();
        ejzx a = ejzy.a(ejzwVar);
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        return efhr.a(str, errjVar, a, eyfc.a, new Executor() { // from class: ekbi
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                dtoq.this.d(runnable);
            }
        }, emxc.i(new efil(ejzx.a)), efbmVar);
    }

    public final ListenableFuture a() {
        Map map = this.b;
        final ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            final String str = (String) entry.getKey();
            ListenableFuture d = ((ekek) entry.getValue()).d();
            final ffji ffjiVar = new ffji() { // from class: ekdv
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ekcv ekcvVar = (ekcv) obj;
                    ekcvVar.getClass();
                    return ekcvVar.b().a;
                }
            };
            ListenableFuture j = elfr.j(d, new emwl() { // from class: ekdw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ffji.this.invoke(obj);
                }
            }, erpp.a);
            final ffji ffjiVar2 = new ffji() { // from class: ekbc
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    String str2 = (String) obj;
                    str2.getClass();
                    return new ffcf(str, str2);
                }
            };
            arrayList.add(elfr.j(j, new emwl() { // from class: ekbd
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ffji.this.invoke(obj);
                }
            }, erpp.a));
        }
        return elfr.c(arrayList).a(new Callable() { // from class: ekbe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = arrayList;
                LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(list, 10)), 16));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ffcf ffcfVar = (ffcf) erqt.q((Future) it.next());
                    linkedHashMap.put(ffcfVar.a, ffcfVar.b);
                }
                return linkedHashMap;
            }
        }, erpp.a);
    }

    public final ListenableFuture b(String str, ecww ecwwVar) {
        Object obj = this.b.get(str);
        obj.getClass();
        final ekek ekekVar = (ekek) obj;
        Object b = ekekVar.o.b();
        b.getClass();
        ekai ekaiVar = (ekai) b;
        ejzw ejzwVar = (ejzw) ejzx.a.createBuilder();
        ejzwVar.getClass();
        int i = ekekVar.a;
        ejzwVar.copyOnWrite();
        ejzx ejzxVar = (ejzx) ejzwVar.instance;
        ejzxVar.b |= 8;
        ejzxVar.h = i;
        if ((ecwwVar.b & 2) != 0) {
            eyee eyeeVar = ecwwVar.d;
            eyeeVar.getClass();
            ejzwVar.copyOnWrite();
            ejzx ejzxVar2 = (ejzx) ejzwVar.instance;
            ejzxVar2.b |= 4;
            ejzxVar2.e = eyeeVar;
        }
        String str2 = ecwwVar.c;
        str2.getClass();
        ejzwVar.copyOnWrite();
        ejzx ejzxVar3 = (ejzx) ejzwVar.instance;
        ejzxVar3.b |= 2;
        ejzxVar3.d = str2;
        String str3 = ecwwVar.e;
        str3.getClass();
        ejzwVar.copyOnWrite();
        ejzx ejzxVar4 = (ejzx) ejzwVar.instance;
        ejzxVar4.b |= 1;
        ejzxVar4.c = str3;
        long epochMilli = ekekVar.c.f().toEpochMilli();
        ejzwVar.copyOnWrite();
        ejzx ejzxVar5 = (ejzx) ejzwVar.instance;
        ejzxVar5.b |= 16;
        ejzxVar5.i = epochMilli;
        eygr<ecxb> eygrVar = ecwwVar.f;
        eygrVar.getClass();
        for (ecxb ecxbVar : eygrVar) {
            ekah a = ekaiVar.a(ecxbVar.e);
            if (a != null) {
                DesugarCollections.unmodifiableList(((ejzx) ejzwVar.instance).f).getClass();
                ecxbVar.getClass();
                ejzz ejzzVar = (ejzz) ekab.a.createBuilder();
                ejzzVar.getClass();
                String str4 = ecxbVar.e;
                str4.getClass();
                ejzzVar.copyOnWrite();
                ekab ekabVar = (ekab) ejzzVar.instance;
                ekabVar.b |= 1;
                ekabVar.e = str4;
                int i2 = a.b - 1;
                if (i2 == 0) {
                    long longValue = ecxbVar.c == 1 ? ((Long) ecxbVar.d).longValue() : 0L;
                    ejzzVar.copyOnWrite();
                    ekab ekabVar2 = (ekab) ejzzVar.instance;
                    ekabVar2.c = 1;
                    ekabVar2.d = Long.valueOf(longValue);
                } else if (i2 == 1) {
                    boolean booleanValue = ecxbVar.c == 2 ? ((Boolean) ecxbVar.d).booleanValue() : false;
                    ejzzVar.copyOnWrite();
                    ekab ekabVar3 = (ekab) ejzzVar.instance;
                    ekabVar3.c = 2;
                    ekabVar3.d = Boolean.valueOf(booleanValue);
                } else if (i2 == 2) {
                    double doubleValue = ecxbVar.c == 3 ? ((Double) ecxbVar.d).doubleValue() : eobe.a;
                    ejzzVar.copyOnWrite();
                    ekab ekabVar4 = (ekab) ejzzVar.instance;
                    ekabVar4.c = 3;
                    ekabVar4.d = Double.valueOf(doubleValue);
                } else if (i2 == 3) {
                    String str5 = ecxbVar.c == 4 ? (String) ecxbVar.d : "";
                    str5.getClass();
                    ejzzVar.copyOnWrite();
                    ekab ekabVar5 = (ekab) ejzzVar.instance;
                    ekabVar5.c = 4;
                    ekabVar5.d = str5;
                } else if (i2 != 4) {
                    eyee eyeeVar2 = ecxbVar.c == 5 ? (eyee) ecxbVar.d : eyee.b;
                    eyeeVar2.getClass();
                    ejzzVar.copyOnWrite();
                    ekab ekabVar6 = (ekab) ejzzVar.instance;
                    ekabVar6.c = 6;
                    ekabVar6.d = eyeeVar2;
                } else {
                    eyee eyeeVar3 = ecxbVar.c == 5 ? (eyee) ecxbVar.d : eyee.b;
                    eyeeVar3.getClass();
                    ejzzVar.copyOnWrite();
                    ekab ekabVar7 = (ekab) ejzzVar.instance;
                    ekabVar7.c = 5;
                    ekabVar7.d = eyeeVar3;
                }
                eyfy build = ejzzVar.build();
                build.getClass();
                ekab ekabVar8 = (ekab) build;
                ejzwVar.copyOnWrite();
                ejzx ejzxVar6 = (ejzx) ejzwVar.instance;
                eygr eygrVar2 = ejzxVar6.f;
                if (!eygrVar2.c()) {
                    ejzxVar6.f = eyfy.mutableCopy(eygrVar2);
                }
                ejzxVar6.f.add(ekabVar8);
            }
        }
        DesugarCollections.unmodifiableList(((ejzx) ejzwVar.instance).g).getClass();
        eygr eygrVar3 = ecwwVar.g;
        eygrVar3.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : eygrVar3) {
            if (ekaiVar.b.containsKey((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        ejzwVar.copyOnWrite();
        ejzx ejzxVar7 = (ejzx) ejzwVar.instance;
        eygr eygrVar4 = ejzxVar7.g;
        if (!eygrVar4.c()) {
            ejzxVar7.g = eyfy.mutableCopy(eygrVar4);
        }
        eydl.addAll(arrayList, ejzxVar7.g);
        final ejzx a2 = ejzy.a(ejzwVar);
        try {
            final enhk c = ekekVar.c(a2);
            return erny.g(ekekVar.m.a(ekekVar.b, new erog() { // from class: ekdl
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    final ekek ekekVar2 = ekek.this;
                    final ejzx ejzxVar8 = a2;
                    return erny.g(ekekVar2.v.c(), eldl.d(new eroh() { // from class: ekdc
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj3) {
                            final ekcv ekcvVar = (ekcv) obj3;
                            final ejzx ejzxVar9 = ejzxVar8;
                            return elfr.j(ekek.this.r.b(eldl.a(new emwl() { // from class: ekdi
                                @Override // defpackage.emwl
                                public final Object apply(Object obj4) {
                                    return ejzx.this;
                                }
                            }), erpp.a), eldl.a(new emwl() { // from class: ekdj
                                @Override // defpackage.emwl
                                public final Object apply(Object obj4) {
                                    return ekcv.this;
                                }
                            }), erpp.a);
                        }
                    }), erpp.a);
                }
            }), eldl.d(new eroh() { // from class: ekdu
                /* JADX WARN: Type inference failed for: r6v10, types: [ekap, java.lang.Object] */
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj3) {
                    ecwp ecwpVar = (ecwp) ecwu.a.createBuilder();
                    ecwq ecwqVar = (ecwq) ecwt.a.createBuilder();
                    ecwqVar.copyOnWrite();
                    ecwt ecwtVar = (ecwt) ecwqVar.instance;
                    ecwtVar.c = ecws.a(4);
                    ecwtVar.b |= 1;
                    ecwpVar.copyOnWrite();
                    ecwu ecwuVar = (ecwu) ecwpVar.instance;
                    ecwt ecwtVar2 = (ecwt) ecwqVar.build();
                    ecwtVar2.getClass();
                    ecwuVar.d = ecwtVar2;
                    ecwuVar.b |= 2;
                    ekek ekekVar2 = ekek.this;
                    ekekVar2.e(ecwpVar);
                    ejzx ejzxVar8 = a2;
                    ekeg a3 = ekef.a(ejzxVar8, ecwpVar, ekekVar2.a());
                    return ((ekcv) obj3).e(c, a3) ? ((Boolean) ekekVar2.x.a()).booleanValue() ? erqt.i(new ekau(true)) : elfr.j(ekekVar2.s.b().b(ejzxVar8.e, a3.d), eldl.a(new emwl() { // from class: ekdh
                        @Override // defpackage.emwl
                        public final Object apply(Object obj4) {
                            return new ekau(true);
                        }
                    }), erpp.a) : erqt.i(new ekau(false));
                }
            }), ekekVar.p);
        } catch (eygu e) {
            return erqt.h(e);
        }
    }

    public final List c() {
        Map map = this.b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ListenableFuture d = ((ekek) entry.getValue()).d();
            final ffji ffjiVar = new ffji() { // from class: ekde
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ekcv ekcvVar = (ekcv) obj;
                    ekcvVar.getClass();
                    return ekcvVar.b().d;
                }
            };
            ListenableFuture j = elfr.j(d, new emwl() { // from class: ekdf
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ffji.this.invoke(obj);
                }
            }, erpp.a);
            ekek ekekVar = (ekek) entry.getValue();
            eyee eyeeVar = null;
            if (ekekVar.v.e()) {
                try {
                    eyeeVar = ((ekcv) erqt.q(ekekVar.v.c())).b().b;
                } catch (ExecutionException unused) {
                }
            }
            arrayList.add(new ekbm(str, j, eyeeVar));
        }
        return arrayList;
    }

    public final boolean d() {
        Collection values = this.b.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((ekek) it.next()).f()) {
                return true;
            }
        }
        return false;
    }
}
