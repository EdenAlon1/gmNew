package defpackage;

import android.content.Context;
import android.net.NetworkReleasedException;
import android.net.SocketLocalAddressChangedException;
import android.net.SocketNotBoundException;
import java.net.InetSocketAddress;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeby {
    private final Context a;
    private final dikt b;

    public eeby(Context context, dikt diktVar) {
        this.a = context;
        this.b = diktVar;
    }

    public static final String b(InetSocketAddress inetSocketAddress) {
        return erls.a(inetSocketAddress.getAddress().getHostAddress(), inetSocketAddress.getPort()).toString();
    }

    public static final int d(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 3;
        }
        return 2;
    }

    final void a(Exception exc) {
        int i = exc.getCause() instanceof NetworkReleasedException ? 2 : exc.getCause() instanceof SocketLocalAddressChangedException ? 5 : exc.getCause() instanceof SocketNotBoundException ? 3 : exc.getCause() instanceof UnsupportedOperationException ? 4 : 1;
        eyva eyvaVar = (eyva) eyvd.a.createBuilder();
        eyvaVar.copyOnWrite();
        eyvd eyvdVar = (eyvd) eyvaVar.instance;
        eyvdVar.c = i - 1;
        eyvdVar.b |= 1;
        eyvaVar.copyOnWrite();
        eyvd eyvdVar2 = (eyvd) eyvaVar.instance;
        eyvdVar2.e = 3;
        eyvdVar2.b = 4 | eyvdVar2.b;
        c((eyvd) eyvaVar.build(), 3);
    }

    public final void c(eyvd eyvdVar, int i) {
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.f = 5;
        eyvvVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.g = i - 1;
        eyvvVar2.b |= 4;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyvdVar.getClass();
        eyvvVar3.d = eyvdVar;
        eyvvVar3.c = 7;
        this.b.h(this.a, (eyvv) eyvuVar.build());
    }
}
