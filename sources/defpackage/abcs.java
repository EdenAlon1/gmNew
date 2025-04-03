package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abcs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abct b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abcs(abct abctVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abctVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abcs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Intent putExtra = akuv.d("android.settings.SATELLITE_SETTING").a().putExtra("sub_id", this.b.a.c());
            putExtra.getClass();
            aigz aigzVar = (aigz) this.b.b.b();
            aiir aiirVar = new aiir("launchSatelliteSettings", new ael(), putExtra, null);
            this.a = 1;
            obj = aigzVar.f(aiirVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abcs(this.b, ffguVar);
    }
}
