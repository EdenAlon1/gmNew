package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omy extends onm {
    int ag;
    private CharSequence[] ah;
    private CharSequence[] ai;

    private final ListPreference aZ() {
        return (ListPreference) aY();
    }

    @Override // defpackage.onm
    public final void aU(boolean z) {
        int i;
        if (!z || (i = this.ag) < 0) {
            return;
        }
        String charSequence = this.ai[i].toString();
        ListPreference aZ = aZ();
        if (aZ.Q(charSequence)) {
            aZ.o(charSequence);
        }
    }

    @Override // defpackage.onm
    protected final void eT(iu iuVar) {
        iuVar.f(this.ah, this.ag, new omx(this));
        iuVar.i(null, null);
    }

    @Override // defpackage.onm, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.ag = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.ah = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.ai = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference aZ = aZ();
        if (aZ.g == null || aZ.h == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.ag = aZ.k(aZ.i);
        this.ah = aZ.g;
        this.ai = aZ.h;
    }

    @Override // defpackage.onm, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ag);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.ah);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.ai);
    }
}
