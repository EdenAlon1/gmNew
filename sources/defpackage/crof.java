package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crof extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ crog c;
    final /* synthetic */ eokw d;
    final /* synthetic */ ConversationIdType e;
    final /* synthetic */ eoko f;
    final /* synthetic */ byyt g;
    final /* synthetic */ byyt h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crof(crog crogVar, eokw eokwVar, ConversationIdType conversationIdType, eoko eokoVar, byyt byytVar, byyt byytVar2, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = crogVar;
        this.d = eokwVar;
        this.e = conversationIdType;
        this.f = eokoVar;
        this.g = byytVar;
        this.h = byytVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crof) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            if (!((alwa) this.c.e.b()).b()) {
                ((alwa) this.c.e.b()).a();
                return ffcu.a;
            }
            eokv eokvVar = (eokv) this.d.toBuilder();
            long b = ((akvz) this.c.c.b()).b(this.e);
            eokvVar.copyOnWrite();
            eokw eokwVar = (eokw) eokvVar.instance;
            eokwVar.b |= 65536;
            eokwVar.r = b;
            eokvVar.copyOnWrite();
            eokw eokwVar2 = (eokw) eokvVar.instance;
            eokwVar2.e = 2;
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
            int i2 = byyt.i(this.h);
            eokvVar.copyOnWrite();
            eokw eokwVar5 = (eokw) eokvVar.instance;
            eokwVar5.D = epuz.a(i2);
            eokwVar5.b |= 536870912;
            if (((Optional) this.c.d.b()).isPresent()) {
                elfl a = ((aexv) ((Optional) this.c.d.b()).get()).a(eokvVar, this.e);
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
        enrr enrrVar = (enrr) crog.a.h();
        enrrVar.Y(new ensn("ConversationOrigin", eoko.class, false, false), this.f);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/archive/ArchiveEventLogger$logConversationArchived$1", "invokeSuspend", 78, "ArchiveEventLogger.kt")).q("ConversationArchived");
        ((akyb) this.c.b.b()).a().j(eoluVar, alal.LOG_SPEC_ARCHIVE_STATUS_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new crof(this.c, this.d, this.e, this.f, this.g, this.h, ffguVar);
    }
}
