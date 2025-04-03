package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeContactKeyListParcelable;
import com.google.android.gms.contactkeys.internal.IContactKeysCallback;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getAllE2eeContactKeys$1$callback$1 extends IContactKeysCallback.Stub {
    final /* synthetic */ dhri<E2eeContactKeyListParcelable> $completionSource;

    InternalContactKeyClient$getAllE2eeContactKeys$1$callback$1(dhri<E2eeContactKeyListParcelable> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.IContactKeysCallback
    public void onResult(Status status, E2eeContactKeyListParcelable e2eeContactKeyListParcelable) {
        status.getClass();
        e2eeContactKeyListParcelable.getClass();
        dfup.b(status, e2eeContactKeyListParcelable, this.$completionSource);
    }
}
