package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccp {
    public final Executor a;
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final cbd c;

    public ccp(cbd cbdVar, Executor executor) {
        this.c = cbdVar;
        this.a = executor;
    }
}
