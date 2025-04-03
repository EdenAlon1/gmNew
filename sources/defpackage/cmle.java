package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmle implements bdnu {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnRcsMessageReceivedListener");
    public Instant a;
    private final ffsk c;
    private final ffhd d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final asuy h;
    private boolean i;
    private bdhg j;
    private Instant k;
    private cmkx l;

    public cmle(ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, asuy asuyVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.c = ffskVar;
        this.d = ffhdVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = asuyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        if (r1 == r3) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r19, defpackage.ffgu r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof defpackage.cmlc
            if (r2 == 0) goto L17
            r2 = r1
            cmlc r2 = (defpackage.cmlc) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            cmlc r2 = new cmlc
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.b
            ffhh r3 = defpackage.ffhh.a
            int r4 = r2.d
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L45
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            defpackage.ffci.b(r1)
            goto Lbd
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.Object r4 = r2.a
            cmle r6 = r2.e
            defpackage.ffci.b(r1)
            r17 = r4
            r4 = r1
            r1 = r17
            goto L6d
        L45:
            defpackage.ffci.b(r1)
            bdhg r1 = r0.j
            if (r1 == 0) goto L70
            java.lang.String r4 = r19.aA()
            if (r4 == 0) goto L70
            ffhd r8 = r0.d
            ffhd r8 = defpackage.ekxi.a(r8)
            cmld r9 = new cmld
            r9.<init>(r7, r1, r4, r0)
            r2.e = r0
            r1 = r19
            r2.a = r1
            r2.d = r6
            java.lang.Object r4 = defpackage.ffra.a(r8, r9, r2)
            if (r4 != r3) goto L6c
            goto Lbc
        L6c:
            r6 = r0
        L6d:
            j$.time.Duration r4 = (j$.time.Duration) r4
            goto L74
        L70:
            r1 = r19
            r6 = r0
            r4 = r7
        L74:
            ffbr r8 = r6.f
            java.lang.Object r8 = r8.b()
            cmjl r8 = (defpackage.cmjl) r8
            cmjt r9 = new cmjt
            long r10 = r1.t()
            cmkx r12 = r6.l
            if (r12 == 0) goto L89
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r12 = r12.a
            goto L8a
        L89:
            r12 = r7
        L8a:
            if (r4 != 0) goto L8e
            j$.time.Duration r4 = j$.time.Duration.ZERO
        L8e:
            r13 = r4
            r13.getClass()
            bdhg r14 = r6.j
            j$.time.Instant r15 = defpackage.cmlh.b(r1)
            boolean r16 = defpackage.cmlh.a(r1)
            r9.<init>(r10, r12, r13, r14, r15, r16)
            r2.e = r7
            r2.a = r7
            r2.d = r5
            ffhd r1 = r8.b
            ffhd r1 = defpackage.ekxi.a(r1)
            cmjk r4 = new cmjk
            r4.<init>(r7, r8, r9)
            java.lang.Object r1 = defpackage.ffra.a(r1, r4, r2)
            ffhh r2 = defpackage.ffhh.a
            if (r1 == r2) goto Lba
            ffcu r1 = defpackage.ffcu.a
        Lba:
            if (r1 != r3) goto Lbd
        Lbc:
            return r3
        Lbd:
            ffcu r1 = defpackage.ffcu.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmle.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    @Override // defpackage.bdnu
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (((Boolean) this.g.b()).booleanValue()) {
            if (this.j == null && this.k == null) {
                return;
            }
            axol.k(this.c, null, new cmlb(this, messageCoreData, null), 3);
        }
    }

    @Override // defpackage.bdnu
    public final void e(MessageCoreData messageCoreData) {
        bdhg bdhgVar;
        boolean z;
        messageCoreData.getClass();
        if (!((Boolean) this.g.b()).booleanValue()) {
            return;
        }
        ekzz f = eleg.f("EditOnRcsMessageReceivedListener#beforeMessageInserted");
        try {
            String aA = messageCoreData.aA();
            if (aA == null) {
                ffig.a(f, null);
                return;
            }
            fayv aa = messageCoreData.aa();
            boolean z2 = true;
            if (aa != null) {
                bdhgVar = cmlh.c(aa);
                if (true != bdhgVar.k()) {
                    bdhgVar = null;
                }
                if (bdhgVar == null) {
                    Optional a = clbh.a(aa, clbg.RCS_EDIT_NAMESPACE, "Edited-Message-Id");
                    final cmlg cmlgVar = cmlg.a;
                    Optional map = a.map(new Function() { // from class: cmlf
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
                    });
                    map.getClass();
                    bdhgVar = (bdhg) fflm.b(map);
                }
            } else {
                bdhgVar = null;
            }
            this.j = bdhgVar;
            Instant ofEpochMilli = cmlh.a(messageCoreData) ? Instant.ofEpochMilli(messageCoreData.r()) : cmlh.b(messageCoreData);
            this.k = ofEpochMilli;
            if (this.j != null && ofEpochMilli != null) {
                this.i = true;
                bdhg bdhgVar2 = this.j;
                bdhgVar2.getClass();
                cmkx c = cmky.c(bdhgVar2, aA);
                this.l = c;
                z = c != null ? c.b.isBefore(this.k) : true;
            } else {
                if (!((ersq) ((ascx) this.h).a.b()).a("bugle.handle_out_of_order_edits")) {
                    ffig.a(f, null);
                    return;
                }
                final bdhg E = messageCoreData.E();
                E.getClass();
                String[] strArr = btza.a;
                btyv btyvVar = new btyv(btza.a);
                btyvVar.z("wasPotentiallyEdited");
                btyvVar.f(new Function() { // from class: cmkm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((btyh) obj).c;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                btyvVar.g(new Function() { // from class: cmkn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        btyz btyzVar = (btyz) obj;
                        btyzVar.b(bdhg.this);
                        return btyzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                btyvVar.x(1);
                if (!btyvVar.b().T()) {
                    ffig.a(f, null);
                    return;
                }
                bdhg E2 = messageCoreData.E();
                E2.getClass();
                cmkx c2 = cmky.c(E2, aA);
                this.l = c2;
                if (c2 == null) {
                    ffig.a(f, null);
                    return;
                }
                this.i = true;
                this.j = messageCoreData.E();
                this.k = Instant.ofEpochMilli(-1L);
                z = false;
            }
            ensk h = b.h();
            h.Y(ente.a, "BugleRcsEdits");
            enrr enrrVar = (enrr) h;
            ensn ensnVar = cmkz.a;
            enrrVar.Y(cmkz.c, this.j);
            enrrVar.Y(cmkz.d, this.k);
            ensn ensnVar2 = cmkz.e;
            cmkx cmkxVar = this.l;
            enrrVar.Y(ensnVar2, cmkxVar != null ? cmkxVar.a : null);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnRcsMessageReceivedListener", "beforeMessageInserted", 103, "EditOnRcsMessageReceivedListener.kt")).t("Preparing incoming edit: isNewMessageVisible = %s.", Boolean.valueOf(z));
            messageCoreData.bx(!z);
            this.a = Instant.ofEpochMilli(messageCoreData.o());
            bdhg bdhgVar3 = this.j;
            bdhgVar3.getClass();
            Instant b2 = cmky.b(bdhgVar3, aA);
            if (b2 != null) {
                messageCoreData.bM(b2.toEpochMilli());
            }
            if (z && b2 == null) {
                z2 = false;
            }
            messageCoreData.bz(z2);
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.bdnu
    public final void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (!((Boolean) this.g.b()).booleanValue()) {
            return;
        }
        ekzz f = eleg.f("EditOnRcsMessageReceivedListener#onInsertedInTransaction");
        try {
            if (!this.i) {
                ffig.a(f, null);
                return;
            }
            cmky cmkyVar = (cmky) this.e.b();
            ConversationIdType z = messageCoreData.z();
            z.getClass();
            MessageIdType B = messageCoreData.B();
            B.getClass();
            String aA = messageCoreData.aA();
            aA.getClass();
            bdhg bdhgVar = this.j;
            bdhgVar.getClass();
            Instant instant = this.k;
            instant.getClass();
            Instant instant2 = this.a;
            instant2.getClass();
            cmkyVar.a(z, B, aA, bdhgVar, instant, instant2, this.l);
            ffig.a(f, null);
            ensk h = b.h();
            h.Y(ente.a, "BugleRcsEdits");
            enrr enrrVar = (enrr) h;
            ensn ensnVar = cmkz.a;
            enrrVar.Y(cmkz.a, messageCoreData.B());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnRcsMessageReceivedListener", "onInsertedInTransaction", 147, "EditOnRcsMessageReceivedListener.kt")).q("Processed incoming edit.");
        } finally {
        }
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
