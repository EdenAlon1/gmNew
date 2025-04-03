package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abco implements abcf {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl");
    public final auqt b;
    private final fgcq c;
    private final ffxx d;
    private final ffxx e;
    private final ffxx f;
    private final aspz g;
    private final auql h;

    public abco(fgcq fgcqVar, ffxx ffxxVar, ffxx ffxxVar2, ffxx ffxxVar3, aspz aspzVar, auqt auqtVar, auql auqlVar) {
        fgcqVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        this.c = fgcqVar;
        this.d = ffxxVar;
        this.e = ffxxVar2;
        this.f = ffxxVar3;
        this.g = aspzVar;
        this.b = auqtVar;
        this.h = auqlVar;
    }

    public static final boolean d(alxi alxiVar) {
        return alxiVar == alxi.ONE_ON_ONE || alxiVar == alxi.GROUP;
    }

    public static final boolean e(alxr alxrVar, aqux aquxVar) {
        if (aquxVar == null) {
            return false;
        }
        alya d = alxrVar.d();
        aqux aquxVar2 = null;
        alyn alynVar = d instanceof alyn ? (alyn) d : null;
        if (alynVar != null) {
            aquxVar2 = alynVar.c();
        } else {
            alya d2 = alxrVar.d();
            alxp alxpVar = d2 instanceof alxp ? (alxp) d2 : null;
            if (alxpVar != null) {
                aquxVar2 = alxpVar.b();
            }
        }
        return aquxVar2 != null && aquxVar2.w(aquxVar.g());
    }

    public static final boolean f(alxr alxrVar) {
        String c;
        appj g = alxrVar.g();
        if ((g instanceof appo) && (c = ((appo) g).c()) != null && c.length() > 0) {
            return true;
        }
        if (g instanceof appw) {
            appw appwVar = (appw) g;
            if (appwVar.c() != null) {
                String c2 = appwVar.c();
                c2.getClass();
                return c2.length() > 0;
            }
        }
        return false;
    }

    private final ffxx g(alxr alxrVar, boolean z, boolean z2, boolean z3) {
        return ((ersq) ((aupo) this.h).a.b()).a("bugle.do_not_allow_reactions_for_short_codes") ? fgck.b(this.d, new abci(this.c), this.e, this.f, new abcm(alxrVar, z3, this, z, z2, null)) : fgck.a(this.d, new abcl(this.c), this.f, new abcn(alxrVar, z3, this, z, z2, null));
    }

    @Override // defpackage.abcf
    public final ffxx a(alxr alxrVar, boolean z) {
        alxrVar.getClass();
        return g(alxrVar, z, true, true);
    }

    @Override // defpackage.abcf
    public final ffxx b(alxr alxrVar) {
        alxrVar.getClass();
        return g(alxrVar, false, false, false);
    }

    @Override // defpackage.abcf
    public final boolean c(alxr alxrVar, alxi alxiVar) {
        alxrVar.getClass();
        if (alxrVar.B() == 3 && alxrVar.a() == alxq.b && d(alxiVar)) {
            return (this.g.a() && (alxrVar instanceof aaca)) ? false : true;
        }
        return false;
    }
}
