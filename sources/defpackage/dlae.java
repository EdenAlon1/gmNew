package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import org.tensorflow.lite.task.core.TaskJniUtils;
import org.tensorflow.lite.task.text.nlclassifier.NLClassifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlae implements dlaa {
    public static final dlae a = new dlae();

    private dlae() {
    }

    @Override // defpackage.dlaa
    public final dkzw a(dlfn dlfnVar) {
        dlfnVar.getClass();
        if (dlfnVar.f != 1) {
            dlfnVar = null;
        }
        if (dlfnVar == null) {
            return null;
        }
        ffji ffjiVar = new ffji() { // from class: dlad
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dlfy dlfyVar = (dlfy) obj;
                dlfyVar.getClass();
                rsf rsfVar = dlfyVar.a().c;
                if (rsfVar == null) {
                    rsfVar = rsf.a;
                }
                rqq rqqVar = rsfVar.d;
                if (rqqVar == null) {
                    rqqVar = rqq.a;
                }
                if (1 != (rqqVar.b & 1)) {
                    rqqVar = null;
                }
                if (rqqVar != null) {
                    return rqqVar.c;
                }
                return null;
            }
        };
        fivw fivwVar = new fivw();
        ByteBuffer byteBuffer = dlfnVar.a;
        int i = NLClassifier.b;
        if (!byteBuffer.isDirect() && !(byteBuffer instanceof MappedByteBuffer)) {
            throw new IllegalArgumentException("The model buffer should be either a direct ByteBuffer or a MappedByteBuffer.");
        }
        TaskJniUtils.a();
        try {
            return new dkzz(ffjiVar, new dlfr(new NLClassifier(NLClassifier.initJniWithByteBuffer(fivwVar, byteBuffer, 0L)), dlfnVar));
        } catch (RuntimeException e) {
            Log.e(TaskJniUtils.a, "Error getting native address of native library: task_text_jni", e);
            throw new IllegalStateException("Error getting native address of native library: task_text_jni", e);
        }
    }
}
