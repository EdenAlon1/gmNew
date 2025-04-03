package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.block.ui.list.BlockedParticipantsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suu implements fbba {
    public static BlockedParticipantsActivity a(Activity activity) {
        if (!(activity instanceof BlockedParticipantsActivity)) {
            throw new IllegalStateException(a.I(activity, sut.class, "Attempt to inject a Activity wrapper of type "));
        }
        BlockedParticipantsActivity blockedParticipantsActivity = (BlockedParticipantsActivity) activity;
        blockedParticipantsActivity.getClass();
        return blockedParticipantsActivity;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
