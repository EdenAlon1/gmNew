package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drox extends ffhv implements ffji {
    int a;
    final /* synthetic */ drpd b;
    final /* synthetic */ dozs c;
    final /* synthetic */ Uri d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drox(drpd drpdVar, dozs dozsVar, Uri uri, boolean z, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = drpdVar;
        this.c = dozsVar;
        this.d = uri;
        this.e = z;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
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
        Duration b = dozsVar.b();
        if (b == null) {
            b = drpd.a;
        }
        drpv drpvVar = new drpv(dozsVar.c(), b);
        int compareTo = drpvVar.b.compareTo(Duration.ZERO);
        Object obj2 = drpvVar;
        obj2 = drpvVar;
        if (compareTo <= 0 && z) {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = drpdVar.c.b(uri, this);
        }
        return obj2 == ffhhVar ? ffhhVar : obj2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new drox(this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
