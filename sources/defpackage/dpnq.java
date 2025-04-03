package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpnq implements dpnl {
    private final dpnu a;

    public dpnq(dpnu dpnuVar) {
        this.a = dpnuVar;
    }

    @Override // defpackage.dpnl
    public final dpnn a(ViewGroup viewGroup, dpnj dpnjVar, ffji ffjiVar) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.camera_button, viewGroup, false);
        dqkk dqkkVar = (dqkk) this.a.a.b();
        dqkkVar.getClass();
        inflate.getClass();
        return new dpnt(dqkkVar, inflate, dpnjVar);
    }
}
