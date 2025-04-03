package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqrp extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ aqkp d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ aqru g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqrp(aqkp aqkpVar, List list, List list2, int i, aqru aqruVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = aqkpVar;
        this.e = list;
        this.f = list2;
        this.h = i;
        this.g = aqruVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqrp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
    
        if (r14 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0057, code lost:
    
        if (r14 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00f6, code lost:
    
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d1 -> B:7:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ed -> B:5:0x00f0). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqrp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqrp(this.d, this.e, this.f, this.h, this.g, ffguVar);
    }
}
