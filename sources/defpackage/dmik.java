package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmik extends ffkk implements ffji {
    final /* synthetic */ ffjm a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmik(ffjm ffjmVar, List list) {
        super(1);
        this.a = ffjmVar;
        this.b = list;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        return this.a.a(Integer.valueOf(intValue), this.b.get(intValue));
    }
}
