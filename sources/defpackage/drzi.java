package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drzi implements dtad {
    public static final /* synthetic */ ffmx[] a;
    private ffud C;
    public final Activity b;
    public final ffsk c;
    public final ffsk d;
    public final dsma e;
    public final drxq f;
    public final ffix g;
    public final drxb h;
    public final boolean i;
    public boolean l;
    public boolean m;
    public final ffls n;
    private final ffsk o;
    private final boolean p;
    private final ffbz s;
    public final dryz j = new dryz(this);
    private final drza q = new drza(this);
    private final TextView.OnEditorActionListener r = new TextView.OnEditorActionListener() { // from class: drys
        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            dtal d;
            if (i != 3) {
                return false;
            }
            drzi drziVar = drzi.this;
            Editable text = drziVar.h.g.getText();
            text.getClass();
            Boolean bool = null;
            if (true == ffpc.J(text)) {
                text = null;
            }
            if (text == null) {
                return false;
            }
            dtan d2 = drziVar.d();
            if (d2 != null && (d = d2.d()) != null) {
                drziVar.e.e(drziVar.h.g, false);
                drziVar.i();
                drziVar.n(d, text);
                bool = true;
            }
            if (bool == null) {
                return false;
            }
            bool.booleanValue();
            return true;
        }
    };
    private final ffbz t = ffca.a(new ffix() { // from class: dryu
        @Override // defpackage.ffix
        public final Object invoke() {
            return drzi.this.b.getString(R.string.search_icon_content_description);
        }
    });
    private final ffbz u = ffca.a(new ffix() { // from class: dryv
        @Override // defpackage.ffix
        public final Object invoke() {
            return drzi.this.b.getString(R.string.search_back_icon_content_description);
        }
    });
    private final ffbz v = ffca.a(new ffix() { // from class: dryw
        @Override // defpackage.ffix
        public final Object invoke() {
            Drawable drawable = drzi.this.b.getDrawable(R.drawable.quantum_gm_ic_search_vd_theme_24);
            drawable.getClass();
            return drawable;
        }
    });
    private final ffbz w = ffca.a(new ffix() { // from class: dryi
        @Override // defpackage.ffix
        public final Object invoke() {
            Drawable drawable = drzi.this.b.getDrawable(R.drawable.quantum_ic_arrow_back_vd_theme_24);
            drawable.getClass();
            return drawable;
        }
    });
    private final ffbz x = ffca.a(new ffix() { // from class: dryj
        @Override // defpackage.ffix
        public final Object invoke() {
            Drawable drawable = drzi.this.b.getDrawable(R.drawable.quantum_ic_arrow_forward_vd_theme_24);
            drawable.getClass();
            return drawable;
        }
    });
    private final ffbz y = ffca.a(new ffix() { // from class: dryk
        @Override // defpackage.ffix
        public final Object invoke() {
            Drawable drawable = drzi.this.b.getDrawable(R.drawable.quantum_ic_close_vd_theme_24);
            drawable.getClass();
            return drawable;
        }
    });
    public final ffbz k = ffca.a(new ffix() { // from class: dryl
        @Override // defpackage.ffix
        public final Object invoke() {
            final drzi drziVar = drzi.this;
            Animation loadAnimation = AnimationUtils.loadAnimation(drziVar.b, R.anim.panel_appearance);
            loadAnimation.getClass();
            loadAnimation.setAnimationListener(new dsga(new ffji() { // from class: dryh
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((Animation) obj).getClass();
                    drzi.this.h.l.setVisibility(0);
                    return ffcu.a;
                }
            }, null, 6));
            return loadAnimation;
        }
    });
    private final ffbz z = ffca.a(new ffix() { // from class: drym
        @Override // defpackage.ffix
        public final Object invoke() {
            final drzi drziVar = drzi.this;
            Animation loadAnimation = AnimationUtils.loadAnimation(drziVar.b, R.anim.panel_disappearance);
            loadAnimation.getClass();
            loadAnimation.setAnimationListener(new dsga(null, new ffji() { // from class: dryo
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((Animation) obj).getClass();
                    drzi.this.h.l.setVisibility(8);
                    return ffcu.a;
                }
            }, 5));
            return loadAnimation;
        }
    });
    private final ffls A = new drzd(dryy.a, this);
    private final ffls B = new drze(dryx.a, this);

    static {
        ffko ffkoVar = new ffko(drzi.class, "startIconState", "getStartIconState()Lcom/google/android/libraries/compose/proxy/ui/search/SearchController$StartIconState;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar, new ffko(drzi.class, "endIconState", "getEndIconState()Lcom/google/android/libraries/compose/proxy/ui/search/SearchController$EndIconState;", 0), new ffko(drzi.class, "activeScreen", "getActiveScreen()Lcom/google/android/libraries/compose/ui/screen/HugoScreen;", 0)};
    }

    public drzi(Activity activity, ffsk ffskVar, ffsk ffskVar2, ffsk ffskVar3, dsma dsmaVar, final drzz drzzVar, drxq drxqVar, ffix ffixVar, drxb drxbVar, boolean z, boolean z2) {
        this.b = activity;
        this.o = ffskVar;
        this.c = ffskVar2;
        this.d = ffskVar3;
        this.e = dsmaVar;
        this.f = drxqVar;
        this.g = ffixVar;
        this.h = drxbVar;
        this.i = z;
        this.p = z2;
        this.s = ffca.a(new ffix() { // from class: dryt
            @Override // defpackage.ffix
            public final Object invoke() {
                drzi drziVar = this;
                drzb drzbVar = new drzb(drziVar);
                drzc drzcVar = new drzc(drziVar);
                drzz drzzVar2 = drzz.this;
                dtbz dtbzVar = (dtbz) drzzVar2.a.b();
                dqkk dqkkVar = (dqkk) drzzVar2.b.b();
                dqkkVar.getClass();
                return new drzy(dtbzVar, dqkkVar, drzbVar, drzcVar);
            }
        });
        l(a());
        k(u());
        this.n = new drzf(this);
    }

    static /* synthetic */ void t(drzi drziVar, CharSequence charSequence, boolean z, int i) {
        if ((i & 1) != 0) {
            charSequence = drziVar.h.g.getText();
        }
        if ((i & 2) != 0) {
            z = drziVar.h.g.hasFocus();
        }
        drziVar.p((charSequence.length() <= 0 && !z) ? dryy.a : dryy.b);
        drziVar.B.d(a[1], charSequence.length() > 0 ? dryx.b : dryx.a);
    }

    private final dryx u() {
        return (dryx) this.B.c(a[1]);
    }

    private final void v() {
        final EditText editText = this.h.g;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: dryr
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                dtan aT;
                ffji e;
                drzi drziVar = drzi.this;
                if (z) {
                    dtaa c = drziVar.c();
                    if (c != null) {
                        dtaa.bP(c);
                    }
                    ((dsxd) ((ffkl) drziVar.g).a()).c(dsxi.b);
                    drziVar.e.f(drziVar.h.g, true);
                    dtan d = drziVar.d();
                    if (d != null) {
                        Editable text = editText.getText();
                        text.getClass();
                        drziVar.r(d, text);
                    }
                } else {
                    ((dsxd) ((ffkl) drziVar.g).a()).c(dsxi.a);
                    drziVar.i();
                }
                drzi.t(drziVar, null, z, 1);
                dtaa c2 = drziVar.c();
                dtae dtaeVar = c2 instanceof dtae ? (dtae) c2 : null;
                if (dtaeVar == null || (aT = dtaeVar.aT()) == null || (e = aT.e()) == null) {
                    return;
                }
                e.invoke(Boolean.valueOf(z));
            }
        });
        editText.addTextChangedListener(this.q);
        editText.setOnEditorActionListener(this.r);
        this.m = true;
    }

    private final void w(boolean z) {
        if (this.h.h.getVisibility() == 0) {
            this.h.f.setVisibility(0);
            this.h.g.setVisibility(true != z ? 8 : 0);
            this.h.e.setVisibility((!z || u() == dryx.a) ? 8 : 0);
        } else {
            this.h.f.setVisibility(true != z ? 4 : 0);
        }
        this.h.d.setVisibility(true == z ? 0 : 8);
    }

    public final dryy a() {
        return (dryy) this.A.c(a[0]);
    }

    public final drzy b() {
        return (drzy) this.s.a();
    }

    public final dtaa c() {
        return (dtaa) this.n.c(a[2]);
    }

    public final dtan d() {
        dtaa c = c();
        if (c == null) {
            return null;
        }
        if (c instanceof dtae) {
            return ((dtae) c).aT();
        }
        throw new IllegalStateException(a.i(c, "Active screen ", " is not searchable"));
    }

    public final void e() {
        if (this.m) {
            return;
        }
        v();
        l(dryy.a);
    }

    public final void f(boolean z) {
        EditText editText = this.h.g;
        if (z) {
            editText.clearFocus();
        }
        editText.getText().clear();
    }

    public final void g() {
        this.f.b.e();
        this.h.g.getText().clear();
        this.e.e(this.h.g, true);
        dtan d = d();
        if (d != null) {
            h(d);
        }
    }

    public final void h(dtan dtanVar) {
        p(dryy.a);
        i();
        dtal d = dtanVar.d();
        if (d != null) {
            d.a();
        }
    }

    public final void i() {
        RecyclerView recyclerView = this.h.l;
        if (recyclerView.getVisibility() == 0) {
            recyclerView.startAnimation((Animation) this.z.a());
        }
    }

    public final void j(dtaa dtaaVar) {
        dtan dtanVar = null;
        if (dtaaVar != null && (dtaaVar instanceof dtae)) {
            dtanVar = ((dtae) dtaaVar).aT();
        }
        if (dtanVar == null) {
            w(false);
            if (this.p && this.m) {
                q();
                return;
            }
            return;
        }
        EditText editText = this.h.g;
        editText.setHint(editText.getResources().getString(dtanVar.a()));
        dtanVar.f();
        w(true);
        if (!this.p || this.m) {
            return;
        }
        v();
    }

    public final void k(dryx dryxVar) {
        int i;
        AppCompatImageView appCompatImageView = this.h.e;
        int ordinal = dryxVar.ordinal();
        if (ordinal == 0) {
            i = 8;
        } else {
            if (ordinal != 1) {
                throw new ffcd();
            }
            appCompatImageView.setImageDrawable((Drawable) this.y.a());
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: dryn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    drzi drziVar = drzi.this;
                    drziVar.f(false);
                    drziVar.h.g.requestFocus();
                }
            });
            i = 0;
        }
        appCompatImageView.setVisibility(i);
    }

    public final void l(dryy dryyVar) {
        AppCompatImageView appCompatImageView = this.h.d;
        int ordinal = dryyVar.ordinal();
        if (ordinal == 0) {
            appCompatImageView.setImageDrawable((Drawable) this.v.a());
            appCompatImageView.setContentDescription((String) this.t.a());
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: dryq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    drzi drziVar = drzi.this;
                    drziVar.f.b.e();
                    drziVar.h.g.requestFocus();
                }
            });
        } else {
            if (ordinal != 1) {
                throw new ffcd();
            }
            appCompatImageView.setImageDrawable(dslh.f(appCompatImageView) ? (Drawable) this.x.a() : (Drawable) this.w.a());
            appCompatImageView.setContentDescription((String) this.u.a());
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: dryp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    drzi.this.g();
                }
            });
        }
    }

    @Override // defpackage.dtad
    public final void m(String str) {
        if (this.e.d() == dsmm.a) {
            this.e.e(this.h.g, true);
        }
        o(str);
        this.f.b.e();
        i();
    }

    public final void n(dtal dtalVar, CharSequence charSequence) {
        dtalVar.c(charSequence.toString());
        p(dryy.b);
    }

    public final void o(String str) {
        EditText editText = this.h.g;
        editText.setText(str.concat(" "));
        editText.setSelection(editText.length());
    }

    public final void p(dryy dryyVar) {
        this.A.d(a[0], dryyVar);
    }

    public final void q() {
        EditText editText = this.h.g;
        editText.setOnFocusChangeListener(null);
        editText.removeTextChangedListener(this.q);
        editText.setOnEditorActionListener(null);
        this.m = false;
    }

    public final void r(dtan dtanVar, CharSequence charSequence) {
        ffud ffudVar = this.C;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.C = ffqy.d(this.o, null, null, new drzh(this, charSequence, dtanVar, null), 3);
    }
}
