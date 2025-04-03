package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceav implements ceac {
    public static final cskc a = cskc.g("BugleCms", "CmsResetBoxStep");
    public static final cskc b = cskc.g("BugleCmsFolsom", "CmsResetBoxStep");
    public static final entd c = entd.c("BugleCms");
    public final axld d;
    public final crty e;
    public final axkm f;
    public final errl g;
    public final errl h;
    private final aszs i;

    public ceav(axld axldVar, crty crtyVar, axkm axkmVar, aszs aszsVar, errl errlVar, errl errlVar2) {
        this.d = axldVar;
        this.e = crtyVar;
        this.f = axkmVar;
        this.i = aszsVar;
        this.g = errlVar;
        this.h = errlVar2;
    }

    @Override // defpackage.ceac
    public final elfl a(int i, ceal cealVar) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [comc, java.lang.Object] */
    public final void b() {
        if (!this.i.a()) {
            ((ensz) ((ensz) c.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsResetBoxStep", "cleanupBnrData", 149, "CmsResetBoxStep.java")).q("Deleting device user id from BugleDb");
            this.f.C(new Function() { // from class: axfo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    axep axepVar = (axep) obj;
                    axepVar.copyOnWrite();
                    axez axezVar = (axez) axepVar.instance;
                    axez axezVar2 = axez.a;
                    axezVar.c &= -4097;
                    axezVar.Q = axez.a.Q;
                    return axepVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        if (((Boolean) ((cfup) csgj.Y.get()).e()).booleanValue()) {
            axkm axkmVar = this.f;
            efbd.b();
            axkmVar.e.get().m(new emwl() { // from class: axgb
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cskc cskcVar = axkm.a;
                    axep builder = ((axez) obj).toBuilder();
                    builder.copyOnWrite();
                    axez axezVar = (axez) builder.instance;
                    axezVar.S = null;
                    axezVar.c &= -16385;
                    return builder.build();
                }
            });
        }
    }
}
