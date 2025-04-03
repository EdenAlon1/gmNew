package defpackage;

import android.content.Context;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeta extends ConstraintLayout implements eetz, eete {
    public final eere d;
    public final RecyclerView e;
    public final ImageView f;
    public final View g;
    public final eesu h;
    private final eetf i;
    private final TextView j;
    private final ImageButton k;
    private final eesz l;
    private final eety m;

    public eeta(Context context, eety eetyVar) {
        super(context);
        this.m = eetyVar;
        setId(R.id.favorites_sticker_packs_view);
        eere b = ((eerf) getContext().getApplicationContext()).b();
        this.d = b;
        this.i = new eetf(b);
        inflate(getContext(), R.layout.favorite_sticker_packs_layout, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.favorites_recycler_view);
        this.e = recyclerView;
        this.f = (ImageView) findViewById(R.id.empty_favorites_image);
        this.j = (TextView) findViewById(R.id.empty_favorites_text);
        View findViewById = findViewById(R.id.favorites_prompt);
        this.g = findViewById;
        ImageButton imageButton = (ImageButton) findViewById(R.id.favorites_prompt_close_button);
        this.k = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: eesw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eeta eetaVar = eeta.this;
                eetaVar.d.o().c(false);
                eetaVar.e(true);
            }
        });
        eesu eesuVar = new eesu(b, eetyVar);
        this.h = eesuVar;
        getContext();
        recyclerView.ap(new LinearLayoutManager());
        recyclerView.am(eesuVar);
        eesuVar.A(new eesx(this));
        eesz eeszVar = new eesz(eesuVar);
        this.l = eeszVar;
        b.j(eeszVar);
        if (eetyVar.G()) {
            int color = getContext().getColor(R.color.white);
            TextView textView = (TextView) findViewById(R.id.favorites_prompt_text);
            TextView textView2 = (TextView) findViewById(R.id.empty_favorites_text);
            findViewById.setBackground(getResources().getDrawable(R.drawable.favorites_prompt_background_dark_mode));
            imageButton.getDrawable().mutate().setTint(color);
            textView.setTextColor(color);
            textView2.setTextColor(color);
        }
    }

    private final void g() {
        if (this.g.getVisibility() != 0 || this.d.o().e()) {
            return;
        }
        e(false);
    }

    @Override // defpackage.eetz
    public final void b() {
        g();
        ((eeuj) this.d.a()).i(7);
    }

    @Override // defpackage.eetz
    public final void c() {
        eesu eesuVar = this.h;
        Iterator it = eesuVar.f.iterator();
        while (it.hasNext()) {
            eesuVar.m((String) it.next());
        }
        eesuVar.f.clear();
        g();
    }

    public final void d() {
        this.e.setVisibility(0);
        this.f.setVisibility(8);
        this.j.setVisibility(8);
    }

    public final void e(boolean z) {
        if (this.g.getVisibility() == 8) {
            return;
        }
        this.k.setClickable(false);
        if (!z) {
            this.g.setVisibility(8);
            return;
        }
        this.g.setVisibility(4);
        this.e.animate().translationY(-this.g.getHeight()).setDuration(300L).setListener(new eesy(this));
    }

    public final void f() {
        this.e.setVisibility(8);
        this.f.setVisibility(0);
        this.j.setVisibility(0);
        e(false);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT < 27) {
            return windowInsets;
        }
        this.e.setSystemUiVisibility(1280);
        this.e.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eesv
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets2) {
                view.setPadding(0, eeta.this.getResources().getDimensionPixelSize(R.dimen.favorites_view_padding_top), 0, windowInsets2.getSystemWindowInsetBottom());
                return windowInsets;
            }
        });
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eetf eetfVar = this.i;
        eetfVar.b = this;
        errl h = eetfVar.a.h();
        final eesb o = eetfVar.a.o();
        eetfVar.c = h.submit(new Callable() { // from class: eetb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(eesb.this.e());
            }
        });
        erqt.r(eetfVar.c, new eetc(eetfVar), eerw.a);
        eetf eetfVar2 = this.i;
        eetfVar2.d = eetfVar2.a.b();
        erqt.r(eetfVar2.d, new eetd(eetfVar2), eerw.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        eetf eetfVar = this.i;
        eetfVar.b = null;
        ListenableFuture listenableFuture = eetfVar.c;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
        ListenableFuture listenableFuture2 = eetfVar.d;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(true);
        }
        this.d.l(this.l);
        eesu eesuVar = this.h;
        Iterator it = eesuVar.h.values().iterator();
        while (it.hasNext()) {
            ((ListenableFuture) it.next()).cancel(true);
        }
        Iterator it2 = eesuVar.i.values().iterator();
        while (it2.hasNext()) {
            ((ListenableFuture) it2.next()).cancel(true);
        }
    }
}
