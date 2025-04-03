package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alvz {
    public static final /* synthetic */ int d = 0;
    private final ffbr A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final csjk E;
    public final azaw b;
    public final ffbr c;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final fazb i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final fazb m;
    private final ffbr n;
    private final fazb o;
    private final ffbr p;
    private final ffbr q;
    private final errl r;
    private final errl s;
    private final fazb t;
    private final Context u;
    private final avkk v;
    private final fazb w;
    private final ffbr x;
    private final ffbr y;
    private final ffbr z;
    private static final cskc e = cskc.g("BugleUsageStatistics", "UsageStatsMessageEventBuilder");
    static final cfup a = cfvl.c(cfvl.b, "carrier_config_logging_sampling_percent", 1.0d);

    public alvz(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, fazb fazbVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, fazb fazbVar2, ffbr ffbrVar7, fazb fazbVar3, ffbr ffbrVar8, ffbr ffbrVar9, errl errlVar, errl errlVar2, fazb fazbVar4, avkk avkkVar, fazb fazbVar5, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, azaw azawVar, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, csjk csjkVar) {
        this.u = context;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = fazbVar;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.m = fazbVar2;
        this.n = ffbrVar7;
        this.o = fazbVar3;
        this.p = ffbrVar8;
        this.q = ffbrVar9;
        this.r = errlVar;
        this.s = errlVar2;
        this.t = fazbVar4;
        this.v = avkkVar;
        this.w = fazbVar5;
        this.x = ffbrVar10;
        this.y = ffbrVar11;
        this.z = ffbrVar12;
        this.A = ffbrVar13;
        this.b = azawVar;
        this.B = ffbrVar14;
        this.c = ffbrVar15;
        this.C = ffbrVar16;
        this.D = ffbrVar17;
        this.E = csjkVar;
    }

    public final elfl a(final int i) {
        if (!((Optional) this.D.b()).isPresent()) {
            return ((ctsz) this.h.b()).b().h(new emwl() { // from class: alvy
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ctsx ctsxVar = (ctsx) obj;
                    eotn c = alvz.this.c(i);
                    boolean z = ctsxVar.c;
                    c.copyOnWrite();
                    eotr eotrVar = (eotr) c.instance;
                    eotr eotrVar2 = eotr.a;
                    eotrVar.b |= 1073741824;
                    eotrVar.F = z;
                    boolean z2 = ctsxVar.d;
                    c.copyOnWrite();
                    eotr eotrVar3 = (eotr) c.instance;
                    eotrVar3.b |= Integer.MIN_VALUE;
                    eotrVar3.G = z2;
                    if (stl.a()) {
                        boolean z3 = ctsxVar.e;
                        c.copyOnWrite();
                        eotr eotrVar4 = (eotr) c.instance;
                        eotrVar4.c |= 1;
                        eotrVar4.H = z3;
                    }
                    return (eotr) c.build();
                }
            }, this.r);
        }
        final elfl b = ((ctsz) this.h.b()).b();
        final elfl b2 = ((cjeo) ((Optional) this.D.b()).get()).b();
        return elfo.m(b, b2).a(new Callable() { // from class: alvx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctsx ctsxVar = (ctsx) erqt.q(b);
                Boolean bool = (Boolean) erqt.q(b2);
                eotn c = alvz.this.c(i);
                boolean z = ctsxVar.c;
                c.copyOnWrite();
                eotr eotrVar = (eotr) c.instance;
                eotr eotrVar2 = eotr.a;
                eotrVar.b |= 1073741824;
                eotrVar.F = z;
                boolean z2 = ctsxVar.d;
                c.copyOnWrite();
                eotr eotrVar3 = (eotr) c.instance;
                eotrVar3.b |= Integer.MIN_VALUE;
                eotrVar3.G = z2;
                boolean booleanValue = bool.booleanValue();
                c.copyOnWrite();
                eotr eotrVar4 = (eotr) c.instance;
                eotrVar4.c |= 512;
                eotrVar4.Q = booleanValue;
                if (stl.a()) {
                    boolean z3 = ctsxVar.e;
                    c.copyOnWrite();
                    eotr eotrVar5 = (eotr) c.instance;
                    eotrVar5.c |= 1;
                    eotrVar5.H = z3;
                }
                return (eotr) c.build();
            }
        }, this.r);
    }

    public final elfl b(MessageCoreData messageCoreData, final eoop eoopVar) {
        return (!messageCoreData.cS() ? elfo.e(messageCoreData.ag()) : ((bdfp) this.B.b()).a(messageCoreData.z()).h(new emwl() { // from class: alvt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = (engw) obj;
                return engwVar.size() != 1 ? Optional.empty() : Optional.of(((aolr) alvz.this.c.b()).q((ParticipantsTable.BindData) engwVar.get(0)));
            }
        }, this.s)).i(new eroh() { // from class: alvr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final azaw azawVar = alvz.this.b;
                azawVar.getClass();
                return (ListenableFuture) ((Optional) obj).map(new Function() { // from class: alvu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return azaw.this.c((aoku) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(elfo.e(azau.c()));
            }
        }, this.s).h(new emwl() { // from class: alvs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = alvz.d;
                eqyl eqylVar = ((azau) obj).d(cgye.TACHYGRAM.name()) ? eqyl.RCS_TACHYGRAM : eqyl.UNKNOWN_RCS_TYPE;
                eoop eoopVar2 = eoop.this;
                eoopVar2.copyOnWrite();
                eopq eopqVar = (eopq) eoopVar2.instance;
                eopq eopqVar2 = eopq.a;
                eopqVar.ab = eqylVar.h;
                eopqVar.c |= 4194304;
                return null;
            }
        }, this.s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0474, code lost:
    
        if (r11 != 1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eotn c(int r11) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alvz.c(int):eotn");
    }

    public final Optional d() {
        if (((Optional) this.i.b()).isPresent()) {
            return Optional.empty();
        }
        try {
            return Optional.of(this.u.getPackageManager().getPackageInfo("com.google.android.ims", 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return Optional.empty();
        }
    }

    public final String e() {
        return (String) d().map(new Function() { // from class: alvw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = alvz.d;
                return ((PackageInfo) obj).versionName;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("NOT_AVAILABLE");
    }

    public final void f(eoop eoopVar, int i) {
        Optional of;
        eots eotsVar = (eots) eotw.a.createBuilder();
        eotsVar.copyOnWrite();
        eotw eotwVar = (eotw) eotsVar.instance;
        eotwVar.b |= 1;
        eotwVar.c = i;
        eotw eotwVar2 = (eotw) eotsVar.build();
        Optional i2 = ((cort) this.z.b()).i(i);
        if (i2.isEmpty()) {
            csjb a2 = e.a();
            a2.I("No subscription found for subId");
            a2.y("subId", i);
            a2.r();
            of = Optional.empty();
        } else {
            of = Optional.of(((cosz) i2.get()).p);
        }
        eots eotsVar2 = (eots) eotwVar2.toBuilder();
        eqwf eqwfVar = ((djrv) this.C.b()).d(i).a;
        eotsVar2.copyOnWrite();
        eotw eotwVar3 = (eotw) eotsVar2.instance;
        eotwVar3.j = eqwfVar.N;
        eotwVar3.b |= 64;
        eotw eotwVar4 = (eotw) eotsVar2.build();
        if (of.isPresent()) {
            eots eotsVar3 = (eots) eotwVar4.toBuilder();
            Object obj = of.get();
            eotsVar3.copyOnWrite();
            eotw eotwVar5 = (eotw) eotsVar3.instance;
            eotwVar5.b |= 32;
            eotwVar5.i = (String) obj;
            eotwVar4 = (eotw) eotsVar3.build();
        }
        int d2 = ((ctwb) this.f.b()).d();
        int c = ((ctwb) this.f.b()).c();
        int b = ((ctwb) this.f.b()).b();
        eots eotsVar4 = (eots) eotwVar4.toBuilder();
        eotv eotvVar = eotwVar4.f;
        if (eotvVar == null) {
            eotvVar = eotv.a;
        }
        eotu eotuVar = (eotu) eotvVar.toBuilder();
        boolean z = i == d2;
        eotuVar.copyOnWrite();
        eotv eotvVar2 = (eotv) eotuVar.instance;
        eotvVar2.b |= 1;
        eotvVar2.c = z;
        boolean z2 = i == c;
        eotuVar.copyOnWrite();
        eotv eotvVar3 = (eotv) eotuVar.instance;
        eotvVar3.b |= 2;
        eotvVar3.d = z2;
        boolean z3 = i == b;
        eotuVar.copyOnWrite();
        eotv eotvVar4 = (eotv) eotuVar.instance;
        eotvVar4.b |= 4;
        eotvVar4.e = z3;
        boolean z4 = i == ((ctwb) this.f.b()).f();
        eotuVar.copyOnWrite();
        eotv eotvVar5 = (eotv) eotuVar.instance;
        eotvVar5.b |= 8;
        eotvVar5.f = z4;
        eotv eotvVar6 = (eotv) eotuVar.build();
        eotsVar4.copyOnWrite();
        eotw eotwVar6 = (eotw) eotsVar4.instance;
        eotvVar6.getClass();
        eotwVar6.f = eotvVar6;
        eotwVar6.b |= 8;
        eotw eotwVar7 = (eotw) eotsVar4.build();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopq eopqVar2 = eopq.a;
        eotwVar7.getClass();
        eopqVar.l = eotwVar7;
        eopqVar.b |= 32;
    }

    public final void g(eoop eoopVar) {
        int B = ((csmz) this.E.a()).B();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopq eopqVar2 = eopq.a;
        eopqVar.aD = B - 1;
        eopqVar.d |= 262144;
    }

    public final void h(MessageCoreData messageCoreData, eoop eoopVar) {
        if (messageCoreData.cX()) {
            int P = ((ckds) this.j.b()).P();
            eoopVar.copyOnWrite();
            eopq eopqVar = (eopq) eoopVar.instance;
            eopq eopqVar2 = eopq.a;
            eopqVar.ae = P - 1;
            eopqVar.c |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
    }

    public final void i(MessageCoreData messageCoreData, eoop eoopVar) {
        eopq eopqVar = (eopq) eoopVar.instance;
        if ((eopqVar.c & 2097152) != 0) {
            eqyl b = eqyl.b(eopqVar.aa);
            if (b == null) {
                b = eqyl.UNKNOWN_RCS_TYPE;
            }
            if (b != eqyl.UNKNOWN_RCS_TYPE) {
                return;
            }
        }
        if (messageCoreData == null || messageCoreData.cX()) {
            eqyl a2 = this.v.a();
            eoopVar.copyOnWrite();
            eopq eopqVar2 = (eopq) eoopVar.instance;
            eopqVar2.aa = a2.h;
            eopqVar2.c |= 2097152;
            return;
        }
        eqyl eqylVar = eqyl.NOT_RCS;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.aa = eqylVar.h;
        eopqVar3.c |= 2097152;
    }

    public final void j(MessageCoreData messageCoreData, final eoop eoopVar, Optional optional) {
        optional.ifPresent(new Consumer() { // from class: alvv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                eoop eoopVar2 = eoop.this;
                eoopVar2.copyOnWrite();
                eopq eopqVar = (eopq) eoopVar2.instance;
                eopq eopqVar2 = eopq.a;
                eopqVar.aa = ((eqyl) obj).h;
                eopqVar.c |= 2097152;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        i(messageCoreData, eoopVar);
    }

    public final eopv k(List list, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            eohk eohkVar = (eohk) eohl.a.createBuilder();
            String V = messagePartCoreData.V();
            eohj a2 = V != null ? csud.a(V) : eohj.UNKNOWN_BUGLE_CONTENT_TYPE;
            eohkVar.copyOnWrite();
            eohl eohlVar = (eohl) eohkVar.instance;
            eohlVar.c = a2.a();
            eohlVar.b |= 1;
            eohh N = messagePartCoreData.N();
            eohkVar.copyOnWrite();
            eohl eohlVar2 = (eohl) eohkVar.instance;
            eohlVar2.d = N.a();
            int i2 = 4;
            eohlVar2.b |= 4;
            eohkVar.copyOnWrite();
            eohl.a((eohl) eohkVar.instance);
            int i3 = 13;
            if (i != 13) {
                i3 = i;
            } else if (((Boolean) ((cfup) altk.e.get()).e()).booleanValue()) {
                long bQ = messagePartCoreData.bQ();
                eohkVar.copyOnWrite();
                eohl eohlVar3 = (eohl) eohkVar.instance;
                eohlVar3.b |= 32;
                eohlVar3.g = bQ;
            }
            if (messagePartCoreData.bk()) {
                eoha eohaVar = (eoha) eohb.a.createBuilder();
                int i4 = true != messagePartCoreData.aY() ? 3 : 4;
                eohaVar.copyOnWrite();
                eohb eohbVar = (eohb) eohaVar.instance;
                eohbVar.c = eohz.a(i4);
                eohbVar.b |= 1;
                int i5 = messagePartCoreData.p() >= 0 ? 4 : 3;
                eohaVar.copyOnWrite();
                eohb eohbVar2 = (eohb) eohaVar.instance;
                eohbVar2.d = eohz.a(i5);
                eohbVar2.b |= 2;
                eohb eohbVar3 = (eohb) eohaVar.build();
                eohkVar.copyOnWrite();
                eohl eohlVar4 = (eohl) eohkVar.instance;
                eohbVar3.getClass();
                eohlVar4.e = eohbVar3;
                eohlVar4.b |= 8;
                int a3 = csuc.a(messagePartCoreData.p());
                eohkVar.copyOnWrite();
                eohl eohlVar5 = (eohl) eohkVar.instance;
                eohlVar5.f = eohg.a(a3);
                eohlVar5.b |= 16;
            } else {
                eoha eohaVar2 = (eoha) eohb.a.createBuilder();
                eohaVar2.copyOnWrite();
                eohb eohbVar4 = (eohb) eohaVar2.instance;
                eohbVar4.c = eohz.a(2);
                eohbVar4.b |= 1;
                eohaVar2.copyOnWrite();
                eohb eohbVar5 = (eohb) eohaVar2.instance;
                eohbVar5.d = eohz.a(2);
                eohbVar5.b |= 2;
                eohb eohbVar6 = (eohb) eohaVar2.build();
                eohkVar.copyOnWrite();
                eohl eohlVar6 = (eohl) eohkVar.instance;
                eohbVar6.getClass();
                eohlVar6.e = eohbVar6;
                eohlVar6.b |= 8;
            }
            if (i3 == 2 || i3 == 6) {
                eohh N2 = messagePartCoreData.N();
                if (((altk) this.y.b()).am()) {
                    int ordinal = N2.ordinal();
                    if (ordinal == 34) {
                        i2 = 9;
                    } else if (ordinal != 46 && ordinal != 42 && ordinal != 43) {
                        switch (ordinal) {
                            case 3:
                            case 4:
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                i2 = 6;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                            default:
                                switch (ordinal) {
                                    case 26:
                                    case 27:
                                    case 28:
                                        break;
                                    default:
                                        i2 = 1;
                                        break;
                                }
                            case 11:
                                i2 = 8;
                                break;
                        }
                    }
                    if (i2 != 1) {
                        eolu eoluVar = (eolu) eolv.a.createBuilder();
                        eonj eonjVar = (eonj) eonk.a.createBuilder();
                        eonjVar.copyOnWrite();
                        eonk eonkVar = (eonk) eonjVar.instance;
                        eonkVar.c = 3;
                        eonkVar.b = 1 | eonkVar.b;
                        eonjVar.copyOnWrite();
                        eonk eonkVar2 = (eonk) eonjVar.instance;
                        eonkVar2.d = i2 - 1;
                        eonkVar2.b |= 2;
                        eoluVar.copyOnWrite();
                        eolv eolvVar = (eolv) eoluVar.instance;
                        eonk eonkVar3 = (eonk) eonjVar.build();
                        eonkVar3.getClass();
                        eolvVar.u = eonkVar3;
                        eolvVar.b |= 8192;
                        ((akxl) this.q.b()).j(eoluVar);
                    }
                } else {
                    ((altk) this.y.b()).r();
                }
            }
            arrayList.add((eohl) eohkVar.build());
        }
        eopu eopuVar = (eopu) eopv.a.createBuilder();
        eopuVar.copyOnWrite();
        eopv eopvVar = (eopv) eopuVar.instance;
        eopvVar.a();
        eydl.addAll(arrayList, eopvVar.b);
        return (eopv) eopuVar.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0040, code lost:
    
        if (r8 != 15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0044, code lost:
    
        if (r0 == 3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.eoop r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 2159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alvz.l(eoop, int, int, int):void");
    }
}
