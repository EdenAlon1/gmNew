package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gm extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public gm(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        if (this.a.isEmpty()) {
            return null;
        }
        return this.a;
    }
}
