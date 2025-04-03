package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import defpackage.aolr;
import defpackage.aopp;
import defpackage.aoqm;
import defpackage.asvj;
import defpackage.axul;
import defpackage.bcpr;
import defpackage.bcpv;
import defpackage.bcse;
import defpackage.bcyc;
import defpackage.bcyd;
import defpackage.bcye;
import defpackage.bcyv;
import defpackage.bcyw;
import defpackage.cbac;
import defpackage.cbbu;
import defpackage.cfva;
import defpackage.crja;
import defpackage.crjb;
import defpackage.crji;
import defpackage.csix;
import defpackage.cuxh;
import defpackage.cxnx;
import defpackage.cxoa;
import defpackage.cxoh;
import defpackage.cxoi;
import defpackage.cxpp;
import defpackage.cxpq;
import defpackage.cxqh;
import defpackage.ffbr;
import defpackage.koa;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VCardAttachmentView extends cxnx implements View.OnLayoutChangeListener, bcyv, crja {
    public axul a;
    public bcye b;
    public cuxh c;
    public cxqh d;
    public ffbr e;
    int f;
    public final bcpv g;
    public crjb h;
    private final crjb i;
    private final boolean j;
    private final int k;
    private final int l;
    private final int m;
    private TextView n;
    private TextView o;
    private ContactIconView p;
    private ImageView q;
    private cxoi r;
    private View s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;

    public VCardAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new cxoh(this);
        this.g = new bcpv();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cxoa.b);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        this.j = z;
        ColorStateList d = koa.d(context, R.color.message_image_selected_tint_selector);
        d.getClass();
        this.k = d.getDefaultColor();
        this.l = context.getColor(R.color.attachment_vcard_preview_name_text_m2);
        this.m = context.getColor(R.color.attachment_vcard_preview_details_text_m2);
        LayoutInflater.from(getContext()).inflate(true != z ? R.layout.vcard_attachment_view_m2 : R.layout.vcard_conversation_attachment_view_m2_consistent, (ViewGroup) this, true);
        obtainStyledAttributes.recycle();
    }

    private final String o() {
        int measuredWidth = this.n.getMeasuredWidth();
        String m = ((bcyw) this.g.a()).m();
        if (measuredWidth == 0 || TextUtils.isEmpty(m) || !m.contains(",")) {
            return cuxh.b(m);
        }
        cuxh cuxhVar = this.c;
        TextPaint paint = this.n.getPaint();
        getContext().getString(R.string.plus_n);
        return cuxhVar.e(m, paint, measuredWidth, R.plurals.plus_n_plural);
    }

    private final void p() {
        String o = o();
        if (TextUtils.isEmpty(o)) {
            this.n.setVisibility(8);
        } else {
            this.n.setVisibility(0);
            this.n.setText(o);
        }
    }

    @Override // defpackage.bcyv
    public final void a(bcyw bcywVar) {
        this.g.e(bcywVar);
        n();
    }

    @Override // defpackage.bcyv
    public final void b(bcyw bcywVar) {
        this.g.e(bcywVar);
        n();
    }

    @Override // defpackage.crii
    public final void c() {
        if (this.g.g()) {
            this.g.f();
        }
        this.p.i(null);
    }

    @Override // defpackage.crid
    public final void d(boolean z, bcse bcseVar, Drawable drawable, float[] fArr) {
        boolean az = bcseVar.az();
        int f = bcseVar.f();
        int c = bcseVar.c();
        boolean z2 = true;
        if (this.v == az && this.w == z && this.x == f && this.f == c) {
            z2 = false;
        }
        this.v = az;
        this.w = z;
        setSelected(z);
        this.x = f;
        this.f = c;
        if (z2) {
            if (!this.j) {
                boolean z3 = this.v;
                cxpq cxpqVar = new cxpq();
                cxpqVar.b(z3);
                cxpqVar.f(this.x);
                cxpqVar.d(false);
                cxpqVar.c(isSelected());
                cxpqVar.e(this.f);
                cxpp cxppVar = (cxpp) this.d.q(getContext(), cxpqVar.a());
                m(cxppVar.a);
                k(cxppVar.a);
            } else if (isSelected()) {
                m(cxqh.f(getContext()));
                k(cxqh.g(getContext()));
            } else {
                m(this.l);
                k(this.m);
            }
            if (this.j) {
                if (isSelected()) {
                    this.p.setColorFilter(this.k);
                } else {
                    this.p.clearColorFilter();
                }
            }
        }
        boolean isSelected = isSelected();
        if (!this.j) {
            ((ViewGroup) getParent()).setBackground(drawable);
            return;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) ((ViewGroup) getParent()).getBackground().mutate();
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setColor(cxqh.c(getContext(), isSelected));
    }

    @Override // defpackage.crja
    public final void e(boolean z) {
        this.t = z;
        this.s.setVisibility(true != z ? 0 : 8);
    }

    @Override // defpackage.crja
    public final void f(boolean z) {
        this.u = z;
        boolean z2 = this.j;
        TextView textView = this.o;
        int i = 0;
        if (z2 && z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    @Override // defpackage.crii
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, String str, int i) {
        this.f = -1;
        bcye bcyeVar = this.b;
        Context context = (Context) bcyeVar.a.b();
        context.getClass();
        bcyc bcycVar = (bcyc) bcyeVar.b.b();
        bcycVar.getClass();
        crji crjiVar = (crji) bcyeVar.c.b();
        crjiVar.getClass();
        cbbu cbbuVar = (cbbu) bcyeVar.d.b();
        cbbuVar.getClass();
        cbac cbacVar = (cbac) bcyeVar.e.b();
        cbacVar.getClass();
        messagePartCoreData.getClass();
        j(new bcyd(context, bcycVar, crjiVar, cbbuVar, cbacVar, messagePartCoreData));
    }

    public final void j(bcyw bcywVar) {
        if (this.g.g()) {
            if (((bcyw) this.g.a()).equals(bcywVar)) {
                return;
            } else {
                this.g.f();
            }
        }
        if (bcywVar != null) {
            this.g.c(bcywVar);
            ((bcyw) this.g.a()).c = this;
            this.n.setContentDescription(o());
        }
        n();
    }

    public final void k(int i) {
        this.o.setTextColor(i);
    }

    public final void l(crjb crjbVar) {
        this.h = crjbVar;
        if (crjbVar == null) {
            return;
        }
        setOnClickListener(new View.OnClickListener() { // from class: cxoe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VCardAttachmentView vCardAttachmentView = VCardAttachmentView.this;
                if (vCardAttachmentView.h == null || !vCardAttachmentView.g.g()) {
                    return;
                }
                vCardAttachmentView.h.c((bcyw) vCardAttachmentView.g.a());
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: cxof
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                VCardAttachmentView vCardAttachmentView = VCardAttachmentView.this;
                if (vCardAttachmentView.h == null || !vCardAttachmentView.g.g()) {
                    return false;
                }
                crjb crjbVar2 = vCardAttachmentView.h;
                crjbVar2.d();
                return false;
            }
        });
    }

    public final void m(int i) {
        this.n.setTextColor(i);
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [aoku, java.lang.Object] */
    protected final void n() {
        String str = null;
        if (!this.g.g()) {
            this.n.setText("");
            this.o.setText("");
            this.p.i(null);
            if (this.q != null) {
                cxoi cxoiVar = this.r;
                csix.g();
                boolean z = cxoiVar.a;
                this.q.setVisibility(4);
            }
            return;
        }
        p();
        String l = ((bcyw) this.g.a()).l();
        if (TextUtils.isEmpty(l) || (this.j && this.u)) {
            this.o.setVisibility(8);
        } else {
            this.o.setVisibility(0);
            cfva cfvaVar = aoqm.a;
            boolean a = asvj.a();
            String aokrVar = ((aolr) this.e.b()).i(((aolr) this.e.b()).n(l), !a).H(a).toString();
            this.o.setText(cuxh.b(aokrVar));
            if (this.t) {
                setContentDescription(aokrVar);
            } else {
                this.o.setContentDescription(aokrVar);
            }
        }
        ContactIconView contactIconView = this.p;
        Uri d = ((bcyw) this.g.a()).d();
        long a2 = ((bcyw) this.g.a()).a();
        String n = ((bcyw) this.g.a()).n();
        long b = ((bcyw) this.g.a()).b();
        if (((bcyw) this.g.a()).e().isPresent()) {
            ?? r0 = ((bcyw) this.g.a()).e().get();
            cfva cfvaVar2 = aoqm.a;
            str = r0.p(((Boolean) new aopp().get()).booleanValue());
        }
        contactIconView.l(d, a2, n, b, str);
        contactIconView.setClickable(false);
        ((bcyw) this.g.a()).k().isPresent();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bcpv bcpvVar = this.g;
        bcpr bcprVar = bcpvVar.a;
        if (bcprVar != null) {
            csix.f(bcpvVar.g());
            bcpvVar.c(bcprVar);
            bcpvVar.a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.g.g()) {
            bcpv bcpvVar = this.g;
            csix.i(bcpvVar.a);
            csix.k(bcpvVar.g());
            bcpvVar.a = bcpvVar.a();
            bcpvVar.f();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.n = (TextView) findViewById(R.id.name);
        this.o = (TextView) findViewById(R.id.details);
        this.p = (ContactIconView) findViewById(R.id.contact_icon);
        this.s = findViewById(R.id.details_container);
        this.n.addOnLayoutChangeListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.add_a_photo);
        this.q = imageView;
        if (imageView != null) {
            imageView.setVisibility(4);
            this.q.setOnClickListener(new View.OnClickListener() { // from class: cxog
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VCardAttachmentView vCardAttachmentView = VCardAttachmentView.this;
                    Uri uri = null;
                    if (vCardAttachmentView.g.g()) {
                        bcyw bcywVar = (bcyw) vCardAttachmentView.g.a();
                        csix.l(bcywVar);
                        String n = bcywVar.n();
                        if (n != null) {
                            uri = ContactsContract.Contacts.getLookupUri(bcywVar.a(), n);
                        }
                    }
                    if (uri != null) {
                        vCardAttachmentView.a.e(vCardAttachmentView.getContext(), uri, 2);
                    }
                }
            });
            this.r = new cxoi(this.q);
        }
        l(this.i);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.g.g() && view == this.n) {
            p();
        }
    }
}
