package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cktw {
    public final ffbr a;
    private final akyb b;

    public cktw(akyb akybVar, ffbr ffbrVar) {
        akybVar.getClass();
        ffbrVar.getClass();
        this.b = akybVar;
        this.a = ffbrVar;
    }

    public final void a(eqbp eqbpVar) {
        akxn a = this.b.a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.MMS_GROUP_UPGRADE_EVENT, eoluVar);
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.co = eqbpVar;
        eolvVar.h |= 131072;
        a.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_MMS_GROUP_UPGRADE_EVENTS);
    }

    public final void b(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        eqbb eqbbVar = (eqbb) eqbp.b.createBuilder();
        eqbbVar.getClass();
        equi.b(((akvz) this.a.b()).b(conversationIdType), eqbbVar);
        equi.c(3, eqbbVar);
        equi.e(3, eqbbVar);
        equi.d(3, eqbbVar);
        a(equi.a(eqbbVar));
    }

    public final void c(ConversationIdType conversationIdType, int i, int i2, int i3) {
        eqbb eqbbVar = (eqbb) eqbp.b.createBuilder();
        eqbbVar.getClass();
        equi.b(((akvz) this.a.b()).b(conversationIdType), eqbbVar);
        equi.c(8, eqbbVar);
        equi.g(eqbbVar);
        eqbbVar.copyOnWrite();
        eqbp eqbpVar = (eqbp) eqbbVar.instance;
        eqbpVar.n = i - 1;
        eqbpVar.c |= 256;
        eqbd eqbdVar = (eqbd) eqbe.a.createBuilder();
        eqbdVar.getClass();
        int a = cptn.a(i2);
        eqbdVar.copyOnWrite();
        eqbe eqbeVar = (eqbe) eqbdVar.instance;
        eqbeVar.c = a - 1;
        eqbeVar.b |= 1;
        int a2 = cptn.a(i2 - i3);
        eqbdVar.copyOnWrite();
        eqbe eqbeVar2 = (eqbe) eqbdVar.instance;
        eqbeVar2.d = a2 - 1;
        eqbeVar2.b |= 4;
        eyfy build = eqbdVar.build();
        build.getClass();
        eqbbVar.copyOnWrite();
        eqbp eqbpVar2 = (eqbp) eqbbVar.instance;
        eqbpVar2.m = (eqbe) build;
        eqbpVar2.c |= 128;
        a(equi.a(eqbbVar));
    }
}
