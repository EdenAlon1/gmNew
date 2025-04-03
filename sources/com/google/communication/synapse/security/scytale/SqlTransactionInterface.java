package com.google.communication.synapse.security.scytale;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class SqlTransactionInterface {
    public abstract Status commit();

    public abstract Status rollback();
}
