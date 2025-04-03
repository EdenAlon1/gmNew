package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvth extends ktb {
    final /* synthetic */ emxc a;
    final /* synthetic */ dvti b;

    public dvth(dvti dvtiVar, emxc emxcVar) {
        this.a = emxcVar;
        this.b = dvtiVar;
    }

    @Override // defpackage.ktb
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 65536) {
            this.b.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        if (TextUtils.isEmpty(kxuVar.f())) {
            kxuVar.S(this.a.c());
            return;
        }
        kxuVar.S(String.valueOf(kxuVar.f()) + ", " + ((String) this.a.c()));
    }
}
