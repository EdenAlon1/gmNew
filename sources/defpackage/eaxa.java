package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eaxa extends FrameLayout implements ebwc {
    private boolean a;
    private boolean b;

    public eaxa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public abstract int a();

    @Override // defpackage.ebwc
    public final void b(ebvw ebvwVar) {
        if (this.a) {
            ebvwVar.c(this, a());
            this.b = true;
        }
    }

    public final void c(ebvw ebvwVar, dvxb dvxbVar) {
        if (this.a) {
            ebvwVar.d(this, a(), dvxbVar);
            this.b = true;
        }
    }

    public final void d() {
        this.a = true;
    }

    @Override // defpackage.ebwc
    public final void ho(ebvw ebvwVar) {
        if (this.a && this.b) {
            ebvwVar.e(this);
            this.b = false;
        }
    }
}
