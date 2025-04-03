package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cupd {
    public static final cskc a = cskc.g("Bugle", "MoiraiApiInitializationManager");
    public static final cfup b = cfvl.i(cfvl.b, "record_moirai_initialization_memory", false);
    public static final Object c = new Object();
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr i;
    public final errl l;
    private ejlc m;
    public boolean g = false;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public int j = 0;
    public long k = 0;

    public cupd(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, errl errlVar) {
        this.d = ffbrVar;
        this.f = ffbrVar4;
        this.i = ffbrVar2;
        this.e = ffbrVar3;
        this.l = errlVar;
    }

    public final elfl a() {
        synchronized (c) {
            if (this.g) {
                return elfo.e(null);
            }
            if (this.m == null) {
                this.m = new ejlc(new erog() { // from class: cupb
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        ekzz f = eleg.f("MoiraiApiInitializationManager#createInitializationResultFuture");
                        cupd cupdVar = cupd.this;
                        try {
                            final cupl cuplVar = (cupl) cupdVar.d.b();
                            elfl h = elfl.g(((dkzo) cuplVar.a.b()).b()).h(new emwl() { // from class: cupk
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    cupl.this.c = (dkzr) obj;
                                    return null;
                                }
                            }, cuplVar.b);
                            f.b(h);
                            elfr.l(h, new cupc(cupdVar), cupdVar.l);
                            f.close();
                            return h;
                        } catch (Throwable th) {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, this.l);
            }
            if (this.m.e()) {
                return elfl.g(this.m.c());
            }
            if (this.j >= ((Integer) cupj.c.e()).intValue()) {
                a.r("Retry limit to initialize MoiraiApi reached.");
                return elfo.d(new IllegalStateException("Retry limit to initialize MoiraiApi reached."));
            }
            if (((cqoh) this.i.b()).f().toEpochMilli() < this.k) {
                a.r("The allowed time for initializing MoiraiApi wasn't reached.");
                return elfo.d(new IllegalStateException("The allowed time for initializing MoiraiApi wasn't reached."));
            }
            this.j++;
            ekzz f = eleg.f("MoiraiApiInitializationManager#getInitializationResultFuture");
            try {
                elfl g = elfl.g(this.m.c());
                f.b(g);
                f.close();
                return g;
            } finally {
            }
        }
    }
}
