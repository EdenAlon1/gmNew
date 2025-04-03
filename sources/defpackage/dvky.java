package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvky implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eyba eybaVar = (eyba) obj;
        int ordinal = eybaVar.ordinal();
        if (ordinal == 0) {
            return evza.UITHEME_DEFAULT;
        }
        if (ordinal == 1) {
            return evza.UITHEME_GOOGLE_MATERIAL;
        }
        if (ordinal == 2) {
            return evza.UITHEME_GOOGLE_MATERIAL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(eybaVar))));
    }
}
