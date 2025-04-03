package defpackage;

import com.google.mediapipe.framework.MediaPipeException;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class expe extends exoq {
    public static final List e = DesugarCollections.unmodifiableList(Arrays.asList("IMAGE:image_in", "NORM_RECT:norm_rect_in", "OUTPUT_SIZE:output_size_in"));
    private List f;

    static {
        System.loadLibrary("mediapipe_tasks_vision_jni");
    }

    public expe(exod exodVar) {
        super(exodVar);
        eyfw checkIsLite;
        this.f = new ArrayList();
        boolean z = false;
        for (euld euldVar : this.a.a.b().b) {
            if (euldVar.c.contains("mediapipe.tasks.TensorsToSegmentationCalculator")) {
                if (z) {
                    throw new MediaPipeException(exlp.INTERNAL.ordinal(), "The graph has more than one mediapipe.tasks.TensorsToSegmentationCalculator.");
                }
                eula eulaVar = euldVar.g;
                eulaVar = eulaVar == null ? eula.a : eulaVar;
                checkIsLite = eyfy.checkIsLite(exms.b);
                eulaVar.b(checkIsLite);
                Object l = eulaVar.r.l(checkIsLite.d);
                exms exmsVar = (exms) (l == null ? checkIsLite.b : checkIsLite.c(l));
                for (int i = 0; i < DesugarCollections.unmodifiableMap(exmsVar.c).size(); i++) {
                    Long valueOf = Long.valueOf(i);
                    if (!DesugarCollections.unmodifiableMap(exmsVar.c).containsKey(valueOf)) {
                        int ordinal = exlp.INTERNAL.ordinal();
                        Objects.toString(valueOf);
                        throw new MediaPipeException(ordinal, "The lablemap have no expected key: ".concat(valueOf.toString()));
                    }
                    this.f.add(((expm) DesugarCollections.unmodifiableMap(exmsVar.c).get(valueOf)).b);
                }
                z = true;
            }
        }
    }
}
