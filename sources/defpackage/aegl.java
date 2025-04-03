package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aegl implements aemi {
    public final Context a;
    private final ejlq b;
    private final ffsk c;
    private MenuItem d;
    private final ejlr e;

    public aegl(Context context, ejlq ejlqVar, ffsk ffskVar) {
        ejlqVar.getClass();
        ffskVar.getClass();
        this.a = context;
        this.b = ejlqVar;
        this.c = ffskVar;
        this.e = new ejlr<SelectedConversation, String>() { // from class: aegl.1
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                String str = (String) obj2;
                ((SelectedConversation) obj).getClass();
                str.getClass();
                ehft ehftVar = new ehft(aegl.this.a);
                ehftVar.y(aegl.this.a.getString(R.string.debug_conversation_details));
                ehftVar.n(str);
                ehftVar.j(true);
                ehftVar.p(aegl.this.a.getString(R.string.debug_conversation_details_negative_button), new DialogInterface.OnClickListener() { // from class: aegk
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ehftVar.a();
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void m(Object obj, Throwable th) {
                axnw.d(th);
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
    }

    @Override // defpackage.aemi
    public final int a() {
        return R.id.debug_conversation_details;
    }

    @Override // defpackage.aemi
    public final void b(Menu menu) {
        menu.getClass();
        MenuItem add = menu.add(0, R.id.debug_conversation_details, 99999, this.a.getString(R.string.debug_conversation_details));
        this.d = add;
        if (add == null) {
            ffkj.c("debugConversationDetailsMenuItem");
            add = null;
        }
        add.setShowAsAction(4);
    }

    @Override // defpackage.aemi
    public final void c(Collection collection) {
        elfl c;
        SelectedConversation selectedConversation = (SelectedConversation) ffdx.J(collection);
        c = axol.c(this.c, ffhe.a, ffsm.a, new aegn(selectedConversation, null));
        this.b.i(new ejlp(c), new ejlm(selectedConversation), this.e);
    }

    @Override // defpackage.aemi
    public final void d(ea eaVar) {
        this.b.k(this.e);
    }

    @Override // defpackage.aemi
    public final void f(Collection collection) {
        int size = collection.size();
        MenuItem menuItem = this.d;
        if (menuItem == null) {
            ffkj.c("debugConversationDetailsMenuItem");
            menuItem = null;
        }
        menuItem.setVisible(size == 1);
    }

    @Override // defpackage.aemi
    public final /* synthetic */ void e() {
    }
}
