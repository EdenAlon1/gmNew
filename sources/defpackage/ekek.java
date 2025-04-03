package defpackage;

import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekek {
    public final int a;
    public final errl b;
    public final dlpw c;
    public final Set d;
    public final ekcs e;
    public final ffbr f;
    public final ffbr g;
    public final ecvo h;
    public final ffbr i;
    public final ekeu j;
    public final ekeh k;
    public final String l;
    public final dtoq m;
    public final ffjm n;
    public final ffbr o;
    public final Executor p;
    public final emyl q;
    public final effy r;
    public final ffbr s;
    public final erog t;
    public final ffix u;
    public final ejlc v;
    public final String w;
    public final ffbz x;
    public final ffbz y;
    private final ffbz z;

    public ekek(int i, errl errlVar, dlpw dlpwVar, Set set, ekcs ekcsVar, ffbr ffbrVar, ffbr ffbrVar2, ecvo ecvoVar, ffbr ffbrVar3, ekeu ekeuVar, ekeh ekehVar, String str, final dtoq dtoqVar, ffjm ffjmVar, ffbr ffbrVar4, Executor executor, emyl emylVar, effy effyVar, ffbr ffbrVar5, erog erogVar, ffix ffixVar) {
        errlVar.getClass();
        dlpwVar.getClass();
        set.getClass();
        ffbrVar2.getClass();
        ecvoVar.getClass();
        ekehVar.getClass();
        str.getClass();
        this.a = i;
        this.b = errlVar;
        this.c = dlpwVar;
        this.d = set;
        this.e = ekcsVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ecvoVar;
        this.i = ffbrVar3;
        this.j = ekeuVar;
        this.k = ekehVar;
        this.l = str;
        this.m = dtoqVar;
        this.n = ffjmVar;
        this.o = ffbrVar4;
        this.p = executor;
        this.q = emylVar;
        this.r = effyVar;
        this.s = ffbrVar5;
        this.t = erogVar;
        this.u = ffixVar;
        Boolean bool = true;
        bool.getClass();
        this.v = new ejlc(new erog() { // from class: ekdn
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ekee g;
                Set keySet;
                eleg.d();
                final ekek ekekVar = ekek.this;
                try {
                    ekekVar.h.f.c();
                    int b = ekekVar.a().b(eull.TIKTOK, ekekVar.w);
                    if (b != 0) {
                        g = new ekee(null, b);
                    } else {
                        String str2 = ekekVar.a().c;
                        if (str2.length() == 0) {
                            ApplicationInfo applicationInfo = (ApplicationInfo) ekekVar.g.b();
                            if (applicationInfo == null) {
                                g = ekekVar.g(7);
                            } else {
                                str2 = ekekVar.e.a(ekekVar.l) ? applicationInfo.deviceProtectedDataDir : applicationInfo.dataDir;
                            }
                        }
                        String str3 = str2 + File.separator + ekekVar.a().b;
                        try {
                            ecxt ecxtVar = new ecxt(ekekVar.a().a, ekekVar.l, (String) ekekVar.u.invoke());
                            try {
                                Object c = ((efbm) ekekVar.f.b()).c(new Uri.Builder().scheme("file").appendEncodedPath(File.separator + str3 + File.separator + ecxtVar.a()).build(), new ekei());
                                c.getClass();
                                ecxu ecxuVar = (ecxu) c;
                                ecwp ecwpVar = (ecwp) ecwu.a.createBuilder();
                                String f = ecxuVar.f();
                                ecwpVar.copyOnWrite();
                                ecwu ecwuVar = (ecwu) ecwpVar.instance;
                                f.getClass();
                                ecwuVar.b |= 1;
                                ecwuVar.c = f;
                                ecwq ecwqVar = (ecwq) ecwt.a.createBuilder();
                                ecwqVar.copyOnWrite();
                                ecwt ecwtVar = (ecwt) ecwqVar.instance;
                                ecwtVar.c = ecws.a(5);
                                ecwtVar.b |= 1;
                                ecwpVar.copyOnWrite();
                                ecwu ecwuVar2 = (ecwu) ecwpVar.instance;
                                ecwt ecwtVar2 = (ecwt) ecwqVar.build();
                                ecwtVar2.getClass();
                                ecwuVar2.d = ecwtVar2;
                                ecwuVar2.b |= 2;
                                ekekVar.e(ecwpVar);
                                ffjm ffjmVar2 = ekekVar.n;
                                enjc enjcVar = ecxuVar.b().b;
                                enjcVar.getClass();
                                Map g2 = ecxuVar.g();
                                enhk b2 = ekekVar.b(enjcVar, (g2 == null || (keySet = g2.keySet()) == null) ? null : ffdx.ar(keySet));
                                String e = ecxuVar.e();
                                e.getClass();
                                eyee d = ecxuVar.d();
                                long epochMilli = ekekVar.c.f().toEpochMilli();
                                eyfy build = ecwpVar.build();
                                build.getClass();
                                g = new ekee((ekcv) ffjmVar2.a(b2, new ekeg(e, d, epochMilli, (ecwu) build)), 0);
                            } catch (eygu e2) {
                                Log.e("MendelPackageState", "Failed to parse snapshot from shared storage for ".concat(ekekVar.l), e2);
                                g = ekekVar.g(9);
                            } catch (FileNotFoundException unused) {
                                Log.w("MendelPackageState", "Shared storage file not found for ".concat(ekekVar.l));
                                g = new ekee(null, 8);
                            }
                        } catch (dtoy e3) {
                            Log.e("MendelPackageState", "Failed to obtain account name for " + ekekVar.l + ". Falling back on default values.", e3);
                            g = ekekVar.g(12);
                        }
                    }
                } catch (Exception e4) {
                    Log.e("MendelPackageState", "Failed to read shared file for ".concat(ekekVar.l), e4);
                    g = ekekVar.g(10);
                }
                if (g.a != null) {
                    edbm.b();
                    ekekVar.b.execute(eldl.l(new Runnable() { // from class: ekdk
                        @Override // java.lang.Runnable
                        public final void run() {
                            final ekek ekekVar2 = ekek.this;
                            try {
                                if (((emxc) ((fbbb) ekekVar2.i).a).g()) {
                                    ekekVar2.h.h.a(eull.TIKTOK, false, new edag() { // from class: ekdg
                                        @Override // defpackage.edag
                                        public final boolean a(List list) {
                                            ekek ekekVar3;
                                            list.getClass();
                                            ArrayList<String> arrayList = new ArrayList();
                                            Iterator it = list.iterator();
                                            while (true) {
                                                ekekVar3 = ekek.this;
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                Object next = it.next();
                                                ekeu ekeuVar2 = ekekVar3.j;
                                                ((String) next).getClass();
                                                ekeuVar2.a();
                                                arrayList.add(next);
                                            }
                                            if (arrayList.isEmpty()) {
                                                return false;
                                            }
                                            for (String str4 : arrayList) {
                                                ekeh ekehVar2 = ekekVar3.k;
                                                str4.getClass();
                                                if (ekehVar2.a.contains(str4)) {
                                                    return true;
                                                }
                                            }
                                            return false;
                                        }
                                    });
                                }
                            } catch (Throwable th) {
                                ((enrr) ((enrr) ((enru) ekekVar2.y.a()).i()).g(th).h("com/google/apps/tiktok/experiments/phenotype/MendelPackageState", "registerFlagUpdateListener$lambda$25", 553, "MendelPackageState.kt")).q("Failed to register flag update listener");
                            }
                        }
                    }));
                    return erqt.i(g.a);
                }
                edbm.a();
                final int i2 = g.b;
                elfl g3 = elfl.g(ekekVar.r.a());
                final ekej ekejVar = new ekej(ekekVar);
                final elfl i3 = g3.i(new eroh() { // from class: ekdy
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ffji.this.invoke(obj);
                    }
                }, erpp.a);
                return erqt.b(i3).a(eldl.m(new Callable() { // from class: ekdz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ejzx a;
                        enhk c2;
                        elfl elflVar = elfl.this;
                        ekek ekekVar2 = ekekVar;
                        try {
                            Object q = erqt.q(elflVar);
                            q.getClass();
                            a = (ejzx) q;
                        } catch (ExecutionException e5) {
                            if (!(e5.getCause() instanceof IOException) || (e5.getCause() instanceof efci)) {
                                throw e5;
                            }
                            ejzw ejzwVar = (ejzw) ejzx.a.createBuilder();
                            ejzwVar.getClass();
                            a = ejzy.a(ejzwVar);
                        }
                        int i4 = i2;
                        ecwq ecwqVar2 = (ecwq) ecwt.a.createBuilder();
                        ecwqVar2.copyOnWrite();
                        ecwt ecwtVar3 = (ecwt) ecwqVar2.instance;
                        ecwtVar3.c = ecws.a(4);
                        ecwtVar3.b |= 1;
                        if (i4 != 0) {
                            ecwqVar2.copyOnWrite();
                            ecwt ecwtVar4 = (ecwt) ecwqVar2.instance;
                            ecwtVar4.d = ecwr.a(i4);
                            ecwtVar4.b |= 2;
                        }
                        try {
                            c2 = ekekVar2.c(a);
                        } catch (eygu e6) {
                            Log.e("MendelPackageState", "Failed to parse flag", e6);
                            ejzw ejzwVar2 = (ejzw) ejzx.a.createBuilder();
                            ejzwVar2.getClass();
                            a = ejzy.a(ejzwVar2);
                            ecwqVar2.copyOnWrite();
                            ecwt ecwtVar5 = (ecwt) ecwqVar2.instance;
                            ecwtVar5.c = ecws.a(3);
                            ecwtVar5.b |= 1;
                            ecwqVar2.copyOnWrite();
                            ecwt ecwtVar6 = (ecwt) ecwqVar2.instance;
                            ecwtVar6.d = ecwr.a(13);
                            ecwtVar6.b |= 2;
                            c2 = ekekVar2.c(a);
                        } catch (RuntimeException e7) {
                            Log.e("MendelPackageState", "Failed to parse flag", e7);
                            ejzw ejzwVar3 = (ejzw) ejzx.a.createBuilder();
                            ejzwVar3.getClass();
                            a = ejzy.a(ejzwVar3);
                            ecwqVar2.copyOnWrite();
                            ecwt ecwtVar7 = (ecwt) ecwqVar2.instance;
                            ecwtVar7.c = ecws.a(3);
                            ecwtVar7.b |= 1;
                            ecwqVar2.copyOnWrite();
                            ecwt ecwtVar8 = (ecwt) ecwqVar2.instance;
                            ecwtVar8.d = ecwr.a(11);
                            ecwtVar8.b |= 2;
                            c2 = ekekVar2.c(a);
                        }
                        ecwp ecwpVar2 = (ecwp) ecwu.a.createBuilder();
                        ecwpVar2.copyOnWrite();
                        ecwu ecwuVar3 = (ecwu) ecwpVar2.instance;
                        ecwt ecwtVar9 = (ecwt) ecwqVar2.build();
                        ecwtVar9.getClass();
                        ecwuVar3.d = ecwtVar9;
                        ecwuVar3.b |= 2;
                        ekekVar2.e(ecwpVar2);
                        return (ekcv) ekekVar2.n.a(c2, ekef.a(a, ecwpVar2, ekekVar2.a()));
                    }
                }), erpp.a);
            }
        }, new Executor() { // from class: ekdo
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                dtoq.this.d(runnable);
            }
        });
        String b = ecvd.b(str);
        b.getClass();
        this.w = b;
        this.x = ffca.a(new ffix() { // from class: ekdp
            @Override // defpackage.ffix
            public final Object invoke() {
                ekek ekekVar = ekek.this;
                return Boolean.valueOf(ekekVar.d.contains(ekekVar.w));
            }
        });
        this.z = ffca.a(new ffix() { // from class: ekdq
            @Override // defpackage.ffix
            public final Object invoke() {
                ekek ekekVar = ekek.this;
                return ekekVar.h.f.a(ekekVar.e.a(ekekVar.l));
            }
        });
        this.y = ffca.a(new ffix() { // from class: ekdr
            @Override // defpackage.ffix
            public final Object invoke() {
                return enru.c("com/google/apps/tiktok/experiments/phenotype/MendelPackageState");
            }
        });
    }

    public final edbo a() {
        Object a = this.z.a();
        a.getClass();
        return (edbo) a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.enhk b(defpackage.enjc r13, java.util.Set r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekek.b(enjc, java.util.Set):enhk");
    }

    public final enhk c(ejzx ejzxVar) {
        ekah c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object b = this.o.b();
        b.getClass();
        ekai ekaiVar = (ekai) b;
        for (final ekab ekabVar : ejzxVar.f) {
            final ekah a = ekaiVar.a(ekabVar.e);
            if (a != null) {
                int i = ekabVar.c;
                if (ekaa.b(i) != a.b) {
                    throw new IllegalStateException("Attempting to set a " + a + " type flag with a " + ((Object) ekaa.a(ekaa.b(i))) + " value");
                }
                String str = ekabVar.e;
                ekabVar.getClass();
                int b2 = ekaa.b(i);
                if (b2 == 0) {
                    throw null;
                }
                switch (b2 - 1) {
                    case 0:
                        c = ekag.c(i == 1 ? ((Long) ekabVar.d).longValue() : 0L);
                        break;
                    case 1:
                        c = ekag.a(i == 2 ? ((Boolean) ekabVar.d).booleanValue() : false);
                        break;
                    case 2:
                        c = ekag.b(i == 3 ? ((Double) ekabVar.d).doubleValue() : eobe.a);
                        break;
                    case 3:
                        String str2 = i == 4 ? (String) ekabVar.d : "";
                        str2.getClass();
                        c = ekag.e(str2);
                        break;
                    case 4:
                        c = new ekah(new ffix() { // from class: ekea
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                ekab ekabVar2 = ekab.this;
                                eyee eyeeVar = ekabVar2.c == 5 ? (eyee) ekabVar2.d : eyee.b;
                                eyeeVar.getClass();
                                return eyeeVar;
                            }
                        }, 5);
                        break;
                    case 5:
                        ffix ffixVar = new ffix() { // from class: ekeb
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                ekah ekahVar = ekah.this;
                                ekab ekabVar2 = ekabVar;
                                try {
                                    eyhs eyhsVar = ekahVar.a;
                                    eyhsVar.getClass();
                                    eyhs build = eyhsVar.newBuilderForType().mergeFrom(ekabVar2.c == 6 ? (eyee) ekabVar2.d : eyee.b).build();
                                    build.getClass();
                                    return build;
                                } catch (eygu e) {
                                    Log.e("MendelPackageState", "Failed to parse flag", e);
                                    return ekahVar.c();
                                } catch (RuntimeException e2) {
                                    Log.e("MendelPackageState", "Failed to parse flag", e2);
                                    return ekahVar.c();
                                }
                            }
                        };
                        eyhs eyhsVar = a.a;
                        eyhsVar.getClass();
                        c = ekag.d(ffixVar, eyhsVar);
                        break;
                    case 6:
                        throw new IllegalStateException("No known flag type");
                    default:
                        throw new ffcd();
                }
                linkedHashMap.put(str, c);
            }
        }
        enqu listIterator = ekaiVar.b().listIterator();
        listIterator.getClass();
        while (listIterator.hasNext()) {
            String str3 = (String) listIterator.next();
            if (!linkedHashMap.containsKey(str3)) {
                ekah a2 = ekaiVar.a(str3);
                a2.getClass();
                linkedHashMap.put(str3, a2);
            }
        }
        return engq.e(linkedHashMap);
    }

    public final ListenableFuture d() {
        return this.v.e() ? this.v.c() : this.m.a(this.b, new erog() { // from class: ekdm
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ekek.this.v.c();
            }
        });
    }

    public final void e(ecwp ecwpVar) {
        if (a().d) {
            String str = this.l;
            ecwpVar.copyOnWrite();
            ecwu ecwuVar = (ecwu) ecwpVar.instance;
            ecwu ecwuVar2 = ecwu.a;
            ecwuVar.b |= 4;
            ecwuVar.e = str;
        }
    }

    public final boolean f() {
        try {
            if (this.v.e()) {
                return ((ekcv) erqt.q(this.v.c())).d();
            }
            return false;
        } catch (ExecutionException unused) {
            return false;
        }
    }

    public final ekee g(int i) {
        ecwp ecwpVar = (ecwp) ecwu.a.createBuilder();
        ecwq ecwqVar = (ecwq) ecwt.a.createBuilder();
        ecwqVar.copyOnWrite();
        ecwt ecwtVar = (ecwt) ecwqVar.instance;
        ecwtVar.c = ecws.a(3);
        ecwtVar.b |= 1;
        ecwqVar.copyOnWrite();
        ecwt ecwtVar2 = (ecwt) ecwqVar.instance;
        ecwtVar2.d = ecwr.a(i);
        ecwtVar2.b |= 2;
        ecwpVar.copyOnWrite();
        ecwu ecwuVar = (ecwu) ecwpVar.instance;
        ecwt ecwtVar3 = (ecwt) ecwqVar.build();
        ecwtVar3.getClass();
        ecwuVar.d = ecwtVar3;
        ecwuVar.b |= 2;
        e(ecwpVar);
        enpe enpeVar = enpe.c;
        enpeVar.getClass();
        enhk b = b(enpeVar, ffen.a);
        eyee eyeeVar = eyee.b;
        long epochMilli = this.c.f().toEpochMilli();
        eyfy build = ecwpVar.build();
        build.getClass();
        return new ekee((ekcv) this.n.a(b, new ekeg("", eyeeVar, epochMilli, (ecwu) build)), i);
    }
}
