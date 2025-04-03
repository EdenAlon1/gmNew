package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bayu implements erqj {
    final /* synthetic */ ewnm a;
    final /* synthetic */ SetupExpressiveStickersAction b;

    public bayu(SetupExpressiveStickersAction setupExpressiveStickersAction, ewnm ewnmVar) {
        this.a = ewnmVar;
        this.b = setupExpressiveStickersAction;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            ewnm ewnmVar = this.a;
            SetupExpressiveStickersAction setupExpressiveStickersAction = this.b;
            ((eere) setupExpressiveStickersAction.e.b()).p(ewnmVar.b);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        SetupExpressiveStickersAction.a.o("Failed to get favorite sticker pack.", th);
    }
}
