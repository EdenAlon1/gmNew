package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abg extends Dialog implements lkr, acd, owz {
    private lkv a;
    public final aca b;
    private final owy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abg(Context context, int i) {
        super(context, i);
        context.getClass();
        this.c = owx.a(this);
        this.b = new aca(new Runnable() { // from class: abf
            @Override // java.lang.Runnable
            public final void run() {
                abg.i(abg.this);
            }
        });
    }

    private final lkv a() {
        lkv lkvVar = this.a;
        if (lkvVar != null) {
            return lkvVar;
        }
        lkv lkvVar2 = new lkv(this);
        this.a = lkvVar2;
        return lkvVar2;
    }

    public static final void i(abg abgVar) {
        super.onBackPressed();
    }

    @Override // defpackage.lkr
    public final lkk P() {
        return a();
    }

    @Override // defpackage.owz
    public final owv U() {
        return this.c.a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        h();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.acd
    public final aca gE() {
        return this.b;
    }

    public final void h() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        lmz.b(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        aci.a(decorView2, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        oxa.b(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.b.d();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            aca acaVar = this.b;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            acaVar.e(onBackInvokedDispatcher);
        }
        this.c.b(bundle);
        a().e(lki.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.c.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        a().e(lki.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        a().e(lki.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        h();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        h();
        super.setContentView(view);
    }

    public /* synthetic */ abg(Context context) {
        this(context, 0);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        h();
        super.setContentView(view, layoutParams);
    }
}
