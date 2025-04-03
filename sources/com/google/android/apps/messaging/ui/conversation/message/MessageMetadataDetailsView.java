package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.MessageMetadataDetailsView;
import defpackage.bcse;
import defpackage.bzyb;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.csjk;
import defpackage.csrh;
import defpackage.cuxh;
import defpackage.cuye;
import defpackage.czkx;
import defpackage.czll;
import defpackage.czlm;
import defpackage.czlp;
import defpackage.ddxs;
import defpackage.deao;
import defpackage.emyl;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessageMetadataDetailsView extends czkx {
    static final cfup a = cfvl.r(159443725, "add_status_for_missing_attachments");
    static final emyl b = cfvl.w("remove_text_via_from_sim_name");
    public static final /* synthetic */ int t = 0;
    public cuxh c;
    public deao d;
    public csjk e;
    public csrh f;
    public cuye g;
    public ffbr h;
    public ddxs i;
    public ffbr j;
    public final TextView k;
    public boolean l;
    public final TextView m;
    public final ImageView n;
    public final TextView o;
    public boolean p;
    public bcse q;
    public final czlp r;
    public bzyb s;
    private final czlm u;

    @Deprecated
    private final ImageView v;
    private final ImageView w;

    public MessageMetadataDetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean c() {
        return ((Boolean) cuye.b.e()).booleanValue() && this.q.A().b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean d = this.c.d();
        boolean z2 = this.p;
        int paddingLeft = getPaddingLeft();
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sim_label_padding_end);
        czlm czlmVar = this.u;
        czlmVar.c = d;
        czlmVar.d = z2;
        czlmVar.e = i3 - i;
        czlmVar.j = paddingLeft;
        czlmVar.l = paddingBottom;
        czlmVar.k = paddingTop;
        czlmVar.f = paddingLeft;
        czlmVar.g = paddingTop;
        czlmVar.h = 0;
        czlmVar.i = 0;
        czlmVar.m = dimensionPixelSize;
        if (d) {
            czlmVar.c();
            if (czlmVar.i == 0) {
                czlmVar.i = czlmVar.a.getBaseline();
            }
            czlmVar.b();
            czlmVar.d();
            czlmVar.a();
            czlmVar.e();
        } else {
            czlmVar.e();
            czlmVar.a();
            czlmVar.d();
            czlmVar.b();
            czlmVar.c();
        }
        if (czlmVar.b.getVisibility() != 8) {
            int measuredWidth = czlmVar.b.getMeasuredWidth();
            int measuredHeight = czlmVar.b.getMeasuredHeight();
            if (czlmVar.c) {
                czlmVar.h = Math.max(czlmVar.h, czlmVar.a.getMeasuredHeight());
            }
            int i5 = czlmVar.j;
            czlmVar.f = i5;
            int i6 = czlmVar.g + czlmVar.h;
            czlmVar.g = i6;
            czlmVar.b.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
        this.p = czlmVar.d;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int i10 = 0;
        int makeMeasureSpec = View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom(), Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        if (this.v.getVisibility() != 8) {
            this.v.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
            i3 = this.v.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        if (this.w.getVisibility() != 8) {
            this.w.measure(View.MeasureSpec.makeMeasureSpec(size - i3, Integer.MIN_VALUE), makeMeasureSpec);
            i4 = this.w.getMeasuredWidth();
        } else {
            i4 = 0;
        }
        if (this.n.getVisibility() != 8) {
            this.n.measure(View.MeasureSpec.makeMeasureSpec((size - i3) - i4, Integer.MIN_VALUE), makeMeasureSpec);
            i5 = this.n.getMeasuredWidth();
        } else {
            i5 = 0;
        }
        if (this.m.getVisibility() != 8) {
            i6 = czll.a(this.m, View.MeasureSpec.makeMeasureSpec(((size - i3) - i4) - i5, Integer.MIN_VALUE), makeMeasureSpec);
            i7 = this.m.getMeasuredWidth();
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (this.k.getVisibility() != 8) {
            i8 = czll.a(this.k, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
            i10 = this.k.getMeasuredWidth();
        } else {
            i8 = 0;
        }
        int i11 = i7 + i3;
        int i12 = i11 + i10 + i5 + i4;
        if (i12 > size || this.p) {
            i12 = Math.max(i11 + i5 + i4, i10);
            i9 = i6 + i8;
            this.k.setText(this.k.getText().toString().replaceFirst(getResources().getString(R.string.message_metadata_separator), ""));
            this.p = true;
        } else {
            i9 = Math.max(Math.max(Math.max(i6, i8), this.v.getMeasuredHeight()), this.v.getMeasuredHeight());
        }
        if (this.o.getVisibility() != 8) {
            int a2 = czll.a(this.o, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
            i12 = Math.max(i12, this.o.getMeasuredWidth());
            i9 = Math.max(i9, a2 + i9);
        }
        setMeasuredDimension(i12, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            return true;
        }
        return motionEvent.getAction() == 1 ? performClick() : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!c()) {
            return super.performClick();
        }
        this.i.d(getContext(), this.q);
        return true;
    }

    public MessageMetadataDetailsView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = false;
        this.p = false;
        MessageMetadataDetailsView messageMetadataDetailsView = (MessageMetadataDetailsView) View.inflate(context, R.layout.conversation_message_meta_detail_view, this);
        TextView textView = (TextView) messageMetadataDetailsView.findViewById(R.id.sim_name);
        this.k = textView;
        ImageView imageView = (ImageView) messageMetadataDetailsView.findViewById(R.id.dots_animation);
        this.v = imageView;
        TextView textView2 = (TextView) messageMetadataDetailsView.findViewById(R.id.message_status);
        this.m = textView2;
        ImageView imageView2 = (ImageView) messageMetadataDetailsView.findViewById(R.id.message_lock_icon);
        this.n = imageView2;
        TextView textView3 = (TextView) messageMetadataDetailsView.findViewById(R.id.link_settings);
        this.o = textView3;
        ImageView imageView3 = (ImageView) messageMetadataDetailsView.findViewById(R.id.status_icon);
        this.w = imageView3;
        this.r = new czlp(imageView3);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: czlh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffbr ffbrVar = MessageMetadataDetailsView.this.j;
                ffbrVar.getClass();
                akvg akvgVar = (akvg) ffbrVar.b();
                Context context2 = context;
                eldl.p(context2, akvgVar.o(context2));
            }
        });
        this.u = new czlm(textView, imageView, textView2, imageView2, textView3, imageView3);
    }
}
