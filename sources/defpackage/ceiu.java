package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceiu extends ffhv implements ffjm {
    final /* synthetic */ ceiw a;
    final /* synthetic */ Integer b;
    final /* synthetic */ Integer c;
    final /* synthetic */ Integer d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceiu(ffgu ffguVar, ceiw ceiwVar, Integer num, Integer num2, Integer num3) {
        super(2, ffguVar);
        this.a = ceiwVar;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceiu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [comc, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffbz ffbzVar = ceiw.a;
        axkm axkmVar = this.a.c;
        Integer num = this.b;
        num.getClass();
        final int intValue = num.intValue();
        Integer num2 = this.c;
        num2.getClass();
        final int intValue2 = num2.intValue();
        Integer num3 = this.d;
        num3.getClass();
        final int intValue3 = num3.intValue();
        efbd.b();
        axkmVar.e.get().m(new emwl() { // from class: axff
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj2).toBuilder();
                axky axkyVar = ((axez) builder.instance).C;
                if (axkyVar == null) {
                    axkyVar = axky.a;
                }
                int i = intValue3;
                int i2 = intValue2;
                int i3 = intValue;
                axkx axkxVar = (axkx) axkyVar.toBuilder();
                axkxVar.copyOnWrite();
                axky axkyVar2 = (axky) axkxVar.instance;
                axkyVar2.b |= 1024;
                axkyVar2.k = i3;
                axkxVar.copyOnWrite();
                axky axkyVar3 = (axky) axkxVar.instance;
                axkyVar3.b |= 64;
                axkyVar3.g = i2;
                axkxVar.copyOnWrite();
                axky axkyVar4 = (axky) axkxVar.instance;
                axkyVar4.b |= 1;
                axkyVar4.c = i;
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axky axkyVar5 = (axky) axkxVar.build();
                axkyVar5.getClass();
                axezVar.C = axkyVar5;
                axezVar.b |= 1073741824;
                return builder.build();
            }
        });
        axkmVar.N();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceiu ceiuVar = new ceiu(ffguVar, this.a, this.b, this.c, this.d);
        ceiuVar.e = obj;
        return ceiuVar;
    }
}
