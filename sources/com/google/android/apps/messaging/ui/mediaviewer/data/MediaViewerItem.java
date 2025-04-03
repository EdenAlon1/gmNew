package com.google.android.apps.messaging.ui.mediaviewer.data;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dcva;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class MediaViewerItem implements Parcelable {
    public abstract Uri a();

    public abstract Uri b();

    public abstract MessageId c();

    public abstract ConversationId d();

    public abstract ConversationIdType e();

    public abstract MessageIdType f();

    public abstract dcva g();

    public abstract String h();

    public abstract String i();

    public abstract String j();
}
