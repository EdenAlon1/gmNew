package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarCollections;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqqu implements aqqc {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactDataServiceImpl");
    private static final ecda e = new ecda("RecipientSyncDestinationMatchLatency");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final aolr f;
    private final ffbr g;
    private final ffbr h;
    private final ffsk i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;

    public aqqu(aolr aolrVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14) {
        aolrVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        ffbrVar13.getClass();
        ffbrVar14.getClass();
        this.f = aolrVar;
        this.b = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffskVar;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.m = ffbrVar7;
        this.n = ffbrVar8;
        this.o = ffbrVar9;
        this.p = ffbrVar10;
        this.q = ffbrVar11;
        this.r = ffbrVar12;
        this.c = ffbrVar13;
        this.d = ffbrVar14;
    }

    static /* synthetic */ Object n(aqqu aqquVar, engw engwVar, engw engwVar2, ffgu ffguVar, int i) {
        if (1 == (i & 1)) {
            engwVar = null;
        }
        if ((i & 2) != 0) {
            engwVar2 = null;
        }
        return aqquVar.i(engwVar, engwVar2, ffguVar);
    }

    public static final List o(Collection collection) {
        return ffdx.ah(collection, new aqqp());
    }

    private final void q(bvpo bvpoVar, axwi axwiVar, aqqk aqqkVar) {
        long j = bvpoVar.q;
        if (j < 0) {
            aqqkVar.a++;
        } else if (j == axwiVar.b) {
            aqqkVar.b++;
        } else {
            aqqkVar.c++;
        }
        cjzf cjzfVar = (cjzf) this.g.b();
        Uri uri = axwiVar.p;
        if (uri != null) {
            Integer num = axwiVar.q;
            if (num != null) {
                Uri build = uri.buildUpon().appendQueryParameter("photoIdTag", String.valueOf(num.intValue())).build();
                if (build != null) {
                    uri = build;
                }
            }
        } else {
            uri = null;
        }
        cjzfVar.a(bvpoVar, uri != null ? uri.toString() : null);
        cjzf.b(bvpoVar, axwiVar.d, axwiVar.h);
        bvpoVar.l(axwiVar.b);
        bvpoVar.k(k(axwiVar));
        bvpoVar.D(axwiVar.c);
        Uri uri2 = axwiVar.p;
        if (TextUtils.isEmpty(uri2 != null ? uri2.toString() : null)) {
            ((bdqo) this.b.b()).c(bvpoVar);
        } else {
            bdqo.d(bvpoVar, new ParticipantColor(0, bdqo.a(bvpoVar.a()).b, 0));
        }
        bvpoVar.i(bvpoVar.t);
        bvpoVar.h(bvpoVar.s);
        bvpoVar.s(bvpoVar.u);
        aqkq aqkqVar = (aqkq) aqkt.a.createBuilder();
        aqkqVar.getClass();
        for (axzb axzbVar : axwiVar.u) {
            DesugarCollections.unmodifiableList(((aqkt) aqkqVar.instance).b).getClass();
            aqkr aqkrVar = (aqkr) aqks.a.createBuilder();
            aqkrVar.getClass();
            long j2 = axzbVar.a;
            aqkrVar.copyOnWrite();
            aqks aqksVar = (aqks) aqkrVar.instance;
            aqksVar.b |= 1;
            aqksVar.c = j2;
            String str = axzbVar.b;
            aqkrVar.copyOnWrite();
            aqks aqksVar2 = (aqks) aqkrVar.instance;
            aqksVar2.b |= 2;
            aqksVar2.d = str;
            eyfy build2 = aqkrVar.build();
            build2.getClass();
            aqks aqksVar3 = (aqks) build2;
            aqkqVar.copyOnWrite();
            aqkt aqktVar = (aqkt) aqkqVar.instance;
            eygr eygrVar = aqktVar.b;
            if (!eygrVar.c()) {
                aqktVar.b = eyfy.mutableCopy(eygrVar);
            }
            aqktVar.b.add(aqksVar3);
        }
        eyfy build3 = aqkqVar.build();
        build3.getClass();
        bvpoVar.m((aqkt) build3);
        if (((atfe) this.d.b()).a()) {
            bvpoVar.x(ContactsContract.Contacts.isEnterpriseContactId(axwiVar.b));
        }
    }

    private final void r(bvpo bvpoVar) {
        if (bvpoVar.I != -1 && !csqy.e().contains(Long.valueOf(bvpoVar.I))) {
            bvpoVar.l(-2L);
        } else if (bvpoVar.Q == cjwi.PROFILE_PEOPLE_SHARING_SOURCE) {
            bvpoVar.l(-2L);
            bvpoVar.D(null);
            bvpoVar.k(null);
            bvpoVar.W(0);
            bvpoVar.p(-1L);
            bvpoVar.u(null);
            bvpoVar.t(null);
            bvpoVar.G(cjwi.PROFILE_UNSPECIFIED_SOURCE);
            bvpoVar.n(null);
            bvpoVar.m(null);
            if (((atfe) this.d.b()).a()) {
                bvpoVar.x(false);
            }
        } else {
            bvpoVar.l(-2L);
            bvpoVar.D(null);
            bvpoVar.k(null);
            bvpoVar.W(0);
            bvpoVar.p(-1L);
            bvpoVar.u(null);
            bvpoVar.t(null);
            bvpoVar.G(cjwi.PROFILE_UNSPECIFIED_SOURCE);
            bvpoVar.K(cjwi.PROFILE_UNSPECIFIED_SOURCE);
            bvpoVar.n(null);
            bvpoVar.N(null);
            bvpoVar.m(null);
            if (((atfe) this.d.b()).a()) {
                bvpoVar.x(false);
            }
        }
        if (bvpoVar.t != 2) {
            ((bdqo) this.b.b()).c(bvpoVar);
        }
    }

    private final void s(int i, int i2) {
        ((akzt) this.h.b()).f("Bugle.Recipient.Sync.Result.Count", i, i2);
    }

    @Override // defpackage.aqqc
    public final elfl a(engw engwVar) {
        elfl c;
        c = axol.c(this.i, ffhe.a, ffsm.a, new aqqr(this, engwVar, null));
        return c;
    }

    @Override // defpackage.aqqc
    public final elfl b(enip enipVar) {
        elfl c;
        c = axol.c(this.i, ffhe.a, ffsm.a, new aqqs(this, enipVar, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0115, code lost:
    
        if (r1 != r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // defpackage.aqqc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqqu.c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0229  */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    @Override // defpackage.aqqc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.bvpo r15) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqqu.d(bvpo):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqqu.e(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.Set r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aqqm
            if (r0 == 0) goto L13
            r0 = r6
            aqqm r0 = (defpackage.aqqm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqqm r0 = new aqqm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            r0.c = r3
            java.lang.Object r6 = r4.h(r5, r0)
            if (r6 == r1) goto L70
        L3a:
            java.util.List r6 = (java.util.List) r6
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L45:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r1 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r1
            long r1 = r1.u()
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            java.lang.Object r1 = r5.get(r3)
            if (r1 != 0) goto L69
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.put(r3, r1)
        L69:
            java.util.List r1 = (java.util.List) r1
            r1.add(r0)
            goto L45
        L6f:
            return r5
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqqu.f(java.util.Set, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6 A[Catch: all -> 0x003e, TryCatch #6 {all -> 0x003e, blocks: (B:11:0x0037, B:13:0x00d1, B:14:0x00e0, B:16:0x00e6, B:17:0x0105, B:19:0x010b, B:21:0x0123, B:23:0x0129, B:24:0x012d, B:26:0x0133, B:37:0x0172, B:28:0x0150, B:30:0x015a, B:32:0x0160, B:34:0x0168), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0133 A[Catch: all -> 0x003e, TryCatch #6 {all -> 0x003e, blocks: (B:11:0x0037, B:13:0x00d1, B:14:0x00e0, B:16:0x00e6, B:17:0x0105, B:19:0x010b, B:21:0x0123, B:23:0x0129, B:24:0x012d, B:26:0x0133, B:37:0x0172, B:28:0x0150, B:30:0x015a, B:32:0x0160, B:34:0x0168), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.engw r17, java.util.Map r18, java.util.List r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqqu.g(engw, java.util.Map, java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(final java.util.Set r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aqqo
            if (r0 == 0) goto L13
            r0 = r6
            aqqo r0 = (defpackage.aqqo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqqo r0 = new aqqo
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L57
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            bvvn r6 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.e()
            java.lang.String r2 = "getRecipientsByContactIdsQuery"
            r6.z(r2)
            aqqh r2 = new aqqh
            r2.<init>()
            r6.h(r2)
            bvvl r5 = r6.b()
            elfl r5 = r5.w()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqqu.h(java.util.Set, ffgu):java.lang.Object");
    }

    public final Object i(final engw engwVar, final engw engwVar2, ffgu ffguVar) {
        final ArrayList arrayList = new ArrayList();
        ((azei) this.k.b()).d(new Consumer() { // from class: aqqg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [engw, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r1v4, types: [ffel] */
            /* JADX WARN: Type inference failed for: r5v1, types: [aqqx, java.lang.Object] */
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ?? r5 = (aqqx) obj;
                r5.getClass();
                List list = arrayList;
                ?? r1 = engw.this;
                if (r1 != 0) {
                    list.add(r5.b(r1));
                }
                List list2 = engwVar2;
                if (list2 != null) {
                    list.add(r5.c());
                }
                if ((r1 == 0 || r1.isEmpty()) && (list2 == null || list2.isEmpty())) {
                    return;
                }
                if (r1 == 0) {
                    r1 = ffel.a;
                }
                if (list2 == null) {
                    list2 = ffel.a;
                }
                list.add(r5.a(engq.a(ffdx.ad(r1, list2))));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(axol.e((elfl) it.next()));
        }
        Object a2 = ffqv.a(arrayList2, ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.Map r7, defpackage.aqqk r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.aqqt
            if (r0 == 0) goto L13
            r0 = r9
            aqqt r0 = (defpackage.aqqt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqqt r0 = new aqqt
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r9)
            goto L95
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.ffci.b(r9)
            java.util.Set r7 = r7.entrySet()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        L3f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r4 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r4
            java.lang.Object r2 = r2.getValue()
            axwi r2 = (defpackage.axwi) r2
            bvpo r5 = r4.C()
            r6.q(r5, r2, r8)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r2 = r5.a()
            r2.getClass()
            boolean r4 = defpackage.ffkj.e(r2, r4)
            if (r3 != r4) goto L6c
            r2 = 0
        L6c:
            if (r2 == 0) goto L3f
            r9.add(r2)
            goto L3f
        L72:
            engw r7 = defpackage.engq.a(r9)
            ffbr r8 = r6.m
            java.lang.Object r8 = r8.b()
            cbwj r8 = (defpackage.cbwj) r8
            aqqf r9 = new aqqf
            r9.<init>()
            java.lang.String r7 = "RecipientContactDataServiceImpl#updateRecipientsContactData"
            elfl r7 = r8.a(r7, r9)
            r7.getClass()
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r7, r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqqu.j(java.util.Map, aqqk, ffgu):java.lang.Object");
    }

    public final String k(axwi axwiVar) {
        String str = axwiVar.j;
        return str == null ? axwiVar.l : str;
    }

    public final void l(int i) {
        ((akzt) this.h.b()).e("Bugle.Recipient.Sync.RecipientsUnmatched.Count", i);
        ctwb ctwbVar = (ctwb) this.j.b();
        if (ctwbVar.h(ctwbVar.c()).C()) {
            ((akzt) this.h.b()).e("Bugle.Recipient.Sync.RecipientsUnmatchedRoaming.Count", i);
        }
    }

    public final void m(aqqk aqqkVar) {
        int i = aqqkVar.d;
        if (i > 0) {
            s(5, i);
            if (aqqkVar.d >= ((int) ((Number) this.l.b()).longValue())) {
                s(6, 1);
            }
        }
        int i2 = aqqkVar.c;
        if (i2 > 0) {
            s(4, i2);
        }
        int i3 = aqqkVar.a;
        if (i3 > 0) {
            s(3, i3);
        }
        int i4 = aqqkVar.b;
        if (i4 > 0) {
            int i5 = ((aqqkVar.c + aqqkVar.a) + i4) - aqqkVar.e;
            int i6 = i4 - i5;
            if (i6 > 0) {
                s(2, i6);
            }
            if (i5 > 0) {
                s(1, i5);
            }
        }
        int i7 = aqqkVar.f;
        if (i7 > 0) {
            s(7, i7);
        }
        int i8 = aqqkVar.g;
        if (i8 > 0) {
            s(8, i8);
        }
    }

    public final List p(final List list, int i, final enip enipVar) {
        bvvr f = ParticipantsTable.f();
        f.ap("updateContactInfo");
        f.V(new Function() { // from class: aqqj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.m(list);
                if (((atey) this.c.b()).a()) {
                    bvvwVar.j(enipVar);
                }
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f.n(-2L);
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                f.D();
                f.m();
                f.T(0);
                f.q(-1L);
                f.w();
                f.u();
                f.F(cjwi.PROFILE_UNSPECIFIED_SOURCE);
                f.J(cjwi.PROFILE_UNSPECIFIED_SOURCE);
                f.p();
                f.N();
                f.o();
                if (((atfe) this.d.b()).a()) {
                    f.y();
                }
            } else {
                f.D();
                f.m();
                f.T(0);
                f.q(-1L);
                f.w();
                f.u();
                f.F(cjwi.PROFILE_UNSPECIFIED_SOURCE);
                f.p();
                f.o();
                if (((atfe) this.d.b()).a()) {
                    f.y();
                }
            }
        }
        f.am();
        engw b = f.b().b();
        b.getClass();
        return b;
    }
}
