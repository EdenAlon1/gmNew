package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aepb {
    public final fazb a;
    public final ffsk b;
    public AppBarLayout c;
    public Toolbar d;
    private Typeface e;

    public aepb(fazb fazbVar, ffsk ffskVar) {
        fazbVar.getClass();
        ffskVar.getClass();
        this.a = fazbVar;
        this.b = ffskVar;
    }

    public final Typeface a(ea eaVar) {
        if (this.e == null) {
            Context z = eaVar.z();
            this.e = Typeface.createFromAsset(z != null ? z.getAssets() : null, "ProductSans-Regular.ttf");
        }
        Typeface typeface = this.e;
        typeface.getClass();
        return typeface;
    }
}
