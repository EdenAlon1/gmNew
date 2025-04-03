package com.google.research.xeno.effect;

import com.google.research.xeno.effect.RemoteAssetManager;
import defpackage.ersf;
import defpackage.faex;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteAssetManager {
    public static final Map a = new HashMap();
    private static final ExecutorService d;
    public long b;
    public final String c;

    /* compiled from: PG */
    public interface FetchCallback {
        void onCompletion(String str, String str2);
    }

    static {
        ersf ersfVar = new ersf();
        ersfVar.d("xeno-remote-asset-manager-thread-%d");
        d = Executors.newSingleThreadExecutor(ersf.b(ersfVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RemoteAssetManager(android.content.Context r5, final defpackage.faew r6) {
        /*
            r4 = this;
            r4.<init>()
            faez r0 = defpackage.faez.a
            java.lang.Class<faez> r0 = defpackage.faez.class
            monitor-enter(r0)
            faez r1 = defpackage.faez.a     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L13
            faez r1 = new faez     // Catch: java.lang.Throwable -> L67
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L67
            defpackage.faez.a = r1     // Catch: java.lang.Throwable -> L67
        L13:
            faez r1 = defpackage.faez.a     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = r1.b     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L1f
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L67
            r1.b = r5     // Catch: java.lang.Throwable -> L67
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            faez r5 = defpackage.faez.a
            java.lang.String r0 = r5.b
            r1 = 0
            if (r0 != 0) goto L29
        L27:
            r3 = r1
            goto L47
        L29:
            java.lang.Class<faez> r2 = defpackage.faez.class
            monitor-enter(r2)
            int r0 = r5.c     // Catch: java.lang.Throwable -> L64
            int r0 = r0 + 1
            r5.c = r0     // Catch: java.lang.Throwable -> L64
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = r5.b     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L64
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L64
            boolean r5 = r3.mkdir()     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L45
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            goto L47
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            goto L27
        L47:
            if (r3 == 0) goto L4d
            java.lang.String r1 = r3.getPath()
        L4d:
            r4.c = r1
            if (r1 != 0) goto L59
            java.lang.String r5 = "RemoteAssetManager"
            java.lang.String r6 = "Failed to create sandbox"
            android.util.Log.e(r5, r6)
            return
        L59:
            java.util.concurrent.ExecutorService r5 = com.google.research.xeno.effect.RemoteAssetManager.d
            faeu r0 = new faeu
            r0.<init>()
            r5.execute(r0)
            return
        L64:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            throw r5
        L67:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.research.xeno.effect.RemoteAssetManager.<init>(android.content.Context, faew):void");
    }

    public static native long nativeCreateRemoteAssetManager(String str, long j, AssetDownloader assetDownloader, String str2);

    public final void a(final faex faexVar) {
        d.execute(new Runnable() { // from class: faet
            @Override // java.lang.Runnable
            public final void run() {
                faexVar.a(RemoteAssetManager.this.b);
            }
        });
    }
}
