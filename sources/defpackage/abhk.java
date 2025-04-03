package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhk implements dqmn {
    final /* synthetic */ abho a;

    public abhk(abho abhoVar) {
        this.a = abhoVar;
    }

    @Override // defpackage.dqmn
    public final /* synthetic */ CharSequence a() {
        return "";
    }

    @Override // defpackage.dqmn
    public final void f(dqrp dqrpVar) {
        this.a.c.hw();
        this.a.g.c(dqrpVar);
        this.a.g.a(dqrpVar);
        String obj = dqrpVar.b.a().toString();
        ffji ffjiVar = this.a.m;
        if (ffjiVar != null) {
            ffjiVar.invoke(obj);
            return;
        }
        enrr a = abho.b.a(Level.WARNING);
        a.Y(ente.a, "BugleReactions");
        ((enrr) a.h("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer$emojiReactionHandlingTextController$1", "insertEmojiAtCurrentSelection", BasePaymentResult.ERROR_REQUEST_FAILED, "ReactionPickerFragmentPeer.kt")).q("emoji selected before `onSelectEmoji` was initialized");
    }

    @Override // defpackage.dqmn
    public final void d() {
    }

    @Override // defpackage.dqmn
    public final void e() {
    }

    @Override // defpackage.dqmn
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.dqmn
    public final void b(CharSequence charSequence) {
    }

    @Override // defpackage.dqmn
    public final void c(CharSequence charSequence) {
    }

    @Override // defpackage.dqmn
    public final void g(CharSequence charSequence) {
    }

    @Override // defpackage.dqmn
    public final void i(CharSequence charSequence) {
    }
}
