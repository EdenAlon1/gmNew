package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lew {
    private static final Object k = new Object();
    private static volatile lew l;
    public final ReadWriteLock a;
    public final Set b;
    public int c;
    public final Handler d;
    public final lep e;
    final leu f;
    public final boolean g;
    final boolean h;
    final int[] i;
    public final ler j;

    private lew(leq leqVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.g = leqVar.b;
        this.h = leqVar.c;
        this.i = leqVar.d;
        this.f = leqVar.a;
        this.j = leqVar.f;
        this.d = new Handler(Looper.getMainLooper());
        cmj cmjVar = new cmj();
        this.b = cmjVar;
        Set set = leqVar.e;
        if (set != null && !set.isEmpty()) {
            cmjVar.addAll(set);
        }
        lep lepVar = new lep(this);
        this.e = lepVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.c = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (a() == 0) {
                try {
                    lepVar.c.f.a(new leo(lepVar));
                } catch (Throwable th) {
                    lepVar.c.e(th);
                }
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public static lew b() {
        lew lewVar;
        synchronized (k) {
            ksw.d(l != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            lewVar = l;
        }
        return lewVar;
    }

    public static void h(leq leqVar) {
        if (l == null) {
            synchronized (k) {
                if (l == null) {
                    l = new lew(leqVar);
                }
            }
        }
    }

    public final int a() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        return i(charSequence, charSequence == null ? 0 : charSequence.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0173, code lost:
    
        ((defpackage.lfw) r17).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0179, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0153, code lost:
    
        if (r10.d(r17, r6, r0, r7.b()) == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[Catch: all -> 0x017a, TryCatch #0 {all -> 0x017a, blocks: (B:108:0x0075, B:111:0x007a, B:113:0x007e, B:115:0x008d, B:27:0x0098, B:29:0x00a2, B:33:0x00a8, B:35:0x00b4, B:37:0x00b7, B:41:0x00c6, B:47:0x00d5, B:48:0x00e3, B:52:0x00fc, B:72:0x0108, B:76:0x0114, B:77:0x0119, B:64:0x0123, B:67:0x012a, B:55:0x012f, B:57:0x013b, B:83:0x0141, B:87:0x014b, B:90:0x0157, B:91:0x015d, B:25:0x0093), top: B:107:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014b A[Catch: all -> 0x017a, TryCatch #0 {all -> 0x017a, blocks: (B:108:0x0075, B:111:0x007a, B:113:0x007e, B:115:0x008d, B:27:0x0098, B:29:0x00a2, B:33:0x00a8, B:35:0x00b4, B:37:0x00b7, B:41:0x00c6, B:47:0x00d5, B:48:0x00e3, B:52:0x00fc, B:72:0x0108, B:76:0x0114, B:77:0x0119, B:64:0x0123, B:67:0x012a, B:55:0x012f, B:57:0x013b, B:83:0x0141, B:87:0x014b, B:90:0x0157, B:91:0x015d, B:25:0x0093), top: B:107:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0157 A[Catch: all -> 0x017a, TryCatch #0 {all -> 0x017a, blocks: (B:108:0x0075, B:111:0x007a, B:113:0x007e, B:115:0x008d, B:27:0x0098, B:29:0x00a2, B:33:0x00a8, B:35:0x00b4, B:37:0x00b7, B:41:0x00c6, B:47:0x00d5, B:48:0x00e3, B:52:0x00fc, B:72:0x0108, B:76:0x0114, B:77:0x0119, B:64:0x0123, B:67:0x012a, B:55:0x012f, B:57:0x013b, B:83:0x0141, B:87:0x014b, B:90:0x0157, B:91:0x015d, B:25:0x0093), top: B:107:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence d(java.lang.CharSequence r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lew.d(java.lang.CharSequence, int, int, int, int):java.lang.CharSequence");
    }

    final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new let(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(les lesVar) {
        ksw.i(lesVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            int i = this.c;
            if (i != 1 && i != 2) {
                this.b.add(lesVar);
            }
            Handler handler = this.d;
            ksw.i(lesVar, "initCallback cannot be null");
            handler.post(new let(Arrays.asList(lesVar), i, null));
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final boolean g() {
        return a() == 1;
    }

    public final CharSequence i(CharSequence charSequence, int i) {
        return d(charSequence, 0, i, Alert.DURATION_SHOW_INDEFINITELY, 0);
    }
}
