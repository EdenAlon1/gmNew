package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejja implements ekrm {
    public static final enru a = enru.c("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet");
    public final Context b;
    public final Map c;
    public final ekql d;
    private final errl e;

    public ejja(Context context, Map map, errl errlVar, ekql ekqlVar) {
        this.b = context;
        this.c = map;
        this.e = errlVar;
        this.d = ekqlVar;
    }

    private final ListenableFuture b(final ekqn ekqnVar) {
        return this.e.submit(eldl.l(new Runnable() { // from class: ejiy
            @Override // java.lang.Runnable
            public final void run() {
                final ejja ejjaVar = ejja.this;
                File b = ejjaVar.d.b(ekqnVar);
                String[] list = b.list(new FilenameFilter() { // from class: ejix
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file, String str) {
                        if (str.endsWith("-wal") || str.endsWith("-shm")) {
                            str = str.substring(0, str.length() - 4);
                        } else if (str.endsWith("-journal")) {
                            str = str.substring(0, str.length() - 8);
                        }
                        return str.startsWith("SqliteKeyValueCache:") && str.endsWith(":Singleton.db") && !((enhk) ejja.this.c).keySet().contains(str);
                    }
                });
                if (list != null) {
                    for (String str : list) {
                        if (new File(b, str).delete()) {
                            ((enrr) ((enrr) ejja.a.h()).h("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "clean", 93, "OrphanCacheSingletonSynclet.java")).t("Removed orphaned cache file: %s", str);
                        } else {
                            ((enrr) ((enrr) ejja.a.i()).h("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "clean", 95, "OrphanCacheSingletonSynclet.java")).t("Failed to remove orphaned cache file: %s", str);
                        }
                    }
                }
            }
        }));
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        return erqt.d(this.e.submit(eldl.l(new Runnable() { // from class: ejiz
            @Override // java.lang.Runnable
            public final void run() {
                ejja ejjaVar = ejja.this;
                for (String str : ejjaVar.b.databaseList()) {
                    if (str.startsWith("SqliteKeyValueCache:") && str.endsWith(":Singleton") && !str.endsWith("-wal") && !str.endsWith("-shm")) {
                        if (ejjaVar.b.deleteDatabase(str)) {
                            ((enrr) ((enrr) ejja.a.h()).h("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "wipeLegacy", 64, "OrphanCacheSingletonSynclet.java")).t("Removed orphaned cache file: %s", str);
                        } else {
                            ((enrr) ((enrr) ejja.a.i()).h("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "wipeLegacy", 66, "OrphanCacheSingletonSynclet.java")).t("Failed to remove orphaned cache file: %s", str);
                        }
                    }
                }
            }
        })), b(new ekqk(1, 2)), b(new ekqk(2, 2))).a(new eroi(null), this.e);
    }
}
