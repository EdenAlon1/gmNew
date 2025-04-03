package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctml {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionTypesFlags");
    public final ffbr a;
    public final ffbr b;
    private final Map d;
    private final ffbz e;

    public ctml(ffbr ffbrVar, ffbr ffbrVar2, Map map) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.d = map;
        this.e = ffca.a(new ffix() { // from class: ctmi
            @Override // defpackage.ffix
            public final Object invoke() {
                String str = (String) ctjd.m.e();
                str.getClass();
                Set n = ctml.n(str);
                String str2 = (String) ctjd.n.e();
                str2.getClass();
                return new ctmj(n, ctml.n(str2));
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r2.equals("UNKNOWN") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Set n(java.lang.String r9) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List r9 = defpackage.cuxt.e(r9)
            java.util.Iterator r9 = r9.iterator()
        Ld:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lc4
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            int r2 = r1.length()
            if (r2 <= 0) goto Ld
            r2 = 58
            emye r2 = defpackage.emye.b(r2)     // Catch: java.lang.IllegalArgumentException -> L9b
            java.util.List r2 = r2.i(r1)     // Catch: java.lang.IllegalArgumentException -> L9b
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.IllegalArgumentException -> L9b
            int r5 = r2.size()     // Catch: java.lang.IllegalArgumentException -> L9b
            r6 = 1
            if (r5 <= r6) goto L83
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.IllegalArgumentException -> L9b
            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.IllegalArgumentException -> L9b
            int r5 = r2.hashCode()     // Catch: java.lang.IllegalArgumentException -> L9b
            r7 = 2044801(0x1f3381, float:2.865377E-39)
            r8 = 2
            if (r5 == r7) goto L6b
            r7 = 433141802(0x19d1382a, float:2.1632778E-23)
            if (r5 == r7) goto L62
            r3 = 2013139542(0x77fe1256, float:1.03063695E34)
            if (r5 == r3) goto L58
            goto L75
        L58:
            java.lang.String r3 = "DEVICE"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L75
            r3 = r8
            goto L76
        L62:
            java.lang.String r5 = "UNKNOWN"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L75
            goto L76
        L6b:
            java.lang.String r3 = "BOTH"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L75
            r3 = r6
            goto L76
        L75:
            r3 = -1
        L76:
            if (r3 == 0) goto L83
            if (r3 == r6) goto L83
            if (r3 != r8) goto L7d
            goto L83
        L7d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L9b
            r2.<init>()     // Catch: java.lang.IllegalArgumentException -> L9b
            throw r2     // Catch: java.lang.IllegalArgumentException -> L9b
        L83:
            r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L9b
            fbri r2 = defpackage.fbri.c(r4)     // Catch: java.lang.IllegalArgumentException -> L9b
            fbri r3 = defpackage.fbri.UNKNOWN_SUGGESTION_TYPE     // Catch: java.lang.IllegalArgumentException -> L9b
            if (r2 == r3) goto L93
            r0.add(r2)     // Catch: java.lang.IllegalArgumentException -> L9b
            goto Ld
        L93:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r3 = "Unknown Suggestion Type found"
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L9b
            throw r2     // Catch: java.lang.IllegalArgumentException -> L9b
        L9b:
            r2 = move-exception
            enru r3 = defpackage.ctml.c
            ensk r3 = r3.i()
            ensn r4 = defpackage.ente.a
            java.lang.String r5 = "Bugle"
            r3.Y(r4, r5)
            enrr r3 = (defpackage.enrr) r3
            ensk r2 = r3.g(r2)
            java.lang.String r3 = "parseSuggestionTypes"
            r4 = 183(0xb7, float:2.56E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionTypesFlags"
            java.lang.String r6 = "SmartSuggestionTypesFlags.kt"
            ensk r2 = r2.h(r5, r3, r4, r6)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r3 = "SmartSuggestionConfigUtils: Unknown suggestion type %s"
            r2.t(r3, r1)
            goto Ld
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctml.n(java.lang.String):java.util.Set");
    }

    public final ctmj a() {
        return (ctmj) this.e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0086 -> B:10:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r9, defpackage.epjp r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ctmk
            if (r0 == 0) goto L13
            r0 = r11
            ctmk r0 = (defpackage.ctmk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ctmk r0 = new ctmk
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            fbri r9 = r0.g
            java.lang.Object r10 = r0.a
            cmj r2 = r0.h
            epjp r4 = r0.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r5 = r0.e
            defpackage.ffci.b(r11)
            goto L8c
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.ffci.b(r11)
            cmj r11 = new cmj
            java.util.Set r2 = r8.c(r10)
            r11.<init>(r2)
            java.util.Map r2 = r8.d
            enhk r2 = (defpackage.enhk) r2
            enip r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r7 = r11
            r11 = r10
            r10 = r2
            r2 = r7
        L55:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L9b
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            fbri r5 = (defpackage.fbri) r5
            java.lang.Object r4 = r4.getValue()
            ctmq r4 = (defpackage.ctmq) r4
            epjp r6 = defpackage.epjp.REPLY
            if (r11 != r6) goto L73
            r6 = r3
            goto L74
        L73:
            r6 = 0
        L74:
            r0.e = r9
            r0.f = r11
            r0.h = r2
            r0.a = r10
            r0.g = r5
            r0.d = r3
            java.lang.Object r4 = r4.a(r9, r6, r0)
            if (r4 == r1) goto L9a
            r7 = r5
            r5 = r9
            r9 = r7
            r7 = r4
            r4 = r11
            r11 = r7
        L8c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L97
            r2.remove(r9)
        L97:
            r11 = r4
            r9 = r5
            goto L55
        L9a:
            return r1
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctml.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, epjp, ffgu):java.lang.Object");
    }

    public final Set c(epjp epjpVar) {
        epjpVar.getClass();
        Set set = epjpVar == epjp.REPLY ? a().a : a().b;
        return (!((Boolean) ((cfup) ctjd.bJ.get()).e()).booleanValue() || ((ctyz) this.a.b()).n()) ? set : ffdx.ap(set, bduu.a);
    }

    public final boolean d() {
        return m(fbri.CALENDAR);
    }

    public final boolean e() {
        return m(fbri.DUO_CALL);
    }

    public final boolean f() {
        return ((ctyz) this.a.b()).q() && m(fbri.EMOTION);
    }

    public final boolean g() {
        return m(fbri.GIF);
    }

    public final boolean h() {
        return m(fbri.LOCATION);
    }

    public final boolean i() {
        return m(fbri.RECENT_IMAGE);
    }

    public final boolean j() {
        return m(fbri.RECORD_VOICE_MESSAGE);
    }

    public final boolean k() {
        return m(fbri.REMINDER);
    }

    public final boolean l() {
        return m(fbri.STARRING);
    }

    public final boolean m(fbri fbriVar) {
        return a().a.contains(fbriVar) || a().b.contains(fbriVar);
    }
}
