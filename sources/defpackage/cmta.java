package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmta implements cmtb {
    @Override // defpackage.cmtb
    public final String a(Resources resources, cmrl cmrlVar) {
        return resources.getString(R.string.add_reaction_for_gif_rcs_fallback_text, cmrlVar.d);
    }

    @Override // defpackage.cmtb
    public final String b(Resources resources, cmrl cmrlVar) {
        return resources.getString(R.string.remove_reaction_from_gif_rcs_fallback_text, cmrlVar.d);
    }
}
