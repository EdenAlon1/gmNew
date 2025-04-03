package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oad extends ffkk implements ffji {
    public static final oad a = new oad();

    public oad() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
