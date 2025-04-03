package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdy implements cvfy {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/video/BugleVideoCallingReachabilityUpdater");
    public final ffbr b;
    private final dgea c;
    private final ffsk d;
    private final ffbr e;
    private final ffbr f;
    private final cqoh g;
    private final aswk h;
    private final aswl i;
    private final ffbr j;
    private final ffbr k;

    public cvdy(dgea dgeaVar, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar, aswk aswkVar, aswl aswlVar, ffbr ffbrVar4, ffbr ffbrVar5) {
        dgeaVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        cqohVar.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.c = dgeaVar;
        this.d = ffskVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.b = ffbrVar3;
        this.g = cqohVar;
        this.h = aswkVar;
        this.i = aswlVar;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
    }

    private final void d(List list, int i, final Iterable iterable) {
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParticipantsTable.BindData) it.next()).S());
        }
        final Set ar = ffdx.ar(arrayList);
        bvvr f = ParticipantsTable.f();
        f.ap("updateAvailabilityInDb");
        f.T(i);
        f.V(new Function() { // from class: cvds
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.m(ar);
                int intValue = ParticipantsTable.i().intValue();
                if (intValue < 13050) {
                    dtub.w("video_reachability", intValue);
                }
                bvvwVar.aq(new dtrw("participants.video_reachability", 4, bvvw.at(iterable), true));
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f.b().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cvdu
            if (r0 == 0) goto L13
            r0 = r10
            cvdu r0 = (defpackage.cvdu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cvdu r0 = new cvdu
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r9 = r0.a
            cvdy r0 = r0.e
            defpackage.ffci.b(r10)
            goto L6a
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.a
            cvdy r2 = r0.e
            defpackage.ffci.b(r10)
            goto L51
        L3f:
            defpackage.ffci.b(r10)
            dgea r10 = r8.c
            r0.e = r8
            r0.a = r9
            r0.d = r5
            java.lang.Object r10 = defpackage.cvew.a(r10, r0)
            if (r10 == r1) goto Laf
            r2 = r8
        L51:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 == 0) goto Lae
            if (r10 == r5) goto L91
            if (r10 == r4) goto L91
            r0.e = r2
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = r2.b(r9, r0)
            if (r10 == r1) goto Laf
            r0 = r2
        L6a:
            java.lang.Integer r10 = new java.lang.Integer
            r1 = 11
            r10.<init>(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r2 = 12
            r1.<init>(r2)
            java.lang.Integer r2 = new java.lang.Integer
            r6 = 7
            r2.<init>(r6)
            r7 = 3
            java.lang.Integer[] r7 = new java.lang.Integer[r7]
            r7[r3] = r10
            r7[r5] = r1
            r7[r4] = r2
            java.util.List r10 = defpackage.ffdx.g(r7)
            r0.d(r9, r6, r10)
            ffel r9 = defpackage.ffel.a
            return r9
        L91:
            java.lang.Integer r10 = new java.lang.Integer
            r0 = 10
            r10.<init>(r0)
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 8
            r0.<init>(r1)
            java.lang.Integer[] r4 = new java.lang.Integer[r4]
            r4[r3] = r10
            r4[r5] = r0
            java.util.List r10 = defpackage.ffdx.g(r4)
            r2.d(r9, r1, r10)
            ffel r9 = defpackage.ffel.a
        Lae:
            return r9
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvdy.a(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c0, code lost:
    
        if (r14.c == 2) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002b, B:12:0x00b5, B:14:0x00be, B:19:0x0088), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b2 -> B:12:0x00b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvdy.b(java.util.List, ffgu):java.lang.Object");
    }

    @Override // defpackage.cvfy
    public final void c(List list) {
        list.getClass();
        if (((Boolean) cvfg.a.e()).booleanValue()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((aolr) this.f.b()).q((ParticipantsTable.BindData) obj).s()) {
                    arrayList.add(obj);
                }
            }
            axol.k(this.d, null, new cvdw(arrayList, this, null), 3);
        }
    }
}
