package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cukm {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    private final ffbr d;
    private final ffsk e;

    public cukm(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        this.d = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.c = ffbrVar4;
        this.e = ffskVar;
    }

    public final void a(cujo cujoVar, cukn cuknVar, cukx cukxVar) {
        cujoVar.getClass();
        cukxVar.getClass();
        ekzz f = eleg.f("ReinforcedSpamProtectionEntrypoint.reinforceSpamClassifications");
        try {
            for (cukk cukkVar : (Set) this.d.b()) {
                if (cukkVar.a() != cukxVar) {
                    cujo cujoVar2 = cujoVar;
                    cukn cuknVar2 = cuknVar;
                    axol.k(this.e, null, new cukl(this, cujoVar2, cukkVar, cuknVar2, null), 3);
                    cujoVar = cujoVar2;
                    cuknVar = cuknVar2;
                }
            }
            ffig.a(f, null);
        } finally {
        }
    }
}
