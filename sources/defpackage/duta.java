package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duta extends wt {
    final /* synthetic */ dutb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duta(dutb dutbVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.c = dutbVar;
    }

    @Override // defpackage.ktb
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        duua duuaVar;
        if (accessibilityEvent.getEventType() == 1 && (duuaVar = this.c.s) != null) {
            duuaVar.b();
        }
        return super.h(viewGroup, view, accessibilityEvent);
    }
}
