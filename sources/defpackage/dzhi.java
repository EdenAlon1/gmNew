package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzhi extends LinearLayout implements eabx {
    private final TextView a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final ImageView e;
    private final float[] f;
    private final float[] g;
    private final int h;
    private final int i;
    private int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;

    public dzhi(Context context) {
        super(dzyd.a(context, fdql.i()), null, R.attr.linkPreviewBubbleCellTextContentStyle);
        this.f = new float[]{getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius), 0.0f, 0.0f, 0.0f, 0.0f};
        this.g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius), getResources().getDimension(R.dimen.bubble_cell_radius)};
        inflate(getContext(), R.layout.linkpreview_message_content_layout, this);
        this.a = (TextView) findViewById(R.id.linkpreview_message_text);
        this.b = (TextView) findViewById(R.id.linkpreview_title);
        this.c = (TextView) findViewById(R.id.linkpreview_description);
        this.d = (TextView) findViewById(R.id.linkpreview_domain);
        this.e = (ImageView) findViewById(R.id.linkpreview_image);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, dzhg.a, R.attr.linkPreviewBubbleCellTextContentStyle, R.style.LighterLinkPreviewBubbleCellTextMessage);
        setPadding(0, 0, 0, 0);
        this.h = obtainStyledAttributes.getColor(5, ehdr.b(this, R.attr.colorOnSurfaceInverse));
        this.i = obtainStyledAttributes.getColor(7, ehdr.b(this, R.attr.colorPrimary));
        this.k = obtainStyledAttributes.getColor(1, ehdr.b(this, R.attr.colorSurface));
        this.l = obtainStyledAttributes.getResourceId(6, R.style.IncomingLinkPreviewBubbleCellTextMessage);
        this.m = obtainStyledAttributes.getResourceId(8, R.style.OutgoingLinkPreviewBubbleCellTextMessage);
        this.n = obtainStyledAttributes.getResourceId(4, R.style.LinkPreviewDescriptionTitleTextMessage);
        this.o = obtainStyledAttributes.getResourceId(2, R.style.LinkPreviewDescriptionContentTextMessage);
        this.p = obtainStyledAttributes.getResourceId(3, R.style.LinkPreviewDescriptionDomainTextMessage);
        obtainStyledAttributes.recycle();
        int[] iArr = kvo.a;
        setImportantForAccessibility(4);
    }

    @Override // defpackage.eabx
    public final void b(dzqs dzqsVar) {
        emxc a = dzgl.a(dzqsVar);
        if (a.g()) {
            this.a.setText(((dzgz) a.c()).a);
            this.a.setAutoLinkMask(15);
            this.b.setText(((dzgz) a.c()).b);
            this.c.setText(((dzgz) a.c()).c);
            this.d.setText(((dzgz) a.c()).e);
            emxc emxcVar = ((dzgz) a.c()).g;
            if (emxcVar.g()) {
                this.e.setImageBitmap((Bitmap) emxcVar.c());
                this.e.setVisibility(0);
                this.b.setVisibility(0);
                this.c.setVisibility(0);
                this.d.setVisibility(0);
            } else {
                this.e.setVisibility(8);
                this.b.setVisibility(0);
                this.c.setVisibility(0);
                this.d.setVisibility(0);
            }
            if (dzqsVar.s() == 1) {
                this.a.setTextAppearance(this.l);
                this.j = this.h;
            } else {
                this.a.setTextAppearance(this.m);
                this.j = this.i;
            }
            this.b.setTextAppearance(this.n);
            this.c.setTextAppearance(this.o);
            this.d.setTextAppearance(this.p);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(this.j);
            gradientDrawable.setCornerRadii(this.f);
            this.a.setPadding(dzyk.a(getContext(), 16.0f), dzyk.a(getContext(), 11.0f), dzyk.a(getContext(), 16.0f), dzyk.a(getContext(), 9.0f));
            this.a.setWidth(dzyk.a(getContext(), 2.13116698E9f));
            this.a.setBackground(gradientDrawable);
            this.b.setBackgroundColor(this.k);
            this.c.setBackgroundColor(this.k);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setColor(this.k);
            gradientDrawable2.setCornerRadii(this.g);
            this.d.setBackground(gradientDrawable2);
            this.e.setBackgroundColor(this.k);
            setOnClickListener(new dzhh(this, a));
        }
    }

    @Override // defpackage.dzys
    public final void c() {
        this.e.setImageDrawable(null);
    }

    @Override // defpackage.eabx
    public final void d(float f, float f2, float f3, float f4) {
    }
}
