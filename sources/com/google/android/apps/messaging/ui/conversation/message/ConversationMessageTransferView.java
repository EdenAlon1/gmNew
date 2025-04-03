package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import defpackage.bcse;
import defpackage.bcsf;
import defpackage.cqpu;
import defpackage.csjc;
import defpackage.cxqh;
import defpackage.czjf;
import defpackage.czku;
import defpackage.deao;
import defpackage.elbx;
import defpackage.ffbr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationMessageTransferView extends czku {
    public bcse a;
    public czjf b;
    public bcsf c;
    public deao d;
    public cxqh e;
    public elbx f;
    public ffbr g;
    public ffbr h;
    private ViewGroup i;
    private ImageView j;
    private ProgressBar k;
    private final int l;

    public ConversationMessageTransferView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.conversation_message_transfer_view, this);
        this.l = getResources().getDimensionPixelSize(R.dimen.message_transfer_attachment_padding);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int e() {
        /*
            r4 = this;
            bcse r0 = r4.a
            int r0 = r0.f()
            r1 = 24
            r2 = 0
            if (r0 == r1) goto L66
            r1 = 210(0xd2, float:2.94E-43)
            if (r0 == r1) goto L66
            r1 = 243(0xf3, float:3.4E-43)
            if (r0 == r1) goto L66
            switch(r0) {
                case 1: goto L66;
                case 2: goto L66;
                case 3: goto L39;
                case 4: goto L39;
                case 5: goto L39;
                case 6: goto L39;
                case 7: goto L39;
                case 8: goto L35;
                case 9: goto L35;
                case 10: goto L39;
                case 11: goto L66;
                case 12: goto L35;
                case 13: goto L35;
                case 14: goto L66;
                case 15: goto L66;
                case 16: goto L66;
                case 17: goto L66;
                case 18: goto L66;
                case 19: goto L66;
                case 20: goto L39;
                case 21: goto L66;
                case 22: goto L66;
                default: goto L16;
            }
        L16:
            switch(r0) {
                case 100: goto L66;
                case 101: goto L31;
                case 102: goto L39;
                case 103: goto L39;
                case 104: goto L39;
                case 105: goto L39;
                case 106: goto L31;
                case 107: goto L35;
                case 108: goto L66;
                case 109: goto L66;
                case 110: goto L31;
                case 111: goto L35;
                case 112: goto L35;
                case 113: goto L30;
                case 114: goto L30;
                case 115: goto L31;
                case 116: goto L30;
                default: goto L19;
            }
        L19:
            bcse r0 = r4.a
            int r0 = r0.f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "unknown status "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.csix.c(r0)
        L30:
            return r2
        L31:
            r0 = 2131232363(0x7f08066b, float:1.8080833E38)
            return r0
        L35:
            r0 = 2131232318(0x7f08063e, float:1.8080742E38)
            return r0
        L39:
            bcse r0 = r4.a
            boolean r0 = r0.aL()
            if (r0 == 0) goto L56
            bcse r0 = r4.a
            boolean r0 = r0.aM()
            if (r0 != 0) goto L52
            bcse r0 = r4.a
            boolean r0 = r0.aX()
            if (r0 != 0) goto L52
            goto L56
        L52:
            r0 = 2131231831(0x7f080457, float:1.8079754E38)
            return r0
        L56:
            bcse r0 = r4.a
            boolean r0 = r0.aW()
            if (r0 == 0) goto L62
            r0 = 2131232431(0x7f0806af, float:1.8080971E38)
            return r0
        L62:
            r0 = 2131232381(0x7f08067d, float:1.808087E38)
            return r0
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView.e():int");
    }

    private final int f() {
        return (this.a.aL() && this.a.aM()) ? R.string.stop_send_description : this.b != null ? this.d.d(this.a.c(), this.a.s()) ? this.a.an() ? R.string.waiting_to_connect_tap_for_options : R.string.message_status_waiting_for_connection : this.a.ak() ? R.string.message_status_rcs_stuck_in_sending_hint : R.string.message_status_sending : R.string.message_status_sending;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e6, code lost:
    
        if (r5.a.aW() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0148, code lost:
    
        r0 = com.google.android.apps.messaging.R.string.video_thumbnail_view_play_button_content_description;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0146, code lost:
    
        if (r5.a.aW() != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.bcse r6) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView.a(bcse):void");
    }

    public final void b(Optional optional) {
        if (!this.a.at() && !this.a.aT()) {
            this.k.setVisibility(4);
            return;
        }
        if (optional.isEmpty()) {
            this.k.setIndeterminate(!csjc.j());
        } else {
            this.k.setIndeterminate(false);
            this.k.setMax((int) ((cqpu) optional.get()).b());
            this.k.setProgress((int) ((cqpu) optional.get()).a(), true);
        }
        this.k.setVisibility(0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.c.a();
        this.i = (ViewGroup) findViewById(R.id.icon_container);
        this.j = (ImageView) findViewById(R.id.icon);
        this.k = (ProgressBar) findViewById(R.id.progress);
    }
}
