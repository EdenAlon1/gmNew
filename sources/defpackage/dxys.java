package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxys implements dwqt {
    public final Uri a;
    public final emyl b;
    public final Executor c;
    public final emxc d;
    public final dxzj e;
    private final Context f;
    private final efbm g;
    private final dxwy h;
    private final dycc i = new dycc();
    private final dybw j;

    public dxys(dxyr dxyrVar) {
        Context context = dxyrVar.a;
        this.f = context;
        this.a = dxvb.g(dxyrVar.a);
        this.b = dxyrVar.c;
        this.j = dxyrVar.i;
        this.g = dxyrVar.d;
        Executor executor = dxyrVar.e;
        this.c = executor;
        this.d = dxyrVar.g;
        this.h = new dxwy(dxyrVar.j, dxyrVar.h);
        efgc efgcVar = dxyrVar.f;
        Uri build = dxvb.g(context).buildUpon().appendPath("manifest_metadata.pb").build();
        effz h = efga.h();
        h.f(build);
        h.e(dxyz.a);
        this.e = new dxzj(efgcVar.a(h.a()), executor);
    }

    public static emxc b(dxyw dxywVar) {
        return (dxywVar.b & 2) != 0 ? emxc.j(dxywVar.d) : emux.a;
    }

    public static dxyw f(String str, int i, emxc emxcVar) {
        dxyt dxytVar = (dxyt) dxyw.a.createBuilder();
        dxytVar.copyOnWrite();
        dxyw dxywVar = (dxyw) dxytVar.instance;
        str.getClass();
        dxywVar.b |= 1;
        dxywVar.c = str;
        dxytVar.copyOnWrite();
        dxyw dxywVar2 = (dxyw) dxytVar.instance;
        dxywVar2.e = i - 1;
        dxywVar2.b |= 4;
        if (emxcVar.g()) {
            String str2 = (String) emxcVar.c();
            dxytVar.copyOnWrite();
            dxyw dxywVar3 = (dxyw) dxytVar.instance;
            dxywVar3.b |= 2;
            dxywVar3.d = str2;
        }
        return (dxyw) dxytVar.build();
    }

    @Override // defpackage.dwqt
    public final ListenableFuture a(final dwub dwubVar) {
        return this.i.b(eldl.c(new erog() { // from class: dxyf
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dxth.b("%s: Add groups from ManifestFileFlag to MDD.", "ManifestFileGroupPopulator");
                final dxys dxysVar = dxys.this;
                final dwqd b = uky.b();
                if (b == null || b.equals(dwqd.a)) {
                    dxth.n("%s: The ManifestFileFlag is empty.", "ManifestFileGroupPopulator");
                    dxysVar.g(3, dwqd.a);
                    return erre.a;
                }
                if ((b.b & 1) == 0 || b.c.isEmpty() || (b.b & 2) == 0 || !b.d.startsWith("https")) {
                    dxysVar.g(402, b);
                    dxth.g("%s: Invalid manifest config from manifest flag.", "ManifestFileGroupPopulator");
                    return erqt.h(new IllegalArgumentException("Invalid manifest flag."));
                }
                final dwub dwubVar2 = dwubVar;
                final String str = b.d;
                final Uri build = dxysVar.a.buildUpon().appendPath(b.c).build();
                final AtomicReference atomicReference = new AtomicReference(dxys.f(str, 2, emux.a));
                final String str2 = b.c;
                dxzj dxzjVar = dxysVar.e;
                final dycd g = dycd.e(dwqn.b(elfr.j(dxzjVar.a.a(), new emwl() { // from class: dxzi
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return emxc.i((dxyw) DesugarCollections.unmodifiableMap(((dxyz) obj).b).get(str2));
                    }
                }, dxzjVar.b), dwqm.MANIFEST_FILE_GROUP_POPULATOR_METADATA_IO_ERROR, "Failed to read bookkeeping.")).f(new emwl() { // from class: dxyl
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        emxc emxcVar = (emxc) obj;
                        if (!emxcVar.g()) {
                            return null;
                        }
                        atomicReference.set((dxyw) emxcVar.c());
                        return null;
                    }
                }, dxysVar.c).g(new eroh() { // from class: dxym
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        dxth.b("%s: Prepare for downloading manifest file.", "ManifestFileGroupPopulator");
                        final AtomicReference atomicReference2 = atomicReference;
                        final dxyw dxywVar = (dxyw) atomicReference2.get();
                        final dxys dxysVar2 = dxys.this;
                        dxbd dxbdVar = (dxbd) dxysVar2.b.get();
                        dxan dxanVar = new dxan();
                        final String str3 = str;
                        dxanVar.b(str3);
                        dxanVar.a = dxys.b(dxywVar);
                        ListenableFuture a = dxbdVar.a(dxanVar.a());
                        final Uri uri = build;
                        return elfr.k(a, new eroh() { // from class: dxyi
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                AtomicReference atomicReference3 = atomicReference2;
                                dxax dxaxVar = (dxax) obj2;
                                int a2 = dxyv.a(((dxyw) atomicReference3.get()).e);
                                if (a2 == 0) {
                                    a2 = 1;
                                }
                                dxyw dxywVar2 = dxywVar;
                                String str4 = str3;
                                if (!str4.equals(dxywVar2.c) || dxaxVar.b()) {
                                    Uri uri2 = uri;
                                    dxys dxysVar3 = dxys.this;
                                    dxth.d("%s: Manifest file on server updated, will re-download; urlToDownload = %s; manifestFileUri = %s", "ManifestFileGroupPopulator", str4, uri2);
                                    dxysVar3.d(uri2);
                                    a2 = 2;
                                }
                                atomicReference3.set(dxys.f(str4, a2, dxaxVar.a()));
                                return erre.a;
                            }
                        }, dxysVar2.c);
                    }
                }, dxysVar.c);
                final dycd g2 = dycd.e(dycd.e(g).f(new emwl() { // from class: dxyn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return emux.a;
                    }
                }, dxysVar.c).c(Throwable.class, new emwl() { // from class: dxyo
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return emxc.j((Throwable) obj);
                    }
                }, dxysVar.c)).g(new eroh() { // from class: dxyb
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        if (((emxc) obj).g()) {
                            return erre.a;
                        }
                        final Uri uri = build;
                        final dwub dwubVar3 = dwubVar2;
                        final AtomicReference atomicReference2 = atomicReference;
                        final dxys dxysVar2 = dxys.this;
                        int i = ((dxyw) atomicReference2.get()).e;
                        int a = dxyv.a(i);
                        if (a != 0 && a == 4) {
                            dxth.b("%s: Manifest file was committed.", "ManifestFileGroupPopulator");
                            if (!dxysVar2.d.g()) {
                                return erre.a;
                            }
                            dxth.b("%s: Overrider is present, commit again.", "ManifestFileGroupPopulator");
                            return dxysVar2.c(dwubVar3, uri, atomicReference2);
                        }
                        int a2 = dxyv.a(i);
                        if (a2 != 0 && a2 == 3) {
                            dxth.b("%s: Manifest file was downloaded.", "ManifestFileGroupPopulator");
                            return dxysVar2.c(dwubVar3, uri, atomicReference2);
                        }
                        final String str3 = str;
                        dxth.d("%s: Start downloading the manifest file from %s to %s.", "ManifestFileGroupPopulator", str3, uri.toString());
                        emyl emylVar = dxysVar2.b;
                        dxba dxbaVar = dxba.c;
                        dxbd dxbdVar = (dxbd) emylVar.get();
                        dxbb h = dxbc.h();
                        h.i(str3);
                        h.g(uri);
                        h.e(dxbaVar);
                        return dycd.e(dxbdVar.b(h.j())).g(new eroh() { // from class: dxya
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                dxth.b("%s: Finalize for downloading manifest file.", "ManifestFileGroupPopulator");
                                final AtomicReference atomicReference3 = atomicReference2;
                                dxyw dxywVar = (dxyw) atomicReference3.get();
                                dxys dxysVar3 = dxys.this;
                                dxbd dxbdVar2 = (dxbd) dxysVar3.b.get();
                                dxan dxanVar = new dxan();
                                final String str4 = str3;
                                dxanVar.b(str4);
                                dxanVar.a = dxys.b(dxywVar);
                                ListenableFuture a3 = dxbdVar2.a(dxanVar.a());
                                final Uri uri2 = uri;
                                return elfr.k(a3, new eroh() { // from class: dxyh
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        dxax dxaxVar = (dxax) obj3;
                                        boolean b2 = dxaxVar.b();
                                        String str5 = str4;
                                        if (!b2) {
                                            atomicReference3.set(dxys.f(str5, 3, dxaxVar.a()));
                                            return erre.a;
                                        }
                                        dxth.i("%s: Manifest file on server changed during download, download failed; urlToDownload = %s; manifestFileUri = %s", "ManifestFileGroupPopulator", str5, uri2);
                                        dwql a4 = dwqn.a();
                                        a4.a = dwqm.MANIFEST_FILE_GROUP_POPULATOR_CONTENT_CHANGED_DURING_DOWNLOAD_ERROR;
                                        a4.b = "Manifest file on server changed during download.";
                                        return erqt.h(a4.a());
                                    }
                                }, dxysVar3.c);
                            }
                        }, dxysVar2.c).g(new eroh() { // from class: dxyg
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return dxys.this.c(dwubVar3, uri, atomicReference2);
                            }
                        }, dxysVar2.c);
                    }
                }, dxysVar.c);
                final ListenableFuture k = elfr.k(elfr.f(g2, Throwable.class, new eroh() { // from class: dxyc
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        AtomicReference atomicReference2 = atomicReference;
                        dxyt dxytVar = (dxyt) ((dxyw) atomicReference2.get()).toBuilder();
                        dxytVar.copyOnWrite();
                        dxyw dxywVar = (dxyw) dxytVar.instance;
                        dxywVar.e = 1;
                        dxywVar.b |= 4;
                        atomicReference2.set((dxyw) dxytVar.build());
                        dxys.this.d(build);
                        return erre.a;
                    }
                }, dxysVar.c), new eroh() { // from class: dxyd
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        AtomicReference atomicReference2 = atomicReference;
                        final String str3 = b.c;
                        final dxyw dxywVar = (dxyw) atomicReference2.get();
                        emwl emwlVar = new emwl() { // from class: dxzh
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                HashMap hashMap = new HashMap(DesugarCollections.unmodifiableMap(((dxyz) obj2).b));
                                hashMap.put(str3, dxywVar);
                                dxyx dxyxVar = (dxyx) dxyz.a.createBuilder();
                                dxyxVar.copyOnWrite();
                                dxyz dxyzVar = (dxyz) dxyxVar.instance;
                                eyhm eyhmVar = dxyzVar.b;
                                if (!eyhmVar.b) {
                                    dxyzVar.b = eyhmVar.a();
                                }
                                dxyzVar.b.putAll(hashMap);
                                return (dxyz) dxyxVar.build();
                            }
                        };
                        dxzj dxzjVar2 = dxys.this.e;
                        return dwqn.b(dxzjVar2.a.b(emwlVar, dxzjVar2.b), dwqm.MANIFEST_FILE_GROUP_POPULATOR_METADATA_IO_ERROR, "Failed to write bookkeeping.");
                    }
                }, dxysVar.c);
                return elfr.k(k, new eroh() { // from class: dxye
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        engw t = engw.t(g, g2, k);
                        dxys dxysVar2 = dxys.this;
                        dwqd dwqdVar = b;
                        dwoa.e(t, emxc.j(new dxyp(dxysVar2, dwqdVar)), "Failed to refresh file groups", new Object[0]);
                        dxysVar2.g(3, dwqdVar);
                        return erre.a;
                    }
                }, dxysVar.c);
            }
        }), this.c);
    }

    public final ListenableFuture c(final dwub dwubVar, final Uri uri, final AtomicReference atomicReference) {
        dxth.c("%s: Parse the manifest file at %s.", "ManifestFileGroupPopulator", uri);
        final dybw dybwVar = this.j;
        return dycd.e(dwqn.b(elfr.h(new Callable() { // from class: dybv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = uri;
                dxth.c("%s: Start parsing manifest file at %s", "ManifestConfigFileParser", uri2);
                return (dwqb) dybw.this.a.c(uri2, new efdx(dwqb.a.getParserForType()));
            }
        }, dybwVar.b), dwqm.MANIFEST_FILE_GROUP_POPULATOR_PARSE_MANIFEST_FILE_ERROR, "Failed to parse the manifest file.")).g(new eroh() { // from class: dxyj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ListenableFuture i;
                dwqb dwqbVar = (dwqb) obj;
                int i2 = engw.d;
                final dxxy dxxyVar = new dxxy(dwubVar, dxys.this.d, enou.a);
                if (dxxyVar.b.g()) {
                    i = ((dxxz) dxxyVar.b.c()).a(dxxy.a(dwqbVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator<E> it = dxxy.a(dwqbVar).c.iterator();
                    while (it.hasNext()) {
                        dwpj dwpjVar = ((dwpy) it.next()).d;
                        if (dwpjVar == null) {
                            dwpjVar = dwpj.a;
                        }
                        arrayList.add(dwpjVar);
                    }
                    i = erqt.i(arrayList);
                }
                return dycd.e(i).g(new eroh() { // from class: dxxu
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final ArrayList arrayList2 = new ArrayList();
                        emux emuxVar = emux.a;
                        for (dwpj dwpjVar2 : (List) obj2) {
                            if (dwpjVar2 != null && !dwpjVar2.c.isEmpty()) {
                                dxxy dxxyVar2 = dxxy.this;
                                dwob dwobVar = new dwob();
                                dwobVar.c(dwpjVar2);
                                dwobVar.a = emuxVar;
                                ListenableFuture a = dxxyVar2.a.a(dwobVar.a());
                                dxxy.b(a, dwpjVar2.c, emux.a, emuxVar);
                                arrayList2.add(a);
                                enqv it2 = ((engw) dxxyVar2.c).iterator();
                                while (it2.hasNext()) {
                                    Account account = (Account) it2.next();
                                    dwub dwubVar2 = dxxyVar2.a;
                                    dwobVar.b(emxc.j(account));
                                    ListenableFuture a2 = dwubVar2.a(dwobVar.a());
                                    dxxy.b(a2, dwpjVar2.c, emxc.j(account), emuxVar);
                                    arrayList2.add(a2);
                                }
                            }
                        }
                        return dycg.a(arrayList2).a(new Callable() { // from class: dxxw
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                dwoa.d(arrayList2, "Failed to add file groups", new Object[0]);
                                return null;
                            }
                        }, erpp.a);
                    }
                }, erpp.a).d(dwoa.class, new eroh() { // from class: dxxv
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return erre.a;
                    }
                }, erpp.a);
            }
        }, this.c).g(new eroh() { // from class: dxyk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                AtomicReference atomicReference2 = atomicReference;
                dxyt dxytVar = (dxyt) ((dxyw) atomicReference2.get()).toBuilder();
                dxytVar.copyOnWrite();
                dxyw dxywVar = (dxyw) dxytVar.instance;
                dxywVar.e = 3;
                dxywVar.b |= 4;
                atomicReference2.set((dxyw) dxytVar.build());
                return erre.a;
            }
        }, this.c);
    }

    public final void d(Uri uri) {
        try {
            if (!this.g.h(uri)) {
                dxth.c("%s: Manifest file doesn't exist: %s", "ManifestFileGroupPopulator", uri);
            } else {
                dxth.c("%s: Removing manifest file at: %s", "ManifestFileGroupPopulator", uri);
                this.g.f(uri);
            }
        } catch (IOException e) {
            dwql a = dwqn.a();
            a.c = e;
            a.a = dwqm.MANIFEST_FILE_GROUP_POPULATOR_DELETE_MANIFEST_FILE_ERROR;
            a.b = "Failed to delete manifest file.";
            throw a.a();
        }
    }

    public final void e(dwqn dwqnVar, dwqd dwqdVar) {
        this.h.a(erkd.b(dwqnVar.a.aF), dwqdVar.c, this.f.getPackageName(), dwqdVar.d);
    }

    public final void g(int i, dwqd dwqdVar) {
        this.h.a(i, dwqdVar.c, this.f.getPackageName(), dwqdVar.d);
    }
}
