package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvx extends ffhu implements ffjm {
    int a;
    final /* synthetic */ View b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvx(View view, ffgu ffguVar) {
        super(ffguVar);
        this.b = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kvx) c((ffnn) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r4 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r1.a(r4, r3) != r0) goto L9;
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
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r4)
            goto L4d
        Ld:
            java.lang.Object r1 = r3.c
            ffnn r1 = (defpackage.ffnn) r1
            defpackage.ffci.b(r4)
            goto L29
        L15:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.c
            r1 = r4
            ffnn r1 = (defpackage.ffnn) r1
            android.view.View r4 = r3.b
            r3.c = r1
            r3.a = r2
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 == r0) goto L50
        L29:
            android.view.View r4 = r3.b
            boolean r2 = r4 instanceof android.view.ViewGroup
            if (r2 == 0) goto L4d
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            kvw r2 = new kvw
            r2.<init>(r4)
            r4 = 0
            r3.c = r4
            r4 = 2
            r3.a = r4
            java.util.Iterator r4 = r2.a()
            java.lang.Object r4 = r1.b(r4, r3)
            ffhh r1 = defpackage.ffhh.a
            if (r4 == r1) goto L4a
            ffcu r4 = defpackage.ffcu.a
        L4a:
            if (r4 != r0) goto L4d
            goto L50
        L4d:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        kvx kvxVar = new kvx(this.b, ffguVar);
        kvxVar.c = obj;
        return kvxVar;
    }
}
