package com.google.android.libraries.communications.mobileconfiguration.sync;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dlqq;
import defpackage.dlsb;
import defpackage.dlsc;
import defpackage.ekhw;
import defpackage.emwl;
import defpackage.enrr;
import defpackage.erny;
import defpackage.eroh;
import defpackage.erqt;
import defpackage.errl;
import defpackage.eznd;
import defpackage.ezne;
import defpackage.eznn;
import defpackage.ezno;
import defpackage.eznw;
import defpackage.ezny;
import defpackage.fdqx;
import defpackage.ppr;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SyncWorker extends ppr {
    private final dlsc e;
    private final errl f;

    /* compiled from: PG */
    public interface a {
        dlsc dG();

        errl eQ();
    }

    public SyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ekhw.a(context, a.class);
        this.e = aVar.dG();
        this.f = aVar.eQ();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        ListenableFuture g;
        final UUID g2 = g();
        enrr enrrVar = (enrr) ((enrr) dlsc.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncConfigsForStoredParameters", 103, "SyncHelper.java");
        final dlsc dlscVar = this.e;
        enrrVar.D("[%s] sync started, workRequestId:%s", dlscVar.h, g2);
        eznd ezndVar = (eznd) ezne.a.createBuilder();
        eznn eznnVar = (eznn) ezno.a.createBuilder();
        String uuid = dlscVar.h.toString();
        eznnVar.copyOnWrite();
        ezno eznoVar = (ezno) eznnVar.instance;
        uuid.getClass();
        eznoVar.b |= 1;
        eznoVar.e = uuid;
        String uuid2 = g2.toString();
        eznnVar.copyOnWrite();
        ezno eznoVar2 = (ezno) eznnVar.instance;
        uuid2.getClass();
        eznoVar2.b |= 2;
        eznoVar2.f = uuid2;
        eznw eznwVar = eznw.a;
        eznnVar.copyOnWrite();
        ezno eznoVar3 = (ezno) eznnVar.instance;
        eznwVar.getClass();
        eznoVar3.d = eznwVar;
        eznoVar3.c = 2;
        ezndVar.copyOnWrite();
        ezne ezneVar = (ezne) ezndVar.instance;
        ezno eznoVar4 = (ezno) eznnVar.build();
        eznoVar4.getClass();
        ezneVar.c = eznoVar4;
        ezneVar.b = 3;
        dlscVar.i.a((ezne) ezndVar.build());
        if (fdqx.a.get().i(dlscVar.b)) {
            g = erny.g(dlscVar.f.submit(new Callable() { // from class: dlrz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ((dlrm) dlsc.this.c.b()).c();
                }
            }), new eroh() { // from class: dlsa
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    ListenableFuture f;
                    enhk enhkVar;
                    int i;
                    final Optional optional = (Optional) obj;
                    boolean isEmpty = optional.isEmpty();
                    final dlsc dlscVar2 = dlsc.this;
                    final UUID uuid3 = g2;
                    if (isEmpty) {
                        ((enrr) ((enrr) dlsc.a.j()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 128, "SyncHelper.java")).D("[%s] sync aborted because failed to get parameters, workRequestId:%s", dlscVar2.h, uuid3);
                        dlscVar2.i.a(dlqq.b(dlscVar2.h, 3, uuid3));
                        return erqt.i(dlsb.FAILURE);
                    }
                    enhk enhkVar2 = fdqx.c(dlscVar2.b) ? (enhk) Collection.EL.stream(((enhk) optional.get()).entrySet()).filter(new Predicate() { // from class: dlrv
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            Map.Entry entry = (Map.Entry) obj2;
                            int i2 = ((dlro) entry.getValue()).b & 2;
                            dlsc dlscVar3 = dlsc.this;
                            if (i2 == 0) {
                                ((enrr) ((enrr) dlsc.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 145, "SyncHelper.java")).t("[%s] configData has no configuration, enforce a sync.", dlscVar3.h);
                                return true;
                            }
                            ewgw ewgwVar = ((dlro) entry.getValue()).d;
                            if (ewgwVar == null) {
                                ewgwVar = ewgw.a;
                            }
                            eyev eyevVar = ewgwVar.f;
                            if (eyevVar == null) {
                                eyevVar = eyev.a;
                            }
                            Duration c = eykj.c(eyevVar);
                            eyja eyjaVar = ((dlro) entry.getValue()).e;
                            if (eyjaVar == null) {
                                eyjaVar = eyja.a;
                            }
                            Duration between = Duration.between(eykj.d(eyjaVar), Instant.now());
                            Duration ofSeconds = Duration.ofSeconds(fdqx.a.get().a(dlscVar3.b));
                            boolean z = c.minus(between).compareTo(ofSeconds) <= 0;
                            ((enrr) ((enrr) dlsc.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 166, "SyncHelper.java")).L("[%s] configValidity: %s, durationSinceLastUpdate: %s, batchSyncConfigExpireInterval: %s, shouldSync: %s", dlscVar3.h, c, between, ofSeconds, Boolean.valueOf(z));
                            return z;
                        }
                    }).collect(endq.a(new Function() { // from class: dlrw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return (String) ((Map.Entry) obj2).getKey();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: dlrx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return (dlro) ((Map.Entry) obj2).getValue();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    })) : (enhk) optional.get();
                    if (enhkVar2.isEmpty()) {
                        ((enrr) ((enrr) dlsc.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 182, "SyncHelper.java")).D("[%s] sync aborted because no parameters are stored, workRequestId:%s", dlscVar2.h, uuid3);
                        dlscVar2.i.a(dlqq.c(dlscVar2.h, 3, uuid3));
                        return erqt.i(dlsb.NO_PARAMETERS_STORED);
                    }
                    enhd enhdVar = new enhd();
                    Iterator it = enhkVar2.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        dlro dlroVar = (dlro) entry.getValue();
                        ewgt ewgtVar = (ewgt) ewgu.a.createBuilder();
                        String packageName = dlscVar2.b.getPackageName();
                        ewgtVar.copyOnWrite();
                        ewgu ewguVar = (ewgu) ewgtVar.instance;
                        packageName.getClass();
                        ewguVar.b = packageName;
                        Context context = dlscVar2.b;
                        try {
                            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
                            i = -1;
                        }
                        ewgtVar.copyOnWrite();
                        ((ewgu) ewgtVar.instance).c = i;
                        ewgu ewguVar2 = (ewgu) ewgtVar.build();
                        if (fdqx.a.get().k(dlscVar2.b)) {
                            ewgt ewgtVar2 = (ewgt) ewgu.a.createBuilder();
                            ewgtVar2.copyOnWrite();
                            ((ewgu) ewgtVar2.instance).b = "com.google.android.gms";
                            dfpi dfpiVar = dfpi.a;
                            long a2 = dfqf.a(dlscVar2.b);
                            ewgtVar2.copyOnWrite();
                            ((ewgu) ewgtVar2.instance).c = a2;
                            ewgu ewguVar3 = (ewgu) ewgtVar2.build();
                            ewgy ewgyVar = dlroVar.c;
                            if (ewgyVar == null) {
                                ewgyVar = ewgy.a;
                            }
                            ewgx ewgxVar = (ewgx) ewgyVar.toBuilder();
                            ewgxVar.copyOnWrite();
                            ((ewgy) ewgxVar.instance).g = ewgy.emptyProtobufList();
                            ewgxVar.a(ewguVar2);
                            ewgxVar.a(ewguVar3);
                            ewgy ewgyVar2 = (ewgy) ewgxVar.build();
                            dlrn dlrnVar = (dlrn) dlroVar.toBuilder();
                            dlrnVar.copyOnWrite();
                            dlro dlroVar2 = (dlro) dlrnVar.instance;
                            ewgyVar2.getClass();
                            dlroVar2.c = ewgyVar2;
                            dlroVar2.b |= 1;
                            enhdVar.k((String) entry.getKey(), (dlro) dlrnVar.build());
                        } else {
                            ewgy ewgyVar3 = dlroVar.c;
                            if (ewgyVar3 == null) {
                                ewgyVar3 = ewgy.a;
                            }
                            ewgx ewgxVar2 = (ewgx) ewgyVar3.toBuilder();
                            ewgxVar2.copyOnWrite();
                            ((ewgy) ewgxVar2.instance).g = ewgy.emptyProtobufList();
                            ewgxVar2.a(ewguVar2);
                            ewgy ewgyVar4 = (ewgy) ewgxVar2.build();
                            dlrn dlrnVar2 = (dlrn) dlroVar.toBuilder();
                            dlrnVar2.copyOnWrite();
                            dlro dlroVar3 = (dlro) dlrnVar2.instance;
                            ewgyVar4.getClass();
                            dlroVar3.c = ewgyVar4;
                            dlroVar3.b |= 1;
                            enhdVar.k((String) entry.getKey(), (dlro) dlrnVar2.build());
                        }
                    }
                    enhk c = enhdVar.c();
                    final dlrg dlrgVar = (dlrg) dlscVar2.d.b();
                    final UUID uuid4 = dlscVar2.h;
                    if (dlrgVar.h.isEmpty()) {
                        ((enrr) ((enrr) dlrg.a.j()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 194, "RpcManager.java")).t("[%s] failed to create mobileConfigurationClient", uuid4);
                        f = erqt.i(new dlqt(4));
                    } else {
                        final AtomicReference atomicReference = (AtomicReference) dlrgVar.h.get();
                        ListenableFuture submit = dlrgVar.d.submit(new Callable() { // from class: dlqx
                            /* JADX WARN: Removed duplicated region for block: B:10:0x009d  */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x00de  */
                            @Override // java.util.concurrent.Callable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object call() {
                                /*
                                    Method dump skipped, instructions count: 266
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.dlqx.call():java.lang.Object");
                            }
                        });
                        int i2 = engw.d;
                        engr engrVar = new engr();
                        engr engrVar2 = new engr();
                        int i3 = 0;
                        for (Map.Entry entry2 : c.entrySet()) {
                            ewgy ewgyVar5 = ((dlro) entry2.getValue()).c;
                            if (ewgyVar5 == null) {
                                ewgyVar5 = ewgy.a;
                            }
                            ewgx ewgxVar3 = (ewgx) ewgyVar5.toBuilder();
                            String num = Integer.toString(i3);
                            ewgxVar3.copyOnWrite();
                            ewgy ewgyVar6 = (ewgy) ewgxVar3.instance;
                            num.getClass();
                            ewgyVar6.c = num;
                            if ((ewgyVar6.b & 2) != 0) {
                                ewii ewiiVar = ewgyVar6.f;
                                if (ewiiVar == null) {
                                    ewiiVar = ewii.a;
                                }
                                String b = fhpd.b(ewiiVar.c, '0');
                                ewii ewiiVar2 = ((ewgy) ewgxVar3.instance).f;
                                if (ewiiVar2 == null) {
                                    ewiiVar2 = ewii.a;
                                }
                                ewih ewihVar = (ewih) ewiiVar2.toBuilder();
                                ewihVar.copyOnWrite();
                                enhkVar = c;
                                ewii ewiiVar3 = (ewii) ewihVar.instance;
                                b.getClass();
                                ewiiVar3.c = b;
                                ewii ewiiVar4 = (ewii) ewihVar.build();
                                ewgxVar3.copyOnWrite();
                                ewgy ewgyVar7 = (ewgy) ewgxVar3.instance;
                                ewiiVar4.getClass();
                                ewgyVar7.f = ewiiVar4;
                                ewgyVar7.b |= 2;
                            } else {
                                enhkVar = c;
                            }
                            engrVar.h((ewgy) ewgxVar3.build());
                            engrVar2.h((String) entry2.getKey());
                            i3++;
                            c = enhkVar;
                        }
                        final enhk enhkVar3 = c;
                        engw g3 = engrVar.g();
                        final engw g4 = engrVar2.g();
                        ewha ewhaVar = (ewha) ewhb.a.createBuilder();
                        ewif ewifVar = (ewif) ewig.a.createBuilder();
                        String uuid5 = uuid4.toString();
                        ewifVar.copyOnWrite();
                        ewig ewigVar = (ewig) ewifVar.instance;
                        uuid5.getClass();
                        ewigVar.b = uuid5;
                        long j = dlrgVar.b;
                        ewifVar.copyOnWrite();
                        ((ewig) ewifVar.instance).c = j;
                        ewig ewigVar2 = (ewig) ewifVar.build();
                        ewhaVar.copyOnWrite();
                        ewhb ewhbVar = (ewhb) ewhaVar.instance;
                        ewigVar2.getClass();
                        ewhbVar.c = ewigVar2;
                        ewhbVar.b |= 1;
                        ewhaVar.copyOnWrite();
                        ewhb ewhbVar2 = (ewhb) ewhaVar.instance;
                        eygr eygrVar = ewhbVar2.d;
                        if (!eygrVar.c()) {
                            ewhbVar2.d = eyfy.mutableCopy(eygrVar);
                        }
                        eydl.addAll(g3, ewhbVar2.d);
                        final ewhb ewhbVar3 = (ewhb) ewhaVar.build();
                        ((enrr) ((enrr) dlrg.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 242, "RpcManager.java")).D("[%s] making getConfiguration request, workRequestId:%s", uuid4, uuid3);
                        ((enrr) ((enrr) dlrg.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 244, "RpcManager.java")).t("GetConfigurationRequest: %s", ewhbVar3);
                        cgtm cgtmVar = dlrgVar.k;
                        int i4 = ((enou) g3).c;
                        eznd ezndVar2 = (eznd) ezne.a.createBuilder();
                        eznn eznnVar2 = (eznn) ezno.a.createBuilder();
                        String uuid6 = uuid4.toString();
                        eznnVar2.copyOnWrite();
                        ezno eznoVar5 = (ezno) eznnVar2.instance;
                        uuid6.getClass();
                        eznoVar5.b |= 1;
                        eznoVar5.e = uuid6;
                        String uuid7 = uuid3.toString();
                        eznnVar2.copyOnWrite();
                        ezno eznoVar6 = (ezno) eznnVar2.instance;
                        uuid7.getClass();
                        eznoVar6.b |= 2;
                        eznoVar6.f = uuid7;
                        eznr eznrVar = (eznr) ezns.a.createBuilder();
                        eznrVar.copyOnWrite();
                        ezns eznsVar = (ezns) eznrVar.instance;
                        eznsVar.b |= 1;
                        eznsVar.c = i4;
                        eznnVar2.copyOnWrite();
                        ezno eznoVar7 = (ezno) eznnVar2.instance;
                        ezns eznsVar2 = (ezns) eznrVar.build();
                        eznsVar2.getClass();
                        eznoVar7.d = eznsVar2;
                        eznoVar7.c = 4;
                        ezndVar2.copyOnWrite();
                        ezne ezneVar2 = (ezne) ezndVar2.instance;
                        ezno eznoVar8 = (ezno) eznnVar2.build();
                        eznoVar8.getClass();
                        ezneVar2.c = eznoVar8;
                        ezneVar2.b = 3;
                        cgtmVar.a((ezne) ezndVar2.build());
                        f = ernq.f(erny.f(erqc.o(erny.g(erqc.o(submit), new eroh() { // from class: dlqy
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                ewhj ewhjVar = (ewhj) atomicReference.get();
                                fdxk fdxkVar = ewhjVar.a;
                                febs febsVar = ewhk.a;
                                if (febsVar == null) {
                                    synchronized (ewhk.class) {
                                        febsVar = ewhk.a;
                                        if (febsVar == null) {
                                            febp a3 = febs.a();
                                            a3.c = febr.UNARY;
                                            a3.d = febs.c("google.internal.communications.mobileconfiguration.v1.MobileConfigurationService", "GetConfiguration");
                                            a3.b();
                                            ewhb ewhbVar4 = ewhb.a;
                                            eyfc eyfcVar = ffag.a;
                                            a3.a = new ffae(ewhbVar4);
                                            a3.b = new ffae(ewhd.a);
                                            febsVar = a3.a();
                                            ewhk.a = febsVar;
                                        }
                                    }
                                }
                                return ffat.a(fdxkVar.a(febsVar, ewhjVar.b), ewhbVar3);
                            }
                        }, dlrgVar.d)), new emwl() { // from class: dlqz
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v29, types: [fazb, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r6v21, types: [fazb, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r8v11, types: [fazb, java.lang.Object] */
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                Map map;
                                ewhd ewhdVar = (ewhd) obj2;
                                enrr enrrVar2 = (enrr) ((enrr) dlrg.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "processResponse", 276, "RpcManager.java");
                                UUID uuid8 = uuid4;
                                UUID uuid9 = uuid3;
                                enrrVar2.D("[%s] processing getConfiguration response, workRequestId:%s", uuid8, uuid9);
                                ((enrr) ((enrr) dlrg.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "processResponse", 278, "RpcManager.java")).t("GetConfigurationResponse: %s", ewhdVar);
                                int size = ewhdVar.b.size();
                                eznd ezndVar3 = (eznd) ezne.a.createBuilder();
                                eznn eznnVar3 = (eznn) ezno.a.createBuilder();
                                String uuid10 = uuid8.toString();
                                eznnVar3.copyOnWrite();
                                ezno eznoVar9 = (ezno) eznnVar3.instance;
                                uuid10.getClass();
                                eznoVar9.b |= 1;
                                eznoVar9.e = uuid10;
                                String uuid11 = uuid9.toString();
                                eznnVar3.copyOnWrite();
                                ezno eznoVar10 = (ezno) eznnVar3.instance;
                                uuid11.getClass();
                                eznoVar10.b |= 2;
                                eznoVar10.f = uuid11;
                                eznt ezntVar = (eznt) eznu.a.createBuilder();
                                ezntVar.copyOnWrite();
                                eznu eznuVar = (eznu) ezntVar.instance;
                                eznuVar.b |= 1;
                                eznuVar.c = size;
                                eznnVar3.copyOnWrite();
                                ezno eznoVar11 = (ezno) eznnVar3.instance;
                                eznu eznuVar2 = (eznu) ezntVar.build();
                                eznuVar2.getClass();
                                eznoVar11.d = eznuVar2;
                                eznoVar11.c = 5;
                                ezndVar3.copyOnWrite();
                                ezne ezneVar3 = (ezne) ezndVar3.instance;
                                ezno eznoVar12 = (ezno) eznnVar3.build();
                                eznoVar12.getClass();
                                ezneVar3.c = eznoVar12;
                                ezneVar3.b = 3;
                                ezne ezneVar4 = (ezne) ezndVar3.build();
                                dlrg dlrgVar2 = dlrg.this;
                                dlrgVar2.k.a(ezneVar4);
                                HashSet hashSet = new HashSet(ewhdVar.c);
                                if (!hashSet.equals(dlrgVar2.j.get())) {
                                    dlrgVar2.i.isPresent();
                                    dlrgVar2.j.set(hashSet);
                                    int[] array = Collection.EL.stream(ewhdVar.c).mapToInt(new ToIntFunction() { // from class: dlrd
                                        @Override // java.util.function.ToIntFunction
                                        public final int applyAsInt(Object obj3) {
                                            return ((Integer) obj3).intValue();
                                        }
                                    }).toArray();
                                    if (fdqr.a.get().e(dlrgVar2.c)) {
                                        enqv it2 = ((engw) dlrgVar2.g).iterator();
                                        while (it2.hasNext()) {
                                            ((dhlf) dlrgVar2.i.get().b()).p(array, (String) it2.next());
                                        }
                                    } else {
                                        ((dhlf) dlrgVar2.i.get().b()).p(array, "ANDROID_MESSAGING");
                                        ((dhlf) dlrgVar2.i.get().b()).p(array, "CARRIER_SERVICES");
                                    }
                                }
                                enhd enhdVar2 = new enhd();
                                Iterator<E> it3 = ewhdVar.b.iterator();
                                while (true) {
                                    map = enhkVar3;
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    engw engwVar = g4;
                                    ewgw ewgwVar = (ewgw) it3.next();
                                    String str = (String) engwVar.get(Integer.parseInt(ewgwVar.e));
                                    dlrn dlrnVar3 = (dlrn) dlro.a.createBuilder();
                                    ewgy ewgyVar8 = ((dlro) map.get(str)).c;
                                    if (ewgyVar8 == null) {
                                        ewgyVar8 = ewgy.a;
                                    }
                                    dlrnVar3.copyOnWrite();
                                    dlro dlroVar4 = (dlro) dlrnVar3.instance;
                                    ewgyVar8.getClass();
                                    dlroVar4.c = ewgyVar8;
                                    dlroVar4.b |= 1;
                                    dlrnVar3.copyOnWrite();
                                    dlro dlroVar5 = (dlro) dlrnVar3.instance;
                                    ewgwVar.getClass();
                                    dlroVar5.d = ewgwVar;
                                    dlroVar5.b |= 2;
                                    eyja eyjaVar = ((dlro) map.get(str)).f;
                                    if (eyjaVar == null) {
                                        eyjaVar = eyja.a;
                                    }
                                    dlrnVar3.copyOnWrite();
                                    dlro dlroVar6 = (dlro) dlrnVar3.instance;
                                    eyjaVar.getClass();
                                    dlroVar6.f = eyjaVar;
                                    dlroVar6.b |= 8;
                                    eyja b2 = eykj.b(Instant.now());
                                    dlrnVar3.copyOnWrite();
                                    dlro dlroVar7 = (dlro) dlrnVar3.instance;
                                    b2.getClass();
                                    dlroVar7.e = b2;
                                    dlroVar7.b |= 4;
                                    enhdVar2.k(str, (dlro) dlrnVar3.build());
                                }
                                enhk c2 = enhdVar2.c();
                                if (((enoz) c2).d >= ((enoz) map).d) {
                                    return new dlqs(c2);
                                }
                                ((enrr) ((enrr) dlrg.a.j()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "processResponse", 331, "RpcManager.java")).t("[%s] response is missing configs", uuid8);
                                return new dlqt(6);
                            }
                        }, dlrgVar.e), fedn.class, new emwl() { // from class: dlra
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ((enrr) ((enrr) ((enrr) dlrg.a.j()).g((fedn) obj2)).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 263, "RpcManager.java")).t("[%s] sync failed due to RPC error", uuid4);
                                return new dlqt(5);
                            }
                        }, dlrgVar.e);
                    }
                    return erny.f(f, new emwl() { // from class: dlry
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            dlrf dlrfVar = (dlrf) obj2;
                            enhk enhkVar4 = (enhk) optional.get();
                            int b2 = dlrfVar.b();
                            UUID uuid8 = uuid3;
                            dlsc dlscVar3 = dlsc.this;
                            if (b2 == 2) {
                                dlscVar3.i.a(dlqq.b(dlscVar3.h, dlrfVar.c(), uuid8));
                                return dlsb.FAILURE;
                            }
                            Map a3 = dlrfVar.a();
                            enin eninVar = new enin();
                            for (Map.Entry entry3 : ((enhk) a3).entrySet()) {
                                String str = (String) entry3.getKey();
                                dlro dlroVar4 = (dlro) entry3.getValue();
                                try {
                                    ((dlrm) dlscVar3.c.b()).e(str, dlroVar4);
                                    if ((((dlro) enhkVar4.get(str)).b & 2) != 0) {
                                        ewgw ewgwVar = ((dlro) enhkVar4.get(str)).d;
                                        if (ewgwVar == null) {
                                            ewgwVar = ewgw.a;
                                        }
                                        ewgw ewgwVar2 = dlroVar4.d;
                                        if (ewgwVar2 == null) {
                                            ewgwVar2 = ewgw.a;
                                        }
                                        ewgv ewgvVar = (ewgv) ewgwVar.toBuilder();
                                        ewgvVar.copyOnWrite();
                                        ((ewgw) ewgvVar.instance).e = ewgw.a.e;
                                        ewgvVar.copyOnWrite();
                                        ewgw ewgwVar3 = (ewgw) ewgvVar.instance;
                                        ewgwVar3.f = null;
                                        ewgwVar3.b &= -2;
                                        ewgw ewgwVar4 = (ewgw) ewgvVar.build();
                                        ewgv ewgvVar2 = (ewgv) ewgwVar2.toBuilder();
                                        ewgvVar2.copyOnWrite();
                                        ((ewgw) ewgvVar2.instance).e = ewgw.a.e;
                                        ewgvVar2.copyOnWrite();
                                        ewgw ewgwVar5 = (ewgw) ewgvVar2.instance;
                                        ewgwVar5.f = null;
                                        ewgwVar5.b &= -2;
                                        if (!ewgwVar4.equals(ewgvVar2.build())) {
                                            eninVar.c(str);
                                        }
                                    } else {
                                        eninVar.c(str);
                                    }
                                } catch (dlqr unused2) {
                                    ((enrr) ((enrr) dlsc.a.j()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "processUpdatedBatchedConfigData", 283, "SyncHelper.java")).D("[%s] failed to store configs, workRequestId:%s", dlscVar3.h, uuid8);
                                    dlscVar3.i.a(dlqq.b(dlscVar3.h, 7, uuid8));
                                    return dlsb.FAILURE;
                                }
                            }
                            enip g5 = eninVar.g();
                            if (!g5.isEmpty()) {
                                Intent intent = new Intent();
                                intent.setAction("com.google.android.libraries.communications.mobileconfiguration.CONFIG_UPDATED");
                                intent.addFlags(16777216);
                                intent.putStringArrayListExtra("config_data_ids_of_updated_configs", new ArrayList<>(g5));
                                ((enrr) ((enrr) dlsc.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "processUpdatedBatchedConfigData", 309, "SyncHelper.java")).D("[%s] broadcasting changed configs, workRequestId:%s", dlscVar3.h, uuid8);
                                cgtm cgtmVar2 = dlscVar3.i;
                                UUID uuid9 = dlscVar3.h;
                                int size = g5.size();
                                eznd ezndVar3 = (eznd) ezne.a.createBuilder();
                                eznn eznnVar3 = (eznn) ezno.a.createBuilder();
                                String uuid10 = uuid9.toString();
                                eznnVar3.copyOnWrite();
                                ezno eznoVar9 = (ezno) eznnVar3.instance;
                                uuid10.getClass();
                                eznoVar9.b |= 1;
                                eznoVar9.e = uuid10;
                                String uuid11 = uuid8.toString();
                                eznnVar3.copyOnWrite();
                                ezno eznoVar10 = (ezno) eznnVar3.instance;
                                uuid11.getClass();
                                eznoVar10.b |= 2;
                                eznoVar10.f = uuid11;
                                eznl eznlVar = (eznl) eznm.a.createBuilder();
                                eznlVar.copyOnWrite();
                                eznm eznmVar = (eznm) eznlVar.instance;
                                eznmVar.b |= 1;
                                eznmVar.c = size;
                                eznnVar3.copyOnWrite();
                                ezno eznoVar11 = (ezno) eznnVar3.instance;
                                eznm eznmVar2 = (eznm) eznlVar.build();
                                eznmVar2.getClass();
                                eznoVar11.d = eznmVar2;
                                eznoVar11.c = 6;
                                ezndVar3.copyOnWrite();
                                ezne ezneVar3 = (ezne) ezndVar3.instance;
                                ezno eznoVar12 = (ezno) eznnVar3.build();
                                eznoVar12.getClass();
                                ezneVar3.c = eznoVar12;
                                ezneVar3.b = 3;
                                cgtmVar2.a((ezne) ezndVar3.build());
                                dlscVar3.b.sendBroadcast(intent);
                            }
                            if (fdqx.c(dlscVar3.b)) {
                                enhd enhdVar2 = new enhd();
                                enhdVar2.g(enhkVar4);
                                enhdVar2.g(a3);
                                dlscVar3.e.c(enhdVar2.b());
                            } else {
                                dlscVar3.e.c(a3);
                            }
                            ((enrr) ((enrr) dlsc.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "processUpdatedBatchedConfigData", 332, "SyncHelper.java")).D("[%s] sync succeeded, workRequestId:%s", dlscVar3.h, uuid8);
                            dlscVar3.i.a(dlqq.c(dlscVar3.h, 5, uuid8));
                            return dlsb.SUCCESS;
                        }
                    }, dlscVar2.f);
                }
            }, dlscVar.g);
        } else {
            ((enrr) ((enrr) dlsc.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncConfigsForStoredParameters", 107, "SyncHelper.java")).D("[%s] sync disabled by flag, workRequestId:%s", dlscVar.h, g2);
            dlscVar.i.a(dlqq.c(dlscVar.h, 6, g2));
            g = erqt.i(dlsb.DISABLED_BY_FLAG);
        }
        return erny.f(g, new emwl() { // from class: dlse
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((dlsb) obj) == dlsb.FAILURE ? new ppo() : new ppp();
            }
        }, this.f);
    }

    @Override // defpackage.ppr
    public final void d() {
        UUID g = g();
        enrr enrrVar = (enrr) ((enrr) dlsc.a.j()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "onStopped", 206, "SyncHelper.java");
        dlsc dlscVar = this.e;
        enrrVar.D("[%s] sync stopped, workRequestId:%s", dlscVar.h, g);
        eznd ezndVar = (eznd) ezne.a.createBuilder();
        eznn eznnVar = (eznn) ezno.a.createBuilder();
        String uuid = dlscVar.h.toString();
        eznnVar.copyOnWrite();
        ezno eznoVar = (ezno) eznnVar.instance;
        uuid.getClass();
        eznoVar.b |= 1;
        eznoVar.e = uuid;
        String uuid2 = g.toString();
        eznnVar.copyOnWrite();
        ezno eznoVar2 = (ezno) eznnVar.instance;
        uuid2.getClass();
        eznoVar2.b |= 2;
        eznoVar2.f = uuid2;
        ezny eznyVar = ezny.a;
        eznnVar.copyOnWrite();
        ezno eznoVar3 = (ezno) eznnVar.instance;
        eznyVar.getClass();
        eznoVar3.d = eznyVar;
        eznoVar3.c = 7;
        ezndVar.copyOnWrite();
        ezne ezneVar = (ezne) ezndVar.instance;
        ezno eznoVar4 = (ezno) eznnVar.build();
        eznoVar4.getClass();
        ezneVar.c = eznoVar4;
        ezneVar.b = 3;
        dlscVar.i.a((ezne) ezndVar.build());
    }
}
