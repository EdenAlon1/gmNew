package androidx.work;

import defpackage.ffhd;
import defpackage.pot;
import defpackage.ppc;
import defpackage.pqy;
import defpackage.pre;
import defpackage.qbc;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID a;
    public final pot b;
    public final Set c;
    public final pre d;
    public final int e;
    public final Executor f;
    public final ffhd g;
    public final pqy h;
    public final ppc i;
    public final qbc j;

    public WorkerParameters(UUID uuid, pot potVar, Collection collection, pre preVar, int i, Executor executor, ffhd ffhdVar, qbc qbcVar, pqy pqyVar, ppc ppcVar) {
        this.a = uuid;
        this.b = potVar;
        this.c = new HashSet(collection);
        this.d = preVar;
        this.e = i;
        this.f = executor;
        this.g = ffhdVar;
        this.j = qbcVar;
        this.h = pqyVar;
        this.i = ppcVar;
    }
}
