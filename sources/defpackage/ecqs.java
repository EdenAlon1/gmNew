package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecqs {
    public static fgnu a(fgnu fgnuVar, long j) {
        fgnt fgntVar = (fgnt) fgnuVar.toBuilder();
        fgnu fgnuVar2 = (fgnu) fgntVar.instance;
        if ((fgnuVar2.b & 2) != 0) {
            long j2 = fgnuVar2.d - j;
            fgntVar.copyOnWrite();
            fgnu fgnuVar3 = (fgnu) fgntVar.instance;
            fgnuVar3.b |= 2;
            fgnuVar3.d = j2;
        }
        fgnu fgnuVar4 = (fgnu) fgntVar.instance;
        if ((fgnuVar4.b & 4) != 0) {
            long j3 = fgnuVar4.e - j;
            fgntVar.copyOnWrite();
            fgnu fgnuVar5 = (fgnu) fgntVar.instance;
            fgnuVar5.b |= 4;
            fgnuVar5.e = j3;
        }
        fgnu fgnuVar6 = (fgnu) fgntVar.instance;
        if ((fgnuVar6.b & 8) != 0) {
            long j4 = fgnuVar6.f - j;
            fgntVar.copyOnWrite();
            fgnu fgnuVar7 = (fgnu) fgntVar.instance;
            fgnuVar7.b |= 8;
            fgnuVar7.f = j4;
        }
        return (fgnu) fgntVar.build();
    }
}
