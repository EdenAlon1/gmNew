package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bajq {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor");
    private static final Object f = new Object();
    private final Map A;
    private final axcf B;
    private final bajm C;
    private final ffbr D;
    private final ffbr E;
    private final ffbr F;
    private final ffbr G;
    private final ffbr H;
    private final ffbr I;
    private final ffbr J;
    private final ffbr K;
    private final ffbr L;
    private final bbhf M;
    private final int N;
    private final Duration O;
    private final Action P;
    private final cniz Q;
    private final ceve R;
    private final List S = new ArrayList();
    private final List T = new ArrayList();
    private final List U = new ArrayList();
    private final List V = new ArrayList();
    private final List W = new ArrayList();
    private final Set X = new HashSet();
    private final Set Y = new HashSet();
    private final Set Z = new HashSet();
    private final Set aa = new HashSet();
    private final Set ab = new HashSet();
    private final boolean[] ac = new boolean[8];
    private final boolean[] ad = new boolean[8];
    private final Boolean[] ae = new Boolean[8];
    private boolean af;
    public final clws b;
    public final cpez c;
    public final errl d;
    public final String e;
    private final bbgc g;
    private final cqoh h;
    private final ffbr i;
    private final csjk j;
    private final ffbr k;
    private final altk l;
    private final banu m;
    private final bbfw n;
    private final bbgq o;
    private final baio p;
    private final byzp q;
    private final ffbr r;
    private final Optional s;
    private final bbfo t;
    private final cbut u;
    private final ffbr v;
    private final ffbr w;
    private final bajp x;
    private final ffbr y;
    private final cmlm z;

    /* compiled from: PG */
    public interface a {
        bajs aL();

        banu aM();

        ctvb cR();

        cqoh v();
    }

    public bajq(ffbr ffbrVar, ffbr ffbrVar2, bbgc bbgcVar, cqoh cqohVar, ffbr ffbrVar3, csjk csjkVar, ffbr ffbrVar4, altk altkVar, banu banuVar, bbfw bbfwVar, bbgq bbgqVar, baio baioVar, byzp byzpVar, bbfo bbfoVar, bbhf bbhfVar, Optional optional, clws clwsVar, cbut cbutVar, ffbr ffbrVar5, ffbr ffbrVar6, bajp bajpVar, ffbr ffbrVar7, cpez cpezVar, errl errlVar, int i, Duration duration, Action action, cniz cnizVar, ceve ceveVar, String str, cmlm cmlmVar, Map map, axcf axcfVar, bajm bajmVar, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15) {
        this.r = ffbrVar;
        this.G = ffbrVar2;
        this.g = bbgcVar;
        this.h = cqohVar;
        this.i = ffbrVar3;
        this.j = csjkVar;
        this.k = ffbrVar4;
        this.l = altkVar;
        this.m = banuVar;
        this.n = bbfwVar;
        this.o = bbgqVar;
        this.p = baioVar;
        this.q = byzpVar;
        this.t = bbfoVar;
        this.M = bbhfVar;
        this.s = optional;
        this.b = clwsVar;
        this.u = cbutVar;
        this.v = ffbrVar5;
        this.w = ffbrVar6;
        this.x = bajpVar;
        this.y = ffbrVar7;
        this.c = cpezVar;
        this.d = errlVar;
        this.N = i;
        this.O = duration;
        this.P = action;
        this.Q = cnizVar;
        this.R = ceveVar;
        this.e = str;
        this.H = ffbrVar11;
        this.I = ffbrVar12;
        this.K = ffbrVar14;
        this.L = ffbrVar15;
        for (int i2 = 0; i2 < 8; i2++) {
            this.ac[i2] = false;
            this.ad[i2] = false;
            this.ae[i2] = false;
        }
        this.af = false;
        this.z = cmlmVar;
        this.A = map;
        this.B = axcfVar;
        this.C = bajmVar;
        this.D = ffbrVar8;
        this.E = ffbrVar9;
        this.F = ffbrVar10;
        this.J = ffbrVar13;
    }

    public static buxo b() {
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.h(5);
        engrVar.h(6);
        engrVar.h(4);
        engrVar.h(7);
        engrVar.h(10);
        engrVar.h(105);
        engrVar.h(103);
        engrVar.h(104);
        engrVar.h(102);
        engrVar.h(115);
        buxo d = MessagesTable.d();
        d.z("+buildPendingMessagesQuery");
        buxz buxzVar = new buxz();
        buxzVar.ai(engrVar.g());
        d.g(buxzVar);
        d.d(new buxl(MessagesTable.c.i, true));
        return d;
    }

    public static void d(int i, Action action) {
        e(i, Duration.ZERO, action);
    }

    public static void e(int i, Duration duration, Action action) {
        emxf.b(true, "ProcessPendingMessagesAction: empty processing action");
        a aVar = (a) ctba.a(a.class);
        if (!aVar.cR().G()) {
            ensk j = a.j();
            j.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromAction", 270, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - not default SMS app");
            return;
        }
        long epochMilli = aVar.v().f().toEpochMilli();
        if (aVar.aM().d(i, epochMilli)) {
            ensk h = a.h();
            h.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromAction", 281, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - too frequent");
            return;
        }
        bajs aL = aVar.aL();
        ffbr ffbrVar = aL.a;
        bbgc bbgcVar = (bbgc) aL.b.b();
        bbgcVar.getClass();
        cqoh cqohVar = (cqoh) aL.c.b();
        cqohVar.getClass();
        ffbr ffbrVar2 = aL.d;
        csjk csjkVar = (csjk) aL.e.b();
        csjkVar.getClass();
        ffbr ffbrVar3 = aL.f;
        altk altkVar = (altk) aL.g.b();
        altkVar.getClass();
        banu banuVar = (banu) aL.h.b();
        banuVar.getClass();
        bbfw bbfwVar = (bbfw) aL.i.b();
        bbfwVar.getClass();
        bbgq bbgqVar = (bbgq) aL.j.b();
        bbgqVar.getClass();
        baio baioVar = (baio) aL.k.b();
        baioVar.getClass();
        byzp byzpVar = (byzp) aL.l.b();
        byzpVar.getClass();
        bbfo bbfoVar = (bbfo) aL.m.b();
        bbfoVar.getClass();
        bbhf bbhfVar = (bbhf) aL.n.b();
        bbhfVar.getClass();
        Optional optional = (Optional) aL.o.b();
        optional.getClass();
        clws clwsVar = (clws) aL.p.b();
        clwsVar.getClass();
        cbut cbutVar = (cbut) aL.q.b();
        cbutVar.getClass();
        ((cqrl) aL.r.b()).getClass();
        ffbr ffbrVar4 = aL.s;
        ffbr ffbrVar5 = aL.t;
        bajp bajpVar = (bajp) aL.u.b();
        bajpVar.getClass();
        ffbr ffbrVar6 = aL.v;
        cpez cpezVar = (cpez) aL.w.b();
        cpezVar.getClass();
        errl errlVar = (errl) aL.x.b();
        errlVar.getClass();
        duration.getClass();
        cmlm cmlmVar = (cmlm) aL.y.b();
        cmlmVar.getClass();
        Map map = (Map) aL.z.b();
        map.getClass();
        axcf axcfVar = (axcf) aL.A.b();
        axcfVar.getClass();
        bajm bajmVar = (bajm) aL.B.b();
        bajmVar.getClass();
        ffbr ffbrVar7 = aL.C;
        ffbr ffbrVar8 = aL.D;
        ffbr ffbrVar9 = aL.E;
        ffbr ffbrVar10 = aL.F;
        new bajq(aL.K, ffbrVar, bbgcVar, cqohVar, ffbrVar2, csjkVar, ffbrVar3, altkVar, banuVar, bbfwVar, bbgqVar, baioVar, byzpVar, bbfoVar, bbhfVar, optional, clwsVar, cbutVar, ffbrVar4, ffbrVar5, bajpVar, ffbrVar6, cpezVar, errlVar, i, duration, action, null, null, action.getClass().getSimpleName(), cmlmVar, map, axcfVar, bajmVar, ffbrVar7, ffbrVar8, ffbrVar9, aL.G, aL.H, ffbrVar10, aL.I, aL.J).c();
        banu.d = epochMilli;
    }

    private final void f(MessageCoreData messageCoreData, List list) {
        csix.l(messageCoreData);
        if (((Boolean) cjja.a.e()).booleanValue()) {
            ((bdpt) this.w.b()).c(messageCoreData, false);
            list.add(messageCoreData);
            return;
        }
        csix.l(list);
        MessageCoreData v = ((bdmq) this.v.b()).v(messageCoreData.B());
        if (v != null) {
            list.add(v);
            return;
        }
        ensk j = a.j();
        j.Y(ente.a, "BugleDataModel");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.b, messageCoreData.B());
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "addFullMessage", 1753, "PendingMessagesProcessor.java")).q("PendingMessageProcessor: failed to read message");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r5.cW() != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04db A[Catch: all -> 0x0950, TryCatch #0 {all -> 0x0950, blocks: (B:49:0x01b5, B:50:0x0740, B:53:0x0750, B:55:0x0756, B:58:0x0780, B:60:0x078a, B:61:0x07a1, B:63:0x07a7, B:68:0x075e, B:76:0x01f3, B:86:0x00cd, B:88:0x00db, B:90:0x00e1, B:93:0x00ef, B:95:0x0100, B:96:0x018d, B:98:0x019b, B:100:0x01a1, B:102:0x0224, B:112:0x0246, B:114:0x024e, B:116:0x0254, B:118:0x025a, B:120:0x026c, B:121:0x0281, B:123:0x02c8, B:130:0x0370, B:134:0x0389, B:137:0x0445, B:141:0x0470, B:146:0x04aa, B:148:0x04db, B:149:0x04f0, B:151:0x04f6, B:152:0x050c, B:154:0x0531, B:156:0x05d2, B:158:0x05d9, B:160:0x05e3, B:163:0x05e7, B:165:0x05eb, B:167:0x05f3, B:172:0x0602, B:174:0x0610, B:176:0x0616, B:178:0x061d, B:180:0x0629, B:181:0x0630, B:182:0x06cd, B:184:0x06d3, B:186:0x06f2, B:187:0x062d, B:188:0x068e, B:190:0x049e, B:191:0x04a7, B:194:0x0465, B:195:0x046e, B:197:0x0441, B:201:0x0364, B:202:0x036d, B:204:0x02d4, B:207:0x02f6, B:209:0x031c, B:214:0x0555, B:215:0x0568, B:217:0x0577, B:220:0x057e, B:221:0x058a, B:223:0x05c0, B:226:0x05ca, B:228:0x0595, B:230:0x05a7, B:232:0x05ad, B:234:0x05b5, B:235:0x014d, B:237:0x0177, B:238:0x017f, B:240:0x06fb, B:246:0x07ad, B:249:0x07ee, B:250:0x0808, B:252:0x080e, B:254:0x0822, B:260:0x082f, B:268:0x083b, B:278:0x08c2, B:279:0x08c9, B:281:0x08cf, B:283:0x08df, B:286:0x08ec, B:288:0x08fa, B:294:0x090b, B:323:0x093e, B:322:0x093b, B:329:0x0947, B:270:0x0860, B:277:0x08bf, B:313:0x0933, B:312:0x0930, B:318:0x0936), top: B:48:0x01b5, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04f6 A[Catch: all -> 0x0950, TryCatch #0 {all -> 0x0950, blocks: (B:49:0x01b5, B:50:0x0740, B:53:0x0750, B:55:0x0756, B:58:0x0780, B:60:0x078a, B:61:0x07a1, B:63:0x07a7, B:68:0x075e, B:76:0x01f3, B:86:0x00cd, B:88:0x00db, B:90:0x00e1, B:93:0x00ef, B:95:0x0100, B:96:0x018d, B:98:0x019b, B:100:0x01a1, B:102:0x0224, B:112:0x0246, B:114:0x024e, B:116:0x0254, B:118:0x025a, B:120:0x026c, B:121:0x0281, B:123:0x02c8, B:130:0x0370, B:134:0x0389, B:137:0x0445, B:141:0x0470, B:146:0x04aa, B:148:0x04db, B:149:0x04f0, B:151:0x04f6, B:152:0x050c, B:154:0x0531, B:156:0x05d2, B:158:0x05d9, B:160:0x05e3, B:163:0x05e7, B:165:0x05eb, B:167:0x05f3, B:172:0x0602, B:174:0x0610, B:176:0x0616, B:178:0x061d, B:180:0x0629, B:181:0x0630, B:182:0x06cd, B:184:0x06d3, B:186:0x06f2, B:187:0x062d, B:188:0x068e, B:190:0x049e, B:191:0x04a7, B:194:0x0465, B:195:0x046e, B:197:0x0441, B:201:0x0364, B:202:0x036d, B:204:0x02d4, B:207:0x02f6, B:209:0x031c, B:214:0x0555, B:215:0x0568, B:217:0x0577, B:220:0x057e, B:221:0x058a, B:223:0x05c0, B:226:0x05ca, B:228:0x0595, B:230:0x05a7, B:232:0x05ad, B:234:0x05b5, B:235:0x014d, B:237:0x0177, B:238:0x017f, B:240:0x06fb, B:246:0x07ad, B:249:0x07ee, B:250:0x0808, B:252:0x080e, B:254:0x0822, B:260:0x082f, B:268:0x083b, B:278:0x08c2, B:279:0x08c9, B:281:0x08cf, B:283:0x08df, B:286:0x08ec, B:288:0x08fa, B:294:0x090b, B:323:0x093e, B:322:0x093b, B:329:0x0947, B:270:0x0860, B:277:0x08bf, B:313:0x0933, B:312:0x0930, B:318:0x0936), top: B:48:0x01b5, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0531 A[Catch: all -> 0x0950, TryCatch #0 {all -> 0x0950, blocks: (B:49:0x01b5, B:50:0x0740, B:53:0x0750, B:55:0x0756, B:58:0x0780, B:60:0x078a, B:61:0x07a1, B:63:0x07a7, B:68:0x075e, B:76:0x01f3, B:86:0x00cd, B:88:0x00db, B:90:0x00e1, B:93:0x00ef, B:95:0x0100, B:96:0x018d, B:98:0x019b, B:100:0x01a1, B:102:0x0224, B:112:0x0246, B:114:0x024e, B:116:0x0254, B:118:0x025a, B:120:0x026c, B:121:0x0281, B:123:0x02c8, B:130:0x0370, B:134:0x0389, B:137:0x0445, B:141:0x0470, B:146:0x04aa, B:148:0x04db, B:149:0x04f0, B:151:0x04f6, B:152:0x050c, B:154:0x0531, B:156:0x05d2, B:158:0x05d9, B:160:0x05e3, B:163:0x05e7, B:165:0x05eb, B:167:0x05f3, B:172:0x0602, B:174:0x0610, B:176:0x0616, B:178:0x061d, B:180:0x0629, B:181:0x0630, B:182:0x06cd, B:184:0x06d3, B:186:0x06f2, B:187:0x062d, B:188:0x068e, B:190:0x049e, B:191:0x04a7, B:194:0x0465, B:195:0x046e, B:197:0x0441, B:201:0x0364, B:202:0x036d, B:204:0x02d4, B:207:0x02f6, B:209:0x031c, B:214:0x0555, B:215:0x0568, B:217:0x0577, B:220:0x057e, B:221:0x058a, B:223:0x05c0, B:226:0x05ca, B:228:0x0595, B:230:0x05a7, B:232:0x05ad, B:234:0x05b5, B:235:0x014d, B:237:0x0177, B:238:0x017f, B:240:0x06fb, B:246:0x07ad, B:249:0x07ee, B:250:0x0808, B:252:0x080e, B:254:0x0822, B:260:0x082f, B:268:0x083b, B:278:0x08c2, B:279:0x08c9, B:281:0x08cf, B:283:0x08df, B:286:0x08ec, B:288:0x08fa, B:294:0x090b, B:323:0x093e, B:322:0x093b, B:329:0x0947, B:270:0x0860, B:277:0x08bf, B:313:0x0933, B:312:0x0930, B:318:0x0936), top: B:48:0x01b5, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05d9 A[Catch: all -> 0x0950, TryCatch #0 {all -> 0x0950, blocks: (B:49:0x01b5, B:50:0x0740, B:53:0x0750, B:55:0x0756, B:58:0x0780, B:60:0x078a, B:61:0x07a1, B:63:0x07a7, B:68:0x075e, B:76:0x01f3, B:86:0x00cd, B:88:0x00db, B:90:0x00e1, B:93:0x00ef, B:95:0x0100, B:96:0x018d, B:98:0x019b, B:100:0x01a1, B:102:0x0224, B:112:0x0246, B:114:0x024e, B:116:0x0254, B:118:0x025a, B:120:0x026c, B:121:0x0281, B:123:0x02c8, B:130:0x0370, B:134:0x0389, B:137:0x0445, B:141:0x0470, B:146:0x04aa, B:148:0x04db, B:149:0x04f0, B:151:0x04f6, B:152:0x050c, B:154:0x0531, B:156:0x05d2, B:158:0x05d9, B:160:0x05e3, B:163:0x05e7, B:165:0x05eb, B:167:0x05f3, B:172:0x0602, B:174:0x0610, B:176:0x0616, B:178:0x061d, B:180:0x0629, B:181:0x0630, B:182:0x06cd, B:184:0x06d3, B:186:0x06f2, B:187:0x062d, B:188:0x068e, B:190:0x049e, B:191:0x04a7, B:194:0x0465, B:195:0x046e, B:197:0x0441, B:201:0x0364, B:202:0x036d, B:204:0x02d4, B:207:0x02f6, B:209:0x031c, B:214:0x0555, B:215:0x0568, B:217:0x0577, B:220:0x057e, B:221:0x058a, B:223:0x05c0, B:226:0x05ca, B:228:0x0595, B:230:0x05a7, B:232:0x05ad, B:234:0x05b5, B:235:0x014d, B:237:0x0177, B:238:0x017f, B:240:0x06fb, B:246:0x07ad, B:249:0x07ee, B:250:0x0808, B:252:0x080e, B:254:0x0822, B:260:0x082f, B:268:0x083b, B:278:0x08c2, B:279:0x08c9, B:281:0x08cf, B:283:0x08df, B:286:0x08ec, B:288:0x08fa, B:294:0x090b, B:323:0x093e, B:322:0x093b, B:329:0x0947, B:270:0x0860, B:277:0x08bf, B:313:0x0933, B:312:0x0930, B:318:0x0936), top: B:48:0x01b5, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0602 A[Catch: all -> 0x0950, TRY_ENTER, TryCatch #0 {all -> 0x0950, blocks: (B:49:0x01b5, B:50:0x0740, B:53:0x0750, B:55:0x0756, B:58:0x0780, B:60:0x078a, B:61:0x07a1, B:63:0x07a7, B:68:0x075e, B:76:0x01f3, B:86:0x00cd, B:88:0x00db, B:90:0x00e1, B:93:0x00ef, B:95:0x0100, B:96:0x018d, B:98:0x019b, B:100:0x01a1, B:102:0x0224, B:112:0x0246, B:114:0x024e, B:116:0x0254, B:118:0x025a, B:120:0x026c, B:121:0x0281, B:123:0x02c8, B:130:0x0370, B:134:0x0389, B:137:0x0445, B:141:0x0470, B:146:0x04aa, B:148:0x04db, B:149:0x04f0, B:151:0x04f6, B:152:0x050c, B:154:0x0531, B:156:0x05d2, B:158:0x05d9, B:160:0x05e3, B:163:0x05e7, B:165:0x05eb, B:167:0x05f3, B:172:0x0602, B:174:0x0610, B:176:0x0616, B:178:0x061d, B:180:0x0629, B:181:0x0630, B:182:0x06cd, B:184:0x06d3, B:186:0x06f2, B:187:0x062d, B:188:0x068e, B:190:0x049e, B:191:0x04a7, B:194:0x0465, B:195:0x046e, B:197:0x0441, B:201:0x0364, B:202:0x036d, B:204:0x02d4, B:207:0x02f6, B:209:0x031c, B:214:0x0555, B:215:0x0568, B:217:0x0577, B:220:0x057e, B:221:0x058a, B:223:0x05c0, B:226:0x05ca, B:228:0x0595, B:230:0x05a7, B:232:0x05ad, B:234:0x05b5, B:235:0x014d, B:237:0x0177, B:238:0x017f, B:240:0x06fb, B:246:0x07ad, B:249:0x07ee, B:250:0x0808, B:252:0x080e, B:254:0x0822, B:260:0x082f, B:268:0x083b, B:278:0x08c2, B:279:0x08c9, B:281:0x08cf, B:283:0x08df, B:286:0x08ec, B:288:0x08fa, B:294:0x090b, B:323:0x093e, B:322:0x093b, B:329:0x0947, B:270:0x0860, B:277:0x08bf, B:313:0x0933, B:312:0x0930, B:318:0x0936), top: B:48:0x01b5, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06d3 A[Catch: all -> 0x0950, TryCatch #0 {all -> 0x0950, blocks: (B:49:0x01b5, B:50:0x0740, B:53:0x0750, B:55:0x0756, B:58:0x0780, B:60:0x078a, B:61:0x07a1, B:63:0x07a7, B:68:0x075e, B:76:0x01f3, B:86:0x00cd, B:88:0x00db, B:90:0x00e1, B:93:0x00ef, B:95:0x0100, B:96:0x018d, B:98:0x019b, B:100:0x01a1, B:102:0x0224, B:112:0x0246, B:114:0x024e, B:116:0x0254, B:118:0x025a, B:120:0x026c, B:121:0x0281, B:123:0x02c8, B:130:0x0370, B:134:0x0389, B:137:0x0445, B:141:0x0470, B:146:0x04aa, B:148:0x04db, B:149:0x04f0, B:151:0x04f6, B:152:0x050c, B:154:0x0531, B:156:0x05d2, B:158:0x05d9, B:160:0x05e3, B:163:0x05e7, B:165:0x05eb, B:167:0x05f3, B:172:0x0602, B:174:0x0610, B:176:0x0616, B:178:0x061d, B:180:0x0629, B:181:0x0630, B:182:0x06cd, B:184:0x06d3, B:186:0x06f2, B:187:0x062d, B:188:0x068e, B:190:0x049e, B:191:0x04a7, B:194:0x0465, B:195:0x046e, B:197:0x0441, B:201:0x0364, B:202:0x036d, B:204:0x02d4, B:207:0x02f6, B:209:0x031c, B:214:0x0555, B:215:0x0568, B:217:0x0577, B:220:0x057e, B:221:0x058a, B:223:0x05c0, B:226:0x05ca, B:228:0x0595, B:230:0x05a7, B:232:0x05ad, B:234:0x05b5, B:235:0x014d, B:237:0x0177, B:238:0x017f, B:240:0x06fb, B:246:0x07ad, B:249:0x07ee, B:250:0x0808, B:252:0x080e, B:254:0x0822, B:260:0x082f, B:268:0x083b, B:278:0x08c2, B:279:0x08c9, B:281:0x08cf, B:283:0x08df, B:286:0x08ec, B:288:0x08fa, B:294:0x090b, B:323:0x093e, B:322:0x093b, B:329:0x0947, B:270:0x0860, B:277:0x08bf, B:313:0x0933, B:312:0x0930, B:318:0x0936), top: B:48:0x01b5, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06f2 A[Catch: all -> 0x0950, TryCatch #0 {all -> 0x0950, blocks: (B:49:0x01b5, B:50:0x0740, B:53:0x0750, B:55:0x0756, B:58:0x0780, B:60:0x078a, B:61:0x07a1, B:63:0x07a7, B:68:0x075e, B:76:0x01f3, B:86:0x00cd, B:88:0x00db, B:90:0x00e1, B:93:0x00ef, B:95:0x0100, B:96:0x018d, B:98:0x019b, B:100:0x01a1, B:102:0x0224, B:112:0x0246, B:114:0x024e, B:116:0x0254, B:118:0x025a, B:120:0x026c, B:121:0x0281, B:123:0x02c8, B:130:0x0370, B:134:0x0389, B:137:0x0445, B:141:0x0470, B:146:0x04aa, B:148:0x04db, B:149:0x04f0, B:151:0x04f6, B:152:0x050c, B:154:0x0531, B:156:0x05d2, B:158:0x05d9, B:160:0x05e3, B:163:0x05e7, B:165:0x05eb, B:167:0x05f3, B:172:0x0602, B:174:0x0610, B:176:0x0616, B:178:0x061d, B:180:0x0629, B:181:0x0630, B:182:0x06cd, B:184:0x06d3, B:186:0x06f2, B:187:0x062d, B:188:0x068e, B:190:0x049e, B:191:0x04a7, B:194:0x0465, B:195:0x046e, B:197:0x0441, B:201:0x0364, B:202:0x036d, B:204:0x02d4, B:207:0x02f6, B:209:0x031c, B:214:0x0555, B:215:0x0568, B:217:0x0577, B:220:0x057e, B:221:0x058a, B:223:0x05c0, B:226:0x05ca, B:228:0x0595, B:230:0x05a7, B:232:0x05ad, B:234:0x05b5, B:235:0x014d, B:237:0x0177, B:238:0x017f, B:240:0x06fb, B:246:0x07ad, B:249:0x07ee, B:250:0x0808, B:252:0x080e, B:254:0x0822, B:260:0x082f, B:268:0x083b, B:278:0x08c2, B:279:0x08c9, B:281:0x08cf, B:283:0x08df, B:286:0x08ec, B:288:0x08fa, B:294:0x090b, B:323:0x093e, B:322:0x093b, B:329:0x0947, B:270:0x0860, B:277:0x08bf, B:313:0x0933, B:312:0x0930, B:318:0x0936), top: B:48:0x01b5, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x068e A[Catch: all -> 0x0950, TryCatch #0 {all -> 0x0950, blocks: (B:49:0x01b5, B:50:0x0740, B:53:0x0750, B:55:0x0756, B:58:0x0780, B:60:0x078a, B:61:0x07a1, B:63:0x07a7, B:68:0x075e, B:76:0x01f3, B:86:0x00cd, B:88:0x00db, B:90:0x00e1, B:93:0x00ef, B:95:0x0100, B:96:0x018d, B:98:0x019b, B:100:0x01a1, B:102:0x0224, B:112:0x0246, B:114:0x024e, B:116:0x0254, B:118:0x025a, B:120:0x026c, B:121:0x0281, B:123:0x02c8, B:130:0x0370, B:134:0x0389, B:137:0x0445, B:141:0x0470, B:146:0x04aa, B:148:0x04db, B:149:0x04f0, B:151:0x04f6, B:152:0x050c, B:154:0x0531, B:156:0x05d2, B:158:0x05d9, B:160:0x05e3, B:163:0x05e7, B:165:0x05eb, B:167:0x05f3, B:172:0x0602, B:174:0x0610, B:176:0x0616, B:178:0x061d, B:180:0x0629, B:181:0x0630, B:182:0x06cd, B:184:0x06d3, B:186:0x06f2, B:187:0x062d, B:188:0x068e, B:190:0x049e, B:191:0x04a7, B:194:0x0465, B:195:0x046e, B:197:0x0441, B:201:0x0364, B:202:0x036d, B:204:0x02d4, B:207:0x02f6, B:209:0x031c, B:214:0x0555, B:215:0x0568, B:217:0x0577, B:220:0x057e, B:221:0x058a, B:223:0x05c0, B:226:0x05ca, B:228:0x0595, B:230:0x05a7, B:232:0x05ad, B:234:0x05b5, B:235:0x014d, B:237:0x0177, B:238:0x017f, B:240:0x06fb, B:246:0x07ad, B:249:0x07ee, B:250:0x0808, B:252:0x080e, B:254:0x0822, B:260:0x082f, B:268:0x083b, B:278:0x08c2, B:279:0x08c9, B:281:0x08cf, B:283:0x08df, B:286:0x08ec, B:288:0x08fa, B:294:0x090b, B:323:0x093e, B:322:0x093b, B:329:0x0947, B:270:0x0860, B:277:0x08bf, B:313:0x0933, B:312:0x0930, B:318:0x0936), top: B:48:0x01b5, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0441 A[Catch: all -> 0x0950, TryCatch #0 {all -> 0x0950, blocks: (B:49:0x01b5, B:50:0x0740, B:53:0x0750, B:55:0x0756, B:58:0x0780, B:60:0x078a, B:61:0x07a1, B:63:0x07a7, B:68:0x075e, B:76:0x01f3, B:86:0x00cd, B:88:0x00db, B:90:0x00e1, B:93:0x00ef, B:95:0x0100, B:96:0x018d, B:98:0x019b, B:100:0x01a1, B:102:0x0224, B:112:0x0246, B:114:0x024e, B:116:0x0254, B:118:0x025a, B:120:0x026c, B:121:0x0281, B:123:0x02c8, B:130:0x0370, B:134:0x0389, B:137:0x0445, B:141:0x0470, B:146:0x04aa, B:148:0x04db, B:149:0x04f0, B:151:0x04f6, B:152:0x050c, B:154:0x0531, B:156:0x05d2, B:158:0x05d9, B:160:0x05e3, B:163:0x05e7, B:165:0x05eb, B:167:0x05f3, B:172:0x0602, B:174:0x0610, B:176:0x0616, B:178:0x061d, B:180:0x0629, B:181:0x0630, B:182:0x06cd, B:184:0x06d3, B:186:0x06f2, B:187:0x062d, B:188:0x068e, B:190:0x049e, B:191:0x04a7, B:194:0x0465, B:195:0x046e, B:197:0x0441, B:201:0x0364, B:202:0x036d, B:204:0x02d4, B:207:0x02f6, B:209:0x031c, B:214:0x0555, B:215:0x0568, B:217:0x0577, B:220:0x057e, B:221:0x058a, B:223:0x05c0, B:226:0x05ca, B:228:0x0595, B:230:0x05a7, B:232:0x05ad, B:234:0x05b5, B:235:0x014d, B:237:0x0177, B:238:0x017f, B:240:0x06fb, B:246:0x07ad, B:249:0x07ee, B:250:0x0808, B:252:0x080e, B:254:0x0822, B:260:0x082f, B:268:0x083b, B:278:0x08c2, B:279:0x08c9, B:281:0x08cf, B:283:0x08df, B:286:0x08ec, B:288:0x08fa, B:294:0x090b, B:323:0x093e, B:322:0x093b, B:329:0x0947, B:270:0x0860, B:277:0x08bf, B:313:0x0933, B:312:0x0930, B:318:0x0936), top: B:48:0x01b5, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x07a7 A[Catch: all -> 0x0950, TryCatch #0 {all -> 0x0950, blocks: (B:49:0x01b5, B:50:0x0740, B:53:0x0750, B:55:0x0756, B:58:0x0780, B:60:0x078a, B:61:0x07a1, B:63:0x07a7, B:68:0x075e, B:76:0x01f3, B:86:0x00cd, B:88:0x00db, B:90:0x00e1, B:93:0x00ef, B:95:0x0100, B:96:0x018d, B:98:0x019b, B:100:0x01a1, B:102:0x0224, B:112:0x0246, B:114:0x024e, B:116:0x0254, B:118:0x025a, B:120:0x026c, B:121:0x0281, B:123:0x02c8, B:130:0x0370, B:134:0x0389, B:137:0x0445, B:141:0x0470, B:146:0x04aa, B:148:0x04db, B:149:0x04f0, B:151:0x04f6, B:152:0x050c, B:154:0x0531, B:156:0x05d2, B:158:0x05d9, B:160:0x05e3, B:163:0x05e7, B:165:0x05eb, B:167:0x05f3, B:172:0x0602, B:174:0x0610, B:176:0x0616, B:178:0x061d, B:180:0x0629, B:181:0x0630, B:182:0x06cd, B:184:0x06d3, B:186:0x06f2, B:187:0x062d, B:188:0x068e, B:190:0x049e, B:191:0x04a7, B:194:0x0465, B:195:0x046e, B:197:0x0441, B:201:0x0364, B:202:0x036d, B:204:0x02d4, B:207:0x02f6, B:209:0x031c, B:214:0x0555, B:215:0x0568, B:217:0x0577, B:220:0x057e, B:221:0x058a, B:223:0x05c0, B:226:0x05ca, B:228:0x0595, B:230:0x05a7, B:232:0x05ad, B:234:0x05b5, B:235:0x014d, B:237:0x0177, B:238:0x017f, B:240:0x06fb, B:246:0x07ad, B:249:0x07ee, B:250:0x0808, B:252:0x080e, B:254:0x0822, B:260:0x082f, B:268:0x083b, B:278:0x08c2, B:279:0x08c9, B:281:0x08cf, B:283:0x08df, B:286:0x08ec, B:288:0x08fa, B:294:0x090b, B:323:0x093e, B:322:0x093b, B:329:0x0947, B:270:0x0860, B:277:0x08bf, B:313:0x0933, B:312:0x0930, B:318:0x0936), top: B:48:0x01b5, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x079d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(java.util.List r41, final long r42, defpackage.cniz r44) {
        /*
            Method dump skipped, instructions count: 2399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bajq.g(java.util.List, long, cniz):void");
    }

    private final void h(MessageCoreData messageCoreData, eosl eoslVar, String str) {
        if (!this.B.a()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleDataModel");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.b, messageCoreData.B());
            enrrVar.Y(csux.f, messageCoreData.E());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processWakeEvent", 1692, "PendingMessagesProcessor.java")).t("PendingMessagesProcessor: Queued message since RCS is not ready to send, but engine doesn't support tickles. Readiness=%s", str);
            return;
        }
        eqna b = eqna.b(eoslVar.o);
        if (b == null) {
            b = eqna.TRANSPORT_UNKNOWN;
        }
        clxm clxmVar = (clxm) this.A.get(b);
        clxmVar.getClass();
        if (!clxmVar.a()) {
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleDataModel");
            enrr enrrVar2 = (enrr) h2;
            enrrVar2.Y(csux.b, messageCoreData.B());
            enrrVar2.Y(csux.f, messageCoreData.E());
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processWakeLogs", 1722, "PendingMessagesProcessor.java")).t("PendingMessagesProcessor: Queued message since RCS is not ready to send, and a prior message already ticked the engine. Readiness=%s", str);
            return;
        }
        altk altkVar = this.l;
        int a2 = a(messageCoreData);
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.h = 16;
        eopqVar.b |= 2;
        altkVar.O(messageCoreData, a2, eoopVar);
        ensk h3 = a.h();
        h3.Y(ente.a, "BugleDataModel");
        enrr enrrVar3 = (enrr) h3;
        enrrVar3.Y(csux.b, messageCoreData.B());
        enrrVar3.Y(csux.f, messageCoreData.E());
        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processWakeLogs", 1713, "PendingMessagesProcessor.java")).t("PendingMessagesProcessor: Queued message since RCS is not ready to send. Tickled Rcs engine. Readiness=%s", str);
    }

    private final void i() {
        csmz csmzVar = (csmz) this.j.a();
        csms csmsVar = (csms) csmv.a.createBuilder();
        csmu csmuVar = csmu.ALL_ACTIVE_SUBSCRIPTIONS;
        csmsVar.copyOnWrite();
        csmv csmvVar = (csmv) csmsVar.instance;
        csmvVar.c = csmuVar.e;
        csmvVar.b |= 1;
        csmzVar.m(this.x.a, (csmv) csmsVar.build());
    }

    private final void j(MessageCoreData messageCoreData, SelfIdentityId selfIdentityId) {
        n(1);
        messageCoreData.aO(selfIdentityId);
        bdmq bdmqVar = (bdmq) this.v.b();
        ConversationIdType z = messageCoreData.z();
        MessageIdType B = messageCoreData.B();
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("updateMessageSelfId");
        buxrVar.K(((SelfIdentityIdImpl) selfIdentityId).a);
        bdmqVar.U(z, B, buxrVar);
    }

    private static boolean k(List list, Object obj) {
        if (obj == null) {
            return false;
        }
        list.add(obj);
        return true;
    }

    private final boolean l(MessageCoreData messageCoreData) {
        if (((asnv) this.F.b()).a() && messageCoreData.G() != null) {
            MessagePartCoreData G = messageCoreData.G();
            G.getClass();
            awap z = G.z();
            if (z != null) {
                return ((awcz) this.J.b()).n(z);
            }
        }
        return ((Boolean) cqrl.e(messageCoreData.B()).map(new Function() { // from class: cqqu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = cqrl.a;
                return Boolean.valueOf(((cqrs) obj).m() == null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    private final boolean m(MessageCoreData messageCoreData) {
        return !((csmz) this.j.a()).o(a(messageCoreData));
    }

    private final void n(int i) {
        if (((atqs) this.G.b()).a()) {
            ((akzt) this.r.b()).e("Bugle.PendingMessagesProcessor.UpdateMessageSelf.Count", i);
        }
    }

    private final void o(int i) {
        csix.d(i, 0, 7);
        this.ac[i] = true;
    }

    public final int a(MessageCoreData messageCoreData) {
        aztg f2 = ((bdtd) this.k.b()).f(messageCoreData.v());
        if (f2 == null) {
            f2 = ((bdtd) this.k.b()).c();
        }
        if (f2 != null) {
            return f2.e();
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x06a2 A[Catch: all -> 0x0745, TryCatch #2 {all -> 0x0745, blocks: (B:152:0x043e, B:153:0x0469, B:155:0x046e, B:156:0x0492, B:158:0x04b6, B:172:0x0523, B:174:0x0528, B:176:0x052e, B:178:0x0534, B:180:0x053e, B:181:0x0679, B:183:0x06a2, B:184:0x070d, B:190:0x06b5, B:192:0x06bf, B:194:0x06c7, B:199:0x06ce, B:201:0x06d6, B:202:0x06dd, B:203:0x0562, B:204:0x0598, B:206:0x05a4, B:207:0x05c8, B:210:0x05dc, B:213:0x05f2, B:214:0x05e3, B:215:0x05d5, B:217:0x062f, B:218:0x0638, B:219:0x0640, B:220:0x0649, B:224:0x0672, B:226:0x0653, B:227:0x065d, B:228:0x0664, B:231:0x049f, B:232:0x04ae, B:270:0x0741, B:252:0x0730, B:251:0x072d, B:267:0x073d, B:266:0x073a, B:247:0x0728, B:12:0x0017, B:262:0x0735), top: B:6:0x0010, inners: #4, #6, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0213 A[Catch: all -> 0x0434, TryCatch #8 {all -> 0x0434, blocks: (B:45:0x0193, B:47:0x01b0, B:51:0x01b9, B:53:0x01c3, B:55:0x01c9, B:58:0x01d0, B:60:0x01d8, B:62:0x01de, B:63:0x020b, B:65:0x0213, B:85:0x021f, B:87:0x0238, B:90:0x0240, B:92:0x0246, B:94:0x024e, B:96:0x0258, B:97:0x0264, B:99:0x026e, B:101:0x0286, B:103:0x028e, B:104:0x02bb, B:106:0x02c9, B:108:0x02cf, B:109:0x02fc, B:110:0x0308, B:112:0x030e, B:114:0x031a, B:116:0x032b, B:117:0x0337, B:119:0x0345, B:121:0x0363, B:122:0x0366, B:123:0x036d, B:125:0x0395, B:126:0x0397, B:128:0x039b, B:129:0x039e, B:130:0x03a5, B:132:0x03ab, B:134:0x03bd, B:135:0x03e9, B:139:0x03f2, B:141:0x03fa, B:142:0x0405, B:144:0x040d, B:145:0x0418, B:147:0x0420), top: B:44:0x0193 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bajq.c():void");
    }
}
