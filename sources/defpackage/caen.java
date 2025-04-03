package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Iterator$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caen {
    public static final cskc a = cskc.g("BugleEtouffee", "RemoteDeviceLoader");
    public final errl b;
    public final cqoh c;
    public final ffbr d;
    public final ffbr e;
    public final chef f;
    public final akzt g;
    public final fazb h;
    public final atuc i;
    private final dtuu j;
    private final ffbr k;
    private final ffbr l;

    public caen(cqoh cqohVar, dtuu dtuuVar, ffbr ffbrVar, errl errlVar, ffbr ffbrVar2, ffbr ffbrVar3, chef chefVar, akzt akztVar, fazb fazbVar, ffbr ffbrVar4, atuc atucVar) {
        this.j = dtuuVar;
        this.k = ffbrVar;
        this.b = errlVar;
        this.c = cqohVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = chefVar;
        this.g = akztVar;
        this.h = fazbVar;
        this.l = ffbrVar4;
        this.i = atucVar;
    }

    public final elfl a(awui awuiVar, Collection collection, eozn eoznVar) {
        Stream map = Collection.EL.stream(collection).map(new Function() { // from class: cael
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((awui) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return b(awuiVar, collection, (engw) map.collect(endq.a), eoznVar);
    }

    public final elfl b(awui awuiVar, Iterable iterable, final Iterable iterable2, final eozn eoznVar) {
        Iterable iterable3;
        elfl e;
        awuiVar.getClass();
        efbd.b();
        csjb a2 = a.a();
        a2.I("Start to get Registration ID from Tachyon");
        a2.A("normalizedDestination", cskt.b(TextUtils.join(", ", iterable2)));
        a2.r();
        final Instant f = this.c.f();
        ekzz f2 = eleg.f("RemoteDeviceLoader#downloadRegistrationIdsFromTachyon");
        try {
            akjk akjkVar = (akjk) this.k.b();
            fazb a3 = fbaz.a(akjkVar.a.a.a.ql);
            akkp akkpVar = akjkVar.a.a.a;
            camm cammVar = new camm(awuiVar, a3, akkpVar.qm, (ffsk) akkpVar.q.b());
            if (iterable != null) {
                int i = engw.d;
                final engr engrVar = new engr();
                Iterator$EL.forEachRemaining(iterable.iterator(), new Consumer() { // from class: caek
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        engr.this.h(((awui) obj).d);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                iterable3 = engrVar.g();
            } else {
                iterable3 = iterable2;
            }
            iterable3.getClass();
            String str = cammVar.a.d;
            if (str != null && !ffpc.J(str)) {
                akjl akjlVar = (akjl) cammVar.b.b();
                String str2 = cammVar.a.d;
                str2.getClass();
                List X = ffdx.X(iterable3);
                akkp akkpVar2 = akjlVar.a.a.a;
                fbbf fbbfVar = akkpVar2.G;
                e = axol.c(cammVar.c, ffhe.a, ffsm.a, new caml(cammVar, new chyf(fbbfVar, str2, X), null));
                elfl f3 = e.h(new emwl() { // from class: caee
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        camn camnVar = (camn) obj;
                        int d = camnVar.d();
                        eozn eoznVar2 = eoznVar;
                        caen caenVar = caen.this;
                        char c = 2;
                        if (d == 2) {
                            ((bzzi) caenVar.e.b()).b(eoznVar2, -2, null);
                            return new ppn();
                        }
                        if (camnVar.d() == 3) {
                            ((bzzi) caenVar.e.b()).b(eoznVar2, camnVar.a(), camnVar.c());
                            return new ppn();
                        }
                        Iterable<String> iterable4 = iterable2;
                        enhk b = camnVar.b();
                        String c2 = camnVar.c();
                        for (final String str3 : iterable4) {
                            int i2 = engw.d;
                            final engw<fcfm> engwVar = (engw) b.getOrDefault(str3, enou.a);
                            eozl eozlVar = (eozl) eozq.a.createBuilder();
                            eozlVar.copyOnWrite();
                            eozq eozqVar = (eozq) eozlVar.instance;
                            eozqVar.c = eoznVar2.m;
                            boolean z = true;
                            eozqVar.b |= 1;
                            eozlVar.copyOnWrite();
                            eozq eozqVar2 = (eozq) eozlVar.instance;
                            eozqVar2.b |= 8;
                            eozqVar2.h = c2;
                            for (fcfm fcfmVar : engwVar) {
                                eozo eozoVar = (eozo) eozp.a.createBuilder();
                                char c3 = c;
                                String D = fcfmVar.c.D(StandardCharsets.US_ASCII);
                                eozoVar.copyOnWrite();
                                eozp eozpVar = (eozp) eozoVar.instance;
                                eozpVar.b |= 1;
                                eozpVar.c = D;
                                boolean z2 = fcfmVar.d.size() > 0 && fcfmVar.d.contains(Integer.valueOf(cgye.ETOUFFEE.h));
                                eozoVar.copyOnWrite();
                                eozp eozpVar2 = (eozp) eozoVar.instance;
                                eozpVar2.b |= 2;
                                eozpVar2.d = z2;
                                eozp eozpVar3 = (eozp) eozoVar.build();
                                eozlVar.copyOnWrite();
                                eozq eozqVar3 = (eozq) eozlVar.instance;
                                eozpVar3.getClass();
                                eygr eygrVar = eozqVar3.e;
                                if (!eygrVar.c()) {
                                    eozqVar3.e = eyfy.mutableCopy(eygrVar);
                                }
                                eozqVar3.e.add(eozpVar3);
                                c = c3;
                            }
                            char c4 = c;
                            final engw c5 = caenVar.f.c(str3);
                            enqv it = c5.iterator();
                            while (it.hasNext()) {
                                boqd boqdVar = (boqd) it.next();
                                eozo eozoVar2 = (eozo) eozp.a.createBuilder();
                                boolean j = boqdVar.j();
                                eozoVar2.copyOnWrite();
                                eozp eozpVar4 = (eozp) eozoVar2.instance;
                                boolean z3 = z;
                                eozpVar4.b |= 2;
                                eozpVar4.d = j;
                                String i3 = boqdVar.i();
                                if (i3 != null) {
                                    eozoVar2.copyOnWrite();
                                    eozp eozpVar5 = (eozp) eozoVar2.instance;
                                    eozpVar5.b |= 1;
                                    eozpVar5.c = i3;
                                }
                                eozp eozpVar6 = (eozp) eozoVar2.build();
                                eozlVar.copyOnWrite();
                                eozq eozqVar4 = (eozq) eozlVar.instance;
                                eozpVar6.getClass();
                                eygr eygrVar2 = eozqVar4.d;
                                if (!eygrVar2.c()) {
                                    eozqVar4.d = eyfy.mutableCopy(eygrVar2);
                                }
                                eozqVar4.d.add(eozpVar6);
                                z = z3;
                            }
                            boolean z4 = z;
                            final Instant instant = f;
                            final chef chefVar = caenVar.f;
                            final boolean z5 = eoznVar2 == eozn.RECEIVED_PLAINTEXT_DELIVERY_RECEIPT ? z4 : false;
                            boolean booleanValue = ((Boolean) chefVar.b.c("RemoteInstanceDatabaseOperations#saveToRemoteInstances", new emyl() { // from class: chee
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.emyl
                                public final Object get() {
                                    boolean z6;
                                    ArrayList arrayList = new ArrayList();
                                    enqv it2 = ((engw) c5).iterator();
                                    while (it2.hasNext()) {
                                        boqd boqdVar2 = (boqd) it2.next();
                                        csjb a4 = chef.a.a();
                                        a4.I("Existing RemoteInstance from database");
                                        a4.B("hasEncryption", boqdVar2.j());
                                        a4.B("hasGroupEncryption", boqdVar2.k());
                                        a4.z("updatedAtHash", boqdVar2.f());
                                        a4.B("isUpdatedAtHashValid", boqdVar2.l());
                                        a4.r();
                                        if (boqdVar2.l()) {
                                            arrayList.add(Long.valueOf(boqdVar2.f()));
                                        }
                                    }
                                    Instant instant2 = instant;
                                    List<fcfm> list = engwVar;
                                    String str4 = str3;
                                    chef chefVar2 = chef.this;
                                    if (!arrayList.isEmpty()) {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (fcfm fcfmVar2 : list) {
                                            csjb a5 = chef.a.a();
                                            a5.I("RegistrationInfo from backend");
                                            a5.B("hasEncryption", chef.i(fcfmVar2));
                                            a5.B("hasGroupEncryption", chef.j(fcfmVar2));
                                            a5.z("updatedAtHash", fcfmVar2.g);
                                            a5.r();
                                            arrayList2.add(Long.valueOf(fcfmVar2.g));
                                        }
                                        Collections.sort(arrayList);
                                        Collections.sort(arrayList2);
                                        if (arrayList.equals(arrayList2)) {
                                            chef.a.p("UpdatedAtHash has not changed. Only update RPC timestamps in RemoteInstances.");
                                            Instant f4 = chefVar2.c.f();
                                            String[] strArr = bxgl.a;
                                            bxgi bxgiVar = new bxgi();
                                            bxgiVar.ap("setRpcTimestamps-remoteregistrations");
                                            bxgiVar.c(instant2);
                                            bxgiVar.f(f4);
                                            bxgiVar.g(chef.a(str4));
                                            bxgiVar.b().e();
                                            String[] strArr2 = bxhr.a;
                                            bxgt bxgtVar = new bxgt();
                                            bxgtVar.d(str4);
                                            bxgtVar.b(instant2);
                                            bxgtVar.c(f4);
                                            bxgtVar.a().m();
                                            z6 = false;
                                            return Boolean.valueOf(z6);
                                        }
                                    }
                                    chef.a.m("Updating RemoteInstance table");
                                    String[] strArr3 = bxhr.a;
                                    bxgt bxgtVar2 = new bxgt();
                                    bxgtVar2.d(str4);
                                    bxgtVar2.c(chefVar2.c.f());
                                    bxgtVar2.b(instant2);
                                    bxgtVar2.a().m();
                                    String[] strArr4 = bxiv.a;
                                    bxio bxioVar = new bxio();
                                    bxioVar.f("saveToRemoteInstancesTableInTransaction");
                                    bxiu bxiuVar = new bxiu();
                                    bxiuVar.b(str4);
                                    bxioVar.b = new bxit(bxiuVar);
                                    bxioVar.d();
                                    z6 = true;
                                    if (list == null || list.isEmpty()) {
                                        chef.a.m("RPC returned no RegistrationInfo");
                                    } else {
                                        Optional.empty();
                                        for (fcfm fcfmVar3 : list) {
                                            boolean z7 = z5;
                                            csjb c6 = chef.a.c();
                                            c6.I("Received RegistrationInfo from backend");
                                            c6.B("hasEncryption", chef.i(fcfmVar3));
                                            c6.B("forceDisabled", z7);
                                            c6.r();
                                            Optional empty = Optional.empty();
                                            if ((fcfmVar3.b & 1) != 0) {
                                                fcfa fcfaVar = fcfmVar3.f;
                                                if (fcfaVar == null) {
                                                    fcfaVar = fcfa.a;
                                                }
                                                empty = Optional.of(fcfaVar.c);
                                            }
                                            Optional optional = empty;
                                            String D2 = fcfmVar3.c.D(StandardCharsets.US_ASCII);
                                            bdhc bdhcVar = new bdhc();
                                            if (!z7) {
                                                if (chef.i(fcfmVar3)) {
                                                    bdhcVar.b(cgye.ETOUFFEE);
                                                }
                                                if (chef.j(fcfmVar3)) {
                                                    bdhcVar.b(cgye.ETOUFFEE_GROUPS);
                                                }
                                            }
                                            if (fcfmVar3.d.size() > 0 && fcfmVar3.d.contains(Integer.valueOf(cgye.MMS_GROUP_UPGRADE_METRICS_COLLECTION.h))) {
                                                bdhcVar.b(cgye.MMS_GROUP_UPGRADE_METRICS_COLLECTION);
                                            }
                                            if (fcfmVar3.d.size() > 0 && fcfmVar3.d.contains(Integer.valueOf(cgye.MULTI_DEVICE.h))) {
                                                bdhcVar.b(cgye.MULTI_DEVICE);
                                            }
                                            chefVar2.e(str4, D2, bdhcVar.a(), optional, Long.valueOf(fcfmVar3.g), instant2);
                                        }
                                    }
                                    engw engwVar2 = (engw) Collection.EL.stream(list).map(new Function() { // from class: chec
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            fcfa fcfaVar2 = ((fcfm) obj2).f;
                                            if (fcfaVar2 == null) {
                                                fcfaVar2 = fcfa.a;
                                            }
                                            return fcfaVar2.c;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).collect(endq.a);
                                    if (chefVar2.e.a()) {
                                        Iterator it3 = ((Set) chefVar2.d.b()).iterator();
                                        while (it3.hasNext()) {
                                            ((cheg) it3.next()).a(engwVar2, str4);
                                        }
                                    }
                                    return Boolean.valueOf(z6);
                                }
                            })).booleanValue();
                            akxl akxlVar = (akxl) caenVar.d.b();
                            eolu eoluVar = (eolu) eolv.a.createBuilder();
                            eolt eoltVar = eolt.BUGLE_E2EE_LOOKUP_REGISTERED;
                            eoluVar.copyOnWrite();
                            eolv eolvVar = (eolv) eoluVar.instance;
                            eolvVar.j = eoltVar.dk;
                            eolvVar.b |= 1;
                            eozlVar.copyOnWrite();
                            eozq eozqVar5 = (eozq) eozlVar.instance;
                            eozqVar5.b |= 2;
                            eozqVar5.f = !booleanValue;
                            eoluVar.copyOnWrite();
                            eolv eolvVar2 = (eolv) eoluVar.instance;
                            eozq eozqVar6 = (eozq) eozlVar.build();
                            eozqVar6.getClass();
                            eolvVar2.W = eozqVar6;
                            eolvVar2.c |= 1048576;
                            akxlVar.j(eoluVar);
                            c = c4;
                        }
                        return new ppp();
                    }
                }, this.b).f(Throwable.class, new eroh() { // from class: caef
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        caen.a.s("Caught Throwable, failed to retrieve registration Ids from tachyon", (Throwable) obj);
                        ((bzzi) caen.this.e.b()).b(eoznVar, -1, null);
                        return elfo.e(new ppn());
                    }
                }, this.b);
                f2.b(f3);
                f2.close();
                return f3;
            }
            e = elfo.e(new camj(2, "", enoz.a, 0));
            e.getClass();
            elfl f32 = e.h(new emwl() { // from class: caee
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    camn camnVar = (camn) obj;
                    int d = camnVar.d();
                    eozn eoznVar2 = eoznVar;
                    caen caenVar = caen.this;
                    char c = 2;
                    if (d == 2) {
                        ((bzzi) caenVar.e.b()).b(eoznVar2, -2, null);
                        return new ppn();
                    }
                    if (camnVar.d() == 3) {
                        ((bzzi) caenVar.e.b()).b(eoznVar2, camnVar.a(), camnVar.c());
                        return new ppn();
                    }
                    Iterable<String> iterable4 = iterable2;
                    enhk b = camnVar.b();
                    String c2 = camnVar.c();
                    for (final String str3 : iterable4) {
                        int i2 = engw.d;
                        final List engwVar = (engw) b.getOrDefault(str3, enou.a);
                        eozl eozlVar = (eozl) eozq.a.createBuilder();
                        eozlVar.copyOnWrite();
                        eozq eozqVar = (eozq) eozlVar.instance;
                        eozqVar.c = eoznVar2.m;
                        boolean z = true;
                        eozqVar.b |= 1;
                        eozlVar.copyOnWrite();
                        eozq eozqVar2 = (eozq) eozlVar.instance;
                        eozqVar2.b |= 8;
                        eozqVar2.h = c2;
                        for (fcfm fcfmVar : engwVar) {
                            eozo eozoVar = (eozo) eozp.a.createBuilder();
                            char c3 = c;
                            String D = fcfmVar.c.D(StandardCharsets.US_ASCII);
                            eozoVar.copyOnWrite();
                            eozp eozpVar = (eozp) eozoVar.instance;
                            eozpVar.b |= 1;
                            eozpVar.c = D;
                            boolean z2 = fcfmVar.d.size() > 0 && fcfmVar.d.contains(Integer.valueOf(cgye.ETOUFFEE.h));
                            eozoVar.copyOnWrite();
                            eozp eozpVar2 = (eozp) eozoVar.instance;
                            eozpVar2.b |= 2;
                            eozpVar2.d = z2;
                            eozp eozpVar3 = (eozp) eozoVar.build();
                            eozlVar.copyOnWrite();
                            eozq eozqVar3 = (eozq) eozlVar.instance;
                            eozpVar3.getClass();
                            eygr eygrVar = eozqVar3.e;
                            if (!eygrVar.c()) {
                                eozqVar3.e = eyfy.mutableCopy(eygrVar);
                            }
                            eozqVar3.e.add(eozpVar3);
                            c = c3;
                        }
                        char c4 = c;
                        final List c5 = caenVar.f.c(str3);
                        enqv it = c5.iterator();
                        while (it.hasNext()) {
                            boqd boqdVar = (boqd) it.next();
                            eozo eozoVar2 = (eozo) eozp.a.createBuilder();
                            boolean j = boqdVar.j();
                            eozoVar2.copyOnWrite();
                            eozp eozpVar4 = (eozp) eozoVar2.instance;
                            boolean z3 = z;
                            eozpVar4.b |= 2;
                            eozpVar4.d = j;
                            String i3 = boqdVar.i();
                            if (i3 != null) {
                                eozoVar2.copyOnWrite();
                                eozp eozpVar5 = (eozp) eozoVar2.instance;
                                eozpVar5.b |= 1;
                                eozpVar5.c = i3;
                            }
                            eozp eozpVar6 = (eozp) eozoVar2.build();
                            eozlVar.copyOnWrite();
                            eozq eozqVar4 = (eozq) eozlVar.instance;
                            eozpVar6.getClass();
                            eygr eygrVar2 = eozqVar4.d;
                            if (!eygrVar2.c()) {
                                eozqVar4.d = eyfy.mutableCopy(eygrVar2);
                            }
                            eozqVar4.d.add(eozpVar6);
                            z = z3;
                        }
                        boolean z4 = z;
                        final Instant instant = f;
                        final chef chefVar = caenVar.f;
                        final boolean z5 = eoznVar2 == eozn.RECEIVED_PLAINTEXT_DELIVERY_RECEIPT ? z4 : false;
                        boolean booleanValue = ((Boolean) chefVar.b.c("RemoteInstanceDatabaseOperations#saveToRemoteInstances", new emyl() { // from class: chee
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.emyl
                            public final Object get() {
                                boolean z6;
                                ArrayList arrayList = new ArrayList();
                                enqv it2 = ((engw) c5).iterator();
                                while (it2.hasNext()) {
                                    boqd boqdVar2 = (boqd) it2.next();
                                    csjb a4 = chef.a.a();
                                    a4.I("Existing RemoteInstance from database");
                                    a4.B("hasEncryption", boqdVar2.j());
                                    a4.B("hasGroupEncryption", boqdVar2.k());
                                    a4.z("updatedAtHash", boqdVar2.f());
                                    a4.B("isUpdatedAtHashValid", boqdVar2.l());
                                    a4.r();
                                    if (boqdVar2.l()) {
                                        arrayList.add(Long.valueOf(boqdVar2.f()));
                                    }
                                }
                                Instant instant2 = instant;
                                List<fcfm> list = engwVar;
                                String str4 = str3;
                                chef chefVar2 = chef.this;
                                if (!arrayList.isEmpty()) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (fcfm fcfmVar2 : list) {
                                        csjb a5 = chef.a.a();
                                        a5.I("RegistrationInfo from backend");
                                        a5.B("hasEncryption", chef.i(fcfmVar2));
                                        a5.B("hasGroupEncryption", chef.j(fcfmVar2));
                                        a5.z("updatedAtHash", fcfmVar2.g);
                                        a5.r();
                                        arrayList2.add(Long.valueOf(fcfmVar2.g));
                                    }
                                    Collections.sort(arrayList);
                                    Collections.sort(arrayList2);
                                    if (arrayList.equals(arrayList2)) {
                                        chef.a.p("UpdatedAtHash has not changed. Only update RPC timestamps in RemoteInstances.");
                                        Instant f4 = chefVar2.c.f();
                                        String[] strArr = bxgl.a;
                                        bxgi bxgiVar = new bxgi();
                                        bxgiVar.ap("setRpcTimestamps-remoteregistrations");
                                        bxgiVar.c(instant2);
                                        bxgiVar.f(f4);
                                        bxgiVar.g(chef.a(str4));
                                        bxgiVar.b().e();
                                        String[] strArr2 = bxhr.a;
                                        bxgt bxgtVar = new bxgt();
                                        bxgtVar.d(str4);
                                        bxgtVar.b(instant2);
                                        bxgtVar.c(f4);
                                        bxgtVar.a().m();
                                        z6 = false;
                                        return Boolean.valueOf(z6);
                                    }
                                }
                                chef.a.m("Updating RemoteInstance table");
                                String[] strArr3 = bxhr.a;
                                bxgt bxgtVar2 = new bxgt();
                                bxgtVar2.d(str4);
                                bxgtVar2.c(chefVar2.c.f());
                                bxgtVar2.b(instant2);
                                bxgtVar2.a().m();
                                String[] strArr4 = bxiv.a;
                                bxio bxioVar = new bxio();
                                bxioVar.f("saveToRemoteInstancesTableInTransaction");
                                bxiu bxiuVar = new bxiu();
                                bxiuVar.b(str4);
                                bxioVar.b = new bxit(bxiuVar);
                                bxioVar.d();
                                z6 = true;
                                if (list == null || list.isEmpty()) {
                                    chef.a.m("RPC returned no RegistrationInfo");
                                } else {
                                    Optional.empty();
                                    for (fcfm fcfmVar3 : list) {
                                        boolean z7 = z5;
                                        csjb c6 = chef.a.c();
                                        c6.I("Received RegistrationInfo from backend");
                                        c6.B("hasEncryption", chef.i(fcfmVar3));
                                        c6.B("forceDisabled", z7);
                                        c6.r();
                                        Optional empty = Optional.empty();
                                        if ((fcfmVar3.b & 1) != 0) {
                                            fcfa fcfaVar = fcfmVar3.f;
                                            if (fcfaVar == null) {
                                                fcfaVar = fcfa.a;
                                            }
                                            empty = Optional.of(fcfaVar.c);
                                        }
                                        Optional optional = empty;
                                        String D2 = fcfmVar3.c.D(StandardCharsets.US_ASCII);
                                        bdhc bdhcVar = new bdhc();
                                        if (!z7) {
                                            if (chef.i(fcfmVar3)) {
                                                bdhcVar.b(cgye.ETOUFFEE);
                                            }
                                            if (chef.j(fcfmVar3)) {
                                                bdhcVar.b(cgye.ETOUFFEE_GROUPS);
                                            }
                                        }
                                        if (fcfmVar3.d.size() > 0 && fcfmVar3.d.contains(Integer.valueOf(cgye.MMS_GROUP_UPGRADE_METRICS_COLLECTION.h))) {
                                            bdhcVar.b(cgye.MMS_GROUP_UPGRADE_METRICS_COLLECTION);
                                        }
                                        if (fcfmVar3.d.size() > 0 && fcfmVar3.d.contains(Integer.valueOf(cgye.MULTI_DEVICE.h))) {
                                            bdhcVar.b(cgye.MULTI_DEVICE);
                                        }
                                        chefVar2.e(str4, D2, bdhcVar.a(), optional, Long.valueOf(fcfmVar3.g), instant2);
                                    }
                                }
                                engw engwVar2 = (engw) Collection.EL.stream(list).map(new Function() { // from class: chec
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        fcfa fcfaVar2 = ((fcfm) obj2).f;
                                        if (fcfaVar2 == null) {
                                            fcfaVar2 = fcfa.a;
                                        }
                                        return fcfaVar2.c;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(endq.a);
                                if (chefVar2.e.a()) {
                                    Iterator it3 = ((Set) chefVar2.d.b()).iterator();
                                    while (it3.hasNext()) {
                                        ((cheg) it3.next()).a(engwVar2, str4);
                                    }
                                }
                                return Boolean.valueOf(z6);
                            }
                        })).booleanValue();
                        akxl akxlVar = (akxl) caenVar.d.b();
                        eolu eoluVar = (eolu) eolv.a.createBuilder();
                        eolt eoltVar = eolt.BUGLE_E2EE_LOOKUP_REGISTERED;
                        eoluVar.copyOnWrite();
                        eolv eolvVar = (eolv) eoluVar.instance;
                        eolvVar.j = eoltVar.dk;
                        eolvVar.b |= 1;
                        eozlVar.copyOnWrite();
                        eozq eozqVar5 = (eozq) eozlVar.instance;
                        eozqVar5.b |= 2;
                        eozqVar5.f = !booleanValue;
                        eoluVar.copyOnWrite();
                        eolv eolvVar2 = (eolv) eoluVar.instance;
                        eozq eozqVar6 = (eozq) eozlVar.build();
                        eozqVar6.getClass();
                        eolvVar2.W = eozqVar6;
                        eolvVar2.c |= 1048576;
                        akxlVar.j(eoluVar);
                        c = c4;
                    }
                    return new ppp();
                }
            }, this.b).f(Throwable.class, new eroh() { // from class: caef
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    caen.a.s("Caught Throwable, failed to retrieve registration Ids from tachyon", (Throwable) obj);
                    ((bzzi) caen.this.e.b()).b(eoznVar, -1, null);
                    return elfo.e(new ppn());
                }
            }, this.b);
            f2.b(f32);
            f2.close();
            return f32;
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final enpj c(engw engwVar, boolean z) {
        efbd.b();
        engr engrVar = new engr();
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            String i2 = ((aoku) engwVar.get(i)).i(((astp) this.l.b()).a());
            if (!TextUtils.isEmpty(i2)) {
                engrVar.h(i2);
            }
        }
        engw g = engrVar.g();
        if (g.isEmpty()) {
            this.g.e("Bugle.Rcs.PhoneNumber.Invalid.Counts", 3);
        }
        engw b = this.f.b(g);
        eniq eniqVar = new eniq();
        int i3 = ((enou) b).c;
        for (int i4 = 0; i4 < i3; i4++) {
            boqd boqdVar = (boqd) b.get(i4);
            if (boqdVar.j() && (!z || boqdVar.k())) {
                String i5 = boqdVar.i();
                if (!TextUtils.isEmpty(i5)) {
                    eniqVar.b(boqdVar.g(), i5);
                }
            }
        }
        enit a2 = eniqVar.a();
        boolean isEmpty = b.isEmpty();
        boolean A = a2.A();
        if (isEmpty) {
            this.g.e("Bugle.Etouffee.RemoteDevice.Status", bzwj.a(1));
            return a2;
        }
        if (A) {
            this.g.e("Bugle.Etouffee.RemoteDevice.Status", bzwj.a(2));
        }
        return a2;
    }

    public final void d(final awui awuiVar, final String str, final String str2, final eyee eyeeVar, final Instant instant) {
        a.p("Replacing existing encryptable registration ID");
        this.j.d("RemoteDeviceLoader#setEncryptableRegistrationId", new Runnable() { // from class: caem
            @Override // java.lang.Runnable
            public final void run() {
                awui awuiVar2 = awuiVar;
                String str3 = awuiVar2 != null ? awuiVar2.d : str;
                String str4 = str2;
                eyee eyeeVar2 = eyeeVar;
                Instant instant2 = instant;
                caen caenVar = caen.this;
                int i = engw.d;
                engw engwVar = enou.a;
                String[] strArr = bxhr.a;
                bxgt bxgtVar = new bxgt();
                bxgtVar.d(str3);
                bxgtVar.c(caenVar.c.f());
                bxgtVar.b(instant2);
                bxgtVar.a().m();
                String[] strArr2 = bxgl.a;
                bxgi bxgiVar = new bxgi();
                bxgiVar.ap("setEncryptableRegistrationId");
                bxgiVar.a.put("identity_key", eyeeVar2.I());
                bxgiVar.f(caenVar.c.f());
                bxgiVar.c(instant2);
                bxgk bxgkVar = new bxgk();
                bxgkVar.b(str4);
                if (bxgiVar.aj(new bxgj(bxgkVar), "remote_registrations_table-buildAndUpdateForTachyonRegistrationId")) {
                    caen.a.p("Updated an entry for the remote registration.");
                } else {
                    caen.a.p("Inserted an entry for the remote registration.");
                    chef chefVar = caenVar.f;
                    bdhc bdhcVar = new bdhc();
                    bdhcVar.b(cgye.ETOUFFEE);
                    chefVar.e(str3, str4, bdhcVar.a(), Optional.of(eyeeVar2), null, instant2);
                }
                if (caenVar.i.a()) {
                    Iterator it = ((Set) caenVar.h.b()).iterator();
                    while (it.hasNext()) {
                        ((cheg) it.next()).a(engw.r(eyeeVar2), str3);
                    }
                }
            }
        });
    }
}
