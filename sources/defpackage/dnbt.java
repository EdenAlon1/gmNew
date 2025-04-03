package defpackage;

import android.graphics.Point;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnbt implements ffjo {
    final /* synthetic */ hho a;
    final /* synthetic */ hho b;
    final /* synthetic */ dnbm c;
    final /* synthetic */ inp d;

    public dnbt(hho hhoVar, hho hhoVar2, dnbm dnbmVar, inp inpVar) {
        this.a = hhoVar;
        this.b = hhoVar2;
        this.c = dnbmVar;
        this.d = inpVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Point point = (Point) obj;
        hvi hviVar = (hvi) obj2;
        hfd hfdVar = (hfd) obj3;
        ((Number) obj4).intValue();
        hviVar.getClass();
        Uri a = dnbu.c(dnbu.b(this.a)) ? dnbu.a(this.b) : dnbu.b(this.a);
        dnbk.b(a, null, cxu.c(500, 0, null, 6), hpx.d(-2002293270, new dnbs(this.c, hviVar, point, this.d, this.a, this.b), hfdVar), hfdVar, 28032);
        return ffcu.a;
    }
}
