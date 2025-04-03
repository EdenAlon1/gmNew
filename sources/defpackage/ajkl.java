package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.privacy.identitydetails.IdentityDetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajkl implements fbba {
    public static IdentityDetailsActivity a(Activity activity) {
        if (!(activity instanceof IdentityDetailsActivity)) {
            throw new IllegalStateException(a.I(activity, ajkk.class, "Attempt to inject a Activity wrapper of type "));
        }
        IdentityDetailsActivity identityDetailsActivity = (IdentityDetailsActivity) activity;
        identityDetailsActivity.getClass();
        return identityDetailsActivity;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
