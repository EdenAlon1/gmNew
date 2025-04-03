package defpackage;

import android.util.Log;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgoj extends dgol {
    final /* synthetic */ WeakReference a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgoj(dfre dfreVar, WeakReference weakReference) {
        super(dfreVar);
        this.a = weakReference;
    }

    @Override // defpackage.dgok
    protected final void n(IGoogleHelpService iGoogleHelpService) {
        try {
            iGoogleHelpService.processTogglingPip(null, new dgoi(this, this.a));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Toggling to help failed!", e);
            j(dgom.a);
        }
    }
}
