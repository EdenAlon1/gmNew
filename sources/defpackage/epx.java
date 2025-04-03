package defpackage;

import androidx.compose.foundation.selection.TriStateToggleableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epx extends ffkk implements ffjn {
    final /* synthetic */ dgz a;
    final /* synthetic */ jlc b;
    final /* synthetic */ boolean c;
    final /* synthetic */ jjj d;
    final /* synthetic */ ffix e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epx(dgz dgzVar, jlc jlcVar, boolean z, jjj jjjVar, ffix ffixVar) {
        super(3);
        this.a = dgzVar;
        this.b = jlcVar;
        this.c = z;
        this.d = jjjVar;
        this.e = ffixVar;
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
        hvi a = dhc.a(hvi.e, dwnVar, this.a).a(new TriStateToggleableElement(this.b, dwnVar, null, this.c, this.d, this.e));
        hfdVar.o();
        return a;
    }
}
