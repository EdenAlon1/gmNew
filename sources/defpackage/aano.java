package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aano extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aans b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aano(aans aansVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aansVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aano) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aans aansVar = this.b;
            ailj ailjVar = new ailj(9, this.c, "image/png", null, 24);
            this.a = 1;
            obj = aansVar.b.f(ailjVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aano(this.b, this.c, ffguVar);
    }
}
