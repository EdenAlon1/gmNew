package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aouc implements apvj {
    final /* synthetic */ long a;
    final /* synthetic */ aoud b;
    final /* synthetic */ long c;

    public aouc(long j, aoud aoudVar, long j2) {
        this.a = j;
        this.b = aoudVar;
        this.c = j2;
    }

    @Override // defpackage.apvj
    public final apvi a(engw engwVar) {
        engwVar.getClass();
        long size = engwVar.size();
        ensk h = this.b.d.h();
        h.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderPrependPagingKeyQuery$1$1", "getPlaceholdersCount", 129, "BuglePlaceholdersCountQueries.kt");
        Long valueOf = Long.valueOf(this.a);
        Integer valueOf2 = Integer.valueOf(engwVar.size());
        long j = this.a - size;
        enrrVar.K("Placeholder prepend key query: items before target key: %d, list size: %d, offset: %d, total: %d", valueOf, valueOf2, Long.valueOf(j), Long.valueOf(this.c));
        return new apvi(j, this.c - this.a);
    }
}
