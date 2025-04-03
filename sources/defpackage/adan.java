package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adan implements drau {
    public static final enru a = enru.c("com/google/android/apps/messaging/emotify/logging/EmotifyEventLoggerImpl");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public adan(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    public static final int e(drav dravVar) {
        int ordinal = dravVar.ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 3;
        }
        if (ordinal == 2) {
            return 4;
        }
        if (ordinal == 3) {
            return 5;
        }
        throw new ffcd();
    }

    @Override // defpackage.drau
    public final void a() {
        akxn a2 = ((akyb) this.b.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.EMOTIFY_CREATE_EVENT, eoluVar);
        adak adakVar = (adak) this.c.b();
        ffjo ffjoVar = new ffjo() { // from class: adam
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.ffjo
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                int i;
                drav dravVar = (drav) obj;
                draw drawVar = (draw) obj2;
                drat dratVar = (drat) obj3;
                Long l = (Long) obj4;
                long longValue = l.longValue();
                dravVar.getClass();
                dratVar.getClass();
                ((enrr) adan.a.e().h("com/google/android/apps/messaging/emotify/logging/EmotifyEventLoggerImpl", "logCreationEvent$lambda$3$lambda$2", 60, "EmotifyEventLoggerImpl.kt")).K("Logging emotify create event: entry: %s, error: %s, result: %s, latency: %d", dravVar.name(), drawVar != null ? drawVar.name() : null, dratVar.name(), l);
                ercp ercpVar = (ercp) ercs.a.createBuilder();
                ercpVar.getClass();
                int e = adan.e(dravVar);
                ercpVar.copyOnWrite();
                ercs ercsVar = (ercs) ercpVar.instance;
                ercsVar.c = e - 1;
                ercsVar.b |= 1;
                int ordinal = dratVar.ordinal();
                int i2 = 3;
                if (ordinal == 0) {
                    i = 2;
                } else if (ordinal == 1) {
                    i = 3;
                } else {
                    if (ordinal != 2) {
                        throw new ffcd();
                    }
                    i = 4;
                }
                ercpVar.copyOnWrite();
                ercs ercsVar2 = (ercs) ercpVar.instance;
                ercsVar2.d = i - 1;
                ercsVar2.b |= 2;
                if (drawVar != null) {
                    switch (drawVar.ordinal()) {
                        case 0:
                            i2 = 2;
                            ercpVar.copyOnWrite();
                            ercs ercsVar3 = (ercs) ercpVar.instance;
                            ercsVar3.e = i2 - 1;
                            ercsVar3.b |= 4;
                            break;
                        case 1:
                            ercpVar.copyOnWrite();
                            ercs ercsVar32 = (ercs) ercpVar.instance;
                            ercsVar32.e = i2 - 1;
                            ercsVar32.b |= 4;
                            break;
                        case 2:
                            i2 = 4;
                            ercpVar.copyOnWrite();
                            ercs ercsVar322 = (ercs) ercpVar.instance;
                            ercsVar322.e = i2 - 1;
                            ercsVar322.b |= 4;
                            break;
                        case 3:
                            i2 = 5;
                            ercpVar.copyOnWrite();
                            ercs ercsVar3222 = (ercs) ercpVar.instance;
                            ercsVar3222.e = i2 - 1;
                            ercsVar3222.b |= 4;
                            break;
                        case 4:
                            i2 = 6;
                            ercpVar.copyOnWrite();
                            ercs ercsVar32222 = (ercs) ercpVar.instance;
                            ercsVar32222.e = i2 - 1;
                            ercsVar32222.b |= 4;
                            break;
                        case 5:
                            i2 = 7;
                            ercpVar.copyOnWrite();
                            ercs ercsVar322222 = (ercs) ercpVar.instance;
                            ercsVar322222.e = i2 - 1;
                            ercsVar322222.b |= 4;
                            break;
                        case 6:
                            i2 = 8;
                            ercpVar.copyOnWrite();
                            ercs ercsVar3222222 = (ercs) ercpVar.instance;
                            ercsVar3222222.e = i2 - 1;
                            ercsVar3222222.b |= 4;
                            break;
                        default:
                            throw new ffcd();
                    }
                }
                ercpVar.copyOnWrite();
                ercs ercsVar4 = (ercs) ercpVar.instance;
                ercsVar4.b = 8 | ercsVar4.b;
                ercsVar4.f = (int) longValue;
                eyfy build = ercpVar.build();
                build.getClass();
                return (ercs) build;
            }
        };
        drav dravVar = adakVar.b;
        if (dravVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        draw drawVar = adakVar.c;
        drat dratVar = adakVar.d;
        if (dratVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        long j = adakVar.f;
        Object a3 = ffjoVar.a(dravVar, drawVar, dratVar, Long.valueOf(j > 0 ? j - adakVar.e : 0L));
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.bW = (ercs) a3;
        eolvVar.g |= 536870912;
        a2.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_EMOTIFY_EVENTS);
        ((adak) this.c.b()).c();
    }

    @Override // defpackage.drau
    public final void b(drav dravVar) {
        dravVar.getClass();
        akxn a2 = ((akyb) this.b.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.EMOTIFY_DELETE_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        erct erctVar = (erct) ercu.a.createBuilder();
        erctVar.getClass();
        int e = e(dravVar);
        erctVar.copyOnWrite();
        ercu ercuVar = (ercu) erctVar.instance;
        ercuVar.c = e - 1;
        ercuVar.b |= 1;
        eyfy build = erctVar.build();
        build.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.bZ = (ercu) build;
        eolvVar2.h |= 1;
        a2.j(eoluVar, alal.LOG_SPEC_EMOTIFY_EVENTS);
    }

    @Override // defpackage.drau
    public final void c(drav dravVar) {
        dravVar.getClass();
        akxn a2 = ((akyb) this.b.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.EMOTIFY_IMPRESSION_EVENT, eoluVar);
        ercv ercvVar = (ercv) ercw.a.createBuilder();
        ercvVar.getClass();
        int e = e(dravVar);
        ercvVar.copyOnWrite();
        ercw ercwVar = (ercw) ercvVar.instance;
        ercwVar.c = e - 1;
        ercwVar.b |= 1;
        eyfy build = ercvVar.build();
        build.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.bX = (ercw) build;
        eolvVar.g |= 1073741824;
        a2.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_EMOTIFY_EVENTS);
    }

    @Override // defpackage.drau
    public final void d() {
        akxn a2 = ((akyb) this.b.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.EMOTIFY_MESSAGE_SEND_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        adao adaoVar = (adao) this.d.b();
        Object a3 = new ffjo() { // from class: adal
            @Override // defpackage.ffjo
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                Integer num2 = (Integer) obj2;
                int intValue2 = num2.intValue();
                Integer num3 = (Integer) obj3;
                int intValue3 = num3.intValue();
                Boolean bool = (Boolean) obj4;
                boolean booleanValue = bool.booleanValue();
                ((enrr) adan.a.e().h("com/google/android/apps/messaging/emotify/logging/EmotifyEventLoggerImpl", "logSendEvent$lambda$7", 110, "EmotifyEventLoggerImpl.kt")).K("Logging emotify send event: tabClicks: %d, selected: %d, sent: %d, createButtonClicked: %s", num, num2, num3, bool);
                ercx ercxVar = (ercx) ercy.a.createBuilder();
                ercxVar.getClass();
                ercxVar.copyOnWrite();
                ercy ercyVar = (ercy) ercxVar.instance;
                ercyVar.b |= 1;
                ercyVar.c = intValue;
                ercxVar.copyOnWrite();
                ercy ercyVar2 = (ercy) ercxVar.instance;
                ercyVar2.b |= 2;
                ercyVar2.d = intValue2;
                ercxVar.copyOnWrite();
                ercy ercyVar3 = (ercy) ercxVar.instance;
                ercyVar3.b |= 8;
                ercyVar3.e = intValue3;
                ercxVar.copyOnWrite();
                ercy ercyVar4 = (ercy) ercxVar.instance;
                ercyVar4.b |= 32;
                ercyVar4.f = booleanValue;
                eyfy build = ercxVar.build();
                build.getClass();
                return (ercy) build;
            }
        }.a(Integer.valueOf(adaoVar.a), Integer.valueOf(adaoVar.b), Integer.valueOf(adaoVar.c), Boolean.valueOf(adaoVar.d));
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.bY = (ercy) a3;
        eolvVar2.g |= Integer.MIN_VALUE;
        a2.j(eoluVar, alal.LOG_SPEC_EMOTIFY_EVENTS);
        adao adaoVar2 = (adao) this.d.b();
        adaoVar2.a = 0;
        adaoVar2.b = 0;
        adaoVar2.c = 0;
    }
}
