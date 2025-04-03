package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wij extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Optional b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wij(Optional optional, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = optional;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wij) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if (r1.fQ(r4, r5) != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r6 != r0) goto L11;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.ffci.b(r6)
            goto L4e
        Le:
            java.lang.Object r1 = r5.d
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r6)
            goto L3f
        L16:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.d
            r1 = r6
            ffxy r1 = (defpackage.ffxy) r1
            int r6 = defpackage.aixt.a
            j$.util.Optional r6 = r5.b
            aixr r4 = defpackage.aixq.a
            boolean r6 = r6.isPresent()
            if (r6 == 0) goto L42
            j$.util.Optional r6 = r5.b
            java.lang.Object r6 = r6.get()
            aixt r6 = (defpackage.aixt) r6
            java.util.List r4 = r5.c
            r5.d = r1
            r5.a = r3
            r3 = 0
            java.lang.Object r6 = defpackage.aixp.a(r6, r4, r3, r5, r2)
            if (r6 == r0) goto L4d
        L3f:
            r4 = r6
            aixr r4 = (defpackage.aixr) r4
        L42:
            r6 = 0
            r5.d = r6
            r5.a = r2
            java.lang.Object r6 = r1.fQ(r4, r5)
            if (r6 != r0) goto L4e
        L4d:
            return r0
        L4e:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wij.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        wij wijVar = new wij(this.b, this.c, ffguVar);
        wijVar.d = obj;
        return wijVar;
    }
}
