package defpackage;

import androidx.compose.foundation.ClickableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dex extends ffkk implements ffjn {
    final /* synthetic */ dgz a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ jjj d;
    final /* synthetic */ ffix e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dex(dgz dgzVar, boolean z, String str, jjj jjjVar, ffix ffixVar) {
        super(3);
        this.a = dgzVar;
        this.b = z;
        this.c = str;
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
        hvi a = dhc.a(hvi.e, dwnVar, this.a).a(new ClickableElement(dwnVar, null, this.b, this.c, this.d, this.e));
        hfdVar.o();
        return a;
    }
}
