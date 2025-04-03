package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chks implements evdd {
    public static final Map a = ffew.g(new ffcf(CronetProvider.PROVIDER_NAME_APP_PACKAGED, 0), new ffcf("Google-Play-Services-Cronet-Provider", 1), new ffcf(CronetProvider.PROVIDER_NAME_FALLBACK, 2));
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory");
    private final Context c;

    public chks(Context context) {
        context.getClass();
        this.c = context;
    }

    public final CronetProvider a() {
        Object obj;
        List<CronetProvider> allProviders = CronetProvider.getAllProviders(this.c);
        enrr enrrVar = (enrr) b.h().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "selectProvider", 67, "CronetEngineBuilderFactory.kt");
        allProviders.getClass();
        enrrVar.t("Found Cronet providers: %s", ffdx.aA(allProviders, null, null, null, new ffji() { // from class: chkq
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                Map map = chks.a;
                String name = ((CronetProvider) obj2).getName();
                name.getClass();
                return name;
            }
        }, 31));
        Iterator it = ffdx.ah(allProviders, new chkr()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CronetProvider) obj).isEnabled()) {
                break;
            }
        }
        CronetProvider cronetProvider = (CronetProvider) obj;
        if (cronetProvider == null) {
            throw new IllegalStateException("Unable to find any enabled Cronet provider");
        }
        ((enrr) b.h().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "selectProvider", 81, "CronetEngineBuilderFactory.kt")).D("Selected Cronet provider is %s, version %s", cronetProvider.getName(), cronetProvider.getVersion());
        return cronetProvider;
    }

    @Override // defpackage.evdd
    public final ExperimentalCronetEngine.Builder b() {
        CronetProvider a2 = a();
        if (ffkj.e(a2.getName(), CronetProvider.PROVIDER_NAME_FALLBACK)) {
            ((enrr) b.j().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "createBuilder", 43, "CronetEngineBuilderFactory.kt")).q("No native Cronet provider found");
            throw new IllegalStateException("No native Cronet provider found");
        }
        try {
            CronetEngine.Builder createBuilder = a2.createBuilder();
            createBuilder.getClass();
            return (ExperimentalCronetEngine.Builder) createBuilder;
        } catch (ClassCastException e) {
            ((enrr) b.j().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "createBuilder", 49, "CronetEngineBuilderFactory.kt")).q("Failed cast to ExperimentalCronetEngine.Builder");
            throw new IllegalStateException("Failed cast to ExperimentalCronetEngine.Builder", e);
        }
    }
}
