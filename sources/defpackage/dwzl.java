package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwzl implements TextWatcher {
    final /* synthetic */ ffbr a;
    final /* synthetic */ dwzm b;

    public dwzl(dwzm dwzmVar, ffbr ffbrVar) {
        this.a = ffbrVar;
        this.b = dwzmVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (((Boolean) this.a.b()).booleanValue()) {
            String trim = editable.toString().trim();
            ((enrr) ((enrr) dwzm.a.e()).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugListFragmentActionProviderImpl$2", "afterTextChanged", 173, "MddDebugListFragmentActionProviderImpl.java")).t("Updating File Group Filter: %s", trim);
            dwzm dwzmVar = this.b;
            emud emudVar = dwzmVar.f;
            dwzf dwzfVar = dwzmVar.g;
            dwzfVar.d = trim;
            emudVar.c(emud.a(dwzfVar.a()), this.b.b, "MDD.DEBUG.FILTER_ACTION");
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
