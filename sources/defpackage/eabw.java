package defpackage;

import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eabw implements Runnable {
    final /* synthetic */ TimestampHeaderView a;

    public eabw(TimestampHeaderView timestampHeaderView) {
        this.a = timestampHeaderView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TimestampHeaderView timestampHeaderView = this.a;
        timestampHeaderView.b.setText(eabv.a(timestampHeaderView.c, timestampHeaderView.getContext()));
        this.a.postDelayed(this, TimestampHeaderView.a);
    }
}
