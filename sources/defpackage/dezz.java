package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.auth.IAuthManagerService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dezz implements dfab {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public dezz(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.dfab
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        Bundle clearToken = IAuthManagerService.Stub.asInterface(iBinder).clearToken(this.a, this.b);
        dfac.l(clearToken);
        String string = clearToken.getString("Error");
        if (clearToken.getBoolean("booleanResult")) {
            return null;
        }
        throw new dezu(string);
    }
}
