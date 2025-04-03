package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enmp extends enci {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ enmu b;

    public enmp(Map.Entry entry, enmu enmuVar) {
        this.a = entry;
        this.b = enmuVar;
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        return this.b.a(entry.getKey(), entry.getValue());
    }
}
