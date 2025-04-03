package defpackage;

import android.net.Uri;
import android.provider.BlockedNumberContract;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crqf {
    public static final /* synthetic */ int c = 0;
    private static final Uri d;
    private static final String[] e;
    public final ffbr a;
    public volatile boolean b;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffsk q;
    private final emar r;
    private volatile Set s;

    static {
        Uri uri;
        uri = BlockedNumberContract.BlockedNumbers.CONTENT_URI;
        d = uri;
        e = new String[]{"e164_number", "original_number"};
    }

    public crqf(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        ffbrVar13.getClass();
        ffskVar.getClass();
        this.f = ffbrVar;
        this.a = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = ffbrVar8;
        this.l = ffbrVar9;
        this.m = ffbrVar10;
        this.n = ffbrVar11;
        this.o = ffbrVar12;
        this.p = ffbrVar13;
        this.q = ffskVar;
        this.r = new emar();
        this.s = ffen.a;
    }

    private final void f(Set set, boolean z) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e((String) it.next(), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[Catch: all -> 0x002d, TryCatch #3 {all -> 0x002d, blocks: (B:11:0x0029, B:12:0x006e, B:13:0x0079, B:15:0x007f, B:18:0x008f, B:23:0x0093), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.crqa
            if (r0 == 0) goto L13
            r0 = r10
            crqa r0 = (defpackage.crqa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crqa r0 = new crqa
            r0.<init>(r9, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            ekzz r1 = r6.e
            crqf r2 = r6.d
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L2d
            goto L6e
        L2d:
            r0 = move-exception
            goto L9f
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            defpackage.ffci.b(r10)
            java.lang.String r10 = "BlockListResolver#getUpdatedList#querySystem"
            ekzz r10 = defpackage.eleg.f(r10)
            ffbr r1 = r9.m     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L9c
            ejmh r1 = (defpackage.ejmh) r1     // Catch: java.lang.Throwable -> L9c
            r3 = r2
            android.net.Uri r2 = defpackage.crqf.d     // Catch: java.lang.Throwable -> L9c
            r2.getClass()     // Catch: java.lang.Throwable -> L9c
            r4 = r3
            java.lang.String[] r3 = defpackage.crqf.e     // Catch: java.lang.Throwable -> L9c
            r5 = r4
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L9c
            r4.<init>()     // Catch: java.lang.Throwable -> L9c
            r8 = r5
            crqb r5 = new crqb     // Catch: java.lang.Throwable -> L9c
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L9c
            r6.d = r9     // Catch: java.lang.Throwable -> L9c
            r6.e = r10     // Catch: java.lang.Throwable -> L9c
            r6.c = r8     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r1 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9c
            if (r1 == r0) goto L9b
            r2 = r1
            r1 = r10
            r10 = r2
            r2 = r9
        L6e:
            engw r10 = (defpackage.engw) r10     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L2d
        L79:
            boolean r3 = r10.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L93
            java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> L2d
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L2d
            r4.getClass()     // Catch: java.lang.Throwable -> L2d
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L2d
            if (r4 <= 0) goto L79
            r0.add(r3)     // Catch: java.lang.Throwable -> L2d
            goto L79
        L93:
            java.util.Set r10 = defpackage.ffdx.ar(r0)     // Catch: java.lang.Throwable -> L2d
            defpackage.ffig.a(r1, r7)
            return r10
        L9b:
            return r0
        L9c:
            r0 = move-exception
            r2 = r9
            r1 = r10
        L9f:
            r10 = r0
            ffbr r0 = r2.l     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> Lb3
            cfyt r0 = (defpackage.cfyt) r0     // Catch: java.lang.Throwable -> Lb3
            elfl r10 = r0.b(r10)     // Catch: java.lang.Throwable -> Lb3
            defpackage.axnw.h(r10)     // Catch: java.lang.Throwable -> Lb3
            defpackage.ffig.a(r1, r7)
            return r7
        Lb3:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r0 = move-exception
            defpackage.ffig.a(r1, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crqf.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[Catch: all -> 0x0045, TryCatch #2 {all -> 0x0045, blocks: (B:29:0x0041, B:30:0x00a6, B:32:0x00ae, B:33:0x00bb), top: B:28:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crqf.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.crqd
            if (r0 == 0) goto L13
            r0 = r6
            crqd r0 = (defpackage.crqd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crqd r0 = new crqd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            crqf r0 = r0.d
            defpackage.ffci.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ffci.b(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r5.a(r0)
            if (r6 == r1) goto L71
            r0 = r5
        L3f:
            java.util.Set r6 = (java.util.Set) r6
            if (r6 != 0) goto L46
            ffcu r6 = defpackage.ffcu.a
            return r6
        L46:
            java.lang.String r1 = "BlockListResolver#resolve#transformNewBlockList"
            ekzz r1 = defpackage.eleg.f(r1)
            java.util.Set r2 = r0.s     // Catch: java.lang.Throwable -> L6a
            r0.s = r6     // Catch: java.lang.Throwable -> L6a
            java.util.Set r6 = r0.s     // Catch: java.lang.Throwable -> L6a
            java.util.Set r6 = defpackage.ffdx.ap(r6, r2)     // Catch: java.lang.Throwable -> L6a
            java.util.Set r4 = r0.s     // Catch: java.lang.Throwable -> L6a
            java.util.Set r2 = defpackage.ffdx.ap(r2, r4)     // Catch: java.lang.Throwable -> L6a
            r0.f(r6, r3)     // Catch: java.lang.Throwable -> L6a
            r6 = 0
            r0.f(r2, r6)     // Catch: java.lang.Throwable -> L6a
            r6 = 0
            defpackage.ffig.a(r1, r6)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L6a:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L6c
        L6c:
            r0 = move-exception
            defpackage.ffig.a(r1, r6)
            throw r0
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crqf.c(ffgu):java.lang.Object");
    }

    public final void d() {
        axnw.h(axol.a(emau.a(this.q, this.r, new crqe(this, null))));
    }

    public final void e(String str, boolean z) {
        ParticipantsTable.BindData d2 = ((bdrr) this.j.b()).d(str);
        ConversationIdType conversationIdType = (ConversationIdType) ((ayif) this.i.b()).o(str).orElseGet(new Supplier() { // from class: crpx
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = crqf.c;
                return bdgq.a;
            }
        });
        cugj b = ((cugi) this.o.b()).b(d2, ((bczy) this.p.b()).s(conversationIdType));
        str.getClass();
        ((crrm) this.f.b()).b(crqj.a(z, str, true, true, b, 3, 8, 2));
        if (z || d2 == null || !d2.ab() || !cuky.a(d2.n()).c()) {
            return;
        }
        if (!conversationIdType.b()) {
            ((cucf) this.h.b()).b(cuch.b(false, conversationIdType, d2.S(), null, true, true, eoko.CONVERSATION_FROM_UNBLOCK_ACTION, b, null, 8, 8));
            return;
        }
        if (!culg.b().booleanValue()) {
            ((culp) this.k.b()).m(d2.S(), null, cukx.b, false);
            return;
        }
        String S = d2.S();
        if (S == null || ffpc.J(S)) {
            return;
        }
        culp culpVar = (culp) this.k.b();
        String S2 = d2.S();
        String S3 = d2.S();
        S3.getClass();
        culpVar.m(S2, new cuvc(S3), cukx.b, false);
    }
}
