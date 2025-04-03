package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eocb extends enfo {
    private final emyl a;
    private final Set b;
    private final emyl c;

    public eocb(Set set, emyl emylVar, emyl emylVar2) {
        this.b = set;
        this.a = emylVar;
        this.c = emylVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.enfd, defpackage.enfm
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Set hC() {
        if (((Boolean) this.a.get()).booleanValue()) {
            return this.b;
        }
        throw new IllegalStateException((String) this.c.get());
    }

    @Override // defpackage.enfo, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.b.hashCode();
    }
}
