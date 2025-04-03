package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class droy extends ffhv implements ffji {
    int a;
    final /* synthetic */ drpd b;
    final /* synthetic */ dozs c;
    final /* synthetic */ Uri d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public droy(drpd drpdVar, dozs dozsVar, Uri uri, boolean z, ffgu ffguVar) {
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
        Size a = dozsVar.a();
        if (a == null) {
            a = drpd.b;
        }
        drpw drpwVar = new drpw(dozsVar.c(), a);
        boolean b = dqkt.b(drpwVar.b);
        Object obj2 = drpwVar;
        obj2 = drpwVar;
        if (!b && z) {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = drpdVar.c.c(uri, this);
        }
        return obj2 == ffhhVar ? ffhhVar : obj2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new droy(this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
