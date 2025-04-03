package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avzd extends ffhv implements ffjm {
    final /* synthetic */ avzh a;
    final /* synthetic */ awap b;
    final /* synthetic */ awai c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avzd(ffgu ffguVar, avzh avzhVar, awap awapVar, awai awaiVar) {
        super(2, ffguVar);
        this.a = avzhVar;
        this.b = awapVar;
        this.c = awaiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avzd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Long l;
        int i;
        ffci.b(obj);
        avzh avzhVar = this.a;
        if (((atwz) avzhVar.k.b()).a()) {
            l = new Long(this.c.e.c);
        } else {
            MessageCoreData a = this.c.a();
            l = a != null ? new Long(a.t()) : null;
        }
        awap awapVar = this.b;
        awai awaiVar = this.c;
        epxc epxcVar = (epxc) epxq.b.createBuilder();
        epxcVar.getClass();
        epxcVar.copyOnWrite();
        epxq epxqVar = (epxq) epxcVar.instance;
        epxqVar.c |= 1;
        epxqVar.d = awapVar.a;
        awcp awcpVar = awaiVar.e;
        if (awcpVar.l == 0) {
            throw new IllegalArgumentException("Required value was null.");
        }
        epxcVar.copyOnWrite();
        epxq epxqVar2 = (epxq) epxcVar.instance;
        epxqVar2.f = awcn.a(r5) - 1;
        epxqVar2.c |= 4;
        new eygk(epxqVar2.h, epxq.a);
        List list = awcpVar.a;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(awcs.a((awcr) it.next()));
        }
        epxcVar.copyOnWrite();
        epxq epxqVar3 = (epxq) epxcVar.instance;
        eygi eygiVar = epxqVar3.h;
        if (!eygiVar.c()) {
            epxqVar3.h = eyfy.mutableCopy(eygiVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            epxqVar3.h.h(((epxp) it2.next()).m);
        }
        int i2 = awcpVar.b;
        epxcVar.copyOnWrite();
        epxq epxqVar4 = (epxq) epxcVar.instance;
        epxqVar4.c |= 32;
        epxqVar4.k = i2;
        epxcVar.copyOnWrite();
        epxq epxqVar5 = (epxq) epxcVar.instance;
        epxqVar5.c |= 64;
        epxqVar5.l = false;
        int i3 = awcpVar.m;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        int i5 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? 6 : 5 : 4 : 3 : 2;
        epxcVar.copyOnWrite();
        epxq epxqVar6 = (epxq) epxcVar.instance;
        epxqVar6.q = epxl.a(i5);
        epxqVar6.c |= 2048;
        int a2 = csuc.a(awcpVar.g);
        epxcVar.copyOnWrite();
        epxq epxqVar7 = (epxq) epxcVar.instance;
        epxqVar7.n = eohg.a(a2);
        epxqVar7.c |= 256;
        DesugarCollections.unmodifiableList(epxqVar7.i).getClass();
        List<awcq> list2 = awcpVar.i;
        ArrayList arrayList2 = new ArrayList(ffdx.n(list2, 10));
        for (awcq awcqVar : list2) {
            epxm epxmVar = (epxm) epxn.a.createBuilder();
            epxmVar.getClass();
            epxp a3 = awcs.a(awcqVar.a);
            epxmVar.copyOnWrite();
            epxn epxnVar = (epxn) epxmVar.instance;
            epxnVar.c = a3.m;
            epxnVar.b |= 1;
            int a4 = awcn.a(awcqVar.c);
            epxmVar.copyOnWrite();
            epxn epxnVar2 = (epxn) epxmVar.instance;
            epxnVar2.d = a4 - 1;
            epxnVar2.b |= 2;
            eyev a5 = eykn.a(awcqVar.b);
            epxmVar.copyOnWrite();
            epxn epxnVar3 = (epxn) epxmVar.instance;
            epxnVar3.e = a5;
            epxnVar3.b |= 4;
            eyfy build = epxmVar.build();
            build.getClass();
            arrayList2.add((epxn) build);
        }
        epxcVar.copyOnWrite();
        epxq epxqVar8 = (epxq) epxcVar.instance;
        eygr eygrVar = epxqVar8.i;
        if (!eygrVar.c()) {
            epxqVar8.i = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(arrayList2, epxqVar8.i);
        if (l != null) {
            long longValue = l.longValue();
            epxcVar.copyOnWrite();
            epxq epxqVar9 = (epxq) epxcVar.instance;
            epxqVar9.c |= 2;
            epxqVar9.e = longValue;
        }
        Duration duration = awcpVar.d;
        if (duration != null) {
            eyev a6 = eykn.a(duration);
            epxcVar.copyOnWrite();
            epxq epxqVar10 = (epxq) epxcVar.instance;
            epxqVar10.g = a6;
            epxqVar10.c |= 8;
        }
        String str = awcpVar.e;
        if (str != null) {
            epxcVar.copyOnWrite();
            epxq epxqVar11 = (epxq) epxcVar.instance;
            epxqVar11.c |= 128;
            epxqVar11.m = str;
        }
        ContentType contentType = awcpVar.f;
        if (contentType != null) {
            eohj a7 = csud.a(contentType.toString());
            a7.getClass();
            epxcVar.copyOnWrite();
            epxq epxqVar12 = (epxq) epxcVar.instance;
            epxqVar12.j = a7.a();
            epxqVar12.c |= 16;
        }
        Integer num = awcpVar.h;
        if (num != null) {
            int intValue = num.intValue();
            epxcVar.copyOnWrite();
            epxq epxqVar13 = (epxq) epxcVar.instance;
            epxqVar13.c |= 512;
            epxqVar13.o = intValue;
        }
        awco awcoVar = avzhVar.j;
        epyb epybVar = awcpVar.k;
        if (((atwu) awcoVar.c.b()).a() && epybVar != null) {
            epxcVar.copyOnWrite();
            epxq epxqVar14 = (epxq) epxcVar.instance;
            epxqVar14.r = epybVar;
            epxqVar14.c |= 4096;
        }
        cbjc cbjcVar = awcpVar.j;
        if (((atww) awcoVar.b.b()).a() && cbjcVar != null) {
            epxf epxfVar = (epxf) epxk.a.createBuilder();
            epxfVar.getClass();
            int b = cbjb.b(cbjcVar.c);
            if (b == 0) {
                b = 1;
            }
            int i6 = b + (-2) != 1 ? 3 : 2;
            epxfVar.copyOnWrite();
            epxk epxkVar = (epxk) epxfVar.instance;
            epxkVar.f = eplm.a(i6);
            epxkVar.b |= 2;
            eplp eplpVar = cbjcVar.g;
            if (eplpVar == null) {
                eplpVar = eplp.a;
            }
            int i7 = 9;
            switch (eplpVar.v) {
                case 0:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                case 10:
                    i = 12;
                    break;
                case 11:
                    i = 13;
                    break;
                case 12:
                    i = 14;
                    break;
                case 13:
                    i = 15;
                    break;
                case 14:
                    i = 16;
                    break;
                case 15:
                    i = 17;
                    break;
                case 16:
                    i = 18;
                    break;
                case 17:
                    i = 19;
                    break;
                case 18:
                    i = 20;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                i = 1;
            }
            epxfVar.copyOnWrite();
            epxk epxkVar2 = (epxk) epxfVar.instance;
            epxkVar2.g = eplk.a(i);
            epxkVar2.b |= 4;
            eplp eplpVar2 = cbjcVar.g;
            if (eplpVar2 == null) {
                eplpVar2 = eplp.a;
            }
            int b2 = epln.b(eplpVar2.t);
            if (b2 == 0) {
                b2 = 1;
            }
            epxfVar.copyOnWrite();
            epxk epxkVar3 = (epxk) epxfVar.instance;
            epxkVar3.e = epln.a(b2);
            epxkVar3.b |= 1;
            int b3 = epln.b(((epxk) epxfVar.instance).e);
            if (b3 == 0) {
                b3 = 1;
            }
            int i8 = b3 - 2;
            if (i8 == 1 || i8 == 2) {
                epxg epxgVar = (epxg) epxh.a.createBuilder();
                epxgVar.getClass();
                if (contentType != null) {
                    String contentType2 = contentType.toString();
                    if (le.p(contentType2)) {
                        i7 = 3;
                    } else if (contentType2.equals("image/gif")) {
                        i7 = 4;
                    } else if (contentType2.equals("image/vnd.wap.wbmp")) {
                        i7 = 5;
                    } else if (contentType2.equals("image/png")) {
                        i7 = 6;
                    } else if (contentType2.equals("image/x-ms-bmp")) {
                        i7 = 7;
                    } else if (contentType2.equals("image/heif")) {
                        i7 = 8;
                    } else if (!contentType2.equals("image/heic")) {
                        i7 = 2;
                    }
                    epxgVar.copyOnWrite();
                    epxh epxhVar = (epxh) epxgVar.instance;
                    epxhVar.g = i7 - 2;
                    epxhVar.b = 16 | epxhVar.b;
                }
                eplp eplpVar3 = cbjcVar.g;
                if (eplpVar3 == null) {
                    eplpVar3 = eplp.a;
                }
                int a8 = awco.a(eplpVar3.p);
                epxgVar.copyOnWrite();
                epxh epxhVar2 = (epxh) epxgVar.instance;
                epxhVar2.c = epxe.a(a8);
                epxhVar2.b |= 1;
                eplp eplpVar4 = cbjcVar.g;
                if (eplpVar4 == null) {
                    eplpVar4 = eplp.a;
                }
                int a9 = awco.a(eplpVar4.o);
                epxgVar.copyOnWrite();
                epxh epxhVar3 = (epxh) epxgVar.instance;
                epxhVar3.d = epxe.a(a9);
                epxhVar3.b |= 2;
                eplp eplpVar5 = cbjcVar.g;
                if (eplpVar5 == null) {
                    eplpVar5 = eplp.a;
                }
                int a10 = awco.a(eplpVar5.r);
                epxgVar.copyOnWrite();
                epxh epxhVar4 = (epxh) epxgVar.instance;
                epxhVar4.e = epxe.a(a10);
                epxhVar4.b |= 4;
                eplp eplpVar6 = cbjcVar.g;
                if (eplpVar6 == null) {
                    eplpVar6 = eplp.a;
                }
                int a11 = awco.a(eplpVar6.q);
                epxgVar.copyOnWrite();
                epxh epxhVar5 = (epxh) epxgVar.instance;
                epxhVar5.f = epxe.a(a11);
                epxhVar5.b |= 8;
                eyfy build2 = epxgVar.build();
                build2.getClass();
                epxfVar.copyOnWrite();
                epxk epxkVar4 = (epxk) epxfVar.instance;
                epxkVar4.d = (epxh) build2;
                epxkVar4.c = 4;
            } else if (i8 == 3) {
                epxi epxiVar = (epxi) epxj.a.createBuilder();
                epxiVar.getClass();
                eplp eplpVar7 = cbjcVar.g;
                if (eplpVar7 == null) {
                    eplpVar7 = eplp.a;
                }
                int i9 = eplpVar7.u;
                int i10 = i9 < 1000000 ? 3 : i9 < 1500000 ? 4 : i9 < 2000000 ? 5 : i9 < 2500000 ? 6 : i9 < 5000000 ? 7 : i9 < 10000000 ? 8 : i9 < 20000000 ? 9 : 10;
                epxiVar.copyOnWrite();
                epxj epxjVar = (epxj) epxiVar.instance;
                epxjVar.c = i10 - 2;
                epxjVar.b = 1 | epxjVar.b;
                eplp eplpVar8 = cbjcVar.g;
                if (eplpVar8 == null) {
                    eplpVar8 = eplp.a;
                }
                eplo b4 = eplo.b(eplpVar8.l);
                if (b4 == null) {
                    b4 = eplo.UNRECOGNIZED;
                }
                b4.getClass();
                epxiVar.copyOnWrite();
                epxj epxjVar2 = (epxj) epxiVar.instance;
                epxjVar2.d = b4.a();
                epxjVar2.b |= 2;
                eplp eplpVar9 = cbjcVar.g;
                if (eplpVar9 == null) {
                    eplpVar9 = eplp.a;
                }
                eplo b5 = eplo.b(eplpVar9.i);
                if (b5 == null) {
                    b5 = eplo.UNRECOGNIZED;
                }
                b5.getClass();
                epxiVar.copyOnWrite();
                epxj epxjVar3 = (epxj) epxiVar.instance;
                epxjVar3.e = b5.a();
                epxjVar3.b |= 4;
                eplp eplpVar10 = cbjcVar.g;
                if (eplpVar10 == null) {
                    eplpVar10 = eplp.a;
                }
                int a12 = awco.a(eplpVar10.n);
                epxiVar.copyOnWrite();
                epxj epxjVar4 = (epxj) epxiVar.instance;
                epxjVar4.f = epxe.a(a12);
                epxjVar4.b |= 8;
                eplp eplpVar11 = cbjcVar.g;
                if (eplpVar11 == null) {
                    eplpVar11 = eplp.a;
                }
                int a13 = awco.a(eplpVar11.m);
                epxiVar.copyOnWrite();
                epxj epxjVar5 = (epxj) epxiVar.instance;
                epxjVar5.g = epxe.a(a13);
                epxjVar5.b |= 16;
                eyfy build3 = epxiVar.build();
                build3.getClass();
                epxfVar.copyOnWrite();
                epxk epxkVar5 = (epxk) epxfVar.instance;
                epxkVar5.d = (epxj) build3;
                epxkVar5.c = 5;
            }
            eyfy build4 = epxfVar.build();
            build4.getClass();
            epxcVar.copyOnWrite();
            epxq epxqVar15 = (epxq) epxcVar.instance;
            epxqVar15.p = (epxk) build4;
            epxqVar15.c |= 1024;
        }
        eyfy build5 = epxcVar.build();
        build5.getClass();
        akxn a14 = awcoVar.a.a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.BUGLE_FILE_PROCESSING, eoluVar);
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.cy = (epxq) build5;
        eolvVar.h |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        a14.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_FILE_PROCESSING_EVENT);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avzd avzdVar = new avzd(ffguVar, this.a, this.b, this.c);
        avzdVar.d = obj;
        return avzdVar;
    }
}
