package defpackage;

import androidx.compose.foundation.selection.ToggleableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epw extends ffkk implements ffjn {
    final /* synthetic */ dgz a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ jjj d;
    final /* synthetic */ ffji e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epw(dgz dgzVar, boolean z, boolean z2, jjj jjjVar, ffji ffjiVar) {
        super(3);
        this.a = dgzVar;
        this.b = z;
        this.c = z2;
        this.d = jjjVar;
        this.e = ffjiVar;
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
        hvi a = dhc.a(hvi.e, dwnVar, this.a).a(new ToggleableElement(this.b, dwnVar, null, this.c, this.d, this.e));
        hfdVar.o();
        return a;
    }
}
