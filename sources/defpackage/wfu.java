package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfu implements tvc {
    private final Context a;

    public wfu(Context context) {
        this.a = context;
    }

    @Override // defpackage.tvc
    public final /* bridge */ /* synthetic */ wr a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.star_badge, viewGroup, false);
        inflate.getClass();
        return new wft(inflate);
    }
}
