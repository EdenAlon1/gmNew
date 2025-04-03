package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dfld;
import defpackage.ecdj;
import defpackage.ectl;
import defpackage.ectm;
import defpackage.ectu;
import defpackage.ectw;
import defpackage.ecum;
import defpackage.emxf;
import defpackage.emyl;
import defpackage.emys;
import defpackage.enrr;
import defpackage.erhu;
import defpackage.erhv;
import defpackage.erhw;
import defpackage.erhx;
import defpackage.erhy;
import defpackage.erhz;
import defpackage.eria;
import defpackage.erny;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.erre;
import defpackage.eydl;
import defpackage.eyfw;
import defpackage.eyfy;
import defpackage.eygl;
import defpackage.eygr;
import defpackage.fgkv;
import defpackage.fgky;
import defpackage.fgkz;
import defpackage.fgla;
import defpackage.fgmx;
import defpackage.fgna;
import defpackage.fgnb;
import defpackage.fgnc;
import defpackage.fgnk;
import defpackage.fgnl;
import defpackage.fgnn;
import defpackage.fgnp;
import defpackage.fgnq;
import defpackage.fgns;
import defpackage.fgpo;
import defpackage.fgpu;
import defpackage.fgqj;
import defpackage.fgqk;
import defpackage.fgql;
import defpackage.fgqm;
import defpackage.fgqw;
import defpackage.fgqx;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ClearcutMetricSnapshotTransmitter implements ectm {
    public static final emyl a = emys.a(new emyl() { // from class: ecua
        @Override // defpackage.emyl
        public final Object get() {
            return new fgpg();
        }
    });
    public volatile dfld b;
    public volatile dfld c;
    private volatile ectu d;
    private volatile ecum e;
    private final emyl f = emys.a(new emyl() { // from class: ectz
        @Override // defpackage.emyl
        public final Object get() {
            emyl emylVar = ClearcutMetricSnapshotTransmitter.a;
            return Boolean.valueOf(ActivityManager.isUserAMonkey() ? true : Build.VERSION.SDK_INT < 29 ? ActivityManager.isRunningInTestHarness() : ActivityManager.isRunningInUserTestHarness());
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ectm
    public final ListenableFuture a(final Context context, ectl ectlVar) {
        eyfw checkIsLite;
        eyfw checkIsLite2;
        checkIsLite = eyfy.checkIsLite(ectw.b);
        ectlVar.b(checkIsLite);
        emxf.b(ectlVar.r.o(checkIsLite.d), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new ecum();
                }
            }
        }
        fgqx fgqxVar = ectlVar.c;
        if (fgqxVar == null) {
            fgqxVar = fgqx.a;
        }
        fgqw fgqwVar = (fgqw) fgqxVar.toBuilder();
        ecum.b(ecum.a, fgqwVar);
        fgla fglaVar = ((fgqx) fgqwVar.instance).k;
        if (fglaVar == null) {
            fglaVar = fgla.a;
        }
        if ((fglaVar.b & 1) != 0) {
            fgla fglaVar2 = ((fgqx) fgqwVar.instance).k;
            if (fglaVar2 == null) {
                fglaVar2 = fgla.a;
            }
            fgky fgkyVar = fglaVar2.c;
            if (fgkyVar == null) {
                fgkyVar = fgky.a;
            }
            fgkv fgkvVar = (fgkv) fgkyVar.toBuilder();
            ecum.b(ecum.b, fgkvVar);
            fgla fglaVar3 = ((fgqx) fgqwVar.instance).k;
            if (fglaVar3 == null) {
                fglaVar3 = fgla.a;
            }
            fgkz fgkzVar = (fgkz) fglaVar3.toBuilder();
            fgkzVar.copyOnWrite();
            fgla fglaVar4 = (fgla) fgkzVar.instance;
            fgky fgkyVar2 = (fgky) fgkvVar.build();
            fgkyVar2.getClass();
            fglaVar4.c = fgkyVar2;
            fglaVar4.b |= 1;
            fgqwVar.copyOnWrite();
            fgqx fgqxVar2 = (fgqx) fgqwVar.instance;
            fgla fglaVar5 = (fgla) fgkzVar.build();
            fglaVar5.getClass();
            fgqxVar2.k = fglaVar5;
            fgqxVar2.b |= 256;
        }
        fgpu fgpuVar = ((fgqx) fgqwVar.instance).i;
        if (fgpuVar == null) {
            fgpuVar = fgpu.a;
        }
        if ((fgpuVar.b & 256) != 0) {
            fgpu fgpuVar2 = ((fgqx) fgqwVar.instance).i;
            if (fgpuVar2 == null) {
                fgpuVar2 = fgpu.a;
            }
            eria eriaVar = fgpuVar2.i;
            if (eriaVar == null) {
                eriaVar = eria.a;
            }
            erhv erhvVar = (erhv) eriaVar.toBuilder();
            erhu erhuVar = ((eria) erhvVar.instance).e;
            if (erhuVar == null) {
                erhuVar = erhu.a;
            }
            erhu c = ecum.c(erhuVar);
            erhvVar.copyOnWrite();
            eria eriaVar2 = (eria) erhvVar.instance;
            c.getClass();
            eriaVar2.e = c;
            eriaVar2.b |= 1;
            List unmodifiableList = DesugarCollections.unmodifiableList(eriaVar2.f);
            erhvVar.copyOnWrite();
            ((eria) erhvVar.instance).f = eria.emptyProtobufList();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                erhu c2 = ecum.c((erhu) it.next());
                erhvVar.copyOnWrite();
                eria eriaVar3 = (eria) erhvVar.instance;
                c2.getClass();
                eriaVar3.a();
                eriaVar3.f.add(c2);
            }
            eria eriaVar4 = (eria) erhvVar.instance;
            eygr<erhz> eygrVar = (eriaVar4.c == 4 ? (erhx) eriaVar4.d : erhx.a).b;
            erhw erhwVar = (erhw) erhx.a.createBuilder();
            for (erhz erhzVar : eygrVar) {
                erhu erhuVar2 = erhzVar.c;
                if (erhuVar2 == null) {
                    erhuVar2 = erhu.a;
                }
                if ((erhuVar2.b & 2) != 0) {
                    erhy erhyVar = (erhy) erhzVar.toBuilder();
                    erhu c3 = ecum.c(erhuVar2);
                    erhyVar.copyOnWrite();
                    erhz erhzVar2 = (erhz) erhyVar.instance;
                    c3.getClass();
                    erhzVar2.c = c3;
                    erhzVar2.b |= 1;
                    erhzVar = (erhz) erhyVar.build();
                }
                erhwVar.copyOnWrite();
                erhx erhxVar = (erhx) erhwVar.instance;
                erhzVar.getClass();
                erhxVar.a();
                erhxVar.b.add(erhzVar);
            }
            erhx erhxVar2 = (erhx) erhwVar.build();
            erhvVar.copyOnWrite();
            eria eriaVar5 = (eria) erhvVar.instance;
            erhxVar2.getClass();
            eriaVar5.d = erhxVar2;
            eriaVar5.c = 4;
            fgpu fgpuVar3 = ((fgqx) fgqwVar.instance).i;
            if (fgpuVar3 == null) {
                fgpuVar3 = fgpu.a;
            }
            fgpo fgpoVar = (fgpo) fgpuVar3.toBuilder();
            eria eriaVar6 = (eria) erhvVar.build();
            fgpoVar.copyOnWrite();
            fgpu fgpuVar4 = (fgpu) fgpoVar.instance;
            eriaVar6.getClass();
            fgpuVar4.i = eriaVar6;
            fgpuVar4.b |= 256;
            fgpu fgpuVar5 = (fgpu) fgpoVar.build();
            fgqwVar.copyOnWrite();
            fgqx fgqxVar3 = (fgqx) fgqwVar.instance;
            fgpuVar5.getClass();
            fgqxVar3.i = fgpuVar5;
            fgqxVar3.b |= 64;
        }
        fgqm fgqmVar = ((fgqx) fgqwVar.instance).j;
        if (fgqmVar == null) {
            fgqmVar = fgqm.a;
        }
        if (fgqmVar.k.size() != 0) {
            fgqm fgqmVar2 = ((fgqx) fgqwVar.instance).j;
            if (fgqmVar2 == null) {
                fgqmVar2 = fgqm.a;
            }
            fgqj fgqjVar = (fgqj) fgqmVar2.toBuilder();
            for (int i = 0; i < ((fgqm) fgqjVar.instance).k.size(); i++) {
                fgqk fgqkVar = (fgqk) ((fgql) ((fgqm) fgqjVar.instance).k.get(i)).toBuilder();
                if (!((fgql) fgqkVar.instance).c.isEmpty()) {
                    fgqkVar.copyOnWrite();
                    ((fgql) fgqkVar.instance).d = fgql.emptyLongList();
                    List a2 = ecum.a(((fgql) fgqkVar.instance).c);
                    fgqkVar.copyOnWrite();
                    fgql fgqlVar = (fgql) fgqkVar.instance;
                    eygl eyglVar = fgqlVar.d;
                    if (!eyglVar.c()) {
                        fgqlVar.d = eyfy.mutableCopy(eyglVar);
                    }
                    eydl.addAll(a2, fgqlVar.d);
                }
                fgqkVar.copyOnWrite();
                fgql fgqlVar2 = (fgql) fgqkVar.instance;
                fgqlVar2.b &= -2;
                fgqlVar2.c = fgql.a.c;
                fgqjVar.copyOnWrite();
                fgqm fgqmVar3 = (fgqm) fgqjVar.instance;
                fgql fgqlVar3 = (fgql) fgqkVar.build();
                fgqlVar3.getClass();
                eygr eygrVar2 = fgqmVar3.k;
                if (!eygrVar2.c()) {
                    fgqmVar3.k = eyfy.mutableCopy(eygrVar2);
                }
                fgqmVar3.k.set(i, fgqlVar3);
            }
            fgqwVar.copyOnWrite();
            fgqx fgqxVar4 = (fgqx) fgqwVar.instance;
            fgqm fgqmVar4 = (fgqm) fgqjVar.build();
            fgqmVar4.getClass();
            fgqxVar4.j = fgqmVar4;
            fgqxVar4.b |= 128;
        }
        fgnc fgncVar = ((fgqx) fgqwVar.instance).h;
        if (fgncVar == null) {
            fgncVar = fgnc.a;
        }
        if (fgncVar.b.size() != 0) {
            fgnc fgncVar2 = ((fgqx) fgqwVar.instance).h;
            if (fgncVar2 == null) {
                fgncVar2 = fgnc.a;
            }
            fgnb fgnbVar = (fgnb) fgncVar2.toBuilder();
            for (int i2 = 0; i2 < ((fgnc) fgnbVar.instance).b.size(); i2++) {
                fgmx fgmxVar = (fgmx) ((fgna) ((fgnc) fgnbVar.instance).b.get(i2)).toBuilder();
                if (!((fgna) fgmxVar.instance).u.isEmpty()) {
                    fgmxVar.copyOnWrite();
                    ((fgna) fgmxVar.instance).v = fgna.emptyLongList();
                    List a3 = ecum.a(((fgna) fgmxVar.instance).u);
                    fgmxVar.copyOnWrite();
                    fgna fgnaVar = (fgna) fgmxVar.instance;
                    eygl eyglVar2 = fgnaVar.v;
                    if (!eyglVar2.c()) {
                        fgnaVar.v = eyfy.mutableCopy(eyglVar2);
                    }
                    eydl.addAll(a3, fgnaVar.v);
                }
                fgmxVar.copyOnWrite();
                fgna fgnaVar2 = (fgna) fgmxVar.instance;
                fgnaVar2.b &= -524289;
                fgnaVar2.u = fgna.a.u;
                fgnbVar.copyOnWrite();
                fgnc fgncVar3 = (fgnc) fgnbVar.instance;
                fgna fgnaVar3 = (fgna) fgmxVar.build();
                fgnaVar3.getClass();
                fgncVar3.a();
                fgncVar3.b.set(i2, fgnaVar3);
            }
            for (int i3 = 0; i3 < ((fgnc) fgnbVar.instance).c.size(); i3++) {
                fgnk fgnkVar = (fgnk) ((fgnl) ((fgnc) fgnbVar.instance).c.get(i3)).toBuilder();
                if (!((fgnl) fgnkVar.instance).c.isEmpty()) {
                    fgnkVar.copyOnWrite();
                    ((fgnl) fgnkVar.instance).d = fgnl.emptyLongList();
                    List a4 = ecum.a(((fgnl) fgnkVar.instance).c);
                    fgnkVar.copyOnWrite();
                    fgnl fgnlVar = (fgnl) fgnkVar.instance;
                    eygl eyglVar3 = fgnlVar.d;
                    if (!eyglVar3.c()) {
                        fgnlVar.d = eyfy.mutableCopy(eyglVar3);
                    }
                    eydl.addAll(a4, fgnlVar.d);
                }
                fgnkVar.copyOnWrite();
                fgnl fgnlVar2 = (fgnl) fgnkVar.instance;
                fgnlVar2.b &= -2;
                fgnlVar2.c = fgnl.a.c;
                fgnbVar.copyOnWrite();
                fgnc fgncVar4 = (fgnc) fgnbVar.instance;
                fgnl fgnlVar3 = (fgnl) fgnkVar.build();
                fgnlVar3.getClass();
                eygr eygrVar3 = fgncVar4.c;
                if (!eygrVar3.c()) {
                    fgncVar4.c = eyfy.mutableCopy(eygrVar3);
                }
                fgncVar4.c.set(i3, fgnlVar3);
            }
            fgqwVar.copyOnWrite();
            fgqx fgqxVar5 = (fgqx) fgqwVar.instance;
            fgnc fgncVar5 = (fgnc) fgnbVar.build();
            fgncVar5.getClass();
            fgqxVar5.h = fgncVar5;
            fgqxVar5.b |= 32;
        }
        fgnp fgnpVar = ((fgqx) fgqwVar.instance).m;
        if (fgnpVar == null) {
            fgnpVar = fgnp.a;
        }
        if (fgnpVar.e.size() != 0) {
            fgnp fgnpVar2 = ((fgqx) fgqwVar.instance).m;
            if (fgnpVar2 == null) {
                fgnpVar2 = fgnp.a;
            }
            fgnn fgnnVar = (fgnn) fgnpVar2.toBuilder();
            for (int i4 = 0; i4 < ((fgnp) fgnnVar.instance).e.size(); i4++) {
                fgnq fgnqVar = (fgnq) ((fgns) ((fgnp) fgnnVar.instance).e.get(i4)).toBuilder();
                ecum.b(ecum.c, fgnqVar);
                fgnnVar.copyOnWrite();
                fgnp fgnpVar3 = (fgnp) fgnnVar.instance;
                fgns fgnsVar = (fgns) fgnqVar.build();
                fgnsVar.getClass();
                fgnpVar3.a();
                fgnpVar3.e.set(i4, fgnsVar);
            }
            fgqwVar.copyOnWrite();
            fgqx fgqxVar6 = (fgqx) fgqwVar.instance;
            fgnp fgnpVar4 = (fgnp) fgnnVar.build();
            fgnpVar4.getClass();
            fgqxVar6.m = fgnpVar4;
            fgqxVar6.b |= 2048;
        }
        final fgqx fgqxVar7 = (fgqx) fgqwVar.build();
        if (((enrr) ecdj.a.g()).R()) {
            int i5 = fgqxVar7.b;
            String str = (16777216 & i5) == 0 ? null : "primes stats";
            int i6 = i5 & 32;
            int i7 = i5 & 16;
            int i8 = i5 & 8;
            int i9 = i5 & 256;
            int i10 = i5 & 64;
            int i11 = i5 & 1024;
            int i12 = i5 & 128;
            int i13 = i5 & 2048;
            if (i6 != 0) {
                str = "network metric";
            }
            if (i7 != 0) {
                str = "timer metric";
            }
            if (i8 != 0) {
                str = "memory metric";
            }
            if (i9 != 0) {
                str = "battery metric";
            }
            if (i10 != 0) {
                str = "crash metric";
            }
            if (i11 != 0) {
                str = "jank metric";
            }
            if (i12 != 0) {
                str = "package metric";
            }
            if (i13 != 0) {
                str = "trace";
            }
            enrr enrrVar = (enrr) ((enrr) ecdj.a.g()).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "logSystemHealthMetric", 219, "ClearcutMetricSnapshotTransmitter.java");
            if (str == null) {
                str = "unknown";
            }
            enrrVar.D("Sending Primes %s: %s", str, fgqxVar7);
        }
        if (((Boolean) this.f.get()).booleanValue()) {
            return erre.a;
        }
        checkIsLite2 = eyfy.checkIsLite(ectw.b);
        ectlVar.b(checkIsLite2);
        Object l = ectlVar.r.l(checkIsLite2.d);
        final ectw ectwVar = (ectw) (l == null ? checkIsLite2.b : checkIsLite2.c(l));
        if (((enrr) ecdj.a.g()).R()) {
            ((enrr) ((enrr) ecdj.a.g()).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "transmit", 119, "ClearcutMetricSnapshotTransmitter.java")).t("%s", Base64.encodeToString(fgqxVar7.toByteArray(), 2));
        }
        boolean z = ectwVar.i;
        boolean z2 = (fgqxVar7.b & 64) != 0;
        ectu ectuVar = this.d;
        if (ectuVar == null) {
            synchronized (this) {
                ectuVar = this.d;
                if (ectuVar == null) {
                    ectuVar = new ectu();
                    this.d = ectuVar;
                }
            }
        }
        return erny.g(ectuVar.a(context, z, true ^ z2), new eroh() { // from class: ecub
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dfld dfldVar;
                if (!((Boolean) obj).booleanValue()) {
                    return erre.a;
                }
                ectw ectwVar2 = ectwVar;
                Context context2 = context;
                ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = ClearcutMetricSnapshotTransmitter.this;
                String str2 = ectwVar2.d;
                if (ectwVar2.e) {
                    dfldVar = clearcutMetricSnapshotTransmitter.c;
                    if (dfldVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            dfldVar = clearcutMetricSnapshotTransmitter.c;
                            if (dfldVar == null) {
                                dfld k = dfld.k(context2, str2);
                                clearcutMetricSnapshotTransmitter.c = k;
                                dfldVar = k;
                            }
                        }
                    }
                } else {
                    dfldVar = clearcutMetricSnapshotTransmitter.b;
                    if (dfldVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            dfldVar = clearcutMetricSnapshotTransmitter.b;
                            if (dfldVar == null) {
                                List list = dfld.m;
                                dfld c4 = new dfla(context2, str2).c();
                                clearcutMetricSnapshotTransmitter.b = c4;
                                dfldVar = c4;
                            }
                        }
                    }
                }
                dflc i14 = dfldVar.i(fgqxVar7);
                if (fdsy.a.get().a(context2)) {
                    i14.q = dtql.b(context2, (dtpv) ClearcutMetricSnapshotTransmitter.a.get());
                }
                if (!ectwVar2.e) {
                    String str3 = ectwVar2.f;
                    if (!emxe.c(str3)) {
                        if (i14.a.e()) {
                            throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
                        }
                        faxp faxpVar = i14.b;
                        faxpVar.copyOnWrite();
                        faxq faxqVar = (faxq) faxpVar.instance;
                        faxq faxqVar2 = faxq.a;
                        str3.getClass();
                        faxqVar.b |= 16777216;
                        faxqVar.j = str3;
                    }
                    Iterator<E> it2 = ectwVar2.j.iterator();
                    while (it2.hasNext()) {
                        i14.g((String) it2.next());
                    }
                    if ((ectwVar2.c & 8) != 0) {
                        i14.h(ectwVar2.g);
                    }
                    eygi eygiVar = ectwVar2.h;
                    if (!eygiVar.isEmpty()) {
                        i14.f(ermn.l(eygiVar));
                    }
                }
                return duin.a(i14.c());
            }
        }, erpp.a);
    }
}
