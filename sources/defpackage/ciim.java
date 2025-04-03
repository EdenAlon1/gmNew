package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class ciim {
    public static void a(ciin ciinVar) {
        csjy.j("BugleNetwork", "Executing RPC: className=%s requestId=%s", ciinVar.f(), ciinVar.g());
    }

    public static void b(ciin ciinVar) {
        csjy.j("BugleNetwork", "Received result for RPC: className=%s requestId=%s, responseId=%d", ciinVar.f(), ciinVar.g(), Long.valueOf(ciinVar.a()));
    }

    public static void c(ciin ciinVar) {
        csjy.o("BugleNetwork", "Failed to make RPC call: className=%s requestId=%s, responseId=%d", ciinVar.f(), ciinVar.g(), Long.valueOf(ciinVar.a()));
    }
}
