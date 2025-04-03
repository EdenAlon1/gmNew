package defpackage;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opf {
    private static final String c = "/data/misc/profiles/cur/" + opl.a();
    public static final ope a = new opc();
    static final ope b = new opd();

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static void b(Executor executor, final ope opeVar, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: opa
            @Override // java.lang.Runnable
            public final void run() {
                ope opeVar2 = opf.a;
                ope.this.a(i, obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0346 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v2, types: [oov] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v32 */
    /* JADX WARN: Type inference failed for: r18v33 */
    /* JADX WARN: Type inference failed for: r18v35 */
    /* JADX WARN: Type inference failed for: r18v36 */
    /* JADX WARN: Type inference failed for: r18v37 */
    /* JADX WARN: Type inference failed for: r18v42 */
    /* JADX WARN: Type inference failed for: r18v46 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v50 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v61 */
    /* JADX WARN: Type inference failed for: r18v67 */
    /* JADX WARN: Type inference failed for: r18v68 */
    /* JADX WARN: Type inference failed for: r18v69 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v70 */
    /* JADX WARN: Type inference failed for: r18v71 */
    /* JADX WARN: Type inference failed for: r18v77 */
    /* JADX WARN: Type inference failed for: r18v78 */
    /* JADX WARN: Type inference failed for: r18v79 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r3v23, types: [oov[]] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51, types: [byte[], oov[]] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r6v2, types: [oov] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r32, java.util.concurrent.Executor r33, defpackage.ope r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 2585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opf.c(android.content.Context, java.util.concurrent.Executor, ope, boolean):void");
    }
}
