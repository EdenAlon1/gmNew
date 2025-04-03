package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoua implements apvj {
    final /* synthetic */ alxw a;
    final /* synthetic */ long b;
    final /* synthetic */ aoud c;
    final /* synthetic */ long d;

    public aoua(alxw alxwVar, long j, aoud aoudVar, long j2) {
        this.a = alxwVar;
        this.b = j;
        this.c = aoudVar;
        this.d = j2;
    }

    @Override // defpackage.apvj
    public final apvi a(engw engwVar) {
        engwVar.getClass();
        final aoud aoudVar = this.c;
        int a = apvg.a(engwVar, this.a, new ffji() { // from class: aotz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                alxr alxrVar = (alxr) obj;
                alxrVar.getClass();
                return aoud.this.b.aa(alxrVar.b(), alxrVar.n());
            }
        });
        long max = Math.max(0L, (this.b - a) - 1);
        ensk h = this.c.d.h();
        h.Y(ente.a, "BugleMapi");
        ((enrr) h.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderInitialPagingKeyQuery$1$1", "getPlaceholdersCount", 97, "BuglePlaceholdersCountQueries.kt")).L("Placeholder initial paging key query: items before target key: %d, list size: %d, index of target key in list: %d, offset: %d, total: %d", Long.valueOf(this.b), Integer.valueOf(engwVar.size()), Integer.valueOf(a), Long.valueOf(max), Long.valueOf(this.d));
        return new apvi(max, (this.d - max) - engwVar.size());
    }
}
