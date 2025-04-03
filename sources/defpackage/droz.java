package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class droz extends ffhv implements ffji {
    int a;
    final /* synthetic */ drpd b;
    final /* synthetic */ dozs c;
    final /* synthetic */ Uri d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public droz(drpd drpdVar, dozs dozsVar, Uri uri, boolean z, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = drpdVar;
        this.c = dozsVar;
        this.d = uri;
        this.e = z;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        drpd drpdVar = this.b;
        dozs dozsVar = this.c;
        Uri uri = this.d;
        boolean z = this.e;
        this.a = 1;
        Size a = dozsVar.a();
        Duration b = dozsVar.b();
        if (a == null || b == null) {
            obj2 = drpdVar.c.d(uri, this);
        } else {
            drpx drpxVar = new drpx(dozsVar.c(), a, b);
            obj2 = drpxVar;
            if (z) {
                obj2 = drpdVar.c.a(drpxVar, uri, this);
            }
        }
        return obj2 == obj3 ? obj3 : obj2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new droz(this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
