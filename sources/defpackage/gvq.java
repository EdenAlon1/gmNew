package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvq extends ffkk implements ffji {
    public static final gvq a = new gvq();

    public gvq() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        return new gvr(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
    }
}
