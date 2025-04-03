package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class omt extends Preference {
    private long a;

    public omt(Context context, List list, long j) {
        super(context);
        this.A = R.layout.expand_button;
        H(ku.a(this.j, R.drawable.ic_arrow_down_24dp));
        this.r = R.drawable.ic_arrow_down_24dp;
        L(R.string.expand_button_title);
        I(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence charSequence = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence t = preference.t();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(t)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.D)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(t)) {
                charSequence = charSequence == null ? t : this.j.getString(R.string.summary_collapsed_preference_list, charSequence, t);
            }
        }
        n(charSequence);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        super.a(ooiVar);
        ooiVar.u = false;
    }

    @Override // androidx.preference.Preference
    public final long eS() {
        return this.a;
    }
}
