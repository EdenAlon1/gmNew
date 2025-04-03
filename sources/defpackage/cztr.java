package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cztr implements tvc {
    private final Context a;

    public cztr(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.tvc
    public final /* bridge */ /* synthetic */ wr a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.calendar_badge, viewGroup, false);
        inflate.getClass();
        return new cztq(inflate);
    }
}
