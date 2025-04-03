package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ekwf implements elat {
    private final elat a;
    private final UUID b;
    private final String c;
    private Thread d;
    private eleb e;

    public ekwf(String str, elat elatVar, elao elaoVar) {
        str.getClass();
        this.c = str;
        this.a = elatVar;
        this.b = elatVar.e();
        eleb elebVar = elaoVar.e;
        if (elebVar == null) {
            this.e = null;
            this.d = Thread.currentThread();
        } else {
            this.e = elebVar;
            this.d = null;
        }
    }

    @Override // defpackage.elat
    public final elat a() {
        return this.a;
    }

    @Override // defpackage.elat
    public final eleb b() {
        return this.e;
    }

    @Override // defpackage.elat
    public final String c() {
        return this.c;
    }

    @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ekyf.p(this);
        this.d = null;
        this.e = null;
    }

    @Override // defpackage.elat
    public final Thread d() {
        return this.d;
    }

    @Override // defpackage.elat
    public final UUID e() {
        return this.b;
    }

    public final String toString() {
        return ekyf.o(this);
    }

    public ekwf(String str, UUID uuid, elao elaoVar) {
        this.c = str;
        Thread thread = null;
        this.a = null;
        this.b = uuid;
        eleb elebVar = elaoVar.e;
        if (elebVar == null) {
            this.e = null;
            thread = Thread.currentThread();
        } else {
            this.e = elebVar;
        }
        this.d = thread;
    }
}
