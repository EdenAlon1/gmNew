package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uq extends ti {
    final int c;
    final int d;
    public up e;
    private MenuItem f;

    public uq(Context context, boolean z) {
        super(context, z);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        this.c = layoutDirection == 1 ? 21 : 22;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.ti, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        oa oaVar;
        int i;
        up upVar;
        up upVar2;
        int pointToPosition;
        int i2;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i3 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                oaVar = (oa) headerViewListAdapter.getWrappedAdapter();
            } else {
                oaVar = (oa) adapter;
                i = 0;
            }
            og item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= oaVar.getCount()) ? null : oaVar.getItem(i2);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                od odVar = oaVar.a;
                if (menuItem != null && (upVar2 = ((ur) this.e).b) != null) {
                    ((nv) upVar2).a.a.removeCallbacksAndMessages(odVar);
                }
                this.f = item;
                if (item != null && (upVar = ((ur) this.e).b) != null) {
                    nv nvVar = (nv) upVar;
                    nvVar.a.a.removeCallbacksAndMessages(null);
                    int size = nvVar.a.b.size();
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        }
                        if (odVar == ((nw) nvVar.a.b.get(i3)).b) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != -1) {
                        int i4 = i3 + 1;
                        nvVar.a.a.postAtTime(new nu(nvVar, i4 < nvVar.a.b.size() ? (nw) nvVar.a.b.get(i4) : null, item, odVar), odVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (oa) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (oa) adapter).a.i(false);
        return true;
    }
}
