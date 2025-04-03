package defpackage;

import android.graphics.Point;
import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dovf implements ffjm {
    final /* synthetic */ Point a;
    final /* synthetic */ hho b;
    final /* synthetic */ hho c;
    final /* synthetic */ dovk d;
    final /* synthetic */ hho e;

    public dovf(Point point, hho hhoVar, hho hhoVar2, dovk dovkVar, hho hhoVar3) {
        this.a = point;
        this.b = hhoVar;
        this.c = hhoVar2;
        this.d = dovkVar;
        this.e = hhoVar3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hho hhoVar = this.b;
            Uri a = dovh.a(hhoVar);
            hvi hviVar = hvi.e;
            if (ffkj.e(dovh.a(hhoVar), Uri.EMPTY)) {
                hviVar = hxg.a(hvi.e, 5.0f, 5.0f, new hxh(hxh.a).b);
            }
            int i = inp.a;
            Point point = this.a;
            inp inpVar = ino.g;
            Integer valueOf = point != null ? Integer.valueOf(point.x) : null;
            Point point2 = this.a;
            dnac.a(a, null, hviVar, null, dovh.b(this.c), null, inpVar, null, 0.0f, valueOf, point2 != null ? Integer.valueOf(point2.y) : null, Duration.ZERO, null, null, new dove(this.d, this.e), rdi.d, hfdVar, 12582960, 100666368, 116584);
        }
        return ffcu.a;
    }
}
