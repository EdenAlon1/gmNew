package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzzi {
    public final ffbr a;
    private final ffbr b;
    private final avkk c;
    private final atug d;

    public bzzi(ffbr ffbrVar, avkk avkkVar, ffbr ffbrVar2, atug atugVar) {
        this.b = ffbrVar;
        this.c = avkkVar;
        this.a = ffbrVar2;
        this.d = atugVar;
    }

    final void a(eozj eozjVar, int i) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_E2EE_IDENTITY_VERIFICATION_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eozh eozhVar = (eozh) eozk.a.createBuilder();
        eozhVar.copyOnWrite();
        eozk eozkVar = (eozk) eozhVar.instance;
        eozkVar.d = eozjVar.i;
        eozkVar.b |= 2;
        eozhVar.copyOnWrite();
        eozk eozkVar2 = (eozk) eozhVar.instance;
        eozkVar2.b |= 4;
        eozkVar2.e = i;
        eozk eozkVar3 = (eozk) eozhVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eozkVar3.getClass();
        eolvVar2.bb = eozkVar3;
        eolvVar2.e |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        ((akxl) this.a.b()).j(eoluVar);
    }

    final void b(eozn eoznVar, int i, String str) {
        eozl eozlVar = (eozl) eozq.a.createBuilder();
        eozlVar.copyOnWrite();
        eozq eozqVar = (eozq) eozlVar.instance;
        eozqVar.c = eoznVar.m;
        eozqVar.b |= 1;
        eozlVar.copyOnWrite();
        eozq eozqVar2 = (eozq) eozlVar.instance;
        eozqVar2.b |= 4;
        eozqVar2.g = i;
        if (str != null) {
            eozlVar.copyOnWrite();
            eozq eozqVar3 = (eozq) eozlVar.instance;
            eozqVar3.b |= 8;
            eozqVar3.h = str;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_E2EE_LOOKUP_REGISTERED;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eozq eozqVar4 = (eozq) eozlVar.build();
        eozqVar4.getClass();
        eolvVar2.W = eozqVar4;
        eolvVar2.c |= 1048576;
        ((akxl) this.a.b()).j(eoluVar);
    }

    public final void c(bdhg bdhgVar, int i) {
        f(bdhgVar, bdhg.a, 4, 24, i);
    }

    public final void d(bdhg bdhgVar, bdhg bdhgVar2, int i) {
        f(bdhgVar, bdhgVar2, 4, 24, i);
    }

    final void e(bdhg bdhgVar, int i) {
        f(bdhgVar, bdhg.a, 4, 26, i);
    }

    public final void f(bdhg bdhgVar, bdhg bdhgVar2, int i, int i2, int i3) {
        eowr eowrVar = (eowr) eowt.a.createBuilder();
        int d = ((altk) this.b.b()).d();
        eowrVar.copyOnWrite();
        eowt eowtVar = (eowt) eowrVar.instance;
        eowtVar.b |= 1;
        eowtVar.c = d;
        eowt eowtVar2 = (eowt) eowrVar.build();
        final eoop eoopVar = (eoop) eopq.a.createBuilder();
        eqyl a = this.c.a();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.aa = a.h;
        eopqVar.c |= 2097152;
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.g = i - 1;
        eopqVar2.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.h = i2 - 1;
        eopqVar3.b |= 2;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eowtVar2.getClass();
        eopqVar4.y = eowtVar2;
        eopqVar4.b |= 4194304;
        eovw eovwVar = csjc.a;
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.N = eovwVar.x;
        eopqVar5.c |= 512;
        if (!((ersq) ((atty) this.d).a.b()).a("bugle.skip_pcscf_in_etouffee_log")) {
            String k = ((altk) this.b.b()).k(Optional.empty());
            eoopVar.copyOnWrite();
            eopq eopqVar6 = (eopq) eoopVar.instance;
            k.getClass();
            eopqVar6.c |= 1;
            eopqVar6.J = k;
        }
        if (i3 != 1) {
            eoopVar.copyOnWrite();
            eopq eopqVar7 = (eopq) eoopVar.instance;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            eopqVar7.ai = i4;
            eopqVar7.c |= 536870912;
        }
        bdhgVar.g(new Consumer() { // from class: bzzg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                String f = ((bdhg) obj).f();
                eoop eoopVar2 = eoop.this;
                eoopVar2.copyOnWrite();
                eopq eopqVar8 = (eopq) eoopVar2.instance;
                eopq eopqVar9 = eopq.a;
                eopqVar8.b |= Integer.MIN_VALUE;
                eopqVar8.H = f;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        bdhgVar2.g(new Consumer() { // from class: bzzh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                String f = ((bdhg) obj).f();
                eoop eoopVar2 = eoop.this;
                eoopVar2.copyOnWrite();
                eopq eopqVar8 = (eopq) eoopVar2.instance;
                eopq eopqVar9 = eopq.a;
                eopqVar8.c |= 32768;
                eopqVar8.T = f;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopq eopqVar8 = (eopq) eoopVar.build();
        eopqVar8.getClass();
        eolvVar2.l = eopqVar8;
        eolvVar2.b |= 4;
        ((akxl) this.a.b()).j(eoluVar);
    }

    public final void g(ConversationIdType conversationIdType, bdhg bdhgVar) {
        eqnl eqnlVar = (eqnl) eqnn.a.createBuilder();
        String conversationIdType2 = conversationIdType.toString();
        eqnlVar.copyOnWrite();
        eqnn eqnnVar = (eqnn) eqnlVar.instance;
        conversationIdType2.getClass();
        eqnnVar.b |= 1;
        eqnnVar.c = conversationIdType2;
        eqnlVar.copyOnWrite();
        eqnn eqnnVar2 = (eqnn) eqnlVar.instance;
        eqnnVar2.e = 1;
        eqnnVar2.b |= 4;
        String str = bdhgVar.b;
        if (str != null) {
            eqnlVar.copyOnWrite();
            eqnn eqnnVar3 = (eqnn) eqnlVar.instance;
            eqnnVar3.b |= 2;
            eqnnVar3.d = str;
        }
        akxl akxlVar = (akxl) this.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.CONVERSATION_E2EE_STATUS_UPDATE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqnn eqnnVar4 = (eqnn) eqnlVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqnnVar4.getClass();
        eolvVar2.bw = eqnnVar4;
        eolvVar2.f |= 536870912;
        akxlVar.j(eoluVar);
    }
}
