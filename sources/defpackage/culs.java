package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culs {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/common/SpamErrorHandler");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;
    private final ffsk f;

    public culs(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.e = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.f = ffskVar;
    }

    public final eres a(Throwable th) {
        if (!(th instanceof fedn)) {
            return eres.UNEXPECTED_ERROR_TYPE;
        }
        eres apply = new culi().apply(((fedn) th).a.getCode());
        apply.getClass();
        return apply;
    }

    public final void b(culf culfVar, Throwable th, cukx cukxVar, erdy erdyVar, int i) {
        cukxVar.getClass();
        erdyVar.getClass();
        boolean z = th instanceof fedn;
        eres a2 = a(th);
        if (z) {
            ensk h = a.h();
            h.Y(ente.a, "BugleSpam");
            ((enrr) ((enrr) h).g(th).h("com/google/android/apps/messaging/shared/util/spam/common/SpamErrorHandler", "handleClassificationError", 73, "SpamErrorHandler.kt")).q("SpamErrorHandler#handleClassificationError: failed to classify spam");
        } else {
            ensk j = a.j();
            j.Y(ente.a, "BugleSpam");
            ((enrr) ((enrr) j).g(th).h("com/google/android/apps/messaging/shared/util/spam/common/SpamErrorHandler", "handleClassificationError", 78, "SpamErrorHandler.kt")).q("SpamErrorHandler#handleClassificationError: failed to classify spam");
        }
        c(th, a2);
        axol.k(this.f, null, new culr(this, culfVar, cukxVar, erdyVar, i, a2, null), 3);
    }

    public final void c(Throwable th, eres eresVar) {
        if (eresVar == eres.UNEXPECTED_ERROR_TYPE) {
            axnw.h(((cfyt) this.e.b()).b(th));
        }
    }
}
