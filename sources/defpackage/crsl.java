package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crsl {
    public static final emyl a = cfvl.y("spam_report_removed_sender");
    public final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffsk g;

    public crsl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffskVar.getClass();
        this.c = ffbrVar;
        this.b = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffskVar;
    }

    private final ParticipantsTable.BindData e(MessageCoreData messageCoreData, List list, Map map) {
        Object q;
        if (messageCoreData == null) {
            return null;
        }
        if (map.containsKey(messageCoreData.aA())) {
            return (ParticipantsTable.BindData) map.get(messageCoreData.aA());
        }
        if (messageCoreData.ag().isPresent()) {
            q = messageCoreData.ag().get();
        } else {
            ParticipantsTable.BindData b = ((bdrr) this.c.b()).b(messageCoreData.aA());
            if (b == null) {
                return null;
            }
            q = ((aolr) this.f.b()).q(b);
        }
        if (list.contains(q)) {
            return null;
        }
        return ((bdrr) this.c.b()).b(messageCoreData.aA());
    }

    private final List f(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            if (!list2.contains(((aolr) this.f.b()).q(bindData))) {
                arrayList.add(bindData);
            }
        }
        return arrayList;
    }

    public final elfl a(ConversationIdType conversationIdType) {
        elfl c;
        conversationIdType.getClass();
        c = axol.c(this.g, ffhe.a, ffsm.a, new crsi(this, conversationIdType, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crsl.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.crsj
            if (r0 == 0) goto L13
            r0 = r5
            crsj r0 = (defpackage.crsj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crsj r0 = new crsj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.e
            java.lang.Object r5 = r5.b()
            aqvh r5 = (defpackage.aqvh) r5
            aqge r5 = r5.c()
            elfl r5 = r5.b()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L78
        L4d:
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L5b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r5.next()
            aqux r1 = (defpackage.aqux) r1
            j$.util.Optional r1 = r1.m()
            java.lang.Object r1 = defpackage.fflm.b(r1)
            aoku r1 = (defpackage.aoku) r1
            if (r1 == 0) goto L5b
            r0.add(r1)
            goto L5b
        L77:
            return r0
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crsl.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.crsk
            if (r0 == 0) goto L13
            r0 = r9
            crsk r0 = (defpackage.crsk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crsk r0 = new crsk
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            enou r8 = r0.e
            crsl r0 = r0.d
            defpackage.ffci.b(r9)
            goto L46
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.ffci.b(r9)
            r0.d = r7
            r9 = r8
            enou r9 = (defpackage.enou) r9
            r0.e = r9
            r0.c = r3
            java.lang.Object r9 = r7.c(r0)
            if (r9 == r1) goto Lc6
            r0 = r7
        L46:
            java.util.List r9 = (java.util.List) r9
            java.util.List r8 = r0.f(r8, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r8.size()
            java.util.Iterator r8 = r8.iterator()
        L63:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L9a
            java.lang.Object r4 = r8.next()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r4 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r4
            boolean r5 = r4.Y()
            if (r5 == 0) goto L78
            r9.add(r4)
        L78:
            boolean r5 = r4.ab()
            if (r5 == 0) goto L63
            int r5 = r4.n()
            cukz r5 = defpackage.cuky.a(r5)
            boolean r6 = r5.c()
            if (r6 == 0) goto L90
            r0.add(r4)
            goto L63
        L90:
            boolean r5 = r5.d()
            if (r5 == 0) goto L63
            r1.add(r4)
            goto L63
        L9a:
            r8 = 0
            if (r2 != r3) goto Laa
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto Laa
            java.lang.Object r8 = r9.get(r8)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r8 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r8
            return r8
        Laa:
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto Lb7
            java.lang.Object r8 = r0.get(r8)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r8 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r8
            return r8
        Lb7:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto Lbf
            r8 = 0
            return r8
        Lbf:
            java.lang.Object r8 = r1.get(r8)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r8 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r8
            return r8
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crsl.d(java.util.List, ffgu):java.lang.Object");
    }
}
