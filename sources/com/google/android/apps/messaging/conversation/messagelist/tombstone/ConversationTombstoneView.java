package com.google.android.apps.messaging.conversation.messagelist.tombstone;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.tombstone.ConversationTombstoneView;
import defpackage.ahor;
import defpackage.bcse;
import defpackage.bcsf;
import defpackage.cbuv;
import defpackage.cbvv;
import defpackage.crnx;
import defpackage.csix;
import defpackage.csrh;
import defpackage.cwoj;
import defpackage.cynb;
import defpackage.czic;
import defpackage.czid;
import defpackage.ehdr;
import defpackage.emxe;
import defpackage.fazb;
import defpackage.ffbr;
import defpackage.uuy;
import defpackage.uxs;
import defpackage.vyw;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationTombstoneView extends uxs implements czid<ConversationTombstoneView> {
    public bcse a;
    public TextView b;
    public TextView c;
    public bcsf d;
    public csrh e;
    public ffbr f;
    public vyw g;
    public fazb h;
    public ffbr i;
    public fazb j;
    public ffbr k;
    public cynb l;
    public czic m;

    public ConversationTombstoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void j() {
        if (this.a.f() == 210) {
            ((ahor) this.k.b()).h();
        }
    }

    @Override // defpackage.czkr
    public final void b() {
        j();
        g();
    }

    @Override // defpackage.czid
    public final bcse c() {
        return this.a;
    }

    @Override // defpackage.czid
    public final void d(bcse bcseVar, String str, boolean z, boolean z2) {
        String str2;
        this.a = bcseVar;
        csix.g();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.tombstone_text_horizontal_padding);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.tombstone_text_vertical_padding);
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.min_touch_target_size);
        setPaddingRelative(0, 0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.message_padding_default));
        setMinimumHeight(dimensionPixelOffset);
        this.b.setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        this.b.setTextColor(ehdr.d(getContext(), R.attr.colorOnSurfaceVariant, "ConversationTombstoneView"));
        g();
        if (this.a.f() == 210) {
            Spanned fromHtml = Html.fromHtml(emxe.b(cbvv.c(getContext(), ((uuy) this.m).aG)));
            this.b.setText(fromHtml);
            this.b.setContentDescription(fromHtml.toString());
            setOnClickListener(new View.OnClickListener() { // from class: uxo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConversationTombstoneView conversationTombstoneView = ConversationTombstoneView.this;
                    eisx eisxVar = ((uuy) conversationTombstoneView.m).f;
                    Intent p = ((akvg) conversationTombstoneView.f.b()).p(conversationTombstoneView.getContext());
                    if (eisxVar != null) {
                        eiuy.c(p, eisxVar);
                    }
                    eldl.p(conversationTombstoneView.getContext(), p);
                }
            });
        } else {
            setOnClickListener(null);
            Optional findAny = Collection.EL.stream((Set) this.j.b()).filter(new Predicate() { // from class: uxl
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((cbuv) obj).c(ConversationTombstoneView.this.a);
                }
            }).findAny();
            if (findAny.isPresent()) {
                ((cbuv) findAny.get()).b(this, this.b, this.a, ehdr.b(this, R.attr.colorOnSurfaceVariant));
                str2 = ((cbuv) findAny.get()).a(this.a);
            } else {
                this.b.setText(this.a.V(getContext()));
                str2 = "";
            }
            csrh csrhVar = this.e;
            TextView textView = this.c;
            if (textView != null) {
                bcse bcseVar2 = this.a;
                if (bcseVar2.q) {
                    textView.setText(bcseVar2.D(csrhVar));
                    this.c.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            if (this.b.getText() != null && TextUtils.isEmpty(str2)) {
                str2 = this.b.getText().toString();
            }
            this.b.setContentDescription(crnx.e(getContext().getResources(), str2 + ", " + this.a.E(this.e)));
        }
        setSelected(this.g.g(bcseVar));
    }

    @Override // defpackage.czid
    public final void e(Object obj) {
        throw new UnsupportedOperationException("ConversationTombstoneView does not support bindPayload().");
    }

    @Override // defpackage.czid
    public final void f(czic czicVar) {
        this.m = czicVar;
    }

    public final void g() {
        ((Optional) this.i.b()).ifPresent(new Consumer() { // from class: uxj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cyne) obj).a(ConversationTombstoneView.this.b, R.dimen.tombstone_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.i.b()).ifPresent(new Consumer() { // from class: uxk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cyne) obj).a(ConversationTombstoneView.this.c, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = new cynb() { // from class: uxm
            @Override // defpackage.cynb
            public final void gl() {
                ConversationTombstoneView.this.g();
            }
        };
        ((Optional) this.h.b()).ifPresent(new Consumer() { // from class: uxn
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cync) obj).h(ConversationTombstoneView.this.l);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        j();
        g();
        ((Optional) this.h.b()).ifPresent(new Consumer() { // from class: uxp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cync) obj).k(ConversationTombstoneView.this.l);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.d.a();
        this.b = (TextView) findViewById(R.id.tombstone_message);
        this.c = (TextView) findViewById(R.id.tombstone_timestamp);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        super.setSelected(z);
        int c = z ? cwoj.c(getContext()) : cwoj.a(getContext());
        Optional findAny = Collection.EL.stream((Set) this.j.b()).filter(new Predicate() { // from class: uxq
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((cbuv) obj).c(ConversationTombstoneView.this.a);
            }
        }).findAny();
        if (findAny.isPresent() && ((cbuv) findAny.get()).d(z)) {
            c = 0;
        }
        this.b.setBackgroundColor(c);
    }

    @Override // defpackage.czkr
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }
}
