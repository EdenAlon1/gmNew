package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxod implements dxpq {
    public final Context a;
    public final dwxf b;
    private final effy c;
    private final Executor d;
    private final dwqy e;

    public dxod(Context context, dwxf dwxfVar, effy effyVar, Executor executor, dwqy dwqyVar) {
        this.a = context;
        this.b = dwxfVar;
        this.c = effyVar;
        this.d = executor;
        this.e = dwqyVar;
    }

    @Override // defpackage.dxpq
    public final ListenableFuture a() {
        return this.c.b(new emwl() { // from class: dxny
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwty dwtyVar = (dwty) ((dwua) obj).toBuilder();
                dwtyVar.clear();
                return (dwua) dwtyVar.build();
            }
        }, this.d);
    }

    public final ListenableFuture b(final dxkj dxkjVar, final int i) {
        ListenableFuture c;
        if (i > dxkjVar.d) {
            return erqt.i(true);
        }
        dxkj a = dxkj.a(i);
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            c = dycd.e(this.c.b(new emwl() { // from class: dxob
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dwua dwuaVar = (dwua) obj;
                    dxth.b("%s: Starting migration to add download transform", "ProtoDataStoreSharedFilesMetadata");
                    dwty dwtyVar = (dwty) dwuaVar.toBuilder();
                    dxod dxodVar = dxod.this;
                    for (String str : DesugarCollections.unmodifiableMap(dwuaVar.b).keySet()) {
                        try {
                            dwtt a2 = dxvv.a(str, dxodVar.a, dxodVar.b);
                            str.getClass();
                            eyhm eyhmVar = dwuaVar.b;
                            dwtx dwtxVar = eyhmVar.containsKey(str) ? (dwtx) eyhmVar.get(str) : null;
                            dwtyVar.b(str);
                            if (dwtxVar == null) {
                                dxth.g("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                            } else {
                                dwtyVar.a(dxvv.e(a2), dwtxVar);
                            }
                        } catch (dxvu unused) {
                            dxth.h("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                            dxodVar.b.a();
                            dwtyVar.b(str);
                        }
                    }
                    return (dwua) dwtyVar.build();
                }
            }, this.d)).f(new emwl() { // from class: dxoc
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return true;
                }
            }, this.d).c(IOException.class, new emwl() { // from class: dxnk
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dxth.f("Failed to commit migration metadata to disk");
                    new Exception("Migration to DownloadTransform failed.", (IOException) obj);
                    dxod.this.b.a();
                    return false;
                }
            }, this.d);
        } else if (ordinal != 2) {
            c = erqt.h(new UnsupportedOperationException("Upgrade to version " + a.name() + "not supported!"));
        } else {
            c = dycd.e(this.c.b(new emwl() { // from class: dxnv
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dwua dwuaVar = (dwua) obj;
                    dxth.b("%s: Starting migration to dedup on checksum onlu", "ProtoDataStoreSharedFilesMetadata");
                    dwty dwtyVar = (dwty) dwuaVar.toBuilder();
                    dxod dxodVar = dxod.this;
                    for (String str : DesugarCollections.unmodifiableMap(dwuaVar.b).keySet()) {
                        try {
                            dwtt a2 = dxvv.a(str, dxodVar.a, dxodVar.b);
                            str.getClass();
                            eyhm eyhmVar = dwuaVar.b;
                            dwtx dwtxVar = eyhmVar.containsKey(str) ? (dwtx) eyhmVar.get(str) : null;
                            dwtyVar.b(str);
                            if (dwtxVar == null) {
                                dxth.g("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                            } else {
                                dwtyVar.a(dxvv.d(a2), dwtxVar);
                            }
                        } catch (dxvu unused) {
                            dxth.h("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                            dxodVar.b.a();
                            dwtyVar.b(str);
                        }
                    }
                    return (dwua) dwtyVar.build();
                }
            }, this.d)).f(new emwl() { // from class: dxnw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return true;
                }
            }, this.d).c(IOException.class, new emwl() { // from class: dxnx
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dxth.f("Failed to commit migration metadata to disk");
                    new Exception("Migration to ChecksumOnly failed.", (IOException) obj);
                    dxod.this.b.a();
                    return false;
                }
            }, this.d);
        }
        return elfr.k(c, new eroh() { // from class: dxnm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return erqt.i(false);
                }
                dxkj dxkjVar2 = dxkjVar;
                int i2 = i;
                dxod dxodVar = dxod.this;
                dxkk.d(dxodVar.a, dxkj.a(i2));
                return dxodVar.b(dxkjVar2, i2 + 1);
            }
        }, this.d);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture c() {
        final AtomicReference atomicReference = new AtomicReference(new ArrayList());
        return elfr.j(this.c.b(new emwl() { // from class: dxnz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwua dwuaVar = (dwua) obj;
                ArrayList arrayList = new ArrayList();
                dwty dwtyVar = (dwty) dwuaVar.toBuilder();
                dxod dxodVar = dxod.this;
                for (String str : DesugarCollections.unmodifiableMap(dwuaVar.b).keySet()) {
                    try {
                        arrayList.add(dxvv.a(str, dxodVar.a, dxodVar.b));
                    } catch (dxvu e) {
                        dwtyVar.b(str);
                        dxth.j(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                        dwxf dwxfVar = dxodVar.b;
                        emye.d("|").i(str).size();
                        dwxfVar.a();
                    }
                }
                atomicReference.set(arrayList);
                return (dwua) dwtyVar.build();
            }
        }, this.d), new emwl() { // from class: dxoa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (List) atomicReference.get();
            }
        }, this.d);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture d() {
        if (!dxkk.c(this.a)) {
            dxth.b("%s Device isn't migrated to new file key, clear and set migration.", "ProtoDataStoreSharedFilesMetadata");
            dxkk.e(this.a);
            dxkk.d(this.a, dxkj.a(this.e.h()));
            return erqt.i(false);
        }
        final dxkj a = dxkj.a(this.e.h());
        dxkj a2 = dxkk.a(this.a, this.b);
        int i = a.d;
        int i2 = a2.d;
        if (i == i2) {
            return erqt.i(true);
        }
        if (i >= i2) {
            return dycd.e(b(a, i2 + 1)).d(Exception.class, new eroh() { // from class: dxnj
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    dxod.this.i(a);
                    return erqt.h((Exception) obj);
                }
            }, this.d).g(new eroh() { // from class: dxnu
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    dxod.this.i(a);
                    return erqt.i((Boolean) obj);
                }
            }, this.d);
        }
        dxth.i("%s Cannot migrate back from value %s to %s. Clear everything!", "ProtoDataStoreSharedFilesMetadata", a2, a);
        dwxf dwxfVar = this.b;
        new Exception("Downgraded file key from " + String.valueOf(a2) + " to " + String.valueOf(a) + ".");
        dwxfVar.a();
        dxkk.d(this.a, a);
        return erqt.i(false);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture e(final dwtt dwttVar) {
        return elfr.j(f(new enpx(dwttVar)), new emwl() { // from class: dxnl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (dwtx) ((enhk) obj).get(dwtt.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture f(final enip enipVar) {
        return elfr.j(this.c.a(), new emwl() { // from class: dxnn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwua dwuaVar = (dwua) obj;
                enhd enhdVar = new enhd();
                enqu listIterator = enipVar.listIterator();
                while (listIterator.hasNext()) {
                    dxod dxodVar = dxod.this;
                    dwtt dwttVar = (dwtt) listIterator.next();
                    dwtx dwtxVar = (dwtx) DesugarCollections.unmodifiableMap(dwuaVar.b).get(dxvv.b(dwttVar, dxodVar.a, dxodVar.b));
                    if (dwtxVar != null) {
                        enhdVar.k(dwttVar, dwtxVar);
                    }
                }
                return enhdVar.b();
            }
        }, erpp.a);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture g(dwtt dwttVar) {
        final String b = dxvv.b(dwttVar, this.a, this.b);
        return dycd.e(this.c.b(new emwl() { // from class: dxnr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwty dwtyVar = (dwty) ((dwua) obj).toBuilder();
                dwtyVar.b(b);
                return (dwua) dwtyVar.build();
            }
        }, this.d)).f(new emwl() { // from class: dxns
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, this.d).c(IOException.class, new emwl() { // from class: dxnt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return false;
            }
        }, this.d);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture h(dwtt dwttVar, final dwtx dwtxVar) {
        final String b = dxvv.b(dwttVar, this.a, this.b);
        return dycd.e(this.c.b(new emwl() { // from class: dxno
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwty dwtyVar = (dwty) ((dwua) obj).toBuilder();
                dwtyVar.a(b, dwtxVar);
                return (dwua) dwtyVar.build();
            }
        }, this.d)).f(new emwl() { // from class: dxnp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, this.d).c(IOException.class, new emwl() { // from class: dxnq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return false;
            }
        }, this.d);
    }

    public final void i(dxkj dxkjVar) {
        if (dxkk.a(this.a, this.b).d == dxkjVar.d || dxkk.d(this.a, dxkjVar)) {
            return;
        }
        dxth.f(a.F(dxkjVar, "Failed to commit migration version to disk. Fail to set target version to ", "."));
        dwxf dwxfVar = this.b;
        new Exception(a.F(dxkjVar, "Fail to set target version ", "."));
        dwxfVar.a();
    }
}
