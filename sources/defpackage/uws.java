package defpackage;

import android.graphics.drawable.Animatable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.ui.conversation.typingindicator.ConversationTypingIndicatorView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uws extends upz {
    public boolean a;
    public final LinearLayoutManager d;
    public List f;

    public uws(LinearLayoutManager linearLayoutManager, czic czicVar, cqoh cqohVar) {
        super(czicVar, cqohVar);
        this.f = new ArrayList();
        this.d = linearLayoutManager;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a ? 1 : 0;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        String quantityString;
        uqe uqeVar = (uqe) wrVar;
        csix.k(uqeVar.s instanceof ConversationTypingIndicatorView);
        ConversationTypingIndicatorView conversationTypingIndicatorView = (ConversationTypingIndicatorView) uqeVar.s;
        List list = conversationTypingIndicatorView.a;
        List list2 = this.f;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (!list2.contains(conversationTypingIndicatorView.a.get(size))) {
                conversationTypingIndicatorView.a.remove(size);
                conversationTypingIndicatorView.b.removeViewAt(size);
            }
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) list2.get(i2);
            if (!conversationTypingIndicatorView.a.contains(bindData)) {
                conversationTypingIndicatorView.a.add(bindData);
                ContactIconView contactIconView = (ContactIconView) LayoutInflater.from(conversationTypingIndicatorView.getContext()).inflate(R.layout.typing_contact_icon_view, (ViewGroup) conversationTypingIndicatorView.b, false);
                contactIconView.setImportantForAccessibility(2);
                contactIconView.l(conversationTypingIndicatorView.e.a(bindData), bindData.u(), bindData.T(), bindData.v(), bindData.U());
                conversationTypingIndicatorView.b.addView(contactIconView, r2.getChildCount() - 1);
            }
        }
        if (list2.isEmpty()) {
            ((Animatable) conversationTypingIndicatorView.c).stop();
            conversationTypingIndicatorView.setVisibility(8);
            return;
        }
        String a = ((bdrt) conversationTypingIndicatorView.f.b()).a((ParticipantsTable.BindData) list2.get(0), false);
        if (list2.size() == 1) {
            quantityString = conversationTypingIndicatorView.getResources().getString(R.string.typing_indicator_one, a);
        } else {
            int size2 = list2.size() - 1;
            quantityString = conversationTypingIndicatorView.getResources().getQuantityString(R.plurals.typing_indicator_many, size2, a, Integer.valueOf(size2));
        }
        conversationTypingIndicatorView.b.setContentDescription(quantityString);
        conversationTypingIndicatorView.setVisibility(0);
        ((Animatable) conversationTypingIndicatorView.c).start();
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return -2L;
    }

    @Override // defpackage.upz
    protected final int m(int i) {
        return R.layout.conversation_typing_indicator;
    }
}
