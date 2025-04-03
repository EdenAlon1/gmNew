package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xrm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xsa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrm(xsa xsaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xsaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xrm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Intent createRequestRoleIntent = ctid.c ? abk$$ExternalSyntheticApiModelOutline0.m(this.b.b.getSystemService(abk$$ExternalSyntheticApiModelOutline0.m50m())).createRequestRoleIntent("android.app.role.SMS") : new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT").putExtra("package", this.b.b.getPackageName());
            createRequestRoleIntent.getClass();
            aigz aigzVar = (aigz) this.b.e.b();
            aiir aiirVar = new aiir("changeDefaultSmsApp", new ael(), createRequestRoleIntent, null);
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
        return new xrm(this.b, ffguVar);
    }
}
