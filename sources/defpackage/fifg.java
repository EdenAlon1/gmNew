package defpackage;

import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fifg implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        fifh fifhVar = (fifh) obj;
        fifh fifhVar2 = (fifh) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(fifhVar.a.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(fifhVar2.a.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(fifhVar.a.getVersion(), fifhVar2.a.getVersion());
    }
}
