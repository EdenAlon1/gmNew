package defpackage;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.DynamicCardRootView;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ebdm extends wr {
    public final Context s;
    public final ebvw t;
    public final DynamicCardRootView u;
    public final View v;
    public final ViewGroup w;
    public ebdf x;

    public ebdm(ViewGroup viewGroup, Context context, ebvw ebvwVar) {
        super(LayoutInflater.from(context).inflate(R.layout.og_dynamic_card, viewGroup, false));
        this.s = context;
        this.t = ebvwVar;
        DynamicCardRootView dynamicCardRootView = (DynamicCardRootView) this.a.findViewById(R.id.og_card);
        this.u = dynamicCardRootView;
        dynamicCardRootView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        ViewGroup viewGroup2 = (ViewGroup) dynamicCardRootView.findViewById(R.id.og_card_content_root);
        this.w = viewGroup2;
        View findViewById = dynamicCardRootView.findViewById(R.id.og_loading_card_view);
        this.v = findViewById;
        G(dynamicCardRootView, this.x);
        F(viewGroup2, dynamicCardRootView);
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_icon_placeholder)).setImageDrawable(D(new OvalShape()));
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_title_placeholder)).setImageDrawable(D(new RoundRectShape(null, null, null)));
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_progress_placeholder)).setImageDrawable(D(new RoundRectShape(null, null, null)));
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_progress_desc_placeholder)).setImageDrawable(D(new RoundRectShape(null, null, null)));
        findViewById.setContentDescription(findViewById.getResources().getString(R.string.og_card_loading_label_a11y));
    }

    private final PaintDrawable D(Shape shape) {
        Integer num = (Integer) ((ebns) eboq.e(this.s)).b.get(ebop.COLOR_HAIRLINE);
        num.getClass();
        PaintDrawable paintDrawable = new PaintDrawable(num.intValue());
        paintDrawable.setShape(shape);
        paintDrawable.setIntrinsicWidth(-1);
        paintDrawable.setIntrinsicHeight(-1);
        return paintDrawable;
    }

    private static final void G(DynamicCardRootView dynamicCardRootView, ebdf ebdfVar) {
        if (dynamicCardRootView != null) {
            dynamicCardRootView.i = ebdfVar != null ? emxc.j(Integer.valueOf(ebdfVar.f)) : emux.a;
        }
    }

    /* renamed from: C */
    protected void H(final lkr lkrVar, final ebdf ebdfVar) {
        this.x = ebdfVar;
        G(this.u, ebdfVar);
        this.u.b(this.t);
        ebdfVar.a(lkrVar);
        ebdfVar.b.f(lkrVar, new llh() { // from class: ebdi
            @Override // defpackage.llh
            public final void a(Object obj) {
                final emxc emxcVar = (emxc) obj;
                final ebdm ebdmVar = ebdm.this;
                ebdmVar.u.setOnClickListener(new View.OnClickListener() { // from class: ebdg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dvxf dvxfVar = new dvxf(5);
                        ebdm ebdmVar2 = ebdm.this;
                        ebdmVar2.t.f(dvxfVar, ebdmVar2.u);
                        emxc emxcVar2 = emxcVar;
                        if (emxcVar2.g()) {
                            ((View.OnClickListener) emxcVar2.c()).onClick(view);
                        }
                    }
                });
            }
        });
        ebdfVar.c.f(lkrVar, new llh() { // from class: ebdj
            @Override // defpackage.llh
            public final void a(Object obj) {
                ebdm.this.u.setContentDescription((CharSequence) ((emxc) obj).f());
            }
        });
        ebdfVar.d.f(lkrVar, new llh() { // from class: ebdk
            @Override // defpackage.llh
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                int i = true != bool.booleanValue() ? 8 : 0;
                ebdm ebdmVar = ebdm.this;
                ebdmVar.v.setVisibility(i);
                ebdmVar.w.setVisibility(true != bool.booleanValue() ? 0 : 8);
            }
        });
        this.u.post(new Runnable() { // from class: ebdl
            @Override // java.lang.Runnable
            public final void run() {
                final ebdm ebdmVar = ebdm.this;
                ebdfVar.e.f(lkrVar, new llh() { // from class: ebdh
                    @Override // defpackage.llh
                    public final void a(Object obj) {
                        ebvw ebvwVar;
                        ebdm ebdmVar2 = ebdm.this;
                        DynamicCardRootView dynamicCardRootView = ebdmVar2.u;
                        emxc emxcVar = (emxc) obj;
                        if (dynamicCardRootView.k && dynamicCardRootView.i.g() && !dynamicCardRootView.j.equals(emxcVar)) {
                            dynamicCardRootView.j = emxcVar;
                            engw f = dynamicCardRootView.f();
                            int i = ((enou) f).c;
                            int i2 = 0;
                            while (true) {
                                ebvwVar = ebdmVar2.t;
                                if (i2 >= i) {
                                    break;
                                }
                                ((ebwc) f.get(i2)).ho(ebvwVar);
                                i2++;
                            }
                            dynamicCardRootView.ho(ebvwVar);
                            if (emxcVar.g()) {
                                ebvwVar.d(dynamicCardRootView, ((Integer) dynamicCardRootView.i.c()).intValue(), (dvxb) emxcVar.c());
                            } else {
                                dynamicCardRootView.b(ebvwVar);
                            }
                            engw f2 = dynamicCardRootView.f();
                            int i3 = ((enou) f2).c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((ebwc) f2.get(i4)).b(ebvwVar);
                            }
                            dynamicCardRootView.k = true;
                        }
                    }
                });
            }
        });
    }

    protected void E(lkr lkrVar) {
        this.u.ho(this.t);
        ebdf ebdfVar = this.x;
        ebdfVar.getClass();
        ebdfVar.d();
        this.x.b.l(lkrVar);
        this.x.c.l(lkrVar);
        this.x.d.l(lkrVar);
        this.x.e.l(lkrVar);
    }

    protected abstract void F(ViewGroup viewGroup, ViewGroup viewGroup2);
}
