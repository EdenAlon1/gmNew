package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eutz {
    public final Map a = new cmh();
    private final Executor b;

    public eutz(Executor executor) {
        this.b = executor;
    }

    final synchronized dhre a(String str, String str2, eutn eutnVar) {
        final Pair pair = new Pair(str, str2);
        dhre dhreVar = (dhre) this.a.get(pair);
        if (dhreVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Joining ongoing request for: ".concat(pair.toString()));
            }
            return dhreVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Making new request for: ".concat(pair.toString()));
        }
        final FirebaseInstanceId firebaseInstanceId = eutnVar.a;
        String str3 = eutnVar.b;
        final String str4 = eutnVar.c;
        final String str5 = eutnVar.d;
        final euub euubVar = eutnVar.e;
        dhre g = eutr.b(firebaseInstanceId.f.a(str3, str4, str5, new Bundle())).g(firebaseInstanceId.c, new dhrd() { // from class: euto
            @Override // defpackage.dhrd
            public final dhre a(Object obj) {
                String str6 = (String) obj;
                euuc euucVar = FirebaseInstanceId.a;
                FirebaseInstanceId firebaseInstanceId2 = FirebaseInstanceId.this;
                euucVar.d(firebaseInstanceId2.g(), str4, str5, str6, firebaseInstanceId2.e.c());
                return dhrt.c(new euts(str6));
            }
        });
        g.q(new eutl(), new dhqy() { // from class: eutp
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                String str6 = ((euts) obj).a;
                euub euubVar2 = euubVar;
                if (euubVar2 == null || !str6.equals(euubVar2.b)) {
                    Iterator it = FirebaseInstanceId.this.h.iterator();
                    while (it.hasNext()) {
                        ((euwm) it.next()).a.e(str6);
                    }
                }
            }
        });
        dhre e = g.e(this.b, new dhqh() { // from class: euty
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar2) {
                eutz eutzVar = eutz.this;
                Pair pair2 = pair;
                synchronized (eutzVar) {
                    eutzVar.a.remove(pair2);
                }
                return dhreVar2;
            }
        });
        this.a.put(pair, e);
        return e;
    }
}
