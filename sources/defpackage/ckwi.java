package defpackage;

import android.content.Context;
import android.os.BatteryManager;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwi implements ekrm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet");
    public final ffsk b;
    public final Context c;
    public final ctvs d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final coxk i;
    public final bdtd j;
    public final dtuu k;
    public final ffbr l;
    public final ffbr m;
    public final effy n;
    public final cqoh o;
    public final ffbz p;
    private final ffhd q;
    private final akzt r;
    private final aolr s;
    private final ayif t;
    private final aqvh u;
    private final ffbr v;
    private final csiy w;

    public ckwi(ffsk ffskVar, ffhd ffhdVar, csiy csiyVar, Context context, akzt akztVar, ctvs ctvsVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, coxk coxkVar, aolr aolrVar, ayif ayifVar, bdtd bdtdVar, aqvh aqvhVar, dtuu dtuuVar, ffbr ffbrVar5, ffbr ffbrVar6, effy effyVar, cqoh cqohVar, ffbr ffbrVar7) {
        ffskVar.getClass();
        ffhdVar.getClass();
        csiyVar.getClass();
        context.getClass();
        akztVar.getClass();
        ctvsVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        coxkVar.getClass();
        aolrVar.getClass();
        ayifVar.getClass();
        bdtdVar.getClass();
        aqvhVar.getClass();
        dtuuVar.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        effyVar.getClass();
        cqohVar.getClass();
        ffbrVar7.getClass();
        this.b = ffskVar;
        this.q = ffhdVar;
        this.w = csiyVar;
        this.c = context;
        this.r = akztVar;
        this.d = ctvsVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = coxkVar;
        this.s = aolrVar;
        this.t = ayifVar;
        this.j = bdtdVar;
        this.u = aqvhVar;
        this.k = dtuuVar;
        this.l = ffbrVar5;
        this.m = ffbrVar6;
        this.n = effyVar;
        this.o = cqohVar;
        this.v = ffbrVar7;
        this.p = ffca.a(new ffix() { // from class: ckve
            @Override // defpackage.ffix
            public final Object invoke() {
                Object systemService = ckwi.this.c.getSystemService("batterymanager");
                systemService.getClass();
                return (BatteryManager) systemService;
            }
        });
    }

    public static final List i(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
            ArrayList arrayList2 = new ArrayList(ffdx.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ParticipantsTable.BindData) it.next()).S());
            }
            if (!arrayList2.contains(bindData.S())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ekrm
    public final /* bridge */ /* synthetic */ ListenableFuture a() {
        elfl c;
        ekzz f = eleg.f("RepairForkedMmsGroupSynclet#sync");
        try {
            c = axol.c(this.b, ffhe.a, ffsm.a, new ckwg(this, null));
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x012e, code lost:
    
        if (r1 != r3) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0270 A[LOOP:1: B:26:0x026a->B:28:0x0270, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0168 -> B:30:0x016d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckwi.b(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ckvp
            if (r0 == 0) goto L13
            r0 = r7
            ckvp r0 = (defpackage.ckvp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckvp r0 = new ckvp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.ffci.b(r7)
            goto L59
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.ffci.b(r7)
            java.lang.String[] r7 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.a
            buxz r7 = new buxz
            r7.<init>()
            r7.m(r6)
            r6 = 100
            r7.af(r6)
            r7.ad()
            buxs r6 = new buxs
            r6.<init>(r7)
            ffhd r7 = r5.q
            ckvq r2 = new ckvq
            r2.<init>(r5, r6, r3)
            r0.c = r4
            java.lang.Object r7 = defpackage.ekxl.a(r7, r2, r0)
            if (r7 == r1) goto L63
        L59:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r7 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r7
            if (r7 == 0) goto L62
            android.net.Uri r6 = r7.u()
            return r6
        L62:
            return r3
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckwi.c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ckvr
            if (r0 == 0) goto L13
            r0 = r6
            ckvr r0 = (defpackage.ckvr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckvr r0 = new ckvr
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.q
            ckvu r2 = new ckvu
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.ekxl.a(r6, r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckwi.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b A[LOOP:1: B:22:0x0095->B:24:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ckvv
            if (r0 == 0) goto L13
            r0 = r5
            ckvv r0 = (defpackage.ckvv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckvv r0 = new ckvv
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            effy r5 = r4.n
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto Lae
        L43:
            ckwl r5 = (defpackage.ckwl) r5
            eyhm r5 = r5.d
            java.util.Map r5 = j$.util.DesugarCollections.unmodifiableMap(r5)
            r5.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L5b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.getClass()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L5b
        L82:
            java.util.Set r5 = r0.keySet()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ffdx.n(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L95:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = defpackage.bdgq.b(r1)
            r0.add(r1)
            goto L95
        La9:
            java.util.Set r5 = defpackage.ffdx.ar(r0)
            return r5
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckwi.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.bseh r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ckvx
            if (r0 == 0) goto L13
            r0 = r7
            ckvx r0 = (defpackage.ckvx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckvx r0 = new ckvx
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.ffci.b(r7)
            goto L6c
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.ffci.b(r7)
            java.lang.String r6 = r6.S()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r6 = defpackage.aqvf.c(r6)
            if (r6 != 0) goto L5e
            enru r6 = defpackage.ckwi.a
            ensk r6 = r6.j()
            ensn r7 = defpackage.ente.a
            java.lang.String r0 = "BugleGroupManagement"
            r6.Y(r7, r0)
            java.lang.String r7 = "getSelfMessagingIdentity"
            r0 = 319(0x13f, float:4.47E-43)
            java.lang.String r1 = "com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet"
            java.lang.String r2 = "RepairForkedMmsGroupSynclet.kt"
            ensk r6 = r6.h(r1, r7, r0, r2)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r7 = "Current self id is not present."
            r6.q(r7)
            return r3
        L5e:
            aqvh r7 = r5.u
            elfl r6 = r7.d(r6)
            r0.c = r4
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 == r1) goto L87
        L6c:
            r7.getClass()
            j$.util.Optional r7 = (j$.util.Optional) r7
            java.lang.Object r6 = defpackage.fflm.b(r7)
            aqux r6 = (defpackage.aqux) r6
            if (r6 == 0) goto L86
            j$.util.Optional r6 = r6.m()
            if (r6 == 0) goto L86
            java.lang.Object r6 = defpackage.fflm.b(r6)
            aoku r6 = (defpackage.aoku) r6
            return r6
        L86:
            return r3
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckwi.f(bseh, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ckvz
            if (r0 == 0) goto L13
            r0 = r5
            ckvz r0 = (defpackage.ckvz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckvz r0 = new ckvz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ckwi r0 = r0.d
            defpackage.ffci.b(r5)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            effy r5 = r4.n
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a()
            r5.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L79
            r0 = r4
        L48:
            ckwl r5 = (defpackage.ckwl) r5
            eyja r5 = r5.c
            if (r5 != 0) goto L50
            eyja r5 = defpackage.eyja.a
        L50:
            r5.getClass()
            j$.time.Instant r5 = defpackage.eykn.d(r5)
            ffbr r1 = r0.v
            java.lang.Object r1 = r1.b()
            r1.getClass()
            eyev r1 = (defpackage.eyev) r1
            j$.time.Duration r1 = defpackage.eykn.c(r1)
            j$.time.Instant r5 = r5.plus(r1)
            cqoh r0 = r0.o
            j$.time.Instant r0 = r0.f()
            boolean r5 = r5.isBefore(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckwi.g(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x026d, code lost:
    
        if (r0 == r3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02a4, code lost:
    
        if (r0 != r3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013b, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.bseh r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckwi.h(bseh, ffgu):java.lang.Object");
    }
}
