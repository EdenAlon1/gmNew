package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wue extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wug b;
    final /* synthetic */ List c;
    final /* synthetic */ ffix d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wue(wug wugVar, List list, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wugVar;
        this.c = list;
        this.d = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wue) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f7, code lost:
    
        r7.d.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
    
        if (r8 != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ec, code lost:
    
        if (r8 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00db, code lost:
    
        r7.d.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f5, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L37;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wue.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wue(this.b, this.c, this.d, ffguVar);
    }
}
