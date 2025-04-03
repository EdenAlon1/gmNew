package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cziz implements View.OnLongClickListener, View.OnTouchListener {
    private static final entd d = entd.c("BugleLinkify");
    public final View.OnClickListener a;
    public boolean b = false;
    public Runnable c;
    private final vyw e;
    private final View.OnLongClickListener f;
    private final ktq g;

    public cziz(Context context, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener, vyw vywVar) {
        this.f = onLongClickListener;
        this.a = onClickListener;
        this.g = new ktq(context, new cziy(this, vywVar));
        this.e = vywVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (((Boolean) czhm.c.e()).booleanValue()) {
            ((ensz) ((ensz) d.h()).h("com/google/android/apps/messaging/ui/conversation/message/ConversationMessageTextController$IgnoreLinkLongClickHelper", "onLongClick", 1087, "ConversationMessageTextController.java")).q("Passing long click to delegate handler");
        }
        return this.f.onLongClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(final View view, MotionEvent motionEvent) {
        this.g.b(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.c = new Runnable() { // from class: czix
                @Override // java.lang.Runnable
                public final void run() {
                    cziz.this.a.onClick(view);
                }
            };
        }
        if (motionEvent.getActionMasked() == 3) {
            this.b = false;
            return false;
        }
        if (!this.b) {
            return !this.e.f();
        }
        this.b = false;
        if (((Boolean) czhm.c.e()).booleanValue()) {
            ((ensz) ((ensz) d.h()).h("com/google/android/apps/messaging/ui/conversation/message/ConversationMessageTextController$IgnoreLinkLongClickHelper", "onTouch", 1110, "ConversationMessageTextController.java")).q("Long press detected in onTouch, handling it.");
        }
        return onLongClick(view);
    }
}
