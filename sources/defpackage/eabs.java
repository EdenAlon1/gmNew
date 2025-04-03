package defpackage;

import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eabs implements Runnable {
    final /* synthetic */ MessageCellStatusView a;

    public eabs(MessageCellStatusView messageCellStatusView) {
        this.a = messageCellStatusView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b((String) null);
        this.a.postDelayed(this, MessageCellStatusView.a);
    }
}
