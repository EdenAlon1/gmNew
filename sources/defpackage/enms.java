package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
enum enms implements emwl {
    KEY,
    VALUE;

    @Override // defpackage.emwl
    public final /* synthetic */ Object apply(Object obj) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return ((Map.Entry) obj).getKey();
        }
        if (ordinal == 1) {
            return ((Map.Entry) obj).getValue();
        }
        throw null;
    }
}
