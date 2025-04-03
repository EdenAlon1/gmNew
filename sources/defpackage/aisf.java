package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aisf extends ffhu implements ffjm {
    int a;
    final /* synthetic */ Cursor b;
    final /* synthetic */ ffji c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisf(Cursor cursor, ffji ffjiVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = cursor;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aisf) c((ffnn) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0018, code lost:
    
        if (r3.b != null) goto L16;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            if (r1 == 0) goto Le
            java.lang.Object r1 = r3.d
            ffnn r1 = (defpackage.ffnn) r1
            defpackage.ffci.b(r4)
            goto L1a
        Le:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.d
            r1 = r4
            ffnn r1 = (defpackage.ffnn) r1
            android.database.Cursor r4 = r3.b
            if (r4 == 0) goto L36
        L1a:
            android.database.Cursor r4 = r3.b
            boolean r4 = r4.moveToNext()
            if (r4 == 0) goto L36
            ffji r4 = r3.c
            android.database.Cursor r2 = r3.b
            java.lang.Object r4 = r4.invoke(r2)
            r3.d = r1
            r2 = 1
            r3.a = r2
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 != r0) goto L1a
            return r0
        L36:
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aisf aisfVar = new aisf(this.b, this.c, ffguVar);
        aisfVar.d = obj;
        return aisfVar;
    }
}
