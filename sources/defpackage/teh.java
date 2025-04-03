package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
class teh implements Function {
    public static esxi a(csgm csgmVar) {
        int ordinal = csgmVar.ordinal();
        if (ordinal == 0) {
            return esxi.FEATURE_TYPE_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return esxi.FEATURE_TYPE_MULTI_DEVICE;
        }
        if (ordinal == 2) {
            return esxi.FEATURE_TYPE_BACKUP_AND_RESTORE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(csgmVar))));
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        throw null;
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        throw null;
    }
}
