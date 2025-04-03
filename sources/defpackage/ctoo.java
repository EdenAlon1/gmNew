package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctoo implements ctiz {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl");
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    private final ffhd e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;

    public ctoo(ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffhdVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.e = ffhdVar;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.c = ffbrVar6;
    }

    @Override // defpackage.ctiz
    public final epjp a(MessageCoreData messageCoreData) {
        ParticipantsTable.BindData b;
        return (messageCoreData == null || (b = ((bdrr) this.f.b()).b(messageCoreData.aA())) == null) ? epjp.UNKNOWN_REPLY_MODE : bdtd.m(b) ? epjp.CONTINUATION : epjp.REPLY;
    }

    @Override // defpackage.ctiz
    public final fbup b(List list, boolean z, boolean z2) {
        String aA;
        String str;
        list.getClass();
        HashMap hashMap = new HashMap();
        fbuo fbuoVar = (fbuo) fbup.a.createBuilder();
        fbuoVar.getClass();
        bdrr bdrrVar = (bdrr) this.f.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String aA2 = ((MessageCoreData) it.next()).aA();
            if (aA2 != null) {
                arrayList.add(aA2);
            }
        }
        Map n = bdrrVar.n(arrayList);
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                MessageCoreData messageCoreData = (MessageCoreData) list.get(size);
                if (!cbvv.h(messageCoreData.k()) && (aA = messageCoreData.aA()) != null) {
                    long o = messageCoreData.o();
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) n.get(aA);
                    if (bindData == null || !bdtd.m(bindData)) {
                        String str2 = (String) hashMap.get(aA);
                        if (str2 == null) {
                            str2 = String.valueOf(hashMap.size() + 1);
                            hashMap.put(aA, str2);
                        }
                        str = str2;
                    } else {
                        str = z ? String.valueOf(((csxu) this.g.b()).c("android_id", 0L)) : "0";
                    }
                    if (z2) {
                        o = ((o + 30000) / 60000) * 60000;
                    }
                    fbum fbumVar = (fbum) fbun.a.createBuilder();
                    fbumVar.copyOnWrite();
                    fbun fbunVar = (fbun) fbumVar.instance;
                    str.getClass();
                    fbunVar.d = str;
                    fbumVar.copyOnWrite();
                    ((fbun) fbumVar.instance).e = o * 1000;
                    MessageIdType B = messageCoreData.B();
                    ArrayList arrayList2 = ctgv.a(B).d;
                    cskc cskcVar = crnc.a;
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            fbuk fbukVar = (fbuk) it2.next();
                            fbqt b = fbqt.b(fbukVar.e);
                            if (b == null) {
                                b = fbqt.UNRECOGNIZED;
                            }
                            if (b == fbqt.ASSISTANT_ANNOTATION && fbukVar.c == 10) {
                                fbsb fbsbVar = fbsb.a;
                                fbumVar.copyOnWrite();
                                fbun fbunVar2 = (fbun) fbumVar.instance;
                                fbsbVar.getClass();
                                fbunVar2.c = fbsbVar;
                                fbunVar2.b = 34;
                                break;
                            }
                        } else {
                            String ar = messageCoreData.ar();
                            if (ar != null) {
                                fbumVar.copyOnWrite();
                                fbun fbunVar3 = (fbun) fbumVar.instance;
                                fbunVar3.b = 30;
                                fbunVar3.c = ar;
                            }
                        }
                    }
                    if (size == 0) {
                        ensk e = d.e();
                        e.Y(ente.a, "Bugle");
                        ((enrr) e.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "createMessageStream", 243, "SmartsConversationInfoImpl.kt")).r("annotations for target message: %d", arrayList2.size());
                    }
                    fbumVar.a(arrayList2);
                    ctqh ctqhVar = (ctqh) this.h.b();
                    B.getClass();
                    engw d2 = ctqhVar.d(B);
                    ArrayList arrayList3 = new ArrayList();
                    enqv it3 = d2.iterator();
                    while (it3.hasNext()) {
                        SuggestionData suggestionData = (SuggestionData) it3.next();
                        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
                            arrayList3.add(((SmartSuggestionItemSuggestionData) suggestionData).c);
                        }
                    }
                    fbumVar.copyOnWrite();
                    fbun fbunVar4 = (fbun) fbumVar.instance;
                    eygr eygrVar = fbunVar4.g;
                    if (!eygrVar.c()) {
                        fbunVar4.g = eyfy.mutableCopy(eygrVar);
                    }
                    eydl.addAll(arrayList3, fbunVar4.g);
                    fbuoVar.copyOnWrite();
                    fbup fbupVar = (fbup) fbuoVar.instance;
                    fbun fbunVar5 = (fbun) fbumVar.build();
                    fbunVar5.getClass();
                    fbupVar.a();
                    fbupVar.b.add(fbunVar5);
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        eyfy build = fbuoVar.build();
        build.getClass();
        return (fbup) build;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ctiz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cton
            if (r0 == 0) goto L13
            r0 = r8
            cton r0 = (defpackage.cton) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cton r0 = new cton
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L83
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.ffci.b(r8)
            fbxe r8 = defpackage.fbxe.a
            eyfq r8 = r8.createBuilder()
            fbxd r8 = (defpackage.fbxd) r8
            r8.getClass()
            emyl r2 = defpackage.stl.b
            java.lang.Object r2 = r2.get()
            cfup r2 = (defpackage.cfup) r2
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L6f
            emyl r2 = defpackage.ddnm.a
            java.lang.Object r2 = r2.get()
            cfup r2 = (defpackage.cfup) r2
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L6f
            eyfy r7 = r8.build()
            r7.getClass()
            fbxe r7 = (defpackage.fbxe) r7
            return r7
        L6f:
            ffhd r2 = r6.e
            ffhd r2 = defpackage.ekxi.a(r2)
            ctom r4 = new ctom
            r5 = 0
            r4.<init>(r5, r7, r8, r6)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r2, r4, r0)
            if (r8 == r1) goto L89
        L83:
            r8.getClass()
            fbxe r8 = (defpackage.fbxe) r8
            return r8
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctoo.c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }

    @Override // defpackage.ctiz
    public final boolean d(final List list, final int i, final String str) {
        list.getClass();
        if (list.size() < i) {
            ensk j = d.j();
            j.Y(ente.a, "Bugle");
            ((enrr) j.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "isConversationEligibleForSmartReplies", 67, "SmartsConversationInfoImpl.kt")).p(new enrw() { // from class: ctoh
                @Override // defpackage.enrw
                public final Object a() {
                    String c;
                    c = ffpc.c("\n            The conversation's last messages list size (" + list.size() + ") \n            is less than minimum required (" + i + ")\n          ", "|");
                    String format = String.format(str, Arrays.copyOf(new Object[]{c}, 1));
                    format.getClass();
                    return format;
                }
            });
            return false;
        }
        final MessageCoreData messageCoreData = (MessageCoreData) list.get(0);
        if (messageCoreData == null) {
            ensk i2 = d.i();
            i2.Y(ente.a, "Bugle");
            ((enrr) i2.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "isConversationEligibleForSmartReplies", 85, "SmartsConversationInfoImpl.kt")).p(new enrw() { // from class: ctoi
                @Override // defpackage.enrw
                public final Object a() {
                    String format = String.format(str, Arrays.copyOf(new Object[]{"The conversation's latest message is null"}, 1));
                    format.getClass();
                    return format;
                }
            });
            return false;
        }
        if (cbvv.h(messageCoreData.k())) {
            ensk i3 = d.i();
            i3.Y(ente.a, "Bugle");
            ((enrr) i3.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "isConversationEligibleForSmartReplies", 95, "SmartsConversationInfoImpl.kt")).p(new enrw() { // from class: ctoj
                @Override // defpackage.enrw
                public final Object a() {
                    String format = String.format(str, Arrays.copyOf(new Object[]{"The conversation's latest message is a tombstone message"}, 1));
                    format.getClass();
                    return format;
                }
            });
            return false;
        }
        ParticipantsTable.BindData b = ((bdrr) this.f.b()).b(messageCoreData.aA());
        if (b == null) {
            ensk j2 = d.j();
            j2.Y(ente.a, "Bugle");
            ((enrr) j2.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "isConversationEligibleForSmartReplies", 111, "SmartsConversationInfoImpl.kt")).p(new enrw() { // from class: ctok
                @Override // defpackage.enrw
                public final Object a() {
                    String format = String.format(str, Arrays.copyOf(new Object[]{"No participant data for latest participant: ".concat(String.valueOf(messageCoreData.aA()))}, 1));
                    format.getClass();
                    return format;
                }
            });
            return false;
        }
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            if (b.o() == 3) {
                return false;
            }
            engw e = bdrr.e(messageCoreData.z());
            e.getClass();
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ffdx.U(e);
            if (bindData != null && bindData.o() == 3) {
                return false;
            }
        }
        if (!bdqu.n(b)) {
            return (bdqv.d(b) || b.ab()) ? false : true;
        }
        ensk i4 = d.i();
        i4.Y(ente.a, "Bugle");
        ((enrr) i4.h("com/google/android/apps/messaging/shared/util/p2p/impl/SmartsConversationInfoImpl", "isConversationEligibleForSmartReplies", 143, "SmartsConversationInfoImpl.kt")).p(new enrw() { // from class: ctol
            @Override // defpackage.enrw
            public final Object a() {
                String format = String.format(str, Arrays.copyOf(new Object[]{"IncomingOnly participant: ".concat(String.valueOf(messageCoreData.aA()))}, 1));
                format.getClass();
                return format;
            }
        });
        return false;
    }

    @Override // defpackage.ctiz
    public final boolean e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        ParticipantsTable.BindData b = ((bdrr) this.f.b()).b(messageCoreData.aA());
        if (b != null) {
            return bdtd.m(b);
        }
        return false;
    }
}
