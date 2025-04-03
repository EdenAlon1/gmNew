package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.EOFException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekic {
    public final Context a;
    public final edyp b;
    public final Map c;
    public final errl d;
    public final fazb e;
    public final ffbr f;
    public final ffbr g;
    public final boolean h;
    public final Map i;
    private final Map j;

    public ekic(Context context, edyp edypVar, Map map, Map map2, errl errlVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2) {
        context.getClass();
        errlVar.getClass();
        fazbVar.getClass();
        ffbrVar.getClass();
        this.a = context;
        this.b = edypVar;
        this.j = map;
        this.c = map2;
        this.d = errlVar;
        this.e = fazbVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        if (!ffdx.ao(((enhk) map).keySet(), ((enhk) map2).keySet()).isEmpty()) {
            Set ao = ffdx.ao(((enhk) map).keySet(), ((enhk) map2).keySet());
            Objects.toString(ao);
            throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(ao.toString()));
        }
        Boolean bool = false;
        bool.getClass();
        this.h = false;
        this.i = edypVar.a() ? ffew.j(map, map2) : map2;
    }

    public static final int b(RandomAccessFile randomAccessFile) {
        int i;
        try {
            i = randomAccessFile.readInt();
        } catch (EOFException unused) {
            i = -1;
        } catch (Throwable th) {
            randomAccessFile.seek(0L);
            throw th;
        }
        randomAccessFile.seek(0L);
        return i;
    }

    public final void a(final boolean z) {
        ekzz f = eleg.f("StartupAfterPackageReplaced");
        try {
            ListenableFuture i = elfr.i(new erog() { // from class: ekhy
                /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[Catch: IOException -> 0x00a1, TRY_ENTER, TryCatch #0 {IOException -> 0x00a1, blocks: (B:3:0x0002, B:5:0x0013, B:7:0x0017, B:9:0x0033, B:10:0x0042, B:12:0x004f, B:14:0x0055, B:31:0x0065, B:19:0x0075, B:22:0x007a, B:26:0x008d, B:27:0x0090, B:33:0x0091, B:34:0x0098, B:35:0x0038, B:36:0x0099, B:37:0x00a0, B:29:0x005e, B:17:0x006b), top: B:2:0x0002, inners: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: IOException -> 0x00a1, TryCatch #0 {IOException -> 0x00a1, blocks: (B:3:0x0002, B:5:0x0013, B:7:0x0017, B:9:0x0033, B:10:0x0042, B:12:0x004f, B:14:0x0055, B:31:0x0065, B:19:0x0075, B:22:0x007a, B:26:0x008d, B:27:0x0090, B:33:0x0091, B:34:0x0098, B:35:0x0038, B:36:0x0099, B:37:0x00a0, B:29:0x005e, B:17:0x006b), top: B:2:0x0002, inners: #1 }] */
                @Override // defpackage.erog
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        r7 = this;
                        ekic r0 = defpackage.ekic.this
                        ffbr r1 = r0.g     // Catch: java.io.IOException -> La1
                        java.lang.Object r1 = r1.b()     // Catch: java.io.IOException -> La1
                        r1.getClass()     // Catch: java.io.IOException -> La1
                        android.content.pm.PackageInfo r1 = (android.content.pm.PackageInfo) r1     // Catch: java.io.IOException -> La1
                        int r2 = r1.versionCode     // Catch: java.io.IOException -> La1
                        android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.io.IOException -> La1
                        if (r1 == 0) goto L99
                        java.lang.String r1 = r1.dataDir     // Catch: java.io.IOException -> La1
                        if (r1 == 0) goto L99
                        java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> La1
                        java.lang.String r4 = "files"
                        r3.<init>(r1, r4)     // Catch: java.io.IOException -> La1
                        java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> La1
                        java.lang.String r4 = "tiktok"
                        r1.<init>(r3, r4)     // Catch: java.io.IOException -> La1
                        r1.mkdirs()     // Catch: java.io.IOException -> La1
                        java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> La1
                        edyp r4 = r0.b     // Catch: java.io.IOException -> La1
                        boolean r4 = r4.a()     // Catch: java.io.IOException -> La1
                        r5 = 0
                        if (r4 == 0) goto L38
                        java.lang.String r4 = defpackage.ekib.a(r5)     // Catch: java.io.IOException -> La1
                        goto L42
                    L38:
                        android.content.Context r4 = r0.a     // Catch: java.io.IOException -> La1
                        java.lang.String r4 = defpackage.edyn.a(r4)     // Catch: java.io.IOException -> La1
                        java.lang.String r4 = defpackage.ekib.a(r4)     // Catch: java.io.IOException -> La1
                    L42:
                        r3.<init>(r1, r4)     // Catch: java.io.IOException -> La1
                        boolean r1 = r3.createNewFile()     // Catch: java.io.IOException -> La1
                        boolean r4 = r3.exists()     // Catch: java.io.IOException -> La1
                        if (r4 == 0) goto L91
                        boolean r4 = r3.isFile()     // Catch: java.io.IOException -> La1
                        if (r4 == 0) goto L91
                        java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> La1
                        java.lang.String r6 = "rw"
                        r4.<init>(r3, r6)     // Catch: java.io.IOException -> La1
                        if (r1 != 0) goto L6a
                        int r1 = defpackage.ekic.b(r4)     // Catch: java.lang.Throwable -> L8c
                        if (r2 == r1) goto L65
                        goto L6a
                    L65:
                        r4.close()     // Catch: java.io.IOException -> La1
                        r1 = r5
                        goto L73
                    L6a:
                        r1 = -1
                        defpackage.ekib.b(r4, r1)     // Catch: java.lang.Throwable -> L8c
                        ekia r1 = new ekia     // Catch: java.lang.Throwable -> L8c
                        r1.<init>()     // Catch: java.lang.Throwable -> L8c
                    L73:
                        if (r1 != 0) goto L7a
                        com.google.common.util.concurrent.ListenableFuture r0 = defpackage.erqt.i(r5)     // Catch: java.io.IOException -> La1
                        return r0
                    L7a:
                        fazb r2 = r0.e     // Catch: java.io.IOException -> La1
                        java.lang.Object r2 = r2.b()     // Catch: java.io.IOException -> La1
                        ejjz r2 = (defpackage.ejjz) r2     // Catch: java.io.IOException -> La1
                        errl r3 = r0.d     // Catch: java.io.IOException -> La1
                        com.google.common.util.concurrent.ListenableFuture r1 = defpackage.elfr.h(r1, r3)     // Catch: java.io.IOException -> La1
                        r2.g(r1)     // Catch: java.io.IOException -> La1
                        return r1
                    L8c:
                        r1 = move-exception
                        r4.close()     // Catch: java.io.IOException -> La1
                        throw r1     // Catch: java.io.IOException -> La1
                    L91:
                        java.io.IOException r1 = new java.io.IOException     // Catch: java.io.IOException -> La1
                        java.lang.String r2 = "Something went wrong creating file to store package version. Will not run package replaced listeners. Will try again on next startup."
                        r1.<init>(r2)     // Catch: java.io.IOException -> La1
                        throw r1     // Catch: java.io.IOException -> La1
                    L99:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> La1
                        java.lang.String r2 = "PackageInfo was invalid."
                        r1.<init>(r2)     // Catch: java.io.IOException -> La1
                        throw r1     // Catch: java.io.IOException -> La1
                    La1:
                        r1 = move-exception
                        boolean r2 = r2
                        java.lang.String r3 = "StartupAfterPkgReplaced"
                        if (r2 == 0) goto Lc0
                        android.content.Context r2 = r0.a
                        boolean r2 = defpackage.dubc.e(r2)
                        if (r2 != 0) goto Lb5
                        java.lang.String r2 = "StartupAfterPackageReplaced failed, device was locked. Will reschedule."
                        android.util.Log.w(r3, r2, r1)
                    Lb5:
                        android.content.Context r1 = r0.a
                        ekhz r2 = new ekhz
                        r2.<init>()
                        defpackage.dubc.b(r1, r2)
                        goto Lc5
                    Lc0:
                        java.lang.String r0 = "StartupAfterPackageReplaced failed, will try again next startup: "
                        android.util.Log.e(r3, r0, r1)
                    Lc5:
                        com.google.common.util.concurrent.ListenableFuture r0 = defpackage.erre.a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ekhy.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.d);
            ejjz ejjzVar = (ejjz) this.e.b();
            f.b(i);
            ejjzVar.e(i, 30L, TimeUnit.SECONDS);
            ffig.a(f, null);
        } finally {
        }
    }
}
