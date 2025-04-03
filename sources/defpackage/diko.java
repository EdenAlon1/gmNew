package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diko extends dikp implements dikl {
    public static final /* synthetic */ int b = 0;
    private final dijt e;

    public diko(djix djixVar, dkpp dkppVar, eplu epluVar, errl errlVar, dijt dijtVar) {
        super(djixVar, dkppVar, epluVar, errlVar, dijtVar);
        this.e = dijtVar;
    }

    private final ezcb D(ezbo ezboVar, djrm djrmVar) {
        eqpc b2 = this.e.b(djrmVar);
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcb ezcbVar2 = ezcb.a;
        b2.getClass();
        ezcbVar.w = b2;
        ezcbVar.b |= 524288;
        return (ezcb) ezboVar.build();
    }

    private static ezfe E(Throwable th) {
        if (th instanceof dfqu) {
            int a = ((dfqu) th).a();
            ezfd ezfdVar = (ezfd) ezfe.a.createBuilder();
            ezfdVar.copyOnWrite();
            ezfe ezfeVar = (ezfe) ezfdVar.instance;
            ezfeVar.b = 1;
            ezfeVar.c = Integer.valueOf(a);
            return (ezfe) ezfdVar.build();
        }
        ezfd ezfdVar2 = (ezfd) ezfe.a.createBuilder();
        String name = th.getClass().getName();
        ezfdVar2.copyOnWrite();
        ezfe ezfeVar2 = (ezfe) ezfdVar2.instance;
        name.getClass();
        ezfeVar2.b = 2;
        ezfeVar2.c = name;
        return (ezfe) ezfdVar2.build();
    }

    private final ezcb F(ezez ezezVar, int i, djrm djrmVar) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.c = ezezVar.I;
        ezcbVar.b |= 1;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.d = i - 1;
        ezcbVar2.b |= 2;
        eqpc b2 = this.e.b(djrmVar);
        ezboVar.copyOnWrite();
        ezcb ezcbVar3 = (ezcb) ezboVar.instance;
        b2.getClass();
        ezcbVar3.w = b2;
        ezcbVar3.b |= 524288;
        return (ezcb) ezboVar.build();
    }

    @Override // defpackage.dikl
    public final void a(Context context, ezez ezezVar, String str, djrm djrmVar, ezeq... ezeqVarArr) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.c = ezezVar.I;
        ezcbVar.b |= 1;
        List asList = Arrays.asList(ezeqVarArr);
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        eygi eygiVar = ezcbVar2.i;
        if (!eygiVar.c()) {
            ezcbVar2.i = eyfy.mutableCopy(eygiVar);
        }
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            ezcbVar2.i.h(((ezeq) it.next()).m);
        }
        C(context, D(ezboVar, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void b(Context context, ezez ezezVar, String str, djrm djrmVar) {
        C(context, F(ezezVar, 11, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void c(Context context, ezez ezezVar, String str, djrm djrmVar) {
        C(context, F(ezezVar, 2, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void d(Context context, ezez ezezVar, String str, djrm djrmVar) {
        C(context, F(ezezVar, 5, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void e(Context context, ezez ezezVar, String str, djrm djrmVar) {
        C(context, F(ezezVar, 6, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void f(Context context, ezez ezezVar, int i, String str, djrm djrmVar) {
        ezbo ezboVar = (ezbo) F(ezezVar, 7, djrmVar).toBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.b |= 4;
        ezcbVar.e = i;
        C(context, (ezcb) ezboVar.build(), str);
    }

    @Override // defpackage.dikl
    public final void g(Context context, ezez ezezVar, boolean z, String str, djrm djrmVar) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.c = ezezVar.I;
        ezcbVar.b |= 1;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.b |= 1024;
        ezcbVar2.n = z;
        C(context, D(ezboVar, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void h(Context context, ezez ezezVar, String str, djrm djrmVar) {
        C(context, F(ezezVar, 3, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void i(Context context, dkbh dkbhVar, djrm djrmVar) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        eyyr eyyrVar = (eyyr) eyyt.a.createBuilder();
        eyyrVar.copyOnWrite();
        eyyt eyytVar = (eyyt) eyyrVar.instance;
        dkba dkbaVar = (dkba) dkbhVar;
        eyyq eyyqVar = dkbaVar.d;
        eyyqVar.getClass();
        eyytVar.d = eyyqVar;
        eyytVar.c = 3;
        eyyrVar.copyOnWrite();
        eyyt eyytVar2 = (eyyt) eyyrVar.instance;
        eyytVar2.b |= 2;
        eyytVar2.f = dkbaVar.b;
        eyyrVar.copyOnWrite();
        eyyt eyytVar3 = (eyyt) eyyrVar.instance;
        eyytVar3.e = 2;
        eyytVar3.b |= 1;
        eyyrVar.copyOnWrite();
        eyyt eyytVar4 = (eyyt) eyyrVar.instance;
        eyytVar4.h = dkbaVar.e - 1;
        eyytVar4.b |= 8;
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        eyyt eyytVar5 = (eyyt) eyyrVar.build();
        eyytVar5.getClass();
        ezcbVar.r = eyytVar5;
        ezcbVar.b |= 16384;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.c = dkbaVar.a.I;
        ezcbVar2.b |= 1;
        C(context, D(ezboVar, djrmVar), dkbaVar.c);
    }

    @Override // defpackage.dikl
    public final void j(Context context, dkbn dkbnVar, String str, djrm djrmVar) {
        final eyyu eyyuVar = (eyyu) dkbnVar.a().toBuilder();
        eyyuVar.copyOnWrite();
        ((eyzd) eyyuVar.instance).a().clear();
        eyyuVar.copyOnWrite();
        ((eyzd) eyyuVar.instance).b().clear();
        Map.EL.forEach(DesugarCollections.unmodifiableMap(dkbnVar.a().e), new BiConsumer() { // from class: dikn
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str2 = (String) obj;
                int i = diko.b;
                eyza eyzaVar = (eyza) eyzb.a.createBuilder();
                for (String str3 : ((eyzb) obj2).b) {
                    if (!dkcf.a.contains(str2)) {
                        str3 = str3 == null ? "null" : str3.isEmpty() ? "empty" : "set";
                    } else if (TextUtils.isEmpty(str3)) {
                        str3 = String.valueOf(str3);
                    } else if ("token".equals(str2)) {
                        int i2 = eodh.a;
                        str3 = eodf.a.c(str3, StandardCharsets.UTF_8).toString();
                    } else if ("IMSI".equals(str2)) {
                        str3 = str3.substring(0, 6);
                    }
                    eyzaVar.a(str3);
                }
                eyyu.this.a(str2, (eyzb) eyzaVar.build());
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        eyzd eyzdVar = (eyzd) eyyuVar.build();
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        eyyr eyyrVar = (eyyr) eyyt.a.createBuilder();
        eyyrVar.copyOnWrite();
        eyyt eyytVar = (eyyt) eyyrVar.instance;
        str.getClass();
        eyytVar.b |= 2;
        eyytVar.f = str;
        eyyrVar.copyOnWrite();
        eyyt eyytVar2 = (eyyt) eyyrVar.instance;
        eyzdVar.getClass();
        eyytVar2.d = eyzdVar;
        eyytVar2.c = 1;
        eyyrVar.copyOnWrite();
        eyyt eyytVar3 = (eyyt) eyyrVar.instance;
        eyytVar3.e = 2;
        eyytVar3.b |= 1;
        int h = dkbnVar.h();
        eyyrVar.copyOnWrite();
        eyyt eyytVar4 = (eyyt) eyyrVar.instance;
        eyytVar4.h = h - 1;
        eyytVar4.b |= 8;
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        eyyt eyytVar5 = (eyyt) eyyrVar.build();
        eyytVar5.getClass();
        ezcbVar.r = eyytVar5;
        ezcbVar.b |= 16384;
        ezez b2 = dkbnVar.b();
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.c = b2.I;
        ezcbVar2.b |= 1;
        C(context, D(ezboVar, djrmVar), dkbnVar.f());
    }

    @Override // defpackage.dikl
    public final void k(Context context, dkbq dkbqVar, djrm djrmVar) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        eyyr eyyrVar = (eyyr) eyyt.a.createBuilder();
        eyyrVar.copyOnWrite();
        eyyt eyytVar = (eyyt) eyyrVar.instance;
        dkbe dkbeVar = (dkbe) dkbqVar;
        eyzf eyzfVar = dkbeVar.d;
        eyzfVar.getClass();
        eyytVar.d = eyzfVar;
        eyytVar.c = 2;
        eyyrVar.copyOnWrite();
        eyyt eyytVar2 = (eyyt) eyyrVar.instance;
        eyytVar2.b |= 2;
        eyytVar2.f = dkbeVar.b;
        eyyrVar.copyOnWrite();
        eyyt eyytVar3 = (eyyt) eyyrVar.instance;
        eyytVar3.e = 2;
        eyytVar3.b |= 1;
        eyyrVar.copyOnWrite();
        eyyt eyytVar4 = (eyyt) eyyrVar.instance;
        eyytVar4.h = dkbeVar.e - 1;
        eyytVar4.b |= 8;
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        eyyt eyytVar5 = (eyyt) eyyrVar.build();
        eyytVar5.getClass();
        ezcbVar.r = eyytVar5;
        ezcbVar.b |= 16384;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.c = dkbeVar.a.I;
        ezcbVar2.b |= 1;
        C(context, D(ezboVar, djrmVar), dkbeVar.c);
    }

    @Override // defpackage.dikl
    public final void l(Context context, ezez ezezVar, String str, djrm djrmVar) {
        C(context, F(ezezVar, 8, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void m(Context context, String str, String str2, String str3, String str4, int i, int i2, djrm djrmVar) {
        ezds ezdsVar = (ezds) ezdt.a.createBuilder();
        ezdy ezdyVar = ezdy.a;
        ezdsVar.copyOnWrite();
        ezdt ezdtVar = (ezdt) ezdsVar.instance;
        ezdyVar.getClass();
        ezdtVar.d = ezdyVar;
        ezdtVar.c = 1;
        ezdsVar.copyOnWrite();
        ezdt ezdtVar2 = (ezdt) ezdsVar.instance;
        str2.getClass();
        ezdtVar2.b = 1 | ezdtVar2.b;
        ezdtVar2.e = str2;
        ezdsVar.copyOnWrite();
        ezdt ezdtVar3 = (ezdt) ezdsVar.instance;
        str3.getClass();
        ezdtVar3.b |= 2;
        ezdtVar3.f = str3;
        ezdsVar.copyOnWrite();
        ezdt ezdtVar4 = (ezdt) ezdsVar.instance;
        str4.getClass();
        ezdtVar4.b |= 4;
        ezdtVar4.g = str4;
        ezdsVar.copyOnWrite();
        ezdt ezdtVar5 = (ezdt) ezdsVar.instance;
        ezdtVar5.b |= 8;
        ezdtVar5.h = i;
        ezdsVar.copyOnWrite();
        ezdt ezdtVar6 = (ezdt) ezdsVar.instance;
        ezdtVar6.b |= 16;
        ezdtVar6.i = i2;
        ezdt ezdtVar7 = (ezdt) ezdsVar.build();
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezdtVar7.getClass();
        ezcbVar.v = ezdtVar7;
        ezcbVar.b |= 262144;
        C(context, D(ezboVar, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void n(Context context, String str, String str2, String str3, String str4, int i, int i2, djrm djrmVar, Optional optional) {
        ezdt ezdtVar;
        if (optional.isPresent()) {
            ezds ezdsVar = (ezds) ezdt.a.createBuilder();
            ezdz ezdzVar = (ezdz) ezea.a.createBuilder();
            ezec ezecVar = ezec.a;
            ezdzVar.copyOnWrite();
            ezea ezeaVar = (ezea) ezdzVar.instance;
            ezecVar.getClass();
            ezeaVar.c = ezecVar;
            ezeaVar.b = 1;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar2 = (ezdt) ezdsVar.instance;
            ezea ezeaVar2 = (ezea) ezdzVar.build();
            ezeaVar2.getClass();
            ezdtVar2.d = ezeaVar2;
            ezdtVar2.c = 2;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar3 = (ezdt) ezdsVar.instance;
            str2.getClass();
            ezdtVar3.b = 1 | ezdtVar3.b;
            ezdtVar3.e = str2;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar4 = (ezdt) ezdsVar.instance;
            str3.getClass();
            ezdtVar4.b = 2 | ezdtVar4.b;
            ezdtVar4.f = str3;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar5 = (ezdt) ezdsVar.instance;
            str4.getClass();
            ezdtVar5.b |= 4;
            ezdtVar5.g = str4;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar6 = (ezdt) ezdsVar.instance;
            ezdtVar6.b |= 8;
            ezdtVar6.h = i;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar7 = (ezdt) ezdsVar.instance;
            ezdtVar7.b |= 16;
            ezdtVar7.i = i2;
            Object obj = optional.get();
            ezdsVar.copyOnWrite();
            ezdt ezdtVar8 = (ezdt) ezdsVar.instance;
            ezdtVar8.j = ((esgg) obj).a();
            ezdtVar8.b |= 32;
            ezdtVar = (ezdt) ezdsVar.build();
        } else {
            ezds ezdsVar2 = (ezds) ezdt.a.createBuilder();
            ezdz ezdzVar2 = (ezdz) ezea.a.createBuilder();
            ezec ezecVar2 = ezec.a;
            ezdzVar2.copyOnWrite();
            ezea ezeaVar3 = (ezea) ezdzVar2.instance;
            ezecVar2.getClass();
            ezeaVar3.c = ezecVar2;
            ezeaVar3.b = 1;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar9 = (ezdt) ezdsVar2.instance;
            ezea ezeaVar4 = (ezea) ezdzVar2.build();
            ezeaVar4.getClass();
            ezdtVar9.d = ezeaVar4;
            ezdtVar9.c = 2;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar10 = (ezdt) ezdsVar2.instance;
            str2.getClass();
            ezdtVar10.b = 1 | ezdtVar10.b;
            ezdtVar10.e = str2;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar11 = (ezdt) ezdsVar2.instance;
            str3.getClass();
            ezdtVar11.b |= 2;
            ezdtVar11.f = str3;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar12 = (ezdt) ezdsVar2.instance;
            str4.getClass();
            ezdtVar12.b |= 4;
            ezdtVar12.g = str4;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar13 = (ezdt) ezdsVar2.instance;
            ezdtVar13.b |= 8;
            ezdtVar13.h = i;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar14 = (ezdt) ezdsVar2.instance;
            ezdtVar14.b |= 16;
            ezdtVar14.i = i2;
            ezdtVar = (ezdt) ezdsVar2.build();
        }
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezdtVar.getClass();
        ezcbVar.v = ezdtVar;
        ezcbVar.b |= 262144;
        C(context, D(ezboVar, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void o(Context context, ezez ezezVar, int i, int i2, String str, djrm djrmVar) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.c = ezezVar.I;
        ezcbVar.b |= 1;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.h = i - 1;
        ezcbVar2.b |= 32;
        ezboVar.copyOnWrite();
        ezcb ezcbVar3 = (ezcb) ezboVar.instance;
        ezcbVar3.b |= 512;
        ezcbVar3.m = i2;
        C(context, D(ezboVar, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void p(Context context, ezez ezezVar, int i, String str, djrm djrmVar) {
        C(context, F(ezezVar, i, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void q(Context context, ezez ezezVar, String str, String str2, int i, djrm djrmVar) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.c = ezezVar.I;
        ezcbVar.b |= 1;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.l = 7;
        ezcbVar2.b |= 256;
        ezboVar.copyOnWrite();
        ezcb ezcbVar3 = (ezcb) ezboVar.instance;
        str2.getClass();
        ezcbVar3.b |= 8192;
        ezcbVar3.q = str2;
        ezboVar.copyOnWrite();
        ezcb ezcbVar4 = (ezcb) ezboVar.instance;
        ezcbVar4.p = i - 1;
        ezcbVar4.b |= 4096;
        C(context, D(ezboVar, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void r(Context context, ezez ezezVar, int i, String str, djrm djrmVar) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.c = ezezVar.I;
        ezcbVar.b |= 1;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.l = i - 1;
        ezcbVar2.b |= 256;
        C(context, D(ezboVar, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void s(Context context, ezez ezezVar, int i, String str, String str2, djrm djrmVar) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.c = ezezVar.I;
        ezcbVar.b |= 1;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.j = i - 1;
        ezcbVar2.b |= 64;
        ezboVar.copyOnWrite();
        ezcb ezcbVar3 = (ezcb) ezboVar.instance;
        str.getClass();
        ezcbVar3.b |= 128;
        ezcbVar3.k = str;
        C(context, D(ezboVar, djrmVar), str2);
    }

    @Override // defpackage.dikl
    public final void t(Context context, Supplier supplier, String str, int i, int i2, String str2) {
        Object obj;
        ezbu ezbuVar = (ezbu) ezbw.a.createBuilder();
        ezbuVar.copyOnWrite();
        ezbw ezbwVar = (ezbw) ezbuVar.instance;
        ezbwVar.c = i - 1;
        ezbwVar.b |= 1;
        ezbuVar.copyOnWrite();
        ezbw ezbwVar2 = (ezbw) ezbuVar.instance;
        ezbwVar2.b |= 2;
        ezbwVar2.d = i2;
        ezbw ezbwVar3 = (ezbw) ezbuVar.build();
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        obj = supplier.get();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.c = ((ezez) obj).I;
        ezcbVar.b |= 1;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.b |= 8192;
        ezcbVar2.q = emxe.b(str);
        ezboVar.copyOnWrite();
        ezcb ezcbVar3 = (ezcb) ezboVar.instance;
        ezbwVar3.getClass();
        ezcbVar3.s = ezbwVar3;
        ezcbVar3.b |= 32768;
        C(context, (ezcb) ezboVar.build(), str2);
    }

    @Override // defpackage.dikl
    public final void u(Context context, String str, String str2, String str3, String str4, int i, boolean z, Optional optional, int i2, int i3, djrm djrmVar, Optional optional2, Optional optional3) {
        ezdt ezdtVar;
        final ezdu ezduVar = (ezdu) ezdw.a.createBuilder();
        ezduVar.copyOnWrite();
        ezdw ezdwVar = (ezdw) ezduVar.instance;
        ezdwVar.c = i - 1;
        ezdwVar.b |= 1;
        ezduVar.copyOnWrite();
        ezdw ezdwVar2 = (ezdw) ezduVar.instance;
        ezdwVar2.b |= 2;
        ezdwVar2.d = z;
        int intValue = ((Integer) optional2.orElse(-1)).intValue();
        ezduVar.copyOnWrite();
        ezdw ezdwVar3 = (ezdw) ezduVar.instance;
        ezdwVar3.b |= 8;
        ezdwVar3.f = intValue;
        optional.ifPresent(new Consumer() { // from class: dikm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                int intValue2 = ((Integer) obj).intValue();
                ezdu ezduVar2 = ezdu.this;
                ezduVar2.copyOnWrite();
                ezdw ezdwVar4 = (ezdw) ezduVar2.instance;
                ezdw ezdwVar5 = ezdw.a;
                ezdwVar4.b |= 4;
                ezdwVar4.e = intValue2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (optional3.isPresent()) {
            ezds ezdsVar = (ezds) ezdt.a.createBuilder();
            ezdz ezdzVar = (ezdz) ezea.a.createBuilder();
            ezdzVar.copyOnWrite();
            ezea ezeaVar = (ezea) ezdzVar.instance;
            ezdw ezdwVar4 = (ezdw) ezduVar.build();
            ezdwVar4.getClass();
            ezeaVar.c = ezdwVar4;
            ezeaVar.b = 2;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar2 = (ezdt) ezdsVar.instance;
            ezea ezeaVar2 = (ezea) ezdzVar.build();
            ezeaVar2.getClass();
            ezdtVar2.d = ezeaVar2;
            ezdtVar2.c = 2;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar3 = (ezdt) ezdsVar.instance;
            str2.getClass();
            ezdtVar3.b |= 1;
            ezdtVar3.e = str2;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar4 = (ezdt) ezdsVar.instance;
            str3.getClass();
            ezdtVar4.b |= 2;
            ezdtVar4.f = str3;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar5 = (ezdt) ezdsVar.instance;
            str4.getClass();
            ezdtVar5.b |= 4;
            ezdtVar5.g = str4;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar6 = (ezdt) ezdsVar.instance;
            ezdtVar6.b |= 8;
            ezdtVar6.h = i2;
            ezdsVar.copyOnWrite();
            ezdt ezdtVar7 = (ezdt) ezdsVar.instance;
            ezdtVar7.b |= 16;
            ezdtVar7.i = i3;
            Object obj = optional3.get();
            ezdsVar.copyOnWrite();
            ezdt ezdtVar8 = (ezdt) ezdsVar.instance;
            ezdtVar8.j = ((esgg) obj).a();
            ezdtVar8.b |= 32;
            ezdtVar = (ezdt) ezdsVar.build();
        } else {
            ezds ezdsVar2 = (ezds) ezdt.a.createBuilder();
            ezdz ezdzVar2 = (ezdz) ezea.a.createBuilder();
            ezdzVar2.copyOnWrite();
            ezea ezeaVar3 = (ezea) ezdzVar2.instance;
            ezdw ezdwVar5 = (ezdw) ezduVar.build();
            ezdwVar5.getClass();
            ezeaVar3.c = ezdwVar5;
            ezeaVar3.b = 2;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar9 = (ezdt) ezdsVar2.instance;
            ezea ezeaVar4 = (ezea) ezdzVar2.build();
            ezeaVar4.getClass();
            ezdtVar9.d = ezeaVar4;
            ezdtVar9.c = 2;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar10 = (ezdt) ezdsVar2.instance;
            str2.getClass();
            ezdtVar10.b |= 1;
            ezdtVar10.e = str2;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar11 = (ezdt) ezdsVar2.instance;
            str3.getClass();
            ezdtVar11.b |= 2;
            ezdtVar11.f = str3;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar12 = (ezdt) ezdsVar2.instance;
            str4.getClass();
            ezdtVar12.b |= 4;
            ezdtVar12.g = str4;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar13 = (ezdt) ezdsVar2.instance;
            ezdtVar13.b |= 8;
            ezdtVar13.h = i2;
            ezdsVar2.copyOnWrite();
            ezdt ezdtVar14 = (ezdt) ezdsVar2.instance;
            ezdtVar14.b |= 16;
            ezdtVar14.i = i3;
            ezdtVar = (ezdt) ezdsVar2.build();
        }
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezdtVar.getClass();
        ezcbVar.v = ezdtVar;
        ezcbVar.b |= 262144;
        C(context, D(ezboVar, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void v(Context context, ezez ezezVar, int i, String str, String str2, djrm djrmVar) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.c = ezezVar.I;
        ezcbVar.b |= 1;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.b |= 8192;
        if (str == null) {
            str = "";
        }
        ezcbVar2.q = str;
        ezboVar.copyOnWrite();
        ezcb ezcbVar3 = (ezcb) ezboVar.instance;
        ezcbVar3.p = i - 1;
        ezcbVar3.b |= 4096;
        ezboVar.copyOnWrite();
        ezcb ezcbVar4 = (ezcb) ezboVar.instance;
        ezcbVar4.o = 1;
        ezcbVar4.b |= 2048;
        C(context, D(ezboVar, djrmVar), str2);
    }

    @Override // defpackage.dikl
    public final void w(Context context, String str, int i, clxt clxtVar, boolean z, boolean z2, Throwable th) {
        ezbp ezbpVar = (ezbp) ezbs.a.createBuilder();
        ezbpVar.copyOnWrite();
        ezbs ezbsVar = (ezbs) ezbpVar.instance;
        ezbsVar.g = 3;
        ezbsVar.b |= 32;
        ezbpVar.copyOnWrite();
        ezbs ezbsVar2 = (ezbs) ezbpVar.instance;
        ezbsVar2.c = (true != z2 ? 3 : 2) - 1;
        ezbsVar2.b |= 1;
        ezbpVar.copyOnWrite();
        ezbs ezbsVar3 = (ezbs) ezbpVar.instance;
        ezbsVar3.b |= 2;
        ezbsVar3.d = i;
        int i2 = true == clxtVar.equals(clxt.GOOGLE_TOS_CONSENTED) ? 2 : 3;
        ezbpVar.copyOnWrite();
        ezbs ezbsVar4 = (ezbs) ezbpVar.instance;
        ezbsVar4.e = i2 - 1;
        ezbsVar4.b |= 4;
        ezbpVar.copyOnWrite();
        ezbs ezbsVar5 = (ezbs) ezbpVar.instance;
        ezbsVar5.b |= 16;
        ezbsVar5.f = z;
        if (th != null) {
            ezfe E = E(th);
            ezbpVar.copyOnWrite();
            ezbs ezbsVar6 = (ezbs) ezbpVar.instance;
            E.getClass();
            ezbsVar6.h = E;
            ezbsVar6.b |= 64;
        }
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezbs ezbsVar7 = (ezbs) ezbpVar.build();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezbsVar7.getClass();
        ezcbVar.u = ezbsVar7;
        ezcbVar.b |= 131072;
        C(context, (ezcb) ezboVar.build(), str);
    }

    @Override // defpackage.dikl
    public final void x(Context context, int i, String str, djrm djrmVar) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.g = i - 1;
        ezcbVar.b |= 16;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.f = 1;
        ezcbVar2.b |= 8;
        C(context, D(ezboVar, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void y(Context context, ezez ezezVar, int i, String str, djrm djrmVar) {
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcbVar.c = ezezVar.I;
        ezcbVar.b |= 1;
        ezboVar.copyOnWrite();
        ezcb ezcbVar2 = (ezcb) ezboVar.instance;
        ezcbVar2.l = 1;
        ezcbVar2.b |= 256;
        ezboVar.copyOnWrite();
        ezcb ezcbVar3 = (ezcb) ezboVar.instance;
        ezcbVar3.b |= 4;
        ezcbVar3.e = i;
        C(context, D(ezboVar, djrmVar), str);
    }

    @Override // defpackage.dikl
    public final void z(Context context, String str, int i, clxt clxtVar, cmem cmemVar, ezes ezesVar, boolean z, boolean z2, boolean z3, Throwable th, boolean z4) {
        ezbx ezbxVar = (ezbx) ezca.a.createBuilder();
        ezbxVar.copyOnWrite();
        ezca ezcaVar = (ezca) ezbxVar.instance;
        ezcaVar.h = 3;
        ezcaVar.b |= 512;
        ezbxVar.copyOnWrite();
        ezca ezcaVar2 = (ezca) ezbxVar.instance;
        ezcaVar2.c = (true != z3 ? 4 : 3) - 1;
        ezcaVar2.b |= 1;
        ezbxVar.copyOnWrite();
        ezca ezcaVar3 = (ezca) ezbxVar.instance;
        ezcaVar3.b |= 2;
        ezcaVar3.d = i;
        int i2 = true != clxtVar.equals(clxt.GOOGLE_TOS_CONSENTED) ? 3 : 2;
        ezbxVar.copyOnWrite();
        ezca ezcaVar4 = (ezca) ezbxVar.instance;
        ezcaVar4.e = i2 - 1;
        ezcaVar4.b |= 32;
        ezbxVar.copyOnWrite();
        ezca ezcaVar5 = (ezca) ezbxVar.instance;
        ezcaVar5.g = ezesVar.f;
        ezcaVar5.b |= 256;
        ezbxVar.copyOnWrite();
        ezca ezcaVar6 = (ezca) ezbxVar.instance;
        ezcaVar6.b |= 128;
        ezcaVar6.f = z2;
        ezbxVar.copyOnWrite();
        ezca ezcaVar7 = (ezca) ezbxVar.instance;
        ezcaVar7.b |= 2048;
        ezcaVar7.j = z;
        if (ezesVar.equals(ezes.LEGAL_FYI_SEEN) && cmemVar.equals(cmem.LEGAL_FYI_SEEN)) {
            ezbxVar.copyOnWrite();
            ezca ezcaVar8 = (ezca) ezbxVar.instance;
            ezcaVar8.e = 1;
            ezcaVar8.b |= 32;
        }
        if (djai.M() && z4) {
            ezbxVar.copyOnWrite();
            ezca ezcaVar9 = (ezca) ezbxVar.instance;
            ezcaVar9.e = 3;
            ezcaVar9.b |= 32;
        }
        if (th != null) {
            ezfe E = E(th);
            ezbxVar.copyOnWrite();
            ezca ezcaVar10 = (ezca) ezbxVar.instance;
            E.getClass();
            ezcaVar10.i = E;
            ezcaVar10.b |= 1024;
        }
        ezbo ezboVar = (ezbo) ezcb.a.createBuilder();
        ezca ezcaVar11 = (ezca) ezbxVar.build();
        ezboVar.copyOnWrite();
        ezcb ezcbVar = (ezcb) ezboVar.instance;
        ezcaVar11.getClass();
        ezcbVar.t = ezcaVar11;
        ezcbVar.b |= 65536;
        C(context, (ezcb) ezboVar.build(), str);
    }
}
