package defpackage;

import android.graphics.Rect;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface czic {
    boolean H(czid czidVar, MessagePartCoreData messagePartCoreData, Rect rect, boolean z);

    List K(List list, int i);

    int a();

    int b();

    bctw d();

    bcxq e(SelfIdentityId selfIdentityId);

    Optional g(MessageIdType messageIdType);

    void i(SuggestionData suggestionData);

    void m(bcse bcseVar);

    void u();
}
