package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgum implements dgtt {
    public final AtomicReference b;
    private final String d;
    private final dguw e;
    private final ExecutorService f;
    private final ewbz g;
    public final Deque a = new ArrayDeque();
    public final AtomicInteger c = new AtomicInteger();

    public dgum(dguw dguwVar, String str, ewbz ewbzVar, ewbw ewbwVar, ExecutorService executorService) {
        this.f = executorService;
        this.e = dguwVar;
        this.d = str;
        this.g = ewbzVar;
        this.b = new AtomicReference(ewbwVar);
    }

    @Override // defpackage.dgtt
    public final void a(dgts dgtsVar) {
        ListenableFuture f;
        if (Log.isLoggable("ExampleIterator", 3)) {
            Log.d("ExampleIterator", "next() called");
        }
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                final dguw dguwVar = this.e;
                final String str = this.d;
                final ewbz ewbzVar = this.g;
                final ewbw ewbwVar = (ewbw) this.b.get();
                int i = this.g.h;
                final int min = i > 0 ? Math.min(100, i - this.c.get()) : 100;
                f = erny.f(erqt.n(new erog() { // from class: dgut
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:3:0x0012, B:10:0x0041, B:15:0x004e, B:17:0x0052, B:18:0x006a, B:21:0x0088, B:22:0x008d, B:24:0x0098, B:25:0x00b8, B:27:0x00bc, B:28:0x00be, B:30:0x00c6, B:31:0x00c8, B:37:0x010e, B:43:0x0141, B:62:0x021f, B:77:0x0234, B:76:0x0231, B:80:0x00f8, B:82:0x0104, B:83:0x0106, B:84:0x00d5, B:86:0x00e1, B:87:0x00e3, B:91:0x0082, B:93:0x005e, B:95:0x0062, B:72:0x022c, B:45:0x0188, B:46:0x018d, B:48:0x0193, B:52:0x01c6, B:54:0x01df, B:57:0x01aa, B:60:0x01fc), top: B:2:0x0012, inners: #0, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:3:0x0012, B:10:0x0041, B:15:0x004e, B:17:0x0052, B:18:0x006a, B:21:0x0088, B:22:0x008d, B:24:0x0098, B:25:0x00b8, B:27:0x00bc, B:28:0x00be, B:30:0x00c6, B:31:0x00c8, B:37:0x010e, B:43:0x0141, B:62:0x021f, B:77:0x0234, B:76:0x0231, B:80:0x00f8, B:82:0x0104, B:83:0x0106, B:84:0x00d5, B:86:0x00e1, B:87:0x00e3, B:91:0x0082, B:93:0x005e, B:95:0x0062, B:72:0x022c, B:45:0x0188, B:46:0x018d, B:48:0x0193, B:52:0x01c6, B:54:0x01df, B:57:0x01aa, B:60:0x01fc), top: B:2:0x0012, inners: #0, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:3:0x0012, B:10:0x0041, B:15:0x004e, B:17:0x0052, B:18:0x006a, B:21:0x0088, B:22:0x008d, B:24:0x0098, B:25:0x00b8, B:27:0x00bc, B:28:0x00be, B:30:0x00c6, B:31:0x00c8, B:37:0x010e, B:43:0x0141, B:62:0x021f, B:77:0x0234, B:76:0x0231, B:80:0x00f8, B:82:0x0104, B:83:0x0106, B:84:0x00d5, B:86:0x00e1, B:87:0x00e3, B:91:0x0082, B:93:0x005e, B:95:0x0062, B:72:0x022c, B:45:0x0188, B:46:0x018d, B:48:0x0193, B:52:0x01c6, B:54:0x01df, B:57:0x01aa, B:60:0x01fc), top: B:2:0x0012, inners: #0, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x0136  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x013f  */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x0193 A[Catch: all -> 0x0228, TryCatch #2 {all -> 0x0228, blocks: (B:45:0x0188, B:46:0x018d, B:48:0x0193, B:52:0x01c6, B:54:0x01df, B:57:0x01aa, B:60:0x01fc), top: B:44:0x0188, outer: #1 }] */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x021f A[Catch: all -> 0x0235, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0235, blocks: (B:3:0x0012, B:10:0x0041, B:15:0x004e, B:17:0x0052, B:18:0x006a, B:21:0x0088, B:22:0x008d, B:24:0x0098, B:25:0x00b8, B:27:0x00bc, B:28:0x00be, B:30:0x00c6, B:31:0x00c8, B:37:0x010e, B:43:0x0141, B:62:0x021f, B:77:0x0234, B:76:0x0231, B:80:0x00f8, B:82:0x0104, B:83:0x0106, B:84:0x00d5, B:86:0x00e1, B:87:0x00e3, B:91:0x0082, B:93:0x005e, B:95:0x0062, B:72:0x022c, B:45:0x0188, B:46:0x018d, B:48:0x0193, B:52:0x01c6, B:54:0x01df, B:57:0x01aa, B:60:0x01fc), top: B:2:0x0012, inners: #0, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x0224  */
                    /* JADX WARN: Removed duplicated region for block: B:79:0x0140  */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:3:0x0012, B:10:0x0041, B:15:0x004e, B:17:0x0052, B:18:0x006a, B:21:0x0088, B:22:0x008d, B:24:0x0098, B:25:0x00b8, B:27:0x00bc, B:28:0x00be, B:30:0x00c6, B:31:0x00c8, B:37:0x010e, B:43:0x0141, B:62:0x021f, B:77:0x0234, B:76:0x0231, B:80:0x00f8, B:82:0x0104, B:83:0x0106, B:84:0x00d5, B:86:0x00e1, B:87:0x00e3, B:91:0x0082, B:93:0x005e, B:95:0x0062, B:72:0x022c, B:45:0x0188, B:46:0x018d, B:48:0x0193, B:52:0x01c6, B:54:0x01df, B:57:0x01aa, B:60:0x01fc), top: B:2:0x0012, inners: #0, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:84:0x00d5 A[Catch: all -> 0x0235, TryCatch #1 {all -> 0x0235, blocks: (B:3:0x0012, B:10:0x0041, B:15:0x004e, B:17:0x0052, B:18:0x006a, B:21:0x0088, B:22:0x008d, B:24:0x0098, B:25:0x00b8, B:27:0x00bc, B:28:0x00be, B:30:0x00c6, B:31:0x00c8, B:37:0x010e, B:43:0x0141, B:62:0x021f, B:77:0x0234, B:76:0x0231, B:80:0x00f8, B:82:0x0104, B:83:0x0106, B:84:0x00d5, B:86:0x00e1, B:87:0x00e3, B:91:0x0082, B:93:0x005e, B:95:0x0062, B:72:0x022c, B:45:0x0188, B:46:0x018d, B:48:0x0193, B:52:0x01c6, B:54:0x01df, B:57:0x01aa, B:60:0x01fc), top: B:2:0x0012, inners: #0, #2 }] */
                    @Override // defpackage.erog
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.google.common.util.concurrent.ListenableFuture a() {
                        /*
                            Method dump skipped, instructions count: 578
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgut.a():com.google.common.util.concurrent.ListenableFuture");
                    }
                }, dguwVar.d), new emwl() { // from class: dguk
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        List list = (List) obj;
                        if (list == null || list.isEmpty()) {
                            return null;
                        }
                        dgum dgumVar = dgum.this;
                        dgumVar.b.set((ewbw) ((emxd) list.get(list.size() - 1)).a);
                        dgumVar.c.addAndGet(list.size());
                        synchronized (dgumVar.a) {
                            dgumVar.a.addAll(list);
                        }
                        return null;
                    }
                }, this.f);
            } else {
                f = erqt.i(null);
            }
        }
        erqt.r(f, new dgul(this, dgtsVar), this.f);
    }

    @Override // defpackage.dgtt
    public final void b() {
        if (Log.isLoggable("ExampleIterator", 3)) {
            Log.d("ExampleIterator", "request() called");
        }
    }

    @Override // defpackage.dgtt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (Log.isLoggable("ExampleIterator", 3)) {
            Log.d("ExampleIterator", "close() called");
        }
    }
}
