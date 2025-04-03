package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eecs extends eebo {
    static final diyy a = dizd.a(174303680);
    private final Optional b;

    public eecs(Optional optional) {
        this.b = optional;
    }

    private static final String[] a(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            throw new IllegalArgumentException("At least one protocol needs to be available.");
        }
        HashSet f = enpw.f(strArr);
        int i = djas.b;
        List i2 = emye.b(',').f().a().i((CharSequence) djas.c().a.b.a());
        if (!i2.isEmpty()) {
            f.retainAll(i2);
        }
        List i3 = emye.b(',').f().a().i((CharSequence) djas.c().a.c.a());
        f.removeAll(i3);
        if (f.isEmpty()) {
            throw new IllegalStateException(String.format("No protocols enabled after filtering: (\"%s\" ∩ \"%s\") - \"%s\" = ∅", TextUtils.join(",", strArr), TextUtils.join(",", i2), TextUtils.join(",", i3)));
        }
        return (String[]) f.toArray(new String[0]);
    }

    @Override // defpackage.eebo
    protected final SSLServerSocket d(SSLServerSocket sSLServerSocket) {
        if (((Boolean) a.a()).booleanValue()) {
            sSLServerSocket.setEnabledProtocols(a(sSLServerSocket.getEnabledProtocols()));
        }
        return sSLServerSocket;
    }

    @Override // defpackage.eebo
    protected final SSLSocket e(SSLSocket sSLSocket) {
        if (((Boolean) a.a()).booleanValue()) {
            sSLSocket.setEnabledProtocols(a(sSLSocket.getEnabledProtocols()));
        }
        return sSLSocket;
    }

    @Override // defpackage.eebo
    protected final Optional f() {
        return this.b;
    }

    @Override // defpackage.eebo
    protected final ServerSocket b(ServerSocket serverSocket) {
        return serverSocket;
    }

    @Override // defpackage.eebo
    protected final Socket c(Socket socket) {
        return socket;
    }
}
