package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgg implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ wgh a;
    final /* synthetic */ RecyclerView b;
    final /* synthetic */ eisx c;
    final /* synthetic */ Activity d;

    public wgg(wgh wghVar, RecyclerView recyclerView, eisx eisxVar, Activity activity) {
        this.a = wghVar;
        this.b = recyclerView;
        this.c = eisxVar;
        this.d = activity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final wgh wghVar = this.a;
        if (!wghVar.d || !wghVar.e) {
            return true;
        }
        RecyclerView recyclerView = this.b;
        final eisx eisxVar = this.c;
        final Activity activity = this.d;
        recyclerView.post(new Runnable() { // from class: wgf
            @Override // java.lang.Runnable
            public final void run() {
                eisx eisxVar2 = eisxVar;
                Activity activity2 = activity;
                wgh wghVar2 = wgh.this;
                ekzm b = wghVar2.a.b("MessageListFragmentPeer#onPreDraw");
                try {
                    ekzz f = eleg.f("MessageListStartupTracker#onReady");
                    try {
                        ((alrv) wghVar2.b.b()).f(alrv.w);
                        if (wghVar2.f) {
                            ffig.a(f, null);
                        } else {
                            wge wgeVar = (wge) wghVar2.c.a(wge.class);
                            wgeVar.b = true;
                            wgeVar.a(eisxVar2, activity2);
                            ffig.a(f, null);
                        }
                        ffig.a(b, null);
                    } finally {
                    }
                } finally {
                }
            }
        });
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
