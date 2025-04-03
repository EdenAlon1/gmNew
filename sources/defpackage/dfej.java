package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfej {
    public static final dfxq a = new dfxq("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        dfel.a(context).b();
        Iterator it = dfre.a().iterator();
        if (it.hasNext()) {
            throw new UnsupportedOperationException();
        }
        synchronized (dftd.c) {
            dftd dftdVar = dftd.d;
            if (dftdVar != null) {
                dftdVar.k.incrementAndGet();
                Handler handler = dftdVar.o;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
