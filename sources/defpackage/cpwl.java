package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpwl {
    public static final /* synthetic */ int c = 0;
    private final ffbr f;
    private final cqoh g;
    private final cpwv h;
    private final coyq i;
    private final ffbr j;
    private final ffbr k;
    private static final cskc d = cskc.g("Bugle", "TelephonyWipeoutDetector");
    static final cfup a = cfvl.i(cfvl.b, "enable_message_count_for_wipeout", true);
    static final cfup b = cfvl.r(172575264, "check_for_permissions");
    private static final Object e = new Object();

    public cpwl(ffbr ffbrVar, cqoh cqohVar, cpwv cpwvVar, coyq coyqVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.f = ffbrVar;
        this.g = cqohVar;
        this.h = cpwvVar;
        this.i = coyqVar;
        this.j = ffbrVar2;
        this.k = ffbrVar3;
    }

    public final Optional a(eplb eplbVar) {
        Optional b2 = b(eplbVar);
        return b2.isEmpty() ? Optional.empty() : ((cpwm) b2.get()).a;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [cfup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [cfup, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    public final Optional b(eplb eplbVar) {
        Optional optional;
        int i;
        int i2;
        long j;
        Optional optional2;
        Optional optional3;
        int i3;
        Optional optional4;
        int i4;
        ffbr ffbrVar;
        boolean z;
        int i5;
        Optional empty;
        eplb eplbVar2 = eplbVar;
        boolean z2 = true;
        emxf.l(!efbd.g());
        synchronized (e) {
            long a2 = this.g.a();
            Optional empty2 = Optional.empty();
            ffbr ffbrVar2 = this.h.a;
            ArrayList arrayList = new ArrayList();
            Optional empty3 = Optional.empty();
            Optional empty4 = Optional.empty();
            if (((Boolean) a.e()).booleanValue()) {
                buxo d2 = MessagesTable.d();
                d2.z("executeAllHeuristicsDetailed1");
                d2.r();
                d2.h(new Function() { // from class: cpwj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        int i6 = cpwl.c;
                        buxzVar.ad();
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i6 = d2.b().i();
                buxo d3 = MessagesTable.d();
                d3.z("executeAllHeuristicsDetailed2");
                d3.r();
                d3.h(new Function() { // from class: cpwk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        int i7 = cpwl.c;
                        buxzVar.ae();
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                i2 = d3.b().i();
                optional = empty2;
                i = i6;
            } else {
                optional = empty2;
                i = 0;
                i2 = 0;
            }
            if (((Boolean) b.e()).booleanValue() && !((cptp) this.k.b()).a()) {
                Duration ofMillis = Duration.ofMillis(this.g.a() - a2);
                epkx epkxVar = (epkx) eplc.a.createBuilder();
                eyev a3 = eykj.a(ofMillis);
                epkxVar.copyOnWrite();
                eplc eplcVar = (eplc) epkxVar.instance;
                a3.getClass();
                eplcVar.g = a3;
                eplcVar.b |= 8;
                int b2 = cptn.b(Optional.of(Integer.valueOf(i)));
                epkxVar.copyOnWrite();
                eplc eplcVar2 = (eplc) epkxVar.instance;
                eplcVar2.j = b2 - 1;
                eplcVar2.b |= 64;
                int b3 = cptn.b(Optional.of(Integer.valueOf(i2)));
                epkxVar.copyOnWrite();
                eplc eplcVar3 = (eplc) epkxVar.instance;
                eplcVar3.k = b3 - 1;
                eplcVar3.b |= 128;
                epkxVar.copyOnWrite();
                eplc eplcVar4 = (eplc) epkxVar.instance;
                eplcVar4.c = eplbVar2.g;
                eplcVar4.b |= 1;
                epkxVar.copyOnWrite();
                eplc eplcVar5 = (eplc) epkxVar.instance;
                eplcVar5.h = 3;
                eplcVar5.b |= 16;
                epkxVar.copyOnWrite();
                eplc eplcVar6 = (eplc) epkxVar.instance;
                eplcVar6.i = 1;
                eplcVar6.b |= 32;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    epkxVar.a((epld) it.next());
                }
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.TELEPHONY_WIPEOUT_DETECTOR_EXECUTION_EVENT;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eplc eplcVar7 = (eplc) epkxVar.build();
                eplcVar7.getClass();
                eolvVar2.at = eplcVar7;
                eolvVar2.d |= 16384;
                ((akxl) ffbrVar2.b()).j(eoluVar);
                return Optional.empty();
            }
            try {
                empty3 = Optional.of(Integer.valueOf(this.i.ao()));
            } catch (Throwable th) {
                d.e().s(th);
                ((akzt) this.j.b()).c("Bugle.Wipeout.ErrorWhenGettingTelephonyCount.Sms");
            }
            try {
                empty4 = Optional.of(Integer.valueOf(this.i.an()));
            } catch (Throwable th2) {
                d.e().s(th2);
                ((akzt) this.j.b()).c("Bugle.Wipeout.ErrorWhenGettingTelephonyCount.Mms");
            }
            try {
                boolean z3 = false;
                for (cpwt cpwtVar : (Set) this.f.b()) {
                    try {
                        try {
                            if (cpwtVar.g.contains(eplbVar2)) {
                                if (((Boolean) cpwtVar.e.b().e()).booleanValue()) {
                                    long a4 = cpwtVar.h.a();
                                    Optional empty5 = Optional.empty();
                                    boolean booleanValue = ((Boolean) cpwtVar.f.b().e()).booleanValue();
                                    try {
                                        empty5 = cpwtVar.c.a();
                                        i5 = empty5.isPresent() ? true != ((Boolean) empty5.get()).booleanValue() ? 3 : 2 : 5;
                                        j = a2;
                                        i4 = i;
                                        ffbrVar = ffbrVar2;
                                    } catch (Throwable th3) {
                                        csjb e2 = cpwt.a.e();
                                        j = a2;
                                        try {
                                            e2.I("Error while executing wipeout heuristic");
                                            e2.A("heuristicName", cpwtVar.d);
                                            e2.s(th3);
                                            i4 = i;
                                            ffbrVar = ffbrVar2;
                                            ((ensz) ((ensz) ((ensz) cpwt.b.i()).g(th3)).h("com/google/android/apps/messaging/shared/telephony/WipeoutDetectionHeuristicExecutor", "detectWipeout", 122, "WipeoutDetectionHeuristicExecutor.java")).w("Error while executing wipeout heuristic %d, error=%s", cpwtVar.d.e, new evhq(evhp.NO_USER_DATA, th3.getMessage()));
                                            i5 = 4;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            optional2 = empty3;
                                            optional3 = empty4;
                                            i3 = i2;
                                            optional4 = optional;
                                            cpwu.a(eplbVar, Duration.ofMillis(this.g.a() - j), optional2, optional3, i, i3, optional4, ffbrVar2, arrayList);
                                            throw th;
                                        }
                                    }
                                    Duration ofMillis2 = Duration.ofMillis(cpwtVar.h.a() - a4);
                                    eplf eplfVar = cpwtVar.d;
                                    epld epldVar = (epld) eplh.a.createBuilder();
                                    epldVar.copyOnWrite();
                                    eplh eplhVar = (eplh) epldVar.instance;
                                    eplhVar.c = eplfVar.e;
                                    z = true;
                                    eplhVar.b |= 1;
                                    epldVar.copyOnWrite();
                                    eplh eplhVar2 = (eplh) epldVar.instance;
                                    eplhVar2.d = i5 - 1;
                                    eplhVar2.b |= 2;
                                    eyev a5 = eykj.a(ofMillis2);
                                    epldVar.copyOnWrite();
                                    eplh eplhVar3 = (eplh) epldVar.instance;
                                    a5.getClass();
                                    eplhVar3.e = a5;
                                    eplhVar3.b |= 4;
                                    epldVar.copyOnWrite();
                                    eplh eplhVar4 = (eplh) epldVar.instance;
                                    eplhVar4.b |= 8;
                                    eplhVar4.f = booleanValue;
                                    arrayList.add(epldVar);
                                    empty = booleanValue ? Optional.empty() : empty5;
                                } else {
                                    empty = Optional.empty();
                                    z = z2;
                                    j = a2;
                                    i4 = i;
                                    ffbrVar = ffbrVar2;
                                }
                                if (!empty.isEmpty()) {
                                    try {
                                        z3 |= ((Boolean) empty.get()).booleanValue();
                                        optional = Optional.of(Boolean.valueOf(z3));
                                    } catch (Throwable th5) {
                                        th = th5;
                                        optional2 = empty3;
                                        optional3 = empty4;
                                        i3 = i2;
                                        optional4 = optional;
                                        i = i4;
                                        ffbrVar2 = ffbrVar;
                                        cpwu.a(eplbVar, Duration.ofMillis(this.g.a() - j), optional2, optional3, i, i3, optional4, ffbrVar2, arrayList);
                                        throw th;
                                    }
                                }
                            } else {
                                z = z2;
                                j = a2;
                                i4 = i;
                                ffbrVar = ffbrVar2;
                            }
                            eplbVar2 = eplbVar;
                            z2 = z;
                            a2 = j;
                            i = i4;
                            ffbrVar2 = ffbrVar;
                        } catch (Throwable th6) {
                            th = th6;
                            j = a2;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        j = a2;
                    }
                }
                j = a2;
                i4 = i;
                ffbrVar = ffbrVar2;
                Optional of = Optional.of(new cpwm(optional, empty3, empty4));
                cpwu.a(eplbVar, Duration.ofMillis(this.g.a() - j), empty3, empty4, i4, i2, optional, ffbrVar, arrayList);
                return of;
            } catch (Throwable th8) {
                th = th8;
                j = a2;
            }
        }
    }
}
