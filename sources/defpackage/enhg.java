package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enhg extends enci {
    final /* synthetic */ Map.Entry a;

    public enhg(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return new enpx(this.a.getValue());
    }
}
