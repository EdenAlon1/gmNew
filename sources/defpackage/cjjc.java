package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjc extends cjjh implements ekhu {
    private cjjd i;
    private Context j;

    @Deprecated
    public cjjc(Context context) {
        super(context);
        g();
    }

    private final void g() {
        if (this.i == null) {
            try {
                this.i = ((cjje) aX()).S();
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof fbas) && !(context instanceof fbal.a) && !(context instanceof ekkn)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (!(context instanceof ekke)) {
                    throw new IllegalStateException(a.L(this));
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cjjd.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final cjjd H() {
        cjjd cjjdVar = this.i;
        if (cjjdVar != null) {
            return cjjdVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kjz();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ekkw.a(getContext())) {
            Context a = ekkv.a(this);
            Context context = this.j;
            if (context == null) {
                this.j = a;
                return;
            }
            boolean z = true;
            if (context != a && !ekkv.b(context)) {
                z = false;
            }
            emxf.m(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        g();
    }
}
