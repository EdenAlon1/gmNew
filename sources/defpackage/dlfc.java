package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfc implements dlfk {
    private final dfld a;
    private final Context b;
    private final Map c;
    private final Optional d;

    public dlfc(dfld dfldVar, Context context, Map map, Optional optional) {
        context.getClass();
        this.a = dfldVar;
        this.b = context;
        this.c = map;
        this.d = optional;
    }

    private final rtj g(dlgb dlgbVar, eyee eyeeVar) {
        dlgd dlgdVar = (dlgd) this.c.get(dlgbVar.b);
        if (dlgdVar == null) {
            dlgdVar = dlgd.a;
        }
        rtj rtjVar = (rtj) rtk.a.createBuilder();
        rtb rtbVar = (rtb) rtc.a.createBuilder();
        rtbVar.copyOnWrite();
        rtc rtcVar = (rtc) rtbVar.instance;
        rtcVar.b |= 16;
        rtcVar.c = eyeeVar;
        String packageName = this.b.getPackageName();
        rtbVar.copyOnWrite();
        rtc rtcVar2 = (rtc) rtbVar.instance;
        packageName.getClass();
        rtcVar2.b |= 128;
        rtcVar2.d = packageName;
        long b = dlfd.b(dlgbVar);
        rtbVar.copyOnWrite();
        rtc rtcVar3 = (rtc) rtbVar.instance;
        rtcVar3.b |= 1024;
        rtcVar3.f = b;
        rtbVar.copyOnWrite();
        rtc rtcVar4 = (rtc) rtbVar.instance;
        rtcVar4.b |= 512;
        rtcVar4.e = 728121172L;
        rtbVar.copyOnWrite();
        rtc rtcVar5 = (rtc) rtbVar.instance;
        int i = dlgdVar.f;
        rtcVar5.g = 0;
        rtcVar5.b |= 2048;
        rtbVar.copyOnWrite();
        rtc rtcVar6 = (rtc) rtbVar.instance;
        int i2 = dlgdVar.g;
        rtcVar6.h = 0;
        rtcVar6.b |= 4096;
        rtbVar.copyOnWrite();
        rtc rtcVar7 = (rtc) rtbVar.instance;
        int i3 = dlgdVar.h;
        rtcVar7.i = 0;
        rtcVar7.b |= 8192;
        rtc rtcVar8 = (rtc) rtbVar.build();
        rtjVar.copyOnWrite();
        rtk rtkVar = (rtk) rtjVar.instance;
        rtcVar8.getClass();
        rtkVar.d = rtcVar8;
        rtkVar.b |= 2;
        return rtjVar;
    }

    private final void h(rtk rtkVar) {
        this.a.j(rtkVar, dtql.b(this.b, new dlfi())).c();
    }

    @Override // defpackage.dlfk
    public final void a(dlgb dlgbVar, dlht dlhtVar, rum rumVar) {
        Map map;
        dlhtVar.getClass();
        rtj g = g(dlgbVar, dlhtVar.e);
        rsx rsxVar = (rsx) rsy.a.createBuilder();
        long g2 = ffpw.g(dlhtVar.b);
        rsxVar.copyOnWrite();
        rsy rsyVar = (rsy) rsxVar.instance;
        rsyVar.b |= 2;
        rsyVar.e = g2;
        rtt rttVar = (rtt) rtu.a.createBuilder();
        dlgu dlguVar = dlhtVar.a;
        int b = dlfl.b(dlguVar.a) - 1;
        rttVar.copyOnWrite();
        rtu rtuVar = (rtu) rttVar.instance;
        rtuVar.b |= 1;
        rtuVar.c = b;
        int a = dlfl.a(dlguVar.b) - 1;
        rttVar.copyOnWrite();
        rtu rtuVar2 = (rtu) rttVar.instance;
        rtuVar2.b |= 2;
        rtuVar2.d = a;
        eyfy build = rttVar.build();
        build.getClass();
        rsxVar.copyOnWrite();
        rsy rsyVar2 = (rsy) rsxVar.instance;
        rsyVar2.d = (rtu) build;
        rsyVar2.b |= 1;
        List<dlhk> list = dlhtVar.c;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (dlhk dlhkVar : list) {
            rsz rszVar = (rsz) rta.a.createBuilder();
            String str = dlhkVar.c.a;
            rszVar.copyOnWrite();
            rta rtaVar = (rta) rszVar.instance;
            rtaVar.b |= 1;
            rtaVar.c = str;
            String str2 = dlhkVar.c.b;
            rszVar.copyOnWrite();
            rta rtaVar2 = (rta) rszVar.instance;
            rtaVar2.b |= 2;
            rtaVar2.d = str2;
            long g3 = ffpw.g(dlhkVar.b);
            rszVar.copyOnWrite();
            rta rtaVar3 = (rta) rszVar.instance;
            rtaVar3.b |= 16;
            rtaVar3.e = g3;
            dkzx dkzxVar = dlhkVar.a;
            if (dkzxVar != null && (map = dkzxVar.a) != null) {
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    rsv rsvVar = (rsv) rsw.a.createBuilder();
                    String str3 = (String) entry.getKey();
                    rsvVar.copyOnWrite();
                    rsw rswVar = (rsw) rsvVar.instance;
                    str3.getClass();
                    rswVar.b |= 1;
                    rswVar.c = str3;
                    float floatValue = ((Number) entry.getValue()).floatValue();
                    rsvVar.copyOnWrite();
                    rsw rswVar2 = (rsw) rsvVar.instance;
                    rswVar2.b |= 2;
                    rswVar2.d = floatValue;
                    eyfy build2 = rsvVar.build();
                    build2.getClass();
                    arrayList2.add((rsw) build2);
                }
                rszVar.copyOnWrite();
                rta rtaVar4 = (rta) rszVar.instance;
                eygr eygrVar = rtaVar4.f;
                if (!eygrVar.c()) {
                    rtaVar4.f = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(arrayList2, rtaVar4.f);
            }
            if (dlhkVar.d != null) {
                rst rstVar = (rst) rsu.a.createBuilder();
                String str4 = dlhkVar.d;
                str4.getClass();
                rstVar.copyOnWrite();
                rsu rsuVar = (rsu) rstVar.instance;
                rsuVar.b |= 1;
                rsuVar.c = str4;
                rszVar.copyOnWrite();
                rta rtaVar5 = (rta) rszVar.instance;
                rsu rsuVar2 = (rsu) rstVar.build();
                rsuVar2.getClass();
                rtaVar5.g = rsuVar2;
                rtaVar5.b |= 32;
            }
            eyfy build3 = rszVar.build();
            build3.getClass();
            arrayList.add((rta) build3);
        }
        rsxVar.copyOnWrite();
        rsy rsyVar3 = (rsy) rsxVar.instance;
        eygr eygrVar2 = rsyVar3.c;
        if (!eygrVar2.c()) {
            rsyVar3.c = eyfy.mutableCopy(eygrVar2);
        }
        eydl.addAll(arrayList, rsyVar3.c);
        if (rumVar != null) {
            rsxVar.copyOnWrite();
            rsy rsyVar4 = (rsy) rsxVar.instance;
            rsyVar4.f = rumVar.h;
            rsyVar4.b |= 4;
        }
        eyfy build4 = rsxVar.build();
        build4.getClass();
        g.copyOnWrite();
        rtk rtkVar = (rtk) g.instance;
        rtk rtkVar2 = rtk.a;
        rtkVar.c = (rsy) build4;
        rtkVar.b |= 1;
        eyfy build5 = g.build();
        build5.getClass();
        h((rtk) build5);
    }

    @Override // defpackage.dlfk
    public final void b(dlgb dlgbVar, eyee eyeeVar, rtm rtmVar) {
        dlgbVar.getClass();
        rtj g = g(dlgbVar, eyeeVar);
        g.copyOnWrite();
        rtk rtkVar = (rtk) g.instance;
        rtk rtkVar2 = rtk.a;
        rtkVar.f = rtmVar;
        rtkVar.b |= 8;
        eyfy build = g.build();
        build.getClass();
        h((rtk) build);
    }

    @Override // defpackage.dlfk
    public final void c(dlgb dlgbVar, eyee eyeeVar, rto rtoVar) {
        dlgbVar.getClass();
        rtj g = g(dlgbVar, eyeeVar);
        g.copyOnWrite();
        rtk rtkVar = (rtk) g.instance;
        rtk rtkVar2 = rtk.a;
        rtkVar.e = rtoVar;
        rtkVar.b |= 4;
        eyfy build = g.build();
        build.getClass();
        h((rtk) build);
    }

    @Override // defpackage.dlfk
    public final void d(dlgb dlgbVar, eyee eyeeVar, long j, int i, int i2, int i3) {
        dlgbVar.getClass();
        eyeeVar.getClass();
        if (i == 0 || i2 == 0 || i3 == 0) {
            throw null;
        }
        rtj g = g(dlgbVar, eyeeVar);
        rsr rsrVar = (rsr) rss.a.createBuilder();
        rsrVar.copyOnWrite();
        rss rssVar = (rss) rsrVar.instance;
        rssVar.b |= 1;
        rssVar.c = j;
        rsrVar.copyOnWrite();
        rss rssVar2 = (rss) rsrVar.instance;
        rssVar2.d = dlfd.c(i) - 1;
        rssVar2.b |= 2;
        rsrVar.copyOnWrite();
        rss rssVar3 = (rss) rsrVar.instance;
        rssVar3.e = dlfh.a(i2) - 1;
        rssVar3.b |= 4;
        int a = rua.a(ezgo.a(i3));
        int i4 = a != 0 ? a : 1;
        rsrVar.copyOnWrite();
        rss rssVar4 = (rss) rsrVar.instance;
        rssVar4.f = i4 - 1;
        rssVar4.b |= 8;
        g.copyOnWrite();
        rtk rtkVar = (rtk) g.instance;
        rss rssVar5 = (rss) rsrVar.build();
        rtk rtkVar2 = rtk.a;
        rssVar5.getClass();
        rtkVar.g = rssVar5;
        rtkVar.b |= 16;
        eyfy build = g.build();
        build.getClass();
        h((rtk) build);
    }

    @Override // defpackage.dlfk
    public final void e(dlgb dlgbVar, long j, eyee eyeeVar, int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        if (i == 1) {
            rtj g = g(dlgbVar, eyeeVar);
            rth rthVar = (rth) rti.a.createBuilder();
            rthVar.copyOnWrite();
            rti rtiVar = (rti) rthVar.instance;
            rtiVar.b |= 1;
            rtiVar.c = j;
            g.copyOnWrite();
            rtk rtkVar = (rtk) g.instance;
            rti rtiVar2 = (rti) rthVar.build();
            rtk rtkVar2 = rtk.a;
            rtiVar2.getClass();
            rtkVar.i = rtiVar2;
            rtkVar.b |= 64;
            eyfy build = g.build();
            build.getClass();
            h((rtk) build);
            return;
        }
        rtj g2 = g(dlgbVar, eyeeVar);
        rtf rtfVar = (rtf) rtg.a.createBuilder();
        rtfVar.copyOnWrite();
        rtg rtgVar = (rtg) rtfVar.instance;
        rtgVar.b |= 1;
        rtgVar.c = j;
        rtfVar.copyOnWrite();
        rtg rtgVar2 = (rtg) rtfVar.instance;
        rtgVar2.d = dlfh.b(i) - 1;
        rtgVar2.b |= 2;
        int a = rua.a(ezgo.a(i2));
        int i3 = a != 0 ? a : 1;
        rtfVar.copyOnWrite();
        rtg rtgVar3 = (rtg) rtfVar.instance;
        rtgVar3.e = i3 - 1;
        rtgVar3.b |= 4;
        g2.copyOnWrite();
        rtk rtkVar3 = (rtk) g2.instance;
        rtg rtgVar4 = (rtg) rtfVar.build();
        rtk rtkVar4 = rtk.a;
        rtgVar4.getClass();
        rtkVar3.h = rtgVar4;
        rtkVar3.b |= 32;
        eyfy build2 = g2.build();
        build2.getClass();
        h((rtk) build2);
    }

    @Override // defpackage.dlfk
    public final void f(dlgb dlgbVar, int i) {
        if (((Boolean) fflm.a(this.d, false)).booleanValue()) {
            eyee eyeeVar = eyee.b;
            eyeeVar.getClass();
            rtj g = g(dlgbVar, eyeeVar);
            rtd rtdVar = (rtd) rte.a.createBuilder();
            rtdVar.copyOnWrite();
            rte rteVar = (rte) rtdVar.instance;
            rteVar.b |= 1;
            rteVar.c = 0L;
            rtdVar.copyOnWrite();
            rte rteVar2 = (rte) rtdVar.instance;
            rteVar2.d = i - 1;
            rteVar2.b |= 2;
            g.copyOnWrite();
            rtk rtkVar = (rtk) g.instance;
            rte rteVar3 = (rte) rtdVar.build();
            rtk rtkVar2 = rtk.a;
            rteVar3.getClass();
            rtkVar.j = rteVar3;
            rtkVar.b |= 128;
            eyfy build = g.build();
            build.getClass();
            h((rtk) build);
        }
    }
}
