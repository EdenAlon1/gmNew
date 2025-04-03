package defpackage;

import android.graphics.Point;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnbs implements ffjn {
    final /* synthetic */ dnbm a;
    final /* synthetic */ hvi b;
    final /* synthetic */ Point c;
    final /* synthetic */ inp d;
    final /* synthetic */ hho e;
    final /* synthetic */ hho f;

    public dnbs(dnbm dnbmVar, hvi hviVar, Point point, inp inpVar, hho hhoVar, hho hhoVar2) {
        this.a = dnbmVar;
        this.b = hviVar;
        this.c = point;
        this.d = inpVar;
        this.e = hhoVar;
        this.f = hhoVar2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Integer num;
        Integer num2;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hvi a = (dnbu.c(dnbu.b(this.e)) || this.a.q()) ? hxg.a(this.b, 5.0f, 5.0f, new hxh(hxh.a).b) : this.b;
        dnbm dnbmVar = this.a;
        Uri i = dnbmVar.i();
        if (i == null) {
            i = (ffkj.e(dnbmVar.l(), dnbu.b(this.e)) || dnbu.c(this.a.l())) ? null : this.a.l();
        }
        dnbm dnbmVar2 = this.a;
        Point point = this.c;
        rdi rdiVar = rdi.d;
        Point a2 = dnbz.a(dnbmVar2.h(), dnbmVar2.g(), point);
        dnbm dnbmVar3 = this.a;
        if (dnbmVar3 instanceof dnbw) {
            hfdVar.v(328534323);
            hho hhoVar = this.e;
            hho hhoVar2 = this.f;
            dnbm dnbmVar4 = this.a;
            Uri b = dnbu.b(hhoVar);
            Uri a3 = dnbu.a(hhoVar2);
            String str = ((dnbw) dnbmVar4).k;
            if (a2 != null) {
                num2 = Integer.valueOf(a2.x);
            } else {
                a2 = null;
                num2 = null;
            }
            dnac.a(b, str, a, i, a3, null, this.d, null, 0.0f, num2, a2 != null ? Integer.valueOf(a2.y) : null, null, null, null, ((dnbw) this.a).d, rdiVar, hfdVar, 0, 100663296, 124768);
            hfdVar.o();
        } else {
            Uri uri = i;
            if (dnbmVar3 instanceof dnbx) {
                hfdVar.v(329024433);
                hho hhoVar3 = this.e;
                hho hhoVar4 = this.f;
                dnbm dnbmVar5 = this.a;
                Uri b2 = dnbu.b(hhoVar3);
                Uri a4 = dnbu.a(hhoVar4);
                String a5 = ((dnbx) dnbmVar5).a();
                if (a2 != null) {
                    num = Integer.valueOf(a2.x);
                } else {
                    a2 = null;
                    num = null;
                }
                Integer valueOf = a2 != null ? Integer.valueOf(a2.y) : null;
                dnbx dnbxVar = (dnbx) this.a;
                dnav.c(b2, a5, a, uri, a4, null, this.d, null, 0.0f, num, valueOf, dnbxVar.a.d, rdiVar, dnbxVar.c, dnbxVar.d, dnbxVar.e, dnbxVar.b, hfdVar, 0, 100663296, 0);
                hfdVar.o();
            } else {
                hfdVar.v(329670473);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}
