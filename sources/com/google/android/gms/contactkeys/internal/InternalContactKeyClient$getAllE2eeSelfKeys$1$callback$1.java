package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeSelfKeyListParcelable;
import com.google.android.gms.contactkeys.internal.ISelfKeysCallback;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getAllE2eeSelfKeys$1$callback$1 extends ISelfKeysCallback.Stub {
    final /* synthetic */ dhri<E2eeSelfKeyListParcelable> $completionSource;

    InternalContactKeyClient$getAllE2eeSelfKeys$1$callback$1(dhri<E2eeSelfKeyListParcelable> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.ISelfKeysCallback
    public void onResult(Status status, E2eeSelfKeyListParcelable e2eeSelfKeyListParcelable) {
        status.getClass();
        e2eeSelfKeyListParcelable.getClass();
        dfup.b(status, e2eeSelfKeyListParcelable, this.$completionSource);
    }
}
