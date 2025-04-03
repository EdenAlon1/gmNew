package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erlg extends enfk {
    final /* synthetic */ Map.Entry a;

    public erlg(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.enfk
    protected final Map.Entry b() {
        return this.a;
    }

    @Override // defpackage.enfk, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return new erln((List) this.a.getValue());
    }

    @Override // defpackage.enfk, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.a;
    }
}
