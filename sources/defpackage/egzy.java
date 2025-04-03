package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class egzy<V extends View> extends kkt<V> {
    private egzz a;
    private int b;

    public egzy() {
        this.b = 0;
    }

    public final int I() {
        egzz egzzVar = this.a;
        if (egzzVar != null) {
            return egzzVar.b;
        }
        return 0;
    }

    public final boolean J(int i) {
        egzz egzzVar = this.a;
        if (egzzVar != null) {
            return egzzVar.c(i);
        }
        this.b = i;
        return false;
    }

    protected void fK(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.j(view, i);
    }

    @Override // defpackage.kkt
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        fK(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new egzz(view);
        }
        this.a.b();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.c(i2);
        this.b = 0;
        return true;
    }

    public egzy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
