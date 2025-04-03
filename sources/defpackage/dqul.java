package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqul extends dquo {
    public static final /* synthetic */ int y = 0;
    public final View s;
    public final SingleEmojiViewWithVariantIndicator t;
    public ffud u;
    public dqqj v;
    public dqof w;
    final /* synthetic */ dqur x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqul(dqur dqurVar, View view) {
        super(view);
        this.x = dqurVar;
        this.s = view;
        View b = kvo.b(view, R.id.emoji);
        b.getClass();
        this.t = (SingleEmojiViewWithVariantIndicator) b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r6.t.getHeight() != r6.x.j) goto L9;
     */
    @Override // defpackage.dquo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.dquu r7) {
        /*
            r6 = this;
            r7.getClass()
            ffud r0 = r6.u
            if (r0 == 0) goto La
            defpackage.ffub.a(r0)
        La:
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r0 = r6.t
            dqur r1 = r6.x
            int r0 = r0.getWidth()
            int r1 = r1.j
            if (r0 != r1) goto L22
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r0 = r6.t
            dqur r1 = r6.x
            int r0 = r0.getHeight()
            int r1 = r1.j
            if (r0 == r1) goto L39
        L22:
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r0 = r6.t
            dqur r1 = r6.x
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r1 = r1.j
            r2.<init>(r1, r1)
            r0.setLayoutParams(r2)
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r0 = r6.t
            dqur r1 = r6.x
            int r1 = r1.k
            r0.setPadding(r1, r1, r1, r1)
        L39:
            dqus r7 = (defpackage.dqus) r7
            dqqj r0 = r7.a
            r6.v = r0
            r1 = 0
            if (r0 != 0) goto L48
            java.lang.String r0 = "emojiSet"
            defpackage.ffkj.c(r0)
            r0 = r1
        L48:
            dqur r2 = r6.x
            dqns r3 = r0.a()
            dqsv r2 = r2.F()
            dqof r2 = r2.d
            boolean r2 = defpackage.ffkj.e(r3, r2)
            if (r2 != 0) goto Lb3
            java.util.Set r0 = r0.i()
            dqur r2 = r6.x
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L6b
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L6b
            goto L94
        L6b:
            java.util.Iterator r0 = r0.iterator()
        L6f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L94
            java.lang.Object r3 = r0.next()
            dqoe r3 = (defpackage.dqoe) r3
            java.lang.CharSequence r3 = r3.a()
            dqsv r4 = r2.F()
            dqof r4 = r4.d
            if (r4 == 0) goto L8c
            java.lang.CharSequence r4 = r4.a()
            goto L8d
        L8c:
            r4 = r1
        L8d:
            boolean r3 = defpackage.ffkj.e(r3, r4)
            if (r3 == 0) goto L6f
            goto Lb3
        L94:
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r0 = r6.t
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r4 = 16843868(0x101045c, float:2.3696686E-38)
            r5 = 1
            boolean r3 = r3.resolveAttribute(r4, r2, r5)
            if (r3 == 0) goto Lc6
            int r2 = r2.resourceId
            r0.setBackgroundResource(r2)
            goto Lc6
        Lb3:
            dqur r0 = r6.x
            dqsv r0 = r0.F()
            java.lang.Integer r0 = r0.e
            if (r0 == 0) goto Lc6
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r2 = r6.t
            int r0 = r0.intValue()
            r2.setBackgroundResource(r0)
        Lc6:
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r0 = r6.t
            dqyg r2 = com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator.j
            r0.f(r2)
            dqur r0 = r6.x
            dquj r2 = new dquj
            r2.<init>(r6, r0, r7, r1)
            ffsk r7 = r0.e
            r0 = 3
            ffud r7 = defpackage.ffqy.d(r7, r1, r1, r2, r0)
            r6.u = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqul.C(dquu):void");
    }

    public final void D() {
        dqof dqofVar = this.w;
        dqqj dqqjVar = null;
        if (dqofVar == null) {
            ffkj.c("emoji");
            dqofVar = null;
        }
        dqqj dqqjVar2 = this.v;
        if (dqqjVar2 == null) {
            ffkj.c("emojiSet");
        } else {
            dqqjVar = dqqjVar2;
        }
        this.t.f(new dqyg(dqofVar, dqqjVar));
        SingleEmojiViewWithVariantIndicator singleEmojiViewWithVariantIndicator = this.t;
        final dqur dqurVar = this.x;
        singleEmojiViewWithVariantIndicator.setOnClickListener(dqurVar.d.b("EmojiAdapter.EmojiViewHolder#onClick", new View.OnClickListener() { // from class: dquh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dqul dqulVar = this;
                dqqj dqqjVar3 = dqulVar.v;
                if (dqqjVar3 == null) {
                    ffkj.c("emojiSet");
                    dqqjVar3 = null;
                }
                dqur.this.l.a(dqulVar, dqqjVar3);
            }
        }));
        SingleEmojiViewWithVariantIndicator singleEmojiViewWithVariantIndicator2 = this.t;
        final dqur dqurVar2 = this.x;
        singleEmojiViewWithVariantIndicator2.setOnLongClickListener(dqurVar2.d.c("EmojiAdapter.EmojiViewHolder#onLongClick", new View.OnLongClickListener() { // from class: dqui
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                dqul dqulVar = this;
                dqqj dqqjVar3 = dqulVar.v;
                if (dqqjVar3 == null) {
                    ffkj.c("emojiSet");
                    dqqjVar3 = null;
                }
                ((Boolean) dqur.this.m.a(dqulVar, dqqjVar3)).booleanValue();
                return true;
            }
        }));
    }
}
