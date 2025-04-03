package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Map b;
    final /* synthetic */ ccxe c;
    final /* synthetic */ ccvl d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccwy(ffgu ffguVar, Map map, ccxe ccxeVar, ccvl ccvlVar) {
        super(2, ffguVar);
        this.b = map;
        this.c = ccxeVar;
        this.d = ccvlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccwy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:64|(2:65|66)|(3:71|72|73)|74|75|76|(1:78)(2:86|(1:93)(1:92))|79|(4:81|82|83|73)(3:84|85|73)|62) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c6, code lost:
    
        r0 = j$.util.Optional.empty();
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccwy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccwy ccwyVar = new ccwy(ffguVar, this.b, this.c, this.d);
        ccwyVar.e = obj;
        return ccwyVar;
    }
}
