package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.libraries.compose.ui.composable.HugoHostFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsgo implements ffxy {
    final /* synthetic */ HugoHostFragment a;

    public dsgo(HugoHostFragment hugoHostFragment) {
        this.a = hugoHostFragment;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            ((enrr) HugoHostFragment.a.e().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment$onCreateView$1$6$2", "emit", BasePaymentResult.ERROR_REQUEST_FAILED, "HugoHostFragment.kt")).q("Enabling back navigation handling since Hugo is open.");
        } else {
            ((enrr) HugoHostFragment.a.e().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment$onCreateView$1$6$2", "emit", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "HugoHostFragment.kt")).q("Disabling back navigation handling since Hugo is not open.");
        }
        abo aboVar = this.a.an;
        if (aboVar == null) {
            ffkj.c("onBackPressedCallback");
            aboVar = null;
        }
        aboVar.h(booleanValue);
        return ffcu.a;
    }
}
