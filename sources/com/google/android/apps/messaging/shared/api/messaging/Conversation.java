package com.google.android.apps.messaging.shared.api.messaging;

import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import defpackage.alxs;
import defpackage.alxu;
import defpackage.alye;
import defpackage.apeq;
import defpackage.aqge;
import defpackage.cfzm;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface Conversation extends Parcelable, AutoCloseable {
    alxs a();

    alxu b();

    alye c();

    @Override // java.lang.AutoCloseable
    void close();

    ConversationId d();

    apeq e();

    aqge f();

    aqge g();

    aqge h();

    aqge i();

    cfzm j();

    void k();
}
