package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.function.Consumer$CC;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuwf {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamGrpc");
    public static final cfup b = cfvl.i(cfvl.b, "send_raw_normalized_destination_for_group_member", true);
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffhd i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;

    static {
        cfvl.y("tachyon_spam_grpc_send_protocol_for_enforcement_signal");
    }

    public cuwf(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffhd ffhdVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffhdVar.getClass();
        this.c = ffbrVar;
        this.j = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.k = ffbrVar5;
        this.f = ffbrVar6;
        this.g = ffbrVar7;
        this.h = ffbrVar8;
        this.l = ffbrVar9;
        this.m = ffbrVar10;
        this.i = ffhdVar;
    }

    public static final String m(String str, String str2) {
        str.getClass();
        str2.getClass();
        int i = eodh.a;
        return eodf.a.c(str2.concat(str), StandardCharsets.UTF_8).toString();
    }

    static /* synthetic */ Object n(cuwf cuwfVar, fgtp fgtpVar, ParticipantsTable.BindData bindData, List list, cuwr cuwrVar, culh culhVar, fbcx fbcxVar, ffgu ffguVar, int i) {
        return ffra.a(ekxi.a(cuwfVar.i), new cuwe(null, fgtpVar, bindData, cuwfVar, (i & 4) != 0 ? null : list, cuwrVar, culhVar, (i & 32) != 0 ? null : fbcxVar), ffguVar);
    }

    public static final long o(long j) {
        return TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j));
    }

    public static final fcjm p(MessageCoreData messageCoreData, fcek fcekVar, fcek fcekVar2, String str, int i) {
        int b2 = cuvt.b(messageCoreData.d());
        fcjl fcjlVar = (fcjl) fcjm.a.createBuilder();
        fcjlVar.getClass();
        final fbrv fbrvVar = new fbrv(fcjlVar);
        fcjl fcjlVar2 = fbrvVar.a;
        fcjlVar2.copyOnWrite();
        fcjm fcjmVar = (fcjm) fcjlVar2.instance;
        fcjmVar.f = fcekVar;
        fcjmVar.b |= 1;
        fcjl fcjlVar3 = fbrvVar.a;
        fcjlVar3.copyOnWrite();
        fcjm fcjmVar2 = (fcjm) fcjlVar3.instance;
        fcjmVar2.g = fcekVar2;
        fcjmVar2.b |= 2;
        eyja a2 = cuxw.a(o(messageCoreData.o()));
        a2.getClass();
        fcjl fcjlVar4 = fbrvVar.a;
        fcjlVar4.copyOnWrite();
        fcjm fcjmVar3 = (fcjm) fcjlVar4.instance;
        fcjmVar3.h = a2;
        fcjmVar3.b |= 8;
        fcjl fcjlVar5 = fbrvVar.a;
        fcjlVar5.copyOnWrite();
        ((fcjm) fcjlVar5.instance).j = fgtj.a(b2);
        if (messageCoreData.d() == 3) {
            messageCoreData.E().g(new Consumer() { // from class: cuvr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enru enruVar = cuwf.a;
                    String f = ((bdhg) obj).f();
                    fcjl fcjlVar6 = fbrv.this.a;
                    fcjlVar6.copyOnWrite();
                    fcjm fcjmVar4 = (fcjm) fcjlVar6.instance;
                    fcjm fcjmVar5 = fcjm.a;
                    fcjmVar4.e = f;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (str != null) {
            fcjl fcjlVar6 = fbrvVar.a;
            fcjlVar6.copyOnWrite();
            fcjm fcjmVar4 = (fcjm) fcjlVar6.instance;
            fcjmVar4.c = 8;
            fcjmVar4.d = str;
        }
        fcjl fcjlVar7 = fbrvVar.a;
        fcjlVar7.copyOnWrite();
        ((fcjm) fcjlVar7.instance).i = i - 2;
        eyfy build = fbrvVar.a.build();
        build.getClass();
        return (fcjm) build;
    }

    public final fcek a(String str) {
        fgtg fgtgVar;
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fcejVar.getClass();
        cskc cskcVar = cpdg.a;
        if (aoqw.h(str)) {
            fgtgVar = fgtg.EMAIL;
        } else {
            fgtgVar = aoqw.j(str) ? fgtg.SHORT_CODE : ((cpdg) this.j.b()).g(str) ? fgtg.PHONE_NUMBER : fgtg.NOT_KNOWN;
        }
        fbfk.c(fgtgVar, fcejVar);
        if (str == null) {
            str = "-1";
        }
        fbfk.b(str, fcejVar);
        fbfk.d(fcejVar);
        return fbfk.a(fcejVar);
    }

    public final fcfo b() {
        fcfn a2 = ((chga) this.k.b()).a("Bugle");
        fcfo fcfoVar = (fcfo) a2.instance;
        String str = fcfoVar.c;
        str.getClass();
        fcek fcekVar = fcfoVar.h;
        if (fcekVar == null) {
            fcekVar = fcek.a;
        }
        if (fcekVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (str.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        eyfy build = a2.build();
        build.getClass();
        return (fcfo) build;
    }

    public final Object c(boolean z, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.i), new cuvu(null, this, z), ffguVar);
    }

    public final Object d(String str, ffgu ffguVar) {
        return ((cuwg) this.g.b()).b(chhp.b(str), "tachyon_registration", ffguVar);
    }

    public final Object e(fcil fcilVar, String str, fbcx fbcxVar, ffgu ffguVar) {
        cuwg cuwgVar = (cuwg) this.g.b();
        eyja eyjaVar = fcilVar.f;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        eyjaVar.getClass();
        String valueOf = String.valueOf(eykn.d(eyjaVar).toEpochMilli());
        ffcf[] ffcfVarArr = new ffcf[4];
        fgtp b2 = fgtp.b(fcilVar.c);
        if (b2 == null) {
            b2 = fgtp.UNRECOGNIZED;
        }
        ffcf ffcfVar = new ffcf(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, m(valueOf, b2.name()));
        int i = 0;
        ffcfVarArr[0] = ffcfVar;
        fcek fcekVar = fcilVar.d;
        if (fcekVar == null) {
            fcekVar = fcek.a;
        }
        String str2 = fcekVar.c;
        str2.getClass();
        ffcfVarArr[1] = new ffcf("reported_id", m(valueOf, str2));
        ffcfVarArr[2] = new ffcf("reporter_id", m(valueOf, str));
        ffcfVarArr[3] = new ffcf("salt", m(valueOf, ""));
        Map h = ffew.h(ffcfVarArr);
        fgtp b3 = fgtp.b(fcilVar.c);
        if (b3 == null) {
            b3 = fgtp.UNRECOGNIZED;
        }
        if (b3 == fgtp.USER_MARKED_AS_SPAM) {
            for (fcjm fcjmVar : fcilVar.e) {
                int i2 = i + 1;
                String h2 = a.h(i, "content_");
                fcek fcekVar2 = fcjmVar.f;
                if (fcekVar2 == null) {
                    fcekVar2 = fcek.a;
                }
                h.put(h2, m(valueOf, a.w(fcjmVar.c == 8 ? (String) fcjmVar.d : "", fcekVar2.c, ":")));
                i = i2;
            }
        }
        if ((fcilVar.b & 64) != 0) {
            fcek fcekVar3 = fcilVar.j;
            if (fcekVar3 == null) {
                fcekVar3 = fcek.a;
            }
            if (!ffkj.e(fcekVar3.c, "")) {
                fcek fcekVar4 = fcilVar.j;
                if (fcekVar4 == null) {
                    fcekVar4 = fcek.a;
                }
                String str3 = fcekVar4.c;
                str3.getClass();
                h.put("group_id", m(valueOf, str3));
            }
        }
        if (fbcxVar != null) {
            int a2 = cuvt.a(fbcxVar);
            h.put("enforcement_action_type", m(valueOf, a2 != 2 ? a2 != 3 ? "ALLOWLIST" : "SPAM_FOLDER" : "SHOW_WARNING"));
        }
        return cuwgVar.b(h, "tachyon_spam_signal", ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcja r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cuvx
            if (r0 == 0) goto L13
            r0 = r11
            cuvx r0 = (defpackage.cuvx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuvx r0 = new cuvx
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekzz r10 = r0.d
            defpackage.ffci.b(r11)     // Catch: java.lang.Throwable -> L2a
            goto L8f
        L2a:
            r11 = move-exception
            goto L98
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            defpackage.ffci.b(r11)
            ffhd r11 = r0.u()
            boolean r11 = defpackage.ekxi.b(r11)
            if (r11 == 0) goto L9e
            java.lang.String r11 = "TachyonSpamGrpc#getUrlSpamState#fetchFuzzyMatchingTemplates"
            ekzz r11 = defpackage.eleg.f(r11)
            ffbr r2 = r9.c     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L94
            cuvq r2 = (defpackage.cuvq) r2     // Catch: java.lang.Throwable -> L94
            fbct r2 = r2.a()     // Catch: java.lang.Throwable -> L94
            if (r2 != 0) goto L59
            defpackage.ffig.a(r11, r3)
            return r3
        L59:
            fcfo r5 = r9.b()     // Catch: java.lang.Throwable -> L94
            ffbr r6 = r9.g     // Catch: java.lang.Throwable -> L94
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L94
            cuwg r6 = (defpackage.cuwg) r6     // Catch: java.lang.Throwable -> L94
            eyfq r10 = r10.toBuilder()     // Catch: java.lang.Throwable -> L94
            fciz r10 = (defpackage.fciz) r10     // Catch: java.lang.Throwable -> L94
            r10.copyOnWrite()     // Catch: java.lang.Throwable -> L94
            MessageType extends eyfy<MessageType, BuilderType> r7 = r10.instance     // Catch: java.lang.Throwable -> L94
            fcja r7 = (defpackage.fcja) r7     // Catch: java.lang.Throwable -> L94
            r7.e = r5     // Catch: java.lang.Throwable -> L94
            int r5 = r7.b     // Catch: java.lang.Throwable -> L94
            r5 = r5 | r4
            r7.b = r5     // Catch: java.lang.Throwable -> L94
            eyfy r10 = r10.build()     // Catch: java.lang.Throwable -> L94
            r10.getClass()     // Catch: java.lang.Throwable -> L94
            fcja r10 = (defpackage.fcja) r10     // Catch: java.lang.Throwable -> L94
            r0.d = r11     // Catch: java.lang.Throwable -> L94
            r0.c = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r10 = r6.c(r2, r10, r0)     // Catch: java.lang.Throwable -> L94
            if (r10 == r1) goto L93
            r8 = r11
            r11 = r10
            r10 = r8
        L8f:
            defpackage.ffig.a(r10, r3)
            return r11
        L93:
            return r1
        L94:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L98:
            throw r11     // Catch: java.lang.Throwable -> L99
        L99:
            r0 = move-exception
            defpackage.ffig.a(r10, r11)
            throw r0
        L9e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwf.f(fcja, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cuvy
            if (r0 == 0) goto L13
            r0 = r7
            cuvy r0 = (defpackage.cuvy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuvy r0 = new cuvy
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ffci.b(r7)
            goto L4c
        L36:
            defpackage.ffci.b(r7)
            if (r6 == 0) goto L4f
            ffbr r6 = r5.l
            java.lang.Object r6 = r6.b()
            cuha r6 = (defpackage.cuha) r6
            r0.c = r4
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L4c
            goto L5f
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            goto L62
        L4f:
            ffbr r6 = r5.l
            java.lang.Object r6 = r6.b()
            cuha r6 = (defpackage.cuha) r6
            r0.c = r3
            java.lang.Object r7 = r6.e(r0)
            if (r7 != r1) goto L60
        L5f:
            return r1
        L60:
            java.lang.String r7 = (java.lang.String) r7
        L62:
            fcek r6 = defpackage.fcek.a
            eyfq r6 = r6.createBuilder()
            fcej r6 = (defpackage.fcej) r6
            r6.getClass()
            fgtg r0 = defpackage.fgtg.OPAQUE_ID
            defpackage.fbfk.c(r0, r6)
            defpackage.fbfk.b(r7, r6)
            defpackage.fbfk.d(r6)
            fcek r6 = defpackage.fbfk.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwf.g(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cuvz
            if (r0 == 0) goto L13
            r0 = r7
            cuvz r0 = (defpackage.cuvz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuvz r0 = new cuvz
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ffci.b(r7)
            goto L4c
        L36:
            defpackage.ffci.b(r7)
            if (r6 == 0) goto L4f
            ffbr r6 = r5.l
            java.lang.Object r6 = r6.b()
            cuha r6 = (defpackage.cuha) r6
            r0.c = r4
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L4c
            goto L5f
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            goto L62
        L4f:
            ffbr r6 = r5.l
            java.lang.Object r6 = r6.b()
            cuha r6 = (defpackage.cuha) r6
            r0.c = r3
            java.lang.Object r7 = r6.e(r0)
            if (r7 != r1) goto L60
        L5f:
            return r1
        L60:
            java.lang.String r7 = (java.lang.String) r7
        L62:
            fcfw r6 = defpackage.fcfw.a
            eyfq r6 = r6.createBuilder()
            fcft r6 = (defpackage.fcft) r6
            r6.getClass()
            fcfv r0 = defpackage.fcfv.a
            eyfq r0 = r0.createBuilder()
            fcfu r0 = (defpackage.fcfu) r0
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            eyee r7 = defpackage.eyee.y(r7, r1)
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r0.instance
            fcfv r1 = (defpackage.fcfv) r1
            r1.b = r7
            cfup r7 = defpackage.cuha.a
            java.lang.Object r7 = r7.e()
            r7.getClass()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r0.instance
            fcfv r1 = (defpackage.fcfv) r1
            r1.c = r7
            eyfy r7 = r0.build()
            fcfv r7 = (defpackage.fcfv) r7
            r7.getClass()
            r6.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r0 = r6.instance
            fcfw r0 = (defpackage.fcfw) r0
            r0.c = r7
            int r7 = r0.b
            r7 = r7 | r4
            r0.b = r7
            eyfy r6 = r6.build()
            r6.getClass()
            fcfw r6 = (defpackage.fcfw) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwf.h(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r11, defpackage.cuwr r12, defpackage.fbcx r13, defpackage.culh r14, defpackage.ffgu r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.cuwd
            if (r0 == 0) goto L13
            r0 = r15
            cuwd r0 = (defpackage.cuwd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuwd r0 = new cuwd
            r0.<init>(r10, r15)
        L18:
            r8 = r0
            java.lang.Object r15 = r8.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.ffci.b(r15)
            goto L46
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            defpackage.ffci.b(r15)
            r15 = r2
            fgtp r2 = defpackage.fgtp.DEVICE_SPAM_SIGNAL
            r8.c = r15
            r4 = 0
            r9 = 4
            r1 = r10
            r3 = r11
            r5 = r12
            r7 = r13
            r6 = r14
            java.lang.Object r15 = n(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r15 != r0) goto L46
            return r0
        L46:
            fcio r15 = (defpackage.fcio) r15
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwf.i(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, cuwr, fbcx, culh, ffgu):java.lang.Object");
    }

    public final void j(eymj eymjVar, ConversationIdType conversationIdType, MessageIdType messageIdType) {
        cuhh b2 = ((cuha) this.l.b()).b(conversationIdType, messageIdType);
        if (b2 == null) {
            return;
        }
        eymb eymbVar = (eymb) eymc.a.createBuilder();
        eymbVar.getClass();
        String k = b2.k();
        if (k != null && k.length() != 0) {
            String k2 = b2.k();
            k2.getClass();
            eyee a2 = cugt.a(k2);
            eymbVar.copyOnWrite();
            eymc eymcVar = (eymc) eymbVar.instance;
            eymcVar.b |= 2;
            eymcVar.d = a2;
        }
        String l = b2.l();
        if (l != null && l.length() != 0) {
            String l2 = b2.l();
            l2.getClass();
            eyee a3 = cugt.a(l2);
            eymbVar.copyOnWrite();
            eymc eymcVar2 = (eymc) eymbVar.instance;
            eymcVar2.b |= 1;
            eymcVar2.c = a3;
        }
        eymc eymcVar3 = (eymc) eymbVar.build();
        eymjVar.copyOnWrite();
        eyml eymlVar = (eyml) eymjVar.instance;
        eyml eymlVar2 = eyml.a;
        eymcVar3.getClass();
        eymlVar.l = eymcVar3;
        eymlVar.b |= 512;
    }

    public final void k(eymj eymjVar) {
        String s = ((ctwb) this.m.b()).j().s();
        s.getClass();
        if (s.length() > 0) {
            eylz eylzVar = (eylz) eyma.a.createBuilder();
            String d = emuz.d(s);
            d.getClass();
            eylzVar.copyOnWrite();
            eyma eymaVar = (eyma) eylzVar.instance;
            eymaVar.b |= 1;
            eymaVar.c = d;
            eymjVar.copyOnWrite();
            eyml eymlVar = (eyml) eymjVar.instance;
            eyma eymaVar2 = (eyma) eylzVar.build();
            eyml eymlVar2 = eyml.a;
            eymaVar2.getClass();
            eymlVar.f = eymaVar2;
            eymlVar.b |= 8;
        }
    }
}
