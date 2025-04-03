package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehbm extends ehbc {
    private final Boolean a;
    private final kxh b;
    private Window c;
    private boolean d;

    public ehbm(View view, kxh kxhVar) {
        this.b = kxhVar;
        ehop ehopVar = BottomSheetBehavior.v(view).e;
        ColorStateList C = ehopVar != null ? ehopVar.C() : view.getBackgroundTintList();
        if (C != null) {
            this.a = Boolean.valueOf(ehdr.i(C.getDefaultColor()));
            return;
        }
        Integer g = ehjg.g(view);
        if (g != null) {
            this.a = Boolean.valueOf(ehdr.i(g.intValue()));
        } else {
            this.a = null;
        }
    }

    private final void e(View view) {
        if (view.getTop() < this.b.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                ehhu.a(window, bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), this.b.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                ehhu.a(window2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.ehbc
    public final void a(View view) {
        e(view);
    }

    @Override // defpackage.ehbc
    public final void b(View view, int i) {
        e(view);
    }

    @Override // defpackage.ehbc
    public final void c(View view) {
        e(view);
    }

    final void d(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            this.d = new kxp(window, window.getDecorView()).d();
        }
    }
}
