package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dssx implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ dstm b;
    final /* synthetic */ dstm c;
    final /* synthetic */ dsou d;

    public dssx(dsou dsouVar, hvi hviVar, dstm dstmVar, dstm dstmVar2) {
        this.d = dsouVar;
        this.a = hviVar;
        this.b = dstmVar;
        this.c = dstmVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dsou dsouVar = this.d;
            hvi hviVar = this.a;
            dstm dstmVar = this.b;
            dssz.c(dsouVar, hviVar, dstmVar.a, dstmVar.b, hfdVar, 0);
            dsou dsouVar2 = this.d;
            hvi hviVar2 = this.a;
            dstm dstmVar2 = this.c;
            dssz.c(dsouVar2, hviVar2, dstmVar2.a, dstmVar2.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
