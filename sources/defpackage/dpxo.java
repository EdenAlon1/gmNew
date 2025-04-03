package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpxo implements dpnl {
    private final dpye a;

    public dpxo(dpye dpyeVar) {
        this.a = dpyeVar;
    }

    @Override // defpackage.dpnl
    public final dpnn a(ViewGroup viewGroup, dpnj dpnjVar, ffji ffjiVar) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mini_camera, viewGroup, false);
        dpye dpyeVar = this.a;
        Context context = (Context) dpyeVar.a.b();
        context.getClass();
        ea eaVar = (ea) ((fbbb) dpyeVar.b).a;
        dpuj dpujVar = (dpuj) dpyeVar.c.b();
        dqkk dqkkVar = (dqkk) dpyeVar.d.b();
        dqkkVar.getClass();
        ffsk ffskVar = (ffsk) dpyeVar.e.b();
        ffskVar.getClass();
        Optional optional = (Optional) dpyeVar.f.b();
        dqli dqliVar = (dqli) dpyeVar.g.b();
        dqliVar.getClass();
        inflate.getClass();
        return new dpyd(context, eaVar, dpujVar, dqkkVar, ffskVar, optional, dqliVar, inflate, dpnjVar, ffjiVar);
    }
}
