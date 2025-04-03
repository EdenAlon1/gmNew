package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfs implements fbba {
    public static ekhx a(final ecxc ecxcVar, final ekfg ekfgVar, final edyp edypVar, emxc emxcVar) {
        ecxcVar.getClass();
        return new ekhx() { // from class: ekfo
            @Override // defpackage.ekhx
            public final ListenableFuture a() {
                final ekfg ekfgVar2 = ekfgVar;
                if (!ekfq.a(edyp.this)) {
                    return erre.a;
                }
                final ekfp ekfpVar = new ekfp(ecxcVar);
                ekzz g = eleg.g("Registering packages with phenotype", elad.a);
                try {
                    enip keySet = ((enhk) ekfgVar2.f).keySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : keySet) {
                        Boolean bool = true;
                        bool.getClass();
                        arrayList.add(obj);
                    }
                    ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        final String a = ekfgVar2.m.a((String) it.next());
                        final ekfk ekfkVar = ekfgVar2.l;
                        ListenableFuture submit = ekfkVar.c.submit(eldl.m(new Callable() { // from class: ekfh
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ServiceInfo serviceInfo;
                                enhk b;
                                ekfk ekfkVar2 = ekfk.this;
                                final edcq edcqVar = new edcq(ekfkVar2.b);
                                Map map = edcqVar.b;
                                final String packageName = ekfkVar2.a.getPackageName();
                                edcp edcpVar = (edcp) map.get(packageName);
                                if (edcpVar == null) {
                                    edcpVar = new edcp(edcqVar, packageName, new edcl(new emyl() { // from class: edck
                                        @Override // defpackage.emyl
                                        public final Object get() {
                                            edcq edcqVar2 = edcq.this;
                                            String str = packageName;
                                            try {
                                                return Integer.valueOf(edcqVar2.a.getPackageInfo(str, 0).versionCode);
                                            } catch (PackageManager.NameNotFoundException unused) {
                                                Log.w("PhenotypeResourceReader", "Failed to find version of package ".concat(String.valueOf(str)));
                                                return null;
                                            }
                                        }
                                    }));
                                    edcqVar.b.put(packageName, edcpVar);
                                }
                                int i = engw.d;
                                engr engrVar = new engr();
                                Intent intent = new Intent("com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService");
                                String str = edcpVar.a;
                                loop0: while (true) {
                                    serviceInfo = null;
                                    for (ResolveInfo resolveInfo : edcpVar.e.a.queryIntentServices(intent.setPackage(str), 787072)) {
                                        if (serviceInfo == null) {
                                            if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.metaData != null && "com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService".equals(resolveInfo.serviceInfo.name)) {
                                                serviceInfo = resolveInfo.serviceInfo;
                                            }
                                        }
                                    }
                                    break loop0;
                                }
                                if (serviceInfo == null) {
                                    Log.i("PhenotypeResourceReader", "unable to find any Phenotype resource metadata for ".concat(String.valueOf(str)));
                                    b = enoz.a;
                                } else {
                                    cmh cmhVar = new cmh();
                                    cmh cmhVar2 = new cmh();
                                    Bundle bundle = serviceInfo.metaData;
                                    for (String str2 : bundle.keySet()) {
                                        boolean startsWith = str2.startsWith("com.google.android.gms.phenotype.registration.binarypb:");
                                        boolean startsWith2 = str2.startsWith("com.google.android.gms.phenotype.heterodyne_info.binarypb:");
                                        if (startsWith || startsWith2) {
                                            int i2 = bundle.getInt(str2, 0);
                                            if (i2 != 0) {
                                                String str3 = (String) enjk.h(emye.b(':').g(str2), 1);
                                                if (startsWith) {
                                                    cmhVar.put(str3, Integer.valueOf(i2));
                                                } else {
                                                    cmhVar2.put(str3, Integer.valueOf(i2));
                                                }
                                            }
                                        }
                                    }
                                    enhd h = enhk.h(cmhVar.d);
                                    for (Map.Entry entry : cmhVar.entrySet()) {
                                        String str4 = (String) entry.getKey();
                                        h.k(str4, new edco(edcpVar, str4, ((Integer) entry.getValue()).intValue(), ((Integer) cmhVar2.getOrDefault(str4, 0)).intValue()));
                                    }
                                    b = h.b();
                                }
                                enqu listIterator = b.values().listIterator();
                                while (listIterator.hasNext()) {
                                    eulq eulqVar = (eulq) ((edco) listIterator.next()).b.get();
                                    if (eulqVar != null) {
                                        engrVar.h(eulqVar);
                                    }
                                }
                                String str5 = a;
                                engw g2 = engrVar.g();
                                final ffji ffjiVar = new ffji() { // from class: ekfi
                                    @Override // defpackage.ffji
                                    public final Object invoke(Object obj2) {
                                        eulq eulqVar2 = (eulq) obj2;
                                        eulqVar2.getClass();
                                        return eulqVar2.g;
                                    }
                                };
                                return (eulq) ennc.d(g2, new emwl() { // from class: ekfj
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        return ffji.this.invoke(obj2);
                                    }
                                }).get(str5);
                            }
                        }));
                        submit.getClass();
                        final ffji ffjiVar = new ffji() { // from class: ekew
                            /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
                            
                                if (((defpackage.ecxc) r4.a.b()).i() != false) goto L17;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
                            /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
                            /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
                            @Override // defpackage.ffji
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r10) {
                                /*
                                    r9 = this;
                                    ekfg r4 = defpackage.ekfg.this
                                    r5 = r10
                                    eulq r5 = (defpackage.eulq) r5
                                    fazb r10 = r4.g
                                    java.lang.Object r10 = r10.b()
                                    java.util.Map r10 = (java.util.Map) r10
                                    java.lang.String r2 = r2
                                    java.lang.Object r10 = r10.get(r2)
                                    erog r10 = (defpackage.erog) r10
                                    fazb r0 = r4.h
                                    java.lang.Object r0 = r0.b()
                                    java.util.Map r0 = (java.util.Map) r0
                                    boolean r0 = r0.containsKey(r2)
                                    fazb r1 = r4.i
                                    java.lang.Object r1 = r1.b()
                                    java.util.Map r1 = (java.util.Map) r1
                                    boolean r1 = r1.containsKey(r2)
                                    r6 = 0
                                    r7 = 1
                                    if (r10 != 0) goto L38
                                    if (r0 != 0) goto L38
                                    if (r1 == 0) goto L36
                                    goto L38
                                L36:
                                    r0 = r6
                                    goto L39
                                L38:
                                    r0 = r7
                                L39:
                                    r1 = 0
                                    if (r5 == 0) goto L6b
                                    if (r0 != 0) goto L6b
                                    ffbr r0 = r4.a     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4d
                                    java.lang.Object r0 = r0.b()     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4d
                                    ecxc r0 = (defpackage.ecxc) r0     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4d
                                    boolean r0 = r0.i()     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4d
                                    if (r0 == 0) goto L6b
                                    goto L55
                                L4d:
                                    r0 = move-exception
                                    java.lang.String r3 = "MendelPackageState"
                                    java.lang.String r8 = "Failed to check if declarative registration is supported"
                                    android.util.Log.e(r3, r8, r0)
                                L55:
                                    eygr r0 = r5.i
                                    r0.getClass()
                                    java.util.Set r3 = r4.e
                                    enip r0 = defpackage.engq.f(r0)
                                    boolean r0 = r0.containsAll(r3)
                                    if (r0 == 0) goto L6b
                                    com.google.common.util.concurrent.ListenableFuture r10 = defpackage.erqt.i(r1)
                                    goto Ld1
                                L6b:
                                    r8 = 2
                                    if (r5 == 0) goto L7d
                                    int r0 = r5.c
                                    if (r0 != r8) goto L7b
                                    java.lang.Object r0 = r5.d
                                    java.lang.Integer r0 = (java.lang.Integer) r0
                                    int r0 = r0.intValue()
                                    goto L7f
                                L7b:
                                    r3 = r6
                                    goto L80
                                L7d:
                                    int r0 = r4.d
                                L7f:
                                    r3 = r0
                                L80:
                                    if (r10 == 0) goto L89
                                    java.util.concurrent.Executor r0 = r4.b
                                    com.google.common.util.concurrent.ListenableFuture r10 = defpackage.elfr.i(r10, r0)
                                    goto L97
                                L89:
                                    if (r5 == 0) goto L93
                                    eyee r10 = r5.j
                                    if (r10 == 0) goto L93
                                    byte[] r1 = r10.I()
                                L93:
                                    com.google.common.util.concurrent.ListenableFuture r10 = defpackage.erqt.i(r1)
                                L97:
                                    ffjo r1 = r3
                                    ekfe r0 = new ekfe
                                    r0.<init>(r1, r2, r3, r4, r5)
                                    ekev r1 = new ekev
                                    r1.<init>()
                                    java.util.concurrent.Executor r0 = r4.b
                                    com.google.common.util.concurrent.ListenableFuture r10 = defpackage.elfr.k(r10, r1, r0)
                                    com.google.common.util.concurrent.ListenableFuture[] r0 = new com.google.common.util.concurrent.ListenableFuture[r7]
                                    r0[r6] = r10
                                    elfq r0 = defpackage.elfr.b(r0)
                                    ekez r1 = new ekez
                                    r1.<init>()
                                    erpp r2 = defpackage.erpp.a
                                    com.google.common.util.concurrent.ListenableFuture r0 = r0.b(r1, r2)
                                    com.google.common.util.concurrent.ListenableFuture[] r1 = new com.google.common.util.concurrent.ListenableFuture[r8]
                                    r1[r6] = r10
                                    r1[r7] = r0
                                    elfq r0 = defpackage.elfr.d(r1)
                                    ekfa r1 = new ekfa
                                    r1.<init>()
                                    erpp r10 = defpackage.erpp.a
                                    com.google.common.util.concurrent.ListenableFuture r10 = r0.a(r1, r10)
                                Ld1:
                                    return r10
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.ekew.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        ListenableFuture k = elfr.k(submit, new eroh() { // from class: ekex
                            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return ffji.this.invoke(obj2);
                            }
                        }, ekfgVar2.b);
                        final ffji ffjiVar2 = new ffji() { // from class: ekey
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                return ((ekav) ekfg.this.c.b()).c(a);
                            }
                        };
                        ListenableFuture k2 = elfr.k(k, new eroh() { // from class: ekff
                            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                            @Override // defpackage.eroh
                            public final /* synthetic */ ListenableFuture a(Object obj2) {
                                return ffji.this.invoke(obj2);
                            }
                        }, erpp.a);
                        ejjz.c(k2, "Failed to register for %s", a);
                        arrayList2.add(k2);
                    }
                    ListenableFuture b = elfr.a(arrayList2).b(new erog() { // from class: ekfd
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            ListenableFuture b2 = ekfg.this.k.f.b();
                            final ffji ffjiVar3 = new ffji() { // from class: ekfb
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj2) {
                                    dfrq dfrqVar = (dfrq) obj2;
                                    dfrqVar.getClass();
                                    return Integer.valueOf(Log.w("RegisterInternal", "GMS Core version too old", dfrqVar));
                                }
                            };
                            ListenableFuture e = elfr.e(b2, dfrq.class, new emwl() { // from class: ekfc
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return ffji.this.invoke(obj2);
                                }
                            }, erpp.a);
                            ejjz.c(e, "Failed to update StorageInfos after registration", new Object[0]);
                            return e;
                        }
                    }, erpp.a);
                    g.b(b);
                    ffig.a(g, null);
                    return b;
                } finally {
                }
            }
        };
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
