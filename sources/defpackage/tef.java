package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tef implements Function {
    public static esxf a(axes axesVar) {
        int ordinal = axesVar.ordinal();
        if (ordinal == 0) {
            return esxf.ENCRYPTION_STATE_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return esxf.ENCRYPTION_STATE_ENCRYPTED;
        }
        if (ordinal == 2) {
            return esxf.ENCRYPTION_STATE_NOT_ENCRYPTED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(axesVar))));
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
