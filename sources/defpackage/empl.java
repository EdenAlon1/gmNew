package defpackage;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empl {
    public static final fbxq a;
    public static final fbxq b;
    public static final Instant c;
    public final LocalDateTime d;
    public final LocalDateTime e;
    public final LocalDateTime f;
    public final Instant g;
    public final Instant h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    private final String l;
    private final String m;
    private final float n;

    static {
        fbxp fbxpVar = (fbxp) fbxq.a.createBuilder();
        fauo fauoVar = (fauo) fauq.a.createBuilder();
        fauoVar.copyOnWrite();
        ((fauq) fauoVar.instance).d = 1;
        fauoVar.copyOnWrite();
        ((fauq) fauoVar.instance).e = 1;
        fauoVar.copyOnWrite();
        ((fauq) fauoVar.instance).f = 1;
        fauoVar.copyOnWrite();
        ((fauq) fauoVar.instance).g = 0;
        fauoVar.copyOnWrite();
        ((fauq) fauoVar.instance).h = 0;
        fauq fauqVar = (fauq) fauoVar.build();
        fbxpVar.copyOnWrite();
        fbxq fbxqVar = (fbxq) fbxpVar.instance;
        fauqVar.getClass();
        fbxqVar.c = fauqVar;
        fbxqVar.b |= 1;
        faus fausVar = faus.DAY_OF_WEEK_UNSPECIFIED;
        fbxpVar.copyOnWrite();
        ((fbxq) fbxpVar.instance).d = fausVar.a();
        a = (fbxq) fbxpVar.build();
        fbxp fbxpVar2 = (fbxp) fbxq.a.createBuilder();
        fauo fauoVar2 = (fauo) fauq.a.createBuilder();
        fauoVar2.copyOnWrite();
        ((fauq) fauoVar2.instance).d = 9999;
        fauoVar2.copyOnWrite();
        ((fauq) fauoVar2.instance).e = 12;
        fauoVar2.copyOnWrite();
        ((fauq) fauoVar2.instance).f = 31;
        fauoVar2.copyOnWrite();
        ((fauq) fauoVar2.instance).g = 23;
        fauoVar2.copyOnWrite();
        ((fauq) fauoVar2.instance).h = 59;
        fauq fauqVar2 = (fauq) fauoVar2.build();
        fbxpVar2.copyOnWrite();
        fbxq fbxqVar2 = (fbxq) fbxpVar2.instance;
        fauqVar2.getClass();
        fbxqVar2.c = fauqVar2;
        fbxqVar2.b |= 1;
        faus fausVar2 = faus.DAY_OF_WEEK_UNSPECIFIED;
        fbxpVar2.copyOnWrite();
        ((fbxq) fbxpVar2.instance).d = fausVar2.a();
        b = (fbxq) fbxpVar2.build();
        c = Instant.ofEpochMilli(-1L);
    }

    public empl(empk empkVar, LocalDateTime localDateTime) {
        int i;
        fauq fauqVar = empkVar.a.c;
        LocalDateTime a2 = favi.a(fauqVar == null ? fauq.a : fauqVar);
        this.d = a2;
        fauq fauqVar2 = empkVar.b.c;
        LocalDateTime a3 = favi.a(fauqVar2 == null ? fauq.a : fauqVar2);
        this.e = a3;
        this.f = localDateTime;
        this.l = empkVar.c;
        this.m = empkVar.d;
        this.j = empkVar.e;
        this.k = empkVar.f;
        this.n = empkVar.g;
        this.h = (a3.getYear() == 9999 && a3.getMonthValue() == 12 && a3.getDayOfMonth() == 31 && a3.getHour() == 23 && a3.getMinute() == 59) ? c : localDateTime.withHour(a3.getHour()).withMinute(a3.getMinute()).q(ZoneId.systemDefault()).toInstant();
        boolean z = true;
        this.g = (a2.getYear() == 1 && a2.getMonthValue() == 1 && a2.getDayOfMonth() == 1 && a2.getHour() == 0 && a2.getMinute() == 0) ? c : localDateTime.withHour(a2.getHour()).withMinute(a2.getMinute()).q(ZoneId.systemDefault()).toInstant();
        fbxq fbxqVar = empkVar.a;
        fbxq fbxqVar2 = empkVar.b;
        int i2 = fbxqVar.d;
        if (i2 == 0) {
            i2 = fbxqVar2.d != 0 ? 0 : i2;
            this.i = z;
        }
        if (i2 != 0 && (i = fbxqVar2.d) != 0) {
            int value = localDateTime.getDayOfWeek().getValue();
            if (i2 != i) {
            }
            this.i = z;
        }
        z = false;
        this.i = z;
    }

    public final fbxa a() {
        return b(this.h, null);
    }

    public final fbxa b(Instant instant, fbrm fbrmVar) {
        fbri fbriVar;
        fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
        if (this.j) {
            fbtk fbtkVar = (fbtk) fbtl.a.createBuilder();
            String str = this.l;
            fbtkVar.copyOnWrite();
            fbtl fbtlVar = (fbtl) fbtkVar.instance;
            str.getClass();
            fbtlVar.b = str;
            fbtl fbtlVar2 = (fbtl) fbtkVar.build();
            fbwzVar.copyOnWrite();
            fbxa fbxaVar = (fbxa) fbwzVar.instance;
            fbtlVar2.getClass();
            fbxaVar.d = fbtlVar2;
            fbxaVar.c = 13;
            fbriVar = fbri.EMOTION;
        } else {
            if (!this.k) {
                return (fbxa) fbwzVar.build();
            }
            fbxb fbxbVar = (fbxb) fbxc.a.createBuilder();
            String str2 = this.m;
            fbxbVar.copyOnWrite();
            fbxc fbxcVar = (fbxc) fbxbVar.instance;
            str2.getClass();
            fbxcVar.c = str2;
            fbwzVar.copyOnWrite();
            fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
            fbxc fbxcVar2 = (fbxc) fbxbVar.build();
            fbxcVar2.getClass();
            fbxaVar2.d = fbxcVar2;
            fbxaVar2.c = 2;
            fbriVar = fbri.FULL_MESSAGE;
        }
        fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
        long epochMilli = instant.toEpochMilli();
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).p = epochMilli;
        fbrd fbrdVar = fbrd.RECEIVED;
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).d = fbrdVar.a();
        float f = this.n;
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).f = f;
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).l = fbriVar.a();
        fbrg fbrgVar = fbrg.CONVERSATION_STARTER;
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).g = fbrgVar.a();
        if (fbrmVar != null) {
            fbwxVar.a(fbrmVar);
        }
        fbwzVar.copyOnWrite();
        fbxa fbxaVar3 = (fbxa) fbwzVar.instance;
        fbwy fbwyVar = (fbwy) fbwxVar.build();
        fbwyVar.getClass();
        fbxaVar3.e = fbwyVar;
        fbxaVar3.b |= 1;
        return (fbxa) fbwzVar.build();
    }
}
