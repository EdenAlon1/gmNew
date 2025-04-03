package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uey {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation/draft/model/BugleMessageAttachmentSourceToAttachmentSourceKt");

    public static final doxr a(eohh eohhVar) {
        eohhVar.getClass();
        int ordinal = eohhVar.ordinal();
        if (ordinal != 3) {
            if (ordinal == 4) {
                return dpgg.a;
            }
            if (ordinal == 5) {
                return dpgi.a;
            }
            if (ordinal == 12) {
                return new doxm(null, 2);
            }
            if (ordinal == 33 || ordinal == 35) {
                return new doxm(null, 3);
            }
            if (ordinal == 25) {
                return drej.a;
            }
            if (ordinal == 26) {
                return dsch.a;
            }
            switch (ordinal) {
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    return dpgq.a;
                case 40:
                    return new doxm(null, 4);
                case 41:
                    return new doxm(null, 5);
                case 42:
                    return new dpgo(dpgl.a, 1, 1, false, null, null, 48);
                case 43:
                    break;
                case 44:
                    return dqzn.a;
                case 45:
                    return dqzn.b;
                case 46:
                    return new dpgo(dpgl.c, 1, 1, false, null, null, 48);
                default:
                    if (eohhVar != eohh.UNKNOWN && eohhVar != eohh.NOT_AVAILABLE) {
                        enrr enrrVar = (enrr) a.i();
                        Objects.toString(eohhVar);
                        ((enrr) enrrVar.g(new IllegalStateException("Unhandled attachment source ".concat(eohhVar.toString()))).h("com/google/android/apps/messaging/conversation/draft/model/BugleMessageAttachmentSourceToAttachmentSourceKt", "toAttachmentSource", 57, "BugleMessageAttachmentSourceToAttachmentSource.kt")).q("Falling back to Unknown");
                    }
                    return doxq.a;
            }
        }
        return new dpgo(dpgl.b, 1, 1, false, null, null, 48);
    }
}
