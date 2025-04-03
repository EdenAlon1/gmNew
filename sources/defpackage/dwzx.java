package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwzx extends emtz {
    final /* synthetic */ dwzy a;

    public dwzx(dwzy dwzyVar) {
        this.a = dwzyVar;
    }

    @Override // defpackage.emtz
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        dxaa dxaaVar = (dxaa) obj;
        ((enrr) ((enrr) ((enrr) dwzy.a.i()).g(th)).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugMainFragmentActionProviderImpl$1", "onFailure", 65, "MddDebugMainFragmentActionProviderImpl.java")).t("MDD Debug Action: %s failed", dxaaVar != null ? dxaaVar.a() : "UNKNOWN");
    }

    @Override // defpackage.emtz
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        char c;
        dxaa dxaaVar = (dxaa) obj;
        if (dxaaVar == null) {
            ((enrr) ((enrr) dwzy.a.j()).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugMainFragmentActionProviderImpl$1", "onSuccess", 43, "MddDebugMainFragmentActionProviderImpl.java")).q("MDD Debug Action completed, but no ActionInfo was given. No additional operation will be performed");
            return;
        }
        ((enrr) ((enrr) dwzy.a.e()).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugMainFragmentActionProviderImpl$1", "onSuccess", 48, "MddDebugMainFragmentActionProviderImpl.java")).t("MDD Debug Action succeeded: %s", dxaaVar);
        String a = dxaaVar.a();
        int hashCode = a.hashCode();
        if (hashCode == -1460314357) {
            if (a.equals("MDD.DEBUG.TRIGGER_MDD_ACTION")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -882694556) {
            if (hashCode == 1160160022 && a.equals("MDD.DEBUG.REFRESH_ACTION")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (a.equals("MDD.DEBUG.CLEAR_ACTION")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0 || c == 1 || c == 2) {
            dwzg dwzgVar = (dwzg) this.a.b.I().g(R.id.file_group_list_container);
            dwzn a2 = dwzgVar != null ? dwzgVar.a() : null;
            if (a2 != null) {
                a2.a.c();
            }
        }
    }
}
