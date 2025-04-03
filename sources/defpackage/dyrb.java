package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyrb {
    final long a;
    private final Context b;
    private final dyti c;

    public dyrb(Context context, dyti dytiVar, long j) {
        this.b = context.getApplicationContext();
        this.c = dytiVar;
        this.a = j;
    }

    private final Uri d() {
        String valueOf = String.valueOf(this.b.getPackageName());
        return dytn.a(valueOf.concat(".lighter.data"), "MESSAGING", "kvstore", Long.toString(this.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.emxc a(java.lang.String r8) {
        /*
            r7 = this;
            android.net.Uri r1 = r7.d()
            java.lang.String[] r2 = defpackage.dywn.a
            java.lang.String[] r4 = new java.lang.String[]{r8}
            dyti r0 = r7.c
            java.lang.String r3 = "key = ?"
            r5 = 0
            java.lang.String r6 = "1"
            android.database.Cursor r8 = r0.h(r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L28
            boolean r0 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L1e
            goto L28
        L1e:
            r0 = 1
            byte[] r0 = r8.getBlob(r0)     // Catch: java.lang.Throwable -> L30
            emxc r0 = defpackage.emxc.j(r0)     // Catch: java.lang.Throwable -> L30
            goto L2a
        L28:
            emux r0 = defpackage.emux.a     // Catch: java.lang.Throwable -> L30
        L2a:
            if (r8 == 0) goto L2f
            r8.close()
        L2f:
            return r0
        L30:
            r0 = move-exception
            r1 = r0
            if (r8 == 0) goto L3d
            r8.close()     // Catch: java.lang.Throwable -> L38
            goto L3d
        L38:
            r0 = move-exception
            r8 = r0
            r1.addSuppressed(r8)
        L3d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyrb.a(java.lang.String):emxc");
    }

    public final void b() {
        this.c.a(d(), "key = ?", new String[]{"CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP"});
    }

    public final void c(String str, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, bArr);
        this.c.c(d(), contentValues, 5);
    }
}
