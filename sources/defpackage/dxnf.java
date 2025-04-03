package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnf implements dxih {
    public final dwxf a;
    public final effy b;
    public final Executor c;
    private final dxbv d;

    public dxnf(dxbv dxbvVar, dwxf dwxfVar, effy effyVar, Executor executor) {
        this.d = dxbvVar;
        this.a = dwxfVar;
        this.b = effyVar;
        this.c = executor;
    }

    @Override // defpackage.dxih
    public final ListenableFuture a(dwso dwsoVar) {
        dxth.c("%s: Adding file group %s", "ProtoDataStoreFileGroupsMetadata", dwsoVar.d);
        dwso d = dxvk.d(dwsoVar, (this.d.a() / 1000) + dwsoVar.l);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        return m(arrayList);
    }

    @Override // defpackage.dxih
    public final ListenableFuture b() {
        return dycd.e(k()).g(new eroh() { // from class: dxmz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                emwl emwlVar = new emwl() { // from class: dxmk
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        dwtf dwtfVar = (dwtf) ((dwti) obj2).toBuilder();
                        dwtfVar.clear();
                        return (dwti) dwtfVar.build();
                    }
                };
                dxnf dxnfVar = dxnf.this;
                return dxnfVar.b.b(emwlVar, dxnfVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.dxih
    public final ListenableFuture c() {
        final ArrayList arrayList = new ArrayList();
        return dycd.e(this.b.b(new emwl() { // from class: dxnd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwti dwtiVar = (dwti) obj;
                dwtf dwtfVar = (dwtf) dwtiVar.toBuilder();
                List list = arrayList;
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(dwtiVar.b).entrySet()) {
                    String str = (String) entry.getKey();
                    try {
                        list.add(new dxpz(dxvm.a(str), (dwso) entry.getValue()));
                    } catch (dxvl e) {
                        dwtfVar.b(str);
                        dxth.j(e, "Failed to deserialized file group key: ".concat(String.valueOf(str)));
                    }
                }
                return (dwti) dwtfVar.build();
            }
        }, this.c)).f(new emwl() { // from class: dxne
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return arrayList;
            }
        }, this.c);
    }

    @Override // defpackage.dxih
    public final ListenableFuture d() {
        final ArrayList arrayList = new ArrayList();
        return dycd.e(this.b.b(new emwl() { // from class: dxms
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwti dwtiVar = (dwti) obj;
                dwtf dwtfVar = (dwtf) dwtiVar.toBuilder();
                List list = arrayList;
                for (String str : DesugarCollections.unmodifiableMap(dwtiVar.b).keySet()) {
                    try {
                        list.add(dxvm.a(str));
                    } catch (dxvl e) {
                        dxnf dxnfVar = dxnf.this;
                        dxth.j(e, "Failed to deserialize groupKey:".concat(String.valueOf(str)));
                        dxnfVar.a.a();
                        dwtfVar.b(str);
                        dxth.b("%s: Deleting null file group ", "ProtoDataStoreFileGroupsMetadata");
                    }
                }
                return (dwti) dwtfVar.build();
            }
        }, this.c)).f(new emwl() { // from class: dxmt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return arrayList;
            }
        }, this.c);
    }

    @Override // defpackage.dxih
    public final ListenableFuture e() {
        return elfr.j(this.b.a(), new emwl() { // from class: dxmp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((dwti) obj).d;
            }
        }, this.c);
    }

    @Override // defpackage.dxih
    public final ListenableFuture f() {
        return erre.a;
    }

    @Override // defpackage.dxih
    public final ListenableFuture g(dwtm dwtmVar) {
        final String c = dxvm.c(dwtmVar);
        return elfr.j(this.b.a(), new emwl() { // from class: dxmy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (dwso) DesugarCollections.unmodifiableMap(((dwti) obj).b).get(c);
            }
        }, this.c);
    }

    @Override // defpackage.dxih
    public final ListenableFuture h(dwtm dwtmVar) {
        final String c = dxvm.c(dwtmVar);
        return elfr.j(this.b.a(), new emwl() { // from class: dxml
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (dwto) DesugarCollections.unmodifiableMap(((dwti) obj).c).get(c);
            }
        }, this.c);
    }

    @Override // defpackage.dxih
    public final ListenableFuture i(dwtm dwtmVar) {
        final String c = dxvm.c(dwtmVar);
        return dycd.e(this.b.b(new emwl() { // from class: dxna
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwtf dwtfVar = (dwtf) ((dwti) obj).toBuilder();
                dwtfVar.b(c);
                return (dwti) dwtfVar.build();
            }
        }, this.c)).f(new emwl() { // from class: dxnb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, this.c).c(IOException.class, new emwl() { // from class: dxnc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return false;
            }
        }, this.c);
    }

    @Override // defpackage.dxih
    public final ListenableFuture j(final List list) {
        return dycd.e(this.b.b(new emwl() { // from class: dxmm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwtf dwtfVar = (dwtf) ((dwti) obj).toBuilder();
                for (dwtm dwtmVar : list) {
                    dxth.d("%s: Removing group %s %s", "ProtoDataStoreFileGroupsMetadata", dwtmVar.c, dwtmVar.d);
                    dwtfVar.b(dxvm.c(dwtmVar));
                }
                return (dwti) dwtfVar.build();
            }
        }, this.c)).f(new emwl() { // from class: dxmn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, this.c).c(IOException.class, new emwl() { // from class: dxmo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return false;
            }
        }, this.c);
    }

    @Override // defpackage.dxih
    public final ListenableFuture k() {
        return this.b.b(new emwl() { // from class: dxmq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwtf dwtfVar = (dwtf) ((dwti) obj).toBuilder();
                dwtfVar.copyOnWrite();
                ((dwti) dwtfVar.instance).d = dwti.emptyProtobufList();
                return (dwti) dwtfVar.build();
            }
        }, this.c);
    }

    @Override // defpackage.dxih
    public final ListenableFuture l(dwtm dwtmVar, final dwso dwsoVar) {
        final String c = dxvm.c(dwtmVar);
        return dycd.e(this.b.b(new emwl() { // from class: dxmu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwtf dwtfVar = (dwtf) ((dwti) obj).toBuilder();
                dwtfVar.a(c, dwsoVar);
                return (dwti) dwtfVar.build();
            }
        }, this.c)).f(new emwl() { // from class: dxmv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, this.c).c(IOException.class, new emwl() { // from class: dxmw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return false;
            }
        }, this.c);
    }

    @Override // defpackage.dxih
    public final ListenableFuture m(final List list) {
        return dycd.e(this.b.b(new emwl() { // from class: dxmj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwtf dwtfVar = (dwtf) ((dwti) obj).toBuilder();
                dwtfVar.copyOnWrite();
                dwti dwtiVar = (dwti) dwtfVar.instance;
                eygr eygrVar = dwtiVar.d;
                if (!eygrVar.c()) {
                    dwtiVar.d = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(list, dwtiVar.d);
                return (dwti) dwtfVar.build();
            }
        }, this.c)).f(new emwl() { // from class: dxmr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, this.c).c(IOException.class, new emwl() { // from class: dxmx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return false;
            }
        }, this.c);
    }
}
