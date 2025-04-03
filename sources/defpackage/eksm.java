package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eksm {
    public static final enru a = enru.c("com/google/apps/tiktok/sync/impl/SyncManagerDataStore");
    public final Context c;
    public final errl d;
    public final dlpw e;
    private final edyp h;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = -1;

    public eksm(Context context, errl errlVar, edyp edypVar, dlpw dlpwVar) {
        Boolean bool = false;
        bool.getClass();
        bool.getClass();
        this.h = edypVar;
        this.e = dlpwVar;
        this.c = context;
        this.d = errlVar;
    }

    private final File g() {
        return new File(this.c.getFilesDir().getPath(), "103795117");
    }

    public final ekwa a() {
        File g = g();
        this.b.readLock().lock();
        try {
            if (!g.exists() && this.h.a()) {
                ejjz.c(elfr.g(new Runnable() { // from class: eksd
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = eksm.this.c;
                        File file = new File(context.getFilesDir(), "103795117_".concat(String.valueOf(edyn.a(context).replaceAll("[^A-Za-z0-9\\-_:]", "_"))));
                        if (file.exists() && file.delete()) {
                            ((enrr) ((enrr) eksm.a.j()).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryCleanUpPerProcessDatabase", 247, "SyncManagerDataStore.java")).q("Failed to delete per-process database file even though it exists");
                        }
                    }
                }, this.d), "Process database cleanup future failed", new Object[0]);
            }
            ekwa ekwaVar = null;
            FileInputStream fileInputStream = null;
            if (g.exists()) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(g);
                    try {
                        ekwaVar = (ekwa) ekwa.parseDelimitedFrom(ekwa.a, fileInputStream2);
                        efay.a(fileInputStream2);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        efay.a(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return ekwaVar == null ? ekwa.a : ekwaVar;
        } finally {
            this.b.readLock().unlock();
        }
    }

    public final ListenableFuture b() {
        return erny.f(c(), eldl.a(new emwl() { // from class: eksf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Long l = (Long) obj;
                cmh cmhVar = new cmh();
                ekwa ekwaVar = ekwa.a;
                eksm eksmVar = eksm.this;
                try {
                    for (ekvy ekvyVar : eksmVar.a().d) {
                        long j = ekvyVar.e;
                        ekwe ekweVar = ekvyVar.c;
                        if (ekweVar == null) {
                            ekweVar = ekwe.a;
                        }
                        ektu ektuVar = new ektu(ekweVar);
                        if (j <= 0) {
                            j = l.longValue();
                        }
                        cmhVar.put(ektuVar, Long.valueOf(j));
                    }
                } catch (IOException e) {
                    eksmVar.f(e);
                }
                return cmhVar;
            }
        }), this.d);
    }

    final ListenableFuture c() {
        return this.f.get() ? erqt.i(Long.valueOf(this.g)) : this.d.submit(eldl.m(new Callable() { // from class: eksl
            /* JADX WARN: Finally extract failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long epochMilli;
                ekvz ekvzVar;
                Long valueOf;
                eksm eksmVar = eksm.this;
                eksmVar.b.writeLock().lock();
                try {
                    if (eksmVar.f.get()) {
                        valueOf = Long.valueOf(eksmVar.g);
                    } else {
                        try {
                            ekwa a2 = eksmVar.a();
                            epochMilli = a2.c;
                            ekvzVar = (ekvz) a2.toBuilder();
                        } catch (IOException e) {
                            eksmVar.f(e);
                            epochMilli = eksmVar.e.f().toEpochMilli();
                            ekvzVar = (ekvz) ekwa.a.createBuilder();
                        }
                        if (epochMilli > 0) {
                            eksmVar.g = epochMilli;
                            eksmVar.f.set(true);
                            valueOf = Long.valueOf(eksmVar.g);
                        } else {
                            long epochMilli2 = eksmVar.e.f().toEpochMilli();
                            eksmVar.g = epochMilli2;
                            ekvzVar.copyOnWrite();
                            ekwa ekwaVar = (ekwa) ekvzVar.instance;
                            ekwaVar.b |= 1;
                            ekwaVar.c = epochMilli2;
                            try {
                                try {
                                    eksmVar.e((ekwa) ekvzVar.build());
                                    eksmVar.f.set(true);
                                } catch (IOException e2) {
                                    ((enrr) ((enrr) ((enrr) eksm.a.j()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getSyncEpoch", (char) 148, "SyncManagerDataStore.java")).q("Could not write sync epoch. Using current time but future runs may be delayed.");
                                    eksmVar.f.set(false);
                                }
                                valueOf = Long.valueOf(eksmVar.g);
                            } catch (Throwable th) {
                                eksmVar.f.set(true);
                                throw th;
                            }
                        }
                    }
                    return valueOf;
                } finally {
                    eksmVar.b.writeLock().unlock();
                }
            }
        }));
    }

    final ListenableFuture d(final ektu ektuVar, final long j, final boolean z) {
        return this.d.submit(new Callable() { // from class: eksj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ektu ektuVar2;
                eksm eksmVar = eksm.this;
                eksmVar.b.writeLock().lock();
                long j2 = j;
                try {
                    ekwa ekwaVar = ekwa.a;
                    try {
                        ekwaVar = eksmVar.a();
                    } catch (IOException e) {
                        if (!eksmVar.f(e)) {
                            ((enrr) ((enrr) ((enrr) eksm.a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", (char) 363, "SyncManagerDataStore.java")).q("Unable to read or clear store, will not update sync time. Sync may run too frequently.");
                        }
                    }
                    ekvz ekvzVar = (ekvz) ekwa.a.createBuilder();
                    ekvzVar.mergeFrom((ekvz) ekwaVar);
                    ekvzVar.copyOnWrite();
                    ((ekwa) ekvzVar.instance).d = ekwa.emptyProtobufList();
                    Iterator<E> it = ekwaVar.d.iterator();
                    ekvy ekvyVar = null;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        ektuVar2 = ektuVar;
                        if (!hasNext) {
                            break;
                        }
                        ekvy ekvyVar2 = (ekvy) it.next();
                        ekwe ekweVar = ekvyVar2.c;
                        if (ekweVar == null) {
                            ekweVar = ekwe.a;
                        }
                        if (ektuVar2.equals(new ektu(ekweVar))) {
                            ekvyVar = ekvyVar2;
                        } else {
                            ekvzVar.a(ekvyVar2);
                        }
                    }
                    if (ekvyVar != null) {
                        if (ekwaVar.c < 0) {
                            long j3 = eksmVar.g;
                            if (j3 < 0) {
                                j3 = eksmVar.e.f().toEpochMilli();
                                eksmVar.g = j3;
                            }
                            ekvzVar.copyOnWrite();
                            ekwa ekwaVar2 = (ekwa) ekvzVar.instance;
                            ekwaVar2.b |= 1;
                            ekwaVar2.c = j3;
                        }
                        ekvx ekvxVar = (ekvx) ekvy.a.createBuilder();
                        ekwe ekweVar2 = ektuVar2.a;
                        ekvxVar.copyOnWrite();
                        ekvy ekvyVar3 = (ekvy) ekvxVar.instance;
                        ekweVar2.getClass();
                        ekvyVar3.c = ekweVar2;
                        ekvyVar3.b |= 1;
                        ekvxVar.copyOnWrite();
                        ekvy ekvyVar4 = (ekvy) ekvxVar.instance;
                        ekvyVar4.b |= 4;
                        ekvyVar4.e = j2;
                        if (z) {
                            ekvxVar.copyOnWrite();
                            ekvy ekvyVar5 = (ekvy) ekvxVar.instance;
                            ekvyVar5.b |= 2;
                            ekvyVar5.d = j2;
                            ekvxVar.copyOnWrite();
                            ekvy ekvyVar6 = (ekvy) ekvxVar.instance;
                            ekvyVar6.b |= 8;
                            ekvyVar6.f = 0;
                        } else {
                            long j4 = ekvyVar.d;
                            ekvxVar.copyOnWrite();
                            ekvy ekvyVar7 = (ekvy) ekvxVar.instance;
                            ekvyVar7.b |= 2;
                            ekvyVar7.d = j4;
                            int i = ekvyVar.f + 1;
                            ekvxVar.copyOnWrite();
                            ekvy ekvyVar8 = (ekvy) ekvxVar.instance;
                            ekvyVar8.b |= 8;
                            ekvyVar8.f = i;
                        }
                        ekvzVar.a((ekvy) ekvxVar.build());
                        try {
                            eksmVar.e((ekwa) ekvzVar.build());
                        } catch (IOException e2) {
                            ((enrr) ((enrr) ((enrr) eksm.a.i()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", (char) 423, "SyncManagerDataStore.java")).q("Error writing sync data file after sync. Sync may run too frequently.");
                        }
                    }
                    return null;
                } finally {
                    eksmVar.b.writeLock().unlock();
                }
            }
        });
    }

    public final void e(ekwa ekwaVar) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(g());
            try {
                ekwaVar.writeDelimitedTo(fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public final boolean f(Throwable th) {
        ((enrr) ((enrr) ((enrr) a.j()).g(th)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 624, "SyncManagerDataStore.java")).q("Could not read sync datastore. There was probably a write error. Wiping store.");
        this.b.writeLock().lock();
        try {
            boolean z = false;
            this.f.set(false);
            long j = this.g;
            if (j <= 0) {
                j = this.e.f().toEpochMilli();
            }
            ekvz ekvzVar = (ekvz) ekwa.a.createBuilder();
            ekvzVar.copyOnWrite();
            ekwa ekwaVar = (ekwa) ekvzVar.instance;
            ekwaVar.b |= 1;
            ekwaVar.c = j;
            try {
                try {
                    e((ekwa) ekvzVar.build());
                    this.f.set(true);
                    z = true;
                } catch (IOException e) {
                    ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 644, "SyncManagerDataStore.java")).q("Could not write to datastore to clear store.");
                    this.f.set(false);
                }
                return z;
            } catch (Throwable th2) {
                this.f.set(true);
                throw th2;
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }
}
