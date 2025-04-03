package defpackage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amrs extends ffhv implements ffjm {
    final /* synthetic */ URL a;
    final /* synthetic */ amrt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrs(ffgu ffguVar, URL url, amrt amrtVar) {
        super(2, ffguVar);
        this.a = url;
        this.b = amrtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amrs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        String str;
        Iterator it;
        Object obj3;
        String str2;
        exdw exdwVar;
        enyw enywVar;
        ffci.b(obj);
        fhgu fhguVar = new fhgu();
        char[] cArr = fhgk.a;
        String url = this.a.toString();
        url.getClass();
        fhguVar.g(fhgj.b(url));
        Object obj4 = null;
        fhguVar.d("GET", null);
        fhhb a = new fhid(this.b.c, fhguVar.a()).a();
        String str3 = "invokeSuspend";
        if (!a.a()) {
            ((enrr) amrt.a.j().h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergency/geofilter/GeofilterDbFetcherImpl$fetch$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 31, "GeofilterDbFetcherImpl.kt")).q("Failed to fetch geofilterdb");
            return null;
        }
        fhhe fhheVar = a.g;
        if (fhheVar == null) {
            ((enrr) amrt.a.j().h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergency/geofilter/GeofilterDbFetcherImpl$fetch$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 38, "GeofilterDbFetcherImpl.kt")).q("No data in geofilterdb response");
            return null;
        }
        long a2 = fhheVar.a();
        if (a2 > 2147483647L) {
            throw new IOException(a.s(a2, "Cannot buffer entire body for content length: "));
        }
        fhmv c = fhheVar.c();
        try {
            byte[] F = c.F();
            ffig.a(c, null);
            int length = F.length;
            if (a2 != -1 && a2 != length) {
                throw new IOException("Content-Length (" + a2 + ") and stream length (" + length + ") disagree");
            }
            try {
                exeb exebVar = (exeb) eyfy.parseFrom(exeb.a, F, eyfc.a());
                exebVar.getClass();
                int i = engw.d;
                engr engrVar = new engr();
                Iterator it2 = exebVar.b.iterator();
                while (it2.hasNext()) {
                    exeh exehVar = (exeh) it2.next();
                    int i2 = exehVar.b;
                    if (i2 == 2) {
                        evjy evjyVar = ((exee) exehVar.c).b;
                        if (evjyVar == null) {
                            evjyVar = evjy.a;
                        }
                        byte b = 1;
                        if ((evjyVar.b & 1) != 0) {
                            enxk enxkVar = new enxk(evjyVar.d.m());
                            byte a3 = enxkVar.a();
                            int i3 = 0;
                            if (a3 == 1) {
                                it = it2;
                                obj3 = obj4;
                                str2 = str3;
                                enyw enywVar2 = new enyw();
                                enxkVar.a();
                                enxkVar.a();
                                enywVar2.d = 0;
                                int c2 = enxkVar.c();
                                if (c2 < 0) {
                                    throw new IOException(a.h(c2, "Can only decode polygons with up to 2^31 - 1 loops. Got "));
                                }
                                int i4 = 0;
                                while (i4 < c2) {
                                    byte a4 = enxkVar.a();
                                    if (a4 != b) {
                                        throw new IOException(a.h(a4, "Unknown S2Loop encoding version encountered during decoding: "));
                                    }
                                    int c3 = enxkVar.c();
                                    if (c3 < 0) {
                                        throw new IOException(a.f(c3, "Invalid numVertices: ", ". Loops with more than 2^31 - 1 vertices are not supported."));
                                    }
                                    ArrayList arrayList = new ArrayList(c3);
                                    for (int i5 = i3; i5 < c3; i5++) {
                                        arrayList.add(new enyr(enxkVar.b(), enxkVar.b(), enxkVar.b()));
                                    }
                                    boolean z = enxkVar.a() != 0 ? b : i3;
                                    int c4 = enxkVar.c();
                                    enyp enypVar = new enyp(arrayList, z, enyl.c(enxkVar));
                                    enypVar.f = c4;
                                    if (c3 > 0) {
                                        enypVar.f();
                                    }
                                    if (!enyw.f(enypVar)) {
                                        enywVar2.d += enypVar.c;
                                        enywVar2.a.add(enypVar);
                                    }
                                    i4++;
                                    b = 1;
                                    i3 = 0;
                                }
                                enywVar2.b = enyl.c(enxkVar);
                                enyc.a(enywVar2.b);
                                enywVar2.c();
                                enywVar = enywVar2;
                            } else {
                                if (a3 != 4) {
                                    throw new IOException(a.h(a3, "Unsupported S2Polygon encoding version "));
                                }
                                byte a5 = enxkVar.a();
                                if (a5 > 30 || a5 < 0) {
                                    throw new IOException(a.h(a5, "Invalid level "));
                                }
                                int d = enxkVar.d();
                                if (d < 0) {
                                    throw new IOException(a.h(d, "Can only decode polygons with up to 2^31 - 1 loops. Got "));
                                }
                                enywVar = new enyw();
                                enywVar.c.d();
                                while (i3 < d) {
                                    int d2 = enxkVar.d();
                                    if (d2 < 0) {
                                        throw new IOException(a.f(d2, "Invalid numVertices: ", ". Loops with more than 2^31 - 1 vertices are not supported."));
                                    }
                                    List a6 = enyv.a(d2, a5, enxkVar);
                                    obj2 = obj4;
                                    str = str3;
                                    try {
                                        long e = enxkVar.e();
                                        Iterator it3 = it2;
                                        int d3 = enxkVar.d();
                                        enyp enypVar2 = enyo.a(enyn.BOUND_ENCODED, e) ? new enyp(a6, enyo.a(enyn.ORIGIN_INSIDE, e), enyl.c(enxkVar)) : new enyp(a6);
                                        enypVar2.f = d3;
                                        if (!enyw.f(enypVar2)) {
                                            enywVar.a.add(enypVar2);
                                        }
                                        i3++;
                                        obj4 = obj2;
                                        str3 = str;
                                        it2 = it3;
                                    } catch (eygu e2) {
                                        e = e2;
                                        ((enrr) ((enrr) amrt.a.j()).g(e).h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergency/geofilter/GeofilterDbFetcherImpl$fetch$$inlined$withLegacyPropagatingContext$1", str, 47, "GeofilterDbFetcherImpl.kt")).q("Failed to fetch GeofilterDb proto");
                                        return obj2;
                                    }
                                }
                                it = it2;
                                obj3 = obj4;
                                str2 = str3;
                                enywVar.d();
                            }
                        } else {
                            it = it2;
                            obj3 = obj4;
                            str2 = str3;
                            ArrayList arrayList2 = new ArrayList(evjyVar.c.size());
                            for (evka evkaVar : evjyVar.c) {
                                ArrayList d4 = enkr.d(evkaVar.b.size());
                                for (evjw evjwVar : evkaVar.b) {
                                    d4.add(enyj.d(evjwVar.b, evjwVar.c).e());
                                }
                                arrayList2.add(new enyp(d4));
                            }
                            enywVar = new enyw(arrayList2);
                        }
                        exdwVar = new exdw(exehVar.d, new exdy(enywVar));
                    } else {
                        it = it2;
                        obj3 = obj4;
                        str2 = str3;
                        if (i2 != 3) {
                            throw new UnsupportedOperationException("Unsupported geofilter type: ".concat(i2 != 0 ? i2 != 2 ? i2 != 3 ? "null" : "POSITIVE_S2_FILTER" : "POSITIVE_POLYGON_FILTER" : "POSITIVEFILTER_NOT_SET"));
                        }
                        exeg exegVar = (exeg) exehVar.c;
                        int i6 = exdx.a;
                        enya enyaVar = new enya();
                        eygl eyglVar = exegVar.b;
                        enyaVar.a = new ArrayList(eyglVar.size());
                        Iterator<E> it4 = eyglVar.iterator();
                        while (it4.hasNext()) {
                            enyaVar.a.add(new enxz(((Long) it4.next()).longValue()));
                        }
                        enyaVar.c();
                        exdwVar = new exdw(exehVar.d, new exdx(enyaVar));
                    }
                    engrVar.h(exdwVar);
                    obj4 = obj3;
                    str3 = str2;
                    it2 = it;
                }
                return new exdz(engrVar.g());
            } catch (eygu e3) {
                e = e3;
                obj2 = obj4;
                str = str3;
            }
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        amrs amrsVar = new amrs(ffguVar, this.a, this.b);
        amrsVar.c = obj;
        return amrsVar;
    }
}
