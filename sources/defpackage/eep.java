package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eep extends ffkk implements ffji {
    public static final eep a = new eep();

    public eep() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        return new eey(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }
}
