package defpackage;

import android.database.Cursor;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqjv extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dqjz c;
    final /* synthetic */ dqjz d;
    final /* synthetic */ ffxe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjv(ffxe ffxeVar, dqjz dqjzVar, ffgu ffguVar, dqjz dqjzVar2) {
        super(3, ffguVar);
        this.c = dqjzVar;
        this.d = dqjzVar2;
        this.e = ffxeVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dqjz dqjzVar = this.d;
        dqjv dqjvVar = new dqjv(this.e, this.c, (ffgu) obj3, dqjzVar);
        dqjvVar.b = (Cursor) obj2;
        return dqjvVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003b -> B:6:0x0014). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        final ?? r1;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            r1 = this.b;
            try {
                ffci.b(obj);
                r1 = r1;
            } catch (Exception e) {
                ((enrr) ((enrr) dqjz.a.i()).g(e).h("com/google/android/libraries/compose/core/data/usage/SQLiteUsageService$queryAndMapLazily$2$1$1", "invokeSuspend$$forInline", 140, "SQLiteUsageService.kt")).t("Unable to map '%s' entity usage, skipping", this.c.f);
                r1 = r1;
            }
        } else {
            ffci.b(obj);
            r1 = this.b;
        }
        while (r1 != 0 && r1.moveToNext()) {
            ffxe ffxeVar = this.e;
            dqke dqkeVar = (dqke) this.d.d.e("SQLiteUsageService#metadataFromCursor", new ffix() { // from class: dqjl
                @Override // defpackage.ffix
                public final Object invoke() {
                    Cursor cursor = r1;
                    dqgm dqgmVar = new dqgm(cursor.getLong(0));
                    Instant ofEpochMilli = Instant.ofEpochMilli(cursor.getLong(1));
                    ofEpochMilli.getClass();
                    return new dqke(dqgmVar, ofEpochMilli, !cursor.isNull(2) ? cursor.getString(2) : null);
                }
            });
            this.b = r1;
            this.a = 1;
            if (ffxeVar.a(dqkeVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
