package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpqo {
    public static final entd a = entd.c("BugleTachygram");
    public final chpz b;
    public final errl c;
    public final chfz d;
    public final Optional e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    private final csiy i;

    public cpqo(chpz chpzVar, errl errlVar, chfz chfzVar, Optional optional, csiy csiyVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.c = errlVar;
        this.b = chpzVar;
        this.d = chfzVar;
        this.e = optional;
        this.i = csiyVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
    }

    public static boolean a(chod chodVar) {
        fcee fceeVar = chodVar.m;
        if (fceeVar == null) {
            fceeVar = fcee.b;
        }
        return new eygk(fceeVar.c, fcee.a).contains(fgtb.TACHYGRAM);
    }

    public final elfl b(String str) {
        elfl a2;
        if (this.e.isEmpty()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "bindOrPullIfTachygramIsActive", 204, "TachygramLifecycleManager.java")).q("Tachygram is active but no tachyon receiver manager provided");
            return elfo.e(null);
        }
        boolean z = this.i.a;
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "bindOrPullIfTachygramIsActive", 209, "TachygramLifecycleManager.java")).t("Tachygram is newly active. Starting %s", true != z ? "pull" : "bind");
        if (z) {
            a2 = ((cilk) this.e.get()).e(str);
        } else {
            cilk cilkVar = (cilk) this.e.get();
            fcej fcejVar = (fcej) fcek.a.createBuilder();
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).d = "RCS";
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).c = str;
            a2 = cilkVar.a((fcek) fcejVar.build());
        }
        return a2.e(fedn.class, new emwl() { // from class: cpqg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) ((ensz) cpqo.a.j()).g((fedn) obj)).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "bindOrPullIfTachygramIsActive", 223, "TachygramLifecycleManager.java")).q("Failed to fetch messages during Tachygram setup");
                return null;
            }
        }, this.c);
    }
}
