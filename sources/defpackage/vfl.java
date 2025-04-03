package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfl implements tvc {
    private final Context a;
    private final vfm b;

    public vfl(Context context, vfm vfmVar) {
        this.a = context;
        this.b = vfmVar;
    }

    @Override // defpackage.tvc
    public final /* bridge */ /* synthetic */ wr a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.reaction_badge, viewGroup, false);
        vfc vfcVar = (vfc) this.b.a.b();
        vfcVar.getClass();
        inflate.getClass();
        return new vfk(vfcVar, inflate);
    }
}
