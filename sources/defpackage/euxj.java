package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxj {
    public final Map a = new cmh();
    private final Executor b;

    public euxj(Executor executor) {
        this.b = executor;
    }

    public final synchronized dhre a(final String str, euwq euwqVar) {
        dhre dhreVar = (dhre) this.a.get(str);
        if (dhreVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: ".concat(String.valueOf(str)));
            }
            return dhreVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: ".concat(String.valueOf(str)));
        }
        final FirebaseMessaging firebaseMessaging = euwqVar.a;
        final String str2 = euwqVar.b;
        final euxo euxoVar = euwqVar.c;
        euww euwwVar = firebaseMessaging.e;
        dhre e = euww.b(euwwVar.a(euxb.e(euwwVar.a), "*", new Bundle())).g(firebaseMessaging.f, new dhrd() { // from class: euwl
            @Override // defpackage.dhrd
            public final dhre a(Object obj) {
                FirebaseMessaging firebaseMessaging2 = FirebaseMessaging.this;
                String str3 = (String) obj;
                FirebaseMessaging.b(firebaseMessaging2.d).c(firebaseMessaging2.d(), str2, str3, firebaseMessaging2.g.c());
                euxo euxoVar2 = euxoVar;
                if (euxoVar2 == null || !str3.equals(euxoVar2.b)) {
                    firebaseMessaging2.e(str3);
                }
                return dhrt.c(str3);
            }
        }).e(this.b, new dhqh() { // from class: euxi
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar2) {
                euxj euxjVar = euxj.this;
                String str3 = str;
                synchronized (euxjVar) {
                    euxjVar.a.remove(str3);
                }
                return dhreVar2;
            }
        });
        this.a.put(str, e);
        return e;
    }
}
