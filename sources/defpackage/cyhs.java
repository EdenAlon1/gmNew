package defpackage;

import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.ZoneId;
import j$.util.Objects;
import j$.util.Optional;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyhs implements cyhn {
    public static final cskc a = cskc.g("Bugle", "RemindersBannerDataService");
    public final cnla b;
    public final ejvp c;
    public final cqoh d;
    public final errl e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ddlw i;
    private final ejvb j;
    private ConversationIdType k = bdgq.a;
    private final ddjv l;
    private cyhq m;

    public cyhs(Optional optional, Optional optional2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ddlw ddlwVar, ejvp ejvpVar, ejvb ejvbVar, cqoh cqohVar, errl errlVar) {
        this.b = (cnla) optional.get();
        this.l = (ddjv) optional2.get();
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ddlwVar;
        this.c = ejvpVar;
        this.j = ejvbVar;
        this.d = cqohVar;
        this.e = errlVar;
    }

    @Override // defpackage.cyhn
    public final ejuh a(final ConversationIdType conversationIdType) {
        if (!Objects.equals(this.k, conversationIdType)) {
            cyhq cyhqVar = this.m;
            if (cyhqVar != null) {
                this.l.a.remove(cyhqVar);
            }
            cyhq cyhqVar2 = new cyhq(this, conversationIdType);
            this.m = cyhqVar2;
            this.l.a.add(cyhqVar2);
            this.k = conversationIdType;
        }
        return new ejuy(this.j, new eros() { // from class: cyhr
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                final cyhs cyhsVar = cyhs.this;
                return new erph(cyhsVar.b.p(conversationIdType).h(new emwl() { // from class: cyhp
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        String format;
                        String str;
                        boolean z;
                        boolean z2;
                        String str2;
                        String str3;
                        boolean z3;
                        MessagePartCoreData G;
                        List<String> list = (List) obj;
                        if (list.isEmpty()) {
                            int i = engw.d;
                            return new cyhk(enou.a, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (String str4 : list) {
                            if (str4 == null) {
                                throw new NullPointerException("Null id");
                            }
                            cyhs cyhsVar2 = cyhs.this;
                            bxbi b = cyhsVar2.b.b(str4);
                            if (b != null) {
                                long k = b.k();
                                MessageIdType m = b.m();
                                if (m == null) {
                                    throw new NullPointerException("Null messageId");
                                }
                                if (!TextUtils.isEmpty(str4) && k != -1 && !m.c()) {
                                    ddlw ddlwVar = cyhsVar2.i;
                                    if (csri.a(ddlwVar.b.f().toEpochMilli(), k, ZoneId.systemDefault()) == 0) {
                                        format = ddlwVar.c.b(k);
                                    } else {
                                        acdc acdcVar = ddlwVar.c;
                                        format = ctid.c(acdcVar.e).equals(Locale.US) ? (DateFormat.is24HourFormat(acdcVar.e) ? (SimpleDateFormat) acdcVar.b.get() : (SimpleDateFormat) acdcVar.a.get()).format(Long.valueOf(k)) : acdcVar.a(acdcVar.e, k, 65553);
                                    }
                                    String str5 = format;
                                    if (str5 == null) {
                                        throw new NullPointerException("Null formattedTime");
                                    }
                                    MessageCoreData v = ((bdmq) cyhsVar2.f.b()).v(m);
                                    if (v != null) {
                                        str = v.dn(2);
                                        String str6 = "";
                                        str2 = (!TextUtils.isEmpty(str) || (G = v.G()) == null) ? "" : emxe.b(G.V());
                                        bseh r = ((bczy) cyhsVar2.h.b()).r(v.z());
                                        ParticipantsTable.BindData b2 = ((bdrr) cyhsVar2.g.b()).b(v.aA());
                                        if (b2 != null && r != null) {
                                            if (bdtd.m(b2)) {
                                                z3 = true;
                                                z2 = z3;
                                                z = true;
                                                str3 = emxe.b(str6);
                                            } else if (r.q() > 1) {
                                                str6 = !TextUtils.isEmpty(b2.Q()) ? b2.Q() : !TextUtils.isEmpty(b2.R()) ? b2.R() : b2.P();
                                            }
                                        }
                                        z3 = false;
                                        z2 = z3;
                                        z = true;
                                        str3 = emxe.b(str6);
                                    } else {
                                        str = null;
                                        z = false;
                                        z2 = false;
                                        str2 = null;
                                        str3 = null;
                                    }
                                    if (!z) {
                                        throw new IllegalStateException("Missing required properties:".concat(" messageText attachmentType senderName msgFromSelf"));
                                    }
                                    arrayList.add(new cyhj(str4, str5, str, str2, str3, z2, m));
                                }
                            }
                        }
                        return new cyhk(engw.n(arrayList), !r15.isEmpty());
                    }
                }, cyhsVar.e));
            }
        }, "REMINDERS_BANNER_STATE_KEY".concat(String.valueOf(String.valueOf(conversationIdType))));
    }

    @Override // defpackage.cyhn
    public final elfl b(ConversationIdType conversationIdType, final String str) {
        return this.b.t(conversationIdType, str, 2).h(new emwl() { // from class: cyho
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Long l = (Long) obj;
                if (l == null || Objects.equals(l, 0L)) {
                    cyhs.a.r("Snooze for reminder was not successful");
                    return null;
                }
                String str2 = str;
                cyhs cyhsVar = cyhs.this;
                bxbi b = cyhsVar.b.b(str2);
                if (b == null) {
                    return null;
                }
                ddln createBuilder = ddlo.a.createBuilder();
                String b2 = b.m().b();
                createBuilder.copyOnWrite();
                ddlo ddloVar = (ddlo) createBuilder.instance;
                b2.getClass();
                ddloVar.b |= 2;
                ddloVar.d = b2;
                String a2 = b.l().a();
                createBuilder.copyOnWrite();
                ddlo ddloVar2 = (ddlo) createBuilder.instance;
                a2.getClass();
                ddloVar2.b |= 4;
                ddloVar2.e = a2;
                long epochMilli = cyhsVar.d.f().toEpochMilli();
                createBuilder.copyOnWrite();
                ddlo ddloVar3 = (ddlo) createBuilder.instance;
                ddloVar3.b |= 16;
                ddloVar3.g = epochMilli;
                long longValue = l.longValue();
                createBuilder.copyOnWrite();
                ddlo ddloVar4 = (ddlo) createBuilder.instance;
                ddloVar4.b |= 1;
                ddloVar4.c = longValue;
                createBuilder.copyOnWrite();
                ddlo ddloVar5 = (ddlo) createBuilder.instance;
                ddloVar5.b |= 8;
                ddloVar5.f = false;
                return createBuilder.build();
            }
        }, this.e);
    }
}
