package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hyw extends ffkh implements ffix {
    public hyw(Object obj) {
        super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) this.g;
        if (focusOwnerImpl.g == null || focusOwnerImpl.b.g() == hzo.d) {
            focusOwnerImpl.a.invoke();
        }
        return ffcu.a;
    }
}
