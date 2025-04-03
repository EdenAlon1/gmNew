package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eczp implements Comparable {
    public static final eczo a = new eczo();
    public final ecvo c;
    public final String d;
    public final boolean g;
    public final edbv i;
    private final Set j;
    public final String e = "";
    public final boolean f = false;
    public volatile edbu b = null;
    public final eczv h = new eczv();

    public eczp(ecvo ecvoVar, String str, boolean z, boolean z2, Set set) {
        this.c = ecvoVar;
        this.d = str;
        this.g = z2;
        this.j = set;
        this.i = new edbv(ecvoVar, str, "", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0196 A[Catch: all -> 0x02cc, TryCatch #5 {all -> 0x02cc, blocks: (B:9:0x000f, B:11:0x0034, B:14:0x018d, B:16:0x0196, B:56:0x01a6, B:58:0x01ad, B:61:0x01cd, B:63:0x01e6, B:64:0x01f3, B:66:0x0044, B:68:0x004c, B:70:0x005c, B:71:0x0079, B:73:0x007d, B:74:0x008a, B:75:0x0092, B:78:0x0098, B:81:0x0118, B:85:0x0162, B:86:0x0165, B:90:0x015c, B:93:0x016b), top: B:8:0x000f, outer: #1, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x020d A[Catch: all -> 0x02d3, TryCatch #1 {, blocks: (B:5:0x0007, B:7:0x000b, B:17:0x01ff, B:19:0x020d, B:21:0x0215, B:23:0x021d, B:26:0x023c, B:27:0x0242, B:31:0x026e, B:32:0x02c9, B:49:0x0278, B:51:0x02a4, B:52:0x02b2, B:54:0x02ba, B:97:0x02cd, B:98:0x02d0, B:99:0x02d1, B:9:0x000f, B:11:0x0034, B:14:0x018d, B:16:0x0196, B:56:0x01a6, B:58:0x01ad, B:61:0x01cd, B:63:0x01e6, B:64:0x01f3, B:66:0x0044, B:68:0x004c, B:70:0x005c, B:71:0x0079, B:73:0x007d, B:74:0x008a, B:75:0x0092, B:78:0x0098, B:81:0x0118, B:85:0x0162, B:86:0x0165, B:90:0x015c, B:93:0x016b), top: B:4:0x0007, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a4 A[Catch: all -> 0x02d3, TryCatch #1 {, blocks: (B:5:0x0007, B:7:0x000b, B:17:0x01ff, B:19:0x020d, B:21:0x0215, B:23:0x021d, B:26:0x023c, B:27:0x0242, B:31:0x026e, B:32:0x02c9, B:49:0x0278, B:51:0x02a4, B:52:0x02b2, B:54:0x02ba, B:97:0x02cd, B:98:0x02d0, B:99:0x02d1, B:9:0x000f, B:11:0x0034, B:14:0x018d, B:16:0x0196, B:56:0x01a6, B:58:0x01ad, B:61:0x01cd, B:63:0x01e6, B:64:0x01f3, B:66:0x0044, B:68:0x004c, B:70:0x005c, B:71:0x0079, B:73:0x007d, B:74:0x008a, B:75:0x0092, B:78:0x0098, B:81:0x0118, B:85:0x0162, B:86:0x0165, B:90:0x015c, B:93:0x016b), top: B:4:0x0007, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ba A[Catch: all -> 0x02d3, TryCatch #1 {, blocks: (B:5:0x0007, B:7:0x000b, B:17:0x01ff, B:19:0x020d, B:21:0x0215, B:23:0x021d, B:26:0x023c, B:27:0x0242, B:31:0x026e, B:32:0x02c9, B:49:0x0278, B:51:0x02a4, B:52:0x02b2, B:54:0x02ba, B:97:0x02cd, B:98:0x02d0, B:99:0x02d1, B:9:0x000f, B:11:0x0034, B:14:0x018d, B:16:0x0196, B:56:0x01a6, B:58:0x01ad, B:61:0x01cd, B:63:0x01e6, B:64:0x01f3, B:66:0x0044, B:68:0x004c, B:70:0x005c, B:71:0x0079, B:73:0x007d, B:74:0x008a, B:75:0x0092, B:78:0x0098, B:81:0x0118, B:85:0x0162, B:86:0x0165, B:90:0x015c, B:93:0x016b), top: B:4:0x0007, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a6 A[Catch: all -> 0x02cc, TRY_LEAVE, TryCatch #5 {all -> 0x02cc, blocks: (B:9:0x000f, B:11:0x0034, B:14:0x018d, B:16:0x0196, B:56:0x01a6, B:58:0x01ad, B:61:0x01cd, B:63:0x01e6, B:64:0x01f3, B:66:0x0044, B:68:0x004c, B:70:0x005c, B:71:0x0079, B:73:0x007d, B:74:0x008a, B:75:0x0092, B:78:0x0098, B:81:0x0118, B:85:0x0162, B:86:0x0165, B:90:0x015c, B:93:0x016b), top: B:8:0x000f, outer: #1, inners: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.edbu a() {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eczp.a():edbu");
    }

    public final void b() {
        final edbv edbvVar = this.i;
        final ListenableFuture a2 = edbvVar.a(this.e);
        erny.g(a2, new eroh() { // from class: eczf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return edbv.this.b((edbx) obj);
            }
        }, this.c.e()).b(new Runnable() { // from class: eczg
            @Override // java.lang.Runnable
            public final void run() {
                eczp.this.c(a2);
            }
        }, this.c.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: CancellationException -> 0x0069, CancellationException | ExecutionException -> 0x006b, TRY_LEAVE, TryCatch #3 {CancellationException | ExecutionException -> 0x006b, blocks: (B:2:0x0000, B:4:0x0016, B:6:0x0023, B:8:0x002d, B:10:0x0039, B:14:0x0040, B:16:0x0049, B:19:0x001a, B:30:0x0068), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void c(com.google.common.util.concurrent.ListenableFuture r4) {
        /*
            r3 = this;
            java.lang.Object r4 = defpackage.erqt.q(r4)     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            edbx r4 = (defpackage.edbx) r4     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            edbt r0 = new edbt     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            r1 = 6
            r2 = 2
            r0.<init>(r1, r2)     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            edbu r1 = new edbu     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            r1.<init>(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            boolean r0 = r3.g     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            if (r0 != 0) goto L1a
            edbu r2 = r3.b     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            if (r2 != 0) goto L23
        L1a:
            monitor-enter(r3)     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            if (r0 != 0) goto L3d
            edbu r2 = r3.b     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L22
            goto L3d
        L22:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L66
        L23:
            enhk r0 = r2.e     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            enhk r1 = r1.e     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            boolean r0 = defpackage.ennc.m(r0, r1)     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            if (r0 != 0) goto L40
            ecvo r4 = r3.c     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            emyl r4 = r4.e     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            edav r4 = (defpackage.edav) r4     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            if (r4 == 0) goto L8e
            r4.a()     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            return
        L3d:
            r3.b = r1     // Catch: java.lang.Throwable -> L66
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L66
        L40:
            eczv r0 = r3.h     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            r0.b()     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            boolean r0 = r3.g     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            if (r0 == 0) goto L8e
            ecvo r0 = r3.c     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            ecxc r0 = r0.b()     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            java.lang.String r4 = r4.c     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            com.google.common.util.concurrent.ListenableFuture r4 = r0.a(r4)     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            ecze r1 = new ecze     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            r1.<init>()     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            ecvo r2 = r3.c     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            errm r2 = r2.e()     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            defpackage.ernq.f(r4, r0, r1, r2)     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
            return
        L66:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L66
            throw r4     // Catch: java.util.concurrent.CancellationException -> L69 java.util.concurrent.ExecutionException -> L6b
        L69:
            r4 = move-exception
            goto L6c
        L6b:
            r4 = move-exception
        L6c:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 != 0) goto L8e
            java.lang.String r0 = r3.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to update local snapshot for "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", may result in stale flags."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MobStoreFlagStore"
            android.util.Log.w(r1, r0, r4)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eczp.c(com.google.common.util.concurrent.ListenableFuture):void");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.e.compareTo((String) obj);
    }
}
