package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izo extends ffkk implements ffji {
    final /* synthetic */ AndroidComposeView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izo(AndroidComposeView androidComposeView) {
        super(1);
        this.a = androidComposeView;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final ffix ffixVar = (ffix) obj;
        Handler handler = this.a.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            ffixVar.invoke();
        } else {
            Handler handler2 = this.a.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: izn
                    @Override // java.lang.Runnable
                    public final void run() {
                        ffix.this.invoke();
                    }
                });
            }
        }
        return ffcu.a;
    }
}
