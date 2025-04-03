package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.TextualCardRootView;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ebfd extends ebdm {
    public final int A;
    public TextualCardRootView B;
    public ImageView C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public Chip H;
    public Chip I;
    public ImageView J;
    public ImageView K;
    public ImageView L;
    public TextView M;
    public TextView N;
    public ViewGroup O;
    public View.OnClickListener P;
    public View.OnClickListener Q;
    public boolean R;
    public boolean S;
    public boolean T;
    private ViewGroup U;
    private ViewGroup V;
    private View W;
    private View X;
    private ViewGroup Y;
    private boolean Z;
    private final int y;
    private final int z;

    public ebfd(ViewGroup viewGroup, Context context, ebvw ebvwVar) {
        super(viewGroup, context, ebvwVar);
        this.A = ebnr.b(context, R.attr.ogIconColor);
        this.y = context.getResources().getDimensionPixelSize(R.dimen.account_menu_cards_vertical_spacing);
        this.z = context.getResources().getDimensionPixelSize(R.dimen.text_card_vertical_spacing_with_actions);
    }

    private final void G() {
        this.H.setClickable(false);
        this.H.setFocusable(false);
    }

    public static void N(TextView textView, ebee ebeeVar) {
        String str = (String) ebeeVar.a().f();
        textView.setText(ebeeVar.b());
        textView.setContentDescription(str);
    }

    private static final void O(TextualCardRootView textualCardRootView, ebei ebeiVar) {
        if (textualCardRootView != null) {
            textualCardRootView.c = ebeiVar != null ? emxc.j(ebeiVar.v) : emux.a;
        }
    }

    private static final void P(ViewGroup viewGroup, ebei ebeiVar) {
        if (viewGroup != null) {
            viewGroup.setTag(R.id.og_card_highlight_id_tag, ebeiVar != null ? (Integer) ebeiVar.u.f() : null);
        }
    }

    protected View D(ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebdm
    protected void E(lkr lkrVar) {
        this.B.ho(((ebdm) this).t);
        super.E(lkrVar);
        ebei ebeiVar = (ebei) this.x;
        ebeiVar.getClass();
        ebeiVar.i.l(lkrVar);
        ebeiVar.j.l(lkrVar);
        ebeiVar.k.l(lkrVar);
        ebeiVar.l.l(lkrVar);
        ebeiVar.m.l(lkrVar);
        ebeiVar.n.l(lkrVar);
        ebeiVar.p.l(lkrVar);
        ebeiVar.r.l(lkrVar);
        ebeiVar.q.l(lkrVar);
        ebeiVar.o.l(lkrVar);
        ebeiVar.s.l(lkrVar);
        ebeiVar.b.l(lkrVar);
        if (this.Z) {
            ebeiVar.t.l(lkrVar);
        }
        if (ebeiVar instanceof ebdy) {
            ((ebdy) ebeiVar).f();
        }
        ebeiVar.i();
    }

    @Override // defpackage.ebdm
    protected final void F(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.Y = viewGroup2;
        View inflate = LayoutInflater.from(this.s).inflate(R.layout.og_textual_card, viewGroup);
        this.B = (TextualCardRootView) inflate.findViewById(R.id.og_text_card_root);
        this.U = (ViewGroup) inflate.findViewById(R.id.og_full_text_card_root);
        this.V = (ViewGroup) inflate.findViewById(R.id.og_minimized_text_card_root);
        this.C = (ImageView) inflate.findViewById(R.id.og_text_card_icon);
        this.D = (ImageView) inflate.findViewById(R.id.og_minimized_text_card_icon);
        this.E = (TextView) inflate.findViewById(R.id.og_text_card_title);
        this.F = (TextView) inflate.findViewById(R.id.og_minimized_text_card_title);
        this.G = (TextView) inflate.findViewById(R.id.og_text_card_subtitle);
        this.H = (Chip) inflate.findViewById(R.id.og_text_card_action);
        this.W = inflate.findViewById(R.id.og_text_actions_top_margin);
        this.X = inflate.findViewById(R.id.og_text_cards_flow);
        this.I = (Chip) inflate.findViewById(R.id.og_text_card_secondary_action);
        this.J = (ImageView) inflate.findViewById(R.id.og_text_card_trail_image);
        this.K = (ImageView) inflate.findViewById(R.id.og_text_card_trail_title_image);
        this.L = (ImageView) inflate.findViewById(R.id.og_minimized_text_card_trail_title_image);
        this.M = (TextView) inflate.findViewById(R.id.og_text_card_trail_title_text);
        this.N = (TextView) inflate.findViewById(R.id.og_text_card_trail_caption_text);
        this.O = (ViewGroup) inflate.findViewById(R.id.og_text_card_custom_content);
        if (ebow.a(this.s)) {
            G();
        }
        O(this.B, (ebei) this.x);
        P(viewGroup2, (ebei) this.x);
        this.Z = D(this.O) != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebdm
    public void H(lkr lkrVar, ebei ebeiVar) {
        super.H(lkrVar, ebeiVar);
        boolean z = ebeiVar instanceof ebdy;
        this.R = z;
        P(this.Y, ebeiVar);
        O(this.B, ebeiVar);
        this.B.b(((ebdm) this).t);
        ebeiVar.i.f(lkrVar, new llh() { // from class: ebew
            @Override // defpackage.llh
            public final void a(Object obj) {
                ebfd ebfdVar = ebfd.this;
                Drawable e = ((ebff) obj).e(ebfdVar.s, ebfdVar.A);
                ebfdVar.C.setImageDrawable(e);
                if (ebfdVar.R) {
                    ebfdVar.D.setImageDrawable(e);
                }
            }
        });
        ebeiVar.j.f(lkrVar, new llh() { // from class: ebfa
            @Override // defpackage.llh
            public final void a(Object obj) {
                ebfd ebfdVar = ebfd.this;
                ebee ebeeVar = (ebee) obj;
                ebfd.N(ebfdVar.E, ebeeVar);
                if (ebfdVar.R) {
                    ebfd.N(ebfdVar.F, ebeeVar);
                }
            }
        });
        ebeiVar.k.f(lkrVar, new llh() { // from class: ebfb
            @Override // defpackage.llh
            public final void a(Object obj) {
                ebfd ebfdVar = ebfd.this;
                emxc emxcVar = (emxc) obj;
                ebfdVar.G.setVisibility(true != emxcVar.g() ? 8 : 0);
                if (emxcVar.g()) {
                    ebfdVar.G.setText((CharSequence) emxcVar.c());
                }
            }
        });
        ebeiVar.l.f(lkrVar, new llh() { // from class: ebfc
            @Override // defpackage.llh
            public final void a(Object obj) {
                ebfd ebfdVar = ebfd.this;
                engw engwVar = (engw) obj;
                ebfdVar.H.setVisibility(true != engwVar.isEmpty() ? 0 : 8);
                ebfdVar.B.a.a(engwVar);
                ebfdVar.K();
            }
        });
        ebeiVar.m.f(lkrVar, new llh() { // from class: ebeo
            @Override // defpackage.llh
            public final void a(Object obj) {
                ebfd ebfdVar = ebfd.this;
                ebfdVar.H.setTextColor(ebfdVar.I((emxc) obj));
            }
        });
        ebeiVar.n.f(lkrVar, new llh() { // from class: ebep
            @Override // defpackage.llh
            public final void a(Object obj) {
                View.OnClickListener onClickListener = (View.OnClickListener) ((emxc) obj).f();
                ebfd ebfdVar = ebfd.this;
                ebfdVar.Q = onClickListener;
                ebfdVar.J(ebfdVar.Q, ebfdVar.P);
            }
        });
        ebeiVar.p.f(lkrVar, new llh() { // from class: ebeq
            @Override // defpackage.llh
            public final void a(Object obj) {
                engw engwVar = (engw) obj;
                boolean z2 = !engwVar.isEmpty();
                ebfd ebfdVar = ebfd.this;
                ebfdVar.T = z2;
                ebfdVar.B.b.a(engwVar);
                ebfdVar.M(ebfdVar.S);
            }
        });
        ebeiVar.r.f(lkrVar, new llh() { // from class: eber
            @Override // defpackage.llh
            public final void a(Object obj) {
                ebfd ebfdVar = ebfd.this;
                ebfdVar.I.setTextColor(ebfdVar.I((emxc) obj));
            }
        });
        ebeiVar.q.f(lkrVar, new llh() { // from class: ebes
            @Override // defpackage.llh
            public final void a(Object obj) {
                final emxc emxcVar = (emxc) obj;
                boolean g = emxcVar.g();
                final ebfd ebfdVar = ebfd.this;
                ebfdVar.S = g;
                if (g) {
                    ebfdVar.I.setOnClickListener(new View.OnClickListener() { // from class: ebev
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dvxf dvxfVar = new dvxf(5);
                            ebfd ebfdVar2 = ebfd.this;
                            ((ebdm) ebfdVar2).t.f(dvxfVar, ebfdVar2.I);
                            ((View.OnClickListener) emxcVar.c()).onClick(view);
                        }
                    });
                } else {
                    ebfdVar.I.setOnClickListener(null);
                }
                ebfdVar.M(ebfdVar.S);
            }
        });
        ebeiVar.o.f(lkrVar, new llh() { // from class: ebet
            @Override // defpackage.llh
            public final void a(Object obj) {
                emxc emxcVar = (emxc) obj;
                boolean g = emxcVar.g();
                ebfd ebfdVar = ebfd.this;
                if (!g) {
                    ebfdVar.J.setVisibility(8);
                } else {
                    ebfdVar.J.setImageDrawable((Drawable) emxcVar.c());
                    ebfdVar.J.setVisibility(0);
                }
            }
        });
        ebeiVar.s.f(lkrVar, new llh() { // from class: ebex
            @Override // defpackage.llh
            public final void a(Object obj) {
                ebfd ebfdVar = ebfd.this;
                emxc emxcVar = (emxc) obj;
                ebfdVar.M.setVisibility(8);
                ebfdVar.N.setVisibility(8);
                TextView textView = ((Boolean) emxcVar.b(new emwl() { // from class: ebeu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(((ebem) obj2).c());
                    }
                }).e(false)).booleanValue() ? ebfdVar.N : ebfdVar.M;
                if (!emxcVar.g()) {
                    textView.setVisibility(8);
                    ebfdVar.K.setVisibility(8);
                    ebfdVar.L.setVisibility(8);
                    return;
                }
                ebem ebemVar = (ebem) emxcVar.c();
                ebee ebeeVar = (ebee) ebemVar.b().f();
                if (ebeeVar != null) {
                    textView.setText(ebeeVar.b());
                    textView.setContentDescription((CharSequence) ebeeVar.a().f());
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                ebfdVar.L(ebfdVar.K, ebemVar.a(), ebfdVar.A);
                if (ebfdVar.R) {
                    ebfdVar.L(ebfdVar.L, ebemVar.a(), ebfdVar.A);
                }
            }
        });
        if (this.Z) {
            ebeiVar.t.f(lkrVar, new llh() { // from class: ebey
                @Override // defpackage.llh
                public final void a(Object obj) {
                    ebfd.this.O.setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
                }
            });
        }
        ebeiVar.b.f(lkrVar, new llh() { // from class: ebez
            @Override // defpackage.llh
            public final void a(Object obj) {
                View.OnClickListener onClickListener = (View.OnClickListener) ((emxc) obj).f();
                ebfd ebfdVar = ebfd.this;
                ebfdVar.P = onClickListener;
                ebfdVar.J(ebfdVar.Q, ebfdVar.P);
            }
        });
        if (z) {
            ((ebdy) ebeiVar).e();
        } else {
            this.U.setVisibility(0);
            this.V.setVisibility(8);
            this.F.setVisibility(8);
        }
        ebeiVar.h();
    }

    public final ColorStateList I(emxc emxcVar) {
        return emxcVar.g() ? (ColorStateList) emxcVar.c() : koa.d(this.s, R.color.og_chip_assistive_text_color);
    }

    public final void J(final View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (onClickListener == null) {
            onClickListener = null;
            if (onClickListener2 != null && !ebow.a(this.s)) {
                onClickListener = onClickListener2;
            }
        }
        if (onClickListener != null) {
            this.H.setOnClickListener(new View.OnClickListener() { // from class: eben
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dvxf dvxfVar = new dvxf(5);
                    ebfd ebfdVar = ebfd.this;
                    ((ebdm) ebfdVar).t.f(dvxfVar, ebfdVar.H);
                    onClickListener.onClick(view);
                }
            });
        } else {
            G();
        }
    }

    public final void K() {
        int i = 0;
        if (this.H.getVisibility() == 8 && this.I.getVisibility() == 8) {
            i = 8;
        }
        this.X.setVisibility(i);
        this.W.setVisibility(i);
        ViewGroup viewGroup = this.U;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), this.U.getPaddingTop(), this.U.getPaddingRight(), i == 0 ? this.z : this.y);
    }

    public final void L(ImageView imageView, emxc emxcVar, int i) {
        imageView.setVisibility(true != emxcVar.g() ? 8 : 0);
        if (emxcVar.g()) {
            imageView.setImageDrawable(((ebff) emxcVar.c()).e(this.s, i));
            imageView.setContentDescription((CharSequence) ((ebcw) emxcVar.c()).c.f());
        }
    }

    public final void M(boolean z) {
        if (this.T && z) {
            this.I.setVisibility(0);
        } else {
            this.I.setVisibility(8);
        }
        K();
    }
}
