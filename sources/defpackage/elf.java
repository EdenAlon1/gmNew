package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class elf extends ffkk implements ffji {
    final /* synthetic */ hrc a;
    final /* synthetic */ hqu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elf(hrc hrcVar, hqu hquVar) {
        super(1);
        this.a = hrcVar;
        this.b = hquVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hqu hquVar = this.b;
        return new eli(this.a, (Map) obj, hquVar);
    }
}
