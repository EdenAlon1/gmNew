package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxrr implements ctuj {
    final /* synthetic */ AudioButtonView a;

    public cxrr(AudioButtonView audioButtonView) {
        this.a = audioButtonView;
    }

    @Override // defpackage.ctuj
    public final void c() {
        this.a.r.k(R.string.microphone_permission_denied_text);
    }

    @Override // defpackage.ctuj
    public final void d() {
        this.a.c();
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void b() {
    }
}
