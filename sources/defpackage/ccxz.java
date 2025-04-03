package defpackage;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccxz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccyb b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxz(ccyb ccybVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ccybVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ccyb ccybVar = this.b;
            final int size = this.c.size();
            final axkm axkmVar = ccybVar.b;
            elfl A = axkmVar.A(new Function() { // from class: axgy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    final axep axepVar = (axep) obj2;
                    dtuu dtuuVar = (dtuu) axkm.this.h.b();
                    final int i2 = size;
                    dtuuVar.d("CmsSettingsDataService#incrementInitialSyncProgressDataParticipantsBackedUpCount", new Runnable() { // from class: axim
                        @Override // java.lang.Runnable
                        public final void run() {
                            cskc cskcVar = axkm.a;
                            axep axepVar2 = axep.this;
                            axky axkyVar = ((axez) axepVar2.instance).C;
                            if (axkyVar == null) {
                                axkyVar = axky.a;
                            }
                            int i3 = i2;
                            axkx axkxVar = (axkx) axkyVar.toBuilder();
                            int i4 = axkyVar.n + i3;
                            axkxVar.copyOnWrite();
                            axky axkyVar2 = (axky) axkxVar.instance;
                            axkyVar2.b |= 8192;
                            axkyVar2.n = i4;
                            axepVar2.copyOnWrite();
                            axez axezVar = (axez) axepVar2.instance;
                            axky axkyVar3 = (axky) axkxVar.build();
                            axkyVar3.getClass();
                            axezVar.C = axkyVar3;
                            axezVar.b |= 1073741824;
                        }
                    });
                    return axepVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            this.a = 1;
            if (fgfz.c(A, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccxz(this.b, this.c, ffguVar);
    }
}
