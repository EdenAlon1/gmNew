package defpackage;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlij {
    public static final /* synthetic */ int a = 0;
    private static final enru b = enru.c("com/google/android/libraries/abuse/hades/moirai/storage/ProtectionsPersistence");
    private static final fgjb c = new fgjf();
    private final Context d;
    private final dlfe e;

    public dlij(Context context, dlfe dlfeVar) {
        context.getClass();
        this.d = context;
        this.e = dlfeVar;
    }

    private final File f(dlgb dlgbVar) {
        String str = "moirai_persephone_scar";
        if (!ffkj.e(dlgbVar.b, "")) {
            str = String.format("%s_%s", Arrays.copyOf(new Object[]{"moirai_persephone_scar", dlgbVar.b}, 2));
            str.getClass();
        }
        return this.d.getFileStreamPath(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dlgb r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dlif
            if (r0 == 0) goto L13
            r0 = r7
            dlif r0 = (defpackage.dlif) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlif r0 = new dlif
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            fgjf r6 = r0.f
            dlgb r1 = r0.e
            dlij r0 = r0.d
            defpackage.ffci.b(r7)
            r7 = r6
            r6 = r1
            goto L4f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.ffci.b(r7)
            fgjb r7 = defpackage.dlij.c
            r0.d = r5
            r0.e = r6
            r2 = r7
            fgjf r2 = (defpackage.fgjf) r2
            r0.f = r2
            r0.c = r3
            java.lang.Object r0 = r7.a(r4, r0)
            if (r0 == r1) goto L87
            r0 = r5
        L4f:
            java.io.File r6 = r0.f(r6)     // Catch: java.lang.Throwable -> L82
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = r6.getPath()     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = ".new"
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L82
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L82
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = r6.getPath()     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = ".bak"
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L82
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L82
            defpackage.kso.c(r6, r0, r1)     // Catch: java.lang.Throwable -> L82
            r7.b(r4)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L82:
            r6 = move-exception
            r7.b(r4)
            throw r6
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlij.a(dlgb, ffgu):java.lang.Object");
    }

    public final Object b(dlgb dlgbVar, ffgu ffguVar) {
        ffji ffjiVar = new ffji() { // from class: dlie
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                InputStream inputStream = (InputStream) obj;
                int i = dlij.a;
                inputStream.getClass();
                return (ewev) eyfy.parseFrom(ewev.a, inputStream);
            }
        };
        File f = f(dlgbVar);
        f.getClass();
        return c(dlgbVar, ffjiVar, f, ffguVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(7:(2:3|(19:5|6|7|(1:(1:(5:11|12|13|14|15)(2:21|22))(3:23|24|25))(11:74|75|76|77|78|79|80|81|82|(1:84)|70)|26|27|28|29|30|(1:32)|33|(1:39)|40|41|42|43|44|45|46))|41|42|43|44|45|46)|7|(0)(0)|26|27|28|29|30|(0)|33|(3:35|37|39)|40|(2:(0)|(1:52))) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[Catch: all -> 0x0104, TryCatch #1 {all -> 0x0104, blocks: (B:30:0x0095, B:32:0x00bb, B:33:0x00c1, B:35:0x00c7, B:37:0x00d0, B:39:0x00d6, B:40:0x00e8, B:44:0x00f5, B:54:0x0100, B:55:0x0103, B:42:0x00f0, B:51:0x00fe), top: B:29:0x0095, inners: #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dlgb r20, defpackage.ffji r21, java.io.File r22, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlij.c(dlgb, ffji, java.io.File, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0229, code lost:
    
        if (r6.e(r0, r1, r4) == r5) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.dlgb r19, defpackage.ewev r20, defpackage.ffjm r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlij.d(dlgb, ewev, ffjm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:3|(16:5|6|(1:(1:9)(2:56|57))(2:58|(1:60))|10|11|(1:13)|14|15|16|17|(1:19)|20|21|22|23|24))|10|11|(0)|14|15|16|17|(0)|20|21|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        android.util.Log.e("AtomicFile", "Failed to close file output stream", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e0, code lost:
    
        ((defpackage.enrr) ((defpackage.enrr) defpackage.dlij.b.i()).g(r12).h("com/google/android/libraries/abuse/hades/moirai/storage/ProtectionsPersistence", "writeInternal", 132, "ProtectionsPersistence.kt")).t("Error writing persephone sync to file %s", ((java.io.File) r13).getAbsolutePath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0103, code lost:
    
        if (defpackage.kso.b(r7) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0105, code lost:
    
        android.util.Log.e("AtomicFile", "Failed to sync file output stream");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0114, code lost:
    
        if (r6.delete() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        r6.toString();
        android.util.Log.e("AtomicFile", "Failed to delete new file ".concat(r6.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010c, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010d, code lost:
    
        android.util.Log.e("AtomicFile", "Failed to close file output stream", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        if (r6.getParentFile().mkdirs() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0140, code lost:
    
        r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0152, code lost:
    
        throw new java.io.IOException("Failed to create directory for ".concat(r6.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        r7 = new java.io.FileOutputStream(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012c, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        throw new java.io.IOException("Failed to create new file ".concat(r6.toString()), r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008f A[Catch: all -> 0x0153, TRY_LEAVE, TryCatch #1 {all -> 0x0153, blocks: (B:11:0x005d, B:13:0x008f, B:15:0x0095, B:17:0x00aa, B:19:0x00b3, B:21:0x00b6, B:22:0x00be, B:29:0x00bb, B:31:0x00e0, B:33:0x0105, B:35:0x0108, B:36:0x0110, B:38:0x0116, B:41:0x010d, B:43:0x009b, B:48:0x00a5, B:45:0x0140, B:46:0x0152, B:51:0x012d, B:52:0x013f), top: B:10:0x005d, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3 A[Catch: IOException -> 0x00df, all -> 0x0153, TRY_LEAVE, TryCatch #2 {IOException -> 0x00df, blocks: (B:17:0x00aa, B:19:0x00b3, B:22:0x00be, B:29:0x00bb), top: B:16:0x00aa, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.eyhs r12, java.io.File r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlij.e(eyhs, java.io.File, ffgu):java.lang.Object");
    }
}
