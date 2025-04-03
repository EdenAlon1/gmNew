package defpackage;

import j$.util.Optional;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqse {
    public final dqrv a;
    private final ffsk b;
    private final efbm c;

    public dqse(ffsk ffskVar, Optional optional, efbm efbmVar) {
        ffskVar.getClass();
        efbmVar.getClass();
        this.b = ffskVar;
        this.c = efbmVar;
        this.a = (dqrv) fflm.b(optional);
    }

    public static final void c(InputStream inputStream, File file, final Locale locale) {
        final ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        try {
            ffnf ffnfVar = new ffnf(new ffng(ffno.d(new ffix() { // from class: dqrz
                @Override // defpackage.ffix
                public final Object invoke() {
                    return zipInputStream.getNextEntry();
                }
            }), true, new ffji() { // from class: dqsa
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ZipEntry zipEntry = (ZipEntry) obj;
                    zipEntry.getClass();
                    boolean z = false;
                    if (!zipEntry.isDirectory()) {
                        if (ffkj.e(eeps.a(zipEntry), dqks.a(locale))) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }));
            while (ffnfVar.hasNext()) {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    ffif.b(zipInputStream, fileOutputStream);
                    ffig.a(fileOutputStream, null);
                    zipInputStream.closeEntry();
                } finally {
                }
            }
            ffig.a(zipInputStream, null);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dqrv r5, java.util.Locale r6, java.io.File r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.dqsb
            if (r0 == 0) goto L13
            r0 = r8
            dqsb r0 = (defpackage.dqsb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqsb r0 = new dqsb
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.a
            java.util.Locale r6 = r0.f
            dqse r5 = r0.e
            defpackage.ffci.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ffci.b(r8)
            java.lang.String r8 = defpackage.dqks.a(r6)
            r0.e = r4
            r0.f = r6
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r5.a(r8, r0)
            if (r8 == r1) goto L76
            r5 = r4
        L4b:
            android.net.Uri r8 = (android.net.Uri) r8
            if (r8 == 0) goto L73
            efbm r5 = r5.c
            efdy r0 = new efdy
            r0.<init>()
            java.lang.Object r5 = r5.c(r8, r0)
            java.io.Closeable r5 = (java.io.Closeable) r5
            r8 = r5
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch: java.lang.Throwable -> L6c
            r8.getClass()     // Catch: java.lang.Throwable -> L6c
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Throwable -> L6c
            c(r8, r7, r6)     // Catch: java.lang.Throwable -> L6c
            r6 = 0
            defpackage.ffig.a(r5, r6)
            goto L73
        L6c:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L6e
        L6e:
            r7 = move-exception
            defpackage.ffig.a(r5, r6)
            throw r7
        L73:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqse.a(dqrv, java.util.Locale, java.io.File, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007f -> B:10:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r12, java.util.List r13, defpackage.ffgu r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.dqsd
            if (r0 == 0) goto L13
            r0 = r14
            dqsd r0 = (defpackage.dqsd) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            dqsd r0 = new dqsd
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r12 = r0.c
            java.lang.Object r13 = r0.b
            java.lang.Object r2 = r0.a
            dqse r4 = r0.g
            defpackage.ffci.b(r14)
            r8 = r0
            r0 = r13
            r13 = r2
            r2 = r8
            r8 = r4
            goto L83
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3c:
            defpackage.ffci.b(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
            r8 = r13
            r13 = r12
            r12 = r8
            r8 = r11
        L4c:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r12.next()
            r6 = r2
            java.util.Locale r6 = (java.util.Locale) r6
            r0.g = r8
            r0.a = r13
            r0.b = r14
            r0.c = r12
            r0.f = r3
            java.util.Locale r2 = java.util.Locale.US
            boolean r7 = defpackage.ffkj.e(r6, r2)
            ffsk r2 = r8.b
            ffhd r2 = r2.hT()
            dqsc r4 = new dqsc
            r5 = r13
            android.content.Context r5 = (android.content.Context) r5
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r2 = defpackage.ffra.a(r2, r4, r0)
            if (r2 != r1) goto L7f
            return r1
        L7f:
            r10 = r0
            r0 = r14
            r14 = r2
            r2 = r10
        L83:
            java.io.File r14 = (java.io.File) r14
            if (r14 == 0) goto L8a
            r0.add(r14)
        L8a:
            r14 = r0
            r0 = r2
            goto L4c
        L8d:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqse.b(android.content.Context, java.util.List, ffgu):java.lang.Object");
    }
}
