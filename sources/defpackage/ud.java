package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ud {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public List l = null;

    public final View a(wf wfVar) {
        List list = this.l;
        if (list == null) {
            View c = wfVar.c(this.d);
            this.d += this.e;
            return c;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((wr) this.l.get(i)).a;
            vy vyVar = (vy) view.getLayoutParams();
            if (!vyVar.c() && this.d == vyVar.a()) {
                c(view);
                return view;
            }
        }
        return null;
    }

    public final void b() {
        c(null);
    }

    public final void c(View view) {
        int a;
        int size = this.l.size();
        int i = 0;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        View view2 = null;
        while (true) {
            if (i >= size) {
                break;
            }
            View view3 = ((wr) this.l.get(i)).a;
            vy vyVar = (vy) view3.getLayoutParams();
            if (view3 != view && !vyVar.c() && (a = (vyVar.a() - this.d) * this.e) >= 0 && a < i2) {
                if (a == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i2 = a;
                }
            }
            i++;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((vy) view2.getLayoutParams()).a();
        }
    }

    public final boolean d(wo woVar) {
        int i = this.d;
        return i >= 0 && i < woVar.a();
    }
}
