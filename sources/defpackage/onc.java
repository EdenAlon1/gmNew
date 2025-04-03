package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onc extends onm {
    final Set ag = new HashSet();
    boolean ah;
    CharSequence[] ai;
    CharSequence[] aj;

    private final MultiSelectListPreference aZ() {
        return (MultiSelectListPreference) aY();
    }

    @Override // defpackage.onm
    public final void aU(boolean z) {
        if (z && this.ah) {
            MultiSelectListPreference aZ = aZ();
            if (aZ.Q(this.ag)) {
                aZ.k(this.ag);
            }
        }
        this.ah = false;
    }

    @Override // defpackage.onm
    protected final void eT(iu iuVar) {
        int length = this.aj.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.ag.contains(this.aj[i].toString());
        }
        CharSequence[] charSequenceArr = this.ai;
        onb onbVar = new onb(this);
        ir irVar = iuVar.a;
        irVar.q = charSequenceArr;
        irVar.y = onbVar;
        irVar.u = zArr;
        irVar.v = true;
    }

    @Override // defpackage.onm, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.ag.clear();
            this.ag.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.ah = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.ai = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.aj = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference aZ = aZ();
        if (aZ.g == null || aZ.h == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.ag.clear();
        this.ag.addAll(aZ.i);
        this.ah = false;
        this.ai = aZ.g;
        this.aj = aZ.h;
    }

    @Override // defpackage.onm, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.ag));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ah);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ai);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.aj);
    }
}
