package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpqu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dprt b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpqu(dprt dprtVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dprtVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpqu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dprt dprtVar = this.b;
            enru enruVar = dprt.a;
            drqm drqmVar = dprtVar.i.a;
            Uri uri = this.c;
            this.a = 1;
            if (drqmVar.b(uri) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpqu(this.b, this.c, ffguVar);
    }
}
