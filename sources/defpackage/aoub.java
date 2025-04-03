package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoub implements apvj {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ aoud c;

    public aoub(long j, int i, aoud aoudVar) {
        this.a = j;
        this.b = i;
        this.c = aoudVar;
    }

    @Override // defpackage.apvj
    public final apvi a(engw engwVar) {
        engwVar.getClass();
        long min = Math.min(this.a, this.b);
        ensk h = this.c.d.h();
        h.Y(ente.a, "BugleMapi");
        ((enrr) h.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderOffsetCountQuery$1$1", "getPlaceholdersCount", 64, "BuglePlaceholdersCountQueries.kt")).J("Placeholder offset count query: list size: %d, offset: %d, total: %d", Integer.valueOf(engwVar.size()), Long.valueOf(min), Long.valueOf(this.a));
        return new apvi(min, (this.a - min) - engwVar.size());
    }
}
