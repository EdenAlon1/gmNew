package defpackage;

import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajua implements ajtv {
    public static final /* synthetic */ int b = 0;
    private static final entd c = entd.c("BugleReplies");
    public final crly a;
    private final elew d;

    public ajua(elew elewVar, crly crlyVar) {
        this.d = elewVar;
        this.a = crlyVar;
        crlyVar.f(R.layout.reply_button_view);
    }

    @Override // defpackage.ajtv
    public final void a(final MessageIdType messageIdType) {
        messageIdType.getClass();
        ensk n = c.n();
        ensn ensnVar = ajro.a;
        n.Y(ajro.c, messageIdType.b());
        n.q("ReplyButtonControllerImpl.setContent");
        ((ComposeView) this.a.b()).a(new hpw(-358112956, true, new ajtz(new hic(this.d.a("ReplyButton.onClick", new ffix() { // from class: ajtx
            @Override // defpackage.ffix
            public final Object invoke() {
                ajuh ajuhVar = new ajuh(MessageIdType.this, 1);
                ajua ajuaVar = this;
                ellj.g(ajuhVar, ajuaVar.a.b());
                ((ComposeView) ajuaVar.a.b()).setVisibility(8);
                return ffcu.a;
            }
        }), hla.a))));
    }
}
