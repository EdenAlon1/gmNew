package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cysd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cysj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cysd(cysj cysjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cysjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cysd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.f.d("has_pending_profile_photo_picker_result", false);
            aigz aigzVar = (aigz) this.b.k.b();
            ainc aincVar = new ainc("com.google.android.apps.messaging.ui.profilephotopicker");
            this.a = 1;
            obj = aigzVar.f(aincVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ade adeVar = (ade) obj;
        Intent intent = adeVar.b;
        Uri uri = null;
        if (intent != null) {
            if (adeVar.a != -1) {
                intent = null;
            }
            if (intent != null) {
                uri = (Uri) intent.getParcelableExtra("output");
            }
        }
        this.b.b(uri);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cysd(this.b, ffguVar);
    }
}
