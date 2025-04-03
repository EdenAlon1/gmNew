package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebov {
    public static void a(RecyclerView recyclerView, vk vkVar) {
        ebou ebouVar = new ebou(recyclerView, vkVar);
        int[] iArr = kvo.a;
        if (recyclerView.isAttachedToWindow()) {
            ebouVar.onViewAttachedToWindow(recyclerView);
        }
        recyclerView.addOnAttachStateChangeListener(ebouVar);
    }
}
