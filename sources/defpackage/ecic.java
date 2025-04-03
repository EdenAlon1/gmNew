package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecic extends ecid {
    public static final ecic a = new ecic();

    private ecic() {
    }

    @Override // defpackage.ecid
    public final /* synthetic */ eyhs a(String str, Object obj) {
        HealthStats m93m = afg$$ExternalSyntheticApiModelOutline0.m93m(obj);
        fglj fgljVar = (fglj) fglk.a.createBuilder();
        long a2 = ecig.a(m93m, 30001);
        if (a2 != 0) {
            fgljVar.copyOnWrite();
            fglk fglkVar = (fglk) fgljVar.instance;
            fglkVar.b |= 1;
            fglkVar.c = a2;
        }
        long a3 = ecig.a(m93m, 30002);
        if (a3 != 0) {
            fgljVar.copyOnWrite();
            fglk fglkVar2 = (fglk) fgljVar.instance;
            fglkVar2.b |= 2;
            fglkVar2.d = a3;
        }
        long a4 = ecig.a(m93m, 30003);
        if (a4 != 0) {
            fgljVar.copyOnWrite();
            fglk fglkVar3 = (fglk) fgljVar.instance;
            fglkVar3.b |= 4;
            fglkVar3.e = a4;
        }
        long a5 = ecig.a(m93m, 30004);
        if (a5 != 0) {
            fgljVar.copyOnWrite();
            fglk fglkVar4 = (fglk) fgljVar.instance;
            fglkVar4.b |= 8;
            fglkVar4.f = a5;
        }
        long a6 = ecig.a(m93m, 30005);
        if (a6 != 0) {
            fgljVar.copyOnWrite();
            fglk fglkVar5 = (fglk) fgljVar.instance;
            fglkVar5.b |= 16;
            fglkVar5.g = a6;
        }
        long a7 = ecig.a(m93m, 30006);
        if (a7 != 0) {
            fgljVar.copyOnWrite();
            fglk fglkVar6 = (fglk) fgljVar.instance;
            fglkVar6.b |= 32;
            fglkVar6.h = a7;
        }
        if (str != null) {
            fgle d = ecig.d(str);
            fgljVar.copyOnWrite();
            fglk fglkVar7 = (fglk) fgljVar.instance;
            d.getClass();
            fglkVar7.i = d;
            fglkVar7.b |= 64;
        }
        fglk fglkVar8 = (fglk) fgljVar.build();
        if (ecig.j(fglkVar8)) {
            return null;
        }
        return fglkVar8;
    }

    @Override // defpackage.ecid
    public final /* synthetic */ eyhs b(eyhs eyhsVar, eyhs eyhsVar2) {
        fglk fglkVar = (fglk) eyhsVar;
        fglk fglkVar2 = (fglk) eyhsVar2;
        if (fglkVar == null || fglkVar2 == null) {
            return fglkVar;
        }
        fglj fgljVar = (fglj) fglk.a.createBuilder();
        if ((fglkVar.b & 1) != 0) {
            long j = fglkVar.c - fglkVar2.c;
            if (j != 0) {
                fgljVar.copyOnWrite();
                fglk fglkVar3 = (fglk) fgljVar.instance;
                fglkVar3.b |= 1;
                fglkVar3.c = j;
            }
        }
        if ((fglkVar.b & 2) != 0) {
            long j2 = fglkVar.d - fglkVar2.d;
            if (j2 != 0) {
                fgljVar.copyOnWrite();
                fglk fglkVar4 = (fglk) fgljVar.instance;
                fglkVar4.b |= 2;
                fglkVar4.d = j2;
            }
        }
        if ((fglkVar.b & 4) != 0) {
            long j3 = fglkVar.e - fglkVar2.e;
            if (j3 != 0) {
                fgljVar.copyOnWrite();
                fglk fglkVar5 = (fglk) fgljVar.instance;
                fglkVar5.b |= 4;
                fglkVar5.e = j3;
            }
        }
        if ((fglkVar.b & 8) != 0) {
            long j4 = fglkVar.f - fglkVar2.f;
            if (j4 != 0) {
                fgljVar.copyOnWrite();
                fglk fglkVar6 = (fglk) fgljVar.instance;
                fglkVar6.b |= 8;
                fglkVar6.f = j4;
            }
        }
        if ((fglkVar.b & 16) != 0) {
            long j5 = fglkVar.g - fglkVar2.g;
            if (j5 != 0) {
                fgljVar.copyOnWrite();
                fglk fglkVar7 = (fglk) fgljVar.instance;
                fglkVar7.b |= 16;
                fglkVar7.g = j5;
            }
        }
        if ((fglkVar.b & 32) != 0) {
            long j6 = fglkVar.h - fglkVar2.h;
            if (j6 != 0) {
                fgljVar.copyOnWrite();
                fglk fglkVar8 = (fglk) fgljVar.instance;
                fglkVar8.b |= 32;
                fglkVar8.h = j6;
            }
        }
        fgle fgleVar = fglkVar.i;
        if (fgleVar == null) {
            fgleVar = fgle.a;
        }
        fgljVar.copyOnWrite();
        fglk fglkVar9 = (fglk) fgljVar.instance;
        fgleVar.getClass();
        fglkVar9.i = fgleVar;
        fglkVar9.b |= 64;
        fglk fglkVar10 = (fglk) fgljVar.build();
        if (ecig.j(fglkVar10)) {
            return null;
        }
        return fglkVar10;
    }

    @Override // defpackage.ecid
    public final /* bridge */ /* synthetic */ String c(eyhs eyhsVar) {
        fgle fgleVar = ((fglk) eyhsVar).i;
        if (fgleVar == null) {
            fgleVar = fgle.a;
        }
        return fgleVar.d;
    }
}
