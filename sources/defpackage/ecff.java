package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecff implements ecep {
    final /* synthetic */ eceh a;
    final /* synthetic */ ecfg b;

    public ecff(ecfg ecfgVar, eceh ecehVar) {
        this.a = ecehVar;
        this.b = ecfgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecep
    public final boolean a(ecea eceaVar) {
        int i = 0;
        if (!((Boolean) this.b.c.b()).booleanValue()) {
            return false;
        }
        while (true) {
            if (i >= ((ecel) eceaVar.instance).e.size()) {
                i = -1;
                break;
            }
            if (((ecec) ((ecel) eceaVar.instance).e.get(i)).b == 3) {
                break;
            }
            i++;
        }
        if (i != -1) {
            eceaVar.copyOnWrite();
            ecel ecelVar = (ecel) eceaVar.instance;
            ecelVar.a();
            ecelVar.e.remove(i);
        }
        ecef ecefVar = (ecef) ecei.a.createBuilder();
        eceh ecehVar = this.a;
        ecefVar.copyOnWrite();
        ecei eceiVar = (ecei) ecefVar.instance;
        eceiVar.e = ecehVar.d;
        eceiVar.b |= 2;
        eyja b = eykj.b(this.b.b.f());
        ecefVar.copyOnWrite();
        ecei eceiVar2 = (ecei) ecefVar.instance;
        b.getClass();
        eceiVar2.d = b;
        eceiVar2.b |= 1;
        ecfg ecfgVar = this.b;
        Stream map = Collection.EL.stream(((elkj) ((emxn) ecfgVar.a).a).a.a()).map(new elki());
        int i2 = engw.d;
        for (fgom fgomVar : ecfn.a((List) Collection.EL.stream((engw) map.collect(endq.a)).map(new Function() { // from class: ecfh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ecfk.c((fgom) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a), ((Long) ecfgVar.d.b()).longValue(), ((Long) ecfgVar.e.b()).longValue())) {
            fgrh fgrhVar = (fgrh) fgri.a.createBuilder();
            fgrhVar.copyOnWrite();
            fgri fgriVar = (fgri) fgrhVar.instance;
            fgomVar.getClass();
            fgriVar.d = fgomVar;
            fgriVar.c = 1;
            fgrd fgrdVar = (fgrd) fgrg.a.createBuilder();
            fgrdVar.copyOnWrite();
            fgrg.a((fgrg) fgrdVar.instance);
            fgrg fgrgVar = (fgrg) fgrdVar.build();
            fgrhVar.copyOnWrite();
            fgri fgriVar2 = (fgri) fgrhVar.instance;
            fgrgVar.getClass();
            fgriVar2.e = fgrgVar;
            fgriVar2.b |= 1;
            ecefVar.copyOnWrite();
            ecei eceiVar3 = (ecei) ecefVar.instance;
            fgri fgriVar3 = (fgri) fgrhVar.build();
            fgriVar3.getClass();
            eygr eygrVar = eceiVar3.c;
            if (!eygrVar.c()) {
                eceiVar3.c = eyfy.mutableCopy(eygrVar);
            }
            eceiVar3.c.add(fgriVar3);
        }
        eceb ecebVar = (eceb) ecec.a.createBuilder();
        ecei eceiVar4 = (ecei) ecefVar.build();
        ecebVar.copyOnWrite();
        ecec ececVar = (ecec) ecebVar.instance;
        eceiVar4.getClass();
        ececVar.c = eceiVar4;
        ececVar.b = 3;
        eceaVar.a(ecebVar);
        return true;
    }
}
