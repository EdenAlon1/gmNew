package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejzk extends wt {
    final wt c;
    final /* synthetic */ ejzm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejzk(ejzm ejzmVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.d = ejzmVar;
        this.c = recyclerView.S;
    }

    private final int l() {
        return Math.max(this.d.a(), -1);
    }

    @Override // defpackage.wt, defpackage.ktb
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setItemCount(l());
        accessibilityEvent.setFromIndex(accessibilityEvent.getFromIndex());
        accessibilityEvent.setToIndex(accessibilityEvent.getToIndex());
    }

    @Override // defpackage.wt, defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = kxuVar.a.getCollectionInfo();
        kxs kxsVar = collectionInfo != null ? new kxs(collectionInfo) : null;
        kxuVar.t(new kxs(AccessibilityNodeInfo.CollectionInfo.obtain(l(), kxsVar == null ? 1 : ((AccessibilityNodeInfo.CollectionInfo) kxsVar.a).getColumnCount(), kxsVar != null && ((AccessibilityNodeInfo.CollectionInfo) kxsVar.a).isHierarchical())));
    }
}
