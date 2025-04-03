package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aycy extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ aycz c;
    final /* synthetic */ WorkerParameters d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aycy(aycz ayczVar, WorkerParameters workerParameters, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ayczVar;
        this.d = workerParameters;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aycy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aycy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aycy(this.c, this.d, ffguVar);
    }
}
