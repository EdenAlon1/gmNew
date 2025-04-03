package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caag implements bcvx {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSessionSetupImpl");
    public final fazb b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffhd i;
    public final ffbr j;
    public final ffbr k;
    public final awui l;
    private final ffbr m;
    private final ffhd n;
    private final ffhd o;
    private final ConversationIdType p;

    public caag(fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffhd ffhdVar, ffhd ffhdVar2, ffhd ffhdVar3, ffbr ffbrVar8, ffbr ffbrVar9, awui awuiVar, ConversationIdType conversationIdType) {
        fazbVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ffhdVar3.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        awuiVar.getClass();
        conversationIdType.getClass();
        this.b = fazbVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.m = ffbrVar7;
        this.n = ffhdVar;
        this.i = ffhdVar2;
        this.o = ffhdVar3;
        this.j = ffbrVar8;
        this.k = ffbrVar9;
        this.l = awuiVar;
        this.p = conversationIdType;
        String str = awuiVar.d;
        str.getClass();
        if (ffpc.J(str)) {
            throw new IllegalStateException("Self identity is blank.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.bcvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.enip r6, defpackage.eozn r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.caae
            if (r0 == 0) goto L13
            r0 = r8
            caae r0 = (defpackage.caae) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            caae r0 = new caae
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L53
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L3e
            ppp r6 = new ppp
            r6.<init>()
            return r6
        L3e:
            ffhd r8 = r5.n
            ffhd r8 = defpackage.ekxi.a(r8)
            caad r2 = new caad
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caag.a(enip, eozn, ffgu):java.lang.Object");
    }

    @Override // defpackage.bcvx
    public final Object b(int i, caqc caqcVar, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.o), new caaf(null, this, i, caqcVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.bcvx
    public final void c(final awui awuiVar, boolean z, final eozn eoznVar) {
        awuiVar.getClass();
        eoznVar.getClass();
        final caen caenVar = (caen) this.d.b();
        final String str = awuiVar.d;
        csjb c = caen.a.c();
        c.I("Disabling Etouffee");
        c.M("normalizedDestination", str);
        c.B("forGroup", z);
        c.r();
        if (z) {
            String[] strArr = bxgl.a;
            bxgi bxgiVar = new bxgi();
            bxgiVar.ap("setHasNoGroupEncryption");
            bxgiVar.e(false);
            bxgiVar.g(chef.a(str));
            bxgiVar.b().e();
        } else {
            chef chefVar = caenVar.f;
            String[] strArr2 = bxgl.a;
            bxgi bxgiVar2 = new bxgi();
            bxgiVar2.ap("setHasNoEncryption");
            bxgiVar2.d(false);
            bxgiVar2.e(false);
            bxgiVar2.g(chef.a(str));
            bxgiVar2.b().e();
            chefVar.f(str, false);
        }
        final awui awuiVar2 = this.l;
        caenVar.g.c("Bugle.Etouffee.DisableEtouffeeUntilRefresh.Counts");
        elfo.h(new erog() { // from class: caeg
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return caen.this.b(awuiVar2, engw.r(awuiVar), engw.r(str), eoznVar);
            }
        }, caenVar.b).k(axou.a(new csvw(new Consumer() { // from class: caeh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                caen.a.p("Retrieved latest registration for disabled Etouffee");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: caei
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                caen.a.s("Failed to retrieve latest registration for disabled Etouffee", (Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), erpp.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.enip r6, defpackage.eozn r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.caac
            if (r0 == 0) goto L13
            r0 = r8
            caac r0 = (defpackage.caac) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            caac r0 = new caac
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            ffhd r8 = r5.i
            ffhd r8 = defpackage.ekxi.a(r8)
            caab r2 = new caab
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caag.d(enip, eozn, ffgu):java.lang.Object");
    }

    public final void e(int i, caqc caqcVar) {
        ((bzqb) this.m.b()).h(this.l, this.p, i, caqcVar);
    }
}
