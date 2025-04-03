package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alns {
    public final almw a;
    public final akvy b;
    public final csjk c;
    public final Executor d;
    public final errl e;
    public final ffbr f;
    public final ffbr g;
    public final errl h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;

    public alns(almw almwVar, akvy akvyVar, csjk csjkVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = almwVar;
        this.b = akvyVar;
        this.c = csjkVar;
        this.d = new ersb(errlVar);
        this.e = errlVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = errlVar2;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
    }

    public final elfl a(Callable callable) {
        return elfo.g(callable, this.d);
    }
}
