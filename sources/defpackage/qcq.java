package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qcq {
    public static final Map a = new HashMap();
    private static final Set b = new HashSet();
    private static final byte[] c = {80, 75, 3, 4};

    public static qdh a(Context context, String str) {
        return b(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static qdh b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return f(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new qdh((Throwable) e);
        }
    }

    public static qdh c(InputStream inputStream, String str) {
        try {
            fhnp fhnpVar = new fhnp(fhne.b(inputStream));
            String[] strArr = qlk.a;
            return d(new qll(fhnpVar), str);
        } finally {
            qlw.f(inputStream);
        }
    }

    public static qdh d(qlk qlkVar, String str) {
        return o(qlkVar, str, true);
    }

    public static qdh e(Context context, int i, String str) {
        try {
            fhnp fhnpVar = new fhnp(fhne.b(context.getResources().openRawResource(i)));
            return p(fhnpVar).booleanValue() ? f(context, new ZipInputStream(new fhno(fhnpVar)), str) : c(new fhno(fhnpVar), str);
        } catch (Resources.NotFoundException e) {
            return new qdh((Throwable) e);
        }
    }

    public static qdh f(Context context, ZipInputStream zipInputStream, String str) {
        qdh qdhVar;
        qdc qdcVar;
        try {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                qdhVar = null;
                Object obj = null;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.contains("__MACOSX")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().contains(".json")) {
                        fhnp fhnpVar = new fhnp(fhne.b(zipInputStream));
                        String[] strArr = qlk.a;
                        obj = o(new qll(fhnpVar), null, false).a;
                    } else {
                        if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                            if (!name.contains(".ttf") && !name.contains(".otf")) {
                                zipInputStream.closeEntry();
                            }
                            String str2 = name.split("/")[r2.length - 1];
                            String str3 = str2.split("\\.")[0];
                            File file = new File(context.getCacheDir(), str2);
                            new FileOutputStream(file);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                qlp.b(a.d(str2, str3, "Unable to save font ", " to the temporary file: ", ". "), th3);
                            }
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                qlp.a("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            hashMap2.put(str3, createFromFile);
                        }
                        hashMap.put(name.split("/")[r2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (obj == null) {
                    qdhVar = new qdh((Throwable) new IllegalArgumentException("Unable to parse composition"));
                } else {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str4 = (String) entry.getKey();
                        Iterator it = ((qci) obj).c.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                qdcVar = null;
                                break;
                            }
                            qdcVar = (qdc) it.next();
                            if (qdcVar.d.equals(str4)) {
                                break;
                            }
                        }
                        if (qdcVar != null) {
                            qdcVar.e = qlw.d((Bitmap) entry.getValue(), qdcVar.a, qdcVar.b);
                        }
                    }
                    for (Map.Entry entry2 : hashMap2.entrySet()) {
                        boolean z = false;
                        for (qho qhoVar : ((qci) obj).d.values()) {
                            if (qhoVar.a.equals(entry2.getKey())) {
                                qhoVar.d = (Typeface) entry2.getValue();
                                z = true;
                            }
                        }
                        if (!z) {
                            qlp.a("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                        }
                    }
                    if (hashMap.isEmpty()) {
                        Iterator it2 = ((qci) obj).c.entrySet().iterator();
                        while (it2.hasNext()) {
                            qdc qdcVar2 = (qdc) ((Map.Entry) it2.next()).getValue();
                            if (qdcVar2 == null) {
                                break;
                            }
                            String str5 = qdcVar2.d;
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                                try {
                                    byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                                    qdcVar2.e = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                } catch (IllegalArgumentException e) {
                                    qlp.b("data URL did not have correct base64 format.", e);
                                }
                            }
                        }
                    }
                    Iterator it3 = ((qci) obj).c.entrySet().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) it3.next();
                            if (((qdc) entry3.getValue()).e == null) {
                                qdhVar = new qdh((Throwable) new IllegalStateException("There is no image for ".concat(((qdc) entry3.getValue()).d)));
                                break;
                            }
                        } else {
                            if (str != null) {
                                qhs.a.a(str, (qci) obj);
                            }
                            qdhVar = new qdh(obj);
                        }
                    }
                }
            } catch (IOException e2) {
                qdhVar = new qdh((Throwable) e2);
            }
            return qdhVar;
        } finally {
            qlw.f(zipInputStream);
        }
    }

    public static qdk g(final String str, Callable callable) {
        final qci qciVar = str == null ? null : (qci) qhs.a.b.c(str);
        if (qciVar != null) {
            return new qdk(new Callable() { // from class: qcn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Map map = qcq.a;
                    return new qdh(qci.this);
                }
            });
        }
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                return (qdk) map.get(str);
            }
        }
        qdk qdkVar = new qdk(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            qdkVar.e(new qdd() { // from class: qco
                @Override // defpackage.qdd
                public final void a(Object obj) {
                    qcq.a.remove(str);
                    atomicBoolean.set(true);
                    if (qcq.a.size() == 0) {
                        qcq.n();
                    }
                }
            });
            qdkVar.d(new qdd() { // from class: qcp
                @Override // defpackage.qdd
                public final void a(Object obj) {
                    qcq.a.remove(str);
                    atomicBoolean.set(true);
                    if (qcq.a.size() == 0) {
                        qcq.n();
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = a;
                map2.put(str, qdkVar);
                if (map2.size() == 1) {
                    n();
                }
            }
        }
        return qdkVar;
    }

    public static qdk h(Context context, String str) {
        return i(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static qdk i(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return g(str2, new Callable() { // from class: qcm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qcq.b(applicationContext, str, str2);
            }
        });
    }

    public static qdk j(Context context, int i) {
        return k(context, i, m(context, i));
    }

    public static qdk k(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return g(str, new Callable() { // from class: qck
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map map = qcq.a;
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return qcq.e(context2, i, str);
            }
        });
    }

    public static qdk l(final Context context, final String str, final String str2) {
        return g(str2, new Callable() { // from class: qcj
            /* JADX WARN: Can't wrap try/catch for region: R(12:58|(1:60)|61|(7:70|(1:72)(1:86)|(2:76|(1:78))|79|80|81|82)|87|(1:89)(1:91)|90|(3:74|76|(0))|79|80|81|82) */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
            
                if (r7 == null) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x01bc, code lost:
            
                defpackage.qlp.b("LottieFetchResult close failed ", r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0191 A[Catch: all -> 0x024c, Exception -> 0x024f, TryCatch #1 {Exception -> 0x024f, blocks: (B:56:0x00df, B:58:0x00e5, B:61:0x00f6, B:63:0x00fe, B:65:0x0106, B:67:0x010e, B:70:0x011f, B:72:0x0123, B:74:0x0163, B:76:0x0167, B:78:0x0191, B:79:0x01b5, B:86:0x0137, B:87:0x013c, B:89:0x0140, B:91:0x0155, B:92:0x01c4, B:94:0x01c8, B:97:0x023b, B:103:0x01cf, B:110:0x0206, B:117:0x0230, B:121:0x0232), top: B:55:0x00df }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 642
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qcj.call():java.lang.Object");
            }
        });
    }

    public static String m(Context context, int i) {
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(i2 != 32 ? "_day_" : "_night_");
        sb.append(i);
        return sb.toString();
    }

    public static void n() {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((qdl) arrayList.get(i)).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x0342, code lost:
    
        if (r0 < 0) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.qdh o(defpackage.qlk r34, java.lang.String r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qcq.o(qlk, java.lang.String, boolean):qdh");
    }

    private static Boolean p(fhmv fhmvVar) {
        try {
            fhnp fhnpVar = new fhnp(new fhnj(fhmvVar));
            byte[] bArr = c;
            int length = bArr.length;
            for (int i = 0; i < 4; i++) {
                if (fhnpVar.d() != bArr[i]) {
                    return false;
                }
            }
            fhnpVar.close();
            return true;
        } catch (Exception unused) {
            int i2 = qlp.a;
            return false;
        } catch (NoSuchMethodError unused2) {
            return false;
        }
    }
}
