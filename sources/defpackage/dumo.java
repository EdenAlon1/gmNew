package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.net.URLDecoder;
import j$.util.Objects;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dumo {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory");
    private static final dume c = new dume();
    private static final AtomicBoolean d = new AtomicBoolean(false);
    public final File b;
    private final String e;
    private final enhk f;

    public dumo(File file, String str, Map map) {
        this.b = file;
        this.e = str;
        this.f = ennc.c(map);
    }

    public static dumm a(final Context context) {
        return (dumm) c.a(new emyl() { // from class: dumh
            @Override // defpackage.emyl
            public final Object get() {
                long j;
                enru enruVar = dumo.a;
                boolean z = dvak.a;
                int i = 1;
                String format = String.format(Locale.US, "%d_%d", Integer.valueOf(Build.VERSION.SDK_INT), Long.valueOf(Build.TIME));
                Context context2 = context;
                if (duzz.a) {
                    ApplicationInfo applicationInfo = context2.getApplicationInfo();
                    enin eninVar = new enin();
                    eninVar.c(applicationInfo.sourceDir);
                    eninVar.c(applicationInfo.publicSourceDir);
                    if (applicationInfo.splitSourceDirs != null) {
                        eninVar.i(applicationInfo.splitSourceDirs);
                    }
                    if (applicationInfo.splitPublicSourceDirs != null) {
                        eninVar.i(applicationInfo.splitPublicSourceDirs);
                    }
                    enqu listIterator = eninVar.g().listIterator();
                    j = Long.MIN_VALUE;
                    while (listIterator.hasNext()) {
                        j = Math.max(j, new File((String) listIterator.next()).lastModified());
                    }
                } else {
                    try {
                        i = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
                    } catch (Exception unused) {
                    }
                    j = i;
                }
                return new dumm(format, j);
            }
        });
    }

    static File b(Context context) {
        return new File(dvas.a(context).getCacheDir(), "auto_clean");
    }

    static File c(Context context) {
        return new File(dvas.a(context).getFilesDir(), "auto_clean");
    }

    static String d(String str) {
        try {
            return URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    static void e(dval dvalVar, Context context, dumm dummVar, File file) {
        ArrayList<File> arrayList = new ArrayList();
        try {
            File[] listFiles = file.getCanonicalFile().listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    try {
                        arrayList.add(file2.getCanonicalFile());
                    } catch (IOException e) {
                        ((enrr) ((enrr) ((enrr) dval.a.i()).g(e)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "listCanonicalFiles", 866, "FileOperationUtils.java")).t("listCanonicalFiles(): failed to get canonical file [%s]", file2.getAbsolutePath());
                    }
                }
            }
        } catch (IOException e2) {
            ((enrr) ((enrr) ((enrr) dval.a.i()).g(e2)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "listCanonicalFiles", 854, "FileOperationUtils.java")).t("listCanonicalFiles(): failed to get canonical dir [%s]", file.getAbsolutePath());
        }
        for (File file3 : arrayList) {
            if (file3.isDirectory()) {
                if (Thread.currentThread().isInterrupted()) {
                    ((enrr) ((enrr) a.e()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 345, "AutoCleanableDirectory.java")).q("Thread interruption detected. Abort deletion.");
                    return;
                }
                try {
                } catch (IOException e3) {
                    e = e3;
                    ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 356, "AutoCleanableDirectory.java")).o();
                }
                if (TextUtils.isEmpty(file3.getName())) {
                    throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has empty name."));
                }
                File parentFile = file3.getParentFile();
                if (parentFile == null || !(parentFile.equals(b(context)) || parentFile.equals(c(context)))) {
                    throw new IOException(String.valueOf(String.valueOf(file3)).concat(" is not located in correct directories."));
                }
                List i = emye.b('|').i(d(file3.getName()));
                String d2 = d((String) i.get(0));
                if (TextUtils.isEmpty(d2)) {
                    throw new IOException(String.valueOf(String.valueOf(file3)).concat(" doesn't have a name entry."));
                }
                emye b = emye.b('>');
                EnumMap enumMap = new EnumMap(dumn.class);
                for (String str : i.subList(1, i.size())) {
                    List i2 = b.i(str);
                    if (i2.size() != 2) {
                        throw new IOException(String.valueOf(file3) + " has malformed key-value " + str);
                    }
                    if (TextUtils.isEmpty((CharSequence) i2.get(0))) {
                        throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has empty key."));
                    }
                    try {
                        enumMap.put((EnumMap) Enum.valueOf(dumn.class, emuz.d((String) i2.get(0))), (dumn) d((String) i2.get(1)));
                    } catch (IllegalArgumentException e4) {
                        ((enrr) ((enrr) ((enrr) a.j()).g(e4)).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "fromFile", 250, "AutoCleanableDirectory.java")).t("Key %s is invalid", i2.get(0));
                    }
                }
                try {
                    dumo dumoVar = new dumo(file3, d2, enumMap);
                    String str2 = (String) dumoVar.f.get(dumn.OS);
                    if (TextUtils.isEmpty(str2) || dummVar.a.equals(str2)) {
                        String str3 = (String) dumoVar.f.get(dumn.APP);
                        if (!TextUtils.isEmpty(str3) && !Long.toString(dummVar.b).equals(str3)) {
                        }
                    }
                    try {
                        dvalVar.b(file3);
                        ((enrr) ((enrr) a.e()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 353, "AutoCleanableDirectory.java")).t("%s is deleted", dumoVar);
                    } catch (IOException e5) {
                        e = e5;
                        ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 356, "AutoCleanableDirectory.java")).o();
                    }
                } catch (IllegalArgumentException e6) {
                    throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has duplicate key."), e6);
                }
            }
        }
    }

    public static duml f(final Context context) {
        if (dvao.a(context) && d.compareAndSet(false, true)) {
            dunl.a().e.schedule(new Runnable() { // from class: dumk
                @Override // java.lang.Runnable
                public final void run() {
                    enru enruVar = dumo.a;
                    try {
                        Class.forName("com.google.android.libraries.inputmethod.cache.module.AutoDirectoryCleanerModule$DirectoryAutoCleanerTaskWorker");
                        ((enrr) ((enrr) dumo.a.e()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "maybeCleanupObsoleteFiles", 199, "AutoCleanableDirectory.java")).q("Clean up task will run on scheduler.");
                    } catch (ClassNotFoundException unused) {
                        Context context2 = context;
                        ((enrr) ((enrr) dumo.a.e()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "maybeCleanupObsoleteFiles", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "AutoCleanableDirectory.java")).q("Clean up task runs immediately.");
                        ((enrr) ((enrr) dumo.a.e()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 319, "AutoCleanableDirectory.java")).t("Cleaning up on %s", Thread.currentThread());
                        dval dvalVar = dval.b;
                        File cacheDir = dvas.a(context2).getCacheDir();
                        dumm a2 = dumo.a(context2);
                        dumo.e(dvalVar, context2, a2, dumo.b(context2));
                        dumo.e(dvalVar, context2, a2, dumo.c(context2));
                        dvalVar.b(new File(cacheDir, "mozc.data"));
                        dvalVar.b(new File(cacheDir, "BundledEmojiListLoader"));
                        dvalVar.b(new File(cacheDir, "kb_def"));
                        dvalVar.b(new File(cacheDir, "ThemeBuilderActivity_new_image_cache"));
                        dvalVar.c(cacheDir, new FileFilter() { // from class: dumi
                            @Override // java.io.FileFilter
                            public final boolean accept(File file) {
                                enru enruVar2 = dumo.a;
                                return file.getName().startsWith("keyboardsnapshotcache_") && file.isFile();
                            }
                        });
                        dvalVar.c(cacheDir, new FileFilter() { // from class: dumj
                            @Override // java.io.FileFilter
                            public final boolean accept(File file) {
                                enru enruVar2 = dumo.a;
                                return file.getName().startsWith("stylesheet_") && file.isFile();
                            }
                        });
                    }
                }
            }, 10L, TimeUnit.SECONDS);
        }
        return new duml(dvas.a(context), a(context));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dumo)) {
            return false;
        }
        dumo dumoVar = (dumo) obj;
        return Objects.equals(this.b, dumoVar.b) && Objects.equals(this.e, dumoVar.e) && Objects.equals(this.f, dumoVar.f);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.e, this.f);
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("directory", this.b);
        b.b("name", this.e);
        b.b("properties", this.f);
        return b.toString();
    }
}
