package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edhf implements edsg {
    public final edgc a;
    public final edfz b;
    public final edkp c;
    public final dlpw d;
    private final edfv e;
    private final edij f;
    private final edkq g;

    public edhf(edkq edkqVar, edgc edgcVar, edfv edfvVar, edfz edfzVar, edkp edkpVar, dlpw dlpwVar, edij edijVar, final dwdq dwdqVar) {
        this.g = edkqVar;
        this.a = edgcVar;
        this.e = edfvVar;
        this.b = edfzVar;
        this.c = edkpVar;
        this.d = dlpwVar;
        this.f = edijVar;
        ListenableFuture a = dwdqVar.c.a();
        final ffji ffjiVar = new ffji() { // from class: dwdn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                ezjw ezjwVar = (ezjw) ezjw.h(new ezjv(), dwdq.this.a);
                ezjr ezjrVar = (ezjr) ezjs.a.createBuilder();
                ezjrVar.copyOnWrite();
                ezjs ezjsVar = (ezjs) ezjrVar.instance;
                ezjsVar.b |= 1;
                ezjsVar.c = str;
                ezjs ezjsVar2 = (ezjs) ezjrVar.build();
                fdxk fdxkVar = ezjwVar.a;
                febs febsVar = ezjx.a;
                if (febsVar == null) {
                    synchronized (ezjx.class) {
                        febsVar = ezjx.a;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.internal.maps.mapsmobilesdks.v1.MapsMobileSDKsService", "GetSession");
                            a2.b();
                            ezjs ezjsVar3 = ezjs.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(ezjsVar3);
                            a2.b = new ffae(ezju.a);
                            febsVar = a2.a();
                            ezjx.a = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, ezjwVar.b), ezjsVar2);
            }
        };
        erqt.r(erny.g(a, new eroh() { // from class: dwdo
            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ffji.this.invoke(obj);
            }
        }, dwdqVar.b), new dwdp(dwdqVar), dwdqVar.b);
    }

    public static void l(ecda ecdaVar) {
        ecda.a(ecdaVar, new ecda("Duration"));
        ecda.a(ecdaVar, new ecda("Battery"));
    }

    @Override // defpackage.edsg
    public final dhre a(edrp edrpVar) {
        return d(edrpVar, 1);
    }

    @Override // defpackage.edsg
    public final dhre b(edrs edrsVar) {
        return e(edrsVar, 1);
    }

    @Override // defpackage.edsg
    public final dhre c(edsj edsjVar) {
        return f(edsjVar, 1);
    }

    @Override // defpackage.edsg
    public final dhre d(edrp edrpVar, final int i) {
        dhre b;
        try {
            new ecri();
            edgc edgcVar = this.a;
            Integer num = ((edqp) edrpVar).a;
            Integer num2 = ((edqp) edrpVar).b;
            if (num == null) {
                if (num2 == null) {
                    b = dhrt.b(new dfqu(new Status(9012, "Must include max width or max height in request.")));
                    return b.b(new dhqh() { // from class: edhb
                        @Override // defpackage.dhqh
                        public final Object a(dhre dhreVar) {
                            ergr ergrVar = (ergr) ergt.a.createBuilder();
                            ergrVar.copyOnWrite();
                            ergt ergtVar = (ergt) ergrVar.instance;
                            ergtVar.c = 1;
                            ergtVar.b = 1 | ergtVar.b;
                            ergt ergtVar2 = (ergt) ergrVar.build();
                            edga edgaVar = (edga) edhf.this.c;
                            erge a = edtn.a(edgaVar.b, 2, i);
                            a.copyOnWrite();
                            ergj ergjVar = (ergj) a.instance;
                            ergj ergjVar2 = ergj.a;
                            ergjVar.d = 5;
                            ergjVar.b = 2 | ergjVar.b;
                            a.copyOnWrite();
                            ergj ergjVar3 = (ergj) a.instance;
                            ergtVar2.getClass();
                            ergjVar3.g = ergtVar2;
                            ergjVar3.b |= 512;
                            String a2 = edgaVar.c.a();
                            a.copyOnWrite();
                            ergj ergjVar4 = (ergj) a.instance;
                            a2.getClass();
                            ergjVar4.b |= 1073741824;
                            ergjVar4.m = a2;
                            edgaVar.a.a(a);
                            edhf.l(new ecda("FetchPhoto"));
                            return (edrq) dhreVar.i();
                        }
                    }).d(new edgw());
                }
                num = null;
            }
            if (num != null && num.intValue() <= 0) {
                b = dhrt.b(new dfqu(new Status(9012, String.format("Max Width must not be < 1, but was: %d.", num))));
            } else if (num2 == null || num2.intValue() > 0) {
                edji edjiVar = new edji(edrpVar, ((edjy) edgcVar).f.a(), ((edjy) edgcVar).a);
                dlpw dlpwVar = ((edjy) edgcVar).e;
                edgm edgmVar = ((edjy) edgcVar).c;
                final long a = dlpwVar.a();
                final edjj edjjVar = new edjj();
                String b2 = edjiVar.b();
                Map c = edjiVar.c();
                dhqd a2 = edjiVar.a();
                final dhri dhriVar = a2 != null ? new dhri(a2) : new dhri();
                final edgl edglVar = new edgl(b2, new qoq() { // from class: edgi
                    @Override // defpackage.qoq
                    public final void a(Object obj) {
                        edgm.b(edjj.this, dhriVar, (Bitmap) obj);
                    }
                }, Bitmap.Config.ARGB_8888, new qop() { // from class: edgj
                    @Override // defpackage.qop
                    public final void a(qou qouVar) {
                        edgm.a(dhri.this, qouVar);
                    }
                }, c);
                if (a2 != null) {
                    a2.a(new dhrb() { // from class: edgk
                        @Override // defpackage.dhrb
                        public final void a() {
                            qpk.this.e();
                        }
                    });
                }
                edgmVar.a.a(edglVar);
                final edjy edjyVar = (edjy) edgcVar;
                b = dhriVar.a.b(new dhqh() { // from class: edjs
                    @Override // defpackage.dhqh
                    public final Object a(dhre dhreVar) {
                        return new edqq(((edjk) dhreVar.i()).a);
                    }
                }).b(new dhqh() { // from class: edjt
                    @Override // defpackage.dhqh
                    public final Object a(dhre dhreVar) {
                        edjy edjyVar2 = edjy.this;
                        long a3 = edjyVar2.e.a();
                        erfs erfsVar = (erfs) erfv.a.createBuilder();
                        erfsVar.copyOnWrite();
                        erfv erfvVar = (erfv) erfsVar.instance;
                        erfvVar.c = 14;
                        erfvVar.b |= 1;
                        int f = edga.f(dhreVar);
                        erfsVar.copyOnWrite();
                        erfv erfvVar2 = (erfv) erfsVar.instance;
                        erfvVar2.d = f - 1;
                        erfvVar2.b |= 2;
                        erfsVar.copyOnWrite();
                        erfv erfvVar3 = (erfv) erfsVar.instance;
                        erfvVar3.b |= 4;
                        erfvVar3.e = (int) (a3 - a);
                        ((edga) edjyVar2.d).b((erfv) erfsVar.build(), i);
                        return (edrq) dhreVar.i();
                    }
                });
            } else {
                b = dhrt.b(new dfqu(new Status(9012, String.format("Max Height must not be < 1, but was: %d.", num2))));
            }
            return b.b(new dhqh() { // from class: edhb
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    ergr ergrVar = (ergr) ergt.a.createBuilder();
                    ergrVar.copyOnWrite();
                    ergt ergtVar = (ergt) ergrVar.instance;
                    ergtVar.c = 1;
                    ergtVar.b = 1 | ergtVar.b;
                    ergt ergtVar2 = (ergt) ergrVar.build();
                    edga edgaVar = (edga) edhf.this.c;
                    erge a3 = edtn.a(edgaVar.b, 2, i);
                    a3.copyOnWrite();
                    ergj ergjVar = (ergj) a3.instance;
                    ergj ergjVar2 = ergj.a;
                    ergjVar.d = 5;
                    ergjVar.b = 2 | ergjVar.b;
                    a3.copyOnWrite();
                    ergj ergjVar3 = (ergj) a3.instance;
                    ergtVar2.getClass();
                    ergjVar3.g = ergtVar2;
                    ergjVar3.b |= 512;
                    String a22 = edgaVar.c.a();
                    a3.copyOnWrite();
                    ergj ergjVar4 = (ergj) a3.instance;
                    a22.getClass();
                    ergjVar4.b |= 1073741824;
                    ergjVar4.m = a22;
                    edgaVar.a.a(a3);
                    edhf.l(new ecda("FetchPhoto"));
                    return (edrq) dhreVar.i();
                }
            }).d(new edgw());
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }

    @Override // defpackage.edsg
    public final dhre e(final edrs edrsVar, final int i) {
        try {
            new ecri();
            return (!this.g.a || i == 2) ? this.a.a(edrsVar, i).b(new dhqh() { // from class: edha
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    edhf.this.c.c(edrsVar, 2, i);
                    edhf.l(new ecda("FetchPlace"));
                    return (edrt) dhreVar.i();
                }
            }).d(new edgw()) : this.f.b(edrsVar, i).b(new dhqh() { // from class: edgz
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    edhf.this.c.c(edrsVar, 3, i);
                    edhf.l(new ecda("GetPlace"));
                    return (edrt) dhreVar.i();
                }
            }).d(new edgw());
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }

    @Override // defpackage.edsg
    public final dhre f(final edsj edsjVar, int i) {
        final int i2;
        dhre d;
        try {
            new ecri();
            final edij edijVar = this.f;
            List list = ((edrh) edsjVar).b;
            if (list.isEmpty()) {
                d = dhrt.b(new dfqu(new Status(9012, "Place fields must not be empty.")));
            } else {
                if (!((edrh) edsjVar).d.isEmpty()) {
                    final long a = edijVar.b.a();
                    final String b = edhm.b(edir.a(list), new ArrayList());
                    final ListenableFuture a2 = edijVar.a();
                    final ListenableFuture g = erny.g(a2, new eroh() { // from class: edhv
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            edij edijVar2 = edij.this;
                            exit c = edijVar2.c(b, (edfs) obj);
                            Locale b2 = edijVar2.e.b();
                            exjk exjkVar = (exjk) exjl.a.createBuilder();
                            exjkVar.copyOnWrite();
                            ((exjl) exjkVar.instance).e = false;
                            ArrayList arrayList = new ArrayList();
                            edrh edrhVar = (edrh) edsjVar;
                            Iterator it = edrhVar.c.iterator();
                            while (it.hasNext()) {
                                int intValue = ((Integer) it.next()).intValue();
                                if (intValue == 0) {
                                    arrayList.add(exiv.PRICE_LEVEL_FREE);
                                } else if (intValue == 1) {
                                    arrayList.add(exiv.PRICE_LEVEL_INEXPENSIVE);
                                } else if (intValue == 2) {
                                    arrayList.add(exiv.PRICE_LEVEL_MODERATE);
                                } else if (intValue == 3) {
                                    arrayList.add(exiv.PRICE_LEVEL_EXPENSIVE);
                                } else if (intValue == 4) {
                                    arrayList.add(exiv.PRICE_LEVEL_VERY_EXPENSIVE);
                                }
                            }
                            exjkVar.copyOnWrite();
                            exjl exjlVar = (exjl) exjkVar.instance;
                            eygi eygiVar = exjlVar.f;
                            if (!eygiVar.c()) {
                                exjlVar.f = eyfy.mutableCopy(eygiVar);
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                exjlVar.f.h(((exiv) it2.next()).a());
                            }
                            exjkVar.copyOnWrite();
                            ((exjl) exjkVar.instance).d = 0;
                            exjkVar.copyOnWrite();
                            ((exjl) exjkVar.instance).g = false;
                            String str = edrhVar.d;
                            exjkVar.copyOnWrite();
                            ((exjl) exjkVar.instance).b = str;
                            String languageTag = b2.toLanguageTag();
                            exjkVar.copyOnWrite();
                            exjl exjlVar2 = (exjl) exjkVar.instance;
                            languageTag.getClass();
                            exjlVar2.c = languageTag;
                            exjl exjlVar3 = (exjl) exjkVar.build();
                            fdxk fdxkVar = c.a;
                            febs febsVar = exiu.b;
                            if (febsVar == null) {
                                synchronized (exiu.class) {
                                    febsVar = exiu.b;
                                    if (febsVar == null) {
                                        febp a3 = febs.a();
                                        a3.c = febr.UNARY;
                                        a3.d = febs.c("google.maps.places.v1.Places", "SearchText");
                                        a3.b();
                                        exjl exjlVar4 = exjl.a;
                                        eyfc eyfcVar = ffag.a;
                                        a3.a = new ffae(exjlVar4);
                                        a3.b = new ffae(exjn.a);
                                        febsVar = a3.a();
                                        exiu.b = febsVar;
                                    }
                                }
                            }
                            return ffat.a(fdxkVar.a(febsVar, c.b), exjlVar3);
                        }
                    }, erpp.a);
                    dhqd dhqdVar = ((edrh) edsjVar).a;
                    if (dhqdVar != null) {
                        dhqdVar.a(new dhrb() { // from class: edhw
                            @Override // defpackage.dhrb
                            public final void a() {
                                ListenableFuture.this.cancel(true);
                            }
                        });
                    }
                    i2 = i;
                    d = duik.a(g).f(new dhrd() { // from class: edhx
                        @Override // defpackage.dhrd
                        public final dhre a(Object obj) {
                            exjn exjnVar = (exjn) obj;
                            dhri dhriVar = new dhri();
                            eygr eygrVar = exjnVar.b;
                            eygr eygrVar2 = exjnVar.c;
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<E> it = eygrVar.iterator();
                            while (it.hasNext()) {
                                edij edijVar2 = edij.this;
                                arrayList.add(edijVar2.d.a((exir) it.next()));
                            }
                            Iterator<E> it2 = eygrVar2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(ediz.a((exjb) it2.next()));
                            }
                            edri edriVar = new edri();
                            edriVar.a(arrayList);
                            edriVar.b = null;
                            List list2 = edriVar.a;
                            if (list2 == null) {
                                throw new IllegalStateException("Property \"places\" has not been set");
                            }
                            edriVar.a(engw.n(list2));
                            List list3 = edriVar.b;
                            if (list3 != null) {
                                edriVar.b = engw.n(list3);
                            }
                            List list4 = edriVar.a;
                            if (list4 == null) {
                                throw new IllegalStateException("Missing required properties: places");
                            }
                            dhriVar.b(new edrj(list4, edriVar.b));
                            return dhriVar.a;
                        }
                    }).d(new dhqh() { // from class: edhy
                        @Override // defpackage.dhqh
                        public final Object a(dhre dhreVar) {
                            if (((dhrm) dhreVar).d) {
                                return dhreVar;
                            }
                            ListenableFuture listenableFuture = a2;
                            edij edijVar2 = edij.this;
                            long a3 = edijVar2.b.a();
                            edfs edfsVar = (edfs) ((erre) listenableFuture).b;
                            int size = dhreVar.m() ? ((edsl) dhreVar.i()).a().size() : 0;
                            edkp edkpVar = edijVar2.a;
                            int i3 = i2;
                            long j = a;
                            erhh erhhVar = (erhh) erhi.a.createBuilder();
                            erhhVar.copyOnWrite();
                            erhi erhiVar = (erhi) erhhVar.instance;
                            erhiVar.b |= 1;
                            erhiVar.c = 0;
                            erhhVar.copyOnWrite();
                            erhi erhiVar2 = (erhi) erhhVar.instance;
                            erhiVar2.b |= 2;
                            erhiVar2.d = size;
                            erhhVar.copyOnWrite();
                            erhi erhiVar3 = (erhi) erhhVar.instance;
                            erhiVar3.b |= 4;
                            erhiVar3.e = 0;
                            erhi erhiVar4 = (erhi) erhhVar.build();
                            erfs erfsVar = (erfs) erfv.a.createBuilder();
                            erfsVar.copyOnWrite();
                            erfv erfvVar = (erfv) erfsVar.instance;
                            erfvVar.c = 9;
                            erfvVar.b |= 1;
                            erfsVar.copyOnWrite();
                            erfv erfvVar2 = (erfv) erfsVar.instance;
                            erhiVar4.getClass();
                            erfvVar2.h = erhiVar4;
                            erfvVar2.b |= 4096;
                            int f = edga.f(dhreVar);
                            erfsVar.copyOnWrite();
                            erfv erfvVar3 = (erfv) erfsVar.instance;
                            erfvVar3.d = f - 1;
                            erfvVar3.b |= 2;
                            erfsVar.copyOnWrite();
                            erfv erfvVar4 = (erfv) erfsVar.instance;
                            erfvVar4.b |= 4;
                            erfvVar4.e = (int) (a3 - j);
                            ((edga) edkpVar).e((erfv) erfsVar.build(), 3, i3, edfsVar);
                            return dhreVar;
                        }
                    });
                    return d.b(new dhqh() { // from class: edgq
                        @Override // defpackage.dhqh
                        public final Object a(dhre dhreVar) {
                            ergz ergzVar = (ergz) erhb.a.createBuilder();
                            ergzVar.copyOnWrite();
                            erhb erhbVar = (erhb) ergzVar.instance;
                            erhbVar.b |= 4;
                            erhbVar.d = false;
                            ergu erguVar = (ergu) ergv.a.createBuilder();
                            edrh edrhVar = (edrh) edsjVar;
                            erguVar.a(edir.a(edrhVar.b));
                            ergv ergvVar = (ergv) erguVar.build();
                            ergzVar.copyOnWrite();
                            erhb erhbVar2 = (erhb) ergzVar.instance;
                            ergvVar.getClass();
                            erhbVar2.g = ergvVar;
                            erhbVar2.b |= 64;
                            ergzVar.copyOnWrite();
                            erhb erhbVar3 = (erhb) ergzVar.instance;
                            erhbVar3.c = 0;
                            erhbVar3.b |= 1;
                            ergzVar.copyOnWrite();
                            erhb erhbVar4 = (erhb) ergzVar.instance;
                            erhbVar4.b |= 32;
                            erhbVar4.f = false;
                            ergzVar.copyOnWrite();
                            erhb erhbVar5 = (erhb) ergzVar.instance;
                            erhbVar5.b |= 512;
                            erhbVar5.h = false;
                            ArrayList arrayList = new ArrayList();
                            for (Integer num : edrhVar.c) {
                                if (num != null) {
                                    arrayList.add(num);
                                }
                            }
                            ergzVar.copyOnWrite();
                            erhb erhbVar6 = (erhb) ergzVar.instance;
                            eygi eygiVar = erhbVar6.e;
                            if (!eygiVar.c()) {
                                erhbVar6.e = eyfy.mutableCopy(eygiVar);
                            }
                            edhf edhfVar = edhf.this;
                            int i3 = i2;
                            eydl.addAll(arrayList, erhbVar6.e);
                            edga edgaVar = (edga) edhfVar.c;
                            ergw a3 = edgaVar.a();
                            a3.copyOnWrite();
                            ergy ergyVar = (ergy) a3.instance;
                            ergy ergyVar2 = ergy.a;
                            ergyVar.c = 1;
                            ergyVar.b |= 1;
                            erhb erhbVar7 = (erhb) ergzVar.build();
                            a3.copyOnWrite();
                            ergy ergyVar3 = (ergy) a3.instance;
                            erhbVar7.getClass();
                            ergyVar3.h = erhbVar7;
                            ergyVar3.b |= 524288;
                            ergy ergyVar4 = (ergy) a3.build();
                            erge a4 = edtn.a(edgaVar.b, 3, i3);
                            a4.copyOnWrite();
                            ergj ergjVar = (ergj) a4.instance;
                            ergj ergjVar2 = ergj.a;
                            ergjVar.d = 1;
                            ergjVar.b |= 2;
                            a4.copyOnWrite();
                            ergj ergjVar3 = (ergj) a4.instance;
                            ergyVar4.getClass();
                            ergjVar3.f = ergyVar4;
                            ergjVar3.b |= 64;
                            String a5 = edgaVar.c.a();
                            a4.copyOnWrite();
                            ergj ergjVar4 = (ergj) a4.instance;
                            a5.getClass();
                            ergjVar4.b |= 1073741824;
                            ergjVar4.m = a5;
                            edgaVar.a.a(a4);
                            edhf.l(new ecda("SearchByText"));
                            return (edsl) dhreVar.i();
                        }
                    }).d(new edgw());
                }
                d = dhrt.b(new dfqu(new Status(9012, "Text query must not be an empty string.")));
            }
            i2 = i;
            return d.b(new dhqh() { // from class: edgq
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    ergz ergzVar = (ergz) erhb.a.createBuilder();
                    ergzVar.copyOnWrite();
                    erhb erhbVar = (erhb) ergzVar.instance;
                    erhbVar.b |= 4;
                    erhbVar.d = false;
                    ergu erguVar = (ergu) ergv.a.createBuilder();
                    edrh edrhVar = (edrh) edsjVar;
                    erguVar.a(edir.a(edrhVar.b));
                    ergv ergvVar = (ergv) erguVar.build();
                    ergzVar.copyOnWrite();
                    erhb erhbVar2 = (erhb) ergzVar.instance;
                    ergvVar.getClass();
                    erhbVar2.g = ergvVar;
                    erhbVar2.b |= 64;
                    ergzVar.copyOnWrite();
                    erhb erhbVar3 = (erhb) ergzVar.instance;
                    erhbVar3.c = 0;
                    erhbVar3.b |= 1;
                    ergzVar.copyOnWrite();
                    erhb erhbVar4 = (erhb) ergzVar.instance;
                    erhbVar4.b |= 32;
                    erhbVar4.f = false;
                    ergzVar.copyOnWrite();
                    erhb erhbVar5 = (erhb) ergzVar.instance;
                    erhbVar5.b |= 512;
                    erhbVar5.h = false;
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : edrhVar.c) {
                        if (num != null) {
                            arrayList.add(num);
                        }
                    }
                    ergzVar.copyOnWrite();
                    erhb erhbVar6 = (erhb) ergzVar.instance;
                    eygi eygiVar = erhbVar6.e;
                    if (!eygiVar.c()) {
                        erhbVar6.e = eyfy.mutableCopy(eygiVar);
                    }
                    edhf edhfVar = edhf.this;
                    int i3 = i2;
                    eydl.addAll(arrayList, erhbVar6.e);
                    edga edgaVar = (edga) edhfVar.c;
                    ergw a3 = edgaVar.a();
                    a3.copyOnWrite();
                    ergy ergyVar = (ergy) a3.instance;
                    ergy ergyVar2 = ergy.a;
                    ergyVar.c = 1;
                    ergyVar.b |= 1;
                    erhb erhbVar7 = (erhb) ergzVar.build();
                    a3.copyOnWrite();
                    ergy ergyVar3 = (ergy) a3.instance;
                    erhbVar7.getClass();
                    ergyVar3.h = erhbVar7;
                    ergyVar3.b |= 524288;
                    ergy ergyVar4 = (ergy) a3.build();
                    erge a4 = edtn.a(edgaVar.b, 3, i3);
                    a4.copyOnWrite();
                    ergj ergjVar = (ergj) a4.instance;
                    ergj ergjVar2 = ergj.a;
                    ergjVar.d = 1;
                    ergjVar.b |= 2;
                    a4.copyOnWrite();
                    ergj ergjVar3 = (ergj) a4.instance;
                    ergyVar4.getClass();
                    ergjVar3.f = ergyVar4;
                    ergjVar3.b |= 64;
                    String a5 = edgaVar.c.a();
                    a4.copyOnWrite();
                    ergj ergjVar4 = (ergj) a4.instance;
                    a5.getClass();
                    ergjVar4.b |= 1073741824;
                    ergjVar4.m = a5;
                    edgaVar.a.a(a4);
                    edhf.l(new ecda("SearchByText"));
                    return (edsl) dhreVar.i();
                }
            }).d(new edgw());
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }

    @Override // defpackage.edsg
    public final dhre g(final edrv edrvVar) {
        try {
            new ecri();
            final edij edijVar = this.f;
            final long a = edijVar.b.a();
            final ListenableFuture a2 = edijVar.a();
            final ListenableFuture g = erny.g(a2, new eroh() { // from class: edhz
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    exit c = edij.this.c("", (edfs) obj);
                    exhi exhiVar = (exhi) exhj.a.createBuilder();
                    edqv edqvVar = (edqv) edrvVar;
                    String e = edqvVar.c.e();
                    e.getClass();
                    exhiVar.copyOnWrite();
                    ((exhj) exhiVar.instance).b = e.concat("/media");
                    Integer num = edqvVar.b;
                    if (num != null) {
                        int intValue = num.intValue();
                        exhiVar.copyOnWrite();
                        ((exhj) exhiVar.instance).d = intValue;
                    }
                    Integer num2 = edqvVar.a;
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        exhiVar.copyOnWrite();
                        ((exhj) exhiVar.instance).c = intValue2;
                    }
                    exhiVar.copyOnWrite();
                    ((exhj) exhiVar.instance).e = true;
                    exhj exhjVar = (exhj) exhiVar.build();
                    fdxk fdxkVar = c.a;
                    febs febsVar = exiu.c;
                    if (febsVar == null) {
                        synchronized (exiu.class) {
                            febsVar = exiu.c;
                            if (febsVar == null) {
                                febp a3 = febs.a();
                                a3.c = febr.UNARY;
                                a3.d = febs.c("google.maps.places.v1.Places", "GetPhotoMedia");
                                a3.b();
                                exhj exhjVar2 = exhj.a;
                                eyfc eyfcVar = ffag.a;
                                a3.a = new ffae(exhjVar2);
                                a3.b = new ffae(exhr.a);
                                febsVar = a3.a();
                                exiu.c = febsVar;
                            }
                        }
                    }
                    return ffat.a(fdxkVar.a(febsVar, c.b), exhjVar);
                }
            }, erpp.a);
            dhqd dhqdVar = ((edqv) edrvVar).d;
            if (dhqdVar != null) {
                dhqdVar.a(new dhrb() { // from class: edia
                    @Override // defpackage.dhrb
                    public final void a() {
                        ListenableFuture.this.cancel(true);
                    }
                });
            }
            return duik.a(g).f(new dhrd() { // from class: edib
                @Override // defpackage.dhrd
                public final dhre a(Object obj) {
                    dhri dhriVar = new dhri();
                    dhriVar.b(new edqw(Uri.parse(((exhr) obj).b)));
                    return dhriVar.a;
                }
            }).d(new dhqh() { // from class: edic
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    if (!((dhrm) dhreVar).d) {
                        ListenableFuture listenableFuture = a2;
                        long j = a;
                        edij edijVar2 = edij.this;
                        long a3 = edijVar2.b.a();
                        edfs edfsVar = (edfs) ((erre) listenableFuture).b;
                        erfs erfsVar = (erfs) erfv.a.createBuilder();
                        erfsVar.copyOnWrite();
                        erfv erfvVar = (erfv) erfsVar.instance;
                        erfvVar.c = 14;
                        erfvVar.b |= 1;
                        int f = edga.f(dhreVar);
                        erfsVar.copyOnWrite();
                        erfv erfvVar2 = (erfv) erfsVar.instance;
                        erfvVar2.d = f - 1;
                        erfvVar2.b |= 2;
                        erfsVar.copyOnWrite();
                        erfv erfvVar3 = (erfv) erfsVar.instance;
                        erfvVar3.b |= 4;
                        erfvVar3.e = (int) (a3 - j);
                        ((edga) edijVar2.a).e((erfv) erfsVar.build(), 3, 3, edfsVar);
                    }
                    return dhreVar;
                }
            }).b(new dhqh() { // from class: edgy
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    ergr ergrVar = (ergr) ergt.a.createBuilder();
                    ergrVar.copyOnWrite();
                    ergt ergtVar = (ergt) ergrVar.instance;
                    ergtVar.c = 1;
                    ergtVar.b = 1 | ergtVar.b;
                    ergt ergtVar2 = (ergt) ergrVar.build();
                    edga edgaVar = (edga) edhf.this.c;
                    erge a3 = edtn.a(edgaVar.b, 3, 3);
                    a3.copyOnWrite();
                    ergj ergjVar = (ergj) a3.instance;
                    ergj ergjVar2 = ergj.a;
                    ergjVar.d = 5;
                    ergjVar.b |= 2;
                    a3.copyOnWrite();
                    ergj ergjVar3 = (ergj) a3.instance;
                    ergtVar2.getClass();
                    ergjVar3.g = ergtVar2;
                    ergjVar3.b |= 512;
                    String a4 = edgaVar.c.a();
                    a3.copyOnWrite();
                    ergj ergjVar4 = (ergj) a3.instance;
                    a4.getClass();
                    ergjVar4.b |= 1073741824;
                    ergjVar4.m = a4;
                    edgaVar.a.a(a3);
                    edhf.l(new ecda("GetPhotoMedia"));
                    return (edrw) dhreVar.i();
                }
            }).d(new edgw());
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }

    @Override // defpackage.edsg
    public final dhre h(final edry edryVar) {
        try {
            new ecri();
            if (this.g.a) {
                return dhrt.b(new dfqu(new Status(9012, "Query must not be null."))).b(new dhqh() { // from class: edgu
                    @Override // defpackage.dhqh
                    public final Object a(dhre dhreVar) {
                        edhf.this.c.g(edryVar, 3);
                        edhf.l(new ecda("FindAutocompletePredictionsOnePlatform"));
                        return (edrz) dhreVar.i();
                    }
                }).d(new edgw());
            }
            int i = engw.d;
            return dhrt.c(new edqz(engw.n(enou.a))).b(new dhqh() { // from class: edgv
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    edhf.this.c.g(edryVar, 2);
                    edhf.l(new ecda("FindAutocompletePredictions"));
                    return (edrz) dhreVar.i();
                }
            }).d(new edgw());
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }

    @Override // defpackage.edsg
    public final dhre i(edsb edsbVar) {
        return j(edsbVar);
    }

    public final dhre j(final edsb edsbVar) {
        try {
            final long a = this.d.a();
            new ecri();
            edfv edfvVar = this.e;
            dhqd dhqdVar = ((edrb) edsbVar).b;
            dgyg dgygVar = new dgyg();
            dgygVar.b(edfv.a);
            if (koa.c(edfvVar.d, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                dgygVar.c(100);
            } else {
                dgygVar.c(102);
            }
            final edki edkiVar = edfvVar.c;
            dhre a2 = edfvVar.b.a(dgygVar.a(), dhqdVar);
            long j = edfv.a;
            final dhri dhriVar = dhqdVar == null ? new dhri() : new dhri(dhqdVar);
            if (!edkiVar.a.containsKey(dhriVar)) {
                HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
                handlerThread.start();
                edkiVar.a.put(dhriVar, handlerThread);
                new Handler(handlerThread.getLooper()).postDelayed(new Runnable() { // from class: edkf
                    public final /* synthetic */ String b = "Location timeout.";

                    @Override // java.lang.Runnable
                    public final void run() {
                        dhri.this.c(new dfqu(new Status(15, this.b)));
                    }
                }, j);
            }
            a2.d(new dhqh() { // from class: edkg
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    dhri dhriVar2 = dhri.this;
                    Exception h = dhreVar.h();
                    if (dhreVar.m()) {
                        dhriVar2.b(dhreVar.i());
                    } else if (!((dhrm) dhreVar).d && h != null) {
                        dhriVar2.a(h);
                    }
                    return dhriVar2.a;
                }
            });
            dhriVar.a.s(new dhqs() { // from class: edkh
                @Override // defpackage.dhqs
                public final void a(dhre dhreVar) {
                    HandlerThread handlerThread2 = (HandlerThread) edki.this.a.remove(dhriVar);
                    if (handlerThread2 == null) {
                        return;
                    }
                    handlerThread2.quit();
                }
            });
            return dhriVar.a.d(new edfu()).f(new dhrd() { // from class: edgs
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
                
                    if (r8.contains("_optout") == false) goto L23;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.dhrd
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final defpackage.dhre a(java.lang.Object r18) {
                    /*
                        Method dump skipped, instructions count: 277
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.edgs.a(java.lang.Object):dhre");
                }
            }).b(new dhqh() { // from class: edgt
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    edhf edhfVar = edhf.this;
                    long a3 = edhfVar.d.a();
                    int i = true == dhreVar.m() ? 2 : 1;
                    ergo ergoVar = (ergo) ergq.a.createBuilder();
                    ergu erguVar = (ergu) ergv.a.createBuilder();
                    erguVar.a(edke.b(((edrb) edsbVar).a));
                    ergv ergvVar = (ergv) erguVar.build();
                    ergoVar.copyOnWrite();
                    ergq ergqVar = (ergq) ergoVar.instance;
                    ergvVar.getClass();
                    ergqVar.e = ergvVar;
                    ergqVar.b |= 8;
                    long j2 = a3 - a;
                    ergoVar.copyOnWrite();
                    ergq ergqVar2 = (ergq) ergoVar.instance;
                    ergqVar2.b |= 4;
                    ergqVar2.d = (int) j2;
                    ergoVar.copyOnWrite();
                    ergq ergqVar3 = (ergq) ergoVar.instance;
                    ergqVar3.c = i - 1;
                    ergqVar3.b |= 2;
                    ergq ergqVar4 = (ergq) ergoVar.build();
                    edga edgaVar = (edga) edhfVar.c;
                    erge a4 = edtn.a(edgaVar.b, 2, 3);
                    a4.copyOnWrite();
                    ergj ergjVar = (ergj) a4.instance;
                    ergj ergjVar2 = ergj.a;
                    ergjVar.d = 6;
                    ergjVar.b = 2 | ergjVar.b;
                    a4.copyOnWrite();
                    ergj ergjVar3 = (ergj) a4.instance;
                    ergqVar4.getClass();
                    ergjVar3.h = ergqVar4;
                    ergjVar3.b |= 1024;
                    String a5 = edgaVar.c.a();
                    a4.copyOnWrite();
                    ergj ergjVar4 = (ergj) a4.instance;
                    a5.getClass();
                    ergjVar4.b |= 1073741824;
                    ergjVar4.m = a5;
                    edgaVar.a.a(a4);
                    edhf.l(new ecda("FindCurrentPlace"));
                    return (edsc) dhreVar.i();
                }
            }).d(new edgw());
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }

    @Override // defpackage.edsg
    public final dhre k(edse edseVar) {
        List arrayList;
        try {
            final edqc edqcVar = ((edre) edseVar).a;
            String str = ((edre) edseVar).b;
            final long j = ((edre) edseVar).c;
            final dhri dhriVar = new dhri();
            if (edqcVar == null) {
                int i = edpk.a;
                arrayList = Arrays.asList(edpz.BUSINESS_STATUS, edpz.CURRENT_OPENING_HOURS, edpz.OPENING_HOURS, edpz.UTC_OFFSET);
            } else {
                int i2 = edpk.a;
                arrayList = new ArrayList();
                edpx L = edqcVar.L();
                if (L == null || L == edpx.OPERATIONAL) {
                    if (L == null) {
                        arrayList.add(edpz.BUSINESS_STATUS);
                    }
                    if (edqcVar.j() == null) {
                        arrayList.add(edpz.CURRENT_OPENING_HOURS);
                    }
                    if (edqcVar.k() == null) {
                        arrayList.add(edpz.OPENING_HOURS);
                    }
                    if (edqcVar.S() == null) {
                        arrayList.add(edpz.UTC_OFFSET);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                edqcVar.getClass();
                dhriVar.b(new edrf(edpk.b(edqcVar, j)));
                return dhriVar.a;
            }
            if (edqcVar != null) {
                str = edqcVar.ac();
            }
            str.getClass();
            edrr f = edrs.f(str, arrayList);
            ((edqr) f).b = ((edre) edseVar).d;
            final edrs c = f.c();
            new ecri();
            return this.g.a ? this.f.b(c, 3).b(new dhqh() { // from class: edhc
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    edhf.this.c.h(c, 3);
                    edhf.l(new ecda("IsOpenGetPlace"));
                    return (edrt) dhreVar.i();
                }
            }).f(new dhrd() { // from class: edhd
                @Override // defpackage.dhrd
                public final dhre a(Object obj) {
                    edlu edluVar = (edlu) ((edrt) obj).a();
                    edpx edpxVar = edluVar.g;
                    edpi edpiVar = edluVar.i;
                    edpi edpiVar2 = edluVar.y;
                    Integer num = edluVar.Z;
                    edqc edqcVar2 = edqc.this;
                    if (edqcVar2 != null) {
                        if (num == null) {
                            num = edqcVar2.S();
                        }
                        if (edpxVar == null) {
                            edpxVar = edqcVar2.L();
                        }
                        if (edpiVar == null) {
                            edpiVar = edqcVar2.j();
                        }
                        if (edpiVar2 == null) {
                            edpiVar2 = edqcVar2.k();
                        }
                    }
                    dhri dhriVar2 = dhriVar;
                    long j2 = j;
                    edpv av = edqc.av();
                    edlt edltVar = (edlt) av;
                    edltVar.g = edpxVar;
                    edltVar.h = edpiVar;
                    edltVar.v = edpiVar2;
                    edltVar.N = num;
                    dhriVar2.b(new edrf(edpk.b(av.F(), j2)));
                    return dhriVar2.a;
                }
            }).d(new edgw()) : this.a.a(c, 3).b(new dhqh() { // from class: edhe
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    edhf.this.c.h(c, 2);
                    edhf.l(new ecda("IsOpenFetchPlace"));
                    return (edrt) dhreVar.i();
                }
            }).f(new dhrd() { // from class: edgr
                @Override // defpackage.dhrd
                public final dhre a(Object obj) {
                    edlu edluVar = (edlu) ((edrt) obj).a();
                    edpx edpxVar = edluVar.g;
                    edpi edpiVar = edluVar.i;
                    edpi edpiVar2 = edluVar.y;
                    Integer num = edluVar.Z;
                    edqc edqcVar2 = edqc.this;
                    if (edqcVar2 != null) {
                        if (num == null) {
                            num = edqcVar2.S();
                        }
                        if (edpxVar == null) {
                            edpxVar = edqcVar2.L();
                        }
                        if (edpiVar == null) {
                            edpiVar = edqcVar2.j();
                        }
                        if (edpiVar2 == null) {
                            edpiVar2 = edqcVar2.k();
                        }
                    }
                    dhri dhriVar2 = dhriVar;
                    long j2 = j;
                    edpv av = edqc.av();
                    edlt edltVar = (edlt) av;
                    edltVar.g = edpxVar;
                    edltVar.h = edpiVar;
                    edltVar.v = edpiVar2;
                    edltVar.N = num;
                    dhriVar2.b(new edrf(edpk.b(av.F(), j2)));
                    return dhriVar2.a;
                }
            }).d(new edgw());
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }

    @Override // defpackage.edsg
    public final dhre m(final edsn edsnVar) {
        dhre d;
        try {
            new ecri();
            final edij edijVar = this.f;
            List list = ((edrl) edsnVar).f;
            if (list.isEmpty()) {
                d = dhrt.b(new dfqu(new Status(9012, "Place fields must not be empty.")));
            } else {
                final long a = edijVar.b.a();
                final String b = edhm.b(edir.a(list), new ArrayList());
                final ListenableFuture a2 = edijVar.a();
                final ListenableFuture g = erny.g(a2, new eroh() { // from class: edih
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        edij edijVar2 = edij.this;
                        exit c = edijVar2.c(b, (edfs) obj);
                        Locale b2 = edijVar2.e.b();
                        exjc exjcVar = (exjc) exjh.a.createBuilder();
                        String languageTag = b2.toLanguageTag();
                        exjcVar.copyOnWrite();
                        exjh exjhVar = (exjh) exjcVar.instance;
                        languageTag.getClass();
                        exjhVar.c = languageTag;
                        edrl edrlVar = (edrl) edsnVar;
                        List list2 = edrlVar.a;
                        if (list2 != null) {
                            exjcVar.copyOnWrite();
                            exjh exjhVar2 = (exjh) exjcVar.instance;
                            eygr eygrVar = exjhVar2.d;
                            if (!eygrVar.c()) {
                                exjhVar2.d = eyfy.mutableCopy(eygrVar);
                            }
                            eydl.addAll(list2, exjhVar2.d);
                        }
                        List list3 = edrlVar.b;
                        if (list3 != null) {
                            exjcVar.copyOnWrite();
                            exjh exjhVar3 = (exjh) exjcVar.instance;
                            eygr eygrVar2 = exjhVar3.e;
                            if (!eygrVar2.c()) {
                                exjhVar3.e = eyfy.mutableCopy(eygrVar2);
                            }
                            eydl.addAll(list3, exjhVar3.e);
                        }
                        List list4 = edrlVar.c;
                        if (list4 != null) {
                            exjcVar.copyOnWrite();
                            exjh exjhVar4 = (exjh) exjcVar.instance;
                            eygr eygrVar3 = exjhVar4.f;
                            if (!eygrVar3.c()) {
                                exjhVar4.f = eyfy.mutableCopy(eygrVar3);
                            }
                            eydl.addAll(list4, exjhVar4.f);
                        }
                        List list5 = edrlVar.d;
                        if (list5 != null) {
                            exjcVar.copyOnWrite();
                            exjh exjhVar5 = (exjh) exjcVar.instance;
                            eygr eygrVar4 = exjhVar5.g;
                            if (!eygrVar4.c()) {
                                exjhVar5.g = eyfy.mutableCopy(eygrVar4);
                            }
                            eydl.addAll(list5, exjhVar5.g);
                        }
                        edjc edjcVar = edijVar2.c;
                        exjf exjfVar = (exjf) exjg.a.createBuilder();
                        edhi edhiVar = edjcVar.a;
                        edoo edooVar = (edoo) edrlVar.e;
                        LatLng b3 = edooVar.b();
                        exgw exgwVar = (exgw) exgx.a.createBuilder();
                        faut fautVar = (faut) fauu.a.createBuilder();
                        double d2 = b3.a;
                        fautVar.copyOnWrite();
                        ((fauu) fautVar.instance).b = d2;
                        double d3 = b3.b;
                        fautVar.copyOnWrite();
                        ((fauu) fautVar.instance).c = d3;
                        exgwVar.copyOnWrite();
                        exgx exgxVar = (exgx) exgwVar.instance;
                        fauu fauuVar = (fauu) fautVar.build();
                        fauuVar.getClass();
                        exgxVar.c = fauuVar;
                        exgxVar.b |= 1;
                        double a3 = edooVar.a();
                        exgwVar.copyOnWrite();
                        ((exgx) exgwVar.instance).d = a3;
                        exgx exgxVar2 = (exgx) exgwVar.build();
                        exjfVar.copyOnWrite();
                        exjg exjgVar = (exjg) exjfVar.instance;
                        exgxVar2.getClass();
                        exjgVar.c = exgxVar2;
                        exjgVar.b = 2;
                        exjg exjgVar2 = (exjg) exjfVar.build();
                        exjcVar.copyOnWrite();
                        exjh exjhVar6 = (exjh) exjcVar.instance;
                        exjgVar2.getClass();
                        exjhVar6.h = exjgVar2;
                        exjhVar6.b |= 1;
                        exjcVar.copyOnWrite();
                        ((exjh) exjcVar.instance).i = 0;
                        exjh exjhVar7 = (exjh) exjcVar.build();
                        fdxk fdxkVar = c.a;
                        febs febsVar = exiu.a;
                        if (febsVar == null) {
                            synchronized (exiu.class) {
                                febsVar = exiu.a;
                                if (febsVar == null) {
                                    febp a4 = febs.a();
                                    a4.c = febr.UNARY;
                                    a4.d = febs.c("google.maps.places.v1.Places", "SearchNearby");
                                    a4.b();
                                    exjh exjhVar8 = exjh.a;
                                    eyfc eyfcVar = ffag.a;
                                    a4.a = new ffae(exjhVar8);
                                    a4.b = new ffae(exjj.a);
                                    febsVar = a4.a();
                                    exiu.a = febsVar;
                                }
                            }
                        }
                        return ffat.a(fdxkVar.a(febsVar, c.b), exjhVar7);
                    }
                }, erpp.a);
                dhqd dhqdVar = ((edrl) edsnVar).g;
                if (dhqdVar != null) {
                    dhqdVar.a(new dhrb() { // from class: edii
                        @Override // defpackage.dhrb
                        public final void a() {
                            ListenableFuture.this.cancel(true);
                        }
                    });
                }
                d = duik.a(g).f(new dhrd() { // from class: edht
                    @Override // defpackage.dhrd
                    public final dhre a(Object obj) {
                        exjj exjjVar = (exjj) obj;
                        dhri dhriVar = new dhri();
                        eygr eygrVar = exjjVar.b;
                        eygr eygrVar2 = exjjVar.c;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<E> it = eygrVar.iterator();
                        while (it.hasNext()) {
                            edij edijVar2 = edij.this;
                            arrayList.add(edijVar2.d.a((exir) it.next()));
                        }
                        Iterator<E> it2 = eygrVar2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(ediz.a((exjb) it2.next()));
                        }
                        edrm edrmVar = new edrm();
                        edrmVar.a(arrayList);
                        edrmVar.b = null;
                        List list2 = edrmVar.a;
                        if (list2 == null) {
                            throw new IllegalStateException("Property \"places\" has not been set");
                        }
                        edrmVar.a(engw.n(list2));
                        List list3 = edrmVar.b;
                        if (list3 != null) {
                            edrmVar.b = engw.n(list3);
                        }
                        List list4 = edrmVar.a;
                        if (list4 == null) {
                            throw new IllegalStateException("Missing required properties: places");
                        }
                        dhriVar.b(new edrn(list4, edrmVar.b));
                        return dhriVar.a;
                    }
                }).d(new dhqh() { // from class: edhu
                    @Override // defpackage.dhqh
                    public final Object a(dhre dhreVar) {
                        if (((dhrm) dhreVar).d) {
                            return dhreVar;
                        }
                        ListenableFuture listenableFuture = a2;
                        edij edijVar2 = edij.this;
                        long a3 = edijVar2.b.a();
                        edfs edfsVar = (edfs) ((erre) listenableFuture).b;
                        int size = dhreVar.m() ? ((edsp) dhreVar.i()).a().size() : 0;
                        edkp edkpVar = edijVar2.a;
                        long j = a;
                        erhh erhhVar = (erhh) erhi.a.createBuilder();
                        erhhVar.copyOnWrite();
                        erhi erhiVar = (erhi) erhhVar.instance;
                        erhiVar.b |= 1;
                        erhiVar.c = 0;
                        erhhVar.copyOnWrite();
                        erhi erhiVar2 = (erhi) erhhVar.instance;
                        erhiVar2.b |= 2;
                        erhiVar2.d = size;
                        erhhVar.copyOnWrite();
                        erhi erhiVar3 = (erhi) erhhVar.instance;
                        erhiVar3.b |= 4;
                        erhiVar3.e = 0;
                        erhi erhiVar4 = (erhi) erhhVar.build();
                        erfs erfsVar = (erfs) erfv.a.createBuilder();
                        erfsVar.copyOnWrite();
                        erfv erfvVar = (erfv) erfsVar.instance;
                        erfvVar.c = 9;
                        erfvVar.b |= 1;
                        erfsVar.copyOnWrite();
                        erfv erfvVar2 = (erfv) erfsVar.instance;
                        erhiVar4.getClass();
                        erfvVar2.h = erhiVar4;
                        erfvVar2.b |= 4096;
                        int f = edga.f(dhreVar);
                        erfsVar.copyOnWrite();
                        erfv erfvVar3 = (erfv) erfsVar.instance;
                        erfvVar3.d = f - 1;
                        erfvVar3.b |= 2;
                        erfsVar.copyOnWrite();
                        erfv erfvVar4 = (erfv) erfsVar.instance;
                        erfvVar4.b |= 4;
                        erfvVar4.e = (int) (a3 - j);
                        ((edga) edkpVar).e((erfv) erfsVar.build(), 3, 3, edfsVar);
                        return dhreVar;
                    }
                });
            }
            return d.b(new dhqh() { // from class: edgx
                @Override // defpackage.dhqh
                public final Object a(dhre dhreVar) {
                    erhc erhcVar = (erhc) erhe.a.createBuilder();
                    ergu erguVar = (ergu) ergv.a.createBuilder();
                    edrl edrlVar = (edrl) edsnVar;
                    erguVar.a(edir.a(edrlVar.f));
                    ergv ergvVar = (ergv) erguVar.build();
                    erhcVar.copyOnWrite();
                    erhe erheVar = (erhe) erhcVar.instance;
                    ergvVar.getClass();
                    erheVar.h = ergvVar;
                    erheVar.b |= 4;
                    erhcVar.copyOnWrite();
                    erhe erheVar2 = (erhe) erhcVar.instance;
                    erheVar2.c = 0;
                    erheVar2.b |= 1;
                    erhcVar.copyOnWrite();
                    erhe erheVar3 = (erhe) erhcVar.instance;
                    erheVar3.b |= 16;
                    erheVar3.i = false;
                    List list2 = edrlVar.a;
                    if (list2 != null) {
                        erhcVar.copyOnWrite();
                        erhe erheVar4 = (erhe) erhcVar.instance;
                        eygr eygrVar = erheVar4.d;
                        if (!eygrVar.c()) {
                            erheVar4.d = eyfy.mutableCopy(eygrVar);
                        }
                        eydl.addAll(list2, erheVar4.d);
                    }
                    List list3 = edrlVar.b;
                    if (list3 != null) {
                        erhcVar.copyOnWrite();
                        erhe erheVar5 = (erhe) erhcVar.instance;
                        eygr eygrVar2 = erheVar5.e;
                        if (!eygrVar2.c()) {
                            erheVar5.e = eyfy.mutableCopy(eygrVar2);
                        }
                        eydl.addAll(list3, erheVar5.e);
                    }
                    List list4 = edrlVar.c;
                    if (list4 != null) {
                        erhcVar.copyOnWrite();
                        erhe erheVar6 = (erhe) erhcVar.instance;
                        eygr eygrVar3 = erheVar6.f;
                        if (!eygrVar3.c()) {
                            erheVar6.f = eyfy.mutableCopy(eygrVar3);
                        }
                        eydl.addAll(list4, erheVar6.f);
                    }
                    List list5 = edrlVar.d;
                    if (list5 != null) {
                        erhcVar.copyOnWrite();
                        erhe erheVar7 = (erhe) erhcVar.instance;
                        eygr eygrVar4 = erheVar7.g;
                        if (!eygrVar4.c()) {
                            erheVar7.g = eyfy.mutableCopy(eygrVar4);
                        }
                        eydl.addAll(list5, erheVar7.g);
                    }
                    edga edgaVar = (edga) edhf.this.c;
                    ergw a3 = edgaVar.a();
                    a3.copyOnWrite();
                    ergy ergyVar = (ergy) a3.instance;
                    ergy ergyVar2 = ergy.a;
                    ergyVar.c = 1;
                    ergyVar.b |= 1;
                    erhe erheVar8 = (erhe) erhcVar.build();
                    a3.copyOnWrite();
                    ergy ergyVar3 = (ergy) a3.instance;
                    erheVar8.getClass();
                    ergyVar3.i = erheVar8;
                    ergyVar3.b |= 1048576;
                    ergy ergyVar4 = (ergy) a3.build();
                    erge a4 = edtn.a(edgaVar.b, 3, 3);
                    a4.copyOnWrite();
                    ergj ergjVar = (ergj) a4.instance;
                    ergj ergjVar2 = ergj.a;
                    ergjVar.d = 1;
                    ergjVar.b |= 2;
                    a4.copyOnWrite();
                    ergj ergjVar3 = (ergj) a4.instance;
                    ergyVar4.getClass();
                    ergjVar3.f = ergyVar4;
                    ergjVar3.b |= 64;
                    String a5 = edgaVar.c.a();
                    a4.copyOnWrite();
                    ergj ergjVar4 = (ergj) a4.instance;
                    a5.getClass();
                    ergjVar4.b |= 1073741824;
                    ergjVar4.m = a5;
                    edgaVar.a.a(a4);
                    edhf.l(new ecda("SearchNearby"));
                    return (edsp) dhreVar.i();
                }
            }).d(new edgw());
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }
}
