package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egb extends egq {
    final /* synthetic */ egu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egb(egu eguVar, int i, int i2, ega egaVar, egy egyVar) {
        super(eguVar, i, i2, egaVar, egyVar);
        this.a = eguVar;
    }

    @Override // defpackage.egq
    public final egp a(int i, egn[] egnVarArr, List list, int i2) {
        return new egp(i, egnVarArr, this.a, list, i2);
    }
}
