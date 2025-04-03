package defpackage;

import android.content.Intent;
import android.support.v7.widget.ShareActionProvider;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xu implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ ShareActionProvider a;

    public xu(ShareActionProvider shareActionProvider) {
        this.a = shareActionProvider;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ShareActionProvider shareActionProvider = this.a;
        Intent b = qd.e(shareActionProvider.mContext, shareActionProvider.mShareHistoryFileName).b(menuItem.getItemId());
        if (b == null) {
            return true;
        }
        String action = b.getAction();
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
            this.a.updateIntent(b);
        }
        this.a.mContext.startActivity(b);
        return true;
    }
}
