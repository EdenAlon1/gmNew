package defpackage;

import j$.util.Optional;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eecq extends eebo {
    static final diyy a = diyv.b("enable_cipher_list_modification");
    private final dikj b;
    private final Optional e;

    public eecq(Optional optional, dikj dikjVar) {
        this.e = optional;
        this.b = dikjVar;
    }

    private final String[] a(String[] strArr) {
        int i = engw.d;
        engr engrVar = new engr();
        int i2 = djas.b;
        HashSet hashSet = new HashSet(emye.b(',').f().a().i((CharSequence) djas.c().a.d.a()));
        for (String str : strArr) {
            if (hashSet.contains(str)) {
                hashSet.remove(str);
            } else {
                engrVar.h(str);
            }
        }
        if (hashSet.isEmpty()) {
            return (String[]) engrVar.g().toArray(new String[0]);
        }
        ezba ezbaVar = (ezba) ezbl.a.createBuilder();
        ezbaVar.copyOnWrite();
        ezbl ezblVar = (ezbl) ezbaVar.instance;
        ezblVar.m = 11;
        ezblVar.b |= 2048;
        ezbaVar.copyOnWrite();
        ezbl ezblVar2 = (ezbl) ezbaVar.instance;
        ezblVar2.c = 4;
        ezblVar2.b |= 1;
        ezbe ezbeVar = ezbe.SOCKET_FAILURE_TLS_HANDSHAKE_FAILED;
        ezbaVar.copyOnWrite();
        ezbl ezblVar3 = (ezbl) ezbaVar.instance;
        ezblVar3.e = ezbeVar.j;
        ezblVar3.b |= 4;
        this.b.j((ezbl) ezbaVar.build());
        throw new IllegalStateException("Cipher to be disabled missing from default cipher list.");
    }

    @Override // defpackage.eebo
    protected final SSLServerSocket d(SSLServerSocket sSLServerSocket) {
        SSLParameters sSLParameters;
        if (((Boolean) a.a()).booleanValue()) {
            String[] a2 = a(sSLServerSocket.getEnabledCipherSuites());
            sSLParameters = sSLServerSocket.getSSLParameters();
            if (sSLParameters == null) {
                sSLParameters = new SSLParameters();
            }
            sSLParameters.setCipherSuites(a2);
            sSLServerSocket.setSSLParameters(sSLParameters);
        }
        return sSLServerSocket;
    }

    @Override // defpackage.eebo
    protected final SSLSocket e(SSLSocket sSLSocket) {
        if (((Boolean) a.a()).booleanValue()) {
            String[] a2 = a(sSLSocket.getEnabledCipherSuites());
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (sSLParameters == null) {
                sSLParameters = new SSLParameters();
            }
            sSLParameters.setCipherSuites(a2);
            sSLSocket.setSSLParameters(sSLParameters);
        }
        return sSLSocket;
    }

    @Override // defpackage.eebo
    protected final Optional f() {
        return this.e;
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
