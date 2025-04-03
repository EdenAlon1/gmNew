package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mok extends Handler {
    final /* synthetic */ mom a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mok(mom momVar, Looper looper) {
        super(looper);
        this.a = momVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.a.h(obj, obj2);
            return;
        }
        mom momVar = this.a;
        if (obj == momVar.g) {
            if (momVar.e == 2 || momVar.l()) {
                momVar.g = null;
                if (obj2 instanceof Exception) {
                    momVar.h.a((Exception) obj2, false);
                    return;
                }
                try {
                    momVar.b.g((byte[]) obj2);
                    mot motVar = momVar.h;
                    motVar.b = null;
                    Set set = motVar.a;
                    engw n = engw.n(set);
                    set.clear();
                    int size = n.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        mom momVar2 = (mom) n.get(i2);
                        if (momVar2.m()) {
                            momVar2.f(true);
                        }
                    }
                } catch (Exception e) {
                    momVar.h.a(e, true);
                }
            }
        }
    }
}
