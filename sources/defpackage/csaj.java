package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csaj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsMessageObjectFetcher");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final dtuu i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final aszp m;
    public final atad n;
    private final ffbr o;
    private final ffbr p;

    public csaj(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, dtuu dtuuVar, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, aszp aszpVar, atad atadVar) {
        this.b = ffbrVar;
        this.o = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.p = ffbrVar5;
        this.e = ffbrVar6;
        this.f = ffbrVar7;
        this.g = ffbrVar8;
        this.h = ffbrVar9;
        this.i = dtuuVar;
        this.j = ffbrVar10;
        this.k = ffbrVar11;
        this.l = ffbrVar12;
        this.m = aszpVar;
        this.n = atadVar;
    }

    public static final engw g(crzp crzpVar) {
        int i = engw.d;
        engr engrVar = new engr();
        ParticipantsTable.BindData d = crzpVar.d();
        if (d != null) {
            crza.a(d, engrVar);
        }
        ParticipantsTable.BindData e = crzpVar.e();
        if (e != null) {
            crza.a(e, engrVar);
        }
        bseh b = crzpVar.b();
        if (b != null) {
            String R = b.R();
            ConversationIdType C = b.C();
            if (TextUtils.isEmpty(R) && !C.b()) {
                engrVar.h(new csgn(C.a(), 2));
            }
        }
        return engrVar.g();
    }

    public final bseh a(ConversationIdType conversationIdType) {
        return ((bczy) this.p.b()).r(conversationIdType);
    }

    public final ParticipantsTable.BindData b() {
        return ((bdrr) this.d.b()).a();
    }

    public final ParticipantsTable.BindData c(String str) {
        ParticipantsTable.BindData b = ((bdrr) this.d.b()).b(str);
        if (b == null) {
            return null;
        }
        return b.r() != -2 ? b() : b;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.crzp d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r13, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r14, defpackage.bton r15, java.util.List r16, java.util.List r17, defpackage.enhk r18, java.util.List r19, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r20, defpackage.bseh r21) {
        /*
            r12 = this;
            aszp r0 = r12.m
            boolean r0 = r0.a()
            if (r0 == 0) goto L15
            if (r20 != 0) goto Lc
            r0 = 0
            goto L17
        Lc:
            int r0 = r20.r()
            r1 = -2
            if (r0 == r1) goto L15
            r0 = r14
            goto L17
        L15:
            r0 = r20
        L17:
            crtn r1 = new crtn
            r1.<init>()
            int r2 = defpackage.engw.d
            engw r2 = defpackage.enou.a
            r1.b(r2)
            engw r2 = defpackage.enou.a
            r1.d(r2)
            engw r2 = defpackage.enou.a
            r1.c(r2)
            enhk r2 = defpackage.enoz.a
            r1.a(r2)
            if (r13 == 0) goto Lcd
            r1.a = r13
            r1.b = r0
            r1.c = r14
            r13 = r21
            r1.d = r13
            r1.e = r15
            r13 = r16
            r1.b(r13)
            r13 = r17
            r1.d(r13)
            r13 = r19
            r1.c(r13)
            ffbr r13 = r12.l
            java.lang.Object r13 = r13.b()
            ashs r13 = (defpackage.ashs) r13
            boolean r13 = r13.a()
            if (r13 == 0) goto L68
            boolean r13 = defpackage.csgj.a()
            if (r13 == 0) goto L68
            r13 = r18
            r1.a(r13)
        L68:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r3 = r1.a
            if (r3 == 0) goto L8b
            engw r8 = r1.f
            if (r8 == 0) goto L8b
            engw r9 = r1.g
            if (r9 == 0) goto L8b
            enhk r10 = r1.h
            if (r10 == 0) goto L8b
            engw r11 = r1.i
            if (r11 != 0) goto L7d
            goto L8b
        L7d:
            crto r2 = new crto
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r4 = r1.b
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r5 = r1.c
            bseh r6 = r1.d
            bton r7 = r1.e
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L8b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r14 = r1.a
            if (r14 != 0) goto L99
            java.lang.String r14 = " message"
            r13.append(r14)
        L99:
            engw r14 = r1.f
            if (r14 != 0) goto La2
            java.lang.String r14 = " conversationSuggestions"
            r13.append(r14)
        La2:
            engw r14 = r1.g
            if (r14 != 0) goto Lab
            java.lang.String r14 = " spamSources"
            r13.append(r14)
        Lab:
            enhk r14 = r1.h
            if (r14 != 0) goto Lb4
            java.lang.String r14 = " cmsData"
            r13.append(r14)
        Lb4:
            engw r14 = r1.i
            if (r14 != 0) goto Lbd
            java.lang.String r14 = " messageAnnotations"
            r13.append(r14)
        Lbd:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "Missing required properties:"
            java.lang.String r13 = r0.concat(r13)
            r14.<init>(r13)
            throw r14
        Lcd:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r14 = "Null message"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csaj.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, bton, java.util.List, java.util.List, enhk, java.util.List, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, bseh):crzp");
    }

    public final enhk e(MessageIdType messageIdType) {
        enhk enhkVar;
        ekzz f = eleg.f("CmsMessageObjectFetcher#getCmsData");
        try {
            if (((ashs) this.l.b()).a() && csgj.a() && !((Optional) this.g.b()).isEmpty()) {
                enhkVar = enhk.j(((crua) this.h.b()).b((Map) ((Optional) this.g.b()).get(), messageIdType.toString()));
                f.close();
                return enhkVar;
            }
            enhkVar = enoz.a;
            f.close();
            return enhkVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Optional f(final MessageIdType messageIdType) {
        return Optional.ofNullable(((bdmq) this.o.b()).v(messageIdType)).map(new Function() { // from class: csae
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                csaj csajVar = csaj.this;
                ffbr ffbrVar = csajVar.b;
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                ParticipantsTable.BindData b = csajVar.b();
                MessageIdType messageIdType2 = messageIdType;
                bton btonVar = (bton) bdvu.c(messageIdType2).orElse(null);
                ekzz f = eleg.f("ConversationSuggestionDatabaseOperations#getConversationSuggestionsByMessageId");
                try {
                    csix.h();
                    String[] strArr = bsam.a;
                    bsal bsalVar = new bsal();
                    bsalVar.b(messageIdType2);
                    bsak bsakVar = new bsak(bsalVar);
                    csix.h();
                    bsah a2 = bsam.a();
                    a2.z("getConversationSuggestions");
                    a2.k(bsakVar);
                    brzp brzpVar = (brzp) a2.b().o();
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (brzpVar.moveToNext()) {
                            arrayList.add(ctpl.a((bryo) brzpVar.cO()));
                        }
                        brzpVar.close();
                        f.close();
                        Stream map = Collection.EL.stream(arrayList).map(new Function() { // from class: crzq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((RbmSuggestionData) ((SuggestionData) obj2)).b;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = engw.d;
                        List list = (List) map.collect(endq.a);
                        engw f2 = ((culp) csajVar.f.b()).f(messageIdType2, new cuvb(messageIdType2));
                        enhk e = csajVar.e(messageIdType2);
                        engr engrVar = new engr();
                        engrVar.j(ctgv.a(messageIdType2).d);
                        return csajVar.d(messageCoreData, b, btonVar, list, f2, e, engrVar.g(), csajVar.c(messageCoreData.aA()), csajVar.a(messageCoreData.z()));
                    } finally {
                    }
                } finally {
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
