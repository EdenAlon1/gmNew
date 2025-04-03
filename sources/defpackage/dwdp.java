package defpackage;

import android.content.SharedPreferences;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwdp implements erqj {
    final /* synthetic */ dwdq a;

    public dwdp(dwdq dwdqVar) {
        this.a = dwdqVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ezju ezjuVar = (ezju) obj;
        ezjuVar.getClass();
        String str = ezjuVar.b;
        str.getClass();
        if (str.length() > 0) {
            dwdq dwdqVar = this.a;
            final String str2 = ezjuVar.b;
            str2.getClass();
            final ffji ffjiVar = new ffji() { // from class: dwdj
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    SharedPreferences.Editor putString;
                    SharedPreferences sharedPreferences = (SharedPreferences) obj2;
                    sharedPreferences.getClass();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (edit == null || (putString = edit.putString("zb", str2)) == null) {
                        return null;
                    }
                    putString.apply();
                    return ffcu.a;
                }
            };
            emwl emwlVar = new emwl() { // from class: dwdk
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    return ffji.this.invoke(obj2);
                }
            };
            dwdl dwdlVar = dwdqVar.c;
            erny.f(dwdlVar.c, emwlVar, dwdlVar.b);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        th.getClass();
        Log.w("ZBCC", "Failed to get session", th);
    }
}
