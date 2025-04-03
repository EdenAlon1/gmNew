package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class led extends leh {
    @Override // defpackage.lej
    public final /* synthetic */ float a(Object obj) {
        return ((View) obj).getRotation();
    }

    @Override // defpackage.lej
    public final /* synthetic */ void b(Object obj, float f) {
        ((View) obj).setRotation(f);
    }
}
