package defpackage;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlnw {
    public final Window a;
    public emxc b = emux.a;
    final /* synthetic */ dlnx c;

    public dlnw(dlnx dlnxVar, Window window) {
        this.c = dlnxVar;
        this.a = window;
    }

    public final void a() {
        Log.d("SystemUiManager", "ClientAppWindow#maybeRegisterOnSystemUiVisibilityChangeListener()");
        if (this.c.b.g()) {
            final View decorView = this.a.getDecorView();
            if (Build.VERSION.SDK_INT <= 27) {
                ((Activity) this.c.b.c()).runOnUiThread(new Runnable() { // from class: dlno
                    @Override // java.lang.Runnable
                    public final void run() {
                        final dlnw dlnwVar = dlnw.this;
                        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: dlnt
                            @Override // android.view.View.OnSystemUiVisibilityChangeListener
                            public final void onSystemUiVisibilityChange(int i) {
                                dlnw dlnwVar2 = dlnw.this;
                                if (!dlnwVar2.c.f.g() || ((Integer) dlnwVar2.c.f.c()).intValue() == i) {
                                    return;
                                }
                                Log.d("SystemUiManager", String.format("#OnSystemUiVisibilityChange(): restore SystemUiVisibility from %d to %d.", Integer.valueOf(i), dlnwVar2.c.f.c()));
                                dlnwVar2.f(((Integer) dlnwVar2.c.f.c()).intValue());
                            }
                        });
                    }
                });
            }
        }
    }

    public final void b() {
        Log.d("SystemUiManager", "ClientAppWindow#maybeUnregisterOnSystemUiVisibilityChangeListener()");
        if (!this.c.b.g() || Build.VERSION.SDK_INT > 27) {
            return;
        }
        ((Activity) this.c.b.c()).runOnUiThread(new Runnable() { // from class: dlnv
            @Override // java.lang.Runnable
            public final void run() {
                dlnw.this.a.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: dlnp
                    @Override // android.view.View.OnSystemUiVisibilityChangeListener
                    public final void onSystemUiVisibilityChange(int i) {
                    }
                });
            }
        });
    }

    public final void c() {
        Log.d("SystemUiManager", "ClientAppWindow#registerOnApplyWindowInsetsListener()");
        if (this.c.b.g()) {
            final View decorView = this.a.getDecorView();
            this.b = emxc.j(Integer.valueOf(((ViewGroup.MarginLayoutParams) decorView.findViewById(R.id.content).getLayoutParams()).topMargin));
            ((Activity) this.c.b.c()).runOnUiThread(new Runnable() { // from class: dlnr
                @Override // java.lang.Runnable
                public final void run() {
                    View findViewById = decorView.findViewById(R.id.content);
                    final dlnw dlnwVar = dlnw.this;
                    findViewById.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dlnm
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            Log.d("SystemUiManager", "#OnApplyWindowInsets(): top inset height = " + windowInsets.getSystemWindowInsetTop());
                            emxc j = emxc.j(Integer.valueOf(windowInsets.getSystemWindowInsetTop()));
                            dlnw dlnwVar2 = dlnw.this;
                            dlnwVar2.c.e = j;
                            dlnwVar2.h();
                            return windowInsets;
                        }
                    });
                }
            });
        }
    }

    public final void d() {
        Log.d("SystemUiManager", "ClientAppWindow#reinstateContentViewTopMargin()");
        if (this.c.b.g()) {
            ((Activity) this.c.b.c()).runOnUiThread(new Runnable() { // from class: dlnu
                @Override // java.lang.Runnable
                public final void run() {
                    dlnw dlnwVar = dlnw.this;
                    ((ViewGroup.MarginLayoutParams) dlnwVar.a.getDecorView().findViewById(R.id.content).getLayoutParams()).topMargin = ((Integer) dlnwVar.b.e(0)).intValue();
                    dlnwVar.b = emux.a;
                }
            });
        }
    }

    public final void e() {
        final boolean z = this.c.a.get();
        Log.d("SystemUiManager", String.format("ClientAppWindow#reinstateSystemUiVisibility(): wasSystemBarHidden = %b", Boolean.valueOf(z)));
        if (this.c.b.g()) {
            ((Activity) this.c.b.c()).runOnUiThread(new Runnable() { // from class: dlnq
                @Override // java.lang.Runnable
                public final void run() {
                    dlnw dlnwVar = dlnw.this;
                    int systemUiVisibility = dlnwVar.a.getDecorView().getSystemUiVisibility();
                    boolean z2 = z;
                    int i = systemUiVisibility & (~dlnx.f(z2));
                    Log.d("SystemUiManager", String.format("ClientAppWindow#reinstateSystemUiVisibility():visibility = %d, restoreSystemNavBar = %b", Integer.valueOf(i), Boolean.valueOf(z2)));
                    dlnwVar.a.getDecorView().setSystemUiVisibility(i);
                }
            });
        }
    }

    public final void f(final int i) {
        Log.d("SystemUiManager", String.format("ClientAppWindow#setSystemUiVisibility(%d): activityOptional.isPresent() = %b", Integer.valueOf(i), Boolean.valueOf(this.c.b.g())));
        if (this.c.b.g()) {
            ((Activity) this.c.b.c()).runOnUiThread(new Runnable() { // from class: dlnl
                @Override // java.lang.Runnable
                public final void run() {
                    dlnw dlnwVar = dlnw.this;
                    Window window = dlnwVar.a;
                    int i2 = i;
                    Log.d("SystemUiManager", String.format("ClientAppWindow#setSystemUiVisibility: window = %s, uiOptions = %d", window, Integer.valueOf(i2)));
                    dlnwVar.a.getDecorView().setSystemUiVisibility(i2);
                }
            });
        }
    }

    public final void g() {
        Log.d("SystemUiManager", "ClientAppWindow#unregisterOnApplyWindowInsetsListener()");
        if (this.c.b.g()) {
            ((Activity) this.c.b.c()).runOnUiThread(new Runnable() { // from class: dlnn
                @Override // java.lang.Runnable
                public final void run() {
                    dlnw.this.a.getDecorView().findViewById(R.id.content).setOnApplyWindowInsetsListener(null);
                }
            });
        }
    }

    public final void h() {
        Log.d("SystemUiManager", "ClientAppWindow#updateContentViewTopMargin()");
        if (this.c.b.g() && this.b.g() && this.c.e.g()) {
            ((Activity) this.c.b.c()).runOnUiThread(new Runnable() { // from class: dlns
                @Override // java.lang.Runnable
                public final void run() {
                    dlnw dlnwVar = dlnw.this;
                    ((ViewGroup.MarginLayoutParams) dlnwVar.a.getDecorView().findViewById(R.id.content).getLayoutParams()).topMargin = ((Integer) dlnwVar.b.c()).intValue() + ((Integer) dlnwVar.c.e.c()).intValue();
                }
            });
        }
    }
}
