package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diog extends diod {
    public static final /* synthetic */ int d = 0;
    private final dikt g;
    static final diyy c = diyv.b("enable_logging_preferred_service");
    private static final enhk e = enhk.l("+g.gsma.rcs.isbot", eyxj.RCS_RBM_BOT_CAPABILITY);
    private static final enhk f = enhk.n("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session", eyxl.CPM_SESSION_SERVICE, "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.msg", eyxl.CPM_PAGER_MODE_SERVICE, "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.largemsg", eyxl.CPM_LARGE_MESSAGE_MODE_SERVICE);

    public diog(Context context, dikt diktVar) {
        super(context);
        this.g = diktVar;
    }

    public static String d(eenj eenjVar) {
        Iterator it = eenjVar.o().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            eenh eenhVar = (eenh) it.next();
            if (dktk.e(eenhVar.b, "message/cpim")) {
                try {
                    return edzi.b(eenhVar.a).g("urn:ietf:params:imdn", "Message-ID");
                } catch (Exception e2) {
                    dkty.i(e2, "Failed to parse CPIM msg to get IMDN msg ID!", new Object[0]);
                }
            }
        }
        return null;
    }

    @Override // defpackage.diod
    public final void a(String str, String str2, int i, int i2, boolean z) {
        int i3;
        eyrd eyrdVar = (eyrd) eyrf.a.createBuilder();
        eyrdVar.copyOnWrite();
        eyrf eyrfVar = (eyrf) eyrdVar.instance;
        eyrfVar.b |= 1;
        eyrfVar.c = str;
        eyrdVar.copyOnWrite();
        eyrf eyrfVar2 = (eyrf) eyrdVar.instance;
        eyrfVar2.b |= 2;
        eyrfVar2.d = str2;
        int i4 = 10;
        switch (i) {
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
            default:
                i3 = 1;
                break;
            case 5:
                i3 = 6;
                break;
            case 6:
                i3 = 7;
                break;
            case 7:
                i3 = 8;
                break;
            case 8:
                i3 = 9;
                break;
            case 9:
                i3 = 10;
                break;
        }
        eyrdVar.copyOnWrite();
        eyrf eyrfVar3 = (eyrf) eyrdVar.instance;
        eyrfVar3.f = i3 - 1;
        eyrfVar3.b |= 64;
        switch (i2) {
            case 1:
                i4 = 2;
                break;
            case 2:
                i4 = 3;
                break;
            case 3:
                i4 = 4;
                break;
            case 4:
                i4 = 5;
                break;
            case 5:
                i4 = 6;
                break;
            case 6:
                i4 = 7;
                break;
            case 7:
                i4 = 8;
                break;
            case 8:
                i4 = 9;
                break;
            case 9:
                break;
            case 10:
                i4 = 11;
                break;
            case 11:
                i4 = 12;
                break;
            case 12:
                i4 = 13;
                break;
            case 13:
                i4 = 14;
                break;
            case 14:
                i4 = 15;
                break;
            case 15:
                i4 = 16;
                break;
            case 16:
                i4 = 17;
                break;
            case 17:
                i4 = 18;
                break;
            case 18:
                i4 = 19;
                break;
            case 19:
                i4 = 20;
                break;
            case 20:
                i4 = 21;
                break;
            case 21:
                i4 = 22;
                break;
            case 22:
                i4 = 23;
                break;
            case 23:
                i4 = 24;
                break;
            case 24:
                i4 = 25;
                break;
            case 25:
                i4 = 26;
                break;
            case 26:
                i4 = 27;
                break;
            case 27:
                i4 = 28;
                break;
            case 28:
                i4 = 29;
                break;
            case 29:
                i4 = 30;
                break;
            case 30:
                i4 = 31;
                break;
            case 31:
                i4 = 32;
                break;
            case 32:
                i4 = 33;
                break;
            case 33:
                i4 = 34;
                break;
            case 34:
                i4 = 35;
                break;
            case 35:
                i4 = 36;
                break;
            case 36:
                i4 = 37;
                break;
            case 37:
                i4 = 38;
                break;
            case 38:
                i4 = 39;
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                i4 = 40;
                break;
            case 40:
                i4 = 41;
                break;
            case 41:
                i4 = 42;
                break;
            case 42:
                i4 = 43;
                break;
            case 43:
                i4 = 44;
                break;
            case 44:
                i4 = 45;
                break;
            case 45:
                i4 = 46;
                break;
            case 46:
                i4 = 47;
                break;
            case 47:
                i4 = 48;
                break;
            case 48:
                i4 = 49;
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                i4 = 50;
                break;
            case 50:
                i4 = 51;
                break;
            case 51:
                i4 = 52;
                break;
            case 52:
                i4 = 53;
                break;
            case 53:
                i4 = 54;
                break;
            case 54:
                i4 = 55;
                break;
            case 55:
                i4 = 56;
                break;
            case 56:
                i4 = 57;
                break;
            case 57:
                i4 = 58;
                break;
            case 58:
                i4 = 59;
                break;
            case 59:
                i4 = 60;
                break;
            case 60:
                i4 = 61;
                break;
            case 61:
                i4 = 62;
                break;
            case 62:
                i4 = 63;
                break;
            case 63:
                i4 = 64;
                break;
            case 64:
                i4 = 65;
                break;
            case 65:
                i4 = 66;
                break;
            case 66:
                i4 = 67;
                break;
            case 67:
            default:
                i4 = 1;
                break;
            case 68:
                i4 = 69;
                break;
            case 69:
                i4 = 70;
                break;
            case 70:
                i4 = 71;
                break;
        }
        eyrdVar.copyOnWrite();
        eyrf eyrfVar4 = (eyrf) eyrdVar.instance;
        eyrfVar4.g = i4 - 1;
        eyrfVar4.b |= 128;
        int i5 = true == z ? 3 : 2;
        eyrdVar.copyOnWrite();
        eyrf eyrfVar5 = (eyrf) eyrdVar.instance;
        eyrfVar5.e = i5 - 1;
        eyrfVar5.b |= 4;
        this.g.d(this.a, (eyrf) eyrdVar.build());
    }

    @Override // defpackage.diod
    public final void b(String str, int i) {
        eyrd eyrdVar = (eyrd) eyrf.a.createBuilder();
        eyrdVar.copyOnWrite();
        eyrf eyrfVar = (eyrf) eyrdVar.instance;
        eyrfVar.b |= 2;
        eyrfVar.d = str;
        eyrdVar.copyOnWrite();
        eyrf eyrfVar2 = (eyrf) eyrdVar.instance;
        eyrfVar2.b |= 1;
        eyrfVar2.c = str;
        eyrdVar.copyOnWrite();
        eyrf eyrfVar3 = (eyrf) eyrdVar.instance;
        eyrfVar3.h = i - 1;
        eyrfVar3.b |= 512;
        this.g.d(this.a, (eyrf) eyrdVar.build());
    }

    @Override // defpackage.diod
    public final void c(eenj eenjVar, Optional optional, int i, int i2, eeno eenoVar) {
        int i3;
        int a;
        String j;
        final eyxh eyxhVar = (eyxh) eyxm.a.createBuilder();
        int a2 = eenjVar.a();
        eyxhVar.copyOnWrite();
        eyxm eyxmVar = (eyxm) eyxhVar.instance;
        eyxmVar.b |= 64;
        eyxmVar.i = a2;
        long micros = TimeUnit.MILLISECONDS.toMicros(Calendar.getInstance().getTimeInMillis());
        eyxhVar.copyOnWrite();
        eyxm eyxmVar2 = (eyxm) eyxhVar.instance;
        eyxmVar2.b |= 1;
        eyxmVar2.c = micros;
        int E = dkut.E(eenjVar);
        eyxhVar.copyOnWrite();
        eyxm eyxmVar3 = (eyxm) eyxhVar.instance;
        eyxmVar3.f = E - 1;
        eyxmVar3.b |= 8;
        eyxhVar.copyOnWrite();
        eyxm eyxmVar4 = (eyxm) eyxhVar.instance;
        eyxmVar4.d = i - 1;
        eyxmVar4.b |= 2;
        String d2 = eenjVar.d();
        if (d2 != null) {
            eyxhVar.copyOnWrite();
            eyxm eyxmVar5 = (eyxm) eyxhVar.instance;
            eyxmVar5.b |= 512;
            eyxmVar5.l = d2;
        }
        String d3 = d(eenjVar);
        String str = null;
        if (d3 == null) {
            d3 = (String) optional.map(new Function() { // from class: diof
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return diog.d((eenj) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null);
        }
        if (d3 != null) {
            eyxhVar.copyOnWrite();
            eyxm eyxmVar6 = (eyxm) eyxhVar.instance;
            eyxmVar6.b |= 4096;
            eyxmVar6.n = d3;
        }
        final String e2 = eenjVar.e();
        if (e2 != null) {
            Map.EL.forEach(e, new BiConsumer() { // from class: dioe
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    eyxj eyxjVar = (eyxj) obj2;
                    int i4 = diog.d;
                    if (e2.contains((String) obj)) {
                        eyxh eyxhVar2 = eyxhVar;
                        eyxhVar2.copyOnWrite();
                        eyxm eyxmVar7 = (eyxm) eyxhVar2.instance;
                        eyxm eyxmVar8 = eyxm.a;
                        eyxjVar.getClass();
                        eygi eygiVar = eyxmVar7.s;
                        if (!eygiVar.c()) {
                            eyxmVar7.s = eyfy.mutableCopy(eygiVar);
                        }
                        eyxmVar7.s.h(eyxjVar.B);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
        }
        if (eenjVar instanceof eenk) {
            eyxhVar.copyOnWrite();
            eyxm eyxmVar7 = (eyxm) eyxhVar.instance;
            eyxmVar7.e = 1;
            eyxmVar7.b |= 4;
        } else {
            eenl eenlVar = (eenl) eenjVar;
            eyxhVar.copyOnWrite();
            eyxm eyxmVar8 = (eyxm) eyxhVar.instance;
            eyxmVar8.e = 2;
            eyxmVar8.b |= 4;
            int y = eenlVar.y();
            eyxhVar.copyOnWrite();
            eyxm eyxmVar9 = (eyxm) eyxhVar.instance;
            eyxmVar9.b |= 16;
            eyxmVar9.g = y;
            String A = eenlVar.A();
            eyxhVar.copyOnWrite();
            eyxm eyxmVar10 = (eyxm) eyxhVar.instance;
            A.getClass();
            eyxmVar10.b |= 32;
            eyxmVar10.h = A;
            int a3 = eeni.a(eenlVar);
            if (a3 != 0) {
                eyxhVar.copyOnWrite();
                eyxm eyxmVar11 = (eyxm) eyxhVar.instance;
                eyxmVar11.b |= 256;
                eyxmVar11.k = a3;
            }
            if (((Boolean) dkur.a.a()).booleanValue() && (i3 = eenlVar.z().m) != 0) {
                eyxe eyxeVar = (eyxe) eyxg.a.createBuilder();
                eyxeVar.copyOnWrite();
                eyxg eyxgVar = (eyxg) eyxeVar.instance;
                eyxgVar.c = i3 - 1;
                eyxgVar.b |= 1;
                eyxg eyxgVar2 = (eyxg) eyxeVar.build();
                eyxhVar.copyOnWrite();
                eyxm eyxmVar12 = (eyxm) eyxhVar.instance;
                eyxgVar2.getClass();
                eyxmVar12.r = eyxgVar2;
                eyxmVar12.b |= 524288;
            }
        }
        eyxhVar.copyOnWrite();
        eyxm eyxmVar13 = (eyxm) eyxhVar.instance;
        eyxmVar13.o = i2 - 1;
        eyxmVar13.b |= 8192;
        String j2 = eenjVar.j("X-Google-Event-Id");
        if (j2 != null) {
            eyxhVar.copyOnWrite();
            eyxm eyxmVar14 = (eyxm) eyxhVar.instance;
            eyxmVar14.b |= 2048;
            eyxmVar14.m = j2;
        }
        eeku d4 = eenjVar.a.d("Reason");
        if (d4 != null) {
            String a4 = d4.a();
            eyxhVar.copyOnWrite();
            eyxm eyxmVar15 = (eyxm) eyxhVar.instance;
            a4.getClass();
            eyxmVar15.b |= 128;
            eyxmVar15.j = a4;
        }
        int i4 = ((eyxm) eyxhVar.instance).f;
        int a5 = evkc.a(i4);
        if (((a5 != 0 && a5 == 6) || ((a = evkc.a(i4)) != 0 && a == 12)) && eenjVar.v("Contact")) {
            try {
                eekk b = eenjVar.b();
                if (b != null) {
                    str = b.e();
                }
                if (!Objects.isNull(b) && !Objects.isNull(str)) {
                    int parseInt = Integer.parseInt(str);
                    eyxhVar.copyOnWrite();
                    eyxm eyxmVar16 = (eyxm) eyxhVar.instance;
                    eyxmVar16.b |= 65536;
                    eyxmVar16.q = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
        }
        eysr eysrVar = (eysr) eyss.a.createBuilder();
        String f2 = eenoVar.f();
        eysrVar.copyOnWrite();
        eyss eyssVar = (eyss) eysrVar.instance;
        eyssVar.b |= 1;
        eyssVar.c = f2;
        int b2 = eenoVar.b();
        eysrVar.copyOnWrite();
        eyss eyssVar2 = (eyss) eysrVar.instance;
        eyssVar2.b |= 2;
        eyssVar2.d = b2;
        int i5 = true != eenoVar.n() ? 4 : 3;
        eysrVar.copyOnWrite();
        eyss eyssVar3 = (eyss) eysrVar.instance;
        eyssVar3.f = i5 - 1;
        eyssVar3.b |= 8;
        eenoVar.c();
        String c2 = eenoVar.c();
        eysrVar.copyOnWrite();
        eyss eyssVar4 = (eyss) eysrVar.instance;
        eyssVar4.b = 4 | eyssVar4.b;
        eyssVar4.e = c2;
        eyxhVar.copyOnWrite();
        eyxm eyxmVar17 = (eyxm) eyxhVar.instance;
        eyss eyssVar5 = (eyss) eysrVar.build();
        eyssVar5.getClass();
        eyxmVar17.p = eyssVar5;
        eyxmVar17.b |= 16384;
        if (((Boolean) c.a()).booleanValue() && (j = eenjVar.j("P-Preferred-Service")) != null) {
            eyxl eyxlVar = (eyxl) f.getOrDefault(j, eyxl.UNEXPECTED_SERVICE);
            eyxhVar.copyOnWrite();
            eyxm eyxmVar18 = (eyxm) eyxhVar.instance;
            eyxmVar18.t = eyxlVar.f;
            eyxmVar18.b |= 4194304;
        }
        eyxm eyxmVar19 = (eyxm) eyxhVar.build();
        dikt diktVar = this.g;
        Context context = this.a;
        ezfn ezfnVar = (ezfn) ezfo.a.createBuilder();
        ezfnVar.copyOnWrite();
        ezfo ezfoVar = (ezfo) ezfnVar.instance;
        eyxmVar19.getClass();
        ezfoVar.d = eyxmVar19;
        ezfoVar.c = 2;
        diktVar.i(context, ezfnVar, ezee.SIP_EVENT);
    }
}
