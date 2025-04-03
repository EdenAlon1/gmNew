package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpzs extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ List c;
    final /* synthetic */ dpzt d;
    final /* synthetic */ ffjm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpzs(List list, dpzt dpztVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = list;
        this.d = dpztVar;
        this.e = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpzs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r3.a(r10, r9) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r10 != r0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0055 -> B:5:0x001f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0058 -> B:5:0x001f). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.b
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 == r2) goto Lf
            java.lang.Object r1 = r9.a
            defpackage.ffci.b(r10)
            goto L1f
        Lf:
            java.lang.Object r1 = r9.a
            defpackage.ffci.b(r10)
            r8 = r9
            goto L40
        L16:
            defpackage.ffci.b(r10)
            java.util.List r10 = r9.c
            java.util.Iterator r1 = r10.iterator()
        L1f:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L7a
            java.lang.Object r10 = r1.next()
            r4 = r10
            android.net.Uri r4 = (android.net.Uri) r4
            dpzt r10 = r9.d
            dpgi r5 = defpackage.dpgi.a
            r9.a = r1
            r9.b = r2
            dozh r3 = r10.c
            r6 = 1
            dozg r7 = defpackage.dozg.a
            r8 = r9
            java.lang.Object r10 = r3.c(r4, r5, r6, r7, r8)
            if (r10 == r0) goto L79
        L40:
            boolean r3 = r10 instanceof defpackage.drnm
            if (r3 == 0) goto L47
            drnm r10 = (defpackage.drnm) r10
            goto L48
        L47:
            r10 = 0
        L48:
            if (r10 == 0) goto L58
            ffjm r3 = r8.e
            r8.a = r1
            r4 = 2
            r8.b = r4
            java.lang.Object r10 = r3.a(r10, r9)
            if (r10 != r0) goto L1f
            goto L79
        L58:
            enru r10 = defpackage.dpzt.a
            ensk r10 = r10.i()
            enrr r10 = (defpackage.enrr) r10
            ensy r3 = defpackage.ensy.MEDIUM
            r10.aa(r3)
            java.lang.String r3 = "invokeSuspend"
            r4 = 142(0x8e, float:1.99E-43)
            java.lang.String r5 = "com/google/android/libraries/compose/cameragallery/ui/gallery/GalleryUiAdapter$resolveAndPerform$1"
            java.lang.String r6 = "GalleryUiAdapter.kt"
            ensk r10 = r10.h(r5, r3, r4, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r3 = "System content picker media was not resolved as local visual media."
            r10.q(r3)
            goto L1f
        L79:
            return r0
        L7a:
            r8 = r9
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpzs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpzs(this.c, this.d, this.e, ffguVar);
    }
}
