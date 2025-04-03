package defpackage;

import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyw extends kys {
    private final ListView f;

    public kyw(ListView listView) {
        super(listView);
        this.f = listView;
    }

    @Override // defpackage.kys
    public final boolean b(int i) {
        ListView listView = this.f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            return i2 < count || listView.getChildAt(childCount + (-1)).getBottom() > listView.getHeight();
        }
        if (i < 0) {
            return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0;
        }
        return false;
    }

    @Override // defpackage.kys
    public final void d(int i) {
        this.f.scrollListBy(i);
    }
}
