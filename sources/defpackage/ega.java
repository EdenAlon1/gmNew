package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ega extends ego {
    final /* synthetic */ ejq a;
    final /* synthetic */ ehh b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ega(eft eftVar, ejq ejqVar, int i, ehh ehhVar, int i2, int i3, long j) {
        super(eftVar, ejqVar, i);
        this.a = ejqVar;
        this.b = ehhVar;
        this.c = i2;
        this.d = i3;
        this.e = j;
    }

    @Override // defpackage.ego
    public final egn a(int i, Object obj, int i2, int i3, List list, long j, int i4, int i5) {
        kah q = this.a.q();
        int i6 = this.c;
        ehh ehhVar = this.b;
        return new egn(i, obj, i2, i3, q, i6, this.d, list, this.e, ehhVar.j, j, i4, i5);
    }
}
