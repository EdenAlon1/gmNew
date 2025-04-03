package com.google.android.apps.messaging.ui.conversation.message;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView;
import defpackage.akvg;
import defpackage.bcse;
import defpackage.bdwr;
import defpackage.bdxd;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.czhb;
import defpackage.czks;
import defpackage.ehdr;
import defpackage.ekmq;
import defpackage.ekms;
import defpackage.emyl;
import defpackage.enhk;
import defpackage.entd;
import defpackage.ffbr;
import defpackage.rff;
import defpackage.vyw;
import defpackage.vyy;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationMessageLinkPreviewView extends czks implements vyy {
    public static final /* synthetic */ int v = 0;
    private TextView A;
    private ImageView B;
    private float[] C;
    private final int D;
    public bdxd b;
    public bdwr c;
    public Optional d;
    public akvg e;
    public vyw f;
    public ffbr g;
    public ffbr h;
    public ImageView i;
    ImageView j;
    public View k;
    public View l;
    public View m;
    public View n;
    public boolean o;
    public ConversationMessageView p;
    public ConversationMessageBubbleView q;
    public View.OnClickListener r;
    public View.OnLongClickListener s;
    public View.OnClickListener t;
    protected ekms u;
    private TextView y;
    private TextView z;
    static final emyl a = cfvl.y("enable_link_preview_view_customization");
    private static final enhk w = enhk.l("photos.google.com", new czhb());
    private static final entd x = entd.c("BugleLinkPreviews");

    public ConversationMessageLinkPreviewView(Context context) {
        this(context, null, 0);
    }

    private final void f() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(this.C, null, null));
        shapeDrawable.setAlpha(0);
        setForeground(shapeDrawable);
    }

    private final void g() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(this.C, null, null));
        shapeDrawable.getPaint().setAntiAlias(false);
        setForeground(new RippleDrawable(ColorStateList.valueOf(ehdr.b(this, R.attr.colorControlHighlight)), null, shapeDrawable));
    }

    private final void h(final MessageIdType messageIdType, final String str) {
        this.m.setVisibility(0);
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        setOnClickListener(new View.OnClickListener() { // from class: czhr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationMessageLinkPreviewView conversationMessageLinkPreviewView = ConversationMessageLinkPreviewView.this;
                if (conversationMessageLinkPreviewView.n.getVisibility() != 0) {
                    conversationMessageLinkPreviewView.m.setVisibility(8);
                    conversationMessageLinkPreviewView.l.setVisibility(8);
                    conversationMessageLinkPreviewView.n.setVisibility(0);
                    conversationMessageLinkPreviewView.n.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(conversationMessageLinkPreviewView.n, "alpha", 0.0f, 1.0f);
                    ofFloat.setDuration(300L);
                    ofFloat.start();
                }
                if (!((ahor) conversationMessageLinkPreviewView.g.b()).b()) {
                    ((ahor) conversationMessageLinkPreviewView.g.b()).h();
                }
                conversationMessageLinkPreviewView.b.b(messageIdType);
                if (((Boolean) cful.w.e()).booleanValue()) {
                    conversationMessageLinkPreviewView.c.g(str);
                }
            }
        });
        this.q.c(true, true);
    }

    @Override // defpackage.vyy
    public final void J(Iterable iterable) {
        g();
        this.s = null;
    }

    @Override // defpackage.vyy
    public final void M(bcse bcseVar) {
        f();
        setOnLongClickListener(new View.OnLongClickListener() { // from class: czhq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                View.OnLongClickListener onLongClickListener;
                ConversationMessageLinkPreviewView conversationMessageLinkPreviewView = ConversationMessageLinkPreviewView.this;
                if (conversationMessageLinkPreviewView.f.f() || (onLongClickListener = conversationMessageLinkPreviewView.s) == null) {
                    return false;
                }
                onLongClickListener.onLongClick(conversationMessageLinkPreviewView);
                return true;
            }
        });
    }

    public final void a() {
        setOnClickListener(null);
        setClickable(false);
        b(null, null);
    }

    public final void b(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        this.r = onClickListener;
        this.s = onLongClickListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0305 A[LOOP:2: B:102:0x023e->B:125:0x0305, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0302 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.bcse r20, float[] r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView.c(bcse, float[], boolean, boolean):void");
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i = (ImageView) findViewById(com.google.android.apps.messaging.R.id.thumbnail_image);
        this.j = (ImageView) findViewById(com.google.android.apps.messaging.R.id.thumbnail_image_overlay);
        this.k = findViewById(com.google.android.apps.messaging.R.id.thumbnail_image_container);
        this.y = (TextView) findViewById(com.google.android.apps.messaging.R.id.link_preview_title);
        this.z = (TextView) findViewById(com.google.android.apps.messaging.R.id.link_preview_description);
        this.A = (TextView) findViewById(com.google.android.apps.messaging.R.id.link_preview_domain);
        this.l = findViewById(com.google.android.apps.messaging.R.id.link_preview_content_container);
        this.m = findViewById(com.google.android.apps.messaging.R.id.link_preview_tap_to_load_container);
        this.n = findViewById(com.google.android.apps.messaging.R.id.link_preview_progress);
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            this.B = (ImageView) findViewById(com.google.android.apps.messaging.R.id.link_preview_icon);
        }
    }

    public ConversationMessageLinkPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConversationMessageLinkPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = ekmq.c(this).c().p(rff.b());
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            inflate(context, com.google.android.apps.messaging.R.layout.conversation_message_link_preview_view_v2, this);
        } else {
            inflate(context, com.google.android.apps.messaging.R.layout.conversation_message_link_preview_view, this);
        }
        this.D = ehdr.b(this, R.attr.colorBackground);
    }

    @Override // defpackage.vyy
    public final void K(bcse bcseVar) {
    }
}
