package defpackage;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfr implements WebMessageCallbackBoundaryInterface {
    private final pet a;

    public pfr(pet petVar) {
        this.a = petVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public final void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        pes a = pfq.a((WebMessageBoundaryInterface) fimp.a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (a != null) {
            pet petVar = this.a;
            new pfu(invocationHandler);
            petVar.a(a);
        }
    }
}
