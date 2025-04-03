package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pod {
    public final Executor a;
    public final ffhd b;
    public final Executor c;
    public final pqy d;
    public final pqj e;
    public final ksp f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final pqk l;
    public final pof m;

    public pod(pob pobVar) {
        ffhd ffhdVar = pobVar.b;
        Executor executor = pobVar.a;
        if (executor == null) {
            executor = null;
            if (ffhdVar != null) {
                ffgw ffgwVar = (ffgw) ffhdVar.get(ffgw.k);
                ffsd ffsdVar = ffgwVar instanceof ffsd ? (ffsd) ffgwVar : null;
                if (ffsdVar != null) {
                    executor = fftu.a(ffsdVar);
                }
            }
            if (executor == null) {
                executor = pog.a(false);
            }
        }
        this.a = executor;
        this.b = ffhdVar == null ? pobVar.a != null ? fftu.b(executor) : fftc.a : ffhdVar;
        Executor executor2 = pobVar.d;
        this.c = executor2 == null ? pog.a(true) : executor2;
        this.l = new pqk();
        pqy pqyVar = pobVar.c;
        this.d = pqyVar == null ? pov.a : pqyVar;
        pqj pqjVar = pobVar.e;
        this.e = pqjVar == null ? new prg() : pqjVar;
        this.h = pobVar.h;
        this.i = pobVar.i;
        this.j = pobVar.j;
        this.k = 20;
        this.f = pobVar.f;
        this.g = pobVar.g;
        this.m = new pof();
    }
}
