package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxjf extends dtrr {
    public long a;
    public Optional b;
    public akdb c;
    public akci d;
    public Instant e;
    public Instant f;
    public akcd g;
    public long h;
    public Instant i;
    public Instant j;
    public akcz k;

    public bxjf() {
        super(bxle.e());
        this.b = bdhj.a;
        this.c = akdb.b(0);
        this.d = akci.b(0);
        this.e = Instant.EPOCH;
        this.f = Instant.EPOCH;
        this.i = Instant.EPOCH;
        this.j = Instant.EPOCH;
    }

    public final bxjb a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bxjb bxjbVar = (bxjb) obj;
        bxjbVar.aC(aB());
        bxjbVar.a = this.a;
        bxjbVar.b = this.b;
        bxjbVar.c = this.c;
        bxjbVar.d = this.d;
        bxjbVar.e = this.e;
        bxjbVar.f = this.f;
        bxjbVar.g = this.g;
        bxjbVar.h = this.h;
        bxjbVar.i = this.i;
        bxjbVar.j = this.j;
        bxjbVar.k = this.k;
        bxjbVar.cK = aC();
        return bxjbVar;
    }

    public final void b(akcz akczVar) {
        int i = this.aB;
        if (i < 60730) {
            dtub.w("config", i);
        }
        aE(10);
        this.k = akczVar;
    }

    public final void c(akdb akdbVar) {
        aE(2);
        this.c = akdbVar;
    }

    public final void d(long j) {
        int i = this.aB;
        if (i < 60110) {
            dtub.w("initial_messages_version", i);
        }
        aE(7);
        this.h = j;
    }

    public final void e(Optional optional) {
        aE(1);
        this.b = optional;
    }

    public final void f(Instant instant) {
        aE(4);
        this.e = instant;
    }

    public final void g(akci akciVar) {
        aE(3);
        this.d = akciVar;
    }

    public final void h(Instant instant) {
        int i = this.aB;
        if (i < 60220) {
            dtub.w("status_timestamp", i);
        }
        aE(8);
        this.i = instant;
    }
}
