package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eha extends ffkk implements ffji {
    public static final eha a = new eha();

    public eha() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        return new ehh(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }
}
