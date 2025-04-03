package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import io.grpc.StatusException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duev {
    public static final enru a = enru.c("com/google/android/libraries/geller/gellersync/GellerSyncClient");
    public final emxc b;
    public final Geller c;
    public final emwl d;
    public final Set e;
    public final emwl f;
    public final ExecutorService g;
    public final ExecutorService h;
    public final ExecutorService i;
    public final eyev j;
    public final Boolean k;
    public final dudi l;
    public final Map m;
    public final emyg n;
    public final emxc o;
    public int p = 0;
    public String q;
    public String r;
    public String s;
    private final String t;

    public duev(emxc emxcVar, Geller geller, String str, emwl emwlVar, Set set, emwl emwlVar2, eyev eyevVar, Boolean bool, dudi dudiVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, Map map, emyv emyvVar) {
        this.b = emxcVar;
        this.c = geller;
        this.t = str;
        this.d = emwlVar;
        this.e = set;
        this.f = emwlVar2;
        this.j = eyevVar;
        this.k = bool;
        this.l = dudiVar;
        this.g = executorService;
        this.h = executorService2;
        this.i = executorService3;
        this.m = map;
        this.n = new emyg(emyvVar);
        this.o = emxc.j(new duch(new duci(), executorService));
    }

    public static final enhk d(Iterable iterable, Exception exc, String str) {
        enhd enhdVar = new enhd();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ezib ezibVar = (ezib) it.next();
            ducl duclVar = new ducl();
            duclVar.g(new duew(str, exc));
            enhdVar.k(ezibVar, duclVar.a());
            ezibVar.name();
        }
        return enhdVar.c();
    }

    public final ListenableFuture a(Set set, final dubz dubzVar, int i) {
        ListenableFuture f;
        if (i == 2) {
            f = erqt.i(enpd.a);
        } else {
            int i2 = engw.d;
            engr engrVar = new engr();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                final ezib ezibVar = (ezib) it.next();
                engrVar.h(erny.f(elfr.i(new erog() { // from class: dudk
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        duev duevVar = duev.this;
                        if (!duevVar.b.g()) {
                            return erqt.i(true);
                        }
                        ezib ezibVar2 = ezibVar;
                        dubz dubzVar2 = dubzVar;
                        return dubzVar2.b(ezibVar2);
                    }
                }, this.g), eldl.a(new emwl() { // from class: dudl
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        ezib ezibVar2 = ezib.this;
                        if (booleanValue) {
                            return ezibVar2;
                        }
                        ((enrr) ((enrr) duev.a.j()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "filterUploadEnabled", 1112, "GellerSyncClient.java")).t("Upload permissions denied for Corpus %s", ezibVar2.name());
                        return null;
                    }
                }), this.g));
            }
            f = erny.f(erqt.o(engrVar.g()), eldl.a(new emwl() { // from class: dudm
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    enin eninVar = new enin();
                    for (ezib ezibVar2 : (List) obj) {
                        if (ezibVar2 != null) {
                            eninVar.c(ezibVar2);
                        }
                    }
                    return eninVar.g();
                }
            }), this.g);
        }
        return erny.f(erny.g(erny.g(erqc.o(f), eldl.d(new eroh() { // from class: dudx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final enip enipVar = (enip) obj;
                duev duevVar = duev.this;
                final String b = dufy.b(duevVar.b);
                final eypd eypdVar = eypd.CREATE_REQUEST;
                ezvp ezvpVar = ezvp.a;
                final boolean z = duevVar.c.e.j;
                Iterator<E> it2 = enipVar.iterator();
                while (true) {
                    final Geller geller = duevVar.c;
                    if (!it2.hasNext()) {
                        return elfr.i(new erog() { // from class: dugk
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                enip enipVar2 = enipVar;
                                String[] strArr = new String[enipVar2.size()];
                                enqu listIterator = enipVar2.listIterator();
                                int i3 = 0;
                                while (listIterator.hasNext()) {
                                    strArr[i3] = ((ezib) listIterator.next()).name();
                                    i3++;
                                }
                                boolean z2 = z;
                                eypd eypdVar2 = eypdVar;
                                String str = b;
                                Geller geller2 = Geller.this;
                                eypc eypcVar = (eypc) dugv.a(geller2.nativeReadSnapshot(geller2.a(), geller2.c.a(str), strArr, eypdVar2.c, z2), eypc.a);
                                enqu listIterator2 = enipVar2.listIterator();
                                while (listIterator2.hasNext()) {
                                    ezib ezibVar2 = (ezib) listIterator2.next();
                                    geller2.f(ezibVar2);
                                    ezibVar2.name();
                                }
                                return erqt.i(eypcVar);
                            }
                        }, geller.b);
                    }
                    geller.g((ezib) it2.next(), ezvpVar);
                }
            }
        }), this.g), eldl.d(new eroh() { // from class: dudy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eypc eypcVar = (eypc) obj;
                ArrayList arrayList = new ArrayList(eypcVar.b.size());
                for (eymy eymyVar : eypcVar.b) {
                    final ezib b = ezib.b(eymyVar.d);
                    if (b == null) {
                        b = ezib.UNKNOWN;
                    }
                    final ArrayList arrayList2 = new ArrayList((eymyVar.b == 2 ? (eyna) eymyVar.c : eyna.a).b);
                    final eygr eygrVar = (eymyVar.b == 2 ? (eyna) eymyVar.c : eyna.a).c;
                    if (b.name().startsWith("ENCRYPTED_")) {
                        duev duevVar = duev.this;
                        duch duchVar = (duch) ((emxn) duevVar.o).a;
                        arrayList.add(erny.f(erny.f(duchVar.c.a(dufy.b(duevVar.b)), eldl.a(new emwl() { // from class: ducg
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ducc duccVar = (ducc) ((emxc) obj2).f();
                                if (duccVar == null) {
                                    ((enrr) ((enrr) duch.a.i()).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "encryptElements", 62, "EncryptionUtil.java")).q("Failed to fetch encryption key to encrypt Elements.");
                                    int i3 = engw.d;
                                    return enou.a;
                                }
                                List<ezie> list = arrayList2;
                                ArrayList arrayList3 = new ArrayList(list.size());
                                for (ezie ezieVar : list) {
                                    if ((ezieVar.b & 8) != 0) {
                                        ezif ezifVar = (ezif) ezig.a.createBuilder();
                                        try {
                                            eydq eydqVar = ezieVar.e;
                                            if (eydqVar == null) {
                                                eydqVar = eydq.a;
                                            }
                                            eyee x = eyee.x(new euhp(duccVar.a()).b(eydqVar.toByteArray(), duch.b));
                                            ezifVar.copyOnWrite();
                                            ezig ezigVar = (ezig) ezifVar.instance;
                                            ezigVar.b |= 1;
                                            ezigVar.c = x;
                                            ezifVar.copyOnWrite();
                                            ezig ezigVar2 = (ezig) ezifVar.instance;
                                            ezigVar2.b |= 2;
                                            ezigVar2.d = -1;
                                            ezid ezidVar = (ezid) ezieVar.toBuilder();
                                            eydp eydpVar = (eydp) eydq.a.createBuilder();
                                            eydpVar.copyOnWrite();
                                            ((eydq) eydpVar.instance).b = "type.googleapis.com/geller.oneplatform.GellerE2eeElement";
                                            eyee byteString = ((ezig) ezifVar.build()).toByteString();
                                            eydpVar.copyOnWrite();
                                            ((eydq) eydpVar.instance).c = byteString;
                                            ezidVar.copyOnWrite();
                                            ezie ezieVar2 = (ezie) ezidVar.instance;
                                            eydq eydqVar2 = (eydq) eydpVar.build();
                                            eydqVar2.getClass();
                                            ezieVar2.e = eydqVar2;
                                            ezieVar2.b |= 8;
                                            arrayList3.add((ezie) ezidVar.build());
                                        } catch (Exception e) {
                                            ((enrr) ((enrr) ((enrr) duch.a.i()).g(e)).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "encryptElements", 'U', "EncryptionUtil.java")).q("Unexpected error when trying to encrypt element.");
                                        }
                                    } else {
                                        ((enrr) ((enrr) duch.a.i()).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "encryptElements", 68, "EncryptionUtil.java")).q("Element to encrypt is missing data field.");
                                    }
                                }
                                return engw.n(arrayList3);
                            }
                        }), duchVar.d), eldl.a(new emwl() { // from class: duen
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                engw n = engw.n(eygrVar);
                                return new duck(ezib.this, (engw) obj2, n);
                            }
                        }), duevVar.g));
                    } else {
                        arrayList.add(erqt.i(new duck(b, engw.n(arrayList2), engw.n(eygrVar))));
                    }
                }
                return erqt.e(arrayList);
            }
        }), this.g), eldl.a(new emwl() { // from class: dudz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                emxc j;
                enhd enhdVar = new enhd();
                long j2 = 0;
                for (duco ducoVar : (List) obj) {
                    ezib c = ducoVar.c();
                    engw<ezie> b = ducoVar.b();
                    final engw<ezie> a2 = ducoVar.a();
                    ((enrr) ((enrr) duev.a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPartsForUpload", 1021, "GellerSyncClient.java")).w("There are %d elements to be updated on the server for corpus %s.", b.size(), c.name());
                    ((enrr) ((enrr) duev.a.e()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPartsForUpload", 1024, "GellerSyncClient.java")).t("Elements to update: %s", enkr.g(b, new dueh()));
                    ((enrr) ((enrr) duev.a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPartsForUpload", 1028, "GellerSyncClient.java")).w("There are %d elements to delete from the server for corpus %s.", a2.size(), c.name());
                    ((enrr) ((enrr) duev.a.e()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPartsForUpload", 1031, "GellerSyncClient.java")).t("Elements to delete: %s", new enrw() { // from class: duem
                        @Override // defpackage.enrw
                        public final Object a() {
                            return enkr.g(engw.this, new dueh());
                        }
                    });
                    if (a2.isEmpty() && b.isEmpty()) {
                        j = emux.a;
                    } else {
                        ezht ezhtVar = (ezht) ezhu.a.createBuilder();
                        long j3 = j2;
                        for (ezie ezieVar : a2) {
                            if (ezieVar.getSerializedSize() + j3 <= 3670016.0d) {
                                ezhtVar.copyOnWrite();
                                ezhu ezhuVar = (ezhu) ezhtVar.instance;
                                ezieVar.getClass();
                                eygr eygrVar = ezhuVar.g;
                                if (!eygrVar.c()) {
                                    ezhuVar.g = eyfy.mutableCopy(eygrVar);
                                }
                                ezhuVar.g.add(ezieVar);
                                j3 += ezieVar.getSerializedSize();
                            } else {
                                ((enrr) ((enrr) duev.a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPaginatedPartForUpload", 1066, "GellerSyncClient.java")).t("Unable to fit deleted element into current page for corpus %s", c.name());
                            }
                        }
                        for (ezie ezieVar2 : b) {
                            if (ezieVar2.getSerializedSize() + j3 <= 3670016.0d) {
                                ezhtVar.copyOnWrite();
                                ezhu ezhuVar2 = (ezhu) ezhtVar.instance;
                                ezieVar2.getClass();
                                eygr eygrVar2 = ezhuVar2.f;
                                if (!eygrVar2.c()) {
                                    ezhuVar2.f = eyfy.mutableCopy(eygrVar2);
                                }
                                ezhuVar2.f.add(ezieVar2);
                                j3 += ezieVar2.getSerializedSize();
                            } else {
                                ((enrr) ((enrr) duev.a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPaginatedPartForUpload", 1075, "GellerSyncClient.java")).t("Unable to fit element into current page for corpus %s", c.name());
                            }
                        }
                        ezhtVar.copyOnWrite();
                        ezhu ezhuVar3 = (ezhu) ezhtVar.instance;
                        ezhuVar3.c = c.dA;
                        ezhuVar3.b |= 1;
                        j = emxc.j((ezhu) ezhtVar.build());
                    }
                    if (j.g()) {
                        enhdVar.k(c, j.c());
                        j2 += ((eyfy) j.c()).getSerializedSize();
                    }
                }
                return enhdVar.c();
            }
        }), this.g);
    }

    public final ListenableFuture b(final dudh dudhVar, final dubz dubzVar, final int i, final ezhv ezhvVar, final Map map, final Map map2, final Map map3) {
        ListenableFuture a2;
        this.p++;
        emyg emygVar = this.n;
        emygVar.e();
        emygVar.f();
        if (ezhvVar.c.size() == 0) {
            ((enrr) ((enrr) a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "batchSync", 771, "GellerSyncClient.java")).q("Created batch sync request with no parts, returning immediately.");
            a2 = erqt.i(ezhz.a);
        } else {
            String str = this.q;
            ((enrr) ((enrr) dudh.a.d()).h("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient", "batchSync", 42, "GellerOnePlatformClient.java")).q("Sending geller batch sync request");
            ((enrr) ((enrr) dudh.a.g()).h("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient", "batchSync", 43, "GellerOnePlatformClient.java")).t("Request details: %s", ezhvVar);
            ezii eziiVar = (ezii) ((ezii) ezii.h(new ezih(), dudhVar.b)).j(eyki.b(dudhVar.c), TimeUnit.MILLISECONDS);
            dudhVar.d.booleanValue();
            ezii eziiVar2 = (ezii) eziiVar.n();
            if (str != null) {
                eziiVar2 = (ezii) eziiVar2.i(new feee(emby.d(new embm(str, null))));
            }
            febs febsVar = ezij.a;
            if (febsVar == null) {
                synchronized (ezij.class) {
                    febsVar = ezij.a;
                    if (febsVar == null) {
                        febp a3 = febs.a();
                        a3.c = febr.UNARY;
                        a3.d = febs.c("geller.oneplatform.GellerService", "BatchSync");
                        a3.b();
                        ezhv ezhvVar2 = ezhv.a;
                        eyfc eyfcVar = ffag.a;
                        a3.a = new ffae(ezhvVar2);
                        a3.b = new ffae(ezhz.a);
                        febsVar = a3.a();
                        ezij.a = febsVar;
                    }
                }
            }
            a2 = ffat.a(eziiVar2.a.a(febsVar, eziiVar2.b), ezhvVar);
        }
        return elfl.g(a2).i(eldl.d(new eroh() { // from class: duei
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Map map4;
                final duev duevVar;
                int i2;
                Object obj2;
                Iterator it;
                final ezhz ezhzVar = (ezhz) obj;
                Iterator<E> it2 = ezhzVar.b.iterator();
                while (true) {
                    map4 = map3;
                    duevVar = duev.this;
                    i2 = 2;
                    if (!it2.hasNext()) {
                        break;
                    }
                    ezhy ezhyVar = (ezhy) it2.next();
                    ezib b = ezib.b(ezhyVar.d);
                    if (b == null) {
                        b = ezib.UNKNOWN;
                    }
                    if (dufy.c(dufy.b(duevVar.b), b, duevVar.c)) {
                        map4.put(b, ezhyVar.b == 2 ? (ezjb) ezhyVar.c : ezjb.a);
                    }
                }
                ArrayList arrayList = new ArrayList(ezhzVar.b.size());
                Iterator it3 = ezhzVar.b.iterator();
                while (it3.hasNext()) {
                    final ezhy ezhyVar2 = (ezhy) it3.next();
                    ezib b2 = ezib.b(ezhyVar2.d);
                    if (b2 == null) {
                        b2 = ezib.UNKNOWN;
                    }
                    if (b2.name().startsWith("ENCRYPTED_")) {
                        int i3 = ezhyVar2.b;
                        if (i3 == 1) {
                            arrayList.add(erqt.i(ezhyVar2));
                        } else {
                            final ezjb ezjbVar = i3 == i2 ? (ezjb) ezhyVar2.c : ezjb.a;
                            emxc emxcVar = duevVar.o;
                            emxc emxcVar2 = duevVar.b;
                            eygr eygrVar = ezjbVar.e;
                            String b3 = dufy.b(emxcVar2);
                            ArrayList arrayList2 = new ArrayList(eygrVar.size());
                            Iterator<E> it4 = eygrVar.iterator();
                            while (true) {
                                obj2 = ((emxn) emxcVar).a;
                                if (!it4.hasNext()) {
                                    break;
                                }
                                final ezie ezieVar = (ezie) it4.next();
                                eydq eydqVar = ezieVar.e;
                                if (eydqVar == null) {
                                    eydqVar = eydq.a;
                                }
                                if (eydqVar.b.equals("type.googleapis.com/geller.oneplatform.GellerE2eeElement")) {
                                    it = it3;
                                    try {
                                        eydq eydqVar2 = ezieVar.e;
                                        if (eydqVar2 == null) {
                                            eydqVar2 = eydq.a;
                                        }
                                        final ezig ezigVar = (ezig) eyfy.parseFrom(ezig.a, eydqVar2.c, eyfc.a());
                                        ducd ducdVar = ((duch) obj2).c;
                                        int i4 = ezigVar.d;
                                        arrayList2.add(erny.f(((duci) ducdVar).a(b3), eldl.a(new emwl() { // from class: duce
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj3) {
                                                ezig ezigVar2 = ezig.this;
                                                ezie ezieVar2 = ezieVar;
                                                try {
                                                    ducc duccVar = (ducc) ((emxc) obj3).f();
                                                    if (duccVar == null) {
                                                        ((enrr) ((enrr) duch.a.i()).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", 127, "EncryptionUtil.java")).q("Failed to find matching encryption key to decrypt Element.");
                                                        return emux.a;
                                                    }
                                                    eydq eydqVar3 = (eydq) eyfy.parseFrom(eydq.a, new euhp(duccVar.a()).a(ezigVar2.c.I(), duch.b), eyfc.a());
                                                    ezid ezidVar = (ezid) ezieVar2.toBuilder();
                                                    ezidVar.copyOnWrite();
                                                    ezie ezieVar3 = (ezie) ezidVar.instance;
                                                    eydqVar3.getClass();
                                                    ezieVar3.e = eydqVar3;
                                                    ezieVar3.b |= 8;
                                                    return emxc.j((ezie) ezidVar.build());
                                                } catch (Exception e) {
                                                    ((enrr) ((enrr) ((enrr) duch.a.i()).g(e)).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", (char) 139, "EncryptionUtil.java")).q("Unexpected error when trying to decrypt encrypted element.");
                                                    return emux.a;
                                                }
                                            }
                                        }), ((duch) obj2).d));
                                    } catch (Exception e) {
                                        ((enrr) ((enrr) ((enrr) duch.a.i()).g(e)).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", (char) 146, "EncryptionUtil.java")).q("Unexpected error when trying to parse encrypted element, skipping element.");
                                    }
                                } else {
                                    it = it3;
                                    ((enrr) ((enrr) duch.a.i()).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", 110, "EncryptionUtil.java")).q("Trying to decrypt Element with unexpected data type url, skipping element.");
                                }
                                it3 = it;
                            }
                            arrayList.add(erny.f(erny.f(erqt.e(arrayList2), eldl.a(new emwl() { // from class: ducf
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    List<emxc> list = (List) obj3;
                                    ArrayList arrayList3 = new ArrayList(list.size());
                                    for (emxc emxcVar3 : list) {
                                        if (emxcVar3.g()) {
                                            arrayList3.add((ezie) emxcVar3.c());
                                        }
                                    }
                                    return engw.n(arrayList3);
                                }
                            }), ((duch) obj2).d), eldl.a(new emwl() { // from class: dues
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    engw engwVar = (engw) obj3;
                                    ezhx ezhxVar = (ezhx) ezhy.this.toBuilder();
                                    ezja ezjaVar = (ezja) ezjbVar.toBuilder();
                                    ezjaVar.copyOnWrite();
                                    ((ezjb) ezjaVar.instance).e = ezjb.emptyProtobufList();
                                    ezjaVar.copyOnWrite();
                                    ezjb ezjbVar2 = (ezjb) ezjaVar.instance;
                                    eygr eygrVar2 = ezjbVar2.e;
                                    if (!eygrVar2.c()) {
                                        ezjbVar2.e = eyfy.mutableCopy(eygrVar2);
                                    }
                                    eydl.addAll(engwVar, ezjbVar2.e);
                                    ezjb ezjbVar3 = (ezjb) ezjaVar.build();
                                    ezhxVar.copyOnWrite();
                                    ezhy ezhyVar3 = (ezhy) ezhxVar.instance;
                                    ezjbVar3.getClass();
                                    ezhyVar3.c = ezjbVar3;
                                    ezhyVar3.b = 2;
                                    return (ezhy) ezhxVar.build();
                                }
                            }), duevVar.g));
                            it3 = it3;
                            i2 = 2;
                        }
                    } else {
                        arrayList.add(erqt.i(ezhyVar2));
                    }
                }
                final Map map5 = map2;
                final Map map6 = map;
                final int i5 = i;
                final dubz dubzVar2 = dubzVar;
                final dudh dudhVar2 = dudhVar;
                final ezhv ezhvVar3 = ezhvVar;
                return erny.g(erqc.o(ernq.f(erny.g(erqc.o(erny.f(erqt.e(arrayList), eldl.a(new emwl() { // from class: duet
                    @Override // defpackage.emwl
                    public final Object apply(Object obj3) {
                        List list = (List) obj3;
                        ezhw ezhwVar = (ezhw) ezhz.a.createBuilder();
                        ezhwVar.copyOnWrite();
                        ezhz ezhzVar2 = (ezhz) ezhwVar.instance;
                        eygr eygrVar2 = ezhzVar2.b;
                        if (!eygrVar2.c()) {
                            ezhzVar2.b = eyfy.mutableCopy(eygrVar2);
                        }
                        eydl.addAll(list, ezhzVar2.b);
                        return (ezhz) ezhwVar.build();
                    }
                }), duevVar.g)), eldl.d(new eroh() { // from class: dued
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj3) {
                        duev duevVar2 = duev.this;
                        final dudg dudgVar = new dudg(dufy.b(duevVar2.b), duevVar2.c, new ducj(ezhvVar3, (ezhz) obj3), duevVar2.i, duevVar2.g);
                        final HashMap hashMap = new HashMap();
                        for (ezhy ezhyVar3 : ((ducj) dudgVar.c).b.b) {
                            ezib b4 = ezib.b(ezhyVar3.d);
                            if (b4 == null) {
                                b4 = ezib.UNKNOWN;
                            }
                            ezjd ezjdVar = ezhyVar3.e;
                            if (ezjdVar == null) {
                                ezjdVar = ezjd.a;
                            }
                            if ((ezjdVar.b & 1) != 0) {
                                if (ezjdVar.c) {
                                    hashMap.put(b4, Status.b);
                                } else {
                                    ((enrr) ((enrr) dudg.a.j()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "processResult", 105, "GellerBatchSyncResultWriter.java")).t("Upload failed for corpus:%s", b4.name());
                                    dudgVar.a(b4).g(new duew("Failed to upload data"));
                                    hashMap.put(b4, ezhyVar3.b == 1 ? Status.fromCodeValue(((fagm) ezhyVar3.c).b) : Status.d);
                                    b4.name();
                                }
                            }
                            if (ezhyVar3.b == 1) {
                                ((enrr) ((enrr) dudg.a.j()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "processResult", 116, "GellerBatchSyncResultWriter.java")).J("There was an error when syncing corpus: %s. Error message: %s. Error code: %d.", b4.name(), (ezhyVar3.b == 1 ? (fagm) ezhyVar3.c : fagm.a).c, Integer.valueOf((ezhyVar3.b == 1 ? (fagm) ezhyVar3.c : fagm.a).b));
                                dufr a4 = dudgVar.a(b4);
                                int i6 = ezhyVar3.b;
                                a4.g(new duew((i6 == 1 ? (fagm) ezhyVar3.c : fagm.a).c, new StatusException(Status.fromCodeValue((i6 == 1 ? (fagm) ezhyVar3.c : fagm.a).b))));
                                hashMap.put(b4, Status.fromCodeValue((ezhyVar3.b == 1 ? (fagm) ezhyVar3.c : fagm.a).b));
                                b4.name();
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        final HashSet hashSet = new HashSet();
                        for (final ezhy ezhyVar4 : ((ducj) dudgVar.c).b.b) {
                            final ezib b5 = ezib.b(ezhyVar4.d);
                            if (b5 == null) {
                                b5 = ezib.UNKNOWN;
                            }
                            arrayList3.add(elfr.i(new erog() { // from class: ducz
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    ListenableFuture f;
                                    final dudg dudgVar2 = dudg.this;
                                    final ezib ezibVar = b5;
                                    if (dufy.c(dudgVar2.f, ezibVar, dudgVar2.e)) {
                                        return erre.a;
                                    }
                                    ((enrr) ((enrr) dudg.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "maybeWipeoutBeforeCommit", 230, "GellerBatchSyncResultWriter.java")).t("Checking corpus for wipeout: %s", ezibVar);
                                    if (dudg.b.contains(ezibVar)) {
                                        Geller geller = dudgVar2.e;
                                        String str2 = dudgVar2.f;
                                        int i7 = engw.d;
                                        f = erny.f(erqc.o(geller.c(str2, ezibVar, enou.a)), eldl.a(new emwl() { // from class: ducu
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj4) {
                                                ((enrr) ((enrr) dudg.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "maybeWipeoutBeforeCommit", 239, "GellerBatchSyncResultWriter.java")).t("Cleared data for corpus %s", ezib.this);
                                                return null;
                                            }
                                        }), dudgVar2.g);
                                    } else {
                                        f = erre.a;
                                    }
                                    final Set set = hashSet;
                                    final ezhy ezhyVar5 = ezhyVar4;
                                    return elfl.g(f).i(new eroh() { // from class: ducq
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj4) {
                                            ezhy ezhyVar6 = ezhyVar5;
                                            final ezjb ezjbVar2 = ezhyVar6.b == 2 ? (ezjb) ezhyVar6.c : ezjb.a;
                                            final emyg c = emyg.c(emtt.a);
                                            final emyg emygVar2 = new emyg(emtt.a);
                                            ezib b6 = ezib.b(ezjbVar2.c);
                                            if (b6 == null) {
                                                b6 = ezib.UNKNOWN;
                                            }
                                            final ezib ezibVar2 = b6;
                                            dudg dudgVar3 = dudg.this;
                                            final ezib ezibVar3 = ezibVar;
                                            final Geller geller2 = dudgVar3.e;
                                            geller2.f(ezibVar2);
                                            emxf.m(true, "update() not allowed if Geller is read-only");
                                            final String str3 = dudgVar3.f;
                                            return elfl.g(elfr.h(new Callable() { // from class: dugo
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    Geller geller3 = Geller.this;
                                                    emyg emygVar3 = emygVar2;
                                                    String str4 = str3;
                                                    ezjb ezjbVar3 = ezjbVar2;
                                                    ezib ezibVar4 = ezibVar2;
                                                    emyg emygVar4 = c;
                                                    try {
                                                        emygVar3.f();
                                                        return enip.p(geller3.nativeUpdate(geller3.a(), geller3.c.a(str4), ezjbVar3.toByteArray()));
                                                    } finally {
                                                        geller3.f(ezibVar4);
                                                        emygVar3.a(TimeUnit.MILLISECONDS);
                                                        geller3.f(ezibVar4);
                                                        emygVar4.a(TimeUnit.MILLISECONDS);
                                                    }
                                                }
                                            }, geller2.b)).h(new emwl() { // from class: ducw
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj5) {
                                                    enip enipVar = (enip) obj5;
                                                    ((enrr) ((enrr) dudg.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "commitDownloadedElements", 311, "GellerBatchSyncResultWriter.java")).D("Successfully wrote elements: %s for corpus %s to geller database.", enipVar, ezib.this.name());
                                                    return enipVar;
                                                }
                                            }, dudgVar3.h);
                                        }
                                    }, dudgVar2.h).i(new eroh() { // from class: ducx
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj4) {
                                            dudg dudgVar3 = dudg.this;
                                            ezib ezibVar2 = ezibVar;
                                            dudgVar3.a(ezibVar2).e((Set) obj4);
                                            set.add(ezibVar2);
                                            return erre.a;
                                        }
                                    }, dudgVar2.h).f(Exception.class, new eroh() { // from class: ducy
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj4) {
                                            Exception exc = (Exception) obj4;
                                            dudg dudgVar3 = dudg.this;
                                            ezib ezibVar2 = ezibVar;
                                            dudgVar3.a(ezibVar2).g(new duew("Failed to commit downloads to the database: ".concat(String.valueOf(exc.getMessage())), exc));
                                            ezibVar2.name();
                                            return erre.a;
                                        }
                                    }, dudgVar2.h);
                                }
                            }, dudgVar.g));
                        }
                        return erny.f(erny.g(erqc.o(erqt.a(arrayList3).a(eldl.m(new Callable() { // from class: duda
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ((enrr) ((enrr) dudg.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "writeDownloadedElementsToDatabase", 210, "GellerBatchSyncResultWriter.java")).q("Finished committing downloads to the database.");
                                HashMap hashMap2 = new HashMap();
                                dudg dudgVar2 = dudg.this;
                                for (ezhy ezhyVar5 : ((ducj) dudgVar2.c).b.b) {
                                    if (ezhyVar5.b == 2) {
                                        ezib b6 = ezib.b(ezhyVar5.d);
                                        if (b6 == null) {
                                            b6 = ezib.UNKNOWN;
                                        }
                                        hashMap2.put(b6, ((ezjb) ezhyVar5.c).e);
                                    }
                                }
                                ducn ducnVar = dudgVar2.c;
                                HashMap hashMap3 = new HashMap();
                                for (ezhy ezhyVar6 : ((ducj) ducnVar).b.b) {
                                    if (ezhyVar6.b == 2) {
                                        ezib b7 = ezib.b(ezhyVar6.d);
                                        if (b7 == null) {
                                            b7 = ezib.UNKNOWN;
                                        }
                                        hashMap3.put(b7, ((ezjb) ezhyVar6.c).f);
                                    }
                                }
                                return null;
                            }
                        }), dudgVar.h)), eldl.d(new eroh() { // from class: dudd
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj4) {
                                Map map7 = hashMap;
                                if (map7.isEmpty()) {
                                    return erre.a;
                                }
                                final dudg dudgVar2 = dudg.this;
                                ArrayList arrayList4 = new ArrayList();
                                for (final ezhu ezhuVar : ((ducj) dudgVar2.c).a.c) {
                                    final ezib b6 = ezib.b(ezhuVar.c);
                                    if (b6 == null) {
                                        b6 = ezib.UNKNOWN;
                                    }
                                    if (map7.containsKey(b6) && ((Status) map7.get(b6)).f()) {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (final ezie ezieVar2 : ezhuVar.g) {
                                            Geller geller = dudgVar2.e;
                                            if (geller.e.c) {
                                                String str2 = ezieVar2.d;
                                                eypw eypwVar = ezieVar2.c;
                                                if (eypwVar == null) {
                                                    eypwVar = eypw.a;
                                                }
                                                arrayList5.add(erqt.i(dugd.c(str2, eypwVar.c)));
                                            } else {
                                                String str3 = dudgVar2.f;
                                                ezib b7 = ezib.b(ezhuVar.c);
                                                if (b7 == null) {
                                                    b7 = ezib.UNKNOWN;
                                                }
                                                String str4 = ezieVar2.d;
                                                eypw eypwVar2 = ezieVar2.c;
                                                if (eypwVar2 == null) {
                                                    eypwVar2 = eypw.a;
                                                }
                                                arrayList5.add(erny.f(geller.c(str3, b7, engw.r(dugd.c(str4, eypwVar2.c))), eldl.a(new emwl() { // from class: dudb
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj5) {
                                                        enrr enrrVar = (enrr) ((enrr) dudg.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "commitUploadedDeletions", 356, "GellerBatchSyncResultWriter.java");
                                                        ezie ezieVar3 = ezieVar2;
                                                        String str5 = ezieVar3.d;
                                                        eypw eypwVar3 = ezieVar3.c;
                                                        if (eypwVar3 == null) {
                                                            eypwVar3 = eypw.a;
                                                        }
                                                        ezhu ezhuVar2 = ezhuVar;
                                                        Long valueOf = Long.valueOf(eypwVar3.c);
                                                        ezib b8 = ezib.b(ezhuVar2.c);
                                                        if (b8 == null) {
                                                            b8 = ezib.UNKNOWN;
                                                        }
                                                        enrrVar.K("Removed element with key %s and timestamp %d for corpus %s for account %s.", str5, valueOf, b8.name(), dudg.this.f);
                                                        String str6 = ezieVar3.d;
                                                        eypw eypwVar4 = ezieVar3.c;
                                                        if (eypwVar4 == null) {
                                                            eypwVar4 = eypw.a;
                                                        }
                                                        return dugd.c(str6, eypwVar4.c);
                                                    }
                                                }), dudgVar2.g));
                                            }
                                        }
                                        arrayList4.add(ernq.f(erny.f(erny.f(erqc.o(erny.f(erqc.o(erqt.o(arrayList5)), eldl.a(new emwl() { // from class: dudc
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj5) {
                                                ArrayList arrayList6 = new ArrayList();
                                                for (dugd dugdVar : (List) obj5) {
                                                    if (dugdVar != null) {
                                                        arrayList6.add(dugdVar);
                                                    }
                                                }
                                                ezib ezibVar = b6;
                                                dudg dudgVar3 = dudg.this;
                                                dudgVar3.e.b(dudgVar3.f, ezibVar, dudg.b(3, arrayList6));
                                                return null;
                                            }
                                        }), dudgVar2.g)), eldl.a(new emwl() { // from class: dudf
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj5) {
                                                ArrayList arrayList6 = new ArrayList();
                                                ArrayList arrayList7 = new ArrayList();
                                                ezhu ezhuVar2 = ezhuVar;
                                                for (ezie ezieVar3 : ezhuVar2.f) {
                                                    String str5 = ezieVar3.d;
                                                    eypw eypwVar3 = ezieVar3.c;
                                                    if (eypwVar3 == null) {
                                                        eypwVar3 = eypw.a;
                                                    }
                                                    arrayList6.add(dugd.c(str5, eypwVar3.c));
                                                    arrayList7.add(ezieVar3.d);
                                                }
                                                ezib ezibVar = b6;
                                                dudg dudgVar3 = dudg.this;
                                                long b8 = dudgVar3.e.b(dudgVar3.f, ezibVar, dudg.b(1, arrayList6));
                                                enrr enrrVar = (enrr) ((enrr) dudg.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "commitUploadedElements", 332, "GellerBatchSyncResultWriter.java");
                                                Long valueOf = Long.valueOf(b8);
                                                ezib b9 = ezib.b(ezhuVar2.c);
                                                if (b9 == null) {
                                                    b9 = ezib.UNKNOWN;
                                                }
                                                enrrVar.J("Marked %d elements as successfully uploaded for corpus %s for account %s", valueOf, b9.name(), dudgVar3.f);
                                                return arrayList7;
                                            }
                                        }), dudgVar2.g), eldl.a(new emwl() { // from class: ducr
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj5) {
                                                dudg.this.a(b6).f((List) obj5);
                                                return true;
                                            }
                                        }), dudgVar2.h), Exception.class, eldl.a(new emwl() { // from class: ducs
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj5) {
                                                Exception exc = (Exception) obj5;
                                                dudg dudgVar3 = dudg.this;
                                                ezib ezibVar = b6;
                                                dudgVar3.a(ezibVar).g(new duew("Failed to commit uploads to the database: ".concat(String.valueOf(exc.getMessage())), exc));
                                                ezibVar.name();
                                                return false;
                                            }
                                        }), dudgVar2.h));
                                    }
                                }
                                return erqt.a(arrayList4).a(eldl.m(new Callable() { // from class: duct
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ((enrr) ((enrr) dudg.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "updateDatabaseForUploadedElements", 300, "GellerBatchSyncResultWriter.java")).q("Finished committing uploads to the database.");
                                        return null;
                                    }
                                }), dudgVar2.h);
                            }
                        }), dudgVar.h), new emwl() { // from class: dude
                            @Override // defpackage.emwl
                            public final Object apply(Object obj4) {
                                HashMap hashMap2 = new HashMap();
                                for (Map.Entry entry : dudg.this.d.entrySet()) {
                                    hashMap2.put((ezib) entry.getKey(), ((dufr) entry.getValue()).a());
                                }
                                return hashMap2;
                            }
                        }, dudgVar.h);
                    }
                }), duevVar.g), Exception.class, eldl.a(new emwl() { // from class: duee
                    @Override // defpackage.emwl
                    public final Object apply(Object obj3) {
                        Exception exc = (Exception) obj3;
                        int i6 = engw.d;
                        engr engrVar = new engr();
                        Iterator<E> it5 = ezhv.this.c.iterator();
                        while (it5.hasNext()) {
                            ezib b4 = ezib.b(((ezhu) it5.next()).c);
                            if (b4 == null) {
                                b4 = ezib.UNKNOWN;
                            }
                            engrVar.h(b4);
                        }
                        return duev.d(engrVar.g(), exc, "Failed to decrypt the elements of the corpora requiring e2ee: ".concat(String.valueOf(exc.getMessage())));
                    }
                }), duevVar.g)), eldl.d(new eroh() { // from class: dueg
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj3) {
                        final int i6;
                        eyfw checkIsLite;
                        final Map map7 = (Map) obj3;
                        final duev duevVar2 = duev.this;
                        duevVar2.n.a(TimeUnit.MILLISECONDS);
                        final TreeSet treeSet = new TreeSet();
                        final HashMap hashMap = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        final ezhz ezhzVar2 = ezhzVar;
                        Iterator<E> it5 = ezhzVar2.b.iterator();
                        while (true) {
                            i6 = i5;
                            if (!it5.hasNext()) {
                                break;
                            }
                            ezhy ezhyVar3 = (ezhy) it5.next();
                            ezib b4 = ezib.b(ezhyVar3.d);
                            if (b4 == null) {
                                b4 = ezib.UNKNOWN;
                            }
                            if (map7.containsKey(b4) && ((dufs) map7.get(b4)).b().isEmpty()) {
                                treeSet.add(b4);
                                if (((ezhyVar3.b == 2 ? (ezjb) ezhyVar3.c : ezjb.a).b & 32) != 0) {
                                    arrayList3.add((ezhyVar3.b == 2 ? (ezjb) ezhyVar3.c : ezjb.a).g);
                                }
                                if (!(ezhyVar3.b == 2 ? (ezjb) ezhyVar3.c : ezjb.a).d.isEmpty() && i6 != 3) {
                                    ezht ezhtVar = (ezht) ezhu.a.createBuilder();
                                    ezhtVar.copyOnWrite();
                                    ezhu ezhuVar = (ezhu) ezhtVar.instance;
                                    ezhuVar.c = b4.dA;
                                    ezhuVar.b |= 1;
                                    String str2 = (ezhyVar3.b == 2 ? (ezjb) ezhyVar3.c : ezjb.a).d;
                                    ezhtVar.copyOnWrite();
                                    ezhu ezhuVar2 = (ezhu) ezhtVar.instance;
                                    str2.getClass();
                                    ezhuVar2.b |= 4;
                                    ezhuVar2.e = str2;
                                    hashMap.put(b4, (ezhu) ezhtVar.build());
                                }
                            }
                        }
                        final ezhv ezhvVar4 = ezhvVar3;
                        ezit ezitVar = ezhvVar4.e;
                        if (ezitVar == null) {
                            ezitVar = ezit.a;
                        }
                        final ezis ezisVar = (ezis) ezitVar.toBuilder();
                        checkIsLite = eyfy.checkIsLite(ezjf.b);
                        ezisVar.c(checkIsLite);
                        ezisVar.copyOnWrite();
                        eyfj a4 = ezisVar.a();
                        a4.b.remove(checkIsLite.d);
                        if (a4.b.isEmpty()) {
                            a4.d = false;
                        }
                        eyfw eyfwVar = ezjf.b;
                        ezje ezjeVar = (ezje) ezjf.a.createBuilder();
                        ezjeVar.copyOnWrite();
                        ezjf ezjfVar = (ezjf) ezjeVar.instance;
                        eygr eygrVar2 = ezjfVar.c;
                        if (!eygrVar2.c()) {
                            ezjfVar.c = eyfy.mutableCopy(eygrVar2);
                        }
                        final Map map8 = map4;
                        final Map map9 = map5;
                        final Map map10 = map6;
                        final dubz dubzVar3 = dubzVar2;
                        final dudh dudhVar3 = dudhVar2;
                        eydl.addAll(arrayList3, ezjfVar.c);
                        ezisVar.e(eyfwVar, (ezjf) ezjeVar.build());
                        return ernq.f(erny.g(erqc.o(erny.f(erqc.o(duevVar2.a(treeSet, dubzVar3, i6)), eldl.a(new emwl() { // from class: duds
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.emwl
                            public final Object apply(Object obj4) {
                                enhk enhkVar = (enhk) obj4;
                                ezit ezitVar2 = (ezit) ezisVar.build();
                                duev duevVar3 = duev.this;
                                int i7 = i6;
                                return duevVar3.c(treeSet, ezitVar2, i7, hashMap, enhkVar, emxc.j(ezhvVar4), emxc.j(map7));
                            }
                        }), duevVar2.h)), eldl.d(new eroh() { // from class: duep
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj4) {
                                Map map11;
                                Map map12;
                                duev duevVar3;
                                ezhv ezhvVar5 = (ezhv) obj4;
                                Iterator<E> it6 = ezhzVar2.b.iterator();
                                while (true) {
                                    map11 = map9;
                                    map12 = map10;
                                    duevVar3 = duev.this;
                                    if (!it6.hasNext()) {
                                        break;
                                    }
                                    ezhy ezhyVar4 = (ezhy) it6.next();
                                    Map map13 = duevVar3.m;
                                    ezib b5 = ezib.b(ezhyVar4.d);
                                    if (b5 == null) {
                                        b5 = ezib.UNKNOWN;
                                    }
                                    if (map13.containsKey(b5)) {
                                        ezib b6 = ezib.b(ezhyVar4.d);
                                        if (b6 == null) {
                                            b6 = ezib.UNKNOWN;
                                        }
                                        if (ezhyVar4.b == 1) {
                                            map12.remove(b6);
                                        } else {
                                            List arrayList4 = map12.containsKey(b6) ? (List) map12.get(b6) : new ArrayList();
                                            arrayList4.addAll((ezhyVar4.b == 2 ? (ezjb) ezhyVar4.c : ezjb.a).e);
                                            map12.put(b6, arrayList4);
                                            List arrayList5 = map11.containsKey(b6) ? (List) map11.get(b6) : new ArrayList();
                                            arrayList5.addAll((ezhyVar4.b == 2 ? (ezjb) ezhyVar4.c : ezjb.a).f);
                                            map11.put(b6, arrayList5);
                                        }
                                    }
                                }
                                final Map map14 = map7;
                                if (ezhvVar5.c.size() == 0) {
                                    return erqt.i(map14);
                                }
                                Map map15 = map8;
                                return erny.f(duevVar3.b(dudhVar3, dubzVar3, i6, ezhvVar5, map12, map11, map15), eldl.a(new emwl() { // from class: dudu
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj5) {
                                        Map map16 = (Map) obj5;
                                        HashMap hashMap2 = new HashMap();
                                        Map map17 = map14;
                                        for (ezib ezibVar : map17.keySet()) {
                                            hashMap2.put(ezibVar, map16.containsKey(ezibVar) ? ((dufs) map17.get(ezibVar)).f((dufs) map16.get(ezibVar)) : (dufs) map17.get(ezibVar));
                                        }
                                        return hashMap2;
                                    }
                                }), duevVar3.h);
                            }
                        }), duevVar2.g), Exception.class, eldl.a(new emwl() { // from class: dueq
                            @Override // defpackage.emwl
                            public final Object apply(Object obj4) {
                                Exception exc = (Exception) obj4;
                                TreeSet treeSet2 = new TreeSet();
                                Iterator<E> it6 = ezhz.this.b.iterator();
                                while (it6.hasNext()) {
                                    ezib b5 = ezib.b(((ezhy) it6.next()).d);
                                    if (b5 == null) {
                                        b5 = ezib.UNKNOWN;
                                    }
                                    Map map11 = map7;
                                    if (map11.containsKey(b5) && ((dufs) map11.get(b5)).b().isEmpty()) {
                                        treeSet2.add(b5);
                                    }
                                }
                                return duev.d(treeSet2, exc, "Failed to construct follow up BatchSyncRequests: ".concat(String.valueOf(exc.getMessage())));
                            }
                        }), duevVar2.g);
                    }
                }), duevVar.h);
            }
        }), this.h).e(Exception.class, new emwl() { // from class: duej
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                int i2 = engw.d;
                engr engrVar = new engr();
                Iterator<E> it = ezhv.this.c.iterator();
                while (it.hasNext()) {
                    ezib b = ezib.b(((ezhu) it.next()).c);
                    if (b == null) {
                        b = ezib.UNKNOWN;
                    }
                    engrVar.h(b);
                }
                return duev.d(engrVar.g(), exc, "Geller batch sync rpc call failed: ".concat(String.valueOf(exc.getMessage())));
            }
        }, this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0203  */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ezhv c(java.util.Set r24, defpackage.ezit r25, int r26, java.util.Map r27, java.util.Map r28, defpackage.emxc r29, defpackage.emxc r30) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duev.c(java.util.Set, ezit, int, java.util.Map, java.util.Map, emxc, emxc):ezhv");
    }
}
