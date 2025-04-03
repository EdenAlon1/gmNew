package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SelectedSearchResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ddqu extends ddqp, ddqt {
    lld e();

    lld g();

    lld i();

    SearchQuery.ParticipantSearchFilter k();

    SearchQuery.StarSearchFilter l();

    ConversationFilterDataItem m();

    FreeTextFilterDataItem n();

    SearchFilterDataItem o();

    ListenableFuture p(String str);

    void q(Bundle bundle);

    void r(Bundle bundle);

    void s(SearchFilterDataItem searchFilterDataItem);

    void t(String str);

    void u(SelectedSearchResult selectedSearchResult);

    boolean v();

    void w(int i);
}
