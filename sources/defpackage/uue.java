package defpackage;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.message.MessageAttachmentsView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uue extends wc {
    final /* synthetic */ uuy a;
    private boolean e;
    private int b = 0;
    private int c = 0;
    private boolean d = false;
    private boolean f = true;
    private int g = 0;

    public uue(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.c += i2;
        this.a.aO = false;
        int a = this.a.aB.f.a() - ((Integer) uuy.a.e()).intValue();
        int M = this.a.aA.M();
        uuw uuwVar = this.a.ay;
        int i3 = recyclerView.F;
        if (i2 < 0 && a >= M && i3 == 1) {
            ((vvn) uuwVar).bc.b();
        }
        if (this.g == 1) {
            int abs = Math.abs(this.b);
            uuy uuyVar = this.a;
            if (abs >= uuyVar.aM) {
                int N = (uuyVar.aA.N() + this.a.aA.L()) / 2;
                csjy.d("Bugle", "RecyclerView onScrolled: loadedMore with middleIndexOnScreen %d", Integer.valueOf(N));
                axnw.h(this.a.aB.i(N));
            }
        }
        if (i2 != 0) {
            this.a.aP = true;
        }
        if (this.g == 1 && !this.e) {
            int i4 = this.b + i2;
            this.b = i4;
            if (i4 < (-this.a.aM)) {
                ellj.g(new uvv(), recyclerView);
                this.e = true;
            }
        }
        if (this.f != this.a.G()) {
            this.c = 0;
            this.d = false;
            this.f = this.a.G();
            if (this.a.G()) {
                csjy.c("Bugle", "hideScrollToBottomButton");
                vvn vvnVar = (vvn) this.a.ay;
                ConversationScrollToBottomButton conversationScrollToBottomButton = vvnVar.cT;
                if (conversationScrollToBottomButton != null) {
                    vvnVar.cU = 0;
                    vyp H = conversationScrollToBottomButton.H();
                    if (H.b.isShown()) {
                        H.b().start();
                    }
                    czxf czxfVar = (czxf) vvnVar.bD.b();
                    if (!czxfVar.f) {
                        czxfVar.e.b(true);
                    }
                }
            }
        }
        this.a.i.a(recyclerView);
        if (Math.abs(this.c) <= ((Integer) this.a.bb.a()).intValue() || this.g != 2 || this.d) {
            return;
        }
        this.d = true;
        csjy.c("Bugle", "showScrollToBottomButton");
        this.a.ay.n();
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
        int gp;
        int i2;
        int intValue;
        if (i == 0) {
            uxa uxaVar = this.a.h;
            uxaVar.g += ((cqoh) uxaVar.e.b()).a() - uxaVar.f;
            this.b = 0;
            this.e = false;
            int N = (this.a.aA.N() + this.a.aA.L()) / 2;
            csjy.d("Bugle", "RecyclerView onScrollStateChanged to SCROLL_STATE_IDLE, call loadedMore with middelIndexOnScreen %d", Integer.valueOf(N));
            axnw.h(this.a.aB.i(N));
        } else if (i == 1) {
            if (this.g == 0) {
                boolean z = ((bcqs) this.a.aL.a()).d.z();
                uuy uuyVar = this.a;
                if (z) {
                    uxa uxaVar2 = uuyVar.h;
                    uxaVar2.f = ((cqoh) uxaVar2.e.b()).a();
                }
            }
            csjy.c("Bugle", "RecyclerView onScrollStateChanged to SCROLL_STATE_DRAGGING");
            Optional.ofNullable(this.a.az.E).ifPresent(new Consumer() { // from class: uud
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((vr) obj).c();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (this.a.aV != null && (i == 2 || i == 0)) {
            csjy.c("Bugle", "RecyclerView onScrollStateChanged to SCROLL_STATE_SETTLING or SCROLL_STATE_IDLE");
            uuy uuyVar2 = this.a;
            Uri uri = uuyVar2.aV;
            uuyVar2.aV = null;
            if (recyclerView.getChildCount() > 0 && (gp = uuyVar2.aU - recyclerView.gp(recyclerView.getChildAt(0))) < recyclerView.getChildCount()) {
                View childAt = recyclerView.getChildAt(gp);
                if (childAt instanceof ConversationMessageView) {
                    czlu czluVar = ((ConversationMessageView) childAt).ai;
                    if (czluVar.b.i()) {
                        MessageAttachmentContainer messageAttachmentContainer = ((MessageAttachmentsView) czluVar.b.b()).c;
                        if (messageAttachmentContainer.c.containsKey(uri) && (intValue = ((Integer) messageAttachmentContainer.c.get(uri)).intValue()) < messageAttachmentContainer.getChildCount()) {
                            i2 = messageAttachmentContainer.getMeasuredHeight() - messageAttachmentContainer.getChildAt(intValue).getBottom();
                            recyclerView.scrollBy(0, -i2);
                        }
                    }
                    i2 = 0;
                    recyclerView.scrollBy(0, -i2);
                }
            }
        }
        csjy.d("Bugle", "RecyclerView onScrollStateChanged to %s", Integer.valueOf(i));
        this.g = i;
    }
}
