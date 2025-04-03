package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxi extends ffkk implements ffix {
    final /* synthetic */ nxm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxi(nxm nxmVar) {
        super(0);
        this.a = nxmVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context applicationContext = this.a.a.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        nxm nxmVar = this.a;
        return new lmg(application, nxmVar, nxmVar.a());
    }
}
