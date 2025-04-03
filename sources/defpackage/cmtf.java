package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtf implements cmtb {
    private final String a;

    public cmtf(String str) {
        this.a = str;
    }

    @Override // defpackage.cmtb
    public final String a(Resources resources, cmrl cmrlVar) {
        return resources.getString(R.string.add_reaction_for_text_message_rcs_fallback_text_v2, cmrlVar.d, this.a);
    }

    @Override // defpackage.cmtb
    public final String b(Resources resources, cmrl cmrlVar) {
        return resources.getString(R.string.remove_reaction_from_text_message_rcs_fallback_text_v2, cmrlVar.d, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cmtf) {
            return this.a.equals(((cmtf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
