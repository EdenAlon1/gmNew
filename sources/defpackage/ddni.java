package defpackage;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
class ddni implements ejlr<Recipient, Boolean> {
    final /* synthetic */ ddnj a;

    public ddni(ddnj ddnjVar) {
        this.a = ddnjVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Recipient recipient = (Recipient) obj;
        if (!((Boolean) obj2).booleanValue()) {
            this.a.a(recipient);
            return;
        }
        ddnj ddnjVar = this.a;
        ddnjVar.z.j(((ddqh) ddnjVar.q.b()).b(new SearchQuery.ContentSearchFilter(6)));
        ddnj ddnjVar2 = this.a;
        qmc f = recipient.f();
        String str = f.k;
        str.getClass();
        Uri uri = f.i;
        if (uri == null) {
            uri = ((azze) ddnjVar2.s.b()).a(((aqky) ddnjVar2.t.b()).b(f));
        }
        ContactFilterDataItem a = ((ddqh) ddnjVar2.q.b()).a(new SearchQuery.ParticipantSearchFilter(str), uri, f.b);
        View view = ddnjVar2.b.Q;
        view.getClass();
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = (SpannedMultiAutoCompleteTextView) view.findViewById(R.id.zero_state_search_box_auto_complete);
        spannedMultiAutoCompleteTextView.h(spannedMultiAutoCompleteTextView.e(a));
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        ensk h = ddnj.a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) ((enrr) h).g(th)).h("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragmentPeer$4", "onFailure", (char) 849, "ZeroStateSearchFragmentPeer.java")).q("Failed to check if the contact is a participant. Starting 1-1 conversation.");
        this.a.a((Recipient) obj);
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
