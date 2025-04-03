package defpackage;

import android.content.DialogInterface;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import j$.util.Optional;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdy {
    public final eg a;
    public final ffbr b;
    public final ffbr c;
    private final elbx d;

    public acdy(eg egVar, ffbr ffbrVar, ffbr ffbrVar2, elbx elbxVar) {
        this.a = egVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = elbxVar;
    }

    public final void a(final ViewGroup viewGroup, final Collection collection, final eoko eokoVar, final Runnable runnable) {
        ehft ehftVar = new ehft(this.a);
        ahgl ahglVar = (ahgl) this.b.b();
        Integer valueOf = Integer.valueOf(R.plurals.delete_conversations_confirmation_dialog_title);
        boolean booleanValue = ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue();
        int i = R.string.delete_conversations_confirmation_dialog_text;
        if (booleanValue && ((Optional) ahglVar.c.b()).isPresent()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SelectedConversation selectedConversation = (SelectedConversation) it.next();
                if (((aolr) ahglVar.d.b()).u(selectedConversation.k, selectedConversation.p).A()) {
                    valueOf = Integer.valueOf(R.plurals.delete_conversations_confirmation_dialog_title_with_penpal);
                    if (collection.size() == 1) {
                        i = R.string.delete_conversation_confirmation_dialog_text_with_penpal;
                    } else {
                        i = R.string.delete_conversations_confirmation_dialog_text_with_penpal;
                    }
                }
            }
        }
        ahgj ahgjVar = new ahgj(valueOf.intValue(), i);
        eg egVar = this.a;
        ehftVar.y(egVar.getResources().getQuantityString(ahgjVar.a, collection.size(), Integer.valueOf(collection.size())));
        ehftVar.m(ahgjVar.b);
        ehftVar.t(R.string.delete_conversation_confirmation_button, new elbb(this.d, "HomeFragmentPeer: Delete message", new DialogInterface.OnClickListener() { // from class: acdv
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ViewGroup viewGroup2;
                Collection<SelectedConversation> collection2 = collection;
                int size = collection2.size();
                acdy acdyVar = acdy.this;
                if (crnx.j(acdyVar.a) && (viewGroup2 = viewGroup) != null) {
                    crnx.k(viewGroup2, acdyVar.a.getResources().getQuantityString(R.plurals.deleted_toast_message, size, Integer.valueOf(size)));
                }
                for (SelectedConversation selectedConversation2 : collection2) {
                    eoko eokoVar2 = eokoVar;
                    ((akzt) acdyVar.c.b()).c("Bugle.UI.DeleteConversation");
                    ahgl ahglVar2 = (ahgl) acdyVar.b.b();
                    ayfy ayfyVar = (ayfy) ahglVar2.b.b();
                    aygb f = aygc.f();
                    f.f(eokoVar2);
                    f.b(selectedConversation2.a);
                    f.d(SuperSortLabel.UNKNOWN);
                    f.c(((cqoh) ahglVar2.a.b()).f().toEpochMilli());
                    ayfyVar.b(f.a());
                }
                runnable.run();
            }
        }));
        ehftVar.o(R.string.delete_conversation_decline_button, new DialogInterface.OnClickListener() { // from class: acdw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        ehftVar.s(new DialogInterface.OnDismissListener() { // from class: acdx
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        iv a = ehftVar.a();
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            Window window = a.getWindow();
            window.getClass();
            egyl.b((TextView) window.findViewById(android.R.id.message));
        }
    }
}
