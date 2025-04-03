package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.protocol.IAppUpdateService;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehvb extends ehwh {
    final /* synthetic */ String a;
    final /* synthetic */ dhri b;
    final /* synthetic */ ehvg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehvb(ehvg ehvgVar, dhri dhriVar, String str, dhri dhriVar2) {
        super(dhriVar);
        this.a = str;
        this.b = dhriVar2;
        this.c = ehvgVar;
    }

    @Override // defpackage.ehwh
    protected final void a() {
        Integer num;
        try {
            ehvg ehvgVar = this.c;
            IAppUpdateService iAppUpdateService = (IAppUpdateService) ehvgVar.b.n;
            String str = ehvgVar.c;
            String str2 = this.a;
            Bundle bundle = new Bundle();
            bundle.putAll(ehvg.b());
            bundle.putString("package.name", str2);
            try {
                num = Integer.valueOf(ehvgVar.d.getPackageManager().getPackageInfo(ehvgVar.d.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                ehvg.a.b("The current version of the app could not be retrieved", new Object[0]);
                num = null;
            }
            if (num != null) {
                bundle.putInt("app.version.code", num.intValue());
            }
            iAppUpdateService.requestInfo(str, bundle, new ehvf(this.c, this.b, this.a));
        } catch (RemoteException e) {
            ehvg.a.c(e, "requestUpdateInfo(%s)", this.a);
            this.b.c(new RuntimeException(e));
        }
    }
}
