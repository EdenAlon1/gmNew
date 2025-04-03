package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.play.core.appupdate.protocol.IAppUpdateService;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehvg {
    public static final ehvt a = new ehvt("AppUpdateService");
    private static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    ehwr b;
    public final String c;
    public final Context d;
    public final ehvi e;

    public ehvg(Context context, ehvi ehviVar) {
        this.c = context.getPackageName();
        this.d = context;
        this.e = ehviVar;
        if (ehwv.a(context)) {
            this.b = new ehwr(ehwt.a(context), a, "AppUpdateService", f, new ehwn() { // from class: ehva
                @Override // defpackage.ehwn
                public final Object a(IBinder iBinder) {
                    return IAppUpdateService.Stub.asInterface(iBinder);
                }
            });
        }
    }

    public static int a(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    public static Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 20200);
        return bundle;
    }

    public static dhre c() {
        a.b("onError(%d)", -9);
        return dhrt.b(new ehvo(-9));
    }

    public static HashSet d(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }
}
