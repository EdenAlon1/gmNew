package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqm implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
            int i2 = message.arg1;
            if (!baseTransientBottomBar.m() || baseTransientBottomBar.j.getVisibility() != 0) {
                baseTransientBottomBar.p();
            } else if (baseTransientBottomBar.j.c == 1) {
                ValueAnimator c = baseTransientBottomBar.c(1.0f, 0.0f);
                c.setDuration(baseTransientBottomBar.d);
                c.addListener(new ehqf(baseTransientBottomBar, i2));
                c.start();
            } else {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(0, baseTransientBottomBar.b());
                valueAnimator.setInterpolator(baseTransientBottomBar.f);
                valueAnimator.setDuration(baseTransientBottomBar.e);
                valueAnimator.addListener(new ehqk(baseTransientBottomBar, i2));
                valueAnimator.addUpdateListener(new ehql(baseTransientBottomBar));
                valueAnimator.start();
            }
            return true;
        }
        BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
        if (baseTransientBottomBar2.j.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar2.j.getLayoutParams();
            if (layoutParams instanceof kkw) {
                kkw kkwVar = (kkw) layoutParams;
                BaseTransientBottomBar.Behavior behavior = new BaseTransientBottomBar.Behavior();
                behavior.g.a = baseTransientBottomBar2.u;
                behavior.f = new ehqs(baseTransientBottomBar2);
                kkwVar.b(behavior);
                if (baseTransientBottomBar2.d() == null) {
                    kkwVar.g = 80;
                }
            }
            ehqz ehqzVar = baseTransientBottomBar2.j;
            ViewGroup viewGroup = baseTransientBottomBar2.h;
            ehqzVar.g = true;
            viewGroup.addView(ehqzVar);
            ehqzVar.g = false;
            baseTransientBottomBar2.h();
            baseTransientBottomBar2.j.setVisibility(4);
        }
        if (baseTransientBottomBar2.j.isLaidOut()) {
            baseTransientBottomBar2.j();
        } else {
            baseTransientBottomBar2.r = true;
        }
        return true;
    }
}
