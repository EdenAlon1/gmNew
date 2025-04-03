package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddkf implements wgl {
    private final ea a;
    private final cnla b;
    private final cqoh c;
    private final ctml d;
    private final ddle e;
    private final ddlv f;

    public ddkf(ea eaVar, cnla cnlaVar, cqoh cqohVar, ctml ctmlVar, ddle ddleVar, ddlv ddlvVar) {
        this.a = eaVar;
        this.b = cnlaVar;
        this.c = cqohVar;
        this.d = ctmlVar;
        this.e = ddleVar;
        this.f = ddlvVar;
    }

    @Override // defpackage.wgl
    public final elfl a(SuggestionData suggestionData, wgi wgiVar) {
        if (this.d.k() && ddjr.b()) {
            if (((Boolean) ddjr.l.e()).booleanValue()) {
                return this.b.s(suggestionData.x(), wgiVar.b().e, 8).h(new emwl() { // from class: ddke
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Long l = (Long) obj;
                        wgm createBuilder = wgp.a.createBuilder();
                        if (l != null && l.longValue() > 0) {
                            wgn wgnVar = (wgn) wgo.a.createBuilder();
                            long longValue = l.longValue();
                            wgnVar.copyOnWrite();
                            wgo wgoVar = (wgo) wgnVar.instance;
                            wgoVar.b |= 1;
                            wgoVar.c = longValue;
                            wgo wgoVar2 = (wgo) wgnVar.build();
                            createBuilder.copyOnWrite();
                            wgp wgpVar = (wgp) createBuilder.instance;
                            wgoVar2.getClass();
                            wgpVar.c = wgoVar2;
                            wgpVar.b = 1;
                        }
                        return createBuilder.build();
                    }
                }, erpp.a);
            }
            ddln createBuilder = ddlo.a.createBuilder();
            String b = suggestionData.x().b();
            createBuilder.copyOnWrite();
            ddlo ddloVar = (ddlo) createBuilder.instance;
            b.getClass();
            ddloVar.b |= 2;
            ddloVar.d = b;
            String a = wgiVar.b().e.a();
            createBuilder.copyOnWrite();
            ddlo ddloVar2 = (ddlo) createBuilder.instance;
            a.getClass();
            ddloVar2.b |= 4;
            ddloVar2.e = a;
            long epochMilli = this.c.f().toEpochMilli();
            createBuilder.copyOnWrite();
            ddlo ddloVar3 = (ddlo) createBuilder.instance;
            ddloVar3.b |= 16;
            ddloVar3.g = epochMilli;
            createBuilder.copyOnWrite();
            ddlo ddloVar4 = (ddlo) createBuilder.instance;
            ddloVar4.b |= 8;
            ddloVar4.f = false;
            createBuilder.copyOnWrite();
            ddlo ddloVar5 = (ddlo) createBuilder.instance;
            ddloVar5.h = 7;
            ddloVar5.b |= 32;
            this.e.a(createBuilder.build());
        }
        return elfo.e(wgp.a);
    }

    @Override // defpackage.wgl
    public final void b(ConversationIdType conversationIdType, SuggestionData suggestionData, eyjv eyjvVar) {
        if (((Boolean) ddjr.l.e()).booleanValue()) {
            wgp wgpVar = (wgp) eyjvVar.a(wgp.a, eyfc.a());
            if (wgpVar.b == 1) {
                ddln createBuilder = ddlo.a.createBuilder();
                String a = conversationIdType.a();
                createBuilder.copyOnWrite();
                ddlo ddloVar = (ddlo) createBuilder.instance;
                a.getClass();
                ddloVar.b |= 4;
                ddloVar.e = a;
                String b = suggestionData.x().b();
                createBuilder.copyOnWrite();
                ddlo ddloVar2 = (ddlo) createBuilder.instance;
                b.getClass();
                ddloVar2.b |= 2;
                ddloVar2.d = b;
                long j = (wgpVar.b == 1 ? (wgo) wgpVar.c : wgo.a).c;
                createBuilder.copyOnWrite();
                ddlo ddloVar3 = (ddlo) createBuilder.instance;
                ddloVar3.b = 1 | ddloVar3.b;
                ddloVar3.c = j;
                createBuilder.copyOnWrite();
                ddlo ddloVar4 = (ddlo) createBuilder.instance;
                ddloVar4.b |= 8;
                ddloVar4.f = false;
                ellj.f(this.f.a(createBuilder.build()), this.a);
            }
        }
    }
}
