package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awmr implements awks {
    public static final entd a = entd.c("BugleGroupManagement");
    public final errl b;
    public final ffbr c;
    public final ffbr d;
    public final cqoh e;
    public final awkr f;
    public final fazb g;
    private final ffbr h;
    private final cbfs i;
    private final awmi j;

    public awmr(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, cbfs cbfsVar, ffbr ffbrVar3, cqoh cqohVar, awmi awmiVar, awkr awkrVar, fazb fazbVar) {
        this.b = errlVar;
        this.h = ffbrVar;
        this.c = ffbrVar2;
        this.i = cbfsVar;
        this.d = ffbrVar3;
        this.e = cqohVar;
        this.j = awmiVar;
        this.f = awkrVar;
        this.g = fazbVar;
    }

    public static enwd d(ParticipantsTable.BindData bindData, ParticipantsTable.BindData bindData2, String str) {
        enwb a2 = enwg.a();
        a2.c(new enwo("groupOperation", str));
        a2.b(awgo.d, bindData.U());
        a2.b(awgo.e, bindData2.U());
        return a2.a();
    }

    private final bvpo e(String str) {
        ffbr ffbrVar = this.h;
        bvpo f = bdqu.f(str);
        ((bdrr) ffbrVar.b()).j(f);
        return f;
    }

    private final void f(Set set, bvpo bvpoVar) {
        String str = bvpoVar.g;
        if (emxe.c(str) || set.contains(str)) {
            return;
        }
        this.i.f(bvpoVar, 4);
        set.add(str);
    }

    @Override // defpackage.awks
    public final elfl a(final ConversationIdType conversationIdType, final awxc awxcVar) {
        final awws awwsVar = awxcVar.e;
        if (awwsVar == null) {
            awwsVar = awws.a;
        }
        return this.j.g(conversationIdType).h(new emwl() { // from class: awml
            /* JADX WARN: Code restructure failed: missing block: B:100:0x01c6, code lost:
            
                r10 = r4.b(r7, r10);
                r8 = r8.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x01cc, code lost:
            
                if (r8 != null) goto L81;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x01ce, code lost:
            
                r8 = defpackage.awui.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x01d0, code lost:
            
                r8 = r4.c(r7, r8, r9, r2);
                r24 = defpackage.awmr.d(r10, r8, "remove");
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x01ed, code lost:
            
                if (((defpackage.bczy) r4.c.b()).aj(r10, r2.f(), false) != false) goto L89;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x0203, code lost:
            
                if (((defpackage.bczy) r4.c.b()).ah(r2.f(), r10.S()) == false) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x0205, code lost:
            
                ((defpackage.ensz) ((defpackage.ensz) defpackage.awmr.a.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "removeParticipantFromGroup", 383, "ParticipantsGroupMetadataProcessor.java")).q("Participant not successfully removed from the conversation.");
                r8 = defpackage.awmq.e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x02d2, code lost:
            
                r6 = r6.c(r8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x02d6, code lost:
            
                r24.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x02de, code lost:
            
                if (((defpackage.awjq) r6).a != false) goto L200;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x021e, code lost:
            
                r8 = defpackage.awmq.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x0222, code lost:
            
                ((defpackage.ensz) ((defpackage.ensz) defpackage.awmr.a.e()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "removeParticipantFromGroup", 390, "ParticipantsGroupMetadataProcessor.java")).q("Participant successfully removed from the conversation.");
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x0245, code lost:
            
                if (r2.c().d.equals(r10.U()) == false) goto L92;
             */
            /* JADX WARN: Code restructure failed: missing block: B:119:0x0247, code lost:
            
                ((defpackage.ensz) ((defpackage.ensz) defpackage.awmr.a.h()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "removeParticipantFromGroup", 398, "ParticipantsGroupMetadataProcessor.java")).q("Skipping inserting tombstone for removing the self user.");
                r8 = defpackage.awmq.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x0260, code lost:
            
                r13 = defpackage.djag.d();
                r14 = com.google.android.ims.rcsservice.businessinfo.BasePaymentResult.ERROR_REQUEST_TIMEOUT;
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x0266, code lost:
            
                if (r13 == false) goto L102;
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x026c, code lost:
            
                if ((r9.b & 1) == 0) goto L102;
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x026e, code lost:
            
                r13 = r9.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:125:0x0270, code lost:
            
                if (r13 != null) goto L99;
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x0272, code lost:
            
                r13 = defpackage.awui.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:0x027e, code lost:
            
                if (r13.d.equals(r10.U()) != false) goto L102;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:0x0280, code lost:
            
                r14 = 221;
             */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0282, code lost:
            
                r19 = r14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:131:0x0292, code lost:
            
                if (r2.c().d.equals(r10.U()) != false) goto L112;
             */
            /* JADX WARN: Code restructure failed: missing block: B:132:0x0294, code lost:
            
                r13 = (defpackage.cbvt) r4.d.b();
                r14 = j$.util.Optional.empty();
                r15 = r2.f();
                r16 = r2.e();
                r18 = defpackage.engw.r(r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:133:0x02b0, code lost:
            
                if ((r9.b & 2) == 0) goto L110;
             */
            /* JADX WARN: Code restructure failed: missing block: B:134:0x02b2, code lost:
            
                r9 = r9.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:135:0x02b4, code lost:
            
                if (r9 != null) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:136:0x02b6, code lost:
            
                r9 = defpackage.eyja.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:137:0x02b8, code lost:
            
                r9 = defpackage.eykm.b(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:138:0x02c7, code lost:
            
                r13.j(r14, r15, r16, r8, r18, r19, r9, -1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:139:0x02bd, code lost:
            
                r9 = r4.e.f().toEpochMilli();
             */
            /* JADX WARN: Code restructure failed: missing block: B:140:0x02d0, code lost:
            
                r8 = defpackage.awmq.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:142:0x02e2, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:152:0x02ed, code lost:
            
                r1 = r3.d.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:154:0x02f7, code lost:
            
                if (r1.hasNext() == false) goto L202;
             */
            /* JADX WARN: Code restructure failed: missing block: B:155:0x02f9, code lost:
            
                r3 = (defpackage.axav) r1.next();
                r8 = r3.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:156:0x0301, code lost:
            
                if (r8 != null) goto L130;
             */
            /* JADX WARN: Code restructure failed: missing block: B:157:0x0303, code lost:
            
                r8 = defpackage.awui.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:158:0x0305, code lost:
            
                r8 = r4.b(r7, r8);
                r9 = r3.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x030b, code lost:
            
                if (r9 != null) goto L133;
             */
            /* JADX WARN: Code restructure failed: missing block: B:160:0x030d, code lost:
            
                r9 = defpackage.awui.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:161:0x030f, code lost:
            
                r10 = r3.e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:162:0x0311, code lost:
            
                if (r10 != null) goto L136;
             */
            /* JADX WARN: Code restructure failed: missing block: B:163:0x0313, code lost:
            
                r10 = defpackage.awxf.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:164:0x0315, code lost:
            
                r9 = defpackage.awmr.d(r8, r4.c(r7, r9, r10, r2), "update");
             */
            /* JADX WARN: Code restructure failed: missing block: B:166:0x031f, code lost:
            
                r3 = defpackage.awwp.b(r3.d);
             */
            /* JADX WARN: Code restructure failed: missing block: B:167:0x0325, code lost:
            
                if (r3 != null) goto L140;
             */
            /* JADX WARN: Code restructure failed: missing block: B:168:0x0327, code lost:
            
                r3 = defpackage.awwp.UNKNOWN_STATE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:171:0x0344, code lost:
            
                if (((defpackage.bczy) r4.c.b()).am(r2.f(), r8.S(), new defpackage.bdgi(r3)) != false) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:172:0x0346, code lost:
            
                ((defpackage.ensz) ((defpackage.ensz) defpackage.awmr.a.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "updateParticipantInGroup", 446, "ParticipantsGroupMetadataProcessor.java")).q("Participant not successfully updated in the conversation.");
                r3 = defpackage.awmq.e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:173:0x0375, code lost:
            
                r6 = r6.c(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:174:0x0379, code lost:
            
                r9.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:175:0x0381, code lost:
            
                if (((defpackage.awjq) r6).a != false) goto L203;
             */
            /* JADX WARN: Code restructure failed: missing block: B:178:0x035e, code lost:
            
                ((defpackage.ensz) ((defpackage.ensz) defpackage.awmr.a.e()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ParticipantsGroupMetadataProcessor", "updateParticipantInGroup", 450, "ParticipantsGroupMetadataProcessor.java")).q("Participant successfully updated in the conversation.");
                r3 = defpackage.awmq.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:180:0x0384, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:183:0x0386, code lost:
            
                r9.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:185:?, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:186:0x038a, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:187:0x038b, code lost:
            
                r0.addSuppressed(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:188:0x038e, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x01a6, code lost:
            
                r1 = r3.c.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x01b2, code lost:
            
                if (r1.hasNext() == false) goto L199;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x01b4, code lost:
            
                r8 = (defpackage.awyh) r1.next();
                r9 = r8.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x01bc, code lost:
            
                if (r9 != null) goto L75;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x01be, code lost:
            
                r9 = defpackage.awxf.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x01c0, code lost:
            
                r10 = r8.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x01c2, code lost:
            
                if (r10 != null) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x01c4, code lost:
            
                r10 = defpackage.awui.a;
             */
            @Override // defpackage.emwl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r28) {
                /*
                    Method dump skipped, instructions count: 978
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.awml.apply(java.lang.Object):java.lang.Object");
            }
        }, this.b).i(new eroh() { // from class: awmm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                if (!ceytVar.e()) {
                    return elfo.e(ceytVar);
                }
                final awws awwsVar2 = awwsVar;
                final ConversationIdType conversationIdType2 = conversationIdType;
                final awxc awxcVar2 = awxcVar;
                awmr awmrVar = awmr.this;
                Stream map = Collection.EL.stream((Set) awmrVar.g.b()).map(new Function() { // from class: awmn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        awmk awmkVar = (awmk) obj2;
                        entd entdVar = awmr.a;
                        awui awuiVar = awxc.this.l;
                        if (awuiVar == null) {
                            awuiVar = awui.a;
                        }
                        return awmkVar.a(awuiVar, conversationIdType2, awwsVar2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                return elfo.j((Iterable) map.collect(endq.a)).a(new Callable() { // from class: awmo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ceyt.i();
                    }
                }, awmrVar.b);
            }
        }, this.b);
    }

    public final ParticipantsTable.BindData b(Set set, awui awuiVar) {
        bvpo e = e(awuiVar.d);
        f(set, e);
        return e.a();
    }

    public final ParticipantsTable.BindData c(Set set, awui awuiVar, awxf awxfVar, awkh awkhVar) {
        String str = awuiVar.d;
        if ((awxfVar.b & 1) != 0) {
            awui awuiVar2 = awxfVar.c;
            String str2 = (awuiVar2 == null ? awui.a : awuiVar2).d;
            if (awuiVar2 == null) {
                awuiVar2 = awui.a;
            }
            if (awuiVar2.equals(awkhVar.c())) {
                ParticipantsTable.BindData b = ((bdrr) this.h.b()).b(((SelfIdentityIdImpl) awkhVar.b()).a);
                b.getClass();
                return b;
            }
            str = str2;
        }
        bvpo e = e(str);
        f(set, e);
        return e.a();
    }
}
