package defpackage;

import android.text.TextWatcher;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqkj implements dqkk {
    @Override // defpackage.dqkk
    public final Object d(String str, ffji ffjiVar, ffgu ffguVar) {
        return ffjiVar.invoke(ffguVar);
    }

    @Override // defpackage.dqkk
    public final Object e(String str, ffix ffixVar) {
        return ffixVar.invoke();
    }

    @Override // defpackage.dqkk
    public final Object f(String str, ffji ffjiVar, ffgu ffguVar) {
        return ffjiVar.invoke(ffguVar);
    }

    @Override // defpackage.dqkk
    public final Object g(String str, ffix ffixVar) {
        return ffixVar.invoke();
    }

    @Override // defpackage.dqkk
    public final /* synthetic */ ffhd h(ScheduledExecutorService scheduledExecutorService) {
        return new fftt(scheduledExecutorService);
    }

    @Override // defpackage.dqkk
    public final TextWatcher a(String str, TextWatcher textWatcher) {
        return textWatcher;
    }

    @Override // defpackage.dqkk
    public final View.OnClickListener b(String str, View.OnClickListener onClickListener) {
        return onClickListener;
    }

    @Override // defpackage.dqkk
    public final View.OnLongClickListener c(String str, View.OnLongClickListener onLongClickListener) {
        return onLongClickListener;
    }
}
