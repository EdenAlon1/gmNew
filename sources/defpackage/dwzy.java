package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwzy implements dwzu {
    public static final enru a = enru.c("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugMainFragmentActionProviderImpl");
    public final ea b;
    public emud c;
    public final emtz d = new dwzx(this);
    private final dwyh e;

    public dwzy(ea eaVar, dwyh dwyhVar) {
        this.b = eaVar;
        this.e = dwyhVar;
    }

    public final ListenableFuture a(dxaa dxaaVar) {
        char c;
        dwyz dwyzVar = (dwyz) dxaaVar;
        String str = dwyzVar.a;
        int hashCode = str.hashCode();
        if (hashCode == -1460314357) {
            if (str.equals("MDD.DEBUG.TRIGGER_MDD_ACTION")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -882694556) {
            if (hashCode == 1160160022 && str.equals("MDD.DEBUG.REFRESH_ACTION")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("MDD.DEBUG.CLEAR_ACTION")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return this.e.a();
        }
        if (c == 1) {
            return this.e.d();
        }
        if (c != 2) {
            return erre.a;
        }
        dwyh dwyhVar = this.e;
        String str2 = dwyzVar.b;
        str2.getClass();
        return dwyhVar.f(str2);
    }
}
