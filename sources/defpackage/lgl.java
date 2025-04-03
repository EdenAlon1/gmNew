package defpackage;

import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.car.app.model.Alert;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgl {
    public static final Object a = new Object();
    public static volatile lgl b;
    public final ReadWriteLock c;
    public final Set d;
    public volatile int e;
    public final lgc f;
    final boolean g;
    final boolean h;
    final int[] i;
    public final lgf j;
    public final lge k;
    final lgv l;

    public lgl(lgd lgdVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock;
        this.e = 3;
        this.g = lgdVar.a;
        this.h = lgdVar.b;
        this.i = lgdVar.c;
        this.l = lgdVar.f;
        this.j = lgdVar.e;
        cmj cmjVar = new cmj();
        this.d = cmjVar;
        this.k = new lge();
        Set set = lgdVar.d;
        if (set != null && !set.isEmpty()) {
            cmjVar.addAll(set);
        }
        lgc lgcVar = new lgc(this);
        this.f = lgcVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.e = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (b() == 0) {
                try {
                    lgb lgbVar = new lgb(lgcVar);
                    final lgv lgvVar = lgcVar.c.l;
                    synchronized (lgvVar.c) {
                        lgvVar.f = lgbVar;
                    }
                    synchronized (lgvVar.c) {
                        if (lgvVar.f == null) {
                            return;
                        }
                        if (lgvVar.d == null) {
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: lfy
                                public final /* synthetic */ String a = "emojiCompat";

                                @Override // java.util.concurrent.ThreadFactory
                                public final Thread newThread(Runnable runnable) {
                                    Thread thread = new Thread(runnable, this.a);
                                    thread.setPriority(10);
                                    return thread;
                                }
                            });
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            lgvVar.e = threadPoolExecutor;
                            lgvVar.d = lgvVar.e;
                        }
                        lgvVar.d.execute(new Runnable() { // from class: lgu
                            @Override // java.lang.Runnable
                            public final void run() {
                                long j;
                                int i;
                                lgv lgvVar2 = lgv.this;
                                synchronized (lgvVar2.c) {
                                    if (lgvVar2.f == null) {
                                        return;
                                    }
                                    try {
                                        try {
                                            krs c = krv.c(lgvVar2.a, lgvVar2.b);
                                            if (c.a != 0) {
                                                throw new RuntimeException("fetchFonts failed (" + c.a + ")");
                                            }
                                            krt[] a2 = c.a();
                                            if (a2 == null || a2.length == 0) {
                                                throw new RuntimeException("fetchFonts failed (empty result)");
                                            }
                                            krt krtVar = a2[0];
                                            int i2 = krtVar.e;
                                            if (i2 == 2) {
                                                synchronized (lgvVar2.c) {
                                                }
                                                i2 = 2;
                                            }
                                            if (i2 != 0) {
                                                throw new RuntimeException(a.f(i2, "fetchFonts result is not OK. (", ")"));
                                            }
                                            try {
                                                int i3 = kra.a;
                                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                Typeface b2 = krv.b(lgvVar2.a, new krt[]{krtVar});
                                                ByteBuffer e = kqi.e(lgvVar2.a, krtVar.a);
                                                if (e == null || b2 == null) {
                                                    throw new RuntimeException("Unable to open file.");
                                                }
                                                try {
                                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                    ByteBuffer duplicate = e.duplicate();
                                                    duplicate.order(ByteOrder.BIG_ENDIAN);
                                                    lgx.b(4, duplicate);
                                                    char c2 = (char) duplicate.getShort();
                                                    if (c2 > 'd') {
                                                        throw new IOException("Cannot read metadata.");
                                                    }
                                                    lgx.b(6, duplicate);
                                                    int i4 = 0;
                                                    while (true) {
                                                        if (i4 >= c2) {
                                                            j = -1;
                                                            break;
                                                        }
                                                        int i5 = duplicate.getInt();
                                                        lgx.b(4, duplicate);
                                                        j = lgx.a(duplicate);
                                                        lgx.b(4, duplicate);
                                                        if (i5 == 1835365473) {
                                                            break;
                                                        } else {
                                                            i4++;
                                                        }
                                                    }
                                                    if (j != -1) {
                                                        lgx.b((int) (j - duplicate.position()), duplicate);
                                                        lgx.b(12, duplicate);
                                                        long a3 = lgx.a(duplicate);
                                                        for (0; i < a3; i + 1) {
                                                            int i6 = duplicate.getInt();
                                                            long a4 = lgx.a(duplicate);
                                                            lgx.a(duplicate);
                                                            i = (i6 == 1164798569 || i6 == 1701669481) ? 0 : i + 1;
                                                            duplicate.position((int) (a4 + j));
                                                            lhi lhiVar = new lhi();
                                                            duplicate.order(ByteOrder.LITTLE_ENDIAN);
                                                            lhiVar.e(duplicate.getInt(duplicate.position()) + duplicate.position(), duplicate);
                                                            lgz lgzVar = new lgz(b2, lhiVar);
                                                            Trace.endSection();
                                                            synchronized (lgvVar2.c) {
                                                                lgk lgkVar = lgvVar2.f;
                                                                if (lgkVar != null) {
                                                                    lgc lgcVar2 = ((lgb) lgkVar).a;
                                                                    lgcVar2.b = lgzVar;
                                                                    lgz lgzVar2 = lgcVar2.b;
                                                                    lgl lglVar = lgcVar2.c;
                                                                    lgcVar2.a = new lgs(lgzVar2, lglVar.k, lglVar.j, lglVar.h, lglVar.i, Build.VERSION.SDK_INT >= 34 ? lgm.a() : lgm.a());
                                                                    lgl lglVar2 = lgcVar2.c;
                                                                    Set set2 = lglVar2.d;
                                                                    ArrayList arrayList = new ArrayList(((cmj) set2).c);
                                                                    lglVar2.c.writeLock().lock();
                                                                    try {
                                                                        lglVar2.e = 1;
                                                                        arrayList.addAll(set2);
                                                                        set2.clear();
                                                                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                                                            ((lgj) arrayList.get(i7)).b();
                                                                        }
                                                                    } finally {
                                                                        lglVar2.c.writeLock().unlock();
                                                                    }
                                                                }
                                                            }
                                                            lgvVar2.a();
                                                            return;
                                                        }
                                                    }
                                                    throw new IOException("Cannot read metadata.");
                                                } finally {
                                                    Trace.endSection();
                                                }
                                            } catch (Throwable th) {
                                                int i8 = kra.a;
                                                throw th;
                                            }
                                        } catch (PackageManager.NameNotFoundException e2) {
                                            throw new RuntimeException("provider not found", e2);
                                        }
                                    } catch (Throwable th2) {
                                        synchronized (lgvVar2.c) {
                                            lgk lgkVar2 = lgvVar2.f;
                                            if (lgkVar2 != null) {
                                                ((lgb) lgkVar2).a.c.e(th2);
                                            }
                                            lgvVar2.a();
                                        }
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    lgcVar.c.e(th);
                }
            }
        } catch (Throwable th2) {
            this.c.writeLock().unlock();
            throw th2;
        }
    }

    public static lgl c() {
        lgl lglVar;
        synchronized (a) {
            lglVar = b;
            ksw.d(lglVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return lglVar;
    }

    public static boolean h() {
        return b != null;
    }

    public final int a(CharSequence charSequence, int i) {
        ksw.d(i(), "Not initialized yet");
        ksw.i(charSequence, "charSequence cannot be null");
        lgs lgsVar = this.f.a;
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            lgt[] lgtVarArr = (lgt[]) spanned.getSpans(i, i + 1, lgt.class);
            if (lgtVarArr.length > 0) {
                return spanned.getSpanStart(lgtVarArr[0]);
            }
        }
        return ((lgp) lgsVar.a(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Alert.DURATION_SHOW_INDEFINITELY, true, new lgp(i))).a;
    }

    public final int b() {
        this.c.readLock().lock();
        try {
            return this.e;
        } finally {
            this.c.readLock().unlock();
        }
    }

    public final CharSequence d(CharSequence charSequence) {
        return j(charSequence, charSequence == null ? 0 : charSequence.length());
    }

    final void e(Throwable th) {
        Set set = this.d;
        ArrayList arrayList = new ArrayList(((cmj) set).c);
        this.c.writeLock().lock();
        try {
            this.e = 2;
            arrayList.addAll(set);
            set.clear();
            this.c.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                ((lgj) arrayList.get(i)).a(th);
            }
        } catch (Throwable th2) {
            this.c.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(lgg lggVar) {
        Executor a2 = lfz.a();
        ksw.i(lggVar, "initCallback cannot be null");
        lgj lgjVar = new lgj(a2, lggVar);
        this.c.writeLock().lock();
        try {
            if (this.e == 1) {
                lgjVar.b();
            } else if (this.e == 2) {
                lgjVar.a(new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause."));
            } else {
                this.d.add(lgjVar);
            }
        } finally {
            this.c.writeLock().unlock();
        }
    }

    public final void g(EditorInfo editorInfo) {
        if (!i() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        lgc lgcVar = this.f;
        Bundle bundle = editorInfo.extras;
        lhi lhiVar = lgcVar.b.a;
        int b2 = lhiVar.b(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", b2 != 0 ? lhiVar.b.getInt(b2 + lhiVar.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", lgcVar.c.g);
    }

    public final boolean i() {
        return b() == 1;
    }

    public final CharSequence j(CharSequence charSequence, int i) {
        return k(charSequence, 0, i, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:71:0x0066, B:74:0x006b, B:76:0x006f, B:78:0x007e, B:26:0x0093, B:28:0x009d, B:31:0x00a2, B:33:0x00ae, B:34:0x00b1), top: B:70:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #2 {all -> 0x00e6, blocks: (B:52:0x00d2, B:54:0x00da), top: B:51:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence k(java.lang.CharSequence r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgl.k(java.lang.CharSequence, int, int, int):java.lang.CharSequence");
    }
}
