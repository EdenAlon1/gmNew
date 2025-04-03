package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dumt {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/cache/FileCache");
    public final HashMap b = new HashMap();
    public final dumu c;
    private final Supplier d;
    private dumo e;

    public dumt(Supplier supplier, dumu dumuVar) {
        this.d = supplier;
        this.c = dumuVar;
    }

    private final void e(String str, ListenableFuture listenableFuture, Executor executor) {
        erqt.r(listenableFuture, new dums(this, str, listenableFuture), executor);
    }

    public final dumo a() {
        Object obj;
        if (this.e == null) {
            obj = this.d.get();
            this.e = (dumo) obj;
        }
        return this.e;
    }

    public final synchronized ListenableFuture b(final String str, errl errlVar) {
        ListenableFuture listenableFuture = (ListenableFuture) this.b.get(str);
        if (listenableFuture != null) {
            return erqt.j(listenableFuture);
        }
        ListenableFuture submit = errlVar.submit(new Callable() { // from class: dumr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                RandomAccessFile randomAccessFile;
                dumt dumtVar = dumt.this;
                File file = new File(dumtVar.a().b, str);
                if (!file.isFile()) {
                    return null;
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "r");
                } catch (IOException unused) {
                }
                try {
                    long length = randomAccessFile.length() - 4;
                    randomAccessFile.seek(length);
                    long readInt = randomAccessFile.readInt();
                    randomAccessFile.close();
                    if (readInt == length) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            long length2 = file.length() - 4;
                            int i = eoej.a;
                            eoei eoeiVar = new eoei(fileInputStream, length2);
                            try {
                                Object a2 = dumtVar.c.a(eoeiVar);
                                eoeiVar.close();
                                return a2;
                            } finally {
                            }
                        } catch (IOException e) {
                            ((enrr) ((enrr) ((enrr) dumt.a.i()).g(e)).h("com/google/android/libraries/inputmethod/cache/FileCache", "getInternal", 117, "FileCache.java")).t("Failed to deserialize file: %s", file);
                        }
                    }
                    dval.b.b(file);
                    ((enrr) ((enrr) dumt.a.i()).h("com/google/android/libraries/inputmethod/cache/FileCache", "getInternal", 109, "FileCache.java")).t("Delete malformed file: %s", file);
                    return null;
                } finally {
                }
            }
        });
        this.b.put(str, submit);
        e(str, submit, errlVar);
        return erqt.j(submit);
    }

    public final Object c(String str, Object obj) {
        File file = a().b;
        if (!file.exists() && !dval.b.a(file)) {
            enru enruVar = a;
            ((enrr) ((enrr) enruVar.i()).h("com/google/android/libraries/inputmethod/cache/FileCache", "createFolderIfAbsent", 230, "FileCache.java")).t("Failed to create directory: %s", file);
            ((enrr) ((enrr) enruVar.i()).h("com/google/android/libraries/inputmethod/cache/FileCache", "putInternal", 163, "FileCache.java")).t("Failed to create folder for file: %s", str);
            return null;
        }
        File file2 = new File(a().b, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                this.c.b(fileOutputStream, obj);
                fileOutputStream.close();
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int length = (int) randomAccessFile.length();
                        randomAccessFile.seek(length);
                        randomAccessFile.writeInt(length);
                        randomAccessFile.close();
                        return obj;
                    } finally {
                    }
                } catch (IOException unused) {
                    return null;
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            ((enrr) ((enrr) a.e()).h("com/google/android/libraries/inputmethod/cache/FileCache", "putInternal", 170, "FileCache.java")).t("File not found: %s", file2);
            return null;
        } catch (IOException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/inputmethod/cache/FileCache", "putInternal", 173, "FileCache.java")).t("Error writing file: %s", file2);
            return null;
        }
    }

    public final synchronized void d(final String str, final Object obj, errl errlVar) {
        ListenableFuture listenableFuture = (ListenableFuture) this.b.get(str);
        ListenableFuture f = listenableFuture != null ? erny.f(listenableFuture, new emwl() { // from class: dump
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                return dumt.this.c(str, obj);
            }
        }, errlVar) : errlVar.submit(new Callable() { // from class: dumq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dumt.this.c(str, obj);
            }
        });
        this.b.put(str, f);
        e(str, f, errlVar);
        erqt.j(f);
    }
}
