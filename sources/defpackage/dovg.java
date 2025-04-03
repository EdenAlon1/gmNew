package defpackage;

import android.graphics.Point;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dovg implements ffjo {
    final /* synthetic */ dovk a;
    final /* synthetic */ hho b;
    final /* synthetic */ hho c;
    final /* synthetic */ hho d;

    public dovg(dovk dovkVar, hho hhoVar, hho hhoVar2, hho hhoVar3) {
        this.a = dovkVar;
        this.b = hhoVar;
        this.c = hhoVar2;
        this.d = hhoVar3;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        Point point = (Point) obj;
        hvi hviVar = (hvi) obj2;
        hfd hfdVar = (hfd) obj3;
        ((Number) obj4).intValue();
        hviVar.getClass();
        int i = huo.a;
        ipn a = dyc.a(hum.a, false);
        int a2 = hey.a(hfdVar);
        hgb c = hfdVar.c();
        hvi b = huz.b(hfdVar, hviVar);
        int i2 = ist.a;
        ffix ffixVar = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a, iss.e);
        hlc.b(hfdVar, c, iss.d);
        ffjm ffjmVar = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
            Integer valueOf = Integer.valueOf(a2);
            hfdVar.y(valueOf);
            hfdVar.h(valueOf, ffjmVar);
        }
        hho hhoVar = this.b;
        hlc.b(hfdVar, b, iss.c);
        dyi dyiVar = dyi.a;
        hvi b2 = dyiVar.b(hvi.e);
        if (((Boolean) hhoVar.a()).booleanValue()) {
            hfdVar.v(1789481858);
            j = gft.a(hfdVar).c;
            hfdVar.o();
        } else {
            hfdVar.v(1789555266);
            j = gft.a(hfdVar).v;
            hfdVar.o();
        }
        long j2 = j;
        hho hhoVar2 = this.d;
        hho hhoVar3 = this.c;
        dovk dovkVar = this.a;
        gpa.c(b2, null, j2, 0L, 0.0f, 0.0f, null, hpx.d(626045665, new dovf(point, hhoVar3, hhoVar2, dovkVar, hhoVar), hfdVar), hfdVar, 122);
        hfdVar.v(-1189164907);
        if (!ffkj.e(dovh.a(hhoVar3), Uri.EMPTY)) {
            dovr.d(dyiVar, new dovt(dovkVar.d, dovkVar.c), dyiVar.b(hvi.e), hfdVar, 6);
        }
        hfdVar.o();
        hfdVar.n();
        return ffcu.a;
    }
}
