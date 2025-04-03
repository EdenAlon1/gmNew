package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qk implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
    final /* synthetic */ ActivityChooserView a;

    public qk(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityChooserView activityChooserView = this.a;
        int i = 0;
        if (view != activityChooserView.f) {
            if (view != activityChooserView.d) {
                throw new IllegalArgumentException();
            }
            activityChooserView.j = false;
            activityChooserView.b(activityChooserView.k);
            return;
        }
        activityChooserView.d();
        qj qjVar = this.a.a;
        ResolveInfo b = qjVar.b();
        qd qdVar = qjVar.a;
        synchronized (qdVar.b) {
            qdVar.f();
            List list = qdVar.c;
            int size = list.size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (((py) list.get(i)).a == b) {
                    break;
                } else {
                    i++;
                }
            }
        }
        Intent b2 = this.a.a.a.b(i);
        if (b2 != null) {
            b2.addFlags(524288);
            this.a.getContext().startActivity(b2);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        kte kteVar = this.a.h;
        if (kteVar != null) {
            kteVar.subUiVisibilityChanged(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (((qj) adapterView.getAdapter()).getItemViewType(i) != 0) {
            this.a.b(Alert.DURATION_SHOW_INDEFINITELY);
            return;
        }
        this.a.d();
        ActivityChooserView activityChooserView = this.a;
        if (activityChooserView.j) {
            if (i > 0) {
                qd qdVar = activityChooserView.a.a;
                synchronized (qdVar.b) {
                    qdVar.f();
                    py pyVar = (py) qdVar.c.get(i);
                    py pyVar2 = (py) qdVar.c.get(0);
                    qdVar.g(new qa(new ComponentName(pyVar.a.activityInfo.packageName, pyVar.a.activityInfo.name), System.currentTimeMillis(), pyVar2 != null ? (pyVar2.b - pyVar.b) + 5.0f : 1.0f));
                }
                return;
            }
            return;
        }
        qj qjVar = activityChooserView.a;
        if (!qjVar.c) {
            i++;
        }
        Intent b = qjVar.a.b(i);
        if (b != null) {
            b.addFlags(524288);
            this.a.getContext().startActivity(b);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ActivityChooserView activityChooserView = this.a;
        if (view != activityChooserView.f) {
            throw new IllegalArgumentException();
        }
        if (activityChooserView.a.getCount() > 0) {
            ActivityChooserView activityChooserView2 = this.a;
            activityChooserView2.j = true;
            activityChooserView2.b(activityChooserView2.k);
        }
        return true;
    }
}
