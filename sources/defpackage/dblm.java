package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dblm {
    public final dtve a;
    private final Context b;
    private final ffhd c;

    public dblm(dtve dtveVar, Context context, ffhd ffhdVar) {
        dtveVar.getClass();
        context.getClass();
        ffhdVar.getClass();
        this.a = dtveVar;
        this.b = context;
        this.c = ffhdVar;
    }

    public static final List b(String str, ffji ffjiVar) {
        dblj dbljVar = new dblj(str);
        ffjiVar.invoke(dbljVar);
        return ffdx.ak(dbljVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dbll
            if (r0 == 0) goto L13
            r0 = r6
            dbll r0 = (defpackage.dbll) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbll r0 = new dbll
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dblm r0 = r0.d
            defpackage.ffci.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.c
            ffhd r6 = defpackage.ekxi.a(r6)
            dblk r2 = new dblk
            r4 = 0
            r2.<init>(r4, r5)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
        L4c:
            android.content.Context r6 = r0.b
            java.lang.String r0 = "Inserted successfully"
            r1 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r0, r1)
            r6.show()
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dblm.a(ffgu):java.lang.Object");
    }
}
