package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpug extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpui b;
    final /* synthetic */ Uri c;
    final /* synthetic */ atl d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpug(dpui dpuiVar, Uri uri, atl atlVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpuiVar;
        this.c = uri;
        this.d = atlVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpug) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpui dpuiVar = this.b;
            drkq drkqVar = dpui.a;
            Uri uri = this.c;
            dpui dpuiVar2 = this.b;
            atl atlVar = this.d;
            int i2 = this.e;
            drpd drpdVar = dpuiVar.c;
            drkq drkqVar2 = dpui.a;
            dpgo a = dpuiVar2.a(atlVar, i2);
            this.a = 1;
            obj = drpdVar.b(drkqVar2, uri, a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        return (drni) obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpug(this.b, this.c, this.d, this.e, ffguVar);
    }
}
