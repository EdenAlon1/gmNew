package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoty implements apvj {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ aoud c;

    public aoty(long j, long j2, aoud aoudVar) {
        this.a = j;
        this.b = j2;
        this.c = aoudVar;
    }

    @Override // defpackage.apvj
    public final apvi a(engw engwVar) {
        engwVar.getClass();
        ensk h = this.c.d.h();
        h.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderAppendPagingKeyQuery$1$1", "getPlaceholdersCount", 160, "BuglePlaceholdersCountQueries.kt");
        Long valueOf = Long.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(engwVar.size());
        long j = this.a;
        long j2 = j - this.b;
        enrrVar.K("Placeholder append key query: items after target key: %d, list size: %d, offset: %d, total: %d", valueOf, valueOf2, Long.valueOf(j2), Long.valueOf(j));
        return new apvi(j2, this.b - engwVar.size());
    }
}
