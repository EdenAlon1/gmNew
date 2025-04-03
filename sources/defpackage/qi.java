package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qi extends DataSetObserver {
    final /* synthetic */ ActivityChooserView a;

    public qi(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int size;
        super.onChanged();
        ActivityChooserView activityChooserView = this.a;
        if (activityChooserView.a.getCount() > 0) {
            activityChooserView.d.setEnabled(true);
        } else {
            activityChooserView.d.setEnabled(false);
        }
        qj qjVar = activityChooserView.a;
        int a = qjVar.a();
        qd qdVar = qjVar.a;
        synchronized (qdVar.b) {
            qdVar.f();
            size = qdVar.d.size();
        }
        if (a == 1 || (a > 1 && size > 0)) {
            activityChooserView.f.setVisibility(0);
            ResolveInfo b = activityChooserView.a.b();
            PackageManager packageManager = activityChooserView.getContext().getPackageManager();
            activityChooserView.g.setImageDrawable(b.loadIcon(packageManager));
            if (activityChooserView.l != 0) {
                activityChooserView.f.setContentDescription(activityChooserView.getContext().getString(activityChooserView.l, b.loadLabel(packageManager)));
            }
        } else {
            activityChooserView.f.setVisibility(8);
        }
        if (activityChooserView.f.getVisibility() == 0) {
            activityChooserView.b.setBackgroundDrawable(activityChooserView.c);
        } else {
            activityChooserView.b.setBackgroundDrawable(null);
        }
    }
}
