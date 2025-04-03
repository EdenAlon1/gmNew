package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmqm {
    public final akzt a;
    public final ffbr b;
    private final aajt c;
    private final asoe d;

    public cmqm(akzt akztVar, ffbr ffbrVar, aajt aajtVar, asoe asoeVar) {
        this.a = akztVar;
        this.b = ffbrVar;
        this.c = aajtVar;
        this.d = asoeVar;
    }

    public static int a(cmrv cmrvVar) {
        switch (cmrvVar.ordinal()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            default:
                throw new IllegalArgumentException("Invalid reaction type when logging: " + cmrvVar.a());
        }
    }

    public final void b(int i) {
        this.a.e("Bugle.MessageReactions.Transport.SelectionResult", i);
    }

    public final void c(cmrl cmrlVar, cmrm cmrmVar, boolean z) {
        if (d(cmrlVar, cmrmVar, z)) {
            ((akzt) this.b.b()).c("Bugle.MessageReactions.AnimationEffects.Received");
        }
    }

    public final boolean d(cmrl cmrlVar, cmrm cmrmVar, boolean z) {
        if (!this.d.a() || !z) {
            return false;
        }
        aajt aajtVar = this.c;
        cmrlVar.getClass();
        cmrmVar.getClass();
        return aajtVar.b.a() && cmrmVar == cmrm.ADD_REACTION && aajtVar.a.containsKey(cmrlVar.d);
    }
}
