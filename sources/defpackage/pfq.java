package defpackage;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfq implements WebMessageBoundaryInterface {
    private static final String[] a = {"WEB_MESSAGE_ARRAY_BUFFER"};
    private final pes b;

    public pfq(pes pesVar) {
        this.b = pesVar;
    }

    public static pes a(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        peu[] peuVarArr = new peu[ports.length];
        for (int i = 0; i < ports.length; i++) {
            peuVarArr[i] = new pfu(ports[i]);
        }
        if (!pga.b.d()) {
            return new pes(webMessageBoundaryInterface.getData(), peuVarArr);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) fimp.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new pes(webMessagePayloadBoundaryInterface.getAsString(), peuVarArr);
        }
        if (type != 1) {
            return null;
        }
        return new pes(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), peuVarArr);
    }

    public static boolean b(int i) {
        return i == 0 || pga.b.d();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Deprecated
    public final String getData() {
        return this.b.a();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler getMessagePayload() {
        pft pftVar;
        pes pesVar = this.b;
        if (pesVar.c != 0) {
            pesVar.b(1);
            byte[] bArr = pesVar.b;
            bArr.getClass();
            bArr.getClass();
            pftVar = new pft(bArr);
        } else {
            pftVar = new pft(pesVar.a());
        }
        return new fimo(pftVar);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler[] getPorts() {
        peu[] peuVarArr = this.b.a;
        if (peuVarArr == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[peuVarArr.length];
        for (int i = 0; i < peuVarArr.length; i++) {
            invocationHandlerArr[i] = peuVarArr[i].b();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return a;
    }
}
