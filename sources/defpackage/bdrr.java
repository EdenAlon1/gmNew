package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdrr {
    public static final entd a = entd.c("BugleDataModel");
    public static final cskc b = cskc.g("BugleDataModel", "ParticipantDatabaseOperations");
    public final Optional c;
    public final Optional d;
    public final aswk e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final azzp j;
    public final ffbr k;
    public final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;

    public bdrr(ffbr ffbrVar, Optional optional, Optional optional2, aswk aswkVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, azzp azzpVar, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14) {
        this.m = ffbrVar;
        this.c = optional;
        this.d = optional2;
        this.e = aswkVar;
        this.n = ffbrVar2;
        this.o = ffbrVar3;
        this.f = ffbrVar4;
        this.p = ffbrVar5;
        this.g = ffbrVar6;
        this.q = ffbrVar7;
        this.r = ffbrVar8;
        this.s = ffbrVar9;
        this.h = ffbrVar10;
        this.i = ffbrVar11;
        this.j = azzpVar;
        this.k = ffbrVar12;
        this.l = ffbrVar13;
        this.t = ffbrVar14;
    }

    public static engw e(final ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ParticipantDatabaseOperations#getOtherParticipants_dsdrGroupsFlag");
        try {
            bvvn e = ParticipantsTable.e();
            e.z("getOtherParticipants");
            e.h(new Function() { // from class: bdqx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvvw bvvwVar = (bvvw) obj;
                    entd entdVar = bdrr.a;
                    bvvwVar.w(-2);
                    String[] strArr = bsdr.a;
                    bsdm bsdmVar = new bsdm(bsdr.a);
                    bsdmVar.e(new Function() { // from class: bdrl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            entd entdVar2 = bdrr.a;
                            return ((bscz) obj2).b;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final ConversationIdType conversationIdType2 = ConversationIdType.this;
                    bsdmVar.f(new Function() { // from class: bdrm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsdq bsdqVar = (bsdq) obj2;
                            entd entdVar2 = bdrr.a;
                            bsdqVar.b(ConversationIdType.this);
                            return bsdqVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bvvwVar.l(bsdmVar.b());
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw cW = ((bvti) e.b().o()).cW();
            f.close();
            return cW;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void o(ParticipantsTable.BindData bindData) {
        ensz enszVar = (ensz) a.i();
        enszVar.aa(ensy.FULL);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantDatabaseOperations", "logInsertionFailureToFlogger", 710, "ParticipantDatabaseOperations.java")).M("Unable to insert new participant: isValidPhoneNumberData = [%s], isCheckConstraintEnabledViaPhenotype = [%s], subId = [%s], normalizedDestinationIsNullOrEmpty = [%s], sendDestinationIsNullOrEmpty = [%s], displayDestinationIsNullOrEmpty = [%s]", new evhq(evhp.NO_USER_DATA, Boolean.valueOf(bindData.ac())), new evhq(evhp.NO_USER_DATA, Boolean.valueOf(bindData.Z())), new evhq(evhp.NO_USER_DATA, Integer.valueOf(bindData.r())), new evhq(evhp.NO_USER_DATA, Boolean.valueOf(TextUtils.isEmpty(bindData.U()))), new evhq(evhp.NO_USER_DATA, Boolean.valueOf(TextUtils.isEmpty(bindData.W()))), new evhq(evhp.NO_USER_DATA, Boolean.valueOf(TextUtils.isEmpty(bindData.P()))));
    }

    public static boolean r(ParticipantsTable.BindData bindData) {
        return !TextUtils.isEmpty(bindData.T());
    }

    public final ParticipantsTable.BindData a() {
        ParticipantsTable.BindData bindData;
        ekzz f = eleg.f("ParticipantDatabaseOperationsImpl#getDefaultSelfParticipant");
        try {
            bvvn e = ParticipantsTable.e();
            e.z("getDefaultSelfParticipant");
            e.h(new Function() { // from class: bdri
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvvw bvvwVar = (bvvw) obj;
                    entd entdVar = bdrr.a;
                    bvvwVar.w(-1);
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bvti bvtiVar = (bvti) e.b().o();
            try {
                if (bvtiVar.moveToFirst()) {
                    bindData = (ParticipantsTable.BindData) bvtiVar.cO();
                    bvtiVar.close();
                } else {
                    bvtiVar.close();
                    csjb e2 = b.e();
                    e2.I("Default self participant does not exist. Bugle db is under sync or corrupted");
                    e2.r();
                    bindData = null;
                }
                f.close();
                return bindData;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ParticipantsTable.BindData b(String str) {
        ekzz f = eleg.f("ParticipantDatabaseOperations#getExistingParticipant");
        try {
            csix.h();
            ParticipantsTable.BindData bindData = str == null ? null : (ParticipantsTable.BindData) ParticipantsTable.l(str, new Function() { // from class: bdrh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) obj;
                    entd entdVar = bdrr.a;
                    return bindData2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f.close();
            return bindData;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ParticipantsTable.BindData c(String str) {
        ParticipantsTable.BindData bindData;
        ekzz f = eleg.f("ParticipantDatabaseOperations#getExistingRbmBot");
        try {
            String m = m(str);
            ParticipantsTable.BindData bindData2 = null;
            if (TextUtils.isEmpty(m)) {
                bindData = null;
            } else {
                bindData = b(m);
                if (bindData != null) {
                    csjb a2 = b.a();
                    a2.I("getExistingRbmBot: found");
                    a2.f(m);
                    a2.I("for participant");
                    a2.k(str);
                    a2.I("(is bot =");
                    a2.J(bdqv.d(bindData));
                    a2.u(')');
                    a2.r();
                } else {
                    csjb e = b.e();
                    e.I("Found existing participant");
                    e.f(m);
                    e.I("but its participant is null.");
                    e.r();
                }
            }
            if (bindData != null) {
                if (bdqv.d(bindData)) {
                    bindData2 = bindData;
                }
            }
            f.close();
            return bindData2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ParticipantsTable.BindData d(final String str) {
        ekzz f = eleg.f("ParticipantDatabaseOperations#getOtherParticipantByNormalizedDestination");
        try {
            csix.h();
            bvvn e = ParticipantsTable.e();
            e.z("getOtherParticipantByNormalizedDestination");
            e.h(new Function() { // from class: bdrc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvvw bvvwVar = (bvvw) obj;
                    entd entdVar = bdrr.a;
                    bvvwVar.w(-2);
                    bvvwVar.r(str);
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ((bvti) e.b().o()).cS();
            f.close();
            return bindData;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw f(final String str) {
        ekzz f = eleg.f("ParticipantDatabaseOperations#getParticipants");
        try {
            efbd.b();
            bvvn e = ParticipantsTable.e();
            e.z("getParticipantById");
            e.h(new Function() { // from class: bdra
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvvw bvvwVar = (bvvw) obj;
                    entd entdVar = bdrr.a;
                    bvvwVar.k(str);
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw y = e.b().y();
            f.close();
            return y;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw g() {
        ekzz f = eleg.f("ParticipantDatabaseOperations#getParticipants");
        try {
            csix.h();
            bvvn e = ParticipantsTable.e();
            e.z("getParticipants");
            e.r();
            engw y = e.b().y();
            f.close();
            return y;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String h(bvpo bvpoVar) {
        String str = bvpoVar.f;
        String m = bdtd.n(bvpoVar) ? ((SelfIdentityIdImpl) ((bdtd) this.o.b()).g(bvpoVar.d).g()).a : str == null ? null : m(str);
        if (m != null) {
            String str2 = bvpoVar.a;
            boolean z = true;
            if (str2 != null && !str2.equals(m)) {
                z = false;
            }
            emyw.c(z, "Looked up id doesn't match id in participant", new Object[0]);
            bvpoVar.v(m);
        }
        return m;
    }

    public final String i(ParticipantsTable.BindData bindData) {
        return l(bindData, false);
    }

    public final String j(bvpo bvpoVar) {
        return k(bvpoVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        if (r4 != 1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String k(final defpackage.bvpo r7, final boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ParticipantDatabaseOperations#getOrCreateParticipant"
            ekzz r1 = defpackage.eleg.f(r0)
            defpackage.csix.h()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = r6.h(r7)     // Catch: java.lang.Throwable -> Lcc
            if (r2 == 0) goto L2a
            entd r7 = defpackage.bdrr.a     // Catch: java.lang.Throwable -> Lcc
            ensk r7 = r7.o()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r8 = "com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantDatabaseOperations"
            java.lang.String r0 = "getOrCreateParticipant"
            java.lang.String r3 = "ParticipantDatabaseOperations.java"
            r4 = 492(0x1ec, float:6.9E-43)
            ensk r7 = r7.h(r8, r0, r4, r3)     // Catch: java.lang.Throwable -> Lcc
            ensz r7 = (defpackage.ensz) r7     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r8 = "Participant id %s has already existed, returning immediately."
            r7.t(r8, r2)     // Catch: java.lang.Throwable -> Lcc
            goto Lc8
        L2a:
            long r2 = r7.q     // Catch: java.lang.Throwable -> Lcc
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L40
            ffbr r2 = r6.r     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> Lcc
            bdqo r2 = (defpackage.bdqo) r2     // Catch: java.lang.Throwable -> Lcc
            r2.c(r7)     // Catch: java.lang.Throwable -> Lcc
            goto Lae
        L40:
            ffbr r2 = r6.g     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> Lcc
            azzf r2 = (defpackage.azzf) r2     // Catch: java.lang.Throwable -> Lcc
            r2.f(r7)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = r7.f     // Catch: java.lang.Throwable -> Lcc
            ffbr r4 = r6.l     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Lcc
            atfb r4 = (defpackage.atfb) r4     // Catch: java.lang.Throwable -> Lcc
            boolean r4 = r4.a()     // Catch: java.lang.Throwable -> Lcc
            if (r4 != 0) goto L6a
            ffbr r4 = r6.m     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Lcc
            cbfs r4 = (defpackage.cbfs) r4     // Catch: java.lang.Throwable -> Lcc
            boolean r4 = r4.d(r7)     // Catch: java.lang.Throwable -> Lcc
            if (r4 == 0) goto La3
            goto L92
        L6a:
            boolean r4 = defpackage.bdtd.n(r7)     // Catch: java.lang.Throwable -> Lcc
            if (r4 == 0) goto L7d
            ffbr r4 = r6.o     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Lcc
            bdtd r4 = (defpackage.bdtd) r4     // Catch: java.lang.Throwable -> Lcc
            int r4 = r4.b(r7)     // Catch: java.lang.Throwable -> Lcc
            goto L7e
        L7d:
            r4 = -1
        L7e:
            r5 = 2
            if (r4 == r5) goto L92
            ffbr r5 = r6.t     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Lcc
            aqqc r5 = (defpackage.aqqc) r5     // Catch: java.lang.Throwable -> Lcc
            boolean r5 = r5.d(r7)     // Catch: java.lang.Throwable -> Lcc
            if (r5 != 0) goto L92
            r5 = 1
            if (r4 != r5) goto La3
        L92:
            java.lang.String r4 = r7.f     // Catch: java.lang.Throwable -> Lcc
            boolean r2 = android.text.TextUtils.equals(r2, r4)     // Catch: java.lang.Throwable -> Lcc
            if (r2 != 0) goto La3
            java.lang.String r2 = r6.h(r7)     // Catch: java.lang.Throwable -> Lcc
            if (r2 != 0) goto La1
            goto La3
        La1:
            r3 = r2
            goto Lae
        La3:
            ffbr r2 = r6.g     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> Lcc
            azzf r2 = (defpackage.azzf) r2     // Catch: java.lang.Throwable -> Lcc
            r2.f(r7)     // Catch: java.lang.Throwable -> Lcc
        Lae:
            if (r3 == 0) goto Lb4
            r1.close()
            return r3
        Lb4:
            ffbr r2 = r6.p     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> Lcc
            dtuu r2 = (defpackage.dtuu) r2     // Catch: java.lang.Throwable -> Lcc
            bdrf r3 = new bdrf     // Catch: java.lang.Throwable -> Lcc
            r3.<init>()     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r7 = r2.c(r0, r3)     // Catch: java.lang.Throwable -> Lcc
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lcc
        Lc8:
            r1.close()
            return r2
        Lcc:
            r7 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Ld1
            goto Ld5
        Ld1:
            r8 = move-exception
            r7.addSuppressed(r8)
        Ld5:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdrr.k(bvpo, boolean):java.lang.String");
    }

    public final String l(ParticipantsTable.BindData bindData, boolean z) {
        String S = bindData.S();
        if (S != null) {
            return S;
        }
        String k = k(bindData.C(), z);
        bindData.a = k;
        return k;
    }

    public final String m(final String str) {
        ekzz f = eleg.f("ParticipantDatabaseOperations#getOtherParticipantId");
        try {
            String a2 = ((azzf) this.g.b()).a(str);
            if (TextUtils.isEmpty(a2)) {
                bvti bvtiVar = null;
                a2 = null;
                a2 = null;
                try {
                    bvvn e = ParticipantsTable.e();
                    e.z("getOtherParticipantId-participants1");
                    e.h(new Function() { // from class: bdrn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bvvw bvvwVar = (bvvw) obj;
                            entd entdVar = bdrr.a;
                            bvvwVar.r(str);
                            bvvwVar.w(-2);
                            return bvvwVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    e.f(new Function() { // from class: bdro
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            entd entdVar = bdrr.a;
                            return ((bvtg) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bvti bvtiVar2 = (bvti) e.b().o();
                    try {
                        if (bvtiVar2.moveToFirst()) {
                            bvtiVar = bvtiVar2;
                        } else {
                            cpdg cpdgVar = (cpdg) this.n.b();
                            if (!aoqw.j(str) || cpdgVar.i(str)) {
                                bvtiVar2.close();
                            } else {
                                bvtiVar2.close();
                                bvvn e2 = ParticipantsTable.e();
                                e2.z("getOtherParticipantId-participants2");
                                e2.h(new Function() { // from class: bdrp
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bvvw bvvwVar = (bvvw) obj;
                                        entd entdVar = bdrr.a;
                                        bvvwVar.w(-2);
                                        bvvwVar.as(new dtzq("REPLACE($V, '-','') = $V", new Object[]{ParticipantsTable.c.f, str}));
                                        return bvvwVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                e2.f(new Function() { // from class: bdrq
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        entd entdVar = bdrr.a;
                                        return ((bvtg) obj).a;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                bvti bvtiVar3 = (bvti) e2.b().o();
                                try {
                                    if (bvtiVar3.moveToFirst()) {
                                        bvtiVar = bvtiVar3;
                                    } else {
                                        bvtiVar3.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    bvtiVar = bvtiVar3;
                                    if (bvtiVar != null) {
                                        bvtiVar.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                        csix.a(1, bvtiVar.getCount());
                        String p = bvtiVar.p();
                        if (!TextUtils.isEmpty(p)) {
                            ((azzf) this.g.b()).c(str, p);
                        }
                        bvtiVar.close();
                        a2 = p;
                    } catch (Throwable th2) {
                        th = th2;
                        bvtiVar = bvtiVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            f.close();
            return a2;
        } catch (Throwable th4) {
            try {
                f.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map n(final Iterable iterable) {
        ekzz f = eleg.f("ParticipantDatabaseOperations#getExistingParticipants");
        try {
            csix.h();
            cmh cmhVar = new cmh();
            bvvn e = ParticipantsTable.e();
            e.z("getExistingParticipants");
            e.h(new Function() { // from class: bdqy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvvw bvvwVar = (bvvw) obj;
                    entd entdVar = bdrr.a;
                    bvvwVar.m(iterable);
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            enqv it = e.b().y().iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                cmhVar.put(bindData.S(), bindData);
            }
            f.close();
            return cmhVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void p(int i, String str) {
        if (i != 1) {
            b.n(str);
            ((bdsy) this.q.b()).a(4, 3);
        } else {
            b.q(str);
            ((bdsy) this.q.b()).a(4, 2);
        }
    }

    public final void q(final String str, final ParticipantCoreColor participantCoreColor) {
        ekzz f = eleg.f("ParticipantDatabaseOperations#maybeUpdateParticipantColor");
        try {
            csix.h();
            ((dtuu) this.p.b()).d("ParticipantDatabaseOperations#maybeUpdateParticipantColor", new Runnable() { // from class: bdrb
                @Override // java.lang.Runnable
                public final void run() {
                    bdrr bdrrVar = bdrr.this;
                    final String str2 = str;
                    ParticipantCoreColor participantCoreColor2 = participantCoreColor;
                    if (participantCoreColor2.a() == 0) {
                        ParticipantsTable.BindData b2 = bdrrVar.b(str2);
                        if (b2 == null) {
                            bdrr.b.n("Failed to retrieve participant when updating color.");
                            return;
                        } else if (!bdqo.a(b2).f(participantCoreColor2)) {
                            return;
                        }
                    }
                    bvvr f2 = ParticipantsTable.f();
                    f2.ap("maybeUpdateParticipantColor");
                    f2.V(new Function() { // from class: bdqz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bvvw bvvwVar = (bvvw) obj;
                            entd entdVar = bdrr.a;
                            bvvwVar.k(str2);
                            return bvvwVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    participantCoreColor2.c(f2);
                    engw a2 = f2.b().a();
                    bdrrVar.p(a2.size(), a2.size() != 1 ? "Failed to update participants' color." : "Successfully updated participants' color.");
                }
            });
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean s(final String str, Uri uri) {
        ekzz f = eleg.f("ParticipantDatabaseOperations#updateParticipantPhotoUri");
        try {
            csix.h();
            ekzz f2 = eleg.f("ParticipantDatabaseOperations#getParticipantPhotoUri");
            try {
                Uri uri2 = (Uri) ParticipantsTable.l(str, new Function() { // from class: bdrd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        entd entdVar = bdrr.a;
                        return ((ParticipantsTable.BindData) obj).x();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                f2.close();
                if ((uri == null && uri2 == null) || (uri != null && uri.equals(uri2))) {
                    csjb a2 = b.a();
                    a2.I("Not updating photo uri; existing photo uri matches new uri for");
                    a2.D("participantId", str);
                    a2.r();
                    f.close();
                    return false;
                }
                bvvr f3 = ParticipantsTable.f();
                f3.ap("updateParticipantPhotoUri");
                f3.M(uri);
                f3.V(new Function() { // from class: bdre
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvvw bvvwVar = (bvvw) obj;
                        entd entdVar = bdrr.a;
                        bvvwVar.k(str);
                        return bvvwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int e = f3.b().e();
                p(e, e != 1 ? "Failed to update participants' photo Uri." : "Successfully updated participants' photo Uri.");
                boolean z = e > 0;
                f.close();
                return z;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void t(int i) {
        ((bdsy) this.q.b()).a(2, i);
    }

    public final void u(final String str) {
        ekzz f = eleg.f("ParticipantDatabaseOperations#updateParticipantAlias");
        try {
            csix.h();
            if (TextUtils.equals((String) ParticipantsTable.l(str, new Function() { // from class: bdrg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((ParticipantsTable.BindData) obj).K();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), null)) {
                csjb d = b.d();
                d.I("Not updating alias. Existing alias matches new alias for");
                d.D("participantId", str);
                d.r();
            } else {
                bvvr f2 = ParticipantsTable.f();
                f2.ap("updateParticipantAlias");
                int intValue = ParticipantsTable.i().intValue();
                int intValue2 = ParticipantsTable.i().intValue();
                if (intValue2 < 20060) {
                    dtub.w("alias", intValue2);
                }
                if (intValue >= 20060) {
                    dtub.u(f2.a, "alias", null);
                }
                f2.V(new Function() { // from class: bdqw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvvw bvvwVar = (bvvw) obj;
                        entd entdVar = bdrr.a;
                        bvvwVar.k(str);
                        return bvvwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int e = f2.b().e();
                p(e, e != 1 ? "Failed to update participants' alias." : "Successfully updated participants' alias");
                ((cbgf) this.s.b()).b();
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
