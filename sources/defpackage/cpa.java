package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cpa extends ffkk implements ffji {
    final /* synthetic */ cpb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpa(cpb cpbVar) {
        super(1);
        this.a = cpbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return obj == this.a ? "(this)" : String.valueOf(obj);
    }
}
