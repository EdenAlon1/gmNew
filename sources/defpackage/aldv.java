package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aldv extends ffhv implements ffjm {
    final /* synthetic */ aldw a;
    final /* synthetic */ eppr b;
    final /* synthetic */ Integer c;
    final /* synthetic */ Integer d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldv(aldw aldwVar, int i, eppr epprVar, Integer num, Integer num2, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aldwVar;
        this.e = i;
        this.b = epprVar;
        this.c = num;
        this.d = num2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aldv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final int i = this.e;
        final eppr epprVar = this.b;
        final Integer num = this.c;
        aldw aldwVar = this.a;
        final Integer num2 = this.d;
        ekzz f = eleg.f("AttachmentEventLogger.logAttachmentEvent");
        try {
            aldwVar.o(new Supplier() { // from class: aldu
                @Override // java.util.function.Supplier
                public final Object get() {
                    eppo eppoVar = (eppo) eppp.a.createBuilder();
                    eppoVar.getClass();
                    eppoVar.copyOnWrite();
                    eppp epppVar = (eppp) eppoVar.instance;
                    epppVar.c = i - 1;
                    epppVar.b |= 1;
                    eppoVar.copyOnWrite();
                    eppp epppVar2 = (eppp) eppoVar.instance;
                    epppVar2.d = epprVar;
                    epppVar2.b |= 2;
                    Integer num3 = num;
                    if (num3 != null) {
                        int intValue = num3.intValue();
                        eppoVar.copyOnWrite();
                        eppp epppVar3 = (eppp) eppoVar.instance;
                        epppVar3.b |= 4;
                        epppVar3.e = intValue;
                    }
                    Integer num4 = num2;
                    if (num4 != null) {
                        int intValue2 = num4.intValue();
                        eppoVar.copyOnWrite();
                        eppp epppVar4 = (eppp) eppoVar.instance;
                        epppVar4.b |= 8;
                        epppVar4.f = intValue2;
                    }
                    eyfy build = eppoVar.build();
                    build.getClass();
                    return (eppp) build;
                }
            });
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aldv(this.a, this.e, this.b, this.c, this.d, ffguVar);
    }
}
