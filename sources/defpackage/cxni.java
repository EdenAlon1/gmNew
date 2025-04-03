package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxni implements View.OnLayoutChangeListener {
    final /* synthetic */ cxnk a;

    public cxni(cxnk cxnkVar) {
        this.a = cxnkVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        final cxnk cxnkVar = this.a;
        cxnkVar.s.post(new Runnable() { // from class: cxne
            @Override // java.lang.Runnable
            public final void run() {
                cxnk cxnkVar2 = cxnk.this;
                int childCount = cxnkVar2.b.getChildCount();
                if (childCount <= 1) {
                    return;
                }
                View childAt = cxnkVar2.b.getChildAt(childCount - 1);
                childAt.getClass();
                AttachmentsContainer attachmentsContainer = cxnkVar2.s;
                attachmentsContainer.smoothScrollTo(childAt.getRight(), attachmentsContainer.getScrollY());
            }
        });
        this.a.b.removeOnLayoutChangeListener(this);
    }
}
