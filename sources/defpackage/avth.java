package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avth {
    private static final entd a = entd.c("BugleRcsCapabilities");
    private final cqoh b;
    private final avtj c;

    public avth(cqoh cqohVar, avtj avtjVar) {
        this.b = cqohVar;
        this.c = avtjVar;
    }

    public final boolean a(avmz avmzVar) {
        boolean isAfter = avmzVar.b().plus(avmzVar.c() ? this.c.b() : this.c.a()).isAfter(this.b.f());
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/validity/RcsCapabilitiesValidityChecker", "areCapabilitiesValid", 44, "RcsCapabilitiesValidityChecker.java")).H("RcsCapabilitiesValidityChecker: areCapabilitiesValid: %s for capabilities %s", isAfter, avmzVar);
        return isAfter;
    }
}
