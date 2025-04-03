package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qvr {
    public final rge a;
    public final kst b;
    private final Class c;
    private final List d;
    private final String e;

    public qvr(Class cls, Class cls2, Class cls3, List list, rge rgeVar, kst kstVar) {
        this.c = cls;
        this.d = list;
        this.a = rgeVar;
        this.b = kstVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final qwv a(quf qufVar, int i, int i2, qtu qtuVar, List list) {
        int size = this.d.size();
        qwv qwvVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            qtw qtwVar = (qtw) this.d.get(i3);
            try {
                if (qtwVar.b(qufVar.a(), qtuVar)) {
                    qwvVar = qtwVar.a(qufVar.a(), i, i2, qtuVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for ".concat(String.valueOf(String.valueOf(qtwVar))), e);
                }
                list.add(e);
            }
            if (qwvVar != null) {
                break;
            }
        }
        if (qwvVar != null) {
            return qwvVar;
        }
        throw new qwp(this.e, new ArrayList(list));
    }

    public final String toString() {
        rge rgeVar = this.a;
        List list = this.d;
        return "DecodePath{ dataClass=" + String.valueOf(this.c) + ", decoders=" + String.valueOf(list) + ", transcoder=" + rgeVar.toString() + "}";
    }
}
