package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmcc implements ffjn {
    final /* synthetic */ dmzz a;
    final /* synthetic */ dmci b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;
    final /* synthetic */ ffix e;

    public dmcc(dmzz dmzzVar, dmci dmciVar, boolean z, String str, ffix ffixVar) {
        this.a = dmzzVar;
        this.b = dmciVar;
        this.c = z;
        this.d = str;
        this.e = ffixVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dyh) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            igq a = dnaa.a(this.a, hfdVar);
            dmci dmciVar = this.b;
            hfdVar.v(-1497247473);
            long j = dmciVar.a == 1 ? ((ibw) hfdVar.e(fzc.a)).i : ibw.a;
            hfdVar.o();
            c = ebs.c(eba.d(hvi.e, 4.0f), 1.0f);
            hvi j2 = eba.j(c, 0.0f, 0.0f, 0.0f, 1.0f, 7);
            boolean z = this.c;
            ffix ffixVar = this.e;
            if (!z) {
                j2 = j2.a(dfb.d(hvi.e, false, null, ffixVar, 7));
            }
            dwho.a(a, this.d, j2, j, hfdVar, 0, 0);
        }
        return ffcu.a;
    }
}
