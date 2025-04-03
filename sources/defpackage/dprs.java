package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dprt b;
    final /* synthetic */ Uri c;
    final /* synthetic */ dpgo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dprs(dprt dprtVar, Uri uri, dpgo dpgoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dprtVar;
        this.c = uri;
        this.d = dpgoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dprs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object b;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dprt dprtVar = this.b;
        enru enruVar = dprt.a;
        Uri uri = this.c;
        dpgo dpgoVar = this.d;
        drpd drpdVar = dprtVar.g;
        drkk drkkVar = drkk.a;
        this.a = 1;
        b = drpdVar.b(drkkVar, uri, dpgoVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dprs(this.b, this.c, this.d, ffguVar);
    }
}
