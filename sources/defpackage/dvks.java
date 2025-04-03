package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvks implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        exyr exyrVar = (exyr) obj;
        int ordinal = exyrVar.ordinal();
        if (ordinal == 0) {
            return evsy.CONNECTIVITY_UNKNOWN;
        }
        if (ordinal == 1) {
            return evsy.OFFLINE;
        }
        if (ordinal == 2) {
            return evsy.ONLINE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(exyrVar))));
    }
}
