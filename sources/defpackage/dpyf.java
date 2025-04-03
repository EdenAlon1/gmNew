package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyf implements dpnl {
    private final dpyj a;

    public dpyf(dpyj dpyjVar) {
        this.a = dpyjVar;
    }

    @Override // defpackage.dpnl
    public final dpnn a(ViewGroup viewGroup, dpnj dpnjVar, ffji ffjiVar) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.system_camera_picker_layout, viewGroup, false);
        dqkk dqkkVar = (dqkk) this.a.a.b();
        dqkkVar.getClass();
        inflate.getClass();
        return new dpyi(dqkkVar, inflate, dpnjVar);
    }
}
