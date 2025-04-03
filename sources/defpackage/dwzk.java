package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwzk extends emtz {
    final /* synthetic */ dwzm a;

    public dwzk(dwzm dwzmVar) {
        this.a = dwzmVar;
    }

    @Override // defpackage.emtz
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        String str = (String) obj;
        if (str == null) {
            str = "UNKNOWN";
        }
        ((enrr) ((enrr) ((enrr) dwzm.a.i()).g(th)).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugListFragmentActionProviderImpl$1", "onFailure", 53, "MddDebugListFragmentActionProviderImpl.java")).t("MDD Debug Action: %s failed", str);
        if (str.hashCode() == -1167398896 && str.equals("MDD.DEBUG.UPDATE_ACTION")) {
            dwzh dwzhVar = this.a.h;
            if (dwzhVar != null) {
                dwzhVar.b("Unable to get file groups, check log for details\n(You may need to force refresh tracked file groups)");
            }
            this.a.a();
        }
    }

    @Override // defpackage.emtz
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String str = (String) obj;
        if (str == null) {
            str = "UNKNOWN";
        }
        ((enrr) ((enrr) dwzm.a.e()).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugListFragmentActionProviderImpl$1", "onSuccess", 35, "MddDebugListFragmentActionProviderImpl.java")).t("MDD Debug Action: %s succeeded", str);
        if (str.hashCode() == -1167398896 && str.equals("MDD.DEBUG.UPDATE_ACTION")) {
            this.a.a();
        }
    }
}
