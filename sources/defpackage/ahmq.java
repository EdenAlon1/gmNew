package defpackage;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmq implements ljv {
    public final dsfg a;
    private final eg b;
    private final ea c;
    private final uhd d;

    public ahmq(eg egVar, ea eaVar, uhd uhdVar, dsfg dsfgVar) {
        this.b = egVar;
        this.c = eaVar;
        this.d = uhdVar;
        this.a = dsfgVar;
        eaVar.P().c(new eleu(this));
        egVar.findViewById(R.id.content).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ahmp
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                view.getClass();
                windowInsets.getClass();
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            }
        });
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        Bundle extras;
        Intent intent = this.b.getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            this.a.j(extras);
        }
        this.a.f();
        this.d.a();
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        Bundle extras;
        Intent intent = this.b.getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            this.a.i(extras);
        }
        this.a.d();
        this.d.b();
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }
}
