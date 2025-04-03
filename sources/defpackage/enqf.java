package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enqf extends enqs {
    final /* synthetic */ enqg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enqf(enqg enqgVar, Iterator it) {
        super(it);
        this.a = enqgVar;
    }

    @Override // defpackage.enqs
    public final /* synthetic */ Object a(Object obj) {
        return new enqe(this, (Map.Entry) obj);
    }
}
