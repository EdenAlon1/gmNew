package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdz implements efbi {
    public boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if ((android.system.Os.lstat(r0.getAbsolutePath()).st_mode & android.system.OsConstants.S_IFLNK) != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(defpackage.efbm r3, android.net.Uri r4, java.util.List r5) {
        /*
            r2 = this;
            efdw r0 = new efdw
            r0.<init>()
            r0.c()
            boolean r1 = r3.i(r4)     // Catch: java.io.IOException -> L51
            if (r1 == 0) goto L4d
            boolean r1 = r2.a     // Catch: java.io.IOException -> L51
            if (r1 == 0) goto L31
            java.lang.Object r0 = r3.c(r4, r0)     // Catch: java.lang.Exception -> L31
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L31
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L31
            if (r1 != 0) goto L21
            goto L31
        L21:
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L31
            android.system.StructStat r0 = android.system.Os.lstat(r0)     // Catch: java.lang.Exception -> L31
            int r0 = r0.st_mode     // Catch: java.lang.Exception -> L31
            int r1 = android.system.OsConstants.S_IFLNK     // Catch: java.lang.Exception -> L31
            r0 = r0 & r1
            if (r0 == 0) goto L31
            goto L49
        L31:
            java.lang.Iterable r0 = r3.b(r4)     // Catch: java.io.IOException -> L51
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L51
        L39:
            boolean r1 = r0.hasNext()     // Catch: java.io.IOException -> L51
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()     // Catch: java.io.IOException -> L51
            android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.io.IOException -> L51
            r2.b(r3, r1, r5)     // Catch: java.io.IOException -> L51
            goto L39
        L49:
            r3.e(r4)     // Catch: java.io.IOException -> L51
            return
        L4d:
            r3.f(r4)     // Catch: java.io.IOException -> L51
            return
        L51:
            r3 = move-exception
            r5.add(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efdz.b(efbm, android.net.Uri, java.util.List):void");
    }

    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        ArrayList arrayList = new ArrayList();
        b(efbhVar.a, efbhVar.f, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        IOException iOException = new IOException("Failed to delete one or more files");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iOException.addSuppressed((IOException) it.next());
        }
        throw iOException;
    }
}
