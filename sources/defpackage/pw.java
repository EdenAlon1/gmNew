package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pw extends tz {

    @ViewDebug.ExportedProperty
    public boolean a;

    @ViewDebug.ExportedProperty
    public int b;

    @ViewDebug.ExportedProperty
    public int c;

    @ViewDebug.ExportedProperty
    public boolean d;

    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public pw() {
        super(-2);
        this.a = false;
    }

    public pw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public pw(pw pwVar) {
        super((ViewGroup.LayoutParams) pwVar);
        this.a = pwVar.a;
    }

    public pw(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
