package defpackage;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akbs implements fbba {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [ajys] */
    /* JADX WARN: Type inference failed for: r8v4, types: [ajys] */
    public static ajys a(Map map, long j, akag akagVar, auch auchVar, ffbr ffbrVar) {
        akag akagVar2;
        ffbrVar.getClass();
        if (((ersq) ((aubx) auchVar).a.b()).a("bugle.enable_restore_anytime_v1")) {
            Object b = ffbrVar.b();
            ensk h = akbr.a.h();
            h.Y(ente.a, "BugleBackup");
            enrr enrrVar = (enrr) h;
            enrrVar.W(10, TimeUnit.SECONDS);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/restore/impl/StableRestoreWorkflowStepsModule", "providesStableRestoreWorkflowSteps", 47, "StableRestoreWorkflowStepsModule.kt")).q("Returning restoreAnytimeCompatibleRestoreWorkflowSteps");
            akagVar2 = (ajys) b;
        } else {
            ?? r5 = (ajys) map.get(Integer.valueOf((int) j));
            if (r5 == null) {
                ensk j2 = akbr.a.j();
                j2.Y(ente.a, "BugleBackup");
                enrr enrrVar2 = (enrr) j2;
                enrrVar2.W(10, TimeUnit.SECONDS);
                enrrVar2.Y(ajwd.a, Long.valueOf(j));
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/restore/impl/StableRestoreWorkflowStepsModule", "providesStableRestoreWorkflowSteps", 56, "StableRestoreWorkflowStepsModule.kt")).s("RestoreWorkflowSteps not found for stable version [%d]. Using BasicRestoreWorkflowSteps", j);
                akagVar2 = akagVar;
            } else {
                akagVar2 = r5;
            }
        }
        akagVar2.getClass();
        return akagVar2;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
