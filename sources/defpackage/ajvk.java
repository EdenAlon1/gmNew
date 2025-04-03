package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajvk extends aag implements ajvi {
    public boolean c;
    private final Context d;
    private final ekyo e;
    private final ajud f;
    private final Drawable g;
    private final float h;
    private boolean i;
    private boolean j;
    private bcpw k;
    private final ajvk l;

    public ajvk(Context context, ekyo ekyoVar, ajud ajudVar) {
        super(0, 48);
        this.d = context;
        this.e = ekyoVar;
        this.f = ajudVar;
        Drawable drawable = context.getResources().getDrawable(R.drawable.swipe_reply_button, context.getTheme());
        drawable.getClass();
        this.g = drawable;
        this.h = context.getResources().getDimension(R.dimen.reply_swipe_animation_threshold);
        this.l = this;
    }

    private final float r(float f) {
        if (f == 0.0f) {
            return 1.0f;
        }
        return Math.max(0.0f, 1.0f - (this.d.getResources().getFraction(R.fraction.reply_swipe_hide_separator_fraction, 1, 1) * Math.min(Math.abs(f / this.h), 1.0f)));
    }

    @Override // defpackage.ajvi
    public final /* synthetic */ aag a() {
        return this.l;
    }

    @Override // defpackage.aac
    public final int b(int i, int i2) {
        int b = this.c ? 0 : super.b(i, i2);
        this.c = false;
        return b;
    }

    @Override // defpackage.ajvi
    public final void c(bcpw bcpwVar) {
        bcpwVar.getClass();
        this.k = bcpwVar;
    }

    @Override // defpackage.ajvi
    public final void d(RecyclerView recyclerView) {
        recyclerView.getClass();
        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: ajvj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z = true;
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z = false;
                }
                ajvk.this.c = z;
                return false;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
    @Override // defpackage.aac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.graphics.Canvas r11, android.support.v7.widget.RecyclerView r12, defpackage.wr r13, float r14, float r15, int r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajvk.h(android.graphics.Canvas, android.support.v7.widget.RecyclerView, wr, float, float, int, boolean):void");
    }

    @Override // defpackage.aac
    public final boolean l() {
        return false;
    }

    @Override // defpackage.aac
    public final boolean m(RecyclerView recyclerView, wr wrVar, wr wrVar2) {
        recyclerView.getClass();
        return false;
    }

    @Override // defpackage.aag
    public final int q(RecyclerView recyclerView, wr wrVar) {
        bcpw bcpwVar;
        recyclerView.getClass();
        View view = wrVar.a;
        if (!(view instanceof ConversationMessageView)) {
            return 0;
        }
        ConversationMessageView conversationMessageView = (ConversationMessageView) view;
        if (conversationMessageView.e == null || (bcpwVar = this.k) == null || !bcpwVar.g()) {
            return 0;
        }
        ajud ajudVar = this.f;
        bcpw bcpwVar2 = this.k;
        bcpwVar2.getClass();
        bcqs bcqsVar = (bcqs) bcpwVar2.a();
        bcse bcseVar = conversationMessageView.e;
        bcseVar.getClass();
        if (ajudVar.a(bcqsVar, bcseVar)) {
            return conversationMessageView.e.az() ? 32 : 16;
        }
        return 0;
    }

    @Override // defpackage.aac
    public final void i(wr wrVar, int i) {
    }
}
