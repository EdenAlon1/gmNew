package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drpb extends ffhv implements ffji {
    int a;
    final /* synthetic */ drpd b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drpb(drpd drpdVar, Uri uri, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = drpdVar;
        this.c = uri;
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
        Uri uri = this.c;
        this.a = 1;
        Object c = drpdVar.c.c(uri, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new drpb(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
