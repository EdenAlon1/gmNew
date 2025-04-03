package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csxh extends evlf {
    private volatile evlf a;
    private final evkn b;

    public csxh(evkn evknVar) {
        this.b = evknVar;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        String str = null;
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        evplVar.m();
        String str2 = null;
        while (evplVar.r()) {
            String h = evplVar.h();
            if (evplVar.t() == 9) {
                evplVar.p();
            } else {
                h.hashCode();
                if ("gifObjectId".equals(h)) {
                    evlf evlfVar = this.a;
                    if (evlfVar == null) {
                        evlfVar = this.b.b(String.class);
                        this.a = evlfVar;
                    }
                    str = (String) evlfVar.a(evplVar);
                } else if (ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY.equals(h)) {
                    evlf evlfVar2 = this.a;
                    if (evlfVar2 == null) {
                        evlfVar2 = this.b.b(String.class);
                        this.a = evlfVar2;
                    }
                    str2 = (String) evlfVar2.a(evplVar);
                } else {
                    evplVar.q();
                }
            }
        }
        evplVar.o();
        return new csxi(str, str2);
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        csxp csxpVar = (csxp) obj;
        if (csxpVar == null) {
            evpnVar.j();
            return;
        }
        evpnVar.f();
        evpnVar.i("gifObjectId");
        evlf evlfVar = this.a;
        if (evlfVar == null) {
            evlfVar = this.b.b(String.class);
            this.a = evlfVar;
        }
        evlfVar.b(evpnVar, csxpVar.a());
        evpnVar.i(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        evlf evlfVar2 = this.a;
        if (evlfVar2 == null) {
            evlfVar2 = this.b.b(String.class);
            this.a = evlfVar2;
        }
        evlfVar2.b(evpnVar, csxpVar.b());
        evpnVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorRegisterShareRequest)";
    }
}
