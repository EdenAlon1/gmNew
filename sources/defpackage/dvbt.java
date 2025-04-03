package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbt implements fbba {
    public static emxc a(Context context) {
        dvbq dvbqVar = dvbr.a;
        context.getClass();
        try {
            return emxc.i(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            ((ensz) ((ensz) dvbq.b.j()).g(e)).q("Did not find own package, this should be impossible.");
            return emux.a;
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
