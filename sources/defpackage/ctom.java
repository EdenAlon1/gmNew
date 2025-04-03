package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.MonthDay;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctom extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ fbxd c;
    final /* synthetic */ ctoo d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctom(ffgu ffguVar, ConversationIdType conversationIdType, fbxd fbxdVar, ctoo ctooVar) {
        super(2, ffguVar);
        this.b = conversationIdType;
        this.c = fbxdVar;
        this.d = ctooVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctom) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        MessageCoreData p;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            engw e = bdrr.e(this.b);
            if (((Boolean) ((cfup) ddnm.a.get()).e()).booleanValue()) {
                enqv it = e.iterator();
                it.getClass();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (bdrr.r((ParticipantsTable.BindData) it.next())) {
                        z = true;
                        break;
                    }
                }
                fbxd fbxdVar = this.c;
                fbxdVar.copyOnWrite();
                fbxe fbxeVar = (fbxe) fbxdVar.instance;
                fbxe fbxeVar2 = fbxe.a;
                fbxeVar.c = z;
            }
            if (!((Boolean) ((cfup) stl.b.get()).e()).booleanValue() || ((enou) e).c != 1) {
                return this.c.build();
            }
            airu airuVar = (airu) this.d.c.b();
            ConversationIdType conversationIdType = this.b;
            this.a = 1;
            obj = ((bczm) airuVar.b.b()).b(conversationIdType, axcl.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        engw engwVar = (engw) obj;
        if (engwVar.size() != 1) {
            return this.c.build();
        }
        String n = ((brae) engwVar.get(0)).n();
        if (n == null || n.length() == 0) {
            return this.c.build();
        }
        Object b = this.d.a.b();
        b.getClass();
        cqoh cqohVar = (cqoh) b;
        MonthDay parse = MonthDay.parse(n);
        ZonedDateTime truncatedTo = LocalDateTime.of(cqohVar.g().getYear(), parse.getMonth(), parse.getDayOfMonth(), 0, 0, 0).q(ZoneId.systemDefault()).truncatedTo(ChronoUnit.DAYS);
        ZonedDateTime plusYears = truncatedTo.plusYears(1L);
        Instant instant = truncatedTo.toInstant();
        if (instant.isBefore(sth.b(cqohVar))) {
            instant = plusYears.toInstant();
            instant.getClass();
        } else {
            instant.getClass();
        }
        Object b2 = this.d.a.b();
        b2.getClass();
        if (ffkj.e(instant, sth.b((cqoh) b2)) && (p = ((bdmq) this.d.b.b()).p(this.b)) != null) {
            ctoo ctooVar = this.d;
            long r = p.r();
            Object b3 = ctooVar.a.b();
            b3.getClass();
            if (r >= sth.a((cqoh) b3)) {
                return this.c.build();
            }
        }
        fbxd fbxdVar2 = this.c;
        long epochMilli = instant.toEpochMilli();
        fbxdVar2.copyOnWrite();
        fbxe fbxeVar3 = (fbxe) fbxdVar2.instance;
        fbxe fbxeVar4 = fbxe.a;
        fbxeVar3.b = epochMilli;
        return this.c.build();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctom ctomVar = new ctom(ffguVar, this.b, this.c, this.d);
        ctomVar.e = obj;
        return ctomVar;
    }
}
