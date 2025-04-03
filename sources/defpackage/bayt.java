package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bayt implements erqj {
    final /* synthetic */ SetupExpressiveStickersAction a;

    public bayt(SetupExpressiveStickersAction setupExpressiveStickersAction) {
        this.a = setupExpressiveStickersAction;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        SetupExpressiveStickersAction.a.o("Failed to download sticker metadata.", th);
        if (th instanceof CancellationException) {
            this.a.f.f(8);
        } else {
            this.a.f.f(3);
        }
    }
}
