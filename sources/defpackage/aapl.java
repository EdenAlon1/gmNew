package defpackage;

import android.net.Uri;
import android.text.format.DateUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapl implements ffjp {
    final /* synthetic */ aapm a;

    public aapl(aapm aapmVar) {
        this.a = aapmVar;
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        final aapj aapjVar = (aapj) obj;
        eqd eqdVar = (eqd) obj2;
        hfd hfdVar = (hfd) obj4;
        int intValue = ((Number) obj5).intValue();
        aapjVar.getClass();
        eqdVar.getClass();
        obj3.getClass();
        String formatElapsedTime = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(aapjVar.c));
        aapm aapmVar = this.a;
        dnmm dnmmVar = new dnmm(aapmVar.b.a(), false, aapmVar.c.a(), false, 22);
        dovj dovjVar = new dovj(((ersq) ((aufu) this.a.a).a.b()).a("bugle.fix_video_thumbnail_bubble_uri_cache"));
        hfdVar.v(2043939527);
        boolean z = true;
        if ((((intValue & 14) ^ 6) <= 4 || !hfdVar.D(aapjVar)) && (intValue & 6) != 4) {
            z = false;
        }
        Object f = hfdVar.f();
        if (z || f == hfc.a) {
            f = new ffix() { // from class: aapk
                @Override // defpackage.ffix
                public final Object invoke() {
                    aapj.this.n.invoke();
                    return ffcu.a;
                }
            };
            hfdVar.y(f);
        }
        dnal dnalVar = aapjVar.h;
        ffix ffixVar = aapjVar.o;
        ffix ffixVar2 = aapjVar.n;
        int i = aapjVar.p;
        Integer num = aapjVar.m;
        Integer num2 = aapjVar.l;
        boolean z2 = aapjVar.k;
        String str = aapjVar.j;
        Uri uri = aapjVar.b;
        hfdVar.o();
        dovh.c(new dovk(aapjVar.a, uri, (ffix) f, formatElapsedTime, dnalVar, dovjVar, str, z2, num2, num, i, ffixVar2, ffixVar, dnmmVar), obj3, eqdVar, hfdVar, ((intValue >> 3) & 112) | ((intValue << 3) & 896));
        return ffcu.a;
    }
}
