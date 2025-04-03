package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbsi implements dhwa {
    final /* synthetic */ dbsl a;

    public dbsi(dbsl dbslVar) {
        this.a = dbslVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        ((defpackage.dbsx) r1).b.add(r3);
        ((defpackage.dbsx) r1).a(r3);
     */
    @Override // defpackage.dhwa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.dhvz r6) {
        /*
            r5 = this;
            dbsl r0 = r5.a
            elbx r0 = r0.h
            java.lang.String r1 = "QrScanner.receiveDetections"
            ekzm r0 = r0.b(r1)
            dbsl r1 = r5.a     // Catch: java.lang.Throwable -> L3e
            dbrt r1 = r1.l     // Catch: java.lang.Throwable -> L3e
            android.util.SparseArray r6 = r6.a     // Catch: java.lang.Throwable -> L3e
            r2 = 0
        L11:
            int r3 = r6.size()     // Catch: java.lang.Throwable -> L3e
            if (r2 >= r3) goto L3a
            java.lang.Object r3 = r6.valueAt(r2)     // Catch: java.lang.Throwable -> L3e
            com.google.android.libraries.barhopper.Barcode r3 = (com.google.android.libraries.barhopper.Barcode) r3     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r3.rawValue     // Catch: java.lang.Throwable -> L3e
            r4 = r1
            dbsx r4 = (defpackage.dbsx) r4     // Catch: java.lang.Throwable -> L3e
            java.util.Set r4 = r4.b     // Catch: java.lang.Throwable -> L3e
            boolean r4 = r4.contains(r3)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L2d
            int r2 = r2 + 1
            goto L11
        L2d:
            r6 = r1
            dbsx r6 = (defpackage.dbsx) r6     // Catch: java.lang.Throwable -> L3e
            java.util.Set r6 = r6.b     // Catch: java.lang.Throwable -> L3e
            r6.add(r3)     // Catch: java.lang.Throwable -> L3e
            dbsx r1 = (defpackage.dbsx) r1     // Catch: java.lang.Throwable -> L3e
            r1.a(r3)     // Catch: java.lang.Throwable -> L3e
        L3a:
            r0.close()
            return
        L3e:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r0 = move-exception
            r6.addSuppressed(r0)
        L47:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbsi.a(dhvz):void");
    }
}
