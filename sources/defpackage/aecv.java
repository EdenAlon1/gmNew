package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aecv implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ elds a;
    final /* synthetic */ ViewTreeObserver.OnPreDrawListener b;
    final /* synthetic */ aedh c;

    public aecv(aedh aedhVar, elds eldsVar, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
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
                return onPreDraw;
            } finally {
            }
        } finally {
            aedh aedhVar = this.c;
            if (aedhVar.aJ) {
                aedh.b(aedhVar.b).getViewTreeObserver().removeOnPreDrawListener(this);
                this.c.aG = new ViewTreeObserver.OnPreDrawListener() { // from class: aecu
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        return true;
                    }
                };
            }
        }
    }
}
