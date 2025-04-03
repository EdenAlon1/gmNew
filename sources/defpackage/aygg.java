package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aygg extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ aygh c;
    final /* synthetic */ eokw d;
    final /* synthetic */ ConversationIdType e;
    final /* synthetic */ eoko f;
    final /* synthetic */ byyt g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aygg(aygh ayghVar, eokw eokwVar, ConversationIdType conversationIdType, eoko eokoVar, byyt byytVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ayghVar;
        this.d = eokwVar;
        this.e = conversationIdType;
        this.f = eokoVar;
        this.g = byytVar;
        this.h = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aygg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            if (!((alwa) this.c.f.b()).b()) {
                ((alwa) this.c.f.b()).a();
                return ffcu.a;
            }
            eokv eokvVar = (eokv) this.d.toBuilder();
            long b = ((akvz) this.c.d.b()).b(this.e);
            eokvVar.copyOnWrite();
            eokw eokwVar = (eokw) eokvVar.instance;
            eokwVar.b |= 65536;
            eokwVar.r = b;
            eokvVar.copyOnWrite();
            eokw eokwVar2 = (eokw) eokvVar.instance;
            eokwVar2.e = 3;
            eokwVar2.b |= 1;
            eoko eokoVar = this.f;
            eokvVar.copyOnWrite();
            eokw eokwVar3 = (eokw) eokvVar.instance;
            eokwVar3.f = eokoVar.u;
            eokwVar3.b |= 2;
            int i = byyt.i(this.g);
            eokvVar.copyOnWrite();
            eokw eokwVar4 = (eokw) eokvVar.instance;
            eokwVar4.C = epuz.a(i);
            eokwVar4.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            boolean z = this.h;
            eokvVar.copyOnWrite();
            eokw eokwVar5 = (eokw) eokvVar.instance;
            eokwVar5.b |= 32;
            eokwVar5.i = z;
            if (((Optional) this.c.e.b()).isPresent()) {
                elfl a = ((aexv) ((Optional) this.c.e.b()).get()).a(eokvVar, this.e);
                a.getClass();
                this.a = eokvVar;
                this.b = 1;
                if (fgfz.c(a, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            obj2 = eokvVar;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_CONVERSATION;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eokw eokwVar6 = (eokw) ((eyfq) obj2).build();
        eokwVar6.getClass();
        eolvVar2.m = eokwVar6;
        eolvVar2.b |= 8;
        enrr enrrVar = (enrr) aygh.a.h();
        enrrVar.Y(new ensn("ConversationOrigin", eoko.class, false, false), this.f);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/conversation/deleter/DeleteConversationEventLogger$logConversationDeleted$1", "invokeSuspend", 79, "DeleteConversationEventLogger.kt")).q("ConversationDeleted");
        ((akyb) this.c.c.b()).a().j(eoluVar, alal.LOG_SPEC_DELETE_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aygg(this.c, this.d, this.e, this.f, this.g, this.h, ffguVar);
    }
}
