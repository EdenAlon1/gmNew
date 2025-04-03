package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqma extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Set b;
    final /* synthetic */ aqmh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqma(ffgu ffguVar, Set set, aqmh aqmhVar) {
        super(2, ffguVar);
        this.b = set;
        this.c = aqmhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqma) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c3 A[LOOP:0: B:12:0x00bd->B:14:0x00c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ee A[LOOP:1: B:17:0x00e8->B:19:0x00ee, LOOP_END] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqma.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aqma aqmaVar = new aqma(ffguVar, this.b, this.c);
        aqmaVar.d = obj;
        return aqmaVar;
    }
}
