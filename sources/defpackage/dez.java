package defpackage;

import androidx.compose.foundation.CombinedClickableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dez extends ffkk implements ffjn {
    final /* synthetic */ dgz a;
    final /* synthetic */ boolean b;
    final /* synthetic */ jjj c;
    final /* synthetic */ ffix d;
    final /* synthetic */ ffix e;
    final /* synthetic */ ffix f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dez(dgz dgzVar, boolean z, jjj jjjVar, ffix ffixVar, ffix ffixVar2, ffix ffixVar3) {
        super(3);
        this.a = dgzVar;
        this.b = z;
        this.c = jjjVar;
        this.d = ffixVar;
        this.e = ffixVar2;
        this.f = ffixVar3;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-1525724089);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = new dwn();
            hfdVar.y(f);
        }
        dwn dwnVar = (dwn) f;
        hvi a = dhc.a(hvi.e, dwnVar, this.a).a(new CombinedClickableElement(dwnVar, null, this.b, this.c, this.d, this.e, this.f));
        hfdVar.o();
        return a;
    }
}
