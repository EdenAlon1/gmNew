package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqi extends upz {
    public List a;
    private boolean d;
    private List f;
    private final ekyo g;

    public uqi(cqoh cqohVar, ekyo ekyoVar, czic czicVar) {
        super(czicVar, cqohVar);
        this.a = new ArrayList();
        this.f = new ArrayList();
        this.g = ekyoVar;
    }

    final void F() {
        List K = this.e.K(this.a, 1);
        if (this.f.equals(K)) {
            csjy.c("Bugle", "ConversationSuggestionsAdapter.refreshConversationSuggestions old and new suggestions are equal");
            return;
        }
        boolean isEmpty = K.isEmpty();
        boolean z = !isEmpty;
        this.f = K;
        if (!isEmpty && this.d) {
            csjy.c("Bugle", "ConversationSuggestionsAdapter.refreshConversationSuggestions already showing and new suggestions are present");
            q(0);
        } else if (!isEmpty && !this.d) {
            csjy.c("Bugle", "ConversationSuggestionsAdapter.refreshConversationSuggestions not already showing and new suggestions are present");
            s(0);
            this.e.u();
        } else if (isEmpty && this.d) {
            csjy.c("Bugle", "ConversationSuggestionsAdapter.refreshConversationSuggestions already showing and no new suggestions present, will hide");
            y(0);
        }
        this.d = z;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.d ? 1 : 0;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        uqe uqeVar = (uqe) wrVar;
        elav a = this.g.a("ConversationSuggestionsAdapter onBindViewHolder");
        try {
            csix.k(uqeVar.s instanceof ConversationSuggestionsView);
            ((ConversationSuggestionsView) uqeVar.s).c(this.f, czqy.m(this.e));
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return -3L;
    }

    @Override // defpackage.upz
    protected final int m(int i) {
        return R.layout.conversation_suggestions_view;
    }
}
