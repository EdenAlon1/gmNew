package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clwk extends ffhv implements ffjm {
    final /* synthetic */ clwn a;
    final /* synthetic */ djrj b;
    final /* synthetic */ Integer c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clwk(clwn clwnVar, djrj djrjVar, Integer num, boolean z, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = clwnVar;
        this.b = djrjVar;
        this.c = num;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clwk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        eqya eqyaVar = (eqya) eqyb.a.createBuilder();
        eqyaVar.getClass();
        Integer num = this.c;
        if (num != null) {
            int intValue = num.intValue();
            eqyaVar.copyOnWrite();
            eqyb eqybVar = (eqyb) eqyaVar.instance;
            eqybVar.b |= 2;
            eqybVar.d = intValue;
        }
        boolean z = this.d;
        djrj djrjVar = this.b;
        eqyaVar.copyOnWrite();
        eqyb eqybVar2 = (eqyb) eqyaVar.instance;
        eqybVar2.b |= 4;
        eqybVar2.e = z;
        if (djrjVar != null) {
            String d = clwn.d(djrjVar);
            eqyaVar.copyOnWrite();
            eqyb eqybVar3 = (eqyb) eqyaVar.instance;
            eqybVar3.b |= 1;
            eqybVar3.c = d;
        }
        eyfy build = eqyaVar.build();
        build.getClass();
        int i = this.e;
        eqyb eqybVar4 = (eqyb) build;
        eqxx eqxxVar = (eqxx) eqyh.a.createBuilder();
        eqxxVar.getClass();
        eqyi.c(i, eqxxVar);
        int i2 = i - 1;
        if (i2 != 17) {
            switch (i2) {
                case 22:
                case 23:
                    break;
                case 24:
                    eqxxVar.copyOnWrite();
                    eqyh eqyhVar = (eqyh) eqxxVar.instance;
                    eqyhVar.f = eqybVar4;
                    eqyhVar.b |= 8192;
                    break;
                case 25:
                    eqyi.b(eqybVar4, eqxxVar);
                    break;
                case 26:
                    eqxxVar.copyOnWrite();
                    eqyh eqyhVar2 = (eqyh) eqxxVar.instance;
                    eqyhVar2.i = eqybVar4;
                    eqyhVar2.b |= 65536;
                    break;
                case 27:
                    eqyi.b(eqybVar4, eqxxVar);
                    break;
                case 28:
                    eqyi.b(eqybVar4, eqxxVar);
                    break;
                default:
                    Objects.toString(eqxz.a(i));
                    throw new IllegalArgumentException("Unsupported event type: ".concat(eqxz.a(i)));
            }
        } else {
            eqyi.b(eqybVar4, eqxxVar);
        }
        this.a.c(eqyi.a(eqxxVar));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new clwk(this.a, this.b, this.c, this.d, this.e, ffguVar);
    }
}
