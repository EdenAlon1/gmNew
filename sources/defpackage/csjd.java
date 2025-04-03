package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csjd extends HashSet {
    public csjd() {
    }

    public final ConversationIdType a() {
        return (ConversationIdType) iterator().next();
    }

    public final String b() {
        return TextUtils.join("|", this);
    }

    public csjd(Collection collection) {
        super(collection);
    }
}
