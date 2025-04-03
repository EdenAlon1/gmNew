package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acg extends ffkk implements ffji {
    public static final acg a = new acg();

    public acg() {
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
