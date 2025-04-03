package defpackage;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeao {
    static boolean a(eeoh eeohVar) {
        if (eeohVar.g) {
            return eeohVar.a.equals(eeohVar.b ? null : eeohVar.c.get());
        }
        return true;
    }

    static ezbl b(int i, Socket socket, eeoh eeohVar) {
        ezba ezbaVar = (ezba) ezbl.a.createBuilder();
        boolean z = socket instanceof SSLSocket;
        ezbh ezbhVar = z ? ezbh.SOCKET_PROTOCOL_TYPE_TLS : ezbh.SOCKET_PROTOCOL_TYPE_TCP;
        ezbaVar.copyOnWrite();
        ezbl ezblVar = (ezbl) ezbaVar.instance;
        ezblVar.f = ezbhVar.e;
        int i2 = 8;
        ezblVar.b |= 8;
        int i3 = i - 1;
        int i4 = i3 != 1 ? i3 != 2 ? 2 : 3 : 4;
        ezbaVar.copyOnWrite();
        ezbl ezblVar2 = (ezbl) ezbaVar.instance;
        ezblVar2.g = i4 - 1;
        ezblVar2.b |= 16;
        int i5 = true != z ? 2 : 5;
        ezbaVar.copyOnWrite();
        ezbl ezblVar3 = (ezbl) ezbaVar.instance;
        ezblVar3.c = i5 - 1;
        ezblVar3.b |= 1;
        switch ((eebf) eeohVar.a.a) {
            case INIT:
                i2 = 2;
                break;
            case ACCEPTING:
                i2 = 3;
                break;
            case ACCEPTED:
                i2 = 4;
                break;
            case CONNECTING:
                i2 = 5;
                break;
            case CONNECTED:
                i2 = 6;
                break;
            case AUTHENTICATING:
                i2 = 7;
                break;
            case AUTHENTICATED:
                break;
            case ACTIVE:
                i2 = 9;
                break;
            case CLOSING:
                i2 = 10;
                break;
            case CLOSED:
                i2 = 11;
                break;
            case FAILED:
                i2 = 12;
                break;
            default:
                throw new IllegalArgumentException("unknown socket state");
        }
        ezbaVar.copyOnWrite();
        ezbl ezblVar4 = (ezbl) ezbaVar.instance;
        ezblVar4.m = i2 - 1;
        ezblVar4.b |= 2048;
        String uuid = eeohVar.f.toString();
        ezbaVar.copyOnWrite();
        ezbl ezblVar5 = (ezbl) ezbaVar.instance;
        uuid.getClass();
        ezblVar5.b |= 4096;
        ezblVar5.n = uuid;
        int i6 = eeohVar.h;
        ezbaVar.copyOnWrite();
        ezbl ezblVar6 = (ezbl) ezbaVar.instance;
        ezblVar6.b |= 16384;
        ezblVar6.o = i6;
        int i7 = eeohVar.e;
        ezbaVar.copyOnWrite();
        ezbl ezblVar7 = (ezbl) ezbaVar.instance;
        ezblVar7.b |= 32768;
        ezblVar7.p = i7;
        if (!eeohVar.b) {
            int intValue = ((Integer) eeohVar.d.get()).intValue();
            ezbaVar.copyOnWrite();
            ezbl ezblVar8 = (ezbl) ezbaVar.instance;
            ezblVar8.b |= 65536;
            ezblVar8.q = intValue;
        }
        if (eeohVar.a.b().isPresent()) {
            String simpleName = ((Throwable) eeohVar.a.b().get()).getClass().getSimpleName();
            ezbaVar.copyOnWrite();
            ezbl ezblVar9 = (ezbl) ezbaVar.instance;
            simpleName.getClass();
            ezblVar9.b |= 131072;
            ezblVar9.r = simpleName;
        }
        if (socket.getLocalSocketAddress() != null) {
            SocketAddress localSocketAddress = socket.getLocalSocketAddress();
            if (localSocketAddress instanceof InetSocketAddress) {
                int i8 = true != (((InetSocketAddress) localSocketAddress).getAddress() instanceof Inet4Address) ? 3 : 2;
                ezbaVar.copyOnWrite();
                ezbl ezblVar10 = (ezbl) ezbaVar.instance;
                ezblVar10.k = i8 - 1;
                ezblVar10.b |= 256;
            }
        }
        if (socket.getRemoteSocketAddress() != null) {
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            if (remoteSocketAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) remoteSocketAddress;
                boolean z2 = inetSocketAddress.getAddress() instanceof Inet4Address;
                String hostString = inetSocketAddress.getHostString();
                ezbaVar.copyOnWrite();
                ezbl ezblVar11 = (ezbl) ezbaVar.instance;
                hostString.getClass();
                ezblVar11.b |= 32;
                ezblVar11.h = hostString;
                int port = inetSocketAddress.getPort();
                ezbaVar.copyOnWrite();
                ezbl ezblVar12 = (ezbl) ezbaVar.instance;
                ezblVar12.b |= 64;
                ezblVar12.i = port;
                int i9 = true == z2 ? 2 : 3;
                ezbaVar.copyOnWrite();
                ezbl ezblVar13 = (ezbl) ezbaVar.instance;
                ezblVar13.j = i9 - 1;
                ezblVar13.b |= 128;
            }
        }
        return (ezbl) ezbaVar.build();
    }
}
