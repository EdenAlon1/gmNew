package defpackage;

import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjph extends emwd {
    @Override // defpackage.emwd
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cjpo cjpoVar = (cjpo) obj;
        long j = cjpoVar.c;
        UUID fromString = UUID.fromString(cjpoVar.o);
        fromString.getClass();
        String str = cjpoVar.d;
        str.getClass();
        int i = cjpoVar.e;
        boolean z = cjpoVar.f;
        String str2 = cjpoVar.g;
        str2.getClass();
        int i2 = cjpoVar.h;
        String str3 = cjpoVar.i;
        str3.getClass();
        String str4 = cjpoVar.j;
        str4.getClass();
        boolean z2 = cjpoVar.k;
        String str5 = cjpoVar.l;
        str5.getClass();
        eyja eyjaVar = cjpoVar.m;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        eyjaVar.getClass();
        Instant d = eykn.d(eyjaVar);
        int a = eopm.a(cjpoVar.n);
        if (a == 0) {
            a = 1;
        }
        return new cjpe(j, fromString, new cjoy(str, i, z, str2, i2, str3, str4, z2, str5, d, a));
    }

    @Override // defpackage.emwd
    public final /* synthetic */ Object b(Object obj) {
        cjpg cjpgVar = (cjpg) obj;
        cjpe cjpeVar = cjpgVar instanceof cjpe ? (cjpe) cjpgVar : null;
        if (cjpeVar == null) {
            Class<?> cls = cjpgVar.getClass();
            int i = fflc.a;
            throw new cjlg(new ffkb(cjpe.class), new ffkb(cls));
        }
        cjpn cjpnVar = (cjpn) cjpo.a.createBuilder();
        cjpnVar.getClass();
        cjpnVar.copyOnWrite();
        ((cjpo) cjpnVar.instance).c = cjpeVar.a;
        cjpnVar.copyOnWrite();
        cjpo cjpoVar = (cjpo) cjpnVar.instance;
        cjoy cjoyVar = cjpeVar.c;
        cjpoVar.d = cjoyVar.a;
        cjpnVar.copyOnWrite();
        ((cjpo) cjpnVar.instance).e = cjoyVar.b;
        cjpnVar.copyOnWrite();
        ((cjpo) cjpnVar.instance).f = cjoyVar.c;
        cjpnVar.copyOnWrite();
        ((cjpo) cjpnVar.instance).g = cjoyVar.d;
        cjpnVar.copyOnWrite();
        ((cjpo) cjpnVar.instance).h = cjoyVar.e;
        cjpnVar.copyOnWrite();
        ((cjpo) cjpnVar.instance).i = cjoyVar.f;
        cjpnVar.copyOnWrite();
        ((cjpo) cjpnVar.instance).j = cjoyVar.g;
        cjpnVar.copyOnWrite();
        ((cjpo) cjpnVar.instance).k = cjoyVar.h;
        cjpnVar.copyOnWrite();
        ((cjpo) cjpnVar.instance).l = cjoyVar.i;
        eyja b = eykn.b(cjoyVar.j);
        cjpnVar.copyOnWrite();
        cjpo cjpoVar2 = (cjpo) cjpnVar.instance;
        cjpoVar2.m = b;
        cjpoVar2.b |= 1;
        cjpnVar.copyOnWrite();
        ((cjpo) cjpnVar.instance).n = cjoyVar.k - 1;
        String uuid = cjpeVar.b.toString();
        uuid.getClass();
        cjpnVar.copyOnWrite();
        ((cjpo) cjpnVar.instance).o = uuid;
        eyfy build = cjpnVar.build();
        build.getClass();
        return (cjpo) build;
    }
}
