package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ecaz {
    public static boolean a(ecba ecbaVar) {
        Rect rect = new Rect();
        AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) ecbaVar).c;
        boolean globalVisibleRect = accountParticleDisc.getGlobalVisibleRect(rect);
        int[] iArr = kvo.a;
        return accountParticleDisc.isLaidOut() && accountParticleDisc.isShown() && globalVisibleRect;
    }
}
