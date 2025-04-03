package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaw {
    private static boolean a = true;
    private final ViewGroup b;
    private final Object c = new Object();
    private igm d;

    public iaw(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    private final igm c(ViewGroup viewGroup) {
        igm igmVar = this.d;
        if (igmVar != null) {
            return igmVar;
        }
        ign ignVar = new ign(viewGroup.getContext());
        viewGroup.addView(ignVar);
        this.d = ignVar;
        return ignVar;
    }

    public final iga a() {
        igd igiVar;
        iga igaVar;
        synchronized (this.c) {
            ViewGroup viewGroup = this.b;
            if (Build.VERSION.SDK_INT >= 29) {
                viewGroup.getUniqueDrawingId();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                igiVar = new igg(new ibu(), new ifm());
            } else if (a) {
                try {
                    igiVar = new igf(this.b, new ibu(), new ifm());
                } catch (Throwable unused) {
                    a = false;
                    igiVar = new igi(c(this.b));
                }
            } else {
                igiVar = new igi(c(this.b));
            }
            igaVar = new iga(igiVar);
        }
        return igaVar;
    }

    public final void b(iga igaVar) {
        synchronized (this.c) {
            if (!igaVar.l) {
                igaVar.l = true;
                igaVar.e();
            }
        }
    }
}
