package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejiv implements ekrm {
    public static final enru a = enru.c("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet");
    public final Map b;
    private final ejer c;
    private final errl d;

    public ejiv(Map map, ejer ejerVar, errl errlVar) {
        this.b = map;
        this.c = ejerVar;
        this.d = errlVar;
    }

    private final ListenableFuture b(final ekqn ekqnVar) {
        final ejer ejerVar = this.c;
        return erny.f(ejerVar.d.submit(eldl.m(new Callable() { // from class: ejeq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ejer ejerVar2 = ejer.this;
                File file = new File(ejerVar2.b.b(ekqnVar), ejer.b(ejerVar2.c));
                file.mkdirs();
                return file;
            }
        })), new emwl() { // from class: ejit
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final ejiv ejivVar = ejiv.this;
                File[] listFiles = ((File) obj).listFiles(new FilenameFilter() { // from class: ejiu
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file, String str) {
                        if (str.endsWith("-wal") || str.endsWith("-shm")) {
                            str = str.substring(0, str.length() - 4);
                        } else if (str.endsWith("-journal")) {
                            str = str.substring(0, str.length() - 8);
                        }
                        return str.startsWith("SqliteKeyValueCache:") && str.endsWith(".db") && !((enhk) ejiv.this.b).keySet().contains(str);
                    }
                });
                if (listFiles == null) {
                    return null;
                }
                for (File file : listFiles) {
                    if (file.delete()) {
                        ((enrr) ((enrr) ejiv.a.h()).h("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet", "clean", 66, "OrphanCacheAccountSynclet.java")).t("Removed orphaned cache file: %s", file);
                    } else {
                        ((enrr) ((enrr) ejiv.a.i()).h("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet", "clean", 68, "OrphanCacheAccountSynclet.java")).t("Failed to remove orphaned cache file: %s", file);
                    }
                }
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        return erqt.d(b(new ekqk(1, 2)), b(new ekqk(2, 2))).a(new eroi(null), this.d);
    }
}
