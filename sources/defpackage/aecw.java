package defpackage;

import android.R;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aecw implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ elds a;
    final /* synthetic */ ViewTreeObserver.OnPreDrawListener b;
    final /* synthetic */ aedh c;

    public aecw(aedh aedhVar, elds eldsVar, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.a = eldsVar;
        this.b = onPreDrawListener;
        this.c = aedhVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        try {
            elav a = this.a.a();
            try {
                boolean onPreDraw = this.b.onPreDraw();
                a.close();
                aedh aedhVar = this.c;
                if (aedhVar.b.a.c == lkj.DESTROYED) {
                    ensk h = aedh.a.h();
                    h.Y(ente.a, "HomeFragmentFlogger");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 4132, "HomeFragmentPeer.java")).q("fragment is destroyed after posting on UI thread.");
                    return onPreDraw;
                }
                if (!aedhVar.aJ) {
                    ensk h2 = aedh.a.h();
                    h2.Y(ente.a, "HomeFragmentFlogger");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 4141, "HomeFragmentPeer.java")).q("HomeScreen not ready. Keeping splash screen.");
                    return onPreDraw;
                }
                ensk h3 = aedh.a.h();
                h3.Y(ente.a, "HomeFragmentFlogger");
                ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 4134, "HomeFragmentPeer.java")).q("HomeScreen ready. Removing splash screen.");
                this.c.b.fe().findViewById(R.id.content).getViewTreeObserver().removeOnPreDrawListener(this);
                return onPreDraw;
            } finally {
            }
        } catch (Throwable th) {
            aedh aedhVar2 = this.c;
            if (aedhVar2.b.a.c == lkj.DESTROYED) {
                ensk h4 = aedh.a.h();
                h4.Y(ente.a, "HomeFragmentFlogger");
                ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 4132, "HomeFragmentPeer.java")).q("fragment is destroyed after posting on UI thread.");
            } else if (aedhVar2.aJ) {
                ensk h5 = aedh.a.h();
                h5.Y(ente.a, "HomeFragmentFlogger");
                ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 4134, "HomeFragmentPeer.java")).q("HomeScreen ready. Removing splash screen.");
                this.c.b.fe().findViewById(R.id.content).getViewTreeObserver().removeOnPreDrawListener(this);
            } else {
                ensk h6 = aedh.a.h();
                h6.Y(ente.a, "HomeFragmentFlogger");
                ((enrr) ((enrr) h6).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 4141, "HomeFragmentPeer.java")).q("HomeScreen not ready. Keeping splash screen.");
            }
            throw th;
        }
    }
}
