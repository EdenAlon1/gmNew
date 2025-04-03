package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awqv extends ceut {
    private static final cskc a = cskc.g("BugleDataModel", "RevokeChatMessageResponseHandler");
    private final cfyt b;
    private final baod c;

    public awqv(baod baodVar, cfyt cfytVar) {
        this.c = baodVar;
        this.b = cfytVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RevokeChatMessageResponseHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return awyt.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        try {
            bdhg a2 = bdhg.a(((awyv) eyfy.parseFrom(awyv.a, ((awyt) eyhsVar).d, eyfc.a())).c);
            if (!a2.f().isEmpty()) {
                return this.c.b(a2).q().h(new emwl() { // from class: awqu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ceyt.i();
                    }
                }, erpp.a);
            }
            a.r("RevokeChatMessageResponse.opaque_data contained empty messageId");
            return elfo.e(ceyt.k());
        } catch (eygu e) {
            a.s("Unable to decode RevokeChatMessageResponse.opaque_data", e);
            return this.b.b(e).h(new emwl() { // from class: awqt
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ceyt.k();
                }
            }, erpp.a);
        }
    }
}
