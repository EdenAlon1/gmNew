package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dupa implements duqk {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider");
    public static final dval b = dval.b;
    public final dupn d;
    private final Context f;
    public final Object e = new Object();
    private File g = null;
    public final Executor c = dunl.a().e;

    public dupa(Context context) {
        this.f = context.getApplicationContext();
        this.d = new dupn(context);
    }

    public final File a() {
        if (this.g == null) {
            File file = new File(this.f.getFilesDir(), "emoji");
            String absolutePath = file.getAbsolutePath();
            File file2 = new File(absolutePath);
            if (!file2.exists() && !file2.mkdirs()) {
                ((enrr) ((enrr) dval.a.i()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createDirIfNotExists", 739, "FileOperationUtils.java")).t("Could not create the directory %s", absolutePath);
            }
            String absolutePath2 = file.getAbsolutePath();
            File file3 = new File(absolutePath2, "sticky_variant_prefs");
            if (!file3.exists()) {
                try {
                    if (!file3.createNewFile()) {
                        ((enrr) ((enrr) dval.a.i()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createFileIfNotExists", 751, "FileOperationUtils.java")).D("Could not create the file: %s/%s", absolutePath2, "sticky_variant_prefs");
                    }
                } catch (IOException e) {
                    ((enrr) ((enrr) ((enrr) dval.a.i()).g(e)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createFileIfNotExists", 755, "FileOperationUtils.java")).D("Could not create the file: %s/%s", absolutePath2, "sticky_variant_prefs");
                }
            }
            this.g = new File(file, "sticky_variant_prefs");
        }
        return this.g;
    }

    public final void b(final dupq dupqVar) {
        erqt.r(erqt.m(new Callable() { // from class: duox
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                dupa dupaVar = dupa.this;
                Object obj = dupaVar.e;
                dupq dupqVar2 = dupqVar;
                synchronized (obj) {
                    dval dvalVar = dupa.b;
                    File a2 = dupaVar.a();
                    File parentFile = a2.getParentFile();
                    z = false;
                    if (parentFile != null && dvalVar.a(parentFile)) {
                        if (a2.isDirectory()) {
                            ((enrr) ((enrr) dval.a.i()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "writeProto", 720, "FileOperationUtils.java")).t("Cannot write bytes to directory %s", a2.getPath());
                        } else {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(a2);
                                try {
                                    dupqVar2.writeTo(fileOutputStream);
                                    fileOutputStream.close();
                                    z = true;
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException | IllegalStateException e) {
                                ((enrr) ((enrr) ((enrr) dval.a.i()).g(e)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "writeProto", 729, "FileOperationUtils.java")).t("Failed to write to %s", a2.getPath());
                            }
                        }
                    }
                }
                if (z) {
                    return null;
                }
                throw new IOException("Failed to write sticky preferences to disk");
            }
        }, this.c), new duoz(this, dupqVar), this.c);
    }
}
