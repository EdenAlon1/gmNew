package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfp implements tvc {
    @Override // defpackage.tvc
    public final /* bridge */ /* synthetic */ wr a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_reaction_badge, viewGroup, false);
        inflate.getClass();
        return new vfo(inflate);
    }
}
