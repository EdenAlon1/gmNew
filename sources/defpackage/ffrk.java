package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffrk extends ffrt {
    public final ffqk a;

    public ffrk(ffgu ffguVar, Throwable th, boolean z) {
        super(th == null ? new CancellationException(a.i(ffguVar, "Continuation ", " was cancelled normally")) : th, z);
        this.a = new ffqk(false, ffqo.a);
    }
}
