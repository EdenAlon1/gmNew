package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pzq extends ffkk implements ffix {
    final /* synthetic */ pte a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzq(pte pteVar, UUID uuid) {
        super(0);
        this.a = pteVar;
        this.b = uuid;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        final pte pteVar = this.a;
        WorkDatabase workDatabase = pteVar.e;
        workDatabase.getClass();
        final UUID uuid = this.b;
        workDatabase.p(new Runnable() { // from class: pzp
            @Override // java.lang.Runnable
            public final void run() {
                String uuid2 = uuid.toString();
                uuid2.getClass();
                pzu.b(pte.this, uuid2);
            }
        });
        pzu.d(this.a);
        return ffcu.a;
    }
}
