package com.google.android.libraries.geller.portable;

import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dugd;
import defpackage.dugp;
import defpackage.dugq;
import defpackage.dugr;
import defpackage.dugu;
import defpackage.dugv;
import defpackage.duhb;
import defpackage.eldl;
import defpackage.elfl;
import defpackage.elfr;
import defpackage.emtt;
import defpackage.emux;
import defpackage.emwl;
import defpackage.emxc;
import defpackage.emxf;
import defpackage.emyg;
import defpackage.engw;
import defpackage.enhd;
import defpackage.enhk;
import defpackage.enip;
import defpackage.enqv;
import defpackage.enrr;
import defpackage.enru;
import defpackage.eroh;
import defpackage.erqt;
import defpackage.ersb;
import defpackage.eydi;
import defpackage.eyfy;
import defpackage.eygk;
import defpackage.eygl;
import defpackage.eygr;
import defpackage.eynb;
import defpackage.eync;
import defpackage.eynl;
import defpackage.eynm;
import defpackage.eynn;
import defpackage.eyns;
import defpackage.eynt;
import defpackage.eynu;
import defpackage.eynv;
import defpackage.eynw;
import defpackage.eynx;
import defpackage.eyny;
import defpackage.eyod;
import defpackage.eyom;
import defpackage.eyoq;
import defpackage.eyoy;
import defpackage.eypa;
import defpackage.ezib;
import defpackage.ezic;
import defpackage.ezvl;
import defpackage.ezvp;
import defpackage.ezvx;
import defpackage.ezwl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Geller {
    public static final enru a = enru.c("com/google/android/libraries/geller/portable/Geller");
    public final Executor b;
    public final dugr c;
    public final GellerStorageOperationsCallback d;
    public final eyom e;
    private final Executor f;
    private final Executor g;
    private volatile long h;
    private final Map i;
    private final GellerLoggingCallback j;
    private final enhk k;

    public Geller(dugq dugqVar) {
        this.c = new GellerDatabaseManagerImpl(dugqVar.a, dugqVar.m, dugqVar.f, dugqVar.i, dugqVar.j, dugqVar.k, dugqVar.l);
        this.i = dugqVar.g.c();
        GellerLoggingCallback gellerLoggingCallback = dugqVar.h;
        this.j = gellerLoggingCallback;
        this.f = dugqVar.b;
        this.g = dugqVar.c;
        this.b = new ersb(dugqVar.d);
        dugu duguVar = new dugu(this, dugqVar.d);
        this.d = duguVar;
        this.h = nativeCreate(duguVar, new GellerStorageChangeListenerHandler(enip.o(dugqVar.e)), gellerLoggingCallback, dugqVar.m.toByteArray());
        this.e = dugqVar.m;
        Map map = dugqVar.j;
        Map map2 = dugqVar.l;
        enhd enhdVar = new enhd();
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Map) entry.getValue()).values().iterator().hasNext()) {
                    enhdVar.k((ezib) entry.getKey(), ((duhb) ((Map) entry.getValue()).values().iterator().next()).c());
                }
            }
        }
        if (!map2.isEmpty()) {
            for (Map.Entry entry2 : map2.entrySet()) {
                enhdVar.k((ezib) entry2.getKey(), ((duhb) entry2.getValue()).c());
            }
        }
        this.k = enhdVar.c();
    }

    private native long nativeCreate(GellerStorageOperationsCallback gellerStorageOperationsCallback, GellerStorageChangeListenerHandler gellerStorageChangeListenerHandler, GellerLoggingCallback gellerLoggingCallback, byte[] bArr);

    public final long a() {
        long j = this.h;
        if (this.e.m && j == 0) {
            throw new IllegalStateException("Native Geller read after free");
        }
        return j;
    }

    public final long b(String str, ezib ezibVar, eyoq eyoqVar) {
        GellerDatabase b = this.c.b(str);
        if (b != null) {
            return b.a(ezibVar.name(), eyoqVar);
        }
        ((enrr) ((enrr) a.j()).h("com/google/android/libraries/geller/portable/Geller", "markSyncStatus", 1375, "Geller.java")).t("The GellerDatabase is null, skipping marking status for corpus %s", ezibVar.name());
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListenableFuture c(final String str, final ezib ezibVar, List list) {
        eync eyncVar;
        eynw eynwVar;
        eynl eynlVar = (eynl) eyns.a.createBuilder();
        if (list.isEmpty()) {
            eynlVar.copyOnWrite();
            eyns.a((eyns) eynlVar.instance);
        } else {
            eynm eynmVar = (eynm) eynn.a.createBuilder();
            enqv it = ((engw) list).iterator();
            while (it.hasNext()) {
                dugd dugdVar = (dugd) it.next();
                eynb eynbVar = (eynb) eync.a.createBuilder();
                String b = dugdVar.b();
                eynbVar.copyOnWrite();
                eync eyncVar2 = (eync) eynbVar.instance;
                eyncVar2.b |= 2;
                eyncVar2.d = b;
                if (dugdVar.a().g()) {
                    long longValue = ((Long) dugdVar.a().c()).longValue();
                    eynbVar.copyOnWrite();
                    eync eyncVar3 = (eync) eynbVar.instance;
                    eyncVar3.b |= 1;
                    eyncVar3.c = longValue;
                    eyncVar = (eync) eynbVar.build();
                } else {
                    eyncVar = (eync) eynbVar.build();
                }
                eynmVar.copyOnWrite();
                eynn eynnVar = (eynn) eynmVar.instance;
                eyncVar.getClass();
                eygr eygrVar = eynnVar.b;
                if (!eygrVar.c()) {
                    eynnVar.b = eyfy.mutableCopy(eygrVar);
                }
                eynnVar.b.add(eyncVar);
            }
            eynlVar.copyOnWrite();
            eyns eynsVar = (eyns) eynlVar.instance;
            eynn eynnVar2 = (eynn) eynmVar.build();
            eynnVar2.getClass();
            eynsVar.d = eynnVar2;
            eynsVar.c = 1;
        }
        final eyns eynsVar2 = (eyns) eynlVar.build();
        emxf.m(true, "delete() not allowed if Geller is read-only");
        emxf.m(true, "delete() not allowed if a blocking executor is not specified");
        emyg.c(emtt.a);
        final emyg emygVar = new emyg(emtt.a);
        elfl h = elfl.g(elfr.h(new Callable() { // from class: dugl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Geller geller = Geller.this;
                dugr dugrVar = geller.c;
                String str2 = str;
                if (dugrVar.b(str2) == null) {
                    throw new GellerException("Geller instance is null.");
                }
                eyns eynsVar3 = eynsVar2;
                ezib ezibVar2 = ezibVar;
                emyg emygVar2 = emygVar;
                emygVar2.f();
                long nativeDelete = geller.nativeDelete(geller.a(), geller.c.a(str2), ezibVar2.name(), eynsVar3.toByteArray());
                emygVar2.g();
                return Long.valueOf(nativeDelete);
            }
        }, this.b)).f(GellerException.class, new eroh() { // from class: dugm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return erqt.h((GellerException) obj);
            }
        }, this.b).h(new emwl() { // from class: dugn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (Long) obj;
            }
        }, this.b);
        if (!this.e.c) {
            eynu eynuVar = (eynu) eynx.a.createBuilder();
            eynuVar.copyOnWrite();
            eynx eynxVar = (eynx) eynuVar.instance;
            eynxVar.c = ezibVar.dA;
            eynxVar.b |= 1;
            enqv it2 = ((engw) list).iterator();
            while (it2.hasNext()) {
                dugd dugdVar2 = (dugd) it2.next();
                eynv eynvVar = (eynv) eynw.a.createBuilder();
                String b2 = dugdVar2.b();
                eynvVar.copyOnWrite();
                eynw eynwVar2 = (eynw) eynvVar.instance;
                eynwVar2.b |= 2;
                eynwVar2.d = b2;
                if (dugdVar2.a().g()) {
                    long longValue2 = ((Long) dugdVar2.a().c()).longValue();
                    eynvVar.copyOnWrite();
                    eynw eynwVar3 = (eynw) eynvVar.instance;
                    eynwVar3.b |= 1;
                    eynwVar3.c = longValue2;
                    eynwVar = (eynw) eynvVar.build();
                } else {
                    eynwVar = (eynw) eynvVar.build();
                }
                eynuVar.copyOnWrite();
                eynx eynxVar2 = (eynx) eynuVar.instance;
                eynwVar.getClass();
                eygr eygrVar2 = eynxVar2.d;
                if (!eygrVar2.c()) {
                    eynxVar2.d = eyfy.mutableCopy(eygrVar2);
                }
                eynxVar2.d.add(eynwVar);
            }
            eynt eyntVar = (eynt) eyny.a.createBuilder();
            eyntVar.copyOnWrite();
            eyny eynyVar = (eyny) eyntVar.instance;
            eynx eynxVar3 = (eynx) eynuVar.build();
            eynxVar3.getClass();
            eygr eygrVar3 = eynyVar.b;
            if (!eygrVar3.c()) {
                eynyVar.b = eyfy.mutableCopy(eygrVar3);
            }
            eynyVar.b.add(eynxVar3);
            erqt.r(h, eldl.i(new dugp(this, str, (eyny) eyntVar.build())), this.g);
        }
        return h;
    }

    public final ListenableFuture d(final String str, final ezib ezibVar, final eyoy eyoyVar, final ezwl ezwlVar, final ezvp ezvpVar) {
        final emyg c = emyg.c(emtt.a);
        emxc j = this.k.containsKey(ezibVar) ? emxc.j((ezic) this.k.get(ezibVar)) : emux.a;
        boolean z = false;
        if (j.g()) {
            if (((ezic) j.c()).equals(ezic.CUSTOM_STORAGE_TYPE_PROTODATASTORE)) {
                z = true;
            }
        }
        Boolean.valueOf(z).getClass();
        ListenableFuture h = z ? elfr.h(new Callable() { // from class: dugh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Geller.this.e(str, ezibVar, eyoyVar, ezwlVar, ezvpVar);
            }
        }, this.b) : elfr.h(new Callable() { // from class: dugi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Geller.this.e(str, ezibVar, eyoyVar, ezwlVar, ezvpVar);
            }
        }, this.g);
        ezvl ezvlVar = ezvpVar.c;
        if (ezvlVar == null) {
            ezvlVar = ezvl.a;
        }
        if (!ezvlVar.f) {
            eyod eyodVar = this.e.g;
            if (eyodVar == null) {
                eyodVar = eyod.d;
            }
            if (new eygk(eyodVar.g, eyod.c).contains(ezibVar) || new eygk(eyodVar.f, eyod.b).contains(ezibVar) || new eygk(eyodVar.e, eyod.a).contains(ezibVar)) {
                h = elfl.g(h).i(new eroh() { // from class: dugj
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        ((enrr) ((enrr) Geller.a.j()).h("com/google/android/libraries/geller/portable/Geller", "maybeApplyDmaFiltering", 2011, "Geller.java")).t("Policy evaluator absent when evaluating %s", ezib.this.name());
                        return erqt.i((eypa) obj);
                    }
                }, this.f);
            }
        }
        return elfl.g(h).f(GellerException.class, new eroh() { // from class: dugf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Geller.this.f(ezibVar);
                c.a(TimeUnit.MILLISECONDS);
                return erqt.h((GellerException) obj);
            }
        }, this.g).h(new emwl() { // from class: dugg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eypa eypaVar = (eypa) obj;
                Geller.this.f(ezibVar);
                c.a(TimeUnit.MILLISECONDS);
                return eypaVar;
            }
        }, this.g);
    }

    public final eypa e(String str, ezib ezibVar, eyoy eyoyVar, ezwl ezwlVar, ezvp ezvpVar) {
        GellerException gellerException;
        emyg c = emyg.c(emtt.a);
        g(ezibVar, ezvpVar);
        eypa eypaVar = eypa.a;
        try {
            try {
                byte[] nativeReadElements = nativeReadElements(a(), this.c.a(str), ezibVar.name(), eyoyVar.toByteArray(), ezwlVar.toByteArray());
                int length = nativeReadElements.length;
                if (length > 5000000) {
                    try {
                        throw new GellerException(String.format("Result of read exceeded maximum read result size.  The size of the result was: %s, and the maximum size is: %s.", Integer.valueOf(length), 5000000L));
                    } catch (GellerException e) {
                        e = e;
                        gellerException = e;
                        ((enrr) ((enrr) ((enrr) a.i()).g(gellerException)).h("com/google/android/libraries/geller/portable/Geller", "readElementInternal", (char) 2125, "Geller.java")).q("Geller read failed.");
                        f(ezibVar);
                        eypaVar.getSerializedSize();
                        c.a(TimeUnit.MILLISECONDS);
                        return eypaVar;
                    }
                }
                eypa eypaVar2 = (eypa) dugv.a(nativeReadElements, eypa.a);
                try {
                    f(ezibVar);
                    eypaVar2.getSerializedSize();
                    c.a(TimeUnit.MILLISECONDS);
                    return eypaVar2;
                } catch (GellerException e2) {
                    gellerException = e2;
                    eypaVar = eypaVar2;
                    ((enrr) ((enrr) ((enrr) a.i()).g(gellerException)).h("com/google/android/libraries/geller/portable/Geller", "readElementInternal", (char) 2125, "Geller.java")).q("Geller read failed.");
                    f(ezibVar);
                    eypaVar.getSerializedSize();
                    c.a(TimeUnit.MILLISECONDS);
                    return eypaVar;
                }
            } catch (GellerException e3) {
                e = e3;
            }
        } catch (GellerException e4) {
            e = e4;
        }
    }

    public final void f(ezib ezibVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(ezib ezibVar, ezvp ezvpVar) {
        ezvl ezvlVar = ezvpVar.c;
        if (ezvlVar == null) {
            ezvlVar = ezvl.a;
        }
        if (ezvlVar.c != 1) {
            ezvl ezvlVar2 = ezvpVar.c;
            if (ezvlVar2 == null) {
                ezvlVar2 = ezvl.a;
            }
            if (ezvlVar2.c != 2) {
                f(ezibVar);
                return;
            }
            f(ezibVar);
            ezvl ezvlVar3 = ezvpVar.c;
            if (ezvlVar3 == null) {
                ezvlVar3 = ezvl.a;
            }
            if (ezvlVar3.e == null) {
                eydi eydiVar = eydi.a;
                return;
            }
            return;
        }
        ezvl ezvlVar4 = ezvpVar.c;
        if (ezvlVar4 == null) {
            ezvlVar4 = ezvl.a;
        }
        eygl eyglVar = (ezvlVar4.c == 1 ? (ezvx) ezvlVar4.d : ezvx.a).b;
        if (eyglVar.size() > 1) {
            Iterator<E> it = eyglVar.iterator();
            while (it.hasNext()) {
                ((Long) it.next()).longValue();
                f(ezibVar);
            }
            return;
        }
        if (eyglVar.size() != 1) {
            f(ezibVar);
        } else {
            f(ezibVar);
            ((Long) eyglVar.get(0)).intValue();
        }
    }

    public native long nativeDelete(long j, long j2, String str, byte[] bArr);

    public native void nativePropagateDeletion(long j, long j2, byte[] bArr);

    public native byte[] nativeReadElements(long j, long j2, String str, byte[] bArr, byte[] bArr2);

    public native String[] nativeReadMetadata(long j, long j2, String str, String str2);

    public native byte[] nativeReadMetadataForAllCorpora(long j, long j2, String str);

    public native byte[] nativeReadSnapshot(long j, long j2, String[] strArr, int i, boolean z);

    public native String[] nativeUpdate(long j, long j2, byte[] bArr);

    public native boolean nativeUpdateMetadata(long j, long j2, byte[] bArr, boolean z);
}
