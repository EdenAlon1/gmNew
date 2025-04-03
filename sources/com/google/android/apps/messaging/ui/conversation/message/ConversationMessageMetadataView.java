package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageMetadataView;
import defpackage.cfva;
import defpackage.cfvl;
import defpackage.csjy;
import defpackage.csmj;
import defpackage.cynb;
import defpackage.czkt;
import defpackage.fazb;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationMessageMetadataView extends czkt {
    public static final cfva a = cfvl.q(155151230);
    public csmj b;
    public fazb c;
    public ffbr d;
    public final MessageMetadataDetailsView e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;
    public TextView j;
    public boolean k;
    public cynb l;
    private int m;

    public ConversationMessageMetadataView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(View view, String str, StringBuilder sb) {
        if (view.getVisibility() == 0) {
            CharSequence contentDescription = view.getContentDescription();
            if (TextUtils.isEmpty(contentDescription)) {
                return;
            }
            sb.append(str);
            sb.append(contentDescription);
        }
    }

    public static void b(View view, int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    public final void c() {
        if (((Optional) this.c.b()).isEmpty()) {
            return;
        }
        ((Optional) this.d.b()).ifPresent(new Consumer() { // from class: czhx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cyne) obj).a(ConversationMessageMetadataView.this.g, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.d.b()).ifPresent(new Consumer() { // from class: czhy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cyne) obj).a(ConversationMessageMetadataView.this.f, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.d.b()).ifPresent(new Consumer() { // from class: czhz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cyne) obj).a(ConversationMessageMetadataView.this.j, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void d(boolean z, boolean z2) {
        this.k = z;
        this.e.clearAnimation();
        clearAnimation();
        if (this.m == 0) {
            return;
        }
        int measuredHeight = z ? this.e.getMeasuredHeight() : 0;
        csjy.j("Bugle", "Update metadata height to %d", Integer.valueOf(measuredHeight));
        if (z2) {
            this.b.j(this, measuredHeight, csmj.a(getContext()));
        } else {
            getLayoutParams().height = measuredHeight;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0078 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0303  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.bcse r18, defpackage.czic r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageMetadataView.e(bcse, czic, boolean):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = new cynb() { // from class: czhv
            @Override // defpackage.cynb
            public final void gl() {
                ConversationMessageMetadataView.this.c();
            }
        };
        ((Optional) this.c.b()).ifPresent(new Consumer() { // from class: czhw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cync) obj).h(ConversationMessageMetadataView.this.l);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ((Optional) this.c.b()).ifPresent(new Consumer() { // from class: czhu
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cync) obj).k(ConversationMessageMetadataView.this.l);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.m != size && size > 0) {
            this.m = size;
            this.e.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            d(this.k, false);
        }
        super.onMeasure(i, i2);
    }

    public ConversationMessageMetadataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = 0;
        this.k = true;
        MessageMetadataDetailsView messageMetadataDetailsView = (MessageMetadataDetailsView) View.inflate(context, R.layout.conversation_message_meta_view, this).findViewById(R.id.message_details);
        this.e = messageMetadataDetailsView;
        this.f = (TextView) messageMetadataDetailsView.findViewById(R.id.sim_name);
        this.g = (TextView) messageMetadataDetailsView.findViewById(R.id.message_status);
        this.h = (ImageView) messageMetadataDetailsView.findViewById(R.id.message_lock_icon);
        this.i = (TextView) messageMetadataDetailsView.findViewById(R.id.link_settings);
    }
}
