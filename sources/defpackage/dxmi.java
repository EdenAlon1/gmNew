package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxmi {
    public static volatile boolean a = false;
    public final Context b;
    public final dxsy c;
    public final dxig d;
    public final dxih e;
    public final dxpn f;
    public final dxpq g;
    public final dxcu h;
    public final dwxf i;
    public final dxuw j;
    public final dxtd k;
    public final dxtx l;
    public final emxc m;
    public final Executor n;
    public final emxc o;
    public final dwqy p;
    public final dxti q;

    public dxmi(Context context, dxsy dxsyVar, dxpn dxpnVar, dxpq dxpqVar, dxig dxigVar, dxih dxihVar, dxcu dxcuVar, dwxf dwxfVar, dxuw dxuwVar, dxtd dxtdVar, dxtx dxtxVar, emxc emxcVar, Executor executor, emxc emxcVar2, dwqy dwqyVar, dxti dxtiVar) {
        this.b = context;
        this.c = dxsyVar;
        this.f = dxpnVar;
        this.g = dxpqVar;
        this.d = dxigVar;
        this.e = dxihVar;
        this.h = dxcuVar;
        this.i = dwxfVar;
        this.j = dxuwVar;
        this.k = dxtdVar;
        this.l = dxtxVar;
        this.m = emxcVar;
        this.n = executor;
        this.o = emxcVar2;
        this.p = dwqyVar;
        this.q = dxtiVar;
    }

    public static engw a(List list) {
        String a2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int a3 = dwsh.a(((dwsi) it.next()).f);
            if (a3 != 0 && a3 == 2) {
                engr d = engw.d(list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    dwsi dwsiVar = (dwsi) it2.next();
                    int a4 = dwsh.a(dwsiVar.f);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    if (a4 - 1 != 0) {
                        dwsf dwsfVar = (dwsf) dwsiVar.toBuilder();
                        String str = dwsiVar.d;
                        MessageDigest e = dxsf.e();
                        if (e == null) {
                            a2 = "";
                        } else {
                            byte[] bytes = str.getBytes();
                            e.update(bytes, 0, bytes.length);
                            a2 = dxsf.a(e.digest());
                        }
                        if (dxvk.g(dwsiVar)) {
                            dwsfVar.copyOnWrite();
                            dwsi dwsiVar2 = (dwsi) dwsfVar.instance;
                            dwsiVar2.b |= 64;
                            dwsiVar2.i = a2;
                        } else {
                            dwsfVar.copyOnWrite();
                            dwsi dwsiVar3 = (dwsi) dwsfVar.instance;
                            dwsiVar3.b |= 16;
                            dwsiVar3.g = a2;
                        }
                        dwsi dwsiVar4 = (dwsi) dwsfVar.instance;
                        dxth.c("FileId %s does not have checksum. Generated checksum from url %s", dwsiVar4.c, dwsiVar4.g);
                        d.h((dwsi) dwsfVar.build());
                    } else {
                        d.h(dwsiVar);
                    }
                }
                return d.g();
            }
        }
        return engw.n(list);
    }

    public static final ListenableFuture i(dwso dwsoVar) {
        long j = dwsoVar.t;
        return erre.a;
    }

    public final ListenableFuture b() {
        final dxpn dxpnVar = this.f;
        return elfr.k(elfr.k(dxpnVar.c.c(), new eroh() { // from class: dxoq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                final dxpn dxpnVar2 = dxpn.this;
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(dxpnVar2.a((dwtt) it.next()));
                    }
                } catch (Exception unused) {
                    dxpnVar2.b.a();
                }
                return dycg.a(arrayList).b(new erog() { // from class: dxoj
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        return dxpn.this.b();
                    }
                }, dxpnVar2.l);
            }
        }, dxpnVar.l), new eroh() { // from class: dxme
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxmi dxmiVar = dxmi.this;
                return elfr.k(dxmiVar.g.a(), new eroh() { // from class: dxkz
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxmi.this.e.b();
                    }
                }, dxmiVar.n);
            }
        }, this.n);
    }

    public final ListenableFuture c() {
        return elfr.k(this.f.b(), new eroh() { // from class: dxky
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxmi dxmiVar = dxmi.this;
                return elfr.k(dxmiVar.g.a(), new eroh() { // from class: dxkv
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxmi.this.e.b();
                    }
                }, dxmiVar.n);
            }
        }, this.n);
    }

    public final ListenableFuture d(final boolean z, final eroh erohVar) {
        dxth.c("%s downloadAllPendingGroups on wifi = %s", "MDDManager", Boolean.valueOf(z));
        return elfr.k(h(), new eroh() { // from class: dxmc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dxmi dxmiVar = dxmi.this;
                if (!dxmiVar.p.S()) {
                    return erre.a;
                }
                final eroh erohVar2 = erohVar;
                final boolean z2 = z;
                dxmiVar.c.l(1031);
                final dxig dxigVar = dxmiVar.d;
                return dxigVar.r(dxigVar.d.d(), eldl.d(new eroh() { // from class: dxep
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) obj2).iterator();
                        while (true) {
                            final dxig dxigVar2 = dxig.this;
                            if (!it.hasNext()) {
                                return dycg.a(arrayList).a(new Callable() { // from class: dxhi
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return null;
                                    }
                                }, dxigVar2.h);
                            }
                            final dwtm dwtmVar = (dwtm) it.next();
                            if (!dwtmVar.f) {
                                final eroh erohVar3 = erohVar2;
                                final boolean z3 = z2;
                                arrayList.add(dxigVar2.r(dxigVar2.d.g(dwtmVar), new eroh() { // from class: dxhh
                                    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
                                    @Override // defpackage.eroh
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r12) {
                                        /*
                                            r11 = this;
                                            dwso r12 = (defpackage.dwso) r12
                                            r0 = 0
                                            if (r12 == 0) goto Lca
                                            int r1 = r12.s
                                            int r1 = defpackage.dycb.a(r1)
                                            r2 = 1
                                            if (r1 != 0) goto Lf
                                            goto L13
                                        Lf:
                                            if (r1 == r2) goto L13
                                            goto Lca
                                        L13:
                                            dwta r1 = r12.n
                                            if (r1 != 0) goto L19
                                            dwta r1 = defpackage.dwta.a
                                        L19:
                                            dxig r3 = defpackage.dxig.this
                                            int r1 = r1.d
                                            int r1 = defpackage.dwsx.a(r1)
                                            r4 = 3
                                            r5 = 2
                                            r6 = 0
                                            if (r1 != 0) goto L27
                                            goto L2b
                                        L27:
                                            if (r1 != r5) goto L2b
                                        L29:
                                            r1 = r2
                                            goto L9a
                                        L2b:
                                            dwta r1 = r12.n
                                            if (r1 != 0) goto L31
                                            dwta r1 = defpackage.dwta.a
                                        L31:
                                            int r1 = r1.d
                                            int r1 = defpackage.dwsx.a(r1)
                                            if (r1 != 0) goto L3b
                                        L39:
                                            r1 = r6
                                            goto L9a
                                        L3b:
                                            if (r1 != r4) goto L39
                                            dxbv r1 = r3.m
                                            long r7 = r1.a()
                                            dwsk r1 = r12.c
                                            if (r1 != 0) goto L49
                                            dwsk r1 = defpackage.dwsk.a
                                        L49:
                                            long r9 = r1.d
                                            long r7 = r7 - r9
                                            dwta r1 = r12.n
                                            if (r1 != 0) goto L52
                                            dwta r1 = defpackage.dwta.a
                                        L52:
                                            r9 = 1000(0x3e8, double:4.94E-321)
                                            long r7 = r7 / r9
                                            long r9 = r1.e
                                            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                                            if (r1 <= 0) goto L39
                                            eyfq r1 = r12.toBuilder()
                                            dwsn r1 = (defpackage.dwsn) r1
                                            dwta r12 = r12.n
                                            if (r12 != 0) goto L67
                                            dwta r12 = defpackage.dwta.a
                                        L67:
                                            eyfq r12 = r12.toBuilder()
                                            dwsv r12 = (defpackage.dwsv) r12
                                            r12.copyOnWrite()
                                            MessageType extends eyfy<MessageType, BuilderType> r7 = r12.instance
                                            dwta r7 = (defpackage.dwta) r7
                                            r7.d = r2
                                            int r8 = r7.b
                                            r8 = r8 | r5
                                            r7.b = r8
                                            r1.copyOnWrite()
                                            MessageType extends eyfy<MessageType, BuilderType> r7 = r1.instance
                                            dwso r7 = (defpackage.dwso) r7
                                            eyfy r12 = r12.build()
                                            dwta r12 = (defpackage.dwta) r12
                                            r12.getClass()
                                            r7.n = r12
                                            int r12 = r7.b
                                            r12 = r12 | 2048(0x800, float:2.87E-42)
                                            r7.b = r12
                                            eyfy r12 = r1.build()
                                            dwso r12 = (defpackage.dwso) r12
                                            goto L29
                                        L9a:
                                            boolean r7 = r2
                                            java.lang.String r8 = r12.d
                                            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
                                            java.lang.Object[] r4 = new java.lang.Object[r4]
                                            java.lang.String r10 = "FileGroupManager"
                                            r4[r6] = r10
                                            r4[r2] = r8
                                            r4[r5] = r9
                                            java.lang.String r2 = "%s: Try to download pending file group: %s, download over cellular = %s"
                                            defpackage.dxth.d(r2, r4)
                                            if (r7 != 0) goto Lbb
                                            if (r1 == 0) goto Lb6
                                            goto Lbb
                                        Lb6:
                                            com.google.common.util.concurrent.ListenableFuture r12 = defpackage.erqt.i(r0)
                                            return r12
                                        Lbb:
                                            dwta r12 = r12.n
                                            if (r12 != 0) goto Lc1
                                            dwta r12 = defpackage.dwta.a
                                        Lc1:
                                            eroh r0 = r4
                                            dwtm r1 = r3
                                            com.google.common.util.concurrent.ListenableFuture r12 = r3.e(r1, r12, r0)
                                            return r12
                                        Lca:
                                            com.google.common.util.concurrent.ListenableFuture r12 = defpackage.erqt.i(r0)
                                            return r12
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxhh.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                                    }
                                }));
                            }
                        }
                    }
                }));
            }
        }, this.n);
    }

    public final ListenableFuture e(final dwtm dwtmVar, final emxc emxcVar, final eroh erohVar) {
        dxth.d("%s downloadFileGroup %s %s", "MDDManager", dwtmVar.c, dwtmVar.d);
        return elfr.k(h(), new eroh() { // from class: dxla
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return dxmi.this.d.e(dwtmVar, (dwta) emxcVar.f(), erohVar);
            }
        }, this.n);
    }

    public final ListenableFuture f() {
        dxth.b("%s getAllFreshGroups", "MDDManager");
        return elfr.k(h(), new eroh() { // from class: dxma
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return dxmi.this.e.c();
            }
        }, this.n);
    }

    public final ListenableFuture g(final dwtm dwtmVar, final boolean z) {
        dxth.d("%s getFileGroup %s %s", "MDDManager", dwtmVar.c, dwtmVar.d);
        return elfr.k(h(), new eroh() { // from class: dxmf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return dxmi.this.d.g(dwtmVar, z);
            }
        }, this.n);
    }

    public final ListenableFuture h() {
        return a ? erre.a : dycd.e(erre.a).g(new eroh() { // from class: dxlo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dxmi dxmiVar = dxmi.this;
                final SharedPreferences a2 = dxvw.a(dxmiVar.b, "gms_icing_mdd_manager_metadata", dxmiVar.m);
                if (a2.getBoolean("mdd_migrated_to_offroad", false)) {
                    return erre.a;
                }
                dxth.b("%s Clearing MDD as device isn't migrated to offroad.", "MDDManager");
                return elfr.j(dxmiVar.c(), new emwl() { // from class: dxkl
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        boolean z = dxmi.a;
                        a2.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
                        return null;
                    }
                }, dxmiVar.n);
            }
        }, this.n).g(new eroh() { // from class: dxlp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxmi dxmiVar = dxmi.this;
                dxpn dxpnVar = dxmiVar.f;
                SharedPreferences a2 = dxvw.a(dxpnVar.a, "gms_icing_mdd_shared_file_manager_metadata", dxpnVar.k);
                if (a2.contains("migrated_to_new_file_key")) {
                    if (a2.getBoolean("migrated_to_new_file_key", false)) {
                        dxkk.e(dxpnVar.a);
                    }
                    a2.edit().remove("migrated_to_new_file_key").commit();
                }
                return elfr.k(erqt.i(true), new eroh() { // from class: dxlf
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return erre.a;
                        }
                        dxmi dxmiVar2 = dxmi.this;
                        dxth.n("%s Clearing MDD since FileManager failed or needs migration.", "MDDManager");
                        return dxmiVar2.c();
                    }
                }, dxmiVar.n);
            }
        }, this.n).g(new eroh() { // from class: dxlq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxmi dxmiVar = dxmi.this;
                return elfr.k(dxmiVar.g.d(), new eroh() { // from class: dxle
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return erre.a;
                        }
                        dxmi dxmiVar2 = dxmi.this;
                        dxth.n("%s Clearing MDD since FilesMetadata failed or needs migration.", "MDDManager");
                        return dxmiVar2.c();
                    }
                }, dxmiVar.n);
            }
        }, this.n).g(new eroh() { // from class: dxlr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return dxmi.this.e.f();
            }
        }, this.n).f(new emwl() { // from class: dxls
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dxmi.a = true;
                return null;
            }
        }, this.n);
    }
}
