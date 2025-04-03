package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class ypj implements owu, ffke {
    final /* synthetic */ yqb a;

    public ypj(yqb yqbVar) {
        this.a = yqbVar;
    }

    @Override // defpackage.owu
    public final Bundle a() {
        Bundle bundle = new Bundle();
        ensk h = yqb.a.h();
        h.Y(ente.a, "BugleComposeRow2");
        enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "createInputStateBundle", 358, "InputsUiAdapterImpl.kt");
        yqb yqbVar = this.a;
        enrrVar.t("Persisting input display %s", yqbVar.q.c());
        bundle.putParcelable("input_display_key", (Parcelable) yqbVar.q.c());
        return bundle;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffkh(0, this.a, yqb.class, "createInputStateBundle", "createInputStateBundle()Landroid/os/Bundle;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof owu) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
