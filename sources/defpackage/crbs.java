package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crbs {
    static crfl a(fawm fawmVar, crbr crbrVar, String str) {
        if (fawmVar == null) {
            avvc g = avvd.g();
            g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
            return new crfk(g.a());
        }
        if (fawmVar.b()) {
            fawl fawlVar = fawmVar.a;
            if (fawlVar.a.equals(fawk.CANCELED)) {
                return crfi.a;
            }
            avvc g2 = avvd.g();
            g2.f(cqpn.FILE_TRANSFER_FAILURE_REASON_TRANSFER_EXCEPTION);
            g2.c(fawlVar);
            g2.g(str);
            Throwable cause = fawlVar.getCause();
            if (cause != null && (cause instanceof CronetException)) {
                g2.b((CronetException) cause);
            }
            return new crfk(g2.a());
        }
        if (!fawmVar.a()) {
            avvc g3 = avvd.g();
            g3.f(cqpn.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
            g3.g(str);
            return new crfk(g3.a());
        }
        favt favtVar = fawmVar.b;
        int i = favtVar.a;
        if (i != 200) {
            avvc g4 = avvd.g();
            g4.f(cqpn.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            g4.g(str);
            g4.e(i);
            return new crfk(g4.a());
        }
        InputStream inputStream = favtVar.c;
        if (inputStream == null) {
            avvc g5 = avvd.g();
            g5.f(cqpn.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
            g5.g(str);
            return new crfk(g5.a());
        }
        try {
            try {
                return crbrVar.a((fcki) fcki.a.getParserForType().i(eyee.B(inputStream), eyfc.a()));
            } catch (eygu e) {
                avvc g6 = avvd.g();
                g6.f(cqpn.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_HTTP_RESPONSE);
                g6.g(str);
                g6.c(e);
                return new crfk(g6.a());
            }
        } catch (IOException e2) {
            avvc g7 = avvd.g();
            g7.f(cqpn.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_HTTP_RESPONSE);
            g7.g(str);
            g7.c(e2);
            return new crfk(g7.a());
        }
    }
}
