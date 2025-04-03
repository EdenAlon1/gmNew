package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akqf implements tvc {
    private final Context a;

    public akqf(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.tvc
    public final /* bridge */ /* synthetic */ wr a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.scheduled_send_badge, viewGroup, false);
        inflate.getClass();
        View findViewById = inflate.findViewById(R.id.scheduled_send_badge_icon);
        findViewById.getClass();
        ((ImageView) findViewById).getDrawable().setAutoMirrored(true);
        return new akqe(inflate);
    }
}
