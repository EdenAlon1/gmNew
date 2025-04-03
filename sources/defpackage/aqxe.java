package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqxe implements aqwr {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/profile/ProfileUpdateExtensionImpl");
    public final ffhd a;
    public final ffbr b;
    public final aqli c;
    private final Context e;
    private final ffsk f;
    private final ffsk g;
    private final aqxs h;

    public aqxe(Context context, aqli aqliVar, ffsk ffskVar, ffhd ffhdVar, ffsk ffskVar2, ffbr ffbrVar, aqxs aqxsVar) {
        context.getClass();
        aqliVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        aqxsVar.getClass();
        this.e = context;
        this.c = aqliVar;
        this.f = ffskVar;
        this.a = ffhdVar;
        this.g = ffskVar2;
        this.b = ffbrVar;
        this.h = aqxsVar;
    }

    @Override // defpackage.aqwr
    public final elfl a(aqux aquxVar, Optional optional) {
        optional.getClass();
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.g, ekxi.a(ffheVar), ffsmVar, new aqxb(null, this, aquxVar, optional)));
    }

    @Override // defpackage.aqwr
    public final elfl b(aqvh aqvhVar, Optional optional) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.g, ekxi.a(ffheVar), ffsmVar, new aqxd(null, this, aqvhVar, optional)));
    }

    @Override // defpackage.aqwr
    public final Optional c(final aqux aquxVar, final Optional optional) {
        final ffji ffjiVar = new ffji() { // from class: aqwv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                aqxm aqxmVar = (aqxm) aqxe.this.b.b();
                ProfilesTable.BindData bindData = (ProfilesTable.BindData) optional.get();
                ffbr ffbrVar = aqxmVar.a;
                ffbr ffbrVar2 = aqxmVar.b;
                ffbr ffbrVar3 = aqxmVar.c;
                SelfIdentityId g = aquxVar.g();
                cqoh cqohVar = (cqoh) ffbrVar3.b();
                cqohVar.getClass();
                ffsk ffskVar = (ffsk) aqxmVar.d.b();
                ffskVar.getClass();
                Optional a = aqxg.a(bindData.v());
                Optional a2 = aqxg.a(bindData.q());
                boolean z = bindData.q() != null ? !csuu.C(bindData.q()) : true;
                boolean D = bindData.D();
                boolean z2 = !ffkj.e(aqxg.a(bindData.v()), Optional.empty());
                boolean F = bindData.F();
                eyja eyjaVar = eyja.a;
                eyjaVar.getClass();
                return Optional.of(new aqxl(a, a2, z, D, z2, 4, g, F, eyjaVar, bindData, ffbrVar, ffbrVar2, cqohVar, ffskVar));
            }
        };
        Object orElseGet = optional.map(new Function() { // from class: aqww
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: aqwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return Optional.empty();
            }
        });
        orElseGet.getClass();
        return (Optional) orElseGet;
    }

    @Override // defpackage.aqwr
    public final Optional d(final aqux aquxVar, final Optional optional) {
        final ffji ffjiVar = new ffji() { // from class: aqws
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                aqxm aqxmVar = (aqxm) aqxe.this.b.b();
                bxtp bxtpVar = (bxtp) optional.get();
                ffbr ffbrVar = aqxmVar.a;
                ffbr ffbrVar2 = aqxmVar.b;
                ffbr ffbrVar3 = aqxmVar.c;
                SelfIdentityId g = aquxVar.g();
                cqoh cqohVar = (cqoh) ffbrVar3.b();
                cqohVar.getClass();
                ffsk ffskVar = (ffsk) aqxmVar.d.b();
                ffskVar.getClass();
                Optional a = aqxg.a(bxtpVar.o());
                Optional a2 = aqxg.a(bxtpVar.m());
                boolean z = bxtpVar.m() != null ? !csuu.C(bxtpVar.m()) : true;
                boolean q = bxtpVar.q();
                boolean z2 = !ffkj.e(aqxg.a(bxtpVar.o()), Optional.empty());
                boolean r = bxtpVar.r();
                eyja eyjaVar = eyja.a;
                eyjaVar.getClass();
                return Optional.of(new aqxl(a, a2, z, q, z2, 4, g, r, eyjaVar, null, ffbrVar, ffbrVar2, cqohVar, ffskVar));
            }
        };
        Object orElseGet = optional.map(new Function() { // from class: aqwt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: aqwu
            @Override // java.util.function.Supplier
            public final Object get() {
                return Optional.empty();
            }
        });
        orElseGet.getClass();
        return (Optional) orElseGet;
    }

    @Override // defpackage.aqwr
    public final Object e(ParticipantsTable.BindData bindData, ffgu ffguVar) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return ffra.b(this.f, ekxi.a(ffheVar), ffsmVar, new aqwz(null, this, bindData)).c(ffguVar);
    }

    @Override // defpackage.aqwr
    public final Object f(azsu azsuVar, ffgu ffguVar) {
        return this.h.a(azsuVar, ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0098 -> B:11:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.aqvh r7, j$.util.Optional r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.aqwy
            if (r0 == 0) goto L13
            r0 = r9
            aqwy r0 = (defpackage.aqwy) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            aqwy r0 = new aqwy
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.c
            java.lang.Object r8 = r0.b
            java.lang.Object r2 = r0.a
            j$.util.Optional r4 = r0.h
            aqxe r5 = r0.g
            defpackage.ffci.b(r9)
            goto L99
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            j$.util.Optional r8 = r0.h
            aqxe r7 = r0.g
            defpackage.ffci.b(r9)
            goto L5f
        L44:
            defpackage.ffci.b(r9)
            aqge r7 = r7.c()
            elfl r7 = r7.b()
            r7.getClass()
            r0.g = r6
            r0.h = r8
            r0.f = r4
            java.lang.Object r9 = defpackage.fgfz.c(r7, r0)
            if (r9 == r1) goto Lc1
            r7 = r6
        L5f:
            r9.getClass()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ffdx.n(r9, r4)
            r2.<init>(r4)
            java.util.Iterator r9 = r9.iterator()
            r5 = r7
            r4 = r8
            r8 = r9
        L76:
            r7 = r2
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L9f
            java.lang.Object r9 = r8.next()
            aqux r9 = (defpackage.aqux) r9
            r9.getClass()
            r0.g = r5
            r0.h = r4
            r0.a = r7
            r0.b = r8
            r0.c = r7
            r0.f = r3
            java.lang.Object r9 = r5.h(r9, r4, r0)
            if (r9 == r1) goto Lc1
            r2 = r7
        L99:
            j$.util.Optional r9 = (j$.util.Optional) r9
            r7.add(r9)
            goto L76
        L9f:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        La8:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lc0
            java.lang.Object r9 = r7.next()
            j$.util.Optional r9 = (j$.util.Optional) r9
            java.lang.Object r9 = defpackage.fflm.b(r9)
            aqvi r9 = (defpackage.aqvi) r9
            if (r9 == 0) goto La8
            r8.add(r9)
            goto La8
        Lc0:
            return r8
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqxe.g(aqvh, j$.util.Optional, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0130 A[Catch: Exception -> 0x0058, TryCatch #0 {Exception -> 0x0058, blocks: (B:12:0x003a, B:13:0x00d4, B:15:0x0130, B:16:0x013e, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:24:0x0170, B:29:0x004f, B:31:0x00b9, B:33:0x00bd, B:35:0x00c2, B:47:0x008e), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd A[Catch: Exception -> 0x0058, TryCatch #0 {Exception -> 0x0058, blocks: (B:12:0x003a, B:13:0x00d4, B:15:0x0130, B:16:0x013e, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:24:0x0170, B:29:0x004f, B:31:0x00b9, B:33:0x00bd, B:35:0x00c2, B:47:0x008e), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2 A[Catch: Exception -> 0x0058, TryCatch #0 {Exception -> 0x0058, blocks: (B:12:0x003a, B:13:0x00d4, B:15:0x0130, B:16:0x013e, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:24:0x0170, B:29:0x004f, B:31:0x00b9, B:33:0x00bd, B:35:0x00c2, B:47:0x008e), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.aqux r28, j$.util.Optional r29, defpackage.ffgu r30) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqxe.h(aqux, j$.util.Optional, ffgu):java.lang.Object");
    }
}
