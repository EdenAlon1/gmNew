package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqwo extends vk {
    public Integer a;
    final /* synthetic */ dqwt d;
    private int e;
    private int f;

    public dqwo(dqwt dqwtVar) {
        this.d = dqwtVar;
        this.e = dqwtVar.b;
        this.f = dqwtVar.a();
    }

    private final int G() {
        return ffmk.g(((dqya) this.d).h.b, a());
    }

    public final void F() {
        Context context = this.d.getContext();
        context.getClass();
        int i = dskj.c(context).x;
        int a = this.d.a();
        int i2 = i - (a + a);
        int f = ffmk.f(G(), 1);
        dqwt dqwtVar = this.d;
        float e = ffmk.e(i2 / (f * (dqwtVar.b + dqwtVar.a())), 0.5f, 2.0f);
        int intValue = ((Number) this.d.f.c(dqwt.a[2])).intValue() - this.d.a();
        float ceil = (float) Math.ceil(a() / G());
        dqwt dqwtVar2 = this.d;
        float min = Math.min(e, ffmk.e(intValue / (ceil * (dqwtVar2.b + dqwtVar2.a())), 0.5f, 2.0f));
        dqwt dqwtVar3 = this.d;
        this.e = (int) (dqwtVar3.b * min);
        this.f = (int) (dqwtVar3.a() * min);
        p();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = this.d.e.inflate(R.layout.emoji_item, viewGroup, false);
        inflate.getClass();
        return new dqwp(inflate);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        Integer num;
        dqof dqofVar;
        dqwp dqwpVar = (dqwp) wrVar;
        dqwpVar.getClass();
        final dqof m = m(i);
        CharSequence charSequence = null;
        CharSequence a = m != null ? m.a() : null;
        final dqwt dqwtVar = this.d;
        dqsv c = dqwtVar.c();
        if (c != null && (dqofVar = c.d) != null) {
            charSequence = dqofVar.a();
        }
        SingleEmojiView singleEmojiView = dqwpVar.s;
        if (ffkj.e(a, charSequence)) {
            dqsv c2 = dqwtVar.c();
            if (c2 != null && (num = c2.e) != null) {
                singleEmojiView.setBackgroundResource(num.intValue());
            }
            this.a = Integer.valueOf(i);
        } else {
            TypedValue typedValue = new TypedValue();
            if (singleEmojiView.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true)) {
                singleEmojiView.setBackgroundResource(typedValue.resourceId);
            }
        }
        ViewGroup.LayoutParams layoutParams = singleEmojiView.getLayoutParams();
        int i2 = this.e;
        layoutParams.width = i2;
        layoutParams.height = i2;
        int i3 = this.f;
        singleEmojiView.setPadding(i3, i3, i3, i3);
        if (m != null) {
            singleEmojiView.f(m);
        }
        singleEmojiView.setOnClickListener(new View.OnClickListener() { // from class: dqwn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dqof dqofVar2 = dqof.this;
                if (dqofVar2 != null) {
                    dqwtVar.c.invoke(dqofVar2);
                }
            }
        });
    }

    public abstract dqof m(int i);
}
